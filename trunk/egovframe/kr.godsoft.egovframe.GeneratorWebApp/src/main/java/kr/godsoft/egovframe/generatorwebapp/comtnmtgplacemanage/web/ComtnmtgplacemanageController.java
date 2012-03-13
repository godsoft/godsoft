package kr.godsoft.egovframe.generatorwebapp.comtnmtgplacemanage.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtnmtgplacemanage.service.ComtnmtgplacemanageService;
import kr.godsoft.egovframe.generatorwebapp.comtnmtgplacemanage.service.ComtnmtgplacemanageDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnmtgplacemanage.service.ComtnmtgplacemanageVO;

/**
 * @Class Name : ComtnmtgplacemanageController.java
 * @Description : Comtnmtgplacemanage Controller class
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
@SessionAttributes(types=ComtnmtgplacemanageVO.class)
public class ComtnmtgplacemanageController {

    @Resource(name = "comtnmtgplacemanageService")
    private ComtnmtgplacemanageService comtnmtgplacemanageService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnmtgplacemanage 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnmtgplacemanageDefaultVO
	 * @return "/comtnmtgplacemanage/ComtnmtgplacemanageList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnmtgplacemanage/ComtnmtgplacemanageList.do")
    public String selectComtnmtgplacemanageList(@ModelAttribute("searchVO") ComtnmtgplacemanageDefaultVO searchVO, 
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
		
        List comtnmtgplacemanageList = comtnmtgplacemanageService.selectComtnmtgplacemanageList(searchVO);
        model.addAttribute("resultList", comtnmtgplacemanageList);
        
        int totCnt = comtnmtgplacemanageService.selectComtnmtgplacemanageListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnmtgplacemanage/ComtnmtgplacemanageList";
    } 
    
    @RequestMapping("/comtnmtgplacemanage/addComtnmtgplacemanageView.do")
    public String addComtnmtgplacemanageView(
            @ModelAttribute("searchVO") ComtnmtgplacemanageDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnmtgplacemanageVO", new ComtnmtgplacemanageVO());
        return "/comtnmtgplacemanage/ComtnmtgplacemanageRegister";
    }
    
    @RequestMapping("/comtnmtgplacemanage/addComtnmtgplacemanage.do")
    public String addComtnmtgplacemanage(
            ComtnmtgplacemanageVO comtnmtgplacemanageVO,
            @ModelAttribute("searchVO") ComtnmtgplacemanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnmtgplacemanageService.insertComtnmtgplacemanage(comtnmtgplacemanageVO);
        status.setComplete();
        return "forward:/comtnmtgplacemanage/ComtnmtgplacemanageList.do";
    }
    
    @RequestMapping("/comtnmtgplacemanage/updateComtnmtgplacemanageView.do")
    public String updateComtnmtgplacemanageView(
            @RequestParam("mtgrumId") String mtgrumId ,
            @ModelAttribute("searchVO") ComtnmtgplacemanageDefaultVO searchVO, Model model)
            throws Exception {
        ComtnmtgplacemanageVO comtnmtgplacemanageVO = new ComtnmtgplacemanageVO();
        comtnmtgplacemanageVO.setMtgrumId(mtgrumId);
;        
        // 변수명은 CoC 에 따라 comtnmtgplacemanageVO
        model.addAttribute(selectComtnmtgplacemanage(comtnmtgplacemanageVO, searchVO));
        return "/comtnmtgplacemanage/ComtnmtgplacemanageRegister";
    }

    @RequestMapping("/comtnmtgplacemanage/selectComtnmtgplacemanage.do")
    public @ModelAttribute("comtnmtgplacemanageVO")
    ComtnmtgplacemanageVO selectComtnmtgplacemanage(
            ComtnmtgplacemanageVO comtnmtgplacemanageVO,
            @ModelAttribute("searchVO") ComtnmtgplacemanageDefaultVO searchVO) throws Exception {
        return comtnmtgplacemanageService.selectComtnmtgplacemanage(comtnmtgplacemanageVO);
    }

    @RequestMapping("/comtnmtgplacemanage/updateComtnmtgplacemanage.do")
    public String updateComtnmtgplacemanage(
            ComtnmtgplacemanageVO comtnmtgplacemanageVO,
            @ModelAttribute("searchVO") ComtnmtgplacemanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnmtgplacemanageService.updateComtnmtgplacemanage(comtnmtgplacemanageVO);
        status.setComplete();
        return "forward:/comtnmtgplacemanage/ComtnmtgplacemanageList.do";
    }
    
    @RequestMapping("/comtnmtgplacemanage/deleteComtnmtgplacemanage.do")
    public String deleteComtnmtgplacemanage(
            ComtnmtgplacemanageVO comtnmtgplacemanageVO,
            @ModelAttribute("searchVO") ComtnmtgplacemanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnmtgplacemanageService.deleteComtnmtgplacemanage(comtnmtgplacemanageVO);
        status.setComplete();
        return "forward:/comtnmtgplacemanage/ComtnmtgplacemanageList.do";
    }

}
