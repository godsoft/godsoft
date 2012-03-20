package kr.godsoft.egovframe.generatorwebapp.comtnnotetrnsmit.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnnotetrnsmit.service.ComtnnotetrnsmitService;
import kr.godsoft.egovframe.generatorwebapp.comtnnotetrnsmit.service.ComtnnotetrnsmitDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnnotetrnsmit.service.ComtnnotetrnsmitVO;

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
 * @Class Name : ComtnnotetrnsmitController.java
 * @Description : Comtnnotetrnsmit Controller class
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
public class ComtnnotetrnsmitController {

    @Resource(name = "comtnnotetrnsmitService")
    private ComtnnotetrnsmitService comtnnotetrnsmitService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnnotetrnsmit 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnnotetrnsmitVO
	 * @return "/comtnnotetrnsmit/ComtnnotetrnsmitList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnnotetrnsmit/ComtnnotetrnsmitList.do")
    public String selectComtnnotetrnsmitList(@ModelAttribute("searchVO") ComtnnotetrnsmitVO searchVO, 
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
		
        List<EgovMap> comtnnotetrnsmitList = comtnnotetrnsmitService.selectComtnnotetrnsmitList(searchVO);
        model.addAttribute("resultList", comtnnotetrnsmitList);
        
        int totCnt = comtnnotetrnsmitService.selectComtnnotetrnsmitListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnnotetrnsmit/ComtnnotetrnsmitList";
    } 
    
    @RequestMapping("/comtnnotetrnsmit/addComtnnotetrnsmitView.do")
    public String addComtnnotetrnsmitView(
            @ModelAttribute("searchVO") ComtnnotetrnsmitDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnnotetrnsmitVO", new ComtnnotetrnsmitVO());
        return "/comtnnotetrnsmit/ComtnnotetrnsmitRegister";
    }
    
    @RequestMapping("/comtnnotetrnsmit/addComtnnotetrnsmit.do")
    public String addComtnnotetrnsmit(
            ComtnnotetrnsmitVO comtnnotetrnsmitVO,
            @ModelAttribute("searchVO") ComtnnotetrnsmitDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnnotetrnsmitService.insertComtnnotetrnsmit(comtnnotetrnsmitVO);
        status.setComplete();
        return "forward:/comtnnotetrnsmit/ComtnnotetrnsmitList.do";
    }
    
    @RequestMapping("/comtnnotetrnsmit/updateComtnnotetrnsmitView.do")
    public String updateComtnnotetrnsmitView(
            @RequestParam("noteId") String noteId ,
            @RequestParam("noteTrnsmitId") String noteTrnsmitId ,
            @ModelAttribute("searchVO") ComtnnotetrnsmitDefaultVO searchVO, Model model)
            throws Exception {
        ComtnnotetrnsmitVO comtnnotetrnsmitVO = new ComtnnotetrnsmitVO();
        comtnnotetrnsmitVO.setNoteId(noteId);
        comtnnotetrnsmitVO.setNoteTrnsmitId(noteTrnsmitId);
;        
        // 변수명은 CoC 에 따라 comtnnotetrnsmitVO
        model.addAttribute(selectComtnnotetrnsmit(comtnnotetrnsmitVO, searchVO));
        return "/comtnnotetrnsmit/ComtnnotetrnsmitRegister";
    }

    @RequestMapping("/comtnnotetrnsmit/selectComtnnotetrnsmit.do")
    public @ModelAttribute("comtnnotetrnsmitVO")
    ComtnnotetrnsmitVO selectComtnnotetrnsmit(
            ComtnnotetrnsmitVO comtnnotetrnsmitVO,
            @ModelAttribute("searchVO") ComtnnotetrnsmitDefaultVO searchVO) throws Exception {
        return comtnnotetrnsmitService.selectComtnnotetrnsmit(comtnnotetrnsmitVO);
    }

    @RequestMapping("/comtnnotetrnsmit/updateComtnnotetrnsmit.do")
    public String updateComtnnotetrnsmit(
            ComtnnotetrnsmitVO comtnnotetrnsmitVO,
            @ModelAttribute("searchVO") ComtnnotetrnsmitDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnnotetrnsmitService.updateComtnnotetrnsmit(comtnnotetrnsmitVO);
        status.setComplete();
        return "forward:/comtnnotetrnsmit/ComtnnotetrnsmitList.do";
    }
    
    @RequestMapping("/comtnnotetrnsmit/deleteComtnnotetrnsmit.do")
    public String deleteComtnnotetrnsmit(
            ComtnnotetrnsmitVO comtnnotetrnsmitVO,
            @ModelAttribute("searchVO") ComtnnotetrnsmitDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnnotetrnsmitService.deleteComtnnotetrnsmit(comtnnotetrnsmitVO);
        status.setComplete();
        return "forward:/comtnnotetrnsmit/ComtnnotetrnsmitList.do";
    }

}
