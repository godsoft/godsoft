package kr.godsoft.egovframe.generatorwebapp.comtnrecentsrchwrdmanage.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnrecentsrchwrdmanage.service.ComtnrecentsrchwrdmanageService;
import kr.godsoft.egovframe.generatorwebapp.comtnrecentsrchwrdmanage.service.ComtnrecentsrchwrdmanageDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnrecentsrchwrdmanage.service.ComtnrecentsrchwrdmanageVO;

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
 * @Class Name : ComtnrecentsrchwrdmanageController.java
 * @Description : Comtnrecentsrchwrdmanage Controller class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Controller
public class ComtnrecentsrchwrdmanageController {

    @Resource(name = "comtnrecentsrchwrdmanageService")
    private ComtnrecentsrchwrdmanageService comtnrecentsrchwrdmanageService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnrecentsrchwrdmanage 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnrecentsrchwrdmanageVO
	 * @return "/comtnrecentsrchwrdmanage/ComtnrecentsrchwrdmanageList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnrecentsrchwrdmanage/ComtnrecentsrchwrdmanageList.do")
    public String selectComtnrecentsrchwrdmanageList(@ModelAttribute("searchVO") ComtnrecentsrchwrdmanageVO searchVO, 
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
		
        List<EgovMap> comtnrecentsrchwrdmanageList = comtnrecentsrchwrdmanageService.selectComtnrecentsrchwrdmanageList(searchVO);
        model.addAttribute("resultList", comtnrecentsrchwrdmanageList);
        
        int totCnt = comtnrecentsrchwrdmanageService.selectComtnrecentsrchwrdmanageListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnrecentsrchwrdmanage/ComtnrecentsrchwrdmanageList";
    } 
    
    @RequestMapping("/comtnrecentsrchwrdmanage/addComtnrecentsrchwrdmanageView.do")
    public String addComtnrecentsrchwrdmanageView(
            @ModelAttribute("searchVO") ComtnrecentsrchwrdmanageDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnrecentsrchwrdmanageVO", new ComtnrecentsrchwrdmanageVO());
        return "/comtnrecentsrchwrdmanage/ComtnrecentsrchwrdmanageRegister";
    }
    
    @RequestMapping("/comtnrecentsrchwrdmanage/addComtnrecentsrchwrdmanage.do")
    public String addComtnrecentsrchwrdmanage(
            ComtnrecentsrchwrdmanageVO comtnrecentsrchwrdmanageVO,
            @ModelAttribute("searchVO") ComtnrecentsrchwrdmanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnrecentsrchwrdmanageService.insertComtnrecentsrchwrdmanage(comtnrecentsrchwrdmanageVO);
        status.setComplete();
        return "forward:/comtnrecentsrchwrdmanage/ComtnrecentsrchwrdmanageList.do";
    }
    
    @RequestMapping("/comtnrecentsrchwrdmanage/updateComtnrecentsrchwrdmanageView.do")
    public String updateComtnrecentsrchwrdmanageView(
            @RequestParam("srchwrdManageId") String srchwrdManageId ,
            @ModelAttribute("searchVO") ComtnrecentsrchwrdmanageDefaultVO searchVO, Model model)
            throws Exception {
        ComtnrecentsrchwrdmanageVO comtnrecentsrchwrdmanageVO = new ComtnrecentsrchwrdmanageVO();
        comtnrecentsrchwrdmanageVO.setSrchwrdManageId(srchwrdManageId);
;        
        // 변수명은 CoC 에 따라 comtnrecentsrchwrdmanageVO
        model.addAttribute(selectComtnrecentsrchwrdmanage(comtnrecentsrchwrdmanageVO, searchVO));
        return "/comtnrecentsrchwrdmanage/ComtnrecentsrchwrdmanageRegister";
    }

    @RequestMapping("/comtnrecentsrchwrdmanage/selectComtnrecentsrchwrdmanage.do")
    public @ModelAttribute("comtnrecentsrchwrdmanageVO")
    ComtnrecentsrchwrdmanageVO selectComtnrecentsrchwrdmanage(
            ComtnrecentsrchwrdmanageVO comtnrecentsrchwrdmanageVO,
            @ModelAttribute("searchVO") ComtnrecentsrchwrdmanageDefaultVO searchVO) throws Exception {
        return comtnrecentsrchwrdmanageService.selectComtnrecentsrchwrdmanage(comtnrecentsrchwrdmanageVO);
    }

    @RequestMapping("/comtnrecentsrchwrdmanage/updateComtnrecentsrchwrdmanage.do")
    public String updateComtnrecentsrchwrdmanage(
            ComtnrecentsrchwrdmanageVO comtnrecentsrchwrdmanageVO,
            @ModelAttribute("searchVO") ComtnrecentsrchwrdmanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnrecentsrchwrdmanageService.updateComtnrecentsrchwrdmanage(comtnrecentsrchwrdmanageVO);
        status.setComplete();
        return "forward:/comtnrecentsrchwrdmanage/ComtnrecentsrchwrdmanageList.do";
    }
    
    @RequestMapping("/comtnrecentsrchwrdmanage/deleteComtnrecentsrchwrdmanage.do")
    public String deleteComtnrecentsrchwrdmanage(
            ComtnrecentsrchwrdmanageVO comtnrecentsrchwrdmanageVO,
            @ModelAttribute("searchVO") ComtnrecentsrchwrdmanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnrecentsrchwrdmanageService.deleteComtnrecentsrchwrdmanage(comtnrecentsrchwrdmanageVO);
        status.setComplete();
        return "forward:/comtnrecentsrchwrdmanage/ComtnrecentsrchwrdmanageList.do";
    }

}
