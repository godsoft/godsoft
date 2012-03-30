package kr.godsoft.egovframe.generatorwebapp.md_indexes.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_indexes.service.MdIndexesService;
import kr.godsoft.egovframe.generatorwebapp.md_indexes.service.MdIndexesDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.md_indexes.service.MdIndexesVO;

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
 * @Class Name : MdIndexesController.java
 * @Description : MdIndexes Controller class
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
public class MdIndexesController {

    @Resource(name = "mdIndexesService")
    private MdIndexesService mdIndexesService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MD_INDEXES 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MdIndexesVO
	 * @return "/mdIndexes/MdIndexesList"
	 * @exception Exception
	 */
    @RequestMapping(value="/mdIndexes/MdIndexesList.do")
    public String selectMdIndexesList(@ModelAttribute("searchVO") MdIndexesVO searchVO, 
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
		
        List<EgovMap> mdIndexesList = mdIndexesService.selectMdIndexesList(searchVO);
        model.addAttribute("resultList", mdIndexesList);
        
        int totCnt = mdIndexesService.selectMdIndexesListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/mdIndexes/MdIndexesList";
    } 
    
    @RequestMapping("/mdIndexes/addMdIndexesView.do")
    public String addMdIndexesView(
            @ModelAttribute("searchVO") MdIndexesDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("mdIndexesVO", new MdIndexesVO());
        return "/mdIndexes/MdIndexesRegister";
    }
    
    @RequestMapping("/mdIndexes/addMdIndexes.do")
    public String addMdIndexes(
            MdIndexesVO mdIndexesVO,
            @ModelAttribute("searchVO") MdIndexesDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdIndexesService.insertMdIndexes(mdIndexesVO);
        status.setComplete();
        return "forward:/mdIndexes/MdIndexesList.do";
    }
    
    @RequestMapping("/mdIndexes/updateMdIndexesView.do")
    public String updateMdIndexesView(
            @RequestParam("id") String id ,
            @ModelAttribute("searchVO") MdIndexesDefaultVO searchVO, Model model)
            throws Exception {
        MdIndexesVO mdIndexesVO = new MdIndexesVO();
        mdIndexesVO.setId(id);
;        
        // 변수명은 CoC 에 따라 mdIndexesVO
        model.addAttribute(selectMdIndexes(mdIndexesVO, searchVO));
        return "/mdIndexes/MdIndexesRegister";
    }

    @RequestMapping("/mdIndexes/selectMdIndexes.do")
    public @ModelAttribute("mdIndexesVO")
    MdIndexesVO selectMdIndexes(
            MdIndexesVO mdIndexesVO,
            @ModelAttribute("searchVO") MdIndexesDefaultVO searchVO) throws Exception {
        return mdIndexesService.selectMdIndexes(mdIndexesVO);
    }

    @RequestMapping("/mdIndexes/updateMdIndexes.do")
    public String updateMdIndexes(
            MdIndexesVO mdIndexesVO,
            @ModelAttribute("searchVO") MdIndexesDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdIndexesService.updateMdIndexes(mdIndexesVO);
        status.setComplete();
        return "forward:/mdIndexes/MdIndexesList.do";
    }
    
    @RequestMapping("/mdIndexes/deleteMdIndexes.do")
    public String deleteMdIndexes(
            MdIndexesVO mdIndexesVO,
            @ModelAttribute("searchVO") MdIndexesDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdIndexesService.deleteMdIndexes(mdIndexesVO);
        status.setComplete();
        return "forward:/mdIndexes/MdIndexesList.do";
    }

}
