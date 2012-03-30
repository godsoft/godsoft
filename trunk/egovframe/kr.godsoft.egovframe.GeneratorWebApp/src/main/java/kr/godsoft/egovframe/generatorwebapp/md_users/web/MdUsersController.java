package kr.godsoft.egovframe.generatorwebapp.md_users.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_users.service.MdUsersService;
import kr.godsoft.egovframe.generatorwebapp.md_users.service.MdUsersDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.md_users.service.MdUsersVO;

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
 * @Class Name : MdUsersController.java
 * @Description : MdUsers Controller class
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
public class MdUsersController {

    @Resource(name = "mdUsersService")
    private MdUsersService mdUsersService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MD_USERS 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MdUsersVO
	 * @return "/mdUsers/MdUsersList"
	 * @exception Exception
	 */
    @RequestMapping(value="/mdUsers/MdUsersList.do")
    public String selectMdUsersList(@ModelAttribute("searchVO") MdUsersVO searchVO, 
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
		
        List<EgovMap> mdUsersList = mdUsersService.selectMdUsersList(searchVO);
        model.addAttribute("resultList", mdUsersList);
        
        int totCnt = mdUsersService.selectMdUsersListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/mdUsers/MdUsersList";
    } 
    
    @RequestMapping("/mdUsers/addMdUsersView.do")
    public String addMdUsersView(
            @ModelAttribute("searchVO") MdUsersDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("mdUsersVO", new MdUsersVO());
        return "/mdUsers/MdUsersRegister";
    }
    
    @RequestMapping("/mdUsers/addMdUsers.do")
    public String addMdUsers(
            MdUsersVO mdUsersVO,
            @ModelAttribute("searchVO") MdUsersDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdUsersService.insertMdUsers(mdUsersVO);
        status.setComplete();
        return "forward:/mdUsers/MdUsersList.do";
    }
    
    @RequestMapping("/mdUsers/updateMdUsersView.do")
    public String updateMdUsersView(
            @RequestParam("id") String id ,
            @ModelAttribute("searchVO") MdUsersDefaultVO searchVO, Model model)
            throws Exception {
        MdUsersVO mdUsersVO = new MdUsersVO();
        mdUsersVO.setId(id);
;        
        // 변수명은 CoC 에 따라 mdUsersVO
        model.addAttribute(selectMdUsers(mdUsersVO, searchVO));
        return "/mdUsers/MdUsersRegister";
    }

    @RequestMapping("/mdUsers/selectMdUsers.do")
    public @ModelAttribute("mdUsersVO")
    MdUsersVO selectMdUsers(
            MdUsersVO mdUsersVO,
            @ModelAttribute("searchVO") MdUsersDefaultVO searchVO) throws Exception {
        return mdUsersService.selectMdUsers(mdUsersVO);
    }

    @RequestMapping("/mdUsers/updateMdUsers.do")
    public String updateMdUsers(
            MdUsersVO mdUsersVO,
            @ModelAttribute("searchVO") MdUsersDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdUsersService.updateMdUsers(mdUsersVO);
        status.setComplete();
        return "forward:/mdUsers/MdUsersList.do";
    }
    
    @RequestMapping("/mdUsers/deleteMdUsers.do")
    public String deleteMdUsers(
            MdUsersVO mdUsersVO,
            @ModelAttribute("searchVO") MdUsersDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdUsersService.deleteMdUsers(mdUsersVO);
        status.setComplete();
        return "forward:/mdUsers/MdUsersList.do";
    }

}
