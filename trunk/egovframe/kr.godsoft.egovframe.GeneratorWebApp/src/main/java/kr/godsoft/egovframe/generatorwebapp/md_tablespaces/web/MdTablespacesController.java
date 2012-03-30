package kr.godsoft.egovframe.generatorwebapp.md_tablespaces.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_tablespaces.service.MdTablespacesService;
import kr.godsoft.egovframe.generatorwebapp.md_tablespaces.service.MdTablespacesDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.md_tablespaces.service.MdTablespacesVO;

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
 * @Class Name : MdTablespacesController.java
 * @Description : MdTablespaces Controller class
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
public class MdTablespacesController {

    @Resource(name = "mdTablespacesService")
    private MdTablespacesService mdTablespacesService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MD_TABLESPACES 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MdTablespacesVO
	 * @return "/mdTablespaces/MdTablespacesList"
	 * @exception Exception
	 */
    @RequestMapping(value="/mdTablespaces/MdTablespacesList.do")
    public String selectMdTablespacesList(@ModelAttribute("searchVO") MdTablespacesVO searchVO, 
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
		
        List<EgovMap> mdTablespacesList = mdTablespacesService.selectMdTablespacesList(searchVO);
        model.addAttribute("resultList", mdTablespacesList);
        
        int totCnt = mdTablespacesService.selectMdTablespacesListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/mdTablespaces/MdTablespacesList";
    } 
    
    @RequestMapping("/mdTablespaces/addMdTablespacesView.do")
    public String addMdTablespacesView(
            @ModelAttribute("searchVO") MdTablespacesDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("mdTablespacesVO", new MdTablespacesVO());
        return "/mdTablespaces/MdTablespacesRegister";
    }
    
    @RequestMapping("/mdTablespaces/addMdTablespaces.do")
    public String addMdTablespaces(
            MdTablespacesVO mdTablespacesVO,
            @ModelAttribute("searchVO") MdTablespacesDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdTablespacesService.insertMdTablespaces(mdTablespacesVO);
        status.setComplete();
        return "forward:/mdTablespaces/MdTablespacesList.do";
    }
    
    @RequestMapping("/mdTablespaces/updateMdTablespacesView.do")
    public String updateMdTablespacesView(
            @RequestParam("id") String id ,
            @ModelAttribute("searchVO") MdTablespacesDefaultVO searchVO, Model model)
            throws Exception {
        MdTablespacesVO mdTablespacesVO = new MdTablespacesVO();
        mdTablespacesVO.setId(id);
;        
        // 변수명은 CoC 에 따라 mdTablespacesVO
        model.addAttribute(selectMdTablespaces(mdTablespacesVO, searchVO));
        return "/mdTablespaces/MdTablespacesRegister";
    }

    @RequestMapping("/mdTablespaces/selectMdTablespaces.do")
    public @ModelAttribute("mdTablespacesVO")
    MdTablespacesVO selectMdTablespaces(
            MdTablespacesVO mdTablespacesVO,
            @ModelAttribute("searchVO") MdTablespacesDefaultVO searchVO) throws Exception {
        return mdTablespacesService.selectMdTablespaces(mdTablespacesVO);
    }

    @RequestMapping("/mdTablespaces/updateMdTablespaces.do")
    public String updateMdTablespaces(
            MdTablespacesVO mdTablespacesVO,
            @ModelAttribute("searchVO") MdTablespacesDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdTablespacesService.updateMdTablespaces(mdTablespacesVO);
        status.setComplete();
        return "forward:/mdTablespaces/MdTablespacesList.do";
    }
    
    @RequestMapping("/mdTablespaces/deleteMdTablespaces.do")
    public String deleteMdTablespaces(
            MdTablespacesVO mdTablespacesVO,
            @ModelAttribute("searchVO") MdTablespacesDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdTablespacesService.deleteMdTablespaces(mdTablespacesVO);
        status.setComplete();
        return "forward:/mdTablespaces/MdTablespacesList.do";
    }

}
