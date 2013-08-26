package kr.godsoft.egovframe.generatorwebapp.md_group_members.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_group_members.service.MdGroupMembersService;
import kr.godsoft.egovframe.generatorwebapp.md_group_members.service.MdGroupMembersDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.md_group_members.service.MdGroupMembersVO;

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
 * @Class Name : MdGroupMembersController.java
 * @Description : MdGroupMembers Controller class
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
public class MdGroupMembersController {

    @Resource(name = "mdGroupMembersService")
    private MdGroupMembersService mdGroupMembersService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MD_GROUP_MEMBERS 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MdGroupMembersVO
	 * @return "/mdGroupMembers/MdGroupMembersList"
	 * @exception Exception
	 */
    @RequestMapping(value="/mdGroupMembers/MdGroupMembersList.do")
    public String selectMdGroupMembersList(@ModelAttribute("searchVO") MdGroupMembersVO searchVO, 
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
		
        List<EgovMap> mdGroupMembersList = mdGroupMembersService.selectMdGroupMembersList(searchVO);
        model.addAttribute("resultList", mdGroupMembersList);
        
        int totCnt = mdGroupMembersService.selectMdGroupMembersListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/mdGroupMembers/MdGroupMembersList";
    } 
    
    @RequestMapping("/mdGroupMembers/addMdGroupMembersView.do")
    public String addMdGroupMembersView(
            @ModelAttribute("searchVO") MdGroupMembersDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("mdGroupMembersVO", new MdGroupMembersVO());
        return "/mdGroupMembers/MdGroupMembersRegister";
    }
    
    @RequestMapping("/mdGroupMembers/addMdGroupMembers.do")
    public String addMdGroupMembers(
            MdGroupMembersVO mdGroupMembersVO,
            @ModelAttribute("searchVO") MdGroupMembersDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdGroupMembersService.insertMdGroupMembers(mdGroupMembersVO);
        status.setComplete();
        return "forward:/mdGroupMembers/MdGroupMembersList.do";
    }
    
    @RequestMapping("/mdGroupMembers/updateMdGroupMembersView.do")
    public String updateMdGroupMembersView(
            @RequestParam("id") String id ,
            @ModelAttribute("searchVO") MdGroupMembersDefaultVO searchVO, Model model)
            throws Exception {
        MdGroupMembersVO mdGroupMembersVO = new MdGroupMembersVO();
        mdGroupMembersVO.setId(id);
;        
        // 변수명은 CoC 에 따라 mdGroupMembersVO
        model.addAttribute(selectMdGroupMembers(mdGroupMembersVO, searchVO));
        return "/mdGroupMembers/MdGroupMembersRegister";
    }

    @RequestMapping("/mdGroupMembers/selectMdGroupMembers.do")
    public @ModelAttribute("mdGroupMembersVO")
    MdGroupMembersVO selectMdGroupMembers(
            MdGroupMembersVO mdGroupMembersVO,
            @ModelAttribute("searchVO") MdGroupMembersDefaultVO searchVO) throws Exception {
        return mdGroupMembersService.selectMdGroupMembers(mdGroupMembersVO);
    }

    @RequestMapping("/mdGroupMembers/updateMdGroupMembers.do")
    public String updateMdGroupMembers(
            MdGroupMembersVO mdGroupMembersVO,
            @ModelAttribute("searchVO") MdGroupMembersDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdGroupMembersService.updateMdGroupMembers(mdGroupMembersVO);
        status.setComplete();
        return "forward:/mdGroupMembers/MdGroupMembersList.do";
    }
    
    @RequestMapping("/mdGroupMembers/deleteMdGroupMembers.do")
    public String deleteMdGroupMembers(
            MdGroupMembersVO mdGroupMembersVO,
            @ModelAttribute("searchVO") MdGroupMembersDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdGroupMembersService.deleteMdGroupMembers(mdGroupMembersVO);
        status.setComplete();
        return "forward:/mdGroupMembers/MdGroupMembersList.do";
    }

}
