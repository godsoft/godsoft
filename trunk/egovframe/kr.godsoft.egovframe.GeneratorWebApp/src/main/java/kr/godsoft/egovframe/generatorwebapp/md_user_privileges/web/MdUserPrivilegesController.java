package kr.godsoft.egovframe.generatorwebapp.md_user_privileges.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_user_privileges.service.MdUserPrivilegesService;
import kr.godsoft.egovframe.generatorwebapp.md_user_privileges.service.MdUserPrivilegesDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.md_user_privileges.service.MdUserPrivilegesVO;

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
 * @Class Name : MdUserPrivilegesController.java
 * @Description : MdUserPrivileges Controller class
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
public class MdUserPrivilegesController {

    @Resource(name = "mdUserPrivilegesService")
    private MdUserPrivilegesService mdUserPrivilegesService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MD_USER_PRIVILEGES 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MdUserPrivilegesVO
	 * @return "/mdUserPrivileges/MdUserPrivilegesList"
	 * @exception Exception
	 */
    @RequestMapping(value="/mdUserPrivileges/MdUserPrivilegesList.do")
    public String selectMdUserPrivilegesList(@ModelAttribute("searchVO") MdUserPrivilegesVO searchVO, 
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
		
        List<EgovMap> mdUserPrivilegesList = mdUserPrivilegesService.selectMdUserPrivilegesList(searchVO);
        model.addAttribute("resultList", mdUserPrivilegesList);
        
        int totCnt = mdUserPrivilegesService.selectMdUserPrivilegesListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/mdUserPrivileges/MdUserPrivilegesList";
    } 
    
    @RequestMapping("/mdUserPrivileges/addMdUserPrivilegesView.do")
    public String addMdUserPrivilegesView(
            @ModelAttribute("searchVO") MdUserPrivilegesDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("mdUserPrivilegesVO", new MdUserPrivilegesVO());
        return "/mdUserPrivileges/MdUserPrivilegesRegister";
    }
    
    @RequestMapping("/mdUserPrivileges/addMdUserPrivileges.do")
    public String addMdUserPrivileges(
            MdUserPrivilegesVO mdUserPrivilegesVO,
            @ModelAttribute("searchVO") MdUserPrivilegesDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdUserPrivilegesService.insertMdUserPrivileges(mdUserPrivilegesVO);
        status.setComplete();
        return "forward:/mdUserPrivileges/MdUserPrivilegesList.do";
    }
    
    @RequestMapping("/mdUserPrivileges/updateMdUserPrivilegesView.do")
    public String updateMdUserPrivilegesView(
            @RequestParam("id") String id ,
            @ModelAttribute("searchVO") MdUserPrivilegesDefaultVO searchVO, Model model)
            throws Exception {
        MdUserPrivilegesVO mdUserPrivilegesVO = new MdUserPrivilegesVO();
        mdUserPrivilegesVO.setId(id);
;        
        // 변수명은 CoC 에 따라 mdUserPrivilegesVO
        model.addAttribute(selectMdUserPrivileges(mdUserPrivilegesVO, searchVO));
        return "/mdUserPrivileges/MdUserPrivilegesRegister";
    }

    @RequestMapping("/mdUserPrivileges/selectMdUserPrivileges.do")
    public @ModelAttribute("mdUserPrivilegesVO")
    MdUserPrivilegesVO selectMdUserPrivileges(
            MdUserPrivilegesVO mdUserPrivilegesVO,
            @ModelAttribute("searchVO") MdUserPrivilegesDefaultVO searchVO) throws Exception {
        return mdUserPrivilegesService.selectMdUserPrivileges(mdUserPrivilegesVO);
    }

    @RequestMapping("/mdUserPrivileges/updateMdUserPrivileges.do")
    public String updateMdUserPrivileges(
            MdUserPrivilegesVO mdUserPrivilegesVO,
            @ModelAttribute("searchVO") MdUserPrivilegesDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdUserPrivilegesService.updateMdUserPrivileges(mdUserPrivilegesVO);
        status.setComplete();
        return "forward:/mdUserPrivileges/MdUserPrivilegesList.do";
    }
    
    @RequestMapping("/mdUserPrivileges/deleteMdUserPrivileges.do")
    public String deleteMdUserPrivileges(
            MdUserPrivilegesVO mdUserPrivilegesVO,
            @ModelAttribute("searchVO") MdUserPrivilegesDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdUserPrivilegesService.deleteMdUserPrivileges(mdUserPrivilegesVO);
        status.setComplete();
        return "forward:/mdUserPrivileges/MdUserPrivilegesList.do";
    }

}
