package kr.godsoft.egovframe.generatorwebapp.comtsweblogsummary.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtsweblogsummary.service.ComtsweblogsummaryService;
import kr.godsoft.egovframe.generatorwebapp.comtsweblogsummary.service.ComtsweblogsummaryDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtsweblogsummary.service.ComtsweblogsummaryVO;

/**
 * @Class Name : ComtsweblogsummaryController.java
 * @Description : Comtsweblogsummary Controller class
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
@SessionAttributes(types=ComtsweblogsummaryVO.class)
public class ComtsweblogsummaryController {

    @Resource(name = "comtsweblogsummaryService")
    private ComtsweblogsummaryService comtsweblogsummaryService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtsweblogsummary 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtsweblogsummaryDefaultVO
	 * @return "/comtsweblogsummary/ComtsweblogsummaryList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtsweblogsummary/ComtsweblogsummaryList.do")
    public String selectComtsweblogsummaryList(@ModelAttribute("searchVO") ComtsweblogsummaryDefaultVO searchVO, 
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
		
        List comtsweblogsummaryList = comtsweblogsummaryService.selectComtsweblogsummaryList(searchVO);
        model.addAttribute("resultList", comtsweblogsummaryList);
        
        int totCnt = comtsweblogsummaryService.selectComtsweblogsummaryListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtsweblogsummary/ComtsweblogsummaryList";
    } 
    
    @RequestMapping("/comtsweblogsummary/addComtsweblogsummaryView.do")
    public String addComtsweblogsummaryView(
            @ModelAttribute("searchVO") ComtsweblogsummaryDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtsweblogsummaryVO", new ComtsweblogsummaryVO());
        return "/comtsweblogsummary/ComtsweblogsummaryRegister";
    }
    
    @RequestMapping("/comtsweblogsummary/addComtsweblogsummary.do")
    public String addComtsweblogsummary(
            ComtsweblogsummaryVO comtsweblogsummaryVO,
            @ModelAttribute("searchVO") ComtsweblogsummaryDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtsweblogsummaryService.insertComtsweblogsummary(comtsweblogsummaryVO);
        status.setComplete();
        return "forward:/comtsweblogsummary/ComtsweblogsummaryList.do";
    }
    
    @RequestMapping("/comtsweblogsummary/updateComtsweblogsummaryView.do")
    public String updateComtsweblogsummaryView(
            @RequestParam("occrrncDe") String occrrncDe ,
            @RequestParam("url") String url ,
            @ModelAttribute("searchVO") ComtsweblogsummaryDefaultVO searchVO, Model model)
            throws Exception {
        ComtsweblogsummaryVO comtsweblogsummaryVO = new ComtsweblogsummaryVO();
        comtsweblogsummaryVO.setOccrrncDe(occrrncDe);
        comtsweblogsummaryVO.setUrl(url);
;        
        // 변수명은 CoC 에 따라 comtsweblogsummaryVO
        model.addAttribute(selectComtsweblogsummary(comtsweblogsummaryVO, searchVO));
        return "/comtsweblogsummary/ComtsweblogsummaryRegister";
    }

    @RequestMapping("/comtsweblogsummary/selectComtsweblogsummary.do")
    public @ModelAttribute("comtsweblogsummaryVO")
    ComtsweblogsummaryVO selectComtsweblogsummary(
            ComtsweblogsummaryVO comtsweblogsummaryVO,
            @ModelAttribute("searchVO") ComtsweblogsummaryDefaultVO searchVO) throws Exception {
        return comtsweblogsummaryService.selectComtsweblogsummary(comtsweblogsummaryVO);
    }

    @RequestMapping("/comtsweblogsummary/updateComtsweblogsummary.do")
    public String updateComtsweblogsummary(
            ComtsweblogsummaryVO comtsweblogsummaryVO,
            @ModelAttribute("searchVO") ComtsweblogsummaryDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtsweblogsummaryService.updateComtsweblogsummary(comtsweblogsummaryVO);
        status.setComplete();
        return "forward:/comtsweblogsummary/ComtsweblogsummaryList.do";
    }
    
    @RequestMapping("/comtsweblogsummary/deleteComtsweblogsummary.do")
    public String deleteComtsweblogsummary(
            ComtsweblogsummaryVO comtsweblogsummaryVO,
            @ModelAttribute("searchVO") ComtsweblogsummaryDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtsweblogsummaryService.deleteComtsweblogsummary(comtsweblogsummaryVO);
        status.setComplete();
        return "forward:/comtsweblogsummary/ComtsweblogsummaryList.do";
    }

}
