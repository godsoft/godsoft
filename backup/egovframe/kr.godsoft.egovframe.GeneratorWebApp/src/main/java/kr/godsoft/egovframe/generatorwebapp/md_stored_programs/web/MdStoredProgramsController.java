package kr.godsoft.egovframe.generatorwebapp.md_stored_programs.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_stored_programs.service.MdStoredProgramsService;
import kr.godsoft.egovframe.generatorwebapp.md_stored_programs.service.MdStoredProgramsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.md_stored_programs.service.MdStoredProgramsVO;

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
 * @Class Name : MdStoredProgramsController.java
 * @Description : MdStoredPrograms Controller class
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
public class MdStoredProgramsController {

    @Resource(name = "mdStoredProgramsService")
    private MdStoredProgramsService mdStoredProgramsService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MD_STORED_PROGRAMS 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MdStoredProgramsVO
	 * @return "/mdStoredPrograms/MdStoredProgramsList"
	 * @exception Exception
	 */
    @RequestMapping(value="/mdStoredPrograms/MdStoredProgramsList.do")
    public String selectMdStoredProgramsList(@ModelAttribute("searchVO") MdStoredProgramsVO searchVO, 
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
		
        List<EgovMap> mdStoredProgramsList = mdStoredProgramsService.selectMdStoredProgramsList(searchVO);
        model.addAttribute("resultList", mdStoredProgramsList);
        
        int totCnt = mdStoredProgramsService.selectMdStoredProgramsListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/mdStoredPrograms/MdStoredProgramsList";
    } 
    
    @RequestMapping("/mdStoredPrograms/addMdStoredProgramsView.do")
    public String addMdStoredProgramsView(
            @ModelAttribute("searchVO") MdStoredProgramsDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("mdStoredProgramsVO", new MdStoredProgramsVO());
        return "/mdStoredPrograms/MdStoredProgramsRegister";
    }
    
    @RequestMapping("/mdStoredPrograms/addMdStoredPrograms.do")
    public String addMdStoredPrograms(
            MdStoredProgramsVO mdStoredProgramsVO,
            @ModelAttribute("searchVO") MdStoredProgramsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdStoredProgramsService.insertMdStoredPrograms(mdStoredProgramsVO);
        status.setComplete();
        return "forward:/mdStoredPrograms/MdStoredProgramsList.do";
    }
    
    @RequestMapping("/mdStoredPrograms/updateMdStoredProgramsView.do")
    public String updateMdStoredProgramsView(
            @ModelAttribute("searchVO") MdStoredProgramsDefaultVO searchVO, Model model)
            throws Exception {
        MdStoredProgramsVO mdStoredProgramsVO = new MdStoredProgramsVO();
;        
        // 변수명은 CoC 에 따라 mdStoredProgramsVO
        model.addAttribute(selectMdStoredPrograms(mdStoredProgramsVO, searchVO));
        return "/mdStoredPrograms/MdStoredProgramsRegister";
    }

    @RequestMapping("/mdStoredPrograms/selectMdStoredPrograms.do")
    public @ModelAttribute("mdStoredProgramsVO")
    MdStoredProgramsVO selectMdStoredPrograms(
            MdStoredProgramsVO mdStoredProgramsVO,
            @ModelAttribute("searchVO") MdStoredProgramsDefaultVO searchVO) throws Exception {
        return mdStoredProgramsService.selectMdStoredPrograms(mdStoredProgramsVO);
    }

    @RequestMapping("/mdStoredPrograms/updateMdStoredPrograms.do")
    public String updateMdStoredPrograms(
            MdStoredProgramsVO mdStoredProgramsVO,
            @ModelAttribute("searchVO") MdStoredProgramsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdStoredProgramsService.updateMdStoredPrograms(mdStoredProgramsVO);
        status.setComplete();
        return "forward:/mdStoredPrograms/MdStoredProgramsList.do";
    }
    
    @RequestMapping("/mdStoredPrograms/deleteMdStoredPrograms.do")
    public String deleteMdStoredPrograms(
            MdStoredProgramsVO mdStoredProgramsVO,
            @ModelAttribute("searchVO") MdStoredProgramsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdStoredProgramsService.deleteMdStoredPrograms(mdStoredProgramsVO);
        status.setComplete();
        return "forward:/mdStoredPrograms/MdStoredProgramsList.do";
    }

}
