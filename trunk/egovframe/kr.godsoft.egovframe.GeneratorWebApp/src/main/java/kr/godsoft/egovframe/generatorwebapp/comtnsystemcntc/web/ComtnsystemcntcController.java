package kr.godsoft.egovframe.generatorwebapp.comtnsystemcntc.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtnsystemcntc.service.ComtnsystemcntcService;
import kr.godsoft.egovframe.generatorwebapp.comtnsystemcntc.service.ComtnsystemcntcDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnsystemcntc.service.ComtnsystemcntcVO;

/**
 * @Class Name : ComtnsystemcntcController.java
 * @Description : Comtnsystemcntc Controller class
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
@SessionAttributes(types=ComtnsystemcntcVO.class)
public class ComtnsystemcntcController {

    @Resource(name = "comtnsystemcntcService")
    private ComtnsystemcntcService comtnsystemcntcService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnsystemcntc 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnsystemcntcDefaultVO
	 * @return "/comtnsystemcntc/ComtnsystemcntcList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnsystemcntc/ComtnsystemcntcList.do")
    public String selectComtnsystemcntcList(@ModelAttribute("searchVO") ComtnsystemcntcDefaultVO searchVO, 
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
		
        List comtnsystemcntcList = comtnsystemcntcService.selectComtnsystemcntcList(searchVO);
        model.addAttribute("resultList", comtnsystemcntcList);
        
        int totCnt = comtnsystemcntcService.selectComtnsystemcntcListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnsystemcntc/ComtnsystemcntcList";
    } 
    
    @RequestMapping("/comtnsystemcntc/addComtnsystemcntcView.do")
    public String addComtnsystemcntcView(
            @ModelAttribute("searchVO") ComtnsystemcntcDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnsystemcntcVO", new ComtnsystemcntcVO());
        return "/comtnsystemcntc/ComtnsystemcntcRegister";
    }
    
    @RequestMapping("/comtnsystemcntc/addComtnsystemcntc.do")
    public String addComtnsystemcntc(
            ComtnsystemcntcVO comtnsystemcntcVO,
            @ModelAttribute("searchVO") ComtnsystemcntcDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnsystemcntcService.insertComtnsystemcntc(comtnsystemcntcVO);
        status.setComplete();
        return "forward:/comtnsystemcntc/ComtnsystemcntcList.do";
    }
    
    @RequestMapping("/comtnsystemcntc/updateComtnsystemcntcView.do")
    public String updateComtnsystemcntcView(
            @RequestParam("cntcId") String cntcId ,
            @ModelAttribute("searchVO") ComtnsystemcntcDefaultVO searchVO, Model model)
            throws Exception {
        ComtnsystemcntcVO comtnsystemcntcVO = new ComtnsystemcntcVO();
        comtnsystemcntcVO.setCntcId(cntcId);
;        
        // 변수명은 CoC 에 따라 comtnsystemcntcVO
        model.addAttribute(selectComtnsystemcntc(comtnsystemcntcVO, searchVO));
        return "/comtnsystemcntc/ComtnsystemcntcRegister";
    }

    @RequestMapping("/comtnsystemcntc/selectComtnsystemcntc.do")
    public @ModelAttribute("comtnsystemcntcVO")
    ComtnsystemcntcVO selectComtnsystemcntc(
            ComtnsystemcntcVO comtnsystemcntcVO,
            @ModelAttribute("searchVO") ComtnsystemcntcDefaultVO searchVO) throws Exception {
        return comtnsystemcntcService.selectComtnsystemcntc(comtnsystemcntcVO);
    }

    @RequestMapping("/comtnsystemcntc/updateComtnsystemcntc.do")
    public String updateComtnsystemcntc(
            ComtnsystemcntcVO comtnsystemcntcVO,
            @ModelAttribute("searchVO") ComtnsystemcntcDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnsystemcntcService.updateComtnsystemcntc(comtnsystemcntcVO);
        status.setComplete();
        return "forward:/comtnsystemcntc/ComtnsystemcntcList.do";
    }
    
    @RequestMapping("/comtnsystemcntc/deleteComtnsystemcntc.do")
    public String deleteComtnsystemcntc(
            ComtnsystemcntcVO comtnsystemcntcVO,
            @ModelAttribute("searchVO") ComtnsystemcntcDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnsystemcntcService.deleteComtnsystemcntc(comtnsystemcntcVO);
        status.setComplete();
        return "forward:/comtnsystemcntc/ComtnsystemcntcList.do";
    }

}
