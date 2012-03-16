package kr.godsoft.egovframe.generatorwebapp.comtnnote.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnnote.service.ComtnnoteService;
import kr.godsoft.egovframe.generatorwebapp.comtnnote.service.ComtnnoteDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnnote.service.ComtnnoteVO;

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
 * @Class Name : ComtnnoteController.java
 * @Description : Comtnnote Controller class
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
@SessionAttributes(types=ComtnnoteVO.class)
public class ComtnnoteController {

    @Resource(name = "comtnnoteService")
    private ComtnnoteService comtnnoteService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnnote 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnnoteVO
	 * @return "/comtnnote/ComtnnoteList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnnote/ComtnnoteList.do")
    public String selectComtnnoteList(@ModelAttribute("searchVO") ComtnnoteVO searchVO, 
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
		
        List<EgovMap> comtnnoteList = comtnnoteService.selectComtnnoteList(searchVO);
        model.addAttribute("resultList", comtnnoteList);
        
        int totCnt = comtnnoteService.selectComtnnoteListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnnote/ComtnnoteList";
    } 
    
    @RequestMapping("/comtnnote/addComtnnoteView.do")
    public String addComtnnoteView(
            @ModelAttribute("searchVO") ComtnnoteDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnnoteVO", new ComtnnoteVO());
        return "/comtnnote/ComtnnoteRegister";
    }
    
    @RequestMapping("/comtnnote/addComtnnote.do")
    public String addComtnnote(
            ComtnnoteVO comtnnoteVO,
            @ModelAttribute("searchVO") ComtnnoteDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnnoteService.insertComtnnote(comtnnoteVO);
        status.setComplete();
        return "forward:/comtnnote/ComtnnoteList.do";
    }
    
    @RequestMapping("/comtnnote/updateComtnnoteView.do")
    public String updateComtnnoteView(
            @RequestParam("noteId") String noteId ,
            @ModelAttribute("searchVO") ComtnnoteDefaultVO searchVO, Model model)
            throws Exception {
        ComtnnoteVO comtnnoteVO = new ComtnnoteVO();
        comtnnoteVO.setNoteId(noteId);
;        
        // 변수명은 CoC 에 따라 comtnnoteVO
        model.addAttribute(selectComtnnote(comtnnoteVO, searchVO));
        return "/comtnnote/ComtnnoteRegister";
    }

    @RequestMapping("/comtnnote/selectComtnnote.do")
    public @ModelAttribute("comtnnoteVO")
    ComtnnoteVO selectComtnnote(
            ComtnnoteVO comtnnoteVO,
            @ModelAttribute("searchVO") ComtnnoteDefaultVO searchVO) throws Exception {
        return comtnnoteService.selectComtnnote(comtnnoteVO);
    }

    @RequestMapping("/comtnnote/updateComtnnote.do")
    public String updateComtnnote(
            ComtnnoteVO comtnnoteVO,
            @ModelAttribute("searchVO") ComtnnoteDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnnoteService.updateComtnnote(comtnnoteVO);
        status.setComplete();
        return "forward:/comtnnote/ComtnnoteList.do";
    }
    
    @RequestMapping("/comtnnote/deleteComtnnote.do")
    public String deleteComtnnote(
            ComtnnoteVO comtnnoteVO,
            @ModelAttribute("searchVO") ComtnnoteDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnnoteService.deleteComtnnote(comtnnoteVO);
        status.setComplete();
        return "forward:/comtnnote/ComtnnoteList.do";
    }

}
