package kr.godsoft.egovframe.generatorwebapp.mgv_all_tables.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.mgv_all_tables.service.MgvAllTablesService;
import kr.godsoft.egovframe.generatorwebapp.mgv_all_tables.service.MgvAllTablesDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.mgv_all_tables.service.MgvAllTablesVO;

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
 * @Class Name : MgvAllTablesController.java
 * @Description : MgvAllTables Controller class
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
public class MgvAllTablesController {

    @Resource(name = "mgvAllTablesService")
    private MgvAllTablesService mgvAllTablesService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MGV_ALL_TABLES 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MgvAllTablesVO
	 * @return "/mgvAllTables/MgvAllTablesList"
	 * @exception Exception
	 */
    @RequestMapping(value="/mgvAllTables/MgvAllTablesList.do")
    public String selectMgvAllTablesList(@ModelAttribute("searchVO") MgvAllTablesVO searchVO, 
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
		
        List<EgovMap> mgvAllTablesList = mgvAllTablesService.selectMgvAllTablesList(searchVO);
        model.addAttribute("resultList", mgvAllTablesList);
        
        int totCnt = mgvAllTablesService.selectMgvAllTablesListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/mgvAllTables/MgvAllTablesList";
    } 
    
    @RequestMapping("/mgvAllTables/addMgvAllTablesView.do")
    public String addMgvAllTablesView(
            @ModelAttribute("searchVO") MgvAllTablesDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("mgvAllTablesVO", new MgvAllTablesVO());
        return "/mgvAllTables/MgvAllTablesRegister";
    }
    
    @RequestMapping("/mgvAllTables/addMgvAllTables.do")
    public String addMgvAllTables(
            MgvAllTablesVO mgvAllTablesVO,
            @ModelAttribute("searchVO") MgvAllTablesDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mgvAllTablesService.insertMgvAllTables(mgvAllTablesVO);
        status.setComplete();
        return "forward:/mgvAllTables/MgvAllTablesList.do";
    }
    
    @RequestMapping("/mgvAllTables/updateMgvAllTablesView.do")
    public String updateMgvAllTablesView(
            @ModelAttribute("searchVO") MgvAllTablesDefaultVO searchVO, Model model)
            throws Exception {
        MgvAllTablesVO mgvAllTablesVO = new MgvAllTablesVO();
;        
        // 변수명은 CoC 에 따라 mgvAllTablesVO
        model.addAttribute(selectMgvAllTables(mgvAllTablesVO, searchVO));
        return "/mgvAllTables/MgvAllTablesRegister";
    }

    @RequestMapping("/mgvAllTables/selectMgvAllTables.do")
    public @ModelAttribute("mgvAllTablesVO")
    MgvAllTablesVO selectMgvAllTables(
            MgvAllTablesVO mgvAllTablesVO,
            @ModelAttribute("searchVO") MgvAllTablesDefaultVO searchVO) throws Exception {
        return mgvAllTablesService.selectMgvAllTables(mgvAllTablesVO);
    }

    @RequestMapping("/mgvAllTables/updateMgvAllTables.do")
    public String updateMgvAllTables(
            MgvAllTablesVO mgvAllTablesVO,
            @ModelAttribute("searchVO") MgvAllTablesDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mgvAllTablesService.updateMgvAllTables(mgvAllTablesVO);
        status.setComplete();
        return "forward:/mgvAllTables/MgvAllTablesList.do";
    }
    
    @RequestMapping("/mgvAllTables/deleteMgvAllTables.do")
    public String deleteMgvAllTables(
            MgvAllTablesVO mgvAllTablesVO,
            @ModelAttribute("searchVO") MgvAllTablesDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mgvAllTablesService.deleteMgvAllTables(mgvAllTablesVO);
        status.setComplete();
        return "forward:/mgvAllTables/MgvAllTablesList.do";
    }

}
