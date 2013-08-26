package kr.godsoft.egovframe.generatorwebapp.md_sequences.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_sequences.service.MdSequencesService;
import kr.godsoft.egovframe.generatorwebapp.md_sequences.service.MdSequencesDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.md_sequences.service.MdSequencesVO;

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
 * @Class Name : MdSequencesController.java
 * @Description : MdSequences Controller class
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
public class MdSequencesController {

    @Resource(name = "mdSequencesService")
    private MdSequencesService mdSequencesService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MD_SEQUENCES 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MdSequencesVO
	 * @return "/mdSequences/MdSequencesList"
	 * @exception Exception
	 */
    @RequestMapping(value="/mdSequences/MdSequencesList.do")
    public String selectMdSequencesList(@ModelAttribute("searchVO") MdSequencesVO searchVO, 
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
		
        List<EgovMap> mdSequencesList = mdSequencesService.selectMdSequencesList(searchVO);
        model.addAttribute("resultList", mdSequencesList);
        
        int totCnt = mdSequencesService.selectMdSequencesListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/mdSequences/MdSequencesList";
    } 
    
    @RequestMapping("/mdSequences/addMdSequencesView.do")
    public String addMdSequencesView(
            @ModelAttribute("searchVO") MdSequencesDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("mdSequencesVO", new MdSequencesVO());
        return "/mdSequences/MdSequencesRegister";
    }
    
    @RequestMapping("/mdSequences/addMdSequences.do")
    public String addMdSequences(
            MdSequencesVO mdSequencesVO,
            @ModelAttribute("searchVO") MdSequencesDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdSequencesService.insertMdSequences(mdSequencesVO);
        status.setComplete();
        return "forward:/mdSequences/MdSequencesList.do";
    }
    
    @RequestMapping("/mdSequences/updateMdSequencesView.do")
    public String updateMdSequencesView(
            @RequestParam("id") String id ,
            @ModelAttribute("searchVO") MdSequencesDefaultVO searchVO, Model model)
            throws Exception {
        MdSequencesVO mdSequencesVO = new MdSequencesVO();
        mdSequencesVO.setId(id);
;        
        // 변수명은 CoC 에 따라 mdSequencesVO
        model.addAttribute(selectMdSequences(mdSequencesVO, searchVO));
        return "/mdSequences/MdSequencesRegister";
    }

    @RequestMapping("/mdSequences/selectMdSequences.do")
    public @ModelAttribute("mdSequencesVO")
    MdSequencesVO selectMdSequences(
            MdSequencesVO mdSequencesVO,
            @ModelAttribute("searchVO") MdSequencesDefaultVO searchVO) throws Exception {
        return mdSequencesService.selectMdSequences(mdSequencesVO);
    }

    @RequestMapping("/mdSequences/updateMdSequences.do")
    public String updateMdSequences(
            MdSequencesVO mdSequencesVO,
            @ModelAttribute("searchVO") MdSequencesDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdSequencesService.updateMdSequences(mdSequencesVO);
        status.setComplete();
        return "forward:/mdSequences/MdSequencesList.do";
    }
    
    @RequestMapping("/mdSequences/deleteMdSequences.do")
    public String deleteMdSequences(
            MdSequencesVO mdSequencesVO,
            @ModelAttribute("searchVO") MdSequencesDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdSequencesService.deleteMdSequences(mdSequencesVO);
        status.setComplete();
        return "forward:/mdSequences/MdSequencesList.do";
    }

}
