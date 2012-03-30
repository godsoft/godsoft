package kr.godsoft.egovframe.generatorwebapp.md_groups.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_groups.service.MdGroupsService;
import kr.godsoft.egovframe.generatorwebapp.md_groups.service.MdGroupsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.md_groups.service.MdGroupsVO;

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
 * @Class Name : MdGroupsController.java
 * @Description : MdGroups Controller class
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
public class MdGroupsController {

    @Resource(name = "mdGroupsService")
    private MdGroupsService mdGroupsService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MD_GROUPS 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MdGroupsVO
	 * @return "/mdGroups/MdGroupsList"
	 * @exception Exception
	 */
    @RequestMapping(value="/mdGroups/MdGroupsList.do")
    public String selectMdGroupsList(@ModelAttribute("searchVO") MdGroupsVO searchVO, 
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
		
        List<EgovMap> mdGroupsList = mdGroupsService.selectMdGroupsList(searchVO);
        model.addAttribute("resultList", mdGroupsList);
        
        int totCnt = mdGroupsService.selectMdGroupsListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/mdGroups/MdGroupsList";
    } 
    
    @RequestMapping("/mdGroups/addMdGroupsView.do")
    public String addMdGroupsView(
            @ModelAttribute("searchVO") MdGroupsDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("mdGroupsVO", new MdGroupsVO());
        return "/mdGroups/MdGroupsRegister";
    }
    
    @RequestMapping("/mdGroups/addMdGroups.do")
    public String addMdGroups(
            MdGroupsVO mdGroupsVO,
            @ModelAttribute("searchVO") MdGroupsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdGroupsService.insertMdGroups(mdGroupsVO);
        status.setComplete();
        return "forward:/mdGroups/MdGroupsList.do";
    }
    
    @RequestMapping("/mdGroups/updateMdGroupsView.do")
    public String updateMdGroupsView(
            @RequestParam("id") String id ,
            @ModelAttribute("searchVO") MdGroupsDefaultVO searchVO, Model model)
            throws Exception {
        MdGroupsVO mdGroupsVO = new MdGroupsVO();
        mdGroupsVO.setId(id);
;        
        // 변수명은 CoC 에 따라 mdGroupsVO
        model.addAttribute(selectMdGroups(mdGroupsVO, searchVO));
        return "/mdGroups/MdGroupsRegister";
    }

    @RequestMapping("/mdGroups/selectMdGroups.do")
    public @ModelAttribute("mdGroupsVO")
    MdGroupsVO selectMdGroups(
            MdGroupsVO mdGroupsVO,
            @ModelAttribute("searchVO") MdGroupsDefaultVO searchVO) throws Exception {
        return mdGroupsService.selectMdGroups(mdGroupsVO);
    }

    @RequestMapping("/mdGroups/updateMdGroups.do")
    public String updateMdGroups(
            MdGroupsVO mdGroupsVO,
            @ModelAttribute("searchVO") MdGroupsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdGroupsService.updateMdGroups(mdGroupsVO);
        status.setComplete();
        return "forward:/mdGroups/MdGroupsList.do";
    }
    
    @RequestMapping("/mdGroups/deleteMdGroups.do")
    public String deleteMdGroups(
            MdGroupsVO mdGroupsVO,
            @ModelAttribute("searchVO") MdGroupsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdGroupsService.deleteMdGroups(mdGroupsVO);
        status.setComplete();
        return "forward:/mdGroups/MdGroupsList.do";
    }

}
