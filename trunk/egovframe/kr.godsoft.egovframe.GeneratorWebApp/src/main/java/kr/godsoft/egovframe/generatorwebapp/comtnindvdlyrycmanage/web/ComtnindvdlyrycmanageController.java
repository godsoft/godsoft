package kr.godsoft.egovframe.generatorwebapp.comtnindvdlyrycmanage.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtnindvdlyrycmanage.service.ComtnindvdlyrycmanageService;
import kr.godsoft.egovframe.generatorwebapp.comtnindvdlyrycmanage.service.ComtnindvdlyrycmanageDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnindvdlyrycmanage.service.ComtnindvdlyrycmanageVO;

/**
 * @Class Name : ComtnindvdlyrycmanageController.java
 * @Description : Comtnindvdlyrycmanage Controller class
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
@SessionAttributes(types=ComtnindvdlyrycmanageVO.class)
public class ComtnindvdlyrycmanageController {

    @Resource(name = "comtnindvdlyrycmanageService")
    private ComtnindvdlyrycmanageService comtnindvdlyrycmanageService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnindvdlyrycmanage 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnindvdlyrycmanageDefaultVO
	 * @return "/comtnindvdlyrycmanage/ComtnindvdlyrycmanageList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnindvdlyrycmanage/ComtnindvdlyrycmanageList.do")
    public String selectComtnindvdlyrycmanageList(@ModelAttribute("searchVO") ComtnindvdlyrycmanageDefaultVO searchVO, 
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
		
        List comtnindvdlyrycmanageList = comtnindvdlyrycmanageService.selectComtnindvdlyrycmanageList(searchVO);
        model.addAttribute("resultList", comtnindvdlyrycmanageList);
        
        int totCnt = comtnindvdlyrycmanageService.selectComtnindvdlyrycmanageListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnindvdlyrycmanage/ComtnindvdlyrycmanageList";
    } 
    
    @RequestMapping("/comtnindvdlyrycmanage/addComtnindvdlyrycmanageView.do")
    public String addComtnindvdlyrycmanageView(
            @ModelAttribute("searchVO") ComtnindvdlyrycmanageDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnindvdlyrycmanageVO", new ComtnindvdlyrycmanageVO());
        return "/comtnindvdlyrycmanage/ComtnindvdlyrycmanageRegister";
    }
    
    @RequestMapping("/comtnindvdlyrycmanage/addComtnindvdlyrycmanage.do")
    public String addComtnindvdlyrycmanage(
            ComtnindvdlyrycmanageVO comtnindvdlyrycmanageVO,
            @ModelAttribute("searchVO") ComtnindvdlyrycmanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnindvdlyrycmanageService.insertComtnindvdlyrycmanage(comtnindvdlyrycmanageVO);
        status.setComplete();
        return "forward:/comtnindvdlyrycmanage/ComtnindvdlyrycmanageList.do";
    }
    
    @RequestMapping("/comtnindvdlyrycmanage/updateComtnindvdlyrycmanageView.do")
    public String updateComtnindvdlyrycmanageView(
            @RequestParam("occrrncYear") String occrrncYear ,
            @RequestParam("userId") String userId ,
            @ModelAttribute("searchVO") ComtnindvdlyrycmanageDefaultVO searchVO, Model model)
            throws Exception {
        ComtnindvdlyrycmanageVO comtnindvdlyrycmanageVO = new ComtnindvdlyrycmanageVO();
        comtnindvdlyrycmanageVO.setOccrrncYear(occrrncYear);
        comtnindvdlyrycmanageVO.setUserId(userId);
;        
        // 변수명은 CoC 에 따라 comtnindvdlyrycmanageVO
        model.addAttribute(selectComtnindvdlyrycmanage(comtnindvdlyrycmanageVO, searchVO));
        return "/comtnindvdlyrycmanage/ComtnindvdlyrycmanageRegister";
    }

    @RequestMapping("/comtnindvdlyrycmanage/selectComtnindvdlyrycmanage.do")
    public @ModelAttribute("comtnindvdlyrycmanageVO")
    ComtnindvdlyrycmanageVO selectComtnindvdlyrycmanage(
            ComtnindvdlyrycmanageVO comtnindvdlyrycmanageVO,
            @ModelAttribute("searchVO") ComtnindvdlyrycmanageDefaultVO searchVO) throws Exception {
        return comtnindvdlyrycmanageService.selectComtnindvdlyrycmanage(comtnindvdlyrycmanageVO);
    }

    @RequestMapping("/comtnindvdlyrycmanage/updateComtnindvdlyrycmanage.do")
    public String updateComtnindvdlyrycmanage(
            ComtnindvdlyrycmanageVO comtnindvdlyrycmanageVO,
            @ModelAttribute("searchVO") ComtnindvdlyrycmanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnindvdlyrycmanageService.updateComtnindvdlyrycmanage(comtnindvdlyrycmanageVO);
        status.setComplete();
        return "forward:/comtnindvdlyrycmanage/ComtnindvdlyrycmanageList.do";
    }
    
    @RequestMapping("/comtnindvdlyrycmanage/deleteComtnindvdlyrycmanage.do")
    public String deleteComtnindvdlyrycmanage(
            ComtnindvdlyrycmanageVO comtnindvdlyrycmanageVO,
            @ModelAttribute("searchVO") ComtnindvdlyrycmanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnindvdlyrycmanageService.deleteComtnindvdlyrycmanage(comtnindvdlyrycmanageVO);
        status.setComplete();
        return "forward:/comtnindvdlyrycmanage/ComtnindvdlyrycmanageList.do";
    }

}
