package kr.godsoft.egovframe.generatorwebapp.comtnrecentsrchwrd.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtnrecentsrchwrd.service.ComtnrecentsrchwrdService;
import kr.godsoft.egovframe.generatorwebapp.comtnrecentsrchwrd.service.ComtnrecentsrchwrdDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnrecentsrchwrd.service.ComtnrecentsrchwrdVO;

/**
 * @Class Name : ComtnrecentsrchwrdController.java
 * @Description : Comtnrecentsrchwrd Controller class
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
@SessionAttributes(types=ComtnrecentsrchwrdVO.class)
public class ComtnrecentsrchwrdController {

    @Resource(name = "comtnrecentsrchwrdService")
    private ComtnrecentsrchwrdService comtnrecentsrchwrdService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnrecentsrchwrd 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnrecentsrchwrdDefaultVO
	 * @return "/comtnrecentsrchwrd/ComtnrecentsrchwrdList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnrecentsrchwrd/ComtnrecentsrchwrdList.do")
    public String selectComtnrecentsrchwrdList(@ModelAttribute("searchVO") ComtnrecentsrchwrdDefaultVO searchVO, 
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
		
        List comtnrecentsrchwrdList = comtnrecentsrchwrdService.selectComtnrecentsrchwrdList(searchVO);
        model.addAttribute("resultList", comtnrecentsrchwrdList);
        
        int totCnt = comtnrecentsrchwrdService.selectComtnrecentsrchwrdListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnrecentsrchwrd/ComtnrecentsrchwrdList";
    } 
    
    @RequestMapping("/comtnrecentsrchwrd/addComtnrecentsrchwrdView.do")
    public String addComtnrecentsrchwrdView(
            @ModelAttribute("searchVO") ComtnrecentsrchwrdDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnrecentsrchwrdVO", new ComtnrecentsrchwrdVO());
        return "/comtnrecentsrchwrd/ComtnrecentsrchwrdRegister";
    }
    
    @RequestMapping("/comtnrecentsrchwrd/addComtnrecentsrchwrd.do")
    public String addComtnrecentsrchwrd(
            ComtnrecentsrchwrdVO comtnrecentsrchwrdVO,
            @ModelAttribute("searchVO") ComtnrecentsrchwrdDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnrecentsrchwrdService.insertComtnrecentsrchwrd(comtnrecentsrchwrdVO);
        status.setComplete();
        return "forward:/comtnrecentsrchwrd/ComtnrecentsrchwrdList.do";
    }
    
    @RequestMapping("/comtnrecentsrchwrd/updateComtnrecentsrchwrdView.do")
    public String updateComtnrecentsrchwrdView(
            @RequestParam("srchwrdManageId") String srchwrdManageId ,
            @ModelAttribute("searchVO") ComtnrecentsrchwrdDefaultVO searchVO, Model model)
            throws Exception {
        ComtnrecentsrchwrdVO comtnrecentsrchwrdVO = new ComtnrecentsrchwrdVO();
        comtnrecentsrchwrdVO.setSrchwrdManageId(srchwrdManageId);
;        
        // 변수명은 CoC 에 따라 comtnrecentsrchwrdVO
        model.addAttribute(selectComtnrecentsrchwrd(comtnrecentsrchwrdVO, searchVO));
        return "/comtnrecentsrchwrd/ComtnrecentsrchwrdRegister";
    }

    @RequestMapping("/comtnrecentsrchwrd/selectComtnrecentsrchwrd.do")
    public @ModelAttribute("comtnrecentsrchwrdVO")
    ComtnrecentsrchwrdVO selectComtnrecentsrchwrd(
            ComtnrecentsrchwrdVO comtnrecentsrchwrdVO,
            @ModelAttribute("searchVO") ComtnrecentsrchwrdDefaultVO searchVO) throws Exception {
        return comtnrecentsrchwrdService.selectComtnrecentsrchwrd(comtnrecentsrchwrdVO);
    }

    @RequestMapping("/comtnrecentsrchwrd/updateComtnrecentsrchwrd.do")
    public String updateComtnrecentsrchwrd(
            ComtnrecentsrchwrdVO comtnrecentsrchwrdVO,
            @ModelAttribute("searchVO") ComtnrecentsrchwrdDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnrecentsrchwrdService.updateComtnrecentsrchwrd(comtnrecentsrchwrdVO);
        status.setComplete();
        return "forward:/comtnrecentsrchwrd/ComtnrecentsrchwrdList.do";
    }
    
    @RequestMapping("/comtnrecentsrchwrd/deleteComtnrecentsrchwrd.do")
    public String deleteComtnrecentsrchwrd(
            ComtnrecentsrchwrdVO comtnrecentsrchwrdVO,
            @ModelAttribute("searchVO") ComtnrecentsrchwrdDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnrecentsrchwrdService.deleteComtnrecentsrchwrd(comtnrecentsrchwrdVO);
        status.setComplete();
        return "forward:/comtnrecentsrchwrd/ComtnrecentsrchwrdList.do";
    }

}
