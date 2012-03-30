package kr.godsoft.egovframe.generatorwebapp.md_tables.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_tables.service.MdTablesService;
import kr.godsoft.egovframe.generatorwebapp.md_tables.service.MdTablesDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.md_tables.service.MdTablesVO;

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
 * @Class Name : MdTablesController.java
 * @Description : MdTables Controller class
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
public class MdTablesController {

    @Resource(name = "mdTablesService")
    private MdTablesService mdTablesService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MD_TABLES 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MdTablesVO
	 * @return "/mdTables/MdTablesList"
	 * @exception Exception
	 */
    @RequestMapping(value="/mdTables/MdTablesList.do")
    public String selectMdTablesList(@ModelAttribute("searchVO") MdTablesVO searchVO, 
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
		
        List<EgovMap> mdTablesList = mdTablesService.selectMdTablesList(searchVO);
        model.addAttribute("resultList", mdTablesList);
        
        int totCnt = mdTablesService.selectMdTablesListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/mdTables/MdTablesList";
    } 
    
    @RequestMapping("/mdTables/addMdTablesView.do")
    public String addMdTablesView(
            @ModelAttribute("searchVO") MdTablesDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("mdTablesVO", new MdTablesVO());
        return "/mdTables/MdTablesRegister";
    }
    
    @RequestMapping("/mdTables/addMdTables.do")
    public String addMdTables(
            MdTablesVO mdTablesVO,
            @ModelAttribute("searchVO") MdTablesDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdTablesService.insertMdTables(mdTablesVO);
        status.setComplete();
        return "forward:/mdTables/MdTablesList.do";
    }
    
    @RequestMapping("/mdTables/updateMdTablesView.do")
    public String updateMdTablesView(
            @RequestParam("id") String id ,
            @ModelAttribute("searchVO") MdTablesDefaultVO searchVO, Model model)
            throws Exception {
        MdTablesVO mdTablesVO = new MdTablesVO();
        mdTablesVO.setId(id);
;        
        // 변수명은 CoC 에 따라 mdTablesVO
        model.addAttribute(selectMdTables(mdTablesVO, searchVO));
        return "/mdTables/MdTablesRegister";
    }

    @RequestMapping("/mdTables/selectMdTables.do")
    public @ModelAttribute("mdTablesVO")
    MdTablesVO selectMdTables(
            MdTablesVO mdTablesVO,
            @ModelAttribute("searchVO") MdTablesDefaultVO searchVO) throws Exception {
        return mdTablesService.selectMdTables(mdTablesVO);
    }

    @RequestMapping("/mdTables/updateMdTables.do")
    public String updateMdTables(
            MdTablesVO mdTablesVO,
            @ModelAttribute("searchVO") MdTablesDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdTablesService.updateMdTables(mdTablesVO);
        status.setComplete();
        return "forward:/mdTables/MdTablesList.do";
    }
    
    @RequestMapping("/mdTables/deleteMdTables.do")
    public String deleteMdTables(
            MdTablesVO mdTablesVO,
            @ModelAttribute("searchVO") MdTablesDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdTablesService.deleteMdTables(mdTablesVO);
        status.setComplete();
        return "forward:/mdTables/MdTablesList.do";
    }

}
