package kr.godsoft.egovframe.generatorwebapp.md_catalogs.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_catalogs.service.MdCatalogsService;
import kr.godsoft.egovframe.generatorwebapp.md_catalogs.service.MdCatalogsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.md_catalogs.service.MdCatalogsVO;

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
 * @Class Name : MdCatalogsController.java
 * @Description : MdCatalogs Controller class
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
public class MdCatalogsController {

    @Resource(name = "mdCatalogsService")
    private MdCatalogsService mdCatalogsService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MD_CATALOGS 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MdCatalogsVO
	 * @return "/mdCatalogs/MdCatalogsList"
	 * @exception Exception
	 */
    @RequestMapping(value="/mdCatalogs/MdCatalogsList.do")
    public String selectMdCatalogsList(@ModelAttribute("searchVO") MdCatalogsVO searchVO, 
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
		
        List<EgovMap> mdCatalogsList = mdCatalogsService.selectMdCatalogsList(searchVO);
        model.addAttribute("resultList", mdCatalogsList);
        
        int totCnt = mdCatalogsService.selectMdCatalogsListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/mdCatalogs/MdCatalogsList";
    } 
    
    @RequestMapping("/mdCatalogs/addMdCatalogsView.do")
    public String addMdCatalogsView(
            @ModelAttribute("searchVO") MdCatalogsDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("mdCatalogsVO", new MdCatalogsVO());
        return "/mdCatalogs/MdCatalogsRegister";
    }
    
    @RequestMapping("/mdCatalogs/addMdCatalogs.do")
    public String addMdCatalogs(
            MdCatalogsVO mdCatalogsVO,
            @ModelAttribute("searchVO") MdCatalogsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdCatalogsService.insertMdCatalogs(mdCatalogsVO);
        status.setComplete();
        return "forward:/mdCatalogs/MdCatalogsList.do";
    }
    
    @RequestMapping("/mdCatalogs/updateMdCatalogsView.do")
    public String updateMdCatalogsView(
            @RequestParam("id") String id ,
            @ModelAttribute("searchVO") MdCatalogsDefaultVO searchVO, Model model)
            throws Exception {
        MdCatalogsVO mdCatalogsVO = new MdCatalogsVO();
        mdCatalogsVO.setId(id);
;        
        // 변수명은 CoC 에 따라 mdCatalogsVO
        model.addAttribute(selectMdCatalogs(mdCatalogsVO, searchVO));
        return "/mdCatalogs/MdCatalogsRegister";
    }

    @RequestMapping("/mdCatalogs/selectMdCatalogs.do")
    public @ModelAttribute("mdCatalogsVO")
    MdCatalogsVO selectMdCatalogs(
            MdCatalogsVO mdCatalogsVO,
            @ModelAttribute("searchVO") MdCatalogsDefaultVO searchVO) throws Exception {
        return mdCatalogsService.selectMdCatalogs(mdCatalogsVO);
    }

    @RequestMapping("/mdCatalogs/updateMdCatalogs.do")
    public String updateMdCatalogs(
            MdCatalogsVO mdCatalogsVO,
            @ModelAttribute("searchVO") MdCatalogsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdCatalogsService.updateMdCatalogs(mdCatalogsVO);
        status.setComplete();
        return "forward:/mdCatalogs/MdCatalogsList.do";
    }
    
    @RequestMapping("/mdCatalogs/deleteMdCatalogs.do")
    public String deleteMdCatalogs(
            MdCatalogsVO mdCatalogsVO,
            @ModelAttribute("searchVO") MdCatalogsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdCatalogsService.deleteMdCatalogs(mdCatalogsVO);
        status.setComplete();
        return "forward:/mdCatalogs/MdCatalogsList.do";
    }

}
