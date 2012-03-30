package kr.godsoft.egovframe.generatorwebapp.comtnentrprsmber.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnentrprsmber.service.ComtnentrprsmberService;
import kr.godsoft.egovframe.generatorwebapp.comtnentrprsmber.service.ComtnentrprsmberDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnentrprsmber.service.ComtnentrprsmberVO;

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
 * @Class Name : ComtnentrprsmberController.java
 * @Description : Comtnentrprsmber Controller class
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
public class ComtnentrprsmberController {

    @Resource(name = "comtnentrprsmberService")
    private ComtnentrprsmberService comtnentrprsmberService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNENTRPRSMBER 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnentrprsmberVO
	 * @return "/comtnentrprsmber/ComtnentrprsmberList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnentrprsmber/ComtnentrprsmberList.do")
    public String selectComtnentrprsmberList(@ModelAttribute("searchVO") ComtnentrprsmberVO searchVO, 
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
		
        List<EgovMap> comtnentrprsmberList = comtnentrprsmberService.selectComtnentrprsmberList(searchVO);
        model.addAttribute("resultList", comtnentrprsmberList);
        
        int totCnt = comtnentrprsmberService.selectComtnentrprsmberListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnentrprsmber/ComtnentrprsmberList";
    } 
    
    @RequestMapping("/comtnentrprsmber/addComtnentrprsmberView.do")
    public String addComtnentrprsmberView(
            @ModelAttribute("searchVO") ComtnentrprsmberDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnentrprsmberVO", new ComtnentrprsmberVO());
        return "/comtnentrprsmber/ComtnentrprsmberRegister";
    }
    
    @RequestMapping("/comtnentrprsmber/addComtnentrprsmber.do")
    public String addComtnentrprsmber(
            ComtnentrprsmberVO comtnentrprsmberVO,
            @ModelAttribute("searchVO") ComtnentrprsmberDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnentrprsmberService.insertComtnentrprsmber(comtnentrprsmberVO);
        status.setComplete();
        return "forward:/comtnentrprsmber/ComtnentrprsmberList.do";
    }
    
    @RequestMapping("/comtnentrprsmber/updateComtnentrprsmberView.do")
    public String updateComtnentrprsmberView(
            @RequestParam("entrprsMberId") String entrprsMberId ,
            @ModelAttribute("searchVO") ComtnentrprsmberDefaultVO searchVO, Model model)
            throws Exception {
        ComtnentrprsmberVO comtnentrprsmberVO = new ComtnentrprsmberVO();
        comtnentrprsmberVO.setEntrprsMberId(entrprsMberId);
;        
        // 변수명은 CoC 에 따라 comtnentrprsmberVO
        model.addAttribute(selectComtnentrprsmber(comtnentrprsmberVO, searchVO));
        return "/comtnentrprsmber/ComtnentrprsmberRegister";
    }

    @RequestMapping("/comtnentrprsmber/selectComtnentrprsmber.do")
    public @ModelAttribute("comtnentrprsmberVO")
    ComtnentrprsmberVO selectComtnentrprsmber(
            ComtnentrprsmberVO comtnentrprsmberVO,
            @ModelAttribute("searchVO") ComtnentrprsmberDefaultVO searchVO) throws Exception {
        return comtnentrprsmberService.selectComtnentrprsmber(comtnentrprsmberVO);
    }

    @RequestMapping("/comtnentrprsmber/updateComtnentrprsmber.do")
    public String updateComtnentrprsmber(
            ComtnentrprsmberVO comtnentrprsmberVO,
            @ModelAttribute("searchVO") ComtnentrprsmberDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnentrprsmberService.updateComtnentrprsmber(comtnentrprsmberVO);
        status.setComplete();
        return "forward:/comtnentrprsmber/ComtnentrprsmberList.do";
    }
    
    @RequestMapping("/comtnentrprsmber/deleteComtnentrprsmber.do")
    public String deleteComtnentrprsmber(
            ComtnentrprsmberVO comtnentrprsmberVO,
            @ModelAttribute("searchVO") ComtnentrprsmberDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnentrprsmberService.deleteComtnentrprsmber(comtnentrprsmberVO);
        status.setComplete();
        return "forward:/comtnentrprsmber/ComtnentrprsmberList.do";
    }

}
