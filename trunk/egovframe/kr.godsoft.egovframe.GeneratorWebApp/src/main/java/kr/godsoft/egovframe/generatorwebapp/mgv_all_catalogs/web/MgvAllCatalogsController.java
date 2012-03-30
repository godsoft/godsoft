package kr.godsoft.egovframe.generatorwebapp.mgv_all_catalogs.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.mgv_all_catalogs.service.MgvAllCatalogsService;
import kr.godsoft.egovframe.generatorwebapp.mgv_all_catalogs.service.MgvAllCatalogsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.mgv_all_catalogs.service.MgvAllCatalogsVO;

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
 * @Class Name : MgvAllCatalogsController.java
 * @Description : MgvAllCatalogs Controller class
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
public class MgvAllCatalogsController {

    @Resource(name = "mgvAllCatalogsService")
    private MgvAllCatalogsService mgvAllCatalogsService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MGV_ALL_CATALOGS 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MgvAllCatalogsVO
	 * @return "/mgvAllCatalogs/MgvAllCatalogsList"
	 * @exception Exception
	 */
    @RequestMapping(value="/mgvAllCatalogs/MgvAllCatalogsList.do")
    public String selectMgvAllCatalogsList(@ModelAttribute("searchVO") MgvAllCatalogsVO searchVO, 
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
		
        List<EgovMap> mgvAllCatalogsList = mgvAllCatalogsService.selectMgvAllCatalogsList(searchVO);
        model.addAttribute("resultList", mgvAllCatalogsList);
        
        int totCnt = mgvAllCatalogsService.selectMgvAllCatalogsListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/mgvAllCatalogs/MgvAllCatalogsList";
    } 
    
    @RequestMapping("/mgvAllCatalogs/addMgvAllCatalogsView.do")
    public String addMgvAllCatalogsView(
            @ModelAttribute("searchVO") MgvAllCatalogsDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("mgvAllCatalogsVO", new MgvAllCatalogsVO());
        return "/mgvAllCatalogs/MgvAllCatalogsRegister";
    }
    
    @RequestMapping("/mgvAllCatalogs/addMgvAllCatalogs.do")
    public String addMgvAllCatalogs(
            MgvAllCatalogsVO mgvAllCatalogsVO,
            @ModelAttribute("searchVO") MgvAllCatalogsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mgvAllCatalogsService.insertMgvAllCatalogs(mgvAllCatalogsVO);
        status.setComplete();
        return "forward:/mgvAllCatalogs/MgvAllCatalogsList.do";
    }
    
    @RequestMapping("/mgvAllCatalogs/updateMgvAllCatalogsView.do")
    public String updateMgvAllCatalogsView(
            @ModelAttribute("searchVO") MgvAllCatalogsDefaultVO searchVO, Model model)
            throws Exception {
        MgvAllCatalogsVO mgvAllCatalogsVO = new MgvAllCatalogsVO();
;        
        // 변수명은 CoC 에 따라 mgvAllCatalogsVO
        model.addAttribute(selectMgvAllCatalogs(mgvAllCatalogsVO, searchVO));
        return "/mgvAllCatalogs/MgvAllCatalogsRegister";
    }

    @RequestMapping("/mgvAllCatalogs/selectMgvAllCatalogs.do")
    public @ModelAttribute("mgvAllCatalogsVO")
    MgvAllCatalogsVO selectMgvAllCatalogs(
            MgvAllCatalogsVO mgvAllCatalogsVO,
            @ModelAttribute("searchVO") MgvAllCatalogsDefaultVO searchVO) throws Exception {
        return mgvAllCatalogsService.selectMgvAllCatalogs(mgvAllCatalogsVO);
    }

    @RequestMapping("/mgvAllCatalogs/updateMgvAllCatalogs.do")
    public String updateMgvAllCatalogs(
            MgvAllCatalogsVO mgvAllCatalogsVO,
            @ModelAttribute("searchVO") MgvAllCatalogsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mgvAllCatalogsService.updateMgvAllCatalogs(mgvAllCatalogsVO);
        status.setComplete();
        return "forward:/mgvAllCatalogs/MgvAllCatalogsList.do";
    }
    
    @RequestMapping("/mgvAllCatalogs/deleteMgvAllCatalogs.do")
    public String deleteMgvAllCatalogs(
            MgvAllCatalogsVO mgvAllCatalogsVO,
            @ModelAttribute("searchVO") MgvAllCatalogsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mgvAllCatalogsService.deleteMgvAllCatalogs(mgvAllCatalogsVO);
        status.setComplete();
        return "forward:/mgvAllCatalogs/MgvAllCatalogsList.do";
    }

}
