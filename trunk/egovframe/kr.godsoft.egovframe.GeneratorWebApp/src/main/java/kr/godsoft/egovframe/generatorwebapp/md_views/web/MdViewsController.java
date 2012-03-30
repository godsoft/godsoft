package kr.godsoft.egovframe.generatorwebapp.md_views.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_views.service.MdViewsService;
import kr.godsoft.egovframe.generatorwebapp.md_views.service.MdViewsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.md_views.service.MdViewsVO;

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
 * @Class Name : MdViewsController.java
 * @Description : MdViews Controller class
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
public class MdViewsController {

    @Resource(name = "mdViewsService")
    private MdViewsService mdViewsService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MD_VIEWS 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MdViewsVO
	 * @return "/mdViews/MdViewsList"
	 * @exception Exception
	 */
    @RequestMapping(value="/mdViews/MdViewsList.do")
    public String selectMdViewsList(@ModelAttribute("searchVO") MdViewsVO searchVO, 
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
		
        List<EgovMap> mdViewsList = mdViewsService.selectMdViewsList(searchVO);
        model.addAttribute("resultList", mdViewsList);
        
        int totCnt = mdViewsService.selectMdViewsListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/mdViews/MdViewsList";
    } 
    
    @RequestMapping("/mdViews/addMdViewsView.do")
    public String addMdViewsView(
            @ModelAttribute("searchVO") MdViewsDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("mdViewsVO", new MdViewsVO());
        return "/mdViews/MdViewsRegister";
    }
    
    @RequestMapping("/mdViews/addMdViews.do")
    public String addMdViews(
            MdViewsVO mdViewsVO,
            @ModelAttribute("searchVO") MdViewsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdViewsService.insertMdViews(mdViewsVO);
        status.setComplete();
        return "forward:/mdViews/MdViewsList.do";
    }
    
    @RequestMapping("/mdViews/updateMdViewsView.do")
    public String updateMdViewsView(
            @RequestParam("id") String id ,
            @ModelAttribute("searchVO") MdViewsDefaultVO searchVO, Model model)
            throws Exception {
        MdViewsVO mdViewsVO = new MdViewsVO();
        mdViewsVO.setId(id);
;        
        // 변수명은 CoC 에 따라 mdViewsVO
        model.addAttribute(selectMdViews(mdViewsVO, searchVO));
        return "/mdViews/MdViewsRegister";
    }

    @RequestMapping("/mdViews/selectMdViews.do")
    public @ModelAttribute("mdViewsVO")
    MdViewsVO selectMdViews(
            MdViewsVO mdViewsVO,
            @ModelAttribute("searchVO") MdViewsDefaultVO searchVO) throws Exception {
        return mdViewsService.selectMdViews(mdViewsVO);
    }

    @RequestMapping("/mdViews/updateMdViews.do")
    public String updateMdViews(
            MdViewsVO mdViewsVO,
            @ModelAttribute("searchVO") MdViewsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdViewsService.updateMdViews(mdViewsVO);
        status.setComplete();
        return "forward:/mdViews/MdViewsList.do";
    }
    
    @RequestMapping("/mdViews/deleteMdViews.do")
    public String deleteMdViews(
            MdViewsVO mdViewsVO,
            @ModelAttribute("searchVO") MdViewsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdViewsService.deleteMdViews(mdViewsVO);
        status.setComplete();
        return "forward:/mdViews/MdViewsList.do";
    }

}
