package kr.godsoft.egovframe.generatorwebapp.comtnnttstats.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnnttstats.service.ComtnnttstatsService;
import kr.godsoft.egovframe.generatorwebapp.comtnnttstats.service.ComtnnttstatsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnnttstats.service.ComtnnttstatsVO;

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
 * @Class Name : ComtnnttstatsController.java
 * @Description : Comtnnttstats Controller class
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
public class ComtnnttstatsController {

    @Resource(name = "comtnnttstatsService")
    private ComtnnttstatsService comtnnttstatsService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNNTTSTATS 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnnttstatsVO
	 * @return "/comtnnttstats/ComtnnttstatsList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnnttstats/ComtnnttstatsList.do")
    public String selectComtnnttstatsList(@ModelAttribute("searchVO") ComtnnttstatsVO searchVO, 
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
		
        List<EgovMap> comtnnttstatsList = comtnnttstatsService.selectComtnnttstatsList(searchVO);
        model.addAttribute("resultList", comtnnttstatsList);
        
        int totCnt = comtnnttstatsService.selectComtnnttstatsListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnnttstats/ComtnnttstatsList";
    } 
    
    @RequestMapping("/comtnnttstats/addComtnnttstatsView.do")
    public String addComtnnttstatsView(
            @ModelAttribute("searchVO") ComtnnttstatsDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnnttstatsVO", new ComtnnttstatsVO());
        return "/comtnnttstats/ComtnnttstatsRegister";
    }
    
    @RequestMapping("/comtnnttstats/addComtnnttstats.do")
    public String addComtnnttstats(
            ComtnnttstatsVO comtnnttstatsVO,
            @ModelAttribute("searchVO") ComtnnttstatsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnnttstatsService.insertComtnnttstats(comtnnttstatsVO);
        status.setComplete();
        return "forward:/comtnnttstats/ComtnnttstatsList.do";
    }
    
    @RequestMapping("/comtnnttstats/updateComtnnttstatsView.do")
    public String updateComtnnttstatsView(
            @RequestParam("statsId") String statsId ,
            @ModelAttribute("searchVO") ComtnnttstatsDefaultVO searchVO, Model model)
            throws Exception {
        ComtnnttstatsVO comtnnttstatsVO = new ComtnnttstatsVO();
        comtnnttstatsVO.setStatsId(statsId);
;        
        // 변수명은 CoC 에 따라 comtnnttstatsVO
        model.addAttribute(selectComtnnttstats(comtnnttstatsVO, searchVO));
        return "/comtnnttstats/ComtnnttstatsRegister";
    }

    @RequestMapping("/comtnnttstats/selectComtnnttstats.do")
    public @ModelAttribute("comtnnttstatsVO")
    ComtnnttstatsVO selectComtnnttstats(
            ComtnnttstatsVO comtnnttstatsVO,
            @ModelAttribute("searchVO") ComtnnttstatsDefaultVO searchVO) throws Exception {
        return comtnnttstatsService.selectComtnnttstats(comtnnttstatsVO);
    }

    @RequestMapping("/comtnnttstats/updateComtnnttstats.do")
    public String updateComtnnttstats(
            ComtnnttstatsVO comtnnttstatsVO,
            @ModelAttribute("searchVO") ComtnnttstatsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnnttstatsService.updateComtnnttstats(comtnnttstatsVO);
        status.setComplete();
        return "forward:/comtnnttstats/ComtnnttstatsList.do";
    }
    
    @RequestMapping("/comtnnttstats/deleteComtnnttstats.do")
    public String deleteComtnnttstats(
            ComtnnttstatsVO comtnnttstatsVO,
            @ModelAttribute("searchVO") ComtnnttstatsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnnttstatsService.deleteComtnnttstats(comtnnttstatsVO);
        status.setComplete();
        return "forward:/comtnnttstats/ComtnnttstatsList.do";
    }

}
