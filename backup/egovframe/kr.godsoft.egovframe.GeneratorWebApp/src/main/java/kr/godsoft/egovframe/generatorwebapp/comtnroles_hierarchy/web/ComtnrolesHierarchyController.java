package kr.godsoft.egovframe.generatorwebapp.comtnroles_hierarchy.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnroles_hierarchy.service.ComtnrolesHierarchyService;
import kr.godsoft.egovframe.generatorwebapp.comtnroles_hierarchy.service.ComtnrolesHierarchyDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnroles_hierarchy.service.ComtnrolesHierarchyVO;

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
 * @Class Name : ComtnrolesHierarchyController.java
 * @Description : ComtnrolesHierarchy Controller class
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
public class ComtnrolesHierarchyController {

    @Resource(name = "comtnrolesHierarchyService")
    private ComtnrolesHierarchyService comtnrolesHierarchyService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNROLES_HIERARCHY 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnrolesHierarchyVO
	 * @return "/comtnrolesHierarchy/ComtnrolesHierarchyList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnrolesHierarchy/ComtnrolesHierarchyList.do")
    public String selectComtnrolesHierarchyList(@ModelAttribute("searchVO") ComtnrolesHierarchyVO searchVO, 
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
		
        List<EgovMap> comtnrolesHierarchyList = comtnrolesHierarchyService.selectComtnrolesHierarchyList(searchVO);
        model.addAttribute("resultList", comtnrolesHierarchyList);
        
        int totCnt = comtnrolesHierarchyService.selectComtnrolesHierarchyListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnrolesHierarchy/ComtnrolesHierarchyList";
    } 
    
    @RequestMapping("/comtnrolesHierarchy/addComtnrolesHierarchyView.do")
    public String addComtnrolesHierarchyView(
            @ModelAttribute("searchVO") ComtnrolesHierarchyDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnrolesHierarchyVO", new ComtnrolesHierarchyVO());
        return "/comtnrolesHierarchy/ComtnrolesHierarchyRegister";
    }
    
    @RequestMapping("/comtnrolesHierarchy/addComtnrolesHierarchy.do")
    public String addComtnrolesHierarchy(
            ComtnrolesHierarchyVO comtnrolesHierarchyVO,
            @ModelAttribute("searchVO") ComtnrolesHierarchyDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnrolesHierarchyService.insertComtnrolesHierarchy(comtnrolesHierarchyVO);
        status.setComplete();
        return "forward:/comtnrolesHierarchy/ComtnrolesHierarchyList.do";
    }
    
    @RequestMapping("/comtnrolesHierarchy/updateComtnrolesHierarchyView.do")
    public String updateComtnrolesHierarchyView(
            @RequestParam("parntsRole") String parntsRole ,
            @RequestParam("chldrnRole") String chldrnRole ,
            @ModelAttribute("searchVO") ComtnrolesHierarchyDefaultVO searchVO, Model model)
            throws Exception {
        ComtnrolesHierarchyVO comtnrolesHierarchyVO = new ComtnrolesHierarchyVO();
        comtnrolesHierarchyVO.setParntsRole(parntsRole);
        comtnrolesHierarchyVO.setChldrnRole(chldrnRole);
;        
        // 변수명은 CoC 에 따라 comtnrolesHierarchyVO
        model.addAttribute(selectComtnrolesHierarchy(comtnrolesHierarchyVO, searchVO));
        return "/comtnrolesHierarchy/ComtnrolesHierarchyRegister";
    }

    @RequestMapping("/comtnrolesHierarchy/selectComtnrolesHierarchy.do")
    public @ModelAttribute("comtnrolesHierarchyVO")
    ComtnrolesHierarchyVO selectComtnrolesHierarchy(
            ComtnrolesHierarchyVO comtnrolesHierarchyVO,
            @ModelAttribute("searchVO") ComtnrolesHierarchyDefaultVO searchVO) throws Exception {
        return comtnrolesHierarchyService.selectComtnrolesHierarchy(comtnrolesHierarchyVO);
    }

    @RequestMapping("/comtnrolesHierarchy/updateComtnrolesHierarchy.do")
    public String updateComtnrolesHierarchy(
            ComtnrolesHierarchyVO comtnrolesHierarchyVO,
            @ModelAttribute("searchVO") ComtnrolesHierarchyDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnrolesHierarchyService.updateComtnrolesHierarchy(comtnrolesHierarchyVO);
        status.setComplete();
        return "forward:/comtnrolesHierarchy/ComtnrolesHierarchyList.do";
    }
    
    @RequestMapping("/comtnrolesHierarchy/deleteComtnrolesHierarchy.do")
    public String deleteComtnrolesHierarchy(
            ComtnrolesHierarchyVO comtnrolesHierarchyVO,
            @ModelAttribute("searchVO") ComtnrolesHierarchyDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnrolesHierarchyService.deleteComtnrolesHierarchy(comtnrolesHierarchyVO);
        status.setComplete();
        return "forward:/comtnrolesHierarchy/ComtnrolesHierarchyList.do";
    }

}
