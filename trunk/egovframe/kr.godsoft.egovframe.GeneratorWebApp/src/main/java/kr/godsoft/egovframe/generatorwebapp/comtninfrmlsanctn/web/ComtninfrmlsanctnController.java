package kr.godsoft.egovframe.generatorwebapp.comtninfrmlsanctn.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtninfrmlsanctn.service.ComtninfrmlsanctnService;
import kr.godsoft.egovframe.generatorwebapp.comtninfrmlsanctn.service.ComtninfrmlsanctnDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtninfrmlsanctn.service.ComtninfrmlsanctnVO;

/**
 * @Class Name : ComtninfrmlsanctnController.java
 * @Description : Comtninfrmlsanctn Controller class
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
@SessionAttributes(types=ComtninfrmlsanctnVO.class)
public class ComtninfrmlsanctnController {

    @Resource(name = "comtninfrmlsanctnService")
    private ComtninfrmlsanctnService comtninfrmlsanctnService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtninfrmlsanctn 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtninfrmlsanctnDefaultVO
	 * @return "/comtninfrmlsanctn/ComtninfrmlsanctnList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtninfrmlsanctn/ComtninfrmlsanctnList.do")
    public String selectComtninfrmlsanctnList(@ModelAttribute("searchVO") ComtninfrmlsanctnDefaultVO searchVO, 
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
		
        List comtninfrmlsanctnList = comtninfrmlsanctnService.selectComtninfrmlsanctnList(searchVO);
        model.addAttribute("resultList", comtninfrmlsanctnList);
        
        int totCnt = comtninfrmlsanctnService.selectComtninfrmlsanctnListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtninfrmlsanctn/ComtninfrmlsanctnList";
    } 
    
    @RequestMapping("/comtninfrmlsanctn/addComtninfrmlsanctnView.do")
    public String addComtninfrmlsanctnView(
            @ModelAttribute("searchVO") ComtninfrmlsanctnDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtninfrmlsanctnVO", new ComtninfrmlsanctnVO());
        return "/comtninfrmlsanctn/ComtninfrmlsanctnRegister";
    }
    
    @RequestMapping("/comtninfrmlsanctn/addComtninfrmlsanctn.do")
    public String addComtninfrmlsanctn(
            ComtninfrmlsanctnVO comtninfrmlsanctnVO,
            @ModelAttribute("searchVO") ComtninfrmlsanctnDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtninfrmlsanctnService.insertComtninfrmlsanctn(comtninfrmlsanctnVO);
        status.setComplete();
        return "forward:/comtninfrmlsanctn/ComtninfrmlsanctnList.do";
    }
    
    @RequestMapping("/comtninfrmlsanctn/updateComtninfrmlsanctnView.do")
    public String updateComtninfrmlsanctnView(
            @RequestParam("infrmlSanctnId") String infrmlSanctnId ,
            @ModelAttribute("searchVO") ComtninfrmlsanctnDefaultVO searchVO, Model model)
            throws Exception {
        ComtninfrmlsanctnVO comtninfrmlsanctnVO = new ComtninfrmlsanctnVO();
        comtninfrmlsanctnVO.setInfrmlSanctnId(infrmlSanctnId);
;        
        // 변수명은 CoC 에 따라 comtninfrmlsanctnVO
        model.addAttribute(selectComtninfrmlsanctn(comtninfrmlsanctnVO, searchVO));
        return "/comtninfrmlsanctn/ComtninfrmlsanctnRegister";
    }

    @RequestMapping("/comtninfrmlsanctn/selectComtninfrmlsanctn.do")
    public @ModelAttribute("comtninfrmlsanctnVO")
    ComtninfrmlsanctnVO selectComtninfrmlsanctn(
            ComtninfrmlsanctnVO comtninfrmlsanctnVO,
            @ModelAttribute("searchVO") ComtninfrmlsanctnDefaultVO searchVO) throws Exception {
        return comtninfrmlsanctnService.selectComtninfrmlsanctn(comtninfrmlsanctnVO);
    }

    @RequestMapping("/comtninfrmlsanctn/updateComtninfrmlsanctn.do")
    public String updateComtninfrmlsanctn(
            ComtninfrmlsanctnVO comtninfrmlsanctnVO,
            @ModelAttribute("searchVO") ComtninfrmlsanctnDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtninfrmlsanctnService.updateComtninfrmlsanctn(comtninfrmlsanctnVO);
        status.setComplete();
        return "forward:/comtninfrmlsanctn/ComtninfrmlsanctnList.do";
    }
    
    @RequestMapping("/comtninfrmlsanctn/deleteComtninfrmlsanctn.do")
    public String deleteComtninfrmlsanctn(
            ComtninfrmlsanctnVO comtninfrmlsanctnVO,
            @ModelAttribute("searchVO") ComtninfrmlsanctnDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtninfrmlsanctnService.deleteComtninfrmlsanctn(comtninfrmlsanctnVO);
        status.setComplete();
        return "forward:/comtninfrmlsanctn/ComtninfrmlsanctnList.do";
    }

}
