package kr.godsoft.egovframe.generatorwebapp.comtnnoterecptn.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnnoterecptn.service.ComtnnoterecptnService;
import kr.godsoft.egovframe.generatorwebapp.comtnnoterecptn.service.ComtnnoterecptnDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnnoterecptn.service.ComtnnoterecptnVO;

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
 * @Class Name : ComtnnoterecptnController.java
 * @Description : Comtnnoterecptn Controller class
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
public class ComtnnoterecptnController {

    @Resource(name = "comtnnoterecptnService")
    private ComtnnoterecptnService comtnnoterecptnService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNNOTERECPTN 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnnoterecptnVO
	 * @return "/comtnnoterecptn/ComtnnoterecptnList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnnoterecptn/ComtnnoterecptnList.do")
    public String selectComtnnoterecptnList(@ModelAttribute("searchVO") ComtnnoterecptnVO searchVO, 
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
		
        List<EgovMap> comtnnoterecptnList = comtnnoterecptnService.selectComtnnoterecptnList(searchVO);
        model.addAttribute("resultList", comtnnoterecptnList);
        
        int totCnt = comtnnoterecptnService.selectComtnnoterecptnListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnnoterecptn/ComtnnoterecptnList";
    } 
    
    @RequestMapping("/comtnnoterecptn/addComtnnoterecptnView.do")
    public String addComtnnoterecptnView(
            @ModelAttribute("searchVO") ComtnnoterecptnDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnnoterecptnVO", new ComtnnoterecptnVO());
        return "/comtnnoterecptn/ComtnnoterecptnRegister";
    }
    
    @RequestMapping("/comtnnoterecptn/addComtnnoterecptn.do")
    public String addComtnnoterecptn(
            ComtnnoterecptnVO comtnnoterecptnVO,
            @ModelAttribute("searchVO") ComtnnoterecptnDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnnoterecptnService.insertComtnnoterecptn(comtnnoterecptnVO);
        status.setComplete();
        return "forward:/comtnnoterecptn/ComtnnoterecptnList.do";
    }
    
    @RequestMapping("/comtnnoterecptn/updateComtnnoterecptnView.do")
    public String updateComtnnoterecptnView(
            @RequestParam("noteId") String noteId ,
            @RequestParam("noteTrnsmitId") String noteTrnsmitId ,
            @RequestParam("noteRecptnId") String noteRecptnId ,
            @ModelAttribute("searchVO") ComtnnoterecptnDefaultVO searchVO, Model model)
            throws Exception {
        ComtnnoterecptnVO comtnnoterecptnVO = new ComtnnoterecptnVO();
        comtnnoterecptnVO.setNoteId(noteId);
        comtnnoterecptnVO.setNoteTrnsmitId(noteTrnsmitId);
        comtnnoterecptnVO.setNoteRecptnId(noteRecptnId);
;        
        // 변수명은 CoC 에 따라 comtnnoterecptnVO
        model.addAttribute(selectComtnnoterecptn(comtnnoterecptnVO, searchVO));
        return "/comtnnoterecptn/ComtnnoterecptnRegister";
    }

    @RequestMapping("/comtnnoterecptn/selectComtnnoterecptn.do")
    public @ModelAttribute("comtnnoterecptnVO")
    ComtnnoterecptnVO selectComtnnoterecptn(
            ComtnnoterecptnVO comtnnoterecptnVO,
            @ModelAttribute("searchVO") ComtnnoterecptnDefaultVO searchVO) throws Exception {
        return comtnnoterecptnService.selectComtnnoterecptn(comtnnoterecptnVO);
    }

    @RequestMapping("/comtnnoterecptn/updateComtnnoterecptn.do")
    public String updateComtnnoterecptn(
            ComtnnoterecptnVO comtnnoterecptnVO,
            @ModelAttribute("searchVO") ComtnnoterecptnDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnnoterecptnService.updateComtnnoterecptn(comtnnoterecptnVO);
        status.setComplete();
        return "forward:/comtnnoterecptn/ComtnnoterecptnList.do";
    }
    
    @RequestMapping("/comtnnoterecptn/deleteComtnnoterecptn.do")
    public String deleteComtnnoterecptn(
            ComtnnoterecptnVO comtnnoterecptnVO,
            @ModelAttribute("searchVO") ComtnnoterecptnDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnnoterecptnService.deleteComtnnoterecptn(comtnnoterecptnVO);
        status.setComplete();
        return "forward:/comtnnoterecptn/ComtnnoterecptnList.do";
    }

}
