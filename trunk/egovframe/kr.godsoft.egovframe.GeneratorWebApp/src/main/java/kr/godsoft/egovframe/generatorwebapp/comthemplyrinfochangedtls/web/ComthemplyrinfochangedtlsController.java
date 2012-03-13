package kr.godsoft.egovframe.generatorwebapp.comthemplyrinfochangedtls.web;

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

import kr.godsoft.egovframe.generatorwebapp.comthemplyrinfochangedtls.service.ComthemplyrinfochangedtlsService;
import kr.godsoft.egovframe.generatorwebapp.comthemplyrinfochangedtls.service.ComthemplyrinfochangedtlsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comthemplyrinfochangedtls.service.ComthemplyrinfochangedtlsVO;

/**
 * @Class Name : ComthemplyrinfochangedtlsController.java
 * @Description : Comthemplyrinfochangedtls Controller class
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
@SessionAttributes(types=ComthemplyrinfochangedtlsVO.class)
public class ComthemplyrinfochangedtlsController {

    @Resource(name = "comthemplyrinfochangedtlsService")
    private ComthemplyrinfochangedtlsService comthemplyrinfochangedtlsService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comthemplyrinfochangedtls 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComthemplyrinfochangedtlsDefaultVO
	 * @return "/comthemplyrinfochangedtls/ComthemplyrinfochangedtlsList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comthemplyrinfochangedtls/ComthemplyrinfochangedtlsList.do")
    public String selectComthemplyrinfochangedtlsList(@ModelAttribute("searchVO") ComthemplyrinfochangedtlsDefaultVO searchVO, 
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
		
        List comthemplyrinfochangedtlsList = comthemplyrinfochangedtlsService.selectComthemplyrinfochangedtlsList(searchVO);
        model.addAttribute("resultList", comthemplyrinfochangedtlsList);
        
        int totCnt = comthemplyrinfochangedtlsService.selectComthemplyrinfochangedtlsListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comthemplyrinfochangedtls/ComthemplyrinfochangedtlsList";
    } 
    
    @RequestMapping("/comthemplyrinfochangedtls/addComthemplyrinfochangedtlsView.do")
    public String addComthemplyrinfochangedtlsView(
            @ModelAttribute("searchVO") ComthemplyrinfochangedtlsDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comthemplyrinfochangedtlsVO", new ComthemplyrinfochangedtlsVO());
        return "/comthemplyrinfochangedtls/ComthemplyrinfochangedtlsRegister";
    }
    
    @RequestMapping("/comthemplyrinfochangedtls/addComthemplyrinfochangedtls.do")
    public String addComthemplyrinfochangedtls(
            ComthemplyrinfochangedtlsVO comthemplyrinfochangedtlsVO,
            @ModelAttribute("searchVO") ComthemplyrinfochangedtlsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comthemplyrinfochangedtlsService.insertComthemplyrinfochangedtls(comthemplyrinfochangedtlsVO);
        status.setComplete();
        return "forward:/comthemplyrinfochangedtls/ComthemplyrinfochangedtlsList.do";
    }
    
    @RequestMapping("/comthemplyrinfochangedtls/updateComthemplyrinfochangedtlsView.do")
    public String updateComthemplyrinfochangedtlsView(
            @RequestParam("emplyrId") String emplyrId ,
            @RequestParam("changeDe") String changeDe ,
            @ModelAttribute("searchVO") ComthemplyrinfochangedtlsDefaultVO searchVO, Model model)
            throws Exception {
        ComthemplyrinfochangedtlsVO comthemplyrinfochangedtlsVO = new ComthemplyrinfochangedtlsVO();
        comthemplyrinfochangedtlsVO.setEmplyrId(emplyrId);
        comthemplyrinfochangedtlsVO.setChangeDe(changeDe);
;        
        // 변수명은 CoC 에 따라 comthemplyrinfochangedtlsVO
        model.addAttribute(selectComthemplyrinfochangedtls(comthemplyrinfochangedtlsVO, searchVO));
        return "/comthemplyrinfochangedtls/ComthemplyrinfochangedtlsRegister";
    }

    @RequestMapping("/comthemplyrinfochangedtls/selectComthemplyrinfochangedtls.do")
    public @ModelAttribute("comthemplyrinfochangedtlsVO")
    ComthemplyrinfochangedtlsVO selectComthemplyrinfochangedtls(
            ComthemplyrinfochangedtlsVO comthemplyrinfochangedtlsVO,
            @ModelAttribute("searchVO") ComthemplyrinfochangedtlsDefaultVO searchVO) throws Exception {
        return comthemplyrinfochangedtlsService.selectComthemplyrinfochangedtls(comthemplyrinfochangedtlsVO);
    }

    @RequestMapping("/comthemplyrinfochangedtls/updateComthemplyrinfochangedtls.do")
    public String updateComthemplyrinfochangedtls(
            ComthemplyrinfochangedtlsVO comthemplyrinfochangedtlsVO,
            @ModelAttribute("searchVO") ComthemplyrinfochangedtlsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comthemplyrinfochangedtlsService.updateComthemplyrinfochangedtls(comthemplyrinfochangedtlsVO);
        status.setComplete();
        return "forward:/comthemplyrinfochangedtls/ComthemplyrinfochangedtlsList.do";
    }
    
    @RequestMapping("/comthemplyrinfochangedtls/deleteComthemplyrinfochangedtls.do")
    public String deleteComthemplyrinfochangedtls(
            ComthemplyrinfochangedtlsVO comthemplyrinfochangedtlsVO,
            @ModelAttribute("searchVO") ComthemplyrinfochangedtlsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comthemplyrinfochangedtlsService.deleteComthemplyrinfochangedtls(comthemplyrinfochangedtlsVO);
        status.setComplete();
        return "forward:/comthemplyrinfochangedtls/ComthemplyrinfochangedtlsList.do";
    }

}
