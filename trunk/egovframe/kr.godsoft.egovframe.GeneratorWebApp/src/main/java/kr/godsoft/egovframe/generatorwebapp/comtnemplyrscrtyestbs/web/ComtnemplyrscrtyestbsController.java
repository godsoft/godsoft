package kr.godsoft.egovframe.generatorwebapp.comtnemplyrscrtyestbs.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnemplyrscrtyestbs.service.ComtnemplyrscrtyestbsService;
import kr.godsoft.egovframe.generatorwebapp.comtnemplyrscrtyestbs.service.ComtnemplyrscrtyestbsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnemplyrscrtyestbs.service.ComtnemplyrscrtyestbsVO;

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
 * @Class Name : ComtnemplyrscrtyestbsController.java
 * @Description : Comtnemplyrscrtyestbs Controller class
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
public class ComtnemplyrscrtyestbsController {

    @Resource(name = "comtnemplyrscrtyestbsService")
    private ComtnemplyrscrtyestbsService comtnemplyrscrtyestbsService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNEMPLYRSCRTYESTBS 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnemplyrscrtyestbsVO
	 * @return "/comtnemplyrscrtyestbs/ComtnemplyrscrtyestbsList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnemplyrscrtyestbs/ComtnemplyrscrtyestbsList.do")
    public String selectComtnemplyrscrtyestbsList(@ModelAttribute("searchVO") ComtnemplyrscrtyestbsVO searchVO, 
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
		
        List<EgovMap> comtnemplyrscrtyestbsList = comtnemplyrscrtyestbsService.selectComtnemplyrscrtyestbsList(searchVO);
        model.addAttribute("resultList", comtnemplyrscrtyestbsList);
        
        int totCnt = comtnemplyrscrtyestbsService.selectComtnemplyrscrtyestbsListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnemplyrscrtyestbs/ComtnemplyrscrtyestbsList";
    } 
    
    @RequestMapping("/comtnemplyrscrtyestbs/addComtnemplyrscrtyestbsView.do")
    public String addComtnemplyrscrtyestbsView(
            @ModelAttribute("searchVO") ComtnemplyrscrtyestbsDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnemplyrscrtyestbsVO", new ComtnemplyrscrtyestbsVO());
        return "/comtnemplyrscrtyestbs/ComtnemplyrscrtyestbsRegister";
    }
    
    @RequestMapping("/comtnemplyrscrtyestbs/addComtnemplyrscrtyestbs.do")
    public String addComtnemplyrscrtyestbs(
            ComtnemplyrscrtyestbsVO comtnemplyrscrtyestbsVO,
            @ModelAttribute("searchVO") ComtnemplyrscrtyestbsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnemplyrscrtyestbsService.insertComtnemplyrscrtyestbs(comtnemplyrscrtyestbsVO);
        status.setComplete();
        return "forward:/comtnemplyrscrtyestbs/ComtnemplyrscrtyestbsList.do";
    }
    
    @RequestMapping("/comtnemplyrscrtyestbs/updateComtnemplyrscrtyestbsView.do")
    public String updateComtnemplyrscrtyestbsView(
            @ModelAttribute("searchVO") ComtnemplyrscrtyestbsDefaultVO searchVO, Model model)
            throws Exception {
        ComtnemplyrscrtyestbsVO comtnemplyrscrtyestbsVO = new ComtnemplyrscrtyestbsVO();
;        
        // 변수명은 CoC 에 따라 comtnemplyrscrtyestbsVO
        model.addAttribute(selectComtnemplyrscrtyestbs(comtnemplyrscrtyestbsVO, searchVO));
        return "/comtnemplyrscrtyestbs/ComtnemplyrscrtyestbsRegister";
    }

    @RequestMapping("/comtnemplyrscrtyestbs/selectComtnemplyrscrtyestbs.do")
    public @ModelAttribute("comtnemplyrscrtyestbsVO")
    ComtnemplyrscrtyestbsVO selectComtnemplyrscrtyestbs(
            ComtnemplyrscrtyestbsVO comtnemplyrscrtyestbsVO,
            @ModelAttribute("searchVO") ComtnemplyrscrtyestbsDefaultVO searchVO) throws Exception {
        return comtnemplyrscrtyestbsService.selectComtnemplyrscrtyestbs(comtnemplyrscrtyestbsVO);
    }

    @RequestMapping("/comtnemplyrscrtyestbs/updateComtnemplyrscrtyestbs.do")
    public String updateComtnemplyrscrtyestbs(
            ComtnemplyrscrtyestbsVO comtnemplyrscrtyestbsVO,
            @ModelAttribute("searchVO") ComtnemplyrscrtyestbsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnemplyrscrtyestbsService.updateComtnemplyrscrtyestbs(comtnemplyrscrtyestbsVO);
        status.setComplete();
        return "forward:/comtnemplyrscrtyestbs/ComtnemplyrscrtyestbsList.do";
    }
    
    @RequestMapping("/comtnemplyrscrtyestbs/deleteComtnemplyrscrtyestbs.do")
    public String deleteComtnemplyrscrtyestbs(
            ComtnemplyrscrtyestbsVO comtnemplyrscrtyestbsVO,
            @ModelAttribute("searchVO") ComtnemplyrscrtyestbsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnemplyrscrtyestbsService.deleteComtnemplyrscrtyestbs(comtnemplyrscrtyestbsVO);
        status.setComplete();
        return "forward:/comtnemplyrscrtyestbs/ComtnemplyrscrtyestbsList.do";
    }

}
