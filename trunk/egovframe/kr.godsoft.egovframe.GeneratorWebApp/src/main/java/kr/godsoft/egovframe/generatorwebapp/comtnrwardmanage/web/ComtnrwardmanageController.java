package kr.godsoft.egovframe.generatorwebapp.comtnrwardmanage.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtnrwardmanage.service.ComtnrwardmanageService;
import kr.godsoft.egovframe.generatorwebapp.comtnrwardmanage.service.ComtnrwardmanageDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnrwardmanage.service.ComtnrwardmanageVO;

/**
 * @Class Name : ComtnrwardmanageController.java
 * @Description : Comtnrwardmanage Controller class
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
@SessionAttributes(types=ComtnrwardmanageVO.class)
public class ComtnrwardmanageController {

    @Resource(name = "comtnrwardmanageService")
    private ComtnrwardmanageService comtnrwardmanageService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnrwardmanage 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnrwardmanageDefaultVO
	 * @return "/comtnrwardmanage/ComtnrwardmanageList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnrwardmanage/ComtnrwardmanageList.do")
    public String selectComtnrwardmanageList(@ModelAttribute("searchVO") ComtnrwardmanageDefaultVO searchVO, 
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
		
        List comtnrwardmanageList = comtnrwardmanageService.selectComtnrwardmanageList(searchVO);
        model.addAttribute("resultList", comtnrwardmanageList);
        
        int totCnt = comtnrwardmanageService.selectComtnrwardmanageListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnrwardmanage/ComtnrwardmanageList";
    } 
    
    @RequestMapping("/comtnrwardmanage/addComtnrwardmanageView.do")
    public String addComtnrwardmanageView(
            @ModelAttribute("searchVO") ComtnrwardmanageDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnrwardmanageVO", new ComtnrwardmanageVO());
        return "/comtnrwardmanage/ComtnrwardmanageRegister";
    }
    
    @RequestMapping("/comtnrwardmanage/addComtnrwardmanage.do")
    public String addComtnrwardmanage(
            ComtnrwardmanageVO comtnrwardmanageVO,
            @ModelAttribute("searchVO") ComtnrwardmanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnrwardmanageService.insertComtnrwardmanage(comtnrwardmanageVO);
        status.setComplete();
        return "forward:/comtnrwardmanage/ComtnrwardmanageList.do";
    }
    
    @RequestMapping("/comtnrwardmanage/updateComtnrwardmanageView.do")
    public String updateComtnrwardmanageView(
            @RequestParam("rwardId") String rwardId ,
            @ModelAttribute("searchVO") ComtnrwardmanageDefaultVO searchVO, Model model)
            throws Exception {
        ComtnrwardmanageVO comtnrwardmanageVO = new ComtnrwardmanageVO();
        comtnrwardmanageVO.setRwardId(rwardId);
;        
        // 변수명은 CoC 에 따라 comtnrwardmanageVO
        model.addAttribute(selectComtnrwardmanage(comtnrwardmanageVO, searchVO));
        return "/comtnrwardmanage/ComtnrwardmanageRegister";
    }

    @RequestMapping("/comtnrwardmanage/selectComtnrwardmanage.do")
    public @ModelAttribute("comtnrwardmanageVO")
    ComtnrwardmanageVO selectComtnrwardmanage(
            ComtnrwardmanageVO comtnrwardmanageVO,
            @ModelAttribute("searchVO") ComtnrwardmanageDefaultVO searchVO) throws Exception {
        return comtnrwardmanageService.selectComtnrwardmanage(comtnrwardmanageVO);
    }

    @RequestMapping("/comtnrwardmanage/updateComtnrwardmanage.do")
    public String updateComtnrwardmanage(
            ComtnrwardmanageVO comtnrwardmanageVO,
            @ModelAttribute("searchVO") ComtnrwardmanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnrwardmanageService.updateComtnrwardmanage(comtnrwardmanageVO);
        status.setComplete();
        return "forward:/comtnrwardmanage/ComtnrwardmanageList.do";
    }
    
    @RequestMapping("/comtnrwardmanage/deleteComtnrwardmanage.do")
    public String deleteComtnrwardmanage(
            ComtnrwardmanageVO comtnrwardmanageVO,
            @ModelAttribute("searchVO") ComtnrwardmanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnrwardmanageService.deleteComtnrwardmanage(comtnrwardmanageVO);
        status.setComplete();
        return "forward:/comtnrwardmanage/ComtnrwardmanageList.do";
    }

}
