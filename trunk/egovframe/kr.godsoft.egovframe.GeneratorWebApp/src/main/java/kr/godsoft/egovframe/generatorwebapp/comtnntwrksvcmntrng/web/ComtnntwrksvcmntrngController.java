package kr.godsoft.egovframe.generatorwebapp.comtnntwrksvcmntrng.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnntwrksvcmntrng.service.ComtnntwrksvcmntrngService;
import kr.godsoft.egovframe.generatorwebapp.comtnntwrksvcmntrng.service.ComtnntwrksvcmntrngDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnntwrksvcmntrng.service.ComtnntwrksvcmntrngVO;

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
 * @Class Name : ComtnntwrksvcmntrngController.java
 * @Description : Comtnntwrksvcmntrng Controller class
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
public class ComtnntwrksvcmntrngController {

    @Resource(name = "comtnntwrksvcmntrngService")
    private ComtnntwrksvcmntrngService comtnntwrksvcmntrngService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnntwrksvcmntrng 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnntwrksvcmntrngVO
	 * @return "/comtnntwrksvcmntrng/ComtnntwrksvcmntrngList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnntwrksvcmntrng/ComtnntwrksvcmntrngList.do")
    public String selectComtnntwrksvcmntrngList(@ModelAttribute("searchVO") ComtnntwrksvcmntrngVO searchVO, 
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
		
        List<EgovMap> comtnntwrksvcmntrngList = comtnntwrksvcmntrngService.selectComtnntwrksvcmntrngList(searchVO);
        model.addAttribute("resultList", comtnntwrksvcmntrngList);
        
        int totCnt = comtnntwrksvcmntrngService.selectComtnntwrksvcmntrngListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnntwrksvcmntrng/ComtnntwrksvcmntrngList";
    } 
    
    @RequestMapping("/comtnntwrksvcmntrng/addComtnntwrksvcmntrngView.do")
    public String addComtnntwrksvcmntrngView(
            @ModelAttribute("searchVO") ComtnntwrksvcmntrngDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnntwrksvcmntrngVO", new ComtnntwrksvcmntrngVO());
        return "/comtnntwrksvcmntrng/ComtnntwrksvcmntrngRegister";
    }
    
    @RequestMapping("/comtnntwrksvcmntrng/addComtnntwrksvcmntrng.do")
    public String addComtnntwrksvcmntrng(
            ComtnntwrksvcmntrngVO comtnntwrksvcmntrngVO,
            @ModelAttribute("searchVO") ComtnntwrksvcmntrngDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnntwrksvcmntrngService.insertComtnntwrksvcmntrng(comtnntwrksvcmntrngVO);
        status.setComplete();
        return "forward:/comtnntwrksvcmntrng/ComtnntwrksvcmntrngList.do";
    }
    
    @RequestMapping("/comtnntwrksvcmntrng/updateComtnntwrksvcmntrngView.do")
    public String updateComtnntwrksvcmntrngView(
            @RequestParam("sysIp") String sysIp ,
            @RequestParam("sysPort") int sysPort ,
            @ModelAttribute("searchVO") ComtnntwrksvcmntrngDefaultVO searchVO, Model model)
            throws Exception {
        ComtnntwrksvcmntrngVO comtnntwrksvcmntrngVO = new ComtnntwrksvcmntrngVO();
        comtnntwrksvcmntrngVO.setSysIp(sysIp);
        comtnntwrksvcmntrngVO.setSysPort(sysPort);
;        
        // 변수명은 CoC 에 따라 comtnntwrksvcmntrngVO
        model.addAttribute(selectComtnntwrksvcmntrng(comtnntwrksvcmntrngVO, searchVO));
        return "/comtnntwrksvcmntrng/ComtnntwrksvcmntrngRegister";
    }

    @RequestMapping("/comtnntwrksvcmntrng/selectComtnntwrksvcmntrng.do")
    public @ModelAttribute("comtnntwrksvcmntrngVO")
    ComtnntwrksvcmntrngVO selectComtnntwrksvcmntrng(
            ComtnntwrksvcmntrngVO comtnntwrksvcmntrngVO,
            @ModelAttribute("searchVO") ComtnntwrksvcmntrngDefaultVO searchVO) throws Exception {
        return comtnntwrksvcmntrngService.selectComtnntwrksvcmntrng(comtnntwrksvcmntrngVO);
    }

    @RequestMapping("/comtnntwrksvcmntrng/updateComtnntwrksvcmntrng.do")
    public String updateComtnntwrksvcmntrng(
            ComtnntwrksvcmntrngVO comtnntwrksvcmntrngVO,
            @ModelAttribute("searchVO") ComtnntwrksvcmntrngDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnntwrksvcmntrngService.updateComtnntwrksvcmntrng(comtnntwrksvcmntrngVO);
        status.setComplete();
        return "forward:/comtnntwrksvcmntrng/ComtnntwrksvcmntrngList.do";
    }
    
    @RequestMapping("/comtnntwrksvcmntrng/deleteComtnntwrksvcmntrng.do")
    public String deleteComtnntwrksvcmntrng(
            ComtnntwrksvcmntrngVO comtnntwrksvcmntrngVO,
            @ModelAttribute("searchVO") ComtnntwrksvcmntrngDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnntwrksvcmntrngService.deleteComtnntwrksvcmntrng(comtnntwrksvcmntrngVO);
        status.setComplete();
        return "forward:/comtnntwrksvcmntrng/ComtnntwrksvcmntrngList.do";
    }

}
