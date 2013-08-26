package kr.godsoft.egovframe.generatorwebapp.md_projects.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_projects.service.MdProjectsService;
import kr.godsoft.egovframe.generatorwebapp.md_projects.service.MdProjectsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.md_projects.service.MdProjectsVO;

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
 * @Class Name : MdProjectsController.java
 * @Description : MdProjects Controller class
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
public class MdProjectsController {

    @Resource(name = "mdProjectsService")
    private MdProjectsService mdProjectsService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MD_PROJECTS 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MdProjectsVO
	 * @return "/mdProjects/MdProjectsList"
	 * @exception Exception
	 */
    @RequestMapping(value="/mdProjects/MdProjectsList.do")
    public String selectMdProjectsList(@ModelAttribute("searchVO") MdProjectsVO searchVO, 
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
		
        List<EgovMap> mdProjectsList = mdProjectsService.selectMdProjectsList(searchVO);
        model.addAttribute("resultList", mdProjectsList);
        
        int totCnt = mdProjectsService.selectMdProjectsListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/mdProjects/MdProjectsList";
    } 
    
    @RequestMapping("/mdProjects/addMdProjectsView.do")
    public String addMdProjectsView(
            @ModelAttribute("searchVO") MdProjectsDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("mdProjectsVO", new MdProjectsVO());
        return "/mdProjects/MdProjectsRegister";
    }
    
    @RequestMapping("/mdProjects/addMdProjects.do")
    public String addMdProjects(
            MdProjectsVO mdProjectsVO,
            @ModelAttribute("searchVO") MdProjectsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdProjectsService.insertMdProjects(mdProjectsVO);
        status.setComplete();
        return "forward:/mdProjects/MdProjectsList.do";
    }
    
    @RequestMapping("/mdProjects/updateMdProjectsView.do")
    public String updateMdProjectsView(
            @RequestParam("id") String id ,
            @ModelAttribute("searchVO") MdProjectsDefaultVO searchVO, Model model)
            throws Exception {
        MdProjectsVO mdProjectsVO = new MdProjectsVO();
        mdProjectsVO.setId(id);
;        
        // 변수명은 CoC 에 따라 mdProjectsVO
        model.addAttribute(selectMdProjects(mdProjectsVO, searchVO));
        return "/mdProjects/MdProjectsRegister";
    }

    @RequestMapping("/mdProjects/selectMdProjects.do")
    public @ModelAttribute("mdProjectsVO")
    MdProjectsVO selectMdProjects(
            MdProjectsVO mdProjectsVO,
            @ModelAttribute("searchVO") MdProjectsDefaultVO searchVO) throws Exception {
        return mdProjectsService.selectMdProjects(mdProjectsVO);
    }

    @RequestMapping("/mdProjects/updateMdProjects.do")
    public String updateMdProjects(
            MdProjectsVO mdProjectsVO,
            @ModelAttribute("searchVO") MdProjectsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdProjectsService.updateMdProjects(mdProjectsVO);
        status.setComplete();
        return "forward:/mdProjects/MdProjectsList.do";
    }
    
    @RequestMapping("/mdProjects/deleteMdProjects.do")
    public String deleteMdProjects(
            MdProjectsVO mdProjectsVO,
            @ModelAttribute("searchVO") MdProjectsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdProjectsService.deleteMdProjects(mdProjectsVO);
        status.setComplete();
        return "forward:/mdProjects/MdProjectsList.do";
    }

}
