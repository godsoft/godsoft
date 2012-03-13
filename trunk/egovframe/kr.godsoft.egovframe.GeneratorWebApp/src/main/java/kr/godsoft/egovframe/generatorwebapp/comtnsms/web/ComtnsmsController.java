package kr.godsoft.egovframe.generatorwebapp.comtnsms.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtnsms.service.ComtnsmsService;
import kr.godsoft.egovframe.generatorwebapp.comtnsms.service.ComtnsmsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnsms.service.ComtnsmsVO;

/**
 * @Class Name : ComtnsmsController.java
 * @Description : Comtnsms Controller class
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
@SessionAttributes(types=ComtnsmsVO.class)
public class ComtnsmsController {

    @Resource(name = "comtnsmsService")
    private ComtnsmsService comtnsmsService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnsms 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnsmsDefaultVO
	 * @return "/comtnsms/ComtnsmsList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnsms/ComtnsmsList.do")
    public String selectComtnsmsList(@ModelAttribute("searchVO") ComtnsmsDefaultVO searchVO, 
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
		
        List comtnsmsList = comtnsmsService.selectComtnsmsList(searchVO);
        model.addAttribute("resultList", comtnsmsList);
        
        int totCnt = comtnsmsService.selectComtnsmsListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnsms/ComtnsmsList";
    } 
    
    @RequestMapping("/comtnsms/addComtnsmsView.do")
    public String addComtnsmsView(
            @ModelAttribute("searchVO") ComtnsmsDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnsmsVO", new ComtnsmsVO());
        return "/comtnsms/ComtnsmsRegister";
    }
    
    @RequestMapping("/comtnsms/addComtnsms.do")
    public String addComtnsms(
            ComtnsmsVO comtnsmsVO,
            @ModelAttribute("searchVO") ComtnsmsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnsmsService.insertComtnsms(comtnsmsVO);
        status.setComplete();
        return "forward:/comtnsms/ComtnsmsList.do";
    }
    
    @RequestMapping("/comtnsms/updateComtnsmsView.do")
    public String updateComtnsmsView(
            @RequestParam("smsId") String smsId ,
            @ModelAttribute("searchVO") ComtnsmsDefaultVO searchVO, Model model)
            throws Exception {
        ComtnsmsVO comtnsmsVO = new ComtnsmsVO();
        comtnsmsVO.setSmsId(smsId);
;        
        // 변수명은 CoC 에 따라 comtnsmsVO
        model.addAttribute(selectComtnsms(comtnsmsVO, searchVO));
        return "/comtnsms/ComtnsmsRegister";
    }

    @RequestMapping("/comtnsms/selectComtnsms.do")
    public @ModelAttribute("comtnsmsVO")
    ComtnsmsVO selectComtnsms(
            ComtnsmsVO comtnsmsVO,
            @ModelAttribute("searchVO") ComtnsmsDefaultVO searchVO) throws Exception {
        return comtnsmsService.selectComtnsms(comtnsmsVO);
    }

    @RequestMapping("/comtnsms/updateComtnsms.do")
    public String updateComtnsms(
            ComtnsmsVO comtnsmsVO,
            @ModelAttribute("searchVO") ComtnsmsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnsmsService.updateComtnsms(comtnsmsVO);
        status.setComplete();
        return "forward:/comtnsms/ComtnsmsList.do";
    }
    
    @RequestMapping("/comtnsms/deleteComtnsms.do")
    public String deleteComtnsms(
            ComtnsmsVO comtnsmsVO,
            @ModelAttribute("searchVO") ComtnsmsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnsmsService.deleteComtnsms(comtnsmsVO);
        status.setComplete();
        return "forward:/comtnsms/ComtnsmsList.do";
    }

}
