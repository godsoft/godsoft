package kr.godsoft.egovframe.generatorwebapp.comtnadbkmanage.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnadbkmanage.service.ComtnadbkmanageService;
import kr.godsoft.egovframe.generatorwebapp.comtnadbkmanage.service.ComtnadbkmanageDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnadbkmanage.service.ComtnadbkmanageVO;

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
 * @Class Name : ComtnadbkmanageController.java
 * @Description : Comtnadbkmanage Controller class
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
public class ComtnadbkmanageController {

    @Resource(name = "comtnadbkmanageService")
    private ComtnadbkmanageService comtnadbkmanageService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnadbkmanage 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnadbkmanageVO
	 * @return "/comtnadbkmanage/ComtnadbkmanageList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnadbkmanage/ComtnadbkmanageList.do")
    public String selectComtnadbkmanageList(@ModelAttribute("searchVO") ComtnadbkmanageVO searchVO, 
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
		
        List<EgovMap> comtnadbkmanageList = comtnadbkmanageService.selectComtnadbkmanageList(searchVO);
        model.addAttribute("resultList", comtnadbkmanageList);
        
        int totCnt = comtnadbkmanageService.selectComtnadbkmanageListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnadbkmanage/ComtnadbkmanageList";
    } 
    
    @RequestMapping("/comtnadbkmanage/addComtnadbkmanageView.do")
    public String addComtnadbkmanageView(
            @ModelAttribute("searchVO") ComtnadbkmanageDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnadbkmanageVO", new ComtnadbkmanageVO());
        return "/comtnadbkmanage/ComtnadbkmanageRegister";
    }
    
    @RequestMapping("/comtnadbkmanage/addComtnadbkmanage.do")
    public String addComtnadbkmanage(
            ComtnadbkmanageVO comtnadbkmanageVO,
            @ModelAttribute("searchVO") ComtnadbkmanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnadbkmanageService.insertComtnadbkmanage(comtnadbkmanageVO);
        status.setComplete();
        return "forward:/comtnadbkmanage/ComtnadbkmanageList.do";
    }
    
    @RequestMapping("/comtnadbkmanage/updateComtnadbkmanageView.do")
    public String updateComtnadbkmanageView(
            @RequestParam("adbkId") String adbkId ,
            @ModelAttribute("searchVO") ComtnadbkmanageDefaultVO searchVO, Model model)
            throws Exception {
        ComtnadbkmanageVO comtnadbkmanageVO = new ComtnadbkmanageVO();
        comtnadbkmanageVO.setAdbkId(adbkId);
;        
        // 변수명은 CoC 에 따라 comtnadbkmanageVO
        model.addAttribute(selectComtnadbkmanage(comtnadbkmanageVO, searchVO));
        return "/comtnadbkmanage/ComtnadbkmanageRegister";
    }

    @RequestMapping("/comtnadbkmanage/selectComtnadbkmanage.do")
    public @ModelAttribute("comtnadbkmanageVO")
    ComtnadbkmanageVO selectComtnadbkmanage(
            ComtnadbkmanageVO comtnadbkmanageVO,
            @ModelAttribute("searchVO") ComtnadbkmanageDefaultVO searchVO) throws Exception {
        return comtnadbkmanageService.selectComtnadbkmanage(comtnadbkmanageVO);
    }

    @RequestMapping("/comtnadbkmanage/updateComtnadbkmanage.do")
    public String updateComtnadbkmanage(
            ComtnadbkmanageVO comtnadbkmanageVO,
            @ModelAttribute("searchVO") ComtnadbkmanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnadbkmanageService.updateComtnadbkmanage(comtnadbkmanageVO);
        status.setComplete();
        return "forward:/comtnadbkmanage/ComtnadbkmanageList.do";
    }
    
    @RequestMapping("/comtnadbkmanage/deleteComtnadbkmanage.do")
    public String deleteComtnadbkmanage(
            ComtnadbkmanageVO comtnadbkmanageVO,
            @ModelAttribute("searchVO") ComtnadbkmanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnadbkmanageService.deleteComtnadbkmanage(comtnadbkmanageVO);
        status.setComplete();
        return "forward:/comtnadbkmanage/ComtnadbkmanageList.do";
    }

}
