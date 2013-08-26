package kr.godsoft.egovframe.generatorwebapp.comtnonlinepollmanage.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnonlinepollmanage.service.ComtnonlinepollmanageService;
import kr.godsoft.egovframe.generatorwebapp.comtnonlinepollmanage.service.ComtnonlinepollmanageDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnonlinepollmanage.service.ComtnonlinepollmanageVO;

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
 * @Class Name : ComtnonlinepollmanageController.java
 * @Description : Comtnonlinepollmanage Controller class
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
public class ComtnonlinepollmanageController {

    @Resource(name = "comtnonlinepollmanageService")
    private ComtnonlinepollmanageService comtnonlinepollmanageService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNONLINEPOLLMANAGE 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnonlinepollmanageVO
	 * @return "/comtnonlinepollmanage/ComtnonlinepollmanageList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnonlinepollmanage/ComtnonlinepollmanageList.do")
    public String selectComtnonlinepollmanageList(@ModelAttribute("searchVO") ComtnonlinepollmanageVO searchVO, 
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
		
        List<EgovMap> comtnonlinepollmanageList = comtnonlinepollmanageService.selectComtnonlinepollmanageList(searchVO);
        model.addAttribute("resultList", comtnonlinepollmanageList);
        
        int totCnt = comtnonlinepollmanageService.selectComtnonlinepollmanageListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnonlinepollmanage/ComtnonlinepollmanageList";
    } 
    
    @RequestMapping("/comtnonlinepollmanage/addComtnonlinepollmanageView.do")
    public String addComtnonlinepollmanageView(
            @ModelAttribute("searchVO") ComtnonlinepollmanageDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnonlinepollmanageVO", new ComtnonlinepollmanageVO());
        return "/comtnonlinepollmanage/ComtnonlinepollmanageRegister";
    }
    
    @RequestMapping("/comtnonlinepollmanage/addComtnonlinepollmanage.do")
    public String addComtnonlinepollmanage(
            ComtnonlinepollmanageVO comtnonlinepollmanageVO,
            @ModelAttribute("searchVO") ComtnonlinepollmanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnonlinepollmanageService.insertComtnonlinepollmanage(comtnonlinepollmanageVO);
        status.setComplete();
        return "forward:/comtnonlinepollmanage/ComtnonlinepollmanageList.do";
    }
    
    @RequestMapping("/comtnonlinepollmanage/updateComtnonlinepollmanageView.do")
    public String updateComtnonlinepollmanageView(
            @RequestParam("pollId") String pollId ,
            @ModelAttribute("searchVO") ComtnonlinepollmanageDefaultVO searchVO, Model model)
            throws Exception {
        ComtnonlinepollmanageVO comtnonlinepollmanageVO = new ComtnonlinepollmanageVO();
        comtnonlinepollmanageVO.setPollId(pollId);
;        
        // 변수명은 CoC 에 따라 comtnonlinepollmanageVO
        model.addAttribute(selectComtnonlinepollmanage(comtnonlinepollmanageVO, searchVO));
        return "/comtnonlinepollmanage/ComtnonlinepollmanageRegister";
    }

    @RequestMapping("/comtnonlinepollmanage/selectComtnonlinepollmanage.do")
    public @ModelAttribute("comtnonlinepollmanageVO")
    ComtnonlinepollmanageVO selectComtnonlinepollmanage(
            ComtnonlinepollmanageVO comtnonlinepollmanageVO,
            @ModelAttribute("searchVO") ComtnonlinepollmanageDefaultVO searchVO) throws Exception {
        return comtnonlinepollmanageService.selectComtnonlinepollmanage(comtnonlinepollmanageVO);
    }

    @RequestMapping("/comtnonlinepollmanage/updateComtnonlinepollmanage.do")
    public String updateComtnonlinepollmanage(
            ComtnonlinepollmanageVO comtnonlinepollmanageVO,
            @ModelAttribute("searchVO") ComtnonlinepollmanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnonlinepollmanageService.updateComtnonlinepollmanage(comtnonlinepollmanageVO);
        status.setComplete();
        return "forward:/comtnonlinepollmanage/ComtnonlinepollmanageList.do";
    }
    
    @RequestMapping("/comtnonlinepollmanage/deleteComtnonlinepollmanage.do")
    public String deleteComtnonlinepollmanage(
            ComtnonlinepollmanageVO comtnonlinepollmanageVO,
            @ModelAttribute("searchVO") ComtnonlinepollmanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnonlinepollmanageService.deleteComtnonlinepollmanage(comtnonlinepollmanageVO);
        status.setComplete();
        return "forward:/comtnonlinepollmanage/ComtnonlinepollmanageList.do";
    }

}
