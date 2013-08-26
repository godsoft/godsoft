package kr.godsoft.egovframe.generatorwebapp.comtstrsmrcvlogsummary.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtstrsmrcvlogsummary.service.ComtstrsmrcvlogsummaryService;
import kr.godsoft.egovframe.generatorwebapp.comtstrsmrcvlogsummary.service.ComtstrsmrcvlogsummaryDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtstrsmrcvlogsummary.service.ComtstrsmrcvlogsummaryVO;

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
 * @Class Name : ComtstrsmrcvlogsummaryController.java
 * @Description : Comtstrsmrcvlogsummary Controller class
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
public class ComtstrsmrcvlogsummaryController {

    @Resource(name = "comtstrsmrcvlogsummaryService")
    private ComtstrsmrcvlogsummaryService comtstrsmrcvlogsummaryService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTSTRSMRCVLOGSUMMARY 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtstrsmrcvlogsummaryVO
	 * @return "/comtstrsmrcvlogsummary/ComtstrsmrcvlogsummaryList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtstrsmrcvlogsummary/ComtstrsmrcvlogsummaryList.do")
    public String selectComtstrsmrcvlogsummaryList(@ModelAttribute("searchVO") ComtstrsmrcvlogsummaryVO searchVO, 
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
		
        List<EgovMap> comtstrsmrcvlogsummaryList = comtstrsmrcvlogsummaryService.selectComtstrsmrcvlogsummaryList(searchVO);
        model.addAttribute("resultList", comtstrsmrcvlogsummaryList);
        
        int totCnt = comtstrsmrcvlogsummaryService.selectComtstrsmrcvlogsummaryListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtstrsmrcvlogsummary/ComtstrsmrcvlogsummaryList";
    } 
    
    @RequestMapping("/comtstrsmrcvlogsummary/addComtstrsmrcvlogsummaryView.do")
    public String addComtstrsmrcvlogsummaryView(
            @ModelAttribute("searchVO") ComtstrsmrcvlogsummaryDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtstrsmrcvlogsummaryVO", new ComtstrsmrcvlogsummaryVO());
        return "/comtstrsmrcvlogsummary/ComtstrsmrcvlogsummaryRegister";
    }
    
    @RequestMapping("/comtstrsmrcvlogsummary/addComtstrsmrcvlogsummary.do")
    public String addComtstrsmrcvlogsummary(
            ComtstrsmrcvlogsummaryVO comtstrsmrcvlogsummaryVO,
            @ModelAttribute("searchVO") ComtstrsmrcvlogsummaryDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtstrsmrcvlogsummaryService.insertComtstrsmrcvlogsummary(comtstrsmrcvlogsummaryVO);
        status.setComplete();
        return "forward:/comtstrsmrcvlogsummary/ComtstrsmrcvlogsummaryList.do";
    }
    
    @RequestMapping("/comtstrsmrcvlogsummary/updateComtstrsmrcvlogsummaryView.do")
    public String updateComtstrsmrcvlogsummaryView(
            @RequestParam("occrrncDe") String occrrncDe ,
            @RequestParam("trsmrcvSeCode") String trsmrcvSeCode ,
            @RequestParam("provdInsttId") String provdInsttId ,
            @RequestParam("provdSysId") String provdSysId ,
            @RequestParam("provdSvcId") String provdSvcId ,
            @RequestParam("requstInsttId") String requstInsttId ,
            @RequestParam("requstSysId") String requstSysId ,
            @ModelAttribute("searchVO") ComtstrsmrcvlogsummaryDefaultVO searchVO, Model model)
            throws Exception {
        ComtstrsmrcvlogsummaryVO comtstrsmrcvlogsummaryVO = new ComtstrsmrcvlogsummaryVO();
        comtstrsmrcvlogsummaryVO.setOccrrncDe(occrrncDe);
        comtstrsmrcvlogsummaryVO.setTrsmrcvSeCode(trsmrcvSeCode);
        comtstrsmrcvlogsummaryVO.setProvdInsttId(provdInsttId);
        comtstrsmrcvlogsummaryVO.setProvdSysId(provdSysId);
        comtstrsmrcvlogsummaryVO.setProvdSvcId(provdSvcId);
        comtstrsmrcvlogsummaryVO.setRequstInsttId(requstInsttId);
        comtstrsmrcvlogsummaryVO.setRequstSysId(requstSysId);
;        
        // 변수명은 CoC 에 따라 comtstrsmrcvlogsummaryVO
        model.addAttribute(selectComtstrsmrcvlogsummary(comtstrsmrcvlogsummaryVO, searchVO));
        return "/comtstrsmrcvlogsummary/ComtstrsmrcvlogsummaryRegister";
    }

    @RequestMapping("/comtstrsmrcvlogsummary/selectComtstrsmrcvlogsummary.do")
    public @ModelAttribute("comtstrsmrcvlogsummaryVO")
    ComtstrsmrcvlogsummaryVO selectComtstrsmrcvlogsummary(
            ComtstrsmrcvlogsummaryVO comtstrsmrcvlogsummaryVO,
            @ModelAttribute("searchVO") ComtstrsmrcvlogsummaryDefaultVO searchVO) throws Exception {
        return comtstrsmrcvlogsummaryService.selectComtstrsmrcvlogsummary(comtstrsmrcvlogsummaryVO);
    }

    @RequestMapping("/comtstrsmrcvlogsummary/updateComtstrsmrcvlogsummary.do")
    public String updateComtstrsmrcvlogsummary(
            ComtstrsmrcvlogsummaryVO comtstrsmrcvlogsummaryVO,
            @ModelAttribute("searchVO") ComtstrsmrcvlogsummaryDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtstrsmrcvlogsummaryService.updateComtstrsmrcvlogsummary(comtstrsmrcvlogsummaryVO);
        status.setComplete();
        return "forward:/comtstrsmrcvlogsummary/ComtstrsmrcvlogsummaryList.do";
    }
    
    @RequestMapping("/comtstrsmrcvlogsummary/deleteComtstrsmrcvlogsummary.do")
    public String deleteComtstrsmrcvlogsummary(
            ComtstrsmrcvlogsummaryVO comtstrsmrcvlogsummaryVO,
            @ModelAttribute("searchVO") ComtstrsmrcvlogsummaryDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtstrsmrcvlogsummaryService.deleteComtstrsmrcvlogsummary(comtstrsmrcvlogsummaryVO);
        status.setComplete();
        return "forward:/comtstrsmrcvlogsummary/ComtstrsmrcvlogsummaryList.do";
    }

}
