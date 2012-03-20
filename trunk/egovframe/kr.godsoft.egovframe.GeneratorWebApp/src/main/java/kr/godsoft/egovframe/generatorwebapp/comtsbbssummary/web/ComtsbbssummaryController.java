package kr.godsoft.egovframe.generatorwebapp.comtsbbssummary.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtsbbssummary.service.ComtsbbssummaryService;
import kr.godsoft.egovframe.generatorwebapp.comtsbbssummary.service.ComtsbbssummaryDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtsbbssummary.service.ComtsbbssummaryVO;

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
 * @Class Name : ComtsbbssummaryController.java
 * @Description : Comtsbbssummary Controller class
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
public class ComtsbbssummaryController {

    @Resource(name = "comtsbbssummaryService")
    private ComtsbbssummaryService comtsbbssummaryService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtsbbssummary 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtsbbssummaryVO
	 * @return "/comtsbbssummary/ComtsbbssummaryList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtsbbssummary/ComtsbbssummaryList.do")
    public String selectComtsbbssummaryList(@ModelAttribute("searchVO") ComtsbbssummaryVO searchVO, 
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
		
        List<EgovMap> comtsbbssummaryList = comtsbbssummaryService.selectComtsbbssummaryList(searchVO);
        model.addAttribute("resultList", comtsbbssummaryList);
        
        int totCnt = comtsbbssummaryService.selectComtsbbssummaryListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtsbbssummary/ComtsbbssummaryList";
    } 
    
    @RequestMapping("/comtsbbssummary/addComtsbbssummaryView.do")
    public String addComtsbbssummaryView(
            @ModelAttribute("searchVO") ComtsbbssummaryDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtsbbssummaryVO", new ComtsbbssummaryVO());
        return "/comtsbbssummary/ComtsbbssummaryRegister";
    }
    
    @RequestMapping("/comtsbbssummary/addComtsbbssummary.do")
    public String addComtsbbssummary(
            ComtsbbssummaryVO comtsbbssummaryVO,
            @ModelAttribute("searchVO") ComtsbbssummaryDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtsbbssummaryService.insertComtsbbssummary(comtsbbssummaryVO);
        status.setComplete();
        return "forward:/comtsbbssummary/ComtsbbssummaryList.do";
    }
    
    @RequestMapping("/comtsbbssummary/updateComtsbbssummaryView.do")
    public String updateComtsbbssummaryView(
            @RequestParam("occrrncDe") String occrrncDe ,
            @RequestParam("statsSe") String statsSe ,
            @RequestParam("detailStatsSe") String detailStatsSe ,
            @ModelAttribute("searchVO") ComtsbbssummaryDefaultVO searchVO, Model model)
            throws Exception {
        ComtsbbssummaryVO comtsbbssummaryVO = new ComtsbbssummaryVO();
        comtsbbssummaryVO.setOccrrncDe(occrrncDe);
        comtsbbssummaryVO.setStatsSe(statsSe);
        comtsbbssummaryVO.setDetailStatsSe(detailStatsSe);
;        
        // 변수명은 CoC 에 따라 comtsbbssummaryVO
        model.addAttribute(selectComtsbbssummary(comtsbbssummaryVO, searchVO));
        return "/comtsbbssummary/ComtsbbssummaryRegister";
    }

    @RequestMapping("/comtsbbssummary/selectComtsbbssummary.do")
    public @ModelAttribute("comtsbbssummaryVO")
    ComtsbbssummaryVO selectComtsbbssummary(
            ComtsbbssummaryVO comtsbbssummaryVO,
            @ModelAttribute("searchVO") ComtsbbssummaryDefaultVO searchVO) throws Exception {
        return comtsbbssummaryService.selectComtsbbssummary(comtsbbssummaryVO);
    }

    @RequestMapping("/comtsbbssummary/updateComtsbbssummary.do")
    public String updateComtsbbssummary(
            ComtsbbssummaryVO comtsbbssummaryVO,
            @ModelAttribute("searchVO") ComtsbbssummaryDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtsbbssummaryService.updateComtsbbssummary(comtsbbssummaryVO);
        status.setComplete();
        return "forward:/comtsbbssummary/ComtsbbssummaryList.do";
    }
    
    @RequestMapping("/comtsbbssummary/deleteComtsbbssummary.do")
    public String deleteComtsbbssummary(
            ComtsbbssummaryVO comtsbbssummaryVO,
            @ModelAttribute("searchVO") ComtsbbssummaryDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtsbbssummaryService.deleteComtsbbssummary(comtsbbssummaryVO);
        status.setComplete();
        return "forward:/comtsbbssummary/ComtsbbssummaryList.do";
    }

}
