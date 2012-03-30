package kr.godsoft.egovframe.generatorwebapp.comtnsmsrecptn.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnsmsrecptn.service.ComtnsmsrecptnService;
import kr.godsoft.egovframe.generatorwebapp.comtnsmsrecptn.service.ComtnsmsrecptnDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnsmsrecptn.service.ComtnsmsrecptnVO;

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
 * @Class Name : ComtnsmsrecptnController.java
 * @Description : Comtnsmsrecptn Controller class
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
public class ComtnsmsrecptnController {

    @Resource(name = "comtnsmsrecptnService")
    private ComtnsmsrecptnService comtnsmsrecptnService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNSMSRECPTN 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnsmsrecptnVO
	 * @return "/comtnsmsrecptn/ComtnsmsrecptnList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnsmsrecptn/ComtnsmsrecptnList.do")
    public String selectComtnsmsrecptnList(@ModelAttribute("searchVO") ComtnsmsrecptnVO searchVO, 
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
		
        List<EgovMap> comtnsmsrecptnList = comtnsmsrecptnService.selectComtnsmsrecptnList(searchVO);
        model.addAttribute("resultList", comtnsmsrecptnList);
        
        int totCnt = comtnsmsrecptnService.selectComtnsmsrecptnListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnsmsrecptn/ComtnsmsrecptnList";
    } 
    
    @RequestMapping("/comtnsmsrecptn/addComtnsmsrecptnView.do")
    public String addComtnsmsrecptnView(
            @ModelAttribute("searchVO") ComtnsmsrecptnDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnsmsrecptnVO", new ComtnsmsrecptnVO());
        return "/comtnsmsrecptn/ComtnsmsrecptnRegister";
    }
    
    @RequestMapping("/comtnsmsrecptn/addComtnsmsrecptn.do")
    public String addComtnsmsrecptn(
            ComtnsmsrecptnVO comtnsmsrecptnVO,
            @ModelAttribute("searchVO") ComtnsmsrecptnDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnsmsrecptnService.insertComtnsmsrecptn(comtnsmsrecptnVO);
        status.setComplete();
        return "forward:/comtnsmsrecptn/ComtnsmsrecptnList.do";
    }
    
    @RequestMapping("/comtnsmsrecptn/updateComtnsmsrecptnView.do")
    public String updateComtnsmsrecptnView(
            @RequestParam("smsId") String smsId ,
            @RequestParam("recptnTelno") String recptnTelno ,
            @ModelAttribute("searchVO") ComtnsmsrecptnDefaultVO searchVO, Model model)
            throws Exception {
        ComtnsmsrecptnVO comtnsmsrecptnVO = new ComtnsmsrecptnVO();
        comtnsmsrecptnVO.setSmsId(smsId);
        comtnsmsrecptnVO.setRecptnTelno(recptnTelno);
;        
        // 변수명은 CoC 에 따라 comtnsmsrecptnVO
        model.addAttribute(selectComtnsmsrecptn(comtnsmsrecptnVO, searchVO));
        return "/comtnsmsrecptn/ComtnsmsrecptnRegister";
    }

    @RequestMapping("/comtnsmsrecptn/selectComtnsmsrecptn.do")
    public @ModelAttribute("comtnsmsrecptnVO")
    ComtnsmsrecptnVO selectComtnsmsrecptn(
            ComtnsmsrecptnVO comtnsmsrecptnVO,
            @ModelAttribute("searchVO") ComtnsmsrecptnDefaultVO searchVO) throws Exception {
        return comtnsmsrecptnService.selectComtnsmsrecptn(comtnsmsrecptnVO);
    }

    @RequestMapping("/comtnsmsrecptn/updateComtnsmsrecptn.do")
    public String updateComtnsmsrecptn(
            ComtnsmsrecptnVO comtnsmsrecptnVO,
            @ModelAttribute("searchVO") ComtnsmsrecptnDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnsmsrecptnService.updateComtnsmsrecptn(comtnsmsrecptnVO);
        status.setComplete();
        return "forward:/comtnsmsrecptn/ComtnsmsrecptnList.do";
    }
    
    @RequestMapping("/comtnsmsrecptn/deleteComtnsmsrecptn.do")
    public String deleteComtnsmsrecptn(
            ComtnsmsrecptnVO comtnsmsrecptnVO,
            @ModelAttribute("searchVO") ComtnsmsrecptnDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnsmsrecptnService.deleteComtnsmsrecptn(comtnsmsrecptnVO);
        status.setComplete();
        return "forward:/comtnsmsrecptn/ComtnsmsrecptnList.do";
    }

}
