package kr.godsoft.egovframe.generatorwebapp.comtnctsnnmanage.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtnctsnnmanage.service.ComtnctsnnmanageService;
import kr.godsoft.egovframe.generatorwebapp.comtnctsnnmanage.service.ComtnctsnnmanageDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnctsnnmanage.service.ComtnctsnnmanageVO;

/**
 * @Class Name : ComtnctsnnmanageController.java
 * @Description : Comtnctsnnmanage Controller class
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
@SessionAttributes(types=ComtnctsnnmanageVO.class)
public class ComtnctsnnmanageController {

    @Resource(name = "comtnctsnnmanageService")
    private ComtnctsnnmanageService comtnctsnnmanageService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnctsnnmanage 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnctsnnmanageDefaultVO
	 * @return "/comtnctsnnmanage/ComtnctsnnmanageList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnctsnnmanage/ComtnctsnnmanageList.do")
    public String selectComtnctsnnmanageList(@ModelAttribute("searchVO") ComtnctsnnmanageDefaultVO searchVO, 
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
		
        List comtnctsnnmanageList = comtnctsnnmanageService.selectComtnctsnnmanageList(searchVO);
        model.addAttribute("resultList", comtnctsnnmanageList);
        
        int totCnt = comtnctsnnmanageService.selectComtnctsnnmanageListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnctsnnmanage/ComtnctsnnmanageList";
    } 
    
    @RequestMapping("/comtnctsnnmanage/addComtnctsnnmanageView.do")
    public String addComtnctsnnmanageView(
            @ModelAttribute("searchVO") ComtnctsnnmanageDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnctsnnmanageVO", new ComtnctsnnmanageVO());
        return "/comtnctsnnmanage/ComtnctsnnmanageRegister";
    }
    
    @RequestMapping("/comtnctsnnmanage/addComtnctsnnmanage.do")
    public String addComtnctsnnmanage(
            ComtnctsnnmanageVO comtnctsnnmanageVO,
            @ModelAttribute("searchVO") ComtnctsnnmanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnctsnnmanageService.insertComtnctsnnmanage(comtnctsnnmanageVO);
        status.setComplete();
        return "forward:/comtnctsnnmanage/ComtnctsnnmanageList.do";
    }
    
    @RequestMapping("/comtnctsnnmanage/updateComtnctsnnmanageView.do")
    public String updateComtnctsnnmanageView(
            @RequestParam("ctsnnId") String ctsnnId ,
            @ModelAttribute("searchVO") ComtnctsnnmanageDefaultVO searchVO, Model model)
            throws Exception {
        ComtnctsnnmanageVO comtnctsnnmanageVO = new ComtnctsnnmanageVO();
        comtnctsnnmanageVO.setCtsnnId(ctsnnId);
;        
        // 변수명은 CoC 에 따라 comtnctsnnmanageVO
        model.addAttribute(selectComtnctsnnmanage(comtnctsnnmanageVO, searchVO));
        return "/comtnctsnnmanage/ComtnctsnnmanageRegister";
    }

    @RequestMapping("/comtnctsnnmanage/selectComtnctsnnmanage.do")
    public @ModelAttribute("comtnctsnnmanageVO")
    ComtnctsnnmanageVO selectComtnctsnnmanage(
            ComtnctsnnmanageVO comtnctsnnmanageVO,
            @ModelAttribute("searchVO") ComtnctsnnmanageDefaultVO searchVO) throws Exception {
        return comtnctsnnmanageService.selectComtnctsnnmanage(comtnctsnnmanageVO);
    }

    @RequestMapping("/comtnctsnnmanage/updateComtnctsnnmanage.do")
    public String updateComtnctsnnmanage(
            ComtnctsnnmanageVO comtnctsnnmanageVO,
            @ModelAttribute("searchVO") ComtnctsnnmanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnctsnnmanageService.updateComtnctsnnmanage(comtnctsnnmanageVO);
        status.setComplete();
        return "forward:/comtnctsnnmanage/ComtnctsnnmanageList.do";
    }
    
    @RequestMapping("/comtnctsnnmanage/deleteComtnctsnnmanage.do")
    public String deleteComtnctsnnmanage(
            ComtnctsnnmanageVO comtnctsnnmanageVO,
            @ModelAttribute("searchVO") ComtnctsnnmanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnctsnnmanageService.deleteComtnctsnnmanage(comtnctsnnmanageVO);
        status.setComplete();
        return "forward:/comtnctsnnmanage/ComtnctsnnmanageList.do";
    }

}
