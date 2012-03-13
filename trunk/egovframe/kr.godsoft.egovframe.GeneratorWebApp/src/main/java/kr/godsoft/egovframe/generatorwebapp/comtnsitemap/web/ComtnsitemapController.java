package kr.godsoft.egovframe.generatorwebapp.comtnsitemap.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import egovframework.rte.fdl.property.EgovPropertyService;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;

import kr.godsoft.egovframe.generatorwebapp.comtnsitemap.service.ComtnsitemapService;
import kr.godsoft.egovframe.generatorwebapp.comtnsitemap.service.ComtnsitemapDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnsitemap.service.ComtnsitemapVO;

/**
 * @Class Name : ComtnsitemapController.java
 * @Description : Comtnsitemap Controller class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Controller
@SessionAttributes(types=ComtnsitemapVO.class)
public class ComtnsitemapController {

    @Resource(name = "comtnsitemapService")
    private ComtnsitemapService comtnsitemapService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnsitemap 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnsitemapDefaultVO
	 * @return "/comtnsitemap/ComtnsitemapList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnsitemap/ComtnsitemapList.do")
    public String selectComtnsitemapList(@ModelAttribute("searchVO") ComtnsitemapDefaultVO searchVO, 
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
		
        List comtnsitemapList = comtnsitemapService.selectComtnsitemapList(searchVO);
        model.addAttribute("resultList", comtnsitemapList);
        
        int totCnt = comtnsitemapService.selectComtnsitemapListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnsitemap/ComtnsitemapList";
    } 
    
    @RequestMapping("/comtnsitemap/addComtnsitemapView.do")
    public String addComtnsitemapView(
            @ModelAttribute("searchVO") ComtnsitemapDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnsitemapVO", new ComtnsitemapVO());
        return "/comtnsitemap/ComtnsitemapRegister";
    }
    
    @RequestMapping("/comtnsitemap/addComtnsitemap.do")
    public String addComtnsitemap(
            ComtnsitemapVO comtnsitemapVO,
            @ModelAttribute("searchVO") ComtnsitemapDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnsitemapService.insertComtnsitemap(comtnsitemapVO);
        status.setComplete();
        return "forward:/comtnsitemap/ComtnsitemapList.do";
    }
    
    @RequestMapping("/comtnsitemap/updateComtnsitemapView.do")
    public String updateComtnsitemapView(
            @RequestParam("mapngCreatId") String mapngCreatId ,
            @ModelAttribute("searchVO") ComtnsitemapDefaultVO searchVO, Model model)
            throws Exception {
        ComtnsitemapVO comtnsitemapVO = new ComtnsitemapVO();
        comtnsitemapVO.setMapngCreatId(mapngCreatId);
;        
        // 변수명은 CoC 에 따라 comtnsitemapVO
        model.addAttribute(selectComtnsitemap(comtnsitemapVO, searchVO));
        return "/comtnsitemap/ComtnsitemapRegister";
    }

    @RequestMapping("/comtnsitemap/selectComtnsitemap.do")
    public @ModelAttribute("comtnsitemapVO")
    ComtnsitemapVO selectComtnsitemap(
            ComtnsitemapVO comtnsitemapVO,
            @ModelAttribute("searchVO") ComtnsitemapDefaultVO searchVO) throws Exception {
        return comtnsitemapService.selectComtnsitemap(comtnsitemapVO);
    }

    @RequestMapping("/comtnsitemap/updateComtnsitemap.do")
    public String updateComtnsitemap(
            ComtnsitemapVO comtnsitemapVO,
            @ModelAttribute("searchVO") ComtnsitemapDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnsitemapService.updateComtnsitemap(comtnsitemapVO);
        status.setComplete();
        return "forward:/comtnsitemap/ComtnsitemapList.do";
    }
    
    @RequestMapping("/comtnsitemap/deleteComtnsitemap.do")
    public String deleteComtnsitemap(
            ComtnsitemapVO comtnsitemapVO,
            @ModelAttribute("searchVO") ComtnsitemapDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnsitemapService.deleteComtnsitemap(comtnsitemapVO);
        status.setComplete();
        return "forward:/comtnsitemap/ComtnsitemapList.do";
    }

}
