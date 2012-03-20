package kr.godsoft.egovframe.generatorwebapp.comtnindvdlpgeestbs.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnindvdlpgeestbs.service.ComtnindvdlpgeestbsService;
import kr.godsoft.egovframe.generatorwebapp.comtnindvdlpgeestbs.service.ComtnindvdlpgeestbsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnindvdlpgeestbs.service.ComtnindvdlpgeestbsVO;

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
 * @Class Name : ComtnindvdlpgeestbsController.java
 * @Description : Comtnindvdlpgeestbs Controller class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Controller
public class ComtnindvdlpgeestbsController {

    @Resource(name = "comtnindvdlpgeestbsService")
    private ComtnindvdlpgeestbsService comtnindvdlpgeestbsService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnindvdlpgeestbs 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnindvdlpgeestbsVO
	 * @return "/comtnindvdlpgeestbs/ComtnindvdlpgeestbsList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnindvdlpgeestbs/ComtnindvdlpgeestbsList.do")
    public String selectComtnindvdlpgeestbsList(@ModelAttribute("searchVO") ComtnindvdlpgeestbsVO searchVO, 
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
		
        List<EgovMap> comtnindvdlpgeestbsList = comtnindvdlpgeestbsService.selectComtnindvdlpgeestbsList(searchVO);
        model.addAttribute("resultList", comtnindvdlpgeestbsList);
        
        int totCnt = comtnindvdlpgeestbsService.selectComtnindvdlpgeestbsListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnindvdlpgeestbs/ComtnindvdlpgeestbsList";
    } 
    
    @RequestMapping("/comtnindvdlpgeestbs/addComtnindvdlpgeestbsView.do")
    public String addComtnindvdlpgeestbsView(
            @ModelAttribute("searchVO") ComtnindvdlpgeestbsDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnindvdlpgeestbsVO", new ComtnindvdlpgeestbsVO());
        return "/comtnindvdlpgeestbs/ComtnindvdlpgeestbsRegister";
    }
    
    @RequestMapping("/comtnindvdlpgeestbs/addComtnindvdlpgeestbs.do")
    public String addComtnindvdlpgeestbs(
            ComtnindvdlpgeestbsVO comtnindvdlpgeestbsVO,
            @ModelAttribute("searchVO") ComtnindvdlpgeestbsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnindvdlpgeestbsService.insertComtnindvdlpgeestbs(comtnindvdlpgeestbsVO);
        status.setComplete();
        return "forward:/comtnindvdlpgeestbs/ComtnindvdlpgeestbsList.do";
    }
    
    @RequestMapping("/comtnindvdlpgeestbs/updateComtnindvdlpgeestbsView.do")
    public String updateComtnindvdlpgeestbsView(
            @RequestParam("emplyrId") String emplyrId ,
            @ModelAttribute("searchVO") ComtnindvdlpgeestbsDefaultVO searchVO, Model model)
            throws Exception {
        ComtnindvdlpgeestbsVO comtnindvdlpgeestbsVO = new ComtnindvdlpgeestbsVO();
        comtnindvdlpgeestbsVO.setEmplyrId(emplyrId);
;        
        // 변수명은 CoC 에 따라 comtnindvdlpgeestbsVO
        model.addAttribute(selectComtnindvdlpgeestbs(comtnindvdlpgeestbsVO, searchVO));
        return "/comtnindvdlpgeestbs/ComtnindvdlpgeestbsRegister";
    }

    @RequestMapping("/comtnindvdlpgeestbs/selectComtnindvdlpgeestbs.do")
    public @ModelAttribute("comtnindvdlpgeestbsVO")
    ComtnindvdlpgeestbsVO selectComtnindvdlpgeestbs(
            ComtnindvdlpgeestbsVO comtnindvdlpgeestbsVO,
            @ModelAttribute("searchVO") ComtnindvdlpgeestbsDefaultVO searchVO) throws Exception {
        return comtnindvdlpgeestbsService.selectComtnindvdlpgeestbs(comtnindvdlpgeestbsVO);
    }

    @RequestMapping("/comtnindvdlpgeestbs/updateComtnindvdlpgeestbs.do")
    public String updateComtnindvdlpgeestbs(
            ComtnindvdlpgeestbsVO comtnindvdlpgeestbsVO,
            @ModelAttribute("searchVO") ComtnindvdlpgeestbsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnindvdlpgeestbsService.updateComtnindvdlpgeestbs(comtnindvdlpgeestbsVO);
        status.setComplete();
        return "forward:/comtnindvdlpgeestbs/ComtnindvdlpgeestbsList.do";
    }
    
    @RequestMapping("/comtnindvdlpgeestbs/deleteComtnindvdlpgeestbs.do")
    public String deleteComtnindvdlpgeestbs(
            ComtnindvdlpgeestbsVO comtnindvdlpgeestbsVO,
            @ModelAttribute("searchVO") ComtnindvdlpgeestbsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnindvdlpgeestbsService.deleteComtnindvdlpgeestbs(comtnindvdlpgeestbsVO);
        status.setComplete();
        return "forward:/comtnindvdlpgeestbs/ComtnindvdlpgeestbsList.do";
    }

}
