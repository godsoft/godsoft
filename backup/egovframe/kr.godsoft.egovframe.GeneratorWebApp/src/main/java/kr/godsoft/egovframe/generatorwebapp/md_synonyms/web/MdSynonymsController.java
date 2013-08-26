package kr.godsoft.egovframe.generatorwebapp.md_synonyms.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_synonyms.service.MdSynonymsService;
import kr.godsoft.egovframe.generatorwebapp.md_synonyms.service.MdSynonymsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.md_synonyms.service.MdSynonymsVO;

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
 * @Class Name : MdSynonymsController.java
 * @Description : MdSynonyms Controller class
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
public class MdSynonymsController {

    @Resource(name = "mdSynonymsService")
    private MdSynonymsService mdSynonymsService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MD_SYNONYMS 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MdSynonymsVO
	 * @return "/mdSynonyms/MdSynonymsList"
	 * @exception Exception
	 */
    @RequestMapping(value="/mdSynonyms/MdSynonymsList.do")
    public String selectMdSynonymsList(@ModelAttribute("searchVO") MdSynonymsVO searchVO, 
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
		
        List<EgovMap> mdSynonymsList = mdSynonymsService.selectMdSynonymsList(searchVO);
        model.addAttribute("resultList", mdSynonymsList);
        
        int totCnt = mdSynonymsService.selectMdSynonymsListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/mdSynonyms/MdSynonymsList";
    } 
    
    @RequestMapping("/mdSynonyms/addMdSynonymsView.do")
    public String addMdSynonymsView(
            @ModelAttribute("searchVO") MdSynonymsDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("mdSynonymsVO", new MdSynonymsVO());
        return "/mdSynonyms/MdSynonymsRegister";
    }
    
    @RequestMapping("/mdSynonyms/addMdSynonyms.do")
    public String addMdSynonyms(
            MdSynonymsVO mdSynonymsVO,
            @ModelAttribute("searchVO") MdSynonymsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdSynonymsService.insertMdSynonyms(mdSynonymsVO);
        status.setComplete();
        return "forward:/mdSynonyms/MdSynonymsList.do";
    }
    
    @RequestMapping("/mdSynonyms/updateMdSynonymsView.do")
    public String updateMdSynonymsView(
            @RequestParam("id") String id ,
            @ModelAttribute("searchVO") MdSynonymsDefaultVO searchVO, Model model)
            throws Exception {
        MdSynonymsVO mdSynonymsVO = new MdSynonymsVO();
        mdSynonymsVO.setId(id);
;        
        // 변수명은 CoC 에 따라 mdSynonymsVO
        model.addAttribute(selectMdSynonyms(mdSynonymsVO, searchVO));
        return "/mdSynonyms/MdSynonymsRegister";
    }

    @RequestMapping("/mdSynonyms/selectMdSynonyms.do")
    public @ModelAttribute("mdSynonymsVO")
    MdSynonymsVO selectMdSynonyms(
            MdSynonymsVO mdSynonymsVO,
            @ModelAttribute("searchVO") MdSynonymsDefaultVO searchVO) throws Exception {
        return mdSynonymsService.selectMdSynonyms(mdSynonymsVO);
    }

    @RequestMapping("/mdSynonyms/updateMdSynonyms.do")
    public String updateMdSynonyms(
            MdSynonymsVO mdSynonymsVO,
            @ModelAttribute("searchVO") MdSynonymsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdSynonymsService.updateMdSynonyms(mdSynonymsVO);
        status.setComplete();
        return "forward:/mdSynonyms/MdSynonymsList.do";
    }
    
    @RequestMapping("/mdSynonyms/deleteMdSynonyms.do")
    public String deleteMdSynonyms(
            MdSynonymsVO mdSynonymsVO,
            @ModelAttribute("searchVO") MdSynonymsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdSynonymsService.deleteMdSynonyms(mdSynonymsVO);
        status.setComplete();
        return "forward:/mdSynonyms/MdSynonymsList.do";
    }

}
