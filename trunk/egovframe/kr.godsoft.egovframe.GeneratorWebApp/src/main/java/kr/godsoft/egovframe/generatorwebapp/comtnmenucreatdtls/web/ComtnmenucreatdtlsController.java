package kr.godsoft.egovframe.generatorwebapp.comtnmenucreatdtls.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnmenucreatdtls.service.ComtnmenucreatdtlsService;
import kr.godsoft.egovframe.generatorwebapp.comtnmenucreatdtls.service.ComtnmenucreatdtlsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnmenucreatdtls.service.ComtnmenucreatdtlsVO;

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
 * @Class Name : ComtnmenucreatdtlsController.java
 * @Description : Comtnmenucreatdtls Controller class
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
public class ComtnmenucreatdtlsController {

    @Resource(name = "comtnmenucreatdtlsService")
    private ComtnmenucreatdtlsService comtnmenucreatdtlsService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNMENUCREATDTLS 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnmenucreatdtlsVO
	 * @return "/comtnmenucreatdtls/ComtnmenucreatdtlsList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnmenucreatdtls/ComtnmenucreatdtlsList.do")
    public String selectComtnmenucreatdtlsList(@ModelAttribute("searchVO") ComtnmenucreatdtlsVO searchVO, 
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
		
        List<EgovMap> comtnmenucreatdtlsList = comtnmenucreatdtlsService.selectComtnmenucreatdtlsList(searchVO);
        model.addAttribute("resultList", comtnmenucreatdtlsList);
        
        int totCnt = comtnmenucreatdtlsService.selectComtnmenucreatdtlsListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnmenucreatdtls/ComtnmenucreatdtlsList";
    } 
    
    @RequestMapping("/comtnmenucreatdtls/addComtnmenucreatdtlsView.do")
    public String addComtnmenucreatdtlsView(
            @ModelAttribute("searchVO") ComtnmenucreatdtlsDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnmenucreatdtlsVO", new ComtnmenucreatdtlsVO());
        return "/comtnmenucreatdtls/ComtnmenucreatdtlsRegister";
    }
    
    @RequestMapping("/comtnmenucreatdtls/addComtnmenucreatdtls.do")
    public String addComtnmenucreatdtls(
            ComtnmenucreatdtlsVO comtnmenucreatdtlsVO,
            @ModelAttribute("searchVO") ComtnmenucreatdtlsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnmenucreatdtlsService.insertComtnmenucreatdtls(comtnmenucreatdtlsVO);
        status.setComplete();
        return "forward:/comtnmenucreatdtls/ComtnmenucreatdtlsList.do";
    }
    
    @RequestMapping("/comtnmenucreatdtls/updateComtnmenucreatdtlsView.do")
    public String updateComtnmenucreatdtlsView(
            @RequestParam("menuNo") String menuNo ,
            @RequestParam("authorCode") String authorCode ,
            @ModelAttribute("searchVO") ComtnmenucreatdtlsDefaultVO searchVO, Model model)
            throws Exception {
        ComtnmenucreatdtlsVO comtnmenucreatdtlsVO = new ComtnmenucreatdtlsVO();
        comtnmenucreatdtlsVO.setMenuNo(menuNo);
        comtnmenucreatdtlsVO.setAuthorCode(authorCode);
;        
        // 변수명은 CoC 에 따라 comtnmenucreatdtlsVO
        model.addAttribute(selectComtnmenucreatdtls(comtnmenucreatdtlsVO, searchVO));
        return "/comtnmenucreatdtls/ComtnmenucreatdtlsRegister";
    }

    @RequestMapping("/comtnmenucreatdtls/selectComtnmenucreatdtls.do")
    public @ModelAttribute("comtnmenucreatdtlsVO")
    ComtnmenucreatdtlsVO selectComtnmenucreatdtls(
            ComtnmenucreatdtlsVO comtnmenucreatdtlsVO,
            @ModelAttribute("searchVO") ComtnmenucreatdtlsDefaultVO searchVO) throws Exception {
        return comtnmenucreatdtlsService.selectComtnmenucreatdtls(comtnmenucreatdtlsVO);
    }

    @RequestMapping("/comtnmenucreatdtls/updateComtnmenucreatdtls.do")
    public String updateComtnmenucreatdtls(
            ComtnmenucreatdtlsVO comtnmenucreatdtlsVO,
            @ModelAttribute("searchVO") ComtnmenucreatdtlsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnmenucreatdtlsService.updateComtnmenucreatdtls(comtnmenucreatdtlsVO);
        status.setComplete();
        return "forward:/comtnmenucreatdtls/ComtnmenucreatdtlsList.do";
    }
    
    @RequestMapping("/comtnmenucreatdtls/deleteComtnmenucreatdtls.do")
    public String deleteComtnmenucreatdtls(
            ComtnmenucreatdtlsVO comtnmenucreatdtlsVO,
            @ModelAttribute("searchVO") ComtnmenucreatdtlsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnmenucreatdtlsService.deleteComtnmenucreatdtls(comtnmenucreatdtlsVO);
        status.setComplete();
        return "forward:/comtnmenucreatdtls/ComtnmenucreatdtlsList.do";
    }

}
