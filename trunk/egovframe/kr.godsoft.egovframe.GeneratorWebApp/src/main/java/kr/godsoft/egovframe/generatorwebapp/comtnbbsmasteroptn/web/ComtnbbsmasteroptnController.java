package kr.godsoft.egovframe.generatorwebapp.comtnbbsmasteroptn.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnbbsmasteroptn.service.ComtnbbsmasteroptnService;
import kr.godsoft.egovframe.generatorwebapp.comtnbbsmasteroptn.service.ComtnbbsmasteroptnDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbbsmasteroptn.service.ComtnbbsmasteroptnVO;

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
 * @Class Name : ComtnbbsmasteroptnController.java
 * @Description : Comtnbbsmasteroptn Controller class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Controller
@SessionAttributes(types=ComtnbbsmasteroptnVO.class)
public class ComtnbbsmasteroptnController {

    @Resource(name = "comtnbbsmasteroptnService")
    private ComtnbbsmasteroptnService comtnbbsmasteroptnService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnbbsmasteroptn 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnbbsmasteroptnVO
	 * @return "/comtnbbsmasteroptn/ComtnbbsmasteroptnList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnbbsmasteroptn/ComtnbbsmasteroptnList.do")
    public String selectComtnbbsmasteroptnList(@ModelAttribute("searchVO") ComtnbbsmasteroptnVO searchVO, 
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
		
        List<EgovMap> comtnbbsmasteroptnList = comtnbbsmasteroptnService.selectComtnbbsmasteroptnList(searchVO);
        model.addAttribute("resultList", comtnbbsmasteroptnList);
        
        int totCnt = comtnbbsmasteroptnService.selectComtnbbsmasteroptnListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnbbsmasteroptn/ComtnbbsmasteroptnList";
    } 
    
    @RequestMapping("/comtnbbsmasteroptn/addComtnbbsmasteroptnView.do")
    public String addComtnbbsmasteroptnView(
            @ModelAttribute("searchVO") ComtnbbsmasteroptnDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnbbsmasteroptnVO", new ComtnbbsmasteroptnVO());
        return "/comtnbbsmasteroptn/ComtnbbsmasteroptnRegister";
    }
    
    @RequestMapping("/comtnbbsmasteroptn/addComtnbbsmasteroptn.do")
    public String addComtnbbsmasteroptn(
            ComtnbbsmasteroptnVO comtnbbsmasteroptnVO,
            @ModelAttribute("searchVO") ComtnbbsmasteroptnDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbbsmasteroptnService.insertComtnbbsmasteroptn(comtnbbsmasteroptnVO);
        status.setComplete();
        return "forward:/comtnbbsmasteroptn/ComtnbbsmasteroptnList.do";
    }
    
    @RequestMapping("/comtnbbsmasteroptn/updateComtnbbsmasteroptnView.do")
    public String updateComtnbbsmasteroptnView(
            @RequestParam("bbsId") String bbsId ,
            @ModelAttribute("searchVO") ComtnbbsmasteroptnDefaultVO searchVO, Model model)
            throws Exception {
        ComtnbbsmasteroptnVO comtnbbsmasteroptnVO = new ComtnbbsmasteroptnVO();
        comtnbbsmasteroptnVO.setBbsId(bbsId);
;        
        // 변수명은 CoC 에 따라 comtnbbsmasteroptnVO
        model.addAttribute(selectComtnbbsmasteroptn(comtnbbsmasteroptnVO, searchVO));
        return "/comtnbbsmasteroptn/ComtnbbsmasteroptnRegister";
    }

    @RequestMapping("/comtnbbsmasteroptn/selectComtnbbsmasteroptn.do")
    public @ModelAttribute("comtnbbsmasteroptnVO")
    ComtnbbsmasteroptnVO selectComtnbbsmasteroptn(
            ComtnbbsmasteroptnVO comtnbbsmasteroptnVO,
            @ModelAttribute("searchVO") ComtnbbsmasteroptnDefaultVO searchVO) throws Exception {
        return comtnbbsmasteroptnService.selectComtnbbsmasteroptn(comtnbbsmasteroptnVO);
    }

    @RequestMapping("/comtnbbsmasteroptn/updateComtnbbsmasteroptn.do")
    public String updateComtnbbsmasteroptn(
            ComtnbbsmasteroptnVO comtnbbsmasteroptnVO,
            @ModelAttribute("searchVO") ComtnbbsmasteroptnDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbbsmasteroptnService.updateComtnbbsmasteroptn(comtnbbsmasteroptnVO);
        status.setComplete();
        return "forward:/comtnbbsmasteroptn/ComtnbbsmasteroptnList.do";
    }
    
    @RequestMapping("/comtnbbsmasteroptn/deleteComtnbbsmasteroptn.do")
    public String deleteComtnbbsmasteroptn(
            ComtnbbsmasteroptnVO comtnbbsmasteroptnVO,
            @ModelAttribute("searchVO") ComtnbbsmasteroptnDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbbsmasteroptnService.deleteComtnbbsmasteroptn(comtnbbsmasteroptnVO);
        status.setComplete();
        return "forward:/comtnbbsmasteroptn/ComtnbbsmasteroptnList.do";
    }

}
