package kr.godsoft.egovframe.generatorwebapp.comthprogrmchangedtls.web;

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

import kr.godsoft.egovframe.generatorwebapp.comthprogrmchangedtls.service.ComthprogrmchangedtlsService;
import kr.godsoft.egovframe.generatorwebapp.comthprogrmchangedtls.service.ComthprogrmchangedtlsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comthprogrmchangedtls.service.ComthprogrmchangedtlsVO;

/**
 * @Class Name : ComthprogrmchangedtlsController.java
 * @Description : Comthprogrmchangedtls Controller class
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
@SessionAttributes(types=ComthprogrmchangedtlsVO.class)
public class ComthprogrmchangedtlsController {

    @Resource(name = "comthprogrmchangedtlsService")
    private ComthprogrmchangedtlsService comthprogrmchangedtlsService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comthprogrmchangedtls 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComthprogrmchangedtlsDefaultVO
	 * @return "/comthprogrmchangedtls/ComthprogrmchangedtlsList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comthprogrmchangedtls/ComthprogrmchangedtlsList.do")
    public String selectComthprogrmchangedtlsList(@ModelAttribute("searchVO") ComthprogrmchangedtlsDefaultVO searchVO, 
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
		
        List comthprogrmchangedtlsList = comthprogrmchangedtlsService.selectComthprogrmchangedtlsList(searchVO);
        model.addAttribute("resultList", comthprogrmchangedtlsList);
        
        int totCnt = comthprogrmchangedtlsService.selectComthprogrmchangedtlsListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comthprogrmchangedtls/ComthprogrmchangedtlsList";
    } 
    
    @RequestMapping("/comthprogrmchangedtls/addComthprogrmchangedtlsView.do")
    public String addComthprogrmchangedtlsView(
            @ModelAttribute("searchVO") ComthprogrmchangedtlsDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comthprogrmchangedtlsVO", new ComthprogrmchangedtlsVO());
        return "/comthprogrmchangedtls/ComthprogrmchangedtlsRegister";
    }
    
    @RequestMapping("/comthprogrmchangedtls/addComthprogrmchangedtls.do")
    public String addComthprogrmchangedtls(
            ComthprogrmchangedtlsVO comthprogrmchangedtlsVO,
            @ModelAttribute("searchVO") ComthprogrmchangedtlsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comthprogrmchangedtlsService.insertComthprogrmchangedtls(comthprogrmchangedtlsVO);
        status.setComplete();
        return "forward:/comthprogrmchangedtls/ComthprogrmchangedtlsList.do";
    }
    
    @RequestMapping("/comthprogrmchangedtls/updateComthprogrmchangedtlsView.do")
    public String updateComthprogrmchangedtlsView(
            @RequestParam("progrmFileNm") String progrmFileNm ,
            @RequestParam("requstNo") int requstNo ,
            @ModelAttribute("searchVO") ComthprogrmchangedtlsDefaultVO searchVO, Model model)
            throws Exception {
        ComthprogrmchangedtlsVO comthprogrmchangedtlsVO = new ComthprogrmchangedtlsVO();
        comthprogrmchangedtlsVO.setProgrmFileNm(progrmFileNm);
        comthprogrmchangedtlsVO.setRequstNo(requstNo);
;        
        // 변수명은 CoC 에 따라 comthprogrmchangedtlsVO
        model.addAttribute(selectComthprogrmchangedtls(comthprogrmchangedtlsVO, searchVO));
        return "/comthprogrmchangedtls/ComthprogrmchangedtlsRegister";
    }

    @RequestMapping("/comthprogrmchangedtls/selectComthprogrmchangedtls.do")
    public @ModelAttribute("comthprogrmchangedtlsVO")
    ComthprogrmchangedtlsVO selectComthprogrmchangedtls(
            ComthprogrmchangedtlsVO comthprogrmchangedtlsVO,
            @ModelAttribute("searchVO") ComthprogrmchangedtlsDefaultVO searchVO) throws Exception {
        return comthprogrmchangedtlsService.selectComthprogrmchangedtls(comthprogrmchangedtlsVO);
    }

    @RequestMapping("/comthprogrmchangedtls/updateComthprogrmchangedtls.do")
    public String updateComthprogrmchangedtls(
            ComthprogrmchangedtlsVO comthprogrmchangedtlsVO,
            @ModelAttribute("searchVO") ComthprogrmchangedtlsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comthprogrmchangedtlsService.updateComthprogrmchangedtls(comthprogrmchangedtlsVO);
        status.setComplete();
        return "forward:/comthprogrmchangedtls/ComthprogrmchangedtlsList.do";
    }
    
    @RequestMapping("/comthprogrmchangedtls/deleteComthprogrmchangedtls.do")
    public String deleteComthprogrmchangedtls(
            ComthprogrmchangedtlsVO comthprogrmchangedtlsVO,
            @ModelAttribute("searchVO") ComthprogrmchangedtlsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comthprogrmchangedtlsService.deleteComthprogrmchangedtls(comthprogrmchangedtlsVO);
        status.setComplete();
        return "forward:/comthprogrmchangedtls/ComthprogrmchangedtlsList.do";
    }

}
