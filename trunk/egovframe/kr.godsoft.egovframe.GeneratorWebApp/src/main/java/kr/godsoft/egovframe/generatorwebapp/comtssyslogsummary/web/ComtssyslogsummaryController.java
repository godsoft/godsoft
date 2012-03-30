package kr.godsoft.egovframe.generatorwebapp.comtssyslogsummary.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtssyslogsummary.service.ComtssyslogsummaryService;
import kr.godsoft.egovframe.generatorwebapp.comtssyslogsummary.service.ComtssyslogsummaryDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtssyslogsummary.service.ComtssyslogsummaryVO;

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
 * @Class Name : ComtssyslogsummaryController.java
 * @Description : Comtssyslogsummary Controller class
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
public class ComtssyslogsummaryController {

    @Resource(name = "comtssyslogsummaryService")
    private ComtssyslogsummaryService comtssyslogsummaryService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTSSYSLOGSUMMARY 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtssyslogsummaryVO
	 * @return "/comtssyslogsummary/ComtssyslogsummaryList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtssyslogsummary/ComtssyslogsummaryList.do")
    public String selectComtssyslogsummaryList(@ModelAttribute("searchVO") ComtssyslogsummaryVO searchVO, 
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
		
        List<EgovMap> comtssyslogsummaryList = comtssyslogsummaryService.selectComtssyslogsummaryList(searchVO);
        model.addAttribute("resultList", comtssyslogsummaryList);
        
        int totCnt = comtssyslogsummaryService.selectComtssyslogsummaryListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtssyslogsummary/ComtssyslogsummaryList";
    } 
    
    @RequestMapping("/comtssyslogsummary/addComtssyslogsummaryView.do")
    public String addComtssyslogsummaryView(
            @ModelAttribute("searchVO") ComtssyslogsummaryDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtssyslogsummaryVO", new ComtssyslogsummaryVO());
        return "/comtssyslogsummary/ComtssyslogsummaryRegister";
    }
    
    @RequestMapping("/comtssyslogsummary/addComtssyslogsummary.do")
    public String addComtssyslogsummary(
            ComtssyslogsummaryVO comtssyslogsummaryVO,
            @ModelAttribute("searchVO") ComtssyslogsummaryDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtssyslogsummaryService.insertComtssyslogsummary(comtssyslogsummaryVO);
        status.setComplete();
        return "forward:/comtssyslogsummary/ComtssyslogsummaryList.do";
    }
    
    @RequestMapping("/comtssyslogsummary/updateComtssyslogsummaryView.do")
    public String updateComtssyslogsummaryView(
            @RequestParam("occrrncDe") String occrrncDe ,
            @RequestParam("svcNm") String svcNm ,
            @RequestParam("methodNm") String methodNm ,
            @ModelAttribute("searchVO") ComtssyslogsummaryDefaultVO searchVO, Model model)
            throws Exception {
        ComtssyslogsummaryVO comtssyslogsummaryVO = new ComtssyslogsummaryVO();
        comtssyslogsummaryVO.setOccrrncDe(occrrncDe);
        comtssyslogsummaryVO.setSvcNm(svcNm);
        comtssyslogsummaryVO.setMethodNm(methodNm);
;        
        // 변수명은 CoC 에 따라 comtssyslogsummaryVO
        model.addAttribute(selectComtssyslogsummary(comtssyslogsummaryVO, searchVO));
        return "/comtssyslogsummary/ComtssyslogsummaryRegister";
    }

    @RequestMapping("/comtssyslogsummary/selectComtssyslogsummary.do")
    public @ModelAttribute("comtssyslogsummaryVO")
    ComtssyslogsummaryVO selectComtssyslogsummary(
            ComtssyslogsummaryVO comtssyslogsummaryVO,
            @ModelAttribute("searchVO") ComtssyslogsummaryDefaultVO searchVO) throws Exception {
        return comtssyslogsummaryService.selectComtssyslogsummary(comtssyslogsummaryVO);
    }

    @RequestMapping("/comtssyslogsummary/updateComtssyslogsummary.do")
    public String updateComtssyslogsummary(
            ComtssyslogsummaryVO comtssyslogsummaryVO,
            @ModelAttribute("searchVO") ComtssyslogsummaryDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtssyslogsummaryService.updateComtssyslogsummary(comtssyslogsummaryVO);
        status.setComplete();
        return "forward:/comtssyslogsummary/ComtssyslogsummaryList.do";
    }
    
    @RequestMapping("/comtssyslogsummary/deleteComtssyslogsummary.do")
    public String deleteComtssyslogsummary(
            ComtssyslogsummaryVO comtssyslogsummaryVO,
            @ModelAttribute("searchVO") ComtssyslogsummaryDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtssyslogsummaryService.deleteComtssyslogsummary(comtssyslogsummaryVO);
        status.setComplete();
        return "forward:/comtssyslogsummary/ComtssyslogsummaryList.do";
    }

}
