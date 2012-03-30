package kr.godsoft.egovframe.generatorwebapp.mgv_all_views.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.mgv_all_views.service.MgvAllViewsService;
import kr.godsoft.egovframe.generatorwebapp.mgv_all_views.service.MgvAllViewsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.mgv_all_views.service.MgvAllViewsVO;

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
 * @Class Name : MgvAllViewsController.java
 * @Description : MgvAllViews Controller class
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
public class MgvAllViewsController {

    @Resource(name = "mgvAllViewsService")
    private MgvAllViewsService mgvAllViewsService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MGV_ALL_VIEWS 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MgvAllViewsVO
	 * @return "/mgvAllViews/MgvAllViewsList"
	 * @exception Exception
	 */
    @RequestMapping(value="/mgvAllViews/MgvAllViewsList.do")
    public String selectMgvAllViewsList(@ModelAttribute("searchVO") MgvAllViewsVO searchVO, 
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
		
        List<EgovMap> mgvAllViewsList = mgvAllViewsService.selectMgvAllViewsList(searchVO);
        model.addAttribute("resultList", mgvAllViewsList);
        
        int totCnt = mgvAllViewsService.selectMgvAllViewsListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/mgvAllViews/MgvAllViewsList";
    } 
    
    @RequestMapping("/mgvAllViews/addMgvAllViewsView.do")
    public String addMgvAllViewsView(
            @ModelAttribute("searchVO") MgvAllViewsDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("mgvAllViewsVO", new MgvAllViewsVO());
        return "/mgvAllViews/MgvAllViewsRegister";
    }
    
    @RequestMapping("/mgvAllViews/addMgvAllViews.do")
    public String addMgvAllViews(
            MgvAllViewsVO mgvAllViewsVO,
            @ModelAttribute("searchVO") MgvAllViewsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mgvAllViewsService.insertMgvAllViews(mgvAllViewsVO);
        status.setComplete();
        return "forward:/mgvAllViews/MgvAllViewsList.do";
    }
    
    @RequestMapping("/mgvAllViews/updateMgvAllViewsView.do")
    public String updateMgvAllViewsView(
            @ModelAttribute("searchVO") MgvAllViewsDefaultVO searchVO, Model model)
            throws Exception {
        MgvAllViewsVO mgvAllViewsVO = new MgvAllViewsVO();
;        
        // 변수명은 CoC 에 따라 mgvAllViewsVO
        model.addAttribute(selectMgvAllViews(mgvAllViewsVO, searchVO));
        return "/mgvAllViews/MgvAllViewsRegister";
    }

    @RequestMapping("/mgvAllViews/selectMgvAllViews.do")
    public @ModelAttribute("mgvAllViewsVO")
    MgvAllViewsVO selectMgvAllViews(
            MgvAllViewsVO mgvAllViewsVO,
            @ModelAttribute("searchVO") MgvAllViewsDefaultVO searchVO) throws Exception {
        return mgvAllViewsService.selectMgvAllViews(mgvAllViewsVO);
    }

    @RequestMapping("/mgvAllViews/updateMgvAllViews.do")
    public String updateMgvAllViews(
            MgvAllViewsVO mgvAllViewsVO,
            @ModelAttribute("searchVO") MgvAllViewsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mgvAllViewsService.updateMgvAllViews(mgvAllViewsVO);
        status.setComplete();
        return "forward:/mgvAllViews/MgvAllViewsList.do";
    }
    
    @RequestMapping("/mgvAllViews/deleteMgvAllViews.do")
    public String deleteMgvAllViews(
            MgvAllViewsVO mgvAllViewsVO,
            @ModelAttribute("searchVO") MgvAllViewsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mgvAllViewsService.deleteMgvAllViews(mgvAllViewsVO);
        status.setComplete();
        return "forward:/mgvAllViews/MgvAllViewsList.do";
    }

}
