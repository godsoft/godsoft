package kr.godsoft.egovframe.generatorwebapp.comtnfxtrsmanage.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnfxtrsmanage.service.ComtnfxtrsmanageService;
import kr.godsoft.egovframe.generatorwebapp.comtnfxtrsmanage.service.ComtnfxtrsmanageDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnfxtrsmanage.service.ComtnfxtrsmanageVO;

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
 * @Class Name : ComtnfxtrsmanageController.java
 * @Description : Comtnfxtrsmanage Controller class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Controller
public class ComtnfxtrsmanageController {

    @Resource(name = "comtnfxtrsmanageService")
    private ComtnfxtrsmanageService comtnfxtrsmanageService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNFXTRSMANAGE 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnfxtrsmanageVO
	 * @return "/comtnfxtrsmanage/ComtnfxtrsmanageList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnfxtrsmanage/ComtnfxtrsmanageList.do")
    public String selectComtnfxtrsmanageList(@ModelAttribute("searchVO") ComtnfxtrsmanageVO searchVO, 
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
		
        List<EgovMap> comtnfxtrsmanageList = comtnfxtrsmanageService.selectComtnfxtrsmanageList(searchVO);
        model.addAttribute("resultList", comtnfxtrsmanageList);
        
        int totCnt = comtnfxtrsmanageService.selectComtnfxtrsmanageListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnfxtrsmanage/ComtnfxtrsmanageList";
    } 
    
    @RequestMapping("/comtnfxtrsmanage/addComtnfxtrsmanageView.do")
    public String addComtnfxtrsmanageView(
            @ModelAttribute("searchVO") ComtnfxtrsmanageDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnfxtrsmanageVO", new ComtnfxtrsmanageVO());
        return "/comtnfxtrsmanage/ComtnfxtrsmanageRegister";
    }
    
    @RequestMapping("/comtnfxtrsmanage/addComtnfxtrsmanage.do")
    public String addComtnfxtrsmanage(
            ComtnfxtrsmanageVO comtnfxtrsmanageVO,
            @ModelAttribute("searchVO") ComtnfxtrsmanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnfxtrsmanageService.insertComtnfxtrsmanage(comtnfxtrsmanageVO);
        status.setComplete();
        return "forward:/comtnfxtrsmanage/ComtnfxtrsmanageList.do";
    }
    
    @RequestMapping("/comtnfxtrsmanage/updateComtnfxtrsmanageView.do")
    public String updateComtnfxtrsmanageView(
            @RequestParam("fxtrsCode") String fxtrsCode ,
            @ModelAttribute("searchVO") ComtnfxtrsmanageDefaultVO searchVO, Model model)
            throws Exception {
        ComtnfxtrsmanageVO comtnfxtrsmanageVO = new ComtnfxtrsmanageVO();
        comtnfxtrsmanageVO.setFxtrsCode(fxtrsCode);
;        
        // 변수명은 CoC 에 따라 comtnfxtrsmanageVO
        model.addAttribute(selectComtnfxtrsmanage(comtnfxtrsmanageVO, searchVO));
        return "/comtnfxtrsmanage/ComtnfxtrsmanageRegister";
    }

    @RequestMapping("/comtnfxtrsmanage/selectComtnfxtrsmanage.do")
    public @ModelAttribute("comtnfxtrsmanageVO")
    ComtnfxtrsmanageVO selectComtnfxtrsmanage(
            ComtnfxtrsmanageVO comtnfxtrsmanageVO,
            @ModelAttribute("searchVO") ComtnfxtrsmanageDefaultVO searchVO) throws Exception {
        return comtnfxtrsmanageService.selectComtnfxtrsmanage(comtnfxtrsmanageVO);
    }

    @RequestMapping("/comtnfxtrsmanage/updateComtnfxtrsmanage.do")
    public String updateComtnfxtrsmanage(
            ComtnfxtrsmanageVO comtnfxtrsmanageVO,
            @ModelAttribute("searchVO") ComtnfxtrsmanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnfxtrsmanageService.updateComtnfxtrsmanage(comtnfxtrsmanageVO);
        status.setComplete();
        return "forward:/comtnfxtrsmanage/ComtnfxtrsmanageList.do";
    }
    
    @RequestMapping("/comtnfxtrsmanage/deleteComtnfxtrsmanage.do")
    public String deleteComtnfxtrsmanage(
            ComtnfxtrsmanageVO comtnfxtrsmanageVO,
            @ModelAttribute("searchVO") ComtnfxtrsmanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnfxtrsmanageService.deleteComtnfxtrsmanage(comtnfxtrsmanageVO);
        status.setComplete();
        return "forward:/comtnfxtrsmanage/ComtnfxtrsmanageList.do";
    }

}
