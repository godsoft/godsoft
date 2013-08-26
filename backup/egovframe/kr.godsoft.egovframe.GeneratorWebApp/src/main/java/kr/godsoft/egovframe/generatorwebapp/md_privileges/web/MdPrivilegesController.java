package kr.godsoft.egovframe.generatorwebapp.md_privileges.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_privileges.service.MdPrivilegesService;
import kr.godsoft.egovframe.generatorwebapp.md_privileges.service.MdPrivilegesDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.md_privileges.service.MdPrivilegesVO;

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
 * @Class Name : MdPrivilegesController.java
 * @Description : MdPrivileges Controller class
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
public class MdPrivilegesController {

    @Resource(name = "mdPrivilegesService")
    private MdPrivilegesService mdPrivilegesService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MD_PRIVILEGES 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MdPrivilegesVO
	 * @return "/mdPrivileges/MdPrivilegesList"
	 * @exception Exception
	 */
    @RequestMapping(value="/mdPrivileges/MdPrivilegesList.do")
    public String selectMdPrivilegesList(@ModelAttribute("searchVO") MdPrivilegesVO searchVO, 
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
		
        List<EgovMap> mdPrivilegesList = mdPrivilegesService.selectMdPrivilegesList(searchVO);
        model.addAttribute("resultList", mdPrivilegesList);
        
        int totCnt = mdPrivilegesService.selectMdPrivilegesListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/mdPrivileges/MdPrivilegesList";
    } 
    
    @RequestMapping("/mdPrivileges/addMdPrivilegesView.do")
    public String addMdPrivilegesView(
            @ModelAttribute("searchVO") MdPrivilegesDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("mdPrivilegesVO", new MdPrivilegesVO());
        return "/mdPrivileges/MdPrivilegesRegister";
    }
    
    @RequestMapping("/mdPrivileges/addMdPrivileges.do")
    public String addMdPrivileges(
            MdPrivilegesVO mdPrivilegesVO,
            @ModelAttribute("searchVO") MdPrivilegesDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdPrivilegesService.insertMdPrivileges(mdPrivilegesVO);
        status.setComplete();
        return "forward:/mdPrivileges/MdPrivilegesList.do";
    }
    
    @RequestMapping("/mdPrivileges/updateMdPrivilegesView.do")
    public String updateMdPrivilegesView(
            @RequestParam("id") String id ,
            @ModelAttribute("searchVO") MdPrivilegesDefaultVO searchVO, Model model)
            throws Exception {
        MdPrivilegesVO mdPrivilegesVO = new MdPrivilegesVO();
        mdPrivilegesVO.setId(id);
;        
        // 변수명은 CoC 에 따라 mdPrivilegesVO
        model.addAttribute(selectMdPrivileges(mdPrivilegesVO, searchVO));
        return "/mdPrivileges/MdPrivilegesRegister";
    }

    @RequestMapping("/mdPrivileges/selectMdPrivileges.do")
    public @ModelAttribute("mdPrivilegesVO")
    MdPrivilegesVO selectMdPrivileges(
            MdPrivilegesVO mdPrivilegesVO,
            @ModelAttribute("searchVO") MdPrivilegesDefaultVO searchVO) throws Exception {
        return mdPrivilegesService.selectMdPrivileges(mdPrivilegesVO);
    }

    @RequestMapping("/mdPrivileges/updateMdPrivileges.do")
    public String updateMdPrivileges(
            MdPrivilegesVO mdPrivilegesVO,
            @ModelAttribute("searchVO") MdPrivilegesDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdPrivilegesService.updateMdPrivileges(mdPrivilegesVO);
        status.setComplete();
        return "forward:/mdPrivileges/MdPrivilegesList.do";
    }
    
    @RequestMapping("/mdPrivileges/deleteMdPrivileges.do")
    public String deleteMdPrivileges(
            MdPrivilegesVO mdPrivilegesVO,
            @ModelAttribute("searchVO") MdPrivilegesDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdPrivilegesService.deleteMdPrivileges(mdPrivilegesVO);
        status.setComplete();
        return "forward:/mdPrivileges/MdPrivilegesList.do";
    }

}
