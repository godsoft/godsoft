package kr.godsoft.egovframe.generatorwebapp.comtndamcalres.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtndamcalres.service.ComtndamcalresService;
import kr.godsoft.egovframe.generatorwebapp.comtndamcalres.service.ComtndamcalresDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtndamcalres.service.ComtndamcalresVO;

/**
 * @Class Name : ComtndamcalresController.java
 * @Description : Comtndamcalres Controller class
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
@SessionAttributes(types=ComtndamcalresVO.class)
public class ComtndamcalresController {

    @Resource(name = "comtndamcalresService")
    private ComtndamcalresService comtndamcalresService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtndamcalres 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtndamcalresDefaultVO
	 * @return "/comtndamcalres/ComtndamcalresList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtndamcalres/ComtndamcalresList.do")
    public String selectComtndamcalresList(@ModelAttribute("searchVO") ComtndamcalresDefaultVO searchVO, 
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
		
        List comtndamcalresList = comtndamcalresService.selectComtndamcalresList(searchVO);
        model.addAttribute("resultList", comtndamcalresList);
        
        int totCnt = comtndamcalresService.selectComtndamcalresListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtndamcalres/ComtndamcalresList";
    } 
    
    @RequestMapping("/comtndamcalres/addComtndamcalresView.do")
    public String addComtndamcalresView(
            @ModelAttribute("searchVO") ComtndamcalresDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtndamcalresVO", new ComtndamcalresVO());
        return "/comtndamcalres/ComtndamcalresRegister";
    }
    
    @RequestMapping("/comtndamcalres/addComtndamcalres.do")
    public String addComtndamcalres(
            ComtndamcalresVO comtndamcalresVO,
            @ModelAttribute("searchVO") ComtndamcalresDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtndamcalresService.insertComtndamcalres(comtndamcalresVO);
        status.setComplete();
        return "forward:/comtndamcalres/ComtndamcalresList.do";
    }
    
    @RequestMapping("/comtndamcalres/updateComtndamcalresView.do")
    public String updateComtndamcalresView(
            @RequestParam("knwldgId") String knwldgId ,
            @ModelAttribute("searchVO") ComtndamcalresDefaultVO searchVO, Model model)
            throws Exception {
        ComtndamcalresVO comtndamcalresVO = new ComtndamcalresVO();
        comtndamcalresVO.setKnwldgId(knwldgId);
;        
        // 변수명은 CoC 에 따라 comtndamcalresVO
        model.addAttribute(selectComtndamcalres(comtndamcalresVO, searchVO));
        return "/comtndamcalres/ComtndamcalresRegister";
    }

    @RequestMapping("/comtndamcalres/selectComtndamcalres.do")
    public @ModelAttribute("comtndamcalresVO")
    ComtndamcalresVO selectComtndamcalres(
            ComtndamcalresVO comtndamcalresVO,
            @ModelAttribute("searchVO") ComtndamcalresDefaultVO searchVO) throws Exception {
        return comtndamcalresService.selectComtndamcalres(comtndamcalresVO);
    }

    @RequestMapping("/comtndamcalres/updateComtndamcalres.do")
    public String updateComtndamcalres(
            ComtndamcalresVO comtndamcalresVO,
            @ModelAttribute("searchVO") ComtndamcalresDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtndamcalresService.updateComtndamcalres(comtndamcalresVO);
        status.setComplete();
        return "forward:/comtndamcalres/ComtndamcalresList.do";
    }
    
    @RequestMapping("/comtndamcalres/deleteComtndamcalres.do")
    public String deleteComtndamcalres(
            ComtndamcalresVO comtndamcalresVO,
            @ModelAttribute("searchVO") ComtndamcalresDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtndamcalresService.deleteComtndamcalres(comtndamcalresVO);
        status.setComplete();
        return "forward:/comtndamcalres/ComtndamcalresList.do";
    }

}
