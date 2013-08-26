package kr.godsoft.egovframe.generatorwebapp.comtneventmanage.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtneventmanage.service.ComtneventmanageService;
import kr.godsoft.egovframe.generatorwebapp.comtneventmanage.service.ComtneventmanageDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtneventmanage.service.ComtneventmanageVO;

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
 * @Class Name : ComtneventmanageController.java
 * @Description : Comtneventmanage Controller class
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
public class ComtneventmanageController {

    @Resource(name = "comtneventmanageService")
    private ComtneventmanageService comtneventmanageService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNEVENTMANAGE 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtneventmanageVO
	 * @return "/comtneventmanage/ComtneventmanageList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtneventmanage/ComtneventmanageList.do")
    public String selectComtneventmanageList(@ModelAttribute("searchVO") ComtneventmanageVO searchVO, 
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
		
        List<EgovMap> comtneventmanageList = comtneventmanageService.selectComtneventmanageList(searchVO);
        model.addAttribute("resultList", comtneventmanageList);
        
        int totCnt = comtneventmanageService.selectComtneventmanageListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtneventmanage/ComtneventmanageList";
    } 
    
    @RequestMapping("/comtneventmanage/addComtneventmanageView.do")
    public String addComtneventmanageView(
            @ModelAttribute("searchVO") ComtneventmanageDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtneventmanageVO", new ComtneventmanageVO());
        return "/comtneventmanage/ComtneventmanageRegister";
    }
    
    @RequestMapping("/comtneventmanage/addComtneventmanage.do")
    public String addComtneventmanage(
            ComtneventmanageVO comtneventmanageVO,
            @ModelAttribute("searchVO") ComtneventmanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtneventmanageService.insertComtneventmanage(comtneventmanageVO);
        status.setComplete();
        return "forward:/comtneventmanage/ComtneventmanageList.do";
    }
    
    @RequestMapping("/comtneventmanage/updateComtneventmanageView.do")
    public String updateComtneventmanageView(
            @RequestParam("eventId") String eventId ,
            @ModelAttribute("searchVO") ComtneventmanageDefaultVO searchVO, Model model)
            throws Exception {
        ComtneventmanageVO comtneventmanageVO = new ComtneventmanageVO();
        comtneventmanageVO.setEventId(eventId);
;        
        // 변수명은 CoC 에 따라 comtneventmanageVO
        model.addAttribute(selectComtneventmanage(comtneventmanageVO, searchVO));
        return "/comtneventmanage/ComtneventmanageRegister";
    }

    @RequestMapping("/comtneventmanage/selectComtneventmanage.do")
    public @ModelAttribute("comtneventmanageVO")
    ComtneventmanageVO selectComtneventmanage(
            ComtneventmanageVO comtneventmanageVO,
            @ModelAttribute("searchVO") ComtneventmanageDefaultVO searchVO) throws Exception {
        return comtneventmanageService.selectComtneventmanage(comtneventmanageVO);
    }

    @RequestMapping("/comtneventmanage/updateComtneventmanage.do")
    public String updateComtneventmanage(
            ComtneventmanageVO comtneventmanageVO,
            @ModelAttribute("searchVO") ComtneventmanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtneventmanageService.updateComtneventmanage(comtneventmanageVO);
        status.setComplete();
        return "forward:/comtneventmanage/ComtneventmanageList.do";
    }
    
    @RequestMapping("/comtneventmanage/deleteComtneventmanage.do")
    public String deleteComtneventmanage(
            ComtneventmanageVO comtneventmanageVO,
            @ModelAttribute("searchVO") ComtneventmanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtneventmanageService.deleteComtneventmanage(comtneventmanageVO);
        status.setComplete();
        return "forward:/comtneventmanage/ComtneventmanageList.do";
    }

}
