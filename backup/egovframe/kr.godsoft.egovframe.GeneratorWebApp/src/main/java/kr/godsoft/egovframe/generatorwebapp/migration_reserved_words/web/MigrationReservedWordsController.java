package kr.godsoft.egovframe.generatorwebapp.migration_reserved_words.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.migration_reserved_words.service.MigrationReservedWordsService;
import kr.godsoft.egovframe.generatorwebapp.migration_reserved_words.service.MigrationReservedWordsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.migration_reserved_words.service.MigrationReservedWordsVO;

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
 * @Class Name : MigrationReservedWordsController.java
 * @Description : MigrationReservedWords Controller class
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
public class MigrationReservedWordsController {

    @Resource(name = "migrationReservedWordsService")
    private MigrationReservedWordsService migrationReservedWordsService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MIGRATION_RESERVED_WORDS 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MigrationReservedWordsVO
	 * @return "/migrationReservedWords/MigrationReservedWordsList"
	 * @exception Exception
	 */
    @RequestMapping(value="/migrationReservedWords/MigrationReservedWordsList.do")
    public String selectMigrationReservedWordsList(@ModelAttribute("searchVO") MigrationReservedWordsVO searchVO, 
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
		
        List<EgovMap> migrationReservedWordsList = migrationReservedWordsService.selectMigrationReservedWordsList(searchVO);
        model.addAttribute("resultList", migrationReservedWordsList);
        
        int totCnt = migrationReservedWordsService.selectMigrationReservedWordsListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/migrationReservedWords/MigrationReservedWordsList";
    } 
    
    @RequestMapping("/migrationReservedWords/addMigrationReservedWordsView.do")
    public String addMigrationReservedWordsView(
            @ModelAttribute("searchVO") MigrationReservedWordsDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("migrationReservedWordsVO", new MigrationReservedWordsVO());
        return "/migrationReservedWords/MigrationReservedWordsRegister";
    }
    
    @RequestMapping("/migrationReservedWords/addMigrationReservedWords.do")
    public String addMigrationReservedWords(
            MigrationReservedWordsVO migrationReservedWordsVO,
            @ModelAttribute("searchVO") MigrationReservedWordsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        migrationReservedWordsService.insertMigrationReservedWords(migrationReservedWordsVO);
        status.setComplete();
        return "forward:/migrationReservedWords/MigrationReservedWordsList.do";
    }
    
    @RequestMapping("/migrationReservedWords/updateMigrationReservedWordsView.do")
    public String updateMigrationReservedWordsView(
            @ModelAttribute("searchVO") MigrationReservedWordsDefaultVO searchVO, Model model)
            throws Exception {
        MigrationReservedWordsVO migrationReservedWordsVO = new MigrationReservedWordsVO();
;        
        // 변수명은 CoC 에 따라 migrationReservedWordsVO
        model.addAttribute(selectMigrationReservedWords(migrationReservedWordsVO, searchVO));
        return "/migrationReservedWords/MigrationReservedWordsRegister";
    }

    @RequestMapping("/migrationReservedWords/selectMigrationReservedWords.do")
    public @ModelAttribute("migrationReservedWordsVO")
    MigrationReservedWordsVO selectMigrationReservedWords(
            MigrationReservedWordsVO migrationReservedWordsVO,
            @ModelAttribute("searchVO") MigrationReservedWordsDefaultVO searchVO) throws Exception {
        return migrationReservedWordsService.selectMigrationReservedWords(migrationReservedWordsVO);
    }

    @RequestMapping("/migrationReservedWords/updateMigrationReservedWords.do")
    public String updateMigrationReservedWords(
            MigrationReservedWordsVO migrationReservedWordsVO,
            @ModelAttribute("searchVO") MigrationReservedWordsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        migrationReservedWordsService.updateMigrationReservedWords(migrationReservedWordsVO);
        status.setComplete();
        return "forward:/migrationReservedWords/MigrationReservedWordsList.do";
    }
    
    @RequestMapping("/migrationReservedWords/deleteMigrationReservedWords.do")
    public String deleteMigrationReservedWords(
            MigrationReservedWordsVO migrationReservedWordsVO,
            @ModelAttribute("searchVO") MigrationReservedWordsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        migrationReservedWordsService.deleteMigrationReservedWords(migrationReservedWordsVO);
        status.setComplete();
        return "forward:/migrationReservedWords/MigrationReservedWordsList.do";
    }

}
