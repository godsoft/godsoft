package kr.godsoft.egovframe.generatorwebapp.comtnpopupmanage.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnpopupmanage.service.ComtnpopupmanageService;
import kr.godsoft.egovframe.generatorwebapp.comtnpopupmanage.service.ComtnpopupmanageDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnpopupmanage.service.ComtnpopupmanageVO;

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
 * @Class Name : ComtnpopupmanageController.java
 * @Description : Comtnpopupmanage Controller class
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
public class ComtnpopupmanageController {

    @Resource(name = "comtnpopupmanageService")
    private ComtnpopupmanageService comtnpopupmanageService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnpopupmanage 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnpopupmanageVO
	 * @return "/comtnpopupmanage/ComtnpopupmanageList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnpopupmanage/ComtnpopupmanageList.do")
    public String selectComtnpopupmanageList(@ModelAttribute("searchVO") ComtnpopupmanageVO searchVO, 
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
		
        List<EgovMap> comtnpopupmanageList = comtnpopupmanageService.selectComtnpopupmanageList(searchVO);
        model.addAttribute("resultList", comtnpopupmanageList);
        
        int totCnt = comtnpopupmanageService.selectComtnpopupmanageListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnpopupmanage/ComtnpopupmanageList";
    } 
    
    @RequestMapping("/comtnpopupmanage/addComtnpopupmanageView.do")
    public String addComtnpopupmanageView(
            @ModelAttribute("searchVO") ComtnpopupmanageDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnpopupmanageVO", new ComtnpopupmanageVO());
        return "/comtnpopupmanage/ComtnpopupmanageRegister";
    }
    
    @RequestMapping("/comtnpopupmanage/addComtnpopupmanage.do")
    public String addComtnpopupmanage(
            ComtnpopupmanageVO comtnpopupmanageVO,
            @ModelAttribute("searchVO") ComtnpopupmanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnpopupmanageService.insertComtnpopupmanage(comtnpopupmanageVO);
        status.setComplete();
        return "forward:/comtnpopupmanage/ComtnpopupmanageList.do";
    }
    
    @RequestMapping("/comtnpopupmanage/updateComtnpopupmanageView.do")
    public String updateComtnpopupmanageView(
            @RequestParam("popupId") String popupId ,
            @ModelAttribute("searchVO") ComtnpopupmanageDefaultVO searchVO, Model model)
            throws Exception {
        ComtnpopupmanageVO comtnpopupmanageVO = new ComtnpopupmanageVO();
        comtnpopupmanageVO.setPopupId(popupId);
;        
        // 변수명은 CoC 에 따라 comtnpopupmanageVO
        model.addAttribute(selectComtnpopupmanage(comtnpopupmanageVO, searchVO));
        return "/comtnpopupmanage/ComtnpopupmanageRegister";
    }

    @RequestMapping("/comtnpopupmanage/selectComtnpopupmanage.do")
    public @ModelAttribute("comtnpopupmanageVO")
    ComtnpopupmanageVO selectComtnpopupmanage(
            ComtnpopupmanageVO comtnpopupmanageVO,
            @ModelAttribute("searchVO") ComtnpopupmanageDefaultVO searchVO) throws Exception {
        return comtnpopupmanageService.selectComtnpopupmanage(comtnpopupmanageVO);
    }

    @RequestMapping("/comtnpopupmanage/updateComtnpopupmanage.do")
    public String updateComtnpopupmanage(
            ComtnpopupmanageVO comtnpopupmanageVO,
            @ModelAttribute("searchVO") ComtnpopupmanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnpopupmanageService.updateComtnpopupmanage(comtnpopupmanageVO);
        status.setComplete();
        return "forward:/comtnpopupmanage/ComtnpopupmanageList.do";
    }
    
    @RequestMapping("/comtnpopupmanage/deleteComtnpopupmanage.do")
    public String deleteComtnpopupmanage(
            ComtnpopupmanageVO comtnpopupmanageVO,
            @ModelAttribute("searchVO") ComtnpopupmanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnpopupmanageService.deleteComtnpopupmanage(comtnpopupmanageVO);
        status.setComplete();
        return "forward:/comtnpopupmanage/ComtnpopupmanageList.do";
    }

}
