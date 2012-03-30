package kr.godsoft.egovframe.generatorwebapp.comtneventatdrn.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtneventatdrn.service.ComtneventatdrnService;
import kr.godsoft.egovframe.generatorwebapp.comtneventatdrn.service.ComtneventatdrnDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtneventatdrn.service.ComtneventatdrnVO;

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
 * @Class Name : ComtneventatdrnController.java
 * @Description : Comtneventatdrn Controller class
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
public class ComtneventatdrnController {

    @Resource(name = "comtneventatdrnService")
    private ComtneventatdrnService comtneventatdrnService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNEVENTATDRN 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtneventatdrnVO
	 * @return "/comtneventatdrn/ComtneventatdrnList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtneventatdrn/ComtneventatdrnList.do")
    public String selectComtneventatdrnList(@ModelAttribute("searchVO") ComtneventatdrnVO searchVO, 
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
		
        List<EgovMap> comtneventatdrnList = comtneventatdrnService.selectComtneventatdrnList(searchVO);
        model.addAttribute("resultList", comtneventatdrnList);
        
        int totCnt = comtneventatdrnService.selectComtneventatdrnListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtneventatdrn/ComtneventatdrnList";
    } 
    
    @RequestMapping("/comtneventatdrn/addComtneventatdrnView.do")
    public String addComtneventatdrnView(
            @ModelAttribute("searchVO") ComtneventatdrnDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtneventatdrnVO", new ComtneventatdrnVO());
        return "/comtneventatdrn/ComtneventatdrnRegister";
    }
    
    @RequestMapping("/comtneventatdrn/addComtneventatdrn.do")
    public String addComtneventatdrn(
            ComtneventatdrnVO comtneventatdrnVO,
            @ModelAttribute("searchVO") ComtneventatdrnDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtneventatdrnService.insertComtneventatdrn(comtneventatdrnVO);
        status.setComplete();
        return "forward:/comtneventatdrn/ComtneventatdrnList.do";
    }
    
    @RequestMapping("/comtneventatdrn/updateComtneventatdrnView.do")
    public String updateComtneventatdrnView(
            @RequestParam("applcntId") String applcntId ,
            @RequestParam("eventId") String eventId ,
            @ModelAttribute("searchVO") ComtneventatdrnDefaultVO searchVO, Model model)
            throws Exception {
        ComtneventatdrnVO comtneventatdrnVO = new ComtneventatdrnVO();
        comtneventatdrnVO.setApplcntId(applcntId);
        comtneventatdrnVO.setEventId(eventId);
;        
        // 변수명은 CoC 에 따라 comtneventatdrnVO
        model.addAttribute(selectComtneventatdrn(comtneventatdrnVO, searchVO));
        return "/comtneventatdrn/ComtneventatdrnRegister";
    }

    @RequestMapping("/comtneventatdrn/selectComtneventatdrn.do")
    public @ModelAttribute("comtneventatdrnVO")
    ComtneventatdrnVO selectComtneventatdrn(
            ComtneventatdrnVO comtneventatdrnVO,
            @ModelAttribute("searchVO") ComtneventatdrnDefaultVO searchVO) throws Exception {
        return comtneventatdrnService.selectComtneventatdrn(comtneventatdrnVO);
    }

    @RequestMapping("/comtneventatdrn/updateComtneventatdrn.do")
    public String updateComtneventatdrn(
            ComtneventatdrnVO comtneventatdrnVO,
            @ModelAttribute("searchVO") ComtneventatdrnDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtneventatdrnService.updateComtneventatdrn(comtneventatdrnVO);
        status.setComplete();
        return "forward:/comtneventatdrn/ComtneventatdrnList.do";
    }
    
    @RequestMapping("/comtneventatdrn/deleteComtneventatdrn.do")
    public String deleteComtneventatdrn(
            ComtneventatdrnVO comtneventatdrnVO,
            @ModelAttribute("searchVO") ComtneventatdrnDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtneventatdrnService.deleteComtneventatdrn(comtneventatdrnVO);
        status.setComplete();
        return "forward:/comtneventatdrn/ComtneventatdrnList.do";
    }

}
