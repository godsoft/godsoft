package kr.godsoft.egovframe.generatorwebapp.comtndtausestats.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtndtausestats.service.ComtndtausestatsService;
import kr.godsoft.egovframe.generatorwebapp.comtndtausestats.service.ComtndtausestatsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtndtausestats.service.ComtndtausestatsVO;

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
 * @Class Name : ComtndtausestatsController.java
 * @Description : Comtndtausestats Controller class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Controller
@SessionAttributes(types=ComtndtausestatsVO.class)
public class ComtndtausestatsController {

    @Resource(name = "comtndtausestatsService")
    private ComtndtausestatsService comtndtausestatsService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtndtausestats 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtndtausestatsVO
	 * @return "/comtndtausestats/ComtndtausestatsList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtndtausestats/ComtndtausestatsList.do")
    public String selectComtndtausestatsList(@ModelAttribute("searchVO") ComtndtausestatsVO searchVO, 
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
		
        List<EgovMap> comtndtausestatsList = comtndtausestatsService.selectComtndtausestatsList(searchVO);
        model.addAttribute("resultList", comtndtausestatsList);
        
        int totCnt = comtndtausestatsService.selectComtndtausestatsListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtndtausestats/ComtndtausestatsList";
    } 
    
    @RequestMapping("/comtndtausestats/addComtndtausestatsView.do")
    public String addComtndtausestatsView(
            @ModelAttribute("searchVO") ComtndtausestatsDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtndtausestatsVO", new ComtndtausestatsVO());
        return "/comtndtausestats/ComtndtausestatsRegister";
    }
    
    @RequestMapping("/comtndtausestats/addComtndtausestats.do")
    public String addComtndtausestats(
            ComtndtausestatsVO comtndtausestatsVO,
            @ModelAttribute("searchVO") ComtndtausestatsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtndtausestatsService.insertComtndtausestats(comtndtausestatsVO);
        status.setComplete();
        return "forward:/comtndtausestats/ComtndtausestatsList.do";
    }
    
    @RequestMapping("/comtndtausestats/updateComtndtausestatsView.do")
    public String updateComtndtausestatsView(
            @RequestParam("dtaUseStatsId") String dtaUseStatsId ,
            @ModelAttribute("searchVO") ComtndtausestatsDefaultVO searchVO, Model model)
            throws Exception {
        ComtndtausestatsVO comtndtausestatsVO = new ComtndtausestatsVO();
        comtndtausestatsVO.setDtaUseStatsId(dtaUseStatsId);
;        
        // 변수명은 CoC 에 따라 comtndtausestatsVO
        model.addAttribute(selectComtndtausestats(comtndtausestatsVO, searchVO));
        return "/comtndtausestats/ComtndtausestatsRegister";
    }

    @RequestMapping("/comtndtausestats/selectComtndtausestats.do")
    public @ModelAttribute("comtndtausestatsVO")
    ComtndtausestatsVO selectComtndtausestats(
            ComtndtausestatsVO comtndtausestatsVO,
            @ModelAttribute("searchVO") ComtndtausestatsDefaultVO searchVO) throws Exception {
        return comtndtausestatsService.selectComtndtausestats(comtndtausestatsVO);
    }

    @RequestMapping("/comtndtausestats/updateComtndtausestats.do")
    public String updateComtndtausestats(
            ComtndtausestatsVO comtndtausestatsVO,
            @ModelAttribute("searchVO") ComtndtausestatsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtndtausestatsService.updateComtndtausestats(comtndtausestatsVO);
        status.setComplete();
        return "forward:/comtndtausestats/ComtndtausestatsList.do";
    }
    
    @RequestMapping("/comtndtausestats/deleteComtndtausestats.do")
    public String deleteComtndtausestats(
            ComtndtausestatsVO comtndtausestatsVO,
            @ModelAttribute("searchVO") ComtndtausestatsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtndtausestatsService.deleteComtndtausestats(comtndtausestatsVO);
        status.setComplete();
        return "forward:/comtndtausestats/ComtndtausestatsList.do";
    }

}
