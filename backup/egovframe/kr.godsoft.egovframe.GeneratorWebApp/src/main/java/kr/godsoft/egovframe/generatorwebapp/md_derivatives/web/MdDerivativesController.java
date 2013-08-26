package kr.godsoft.egovframe.generatorwebapp.md_derivatives.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_derivatives.service.MdDerivativesService;
import kr.godsoft.egovframe.generatorwebapp.md_derivatives.service.MdDerivativesDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.md_derivatives.service.MdDerivativesVO;

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
 * @Class Name : MdDerivativesController.java
 * @Description : MdDerivatives Controller class
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
public class MdDerivativesController {

    @Resource(name = "mdDerivativesService")
    private MdDerivativesService mdDerivativesService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MD_DERIVATIVES 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MdDerivativesVO
	 * @return "/mdDerivatives/MdDerivativesList"
	 * @exception Exception
	 */
    @RequestMapping(value="/mdDerivatives/MdDerivativesList.do")
    public String selectMdDerivativesList(@ModelAttribute("searchVO") MdDerivativesVO searchVO, 
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
		
        List<EgovMap> mdDerivativesList = mdDerivativesService.selectMdDerivativesList(searchVO);
        model.addAttribute("resultList", mdDerivativesList);
        
        int totCnt = mdDerivativesService.selectMdDerivativesListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/mdDerivatives/MdDerivativesList";
    } 
    
    @RequestMapping("/mdDerivatives/addMdDerivativesView.do")
    public String addMdDerivativesView(
            @ModelAttribute("searchVO") MdDerivativesDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("mdDerivativesVO", new MdDerivativesVO());
        return "/mdDerivatives/MdDerivativesRegister";
    }
    
    @RequestMapping("/mdDerivatives/addMdDerivatives.do")
    public String addMdDerivatives(
            MdDerivativesVO mdDerivativesVO,
            @ModelAttribute("searchVO") MdDerivativesDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdDerivativesService.insertMdDerivatives(mdDerivativesVO);
        status.setComplete();
        return "forward:/mdDerivatives/MdDerivativesList.do";
    }
    
    @RequestMapping("/mdDerivatives/updateMdDerivativesView.do")
    public String updateMdDerivativesView(
            @RequestParam("id") String id ,
            @ModelAttribute("searchVO") MdDerivativesDefaultVO searchVO, Model model)
            throws Exception {
        MdDerivativesVO mdDerivativesVO = new MdDerivativesVO();
        mdDerivativesVO.setId(id);
;        
        // 변수명은 CoC 에 따라 mdDerivativesVO
        model.addAttribute(selectMdDerivatives(mdDerivativesVO, searchVO));
        return "/mdDerivatives/MdDerivativesRegister";
    }

    @RequestMapping("/mdDerivatives/selectMdDerivatives.do")
    public @ModelAttribute("mdDerivativesVO")
    MdDerivativesVO selectMdDerivatives(
            MdDerivativesVO mdDerivativesVO,
            @ModelAttribute("searchVO") MdDerivativesDefaultVO searchVO) throws Exception {
        return mdDerivativesService.selectMdDerivatives(mdDerivativesVO);
    }

    @RequestMapping("/mdDerivatives/updateMdDerivatives.do")
    public String updateMdDerivatives(
            MdDerivativesVO mdDerivativesVO,
            @ModelAttribute("searchVO") MdDerivativesDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdDerivativesService.updateMdDerivatives(mdDerivativesVO);
        status.setComplete();
        return "forward:/mdDerivatives/MdDerivativesList.do";
    }
    
    @RequestMapping("/mdDerivatives/deleteMdDerivatives.do")
    public String deleteMdDerivatives(
            MdDerivativesVO mdDerivativesVO,
            @ModelAttribute("searchVO") MdDerivativesDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdDerivativesService.deleteMdDerivatives(mdDerivativesVO);
        status.setComplete();
        return "forward:/mdDerivatives/MdDerivativesList.do";
    }

}
