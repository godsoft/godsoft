package kr.godsoft.egovframe.generatorwebapp.comtnonlinemanual.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtnonlinemanual.service.ComtnonlinemanualService;
import kr.godsoft.egovframe.generatorwebapp.comtnonlinemanual.service.ComtnonlinemanualDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnonlinemanual.service.ComtnonlinemanualVO;

/**
 * @Class Name : ComtnonlinemanualController.java
 * @Description : Comtnonlinemanual Controller class
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
@SessionAttributes(types=ComtnonlinemanualVO.class)
public class ComtnonlinemanualController {

    @Resource(name = "comtnonlinemanualService")
    private ComtnonlinemanualService comtnonlinemanualService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnonlinemanual 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnonlinemanualDefaultVO
	 * @return "/comtnonlinemanual/ComtnonlinemanualList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnonlinemanual/ComtnonlinemanualList.do")
    public String selectComtnonlinemanualList(@ModelAttribute("searchVO") ComtnonlinemanualDefaultVO searchVO, 
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
		
        List comtnonlinemanualList = comtnonlinemanualService.selectComtnonlinemanualList(searchVO);
        model.addAttribute("resultList", comtnonlinemanualList);
        
        int totCnt = comtnonlinemanualService.selectComtnonlinemanualListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnonlinemanual/ComtnonlinemanualList";
    } 
    
    @RequestMapping("/comtnonlinemanual/addComtnonlinemanualView.do")
    public String addComtnonlinemanualView(
            @ModelAttribute("searchVO") ComtnonlinemanualDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnonlinemanualVO", new ComtnonlinemanualVO());
        return "/comtnonlinemanual/ComtnonlinemanualRegister";
    }
    
    @RequestMapping("/comtnonlinemanual/addComtnonlinemanual.do")
    public String addComtnonlinemanual(
            ComtnonlinemanualVO comtnonlinemanualVO,
            @ModelAttribute("searchVO") ComtnonlinemanualDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnonlinemanualService.insertComtnonlinemanual(comtnonlinemanualVO);
        status.setComplete();
        return "forward:/comtnonlinemanual/ComtnonlinemanualList.do";
    }
    
    @RequestMapping("/comtnonlinemanual/updateComtnonlinemanualView.do")
    public String updateComtnonlinemanualView(
            @RequestParam("onlineMnlId") String onlineMnlId ,
            @ModelAttribute("searchVO") ComtnonlinemanualDefaultVO searchVO, Model model)
            throws Exception {
        ComtnonlinemanualVO comtnonlinemanualVO = new ComtnonlinemanualVO();
        comtnonlinemanualVO.setOnlineMnlId(onlineMnlId);
;        
        // 변수명은 CoC 에 따라 comtnonlinemanualVO
        model.addAttribute(selectComtnonlinemanual(comtnonlinemanualVO, searchVO));
        return "/comtnonlinemanual/ComtnonlinemanualRegister";
    }

    @RequestMapping("/comtnonlinemanual/selectComtnonlinemanual.do")
    public @ModelAttribute("comtnonlinemanualVO")
    ComtnonlinemanualVO selectComtnonlinemanual(
            ComtnonlinemanualVO comtnonlinemanualVO,
            @ModelAttribute("searchVO") ComtnonlinemanualDefaultVO searchVO) throws Exception {
        return comtnonlinemanualService.selectComtnonlinemanual(comtnonlinemanualVO);
    }

    @RequestMapping("/comtnonlinemanual/updateComtnonlinemanual.do")
    public String updateComtnonlinemanual(
            ComtnonlinemanualVO comtnonlinemanualVO,
            @ModelAttribute("searchVO") ComtnonlinemanualDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnonlinemanualService.updateComtnonlinemanual(comtnonlinemanualVO);
        status.setComplete();
        return "forward:/comtnonlinemanual/ComtnonlinemanualList.do";
    }
    
    @RequestMapping("/comtnonlinemanual/deleteComtnonlinemanual.do")
    public String deleteComtnonlinemanual(
            ComtnonlinemanualVO comtnonlinemanualVO,
            @ModelAttribute("searchVO") ComtnonlinemanualDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnonlinemanualService.deleteComtnonlinemanual(comtnonlinemanualVO);
        status.setComplete();
        return "forward:/comtnonlinemanual/ComtnonlinemanualList.do";
    }

}
