package kr.godsoft.egovframe.generatorwebapp.comtnmainimage.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import egovframework.rte.fdl.property.EgovPropertyService;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;

import kr.godsoft.egovframe.generatorwebapp.comtnmainimage.service.ComtnmainimageService;
import kr.godsoft.egovframe.generatorwebapp.comtnmainimage.service.ComtnmainimageDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnmainimage.service.ComtnmainimageVO;

/**
 * @Class Name : ComtnmainimageController.java
 * @Description : Comtnmainimage Controller class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Controller
@SessionAttributes(types=ComtnmainimageVO.class)
public class ComtnmainimageController {

    @Resource(name = "comtnmainimageService")
    private ComtnmainimageService comtnmainimageService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnmainimage 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnmainimageDefaultVO
	 * @return "/comtnmainimage/ComtnmainimageList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnmainimage/ComtnmainimageList.do")
    public String selectComtnmainimageList(@ModelAttribute("searchVO") ComtnmainimageDefaultVO searchVO, 
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
		
        List comtnmainimageList = comtnmainimageService.selectComtnmainimageList(searchVO);
        model.addAttribute("resultList", comtnmainimageList);
        
        int totCnt = comtnmainimageService.selectComtnmainimageListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnmainimage/ComtnmainimageList";
    } 
    
    @RequestMapping("/comtnmainimage/addComtnmainimageView.do")
    public String addComtnmainimageView(
            @ModelAttribute("searchVO") ComtnmainimageDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnmainimageVO", new ComtnmainimageVO());
        return "/comtnmainimage/ComtnmainimageRegister";
    }
    
    @RequestMapping("/comtnmainimage/addComtnmainimage.do")
    public String addComtnmainimage(
            ComtnmainimageVO comtnmainimageVO,
            @ModelAttribute("searchVO") ComtnmainimageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnmainimageService.insertComtnmainimage(comtnmainimageVO);
        status.setComplete();
        return "forward:/comtnmainimage/ComtnmainimageList.do";
    }
    
    @RequestMapping("/comtnmainimage/updateComtnmainimageView.do")
    public String updateComtnmainimageView(
            @RequestParam("imageId") String imageId ,
            @ModelAttribute("searchVO") ComtnmainimageDefaultVO searchVO, Model model)
            throws Exception {
        ComtnmainimageVO comtnmainimageVO = new ComtnmainimageVO();
        comtnmainimageVO.setImageId(imageId);
;        
        // 변수명은 CoC 에 따라 comtnmainimageVO
        model.addAttribute(selectComtnmainimage(comtnmainimageVO, searchVO));
        return "/comtnmainimage/ComtnmainimageRegister";
    }

    @RequestMapping("/comtnmainimage/selectComtnmainimage.do")
    public @ModelAttribute("comtnmainimageVO")
    ComtnmainimageVO selectComtnmainimage(
            ComtnmainimageVO comtnmainimageVO,
            @ModelAttribute("searchVO") ComtnmainimageDefaultVO searchVO) throws Exception {
        return comtnmainimageService.selectComtnmainimage(comtnmainimageVO);
    }

    @RequestMapping("/comtnmainimage/updateComtnmainimage.do")
    public String updateComtnmainimage(
            ComtnmainimageVO comtnmainimageVO,
            @ModelAttribute("searchVO") ComtnmainimageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnmainimageService.updateComtnmainimage(comtnmainimageVO);
        status.setComplete();
        return "forward:/comtnmainimage/ComtnmainimageList.do";
    }
    
    @RequestMapping("/comtnmainimage/deleteComtnmainimage.do")
    public String deleteComtnmainimage(
            ComtnmainimageVO comtnmainimageVO,
            @ModelAttribute("searchVO") ComtnmainimageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnmainimageService.deleteComtnmainimage(comtnmainimageVO);
        status.setComplete();
        return "forward:/comtnmainimage/ComtnmainimageList.do";
    }

}
