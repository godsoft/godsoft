package kr.godsoft.egovframe.generatorwebapp.comtnloginscrinimage.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnloginscrinimage.service.ComtnloginscrinimageService;
import kr.godsoft.egovframe.generatorwebapp.comtnloginscrinimage.service.ComtnloginscrinimageDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnloginscrinimage.service.ComtnloginscrinimageVO;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import egovframework.rte.fdl.property.EgovPropertyService;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;

/**
 * @Class Name : ComtnloginscrinimageController.java
 * @Description : Comtnloginscrinimage Controller class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Controller
@SessionAttributes(types=ComtnloginscrinimageVO.class)
public class ComtnloginscrinimageController {

    @Resource(name = "comtnloginscrinimageService")
    private ComtnloginscrinimageService comtnloginscrinimageService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnloginscrinimage 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnloginscrinimageVO
	 * @return "/comtnloginscrinimage/ComtnloginscrinimageList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnloginscrinimage/ComtnloginscrinimageList.do")
    public String selectComtnloginscrinimageList(@ModelAttribute("searchVO") ComtnloginscrinimageVO searchVO, 
    		ModelMap model)
            throws Exception {
    	
    	/** EgovPropertyService.sample */
    	searchVO.setPageUnit(propertiesService.getInt("pageUnit"));
    	searchVO.setPageSize(propertiesService.getInt("pageSize"));
    	
    	/** pageing */
    	PaginationInfo paginationInfo = new PaginationInfo();
		paginationInfo.setCurrentPageNo(searchVO.getPageIndex());
		paginationInfo.setRecordCountPerPage(searchVO.getPageUnit());
		paginationInfo.setPageSize(searchVO.getPageSize());
		
		searchVO.setFirstIndex(paginationInfo.getFirstRecordIndex());
		searchVO.setLastIndex(paginationInfo.getLastRecordIndex());
		searchVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());
		
        List<EgovMap> comtnloginscrinimageList = comtnloginscrinimageService.selectComtnloginscrinimageList(searchVO);
        model.addAttribute("resultList", comtnloginscrinimageList);
        
        int totCnt = comtnloginscrinimageService.selectComtnloginscrinimageListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnloginscrinimage/ComtnloginscrinimageList";
    } 
    
    @RequestMapping("/comtnloginscrinimage/addComtnloginscrinimageView.do")
    public String addComtnloginscrinimageView(
            @ModelAttribute("searchVO") ComtnloginscrinimageDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnloginscrinimageVO", new ComtnloginscrinimageVO());
        return "/comtnloginscrinimage/ComtnloginscrinimageRegister";
    }
    
    @RequestMapping("/comtnloginscrinimage/addComtnloginscrinimage.do")
    public String addComtnloginscrinimage(
            ComtnloginscrinimageVO comtnloginscrinimageVO,
            @ModelAttribute("searchVO") ComtnloginscrinimageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnloginscrinimageService.insertComtnloginscrinimage(comtnloginscrinimageVO);
        status.setComplete();
        return "forward:/comtnloginscrinimage/ComtnloginscrinimageList.do";
    }
    
    @RequestMapping("/comtnloginscrinimage/updateComtnloginscrinimageView.do")
    public String updateComtnloginscrinimageView(
            @RequestParam("imageId") String imageId ,
            @ModelAttribute("searchVO") ComtnloginscrinimageDefaultVO searchVO, Model model)
            throws Exception {
        ComtnloginscrinimageVO comtnloginscrinimageVO = new ComtnloginscrinimageVO();
        comtnloginscrinimageVO.setImageId(imageId);
;        
        // 변수명은 CoC 에 따라 comtnloginscrinimageVO
        model.addAttribute(selectComtnloginscrinimage(comtnloginscrinimageVO, searchVO));
        return "/comtnloginscrinimage/ComtnloginscrinimageRegister";
    }

    @RequestMapping("/comtnloginscrinimage/selectComtnloginscrinimage.do")
    public @ModelAttribute("comtnloginscrinimageVO")
    ComtnloginscrinimageVO selectComtnloginscrinimage(
            ComtnloginscrinimageVO comtnloginscrinimageVO,
            @ModelAttribute("searchVO") ComtnloginscrinimageDefaultVO searchVO) throws Exception {
        return comtnloginscrinimageService.selectComtnloginscrinimage(comtnloginscrinimageVO);
    }

    @RequestMapping("/comtnloginscrinimage/updateComtnloginscrinimage.do")
    public String updateComtnloginscrinimage(
            ComtnloginscrinimageVO comtnloginscrinimageVO,
            @ModelAttribute("searchVO") ComtnloginscrinimageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnloginscrinimageService.updateComtnloginscrinimage(comtnloginscrinimageVO);
        status.setComplete();
        return "forward:/comtnloginscrinimage/ComtnloginscrinimageList.do";
    }
    
    @RequestMapping("/comtnloginscrinimage/deleteComtnloginscrinimage.do")
    public String deleteComtnloginscrinimage(
            ComtnloginscrinimageVO comtnloginscrinimageVO,
            @ModelAttribute("searchVO") ComtnloginscrinimageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnloginscrinimageService.deleteComtnloginscrinimage(comtnloginscrinimageVO);
        status.setComplete();
        return "forward:/comtnloginscrinimage/ComtnloginscrinimageList.do";
    }

}
