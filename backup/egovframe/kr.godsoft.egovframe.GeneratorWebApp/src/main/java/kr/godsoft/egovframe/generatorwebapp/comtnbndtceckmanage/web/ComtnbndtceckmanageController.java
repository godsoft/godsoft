package kr.godsoft.egovframe.generatorwebapp.comtnbndtceckmanage.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnbndtceckmanage.service.ComtnbndtceckmanageService;
import kr.godsoft.egovframe.generatorwebapp.comtnbndtceckmanage.service.ComtnbndtceckmanageDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbndtceckmanage.service.ComtnbndtceckmanageVO;

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
 * @Class Name : ComtnbndtceckmanageController.java
 * @Description : Comtnbndtceckmanage Controller class
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
public class ComtnbndtceckmanageController {

    @Resource(name = "comtnbndtceckmanageService")
    private ComtnbndtceckmanageService comtnbndtceckmanageService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNBNDTCECKMANAGE 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnbndtceckmanageVO
	 * @return "/comtnbndtceckmanage/ComtnbndtceckmanageList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnbndtceckmanage/ComtnbndtceckmanageList.do")
    public String selectComtnbndtceckmanageList(@ModelAttribute("searchVO") ComtnbndtceckmanageVO searchVO, 
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
		
        List<EgovMap> comtnbndtceckmanageList = comtnbndtceckmanageService.selectComtnbndtceckmanageList(searchVO);
        model.addAttribute("resultList", comtnbndtceckmanageList);
        
        int totCnt = comtnbndtceckmanageService.selectComtnbndtceckmanageListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnbndtceckmanage/ComtnbndtceckmanageList";
    } 
    
    @RequestMapping("/comtnbndtceckmanage/addComtnbndtceckmanageView.do")
    public String addComtnbndtceckmanageView(
            @ModelAttribute("searchVO") ComtnbndtceckmanageDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnbndtceckmanageVO", new ComtnbndtceckmanageVO());
        return "/comtnbndtceckmanage/ComtnbndtceckmanageRegister";
    }
    
    @RequestMapping("/comtnbndtceckmanage/addComtnbndtceckmanage.do")
    public String addComtnbndtceckmanage(
            ComtnbndtceckmanageVO comtnbndtceckmanageVO,
            @ModelAttribute("searchVO") ComtnbndtceckmanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbndtceckmanageService.insertComtnbndtceckmanage(comtnbndtceckmanageVO);
        status.setComplete();
        return "forward:/comtnbndtceckmanage/ComtnbndtceckmanageList.do";
    }
    
    @RequestMapping("/comtnbndtceckmanage/updateComtnbndtceckmanageView.do")
    public String updateComtnbndtceckmanageView(
            @RequestParam("bndtCeckSe") String bndtCeckSe ,
            @RequestParam("bndtCeckCode") String bndtCeckCode ,
            @ModelAttribute("searchVO") ComtnbndtceckmanageDefaultVO searchVO, Model model)
            throws Exception {
        ComtnbndtceckmanageVO comtnbndtceckmanageVO = new ComtnbndtceckmanageVO();
        comtnbndtceckmanageVO.setBndtCeckSe(bndtCeckSe);
        comtnbndtceckmanageVO.setBndtCeckCode(bndtCeckCode);
;        
        // 변수명은 CoC 에 따라 comtnbndtceckmanageVO
        model.addAttribute(selectComtnbndtceckmanage(comtnbndtceckmanageVO, searchVO));
        return "/comtnbndtceckmanage/ComtnbndtceckmanageRegister";
    }

    @RequestMapping("/comtnbndtceckmanage/selectComtnbndtceckmanage.do")
    public @ModelAttribute("comtnbndtceckmanageVO")
    ComtnbndtceckmanageVO selectComtnbndtceckmanage(
            ComtnbndtceckmanageVO comtnbndtceckmanageVO,
            @ModelAttribute("searchVO") ComtnbndtceckmanageDefaultVO searchVO) throws Exception {
        return comtnbndtceckmanageService.selectComtnbndtceckmanage(comtnbndtceckmanageVO);
    }

    @RequestMapping("/comtnbndtceckmanage/updateComtnbndtceckmanage.do")
    public String updateComtnbndtceckmanage(
            ComtnbndtceckmanageVO comtnbndtceckmanageVO,
            @ModelAttribute("searchVO") ComtnbndtceckmanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbndtceckmanageService.updateComtnbndtceckmanage(comtnbndtceckmanageVO);
        status.setComplete();
        return "forward:/comtnbndtceckmanage/ComtnbndtceckmanageList.do";
    }
    
    @RequestMapping("/comtnbndtceckmanage/deleteComtnbndtceckmanage.do")
    public String deleteComtnbndtceckmanage(
            ComtnbndtceckmanageVO comtnbndtceckmanageVO,
            @ModelAttribute("searchVO") ComtnbndtceckmanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbndtceckmanageService.deleteComtnbndtceckmanage(comtnbndtceckmanageVO);
        status.setComplete();
        return "forward:/comtnbndtceckmanage/ComtnbndtceckmanageList.do";
    }

}
