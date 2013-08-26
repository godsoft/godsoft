package kr.godsoft.egovframe.generatorwebapp.comtnntwrkinfo.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnntwrkinfo.service.ComtnntwrkinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnntwrkinfo.service.ComtnntwrkinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnntwrkinfo.service.ComtnntwrkinfoVO;

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
 * @Class Name : ComtnntwrkinfoController.java
 * @Description : Comtnntwrkinfo Controller class
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
public class ComtnntwrkinfoController {

    @Resource(name = "comtnntwrkinfoService")
    private ComtnntwrkinfoService comtnntwrkinfoService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNNTWRKINFO 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnntwrkinfoVO
	 * @return "/comtnntwrkinfo/ComtnntwrkinfoList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnntwrkinfo/ComtnntwrkinfoList.do")
    public String selectComtnntwrkinfoList(@ModelAttribute("searchVO") ComtnntwrkinfoVO searchVO, 
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
		
        List<EgovMap> comtnntwrkinfoList = comtnntwrkinfoService.selectComtnntwrkinfoList(searchVO);
        model.addAttribute("resultList", comtnntwrkinfoList);
        
        int totCnt = comtnntwrkinfoService.selectComtnntwrkinfoListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnntwrkinfo/ComtnntwrkinfoList";
    } 
    
    @RequestMapping("/comtnntwrkinfo/addComtnntwrkinfoView.do")
    public String addComtnntwrkinfoView(
            @ModelAttribute("searchVO") ComtnntwrkinfoDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnntwrkinfoVO", new ComtnntwrkinfoVO());
        return "/comtnntwrkinfo/ComtnntwrkinfoRegister";
    }
    
    @RequestMapping("/comtnntwrkinfo/addComtnntwrkinfo.do")
    public String addComtnntwrkinfo(
            ComtnntwrkinfoVO comtnntwrkinfoVO,
            @ModelAttribute("searchVO") ComtnntwrkinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnntwrkinfoService.insertComtnntwrkinfo(comtnntwrkinfoVO);
        status.setComplete();
        return "forward:/comtnntwrkinfo/ComtnntwrkinfoList.do";
    }
    
    @RequestMapping("/comtnntwrkinfo/updateComtnntwrkinfoView.do")
    public String updateComtnntwrkinfoView(
            @RequestParam("ntwrkId") String ntwrkId ,
            @ModelAttribute("searchVO") ComtnntwrkinfoDefaultVO searchVO, Model model)
            throws Exception {
        ComtnntwrkinfoVO comtnntwrkinfoVO = new ComtnntwrkinfoVO();
        comtnntwrkinfoVO.setNtwrkId(ntwrkId);
;        
        // 변수명은 CoC 에 따라 comtnntwrkinfoVO
        model.addAttribute(selectComtnntwrkinfo(comtnntwrkinfoVO, searchVO));
        return "/comtnntwrkinfo/ComtnntwrkinfoRegister";
    }

    @RequestMapping("/comtnntwrkinfo/selectComtnntwrkinfo.do")
    public @ModelAttribute("comtnntwrkinfoVO")
    ComtnntwrkinfoVO selectComtnntwrkinfo(
            ComtnntwrkinfoVO comtnntwrkinfoVO,
            @ModelAttribute("searchVO") ComtnntwrkinfoDefaultVO searchVO) throws Exception {
        return comtnntwrkinfoService.selectComtnntwrkinfo(comtnntwrkinfoVO);
    }

    @RequestMapping("/comtnntwrkinfo/updateComtnntwrkinfo.do")
    public String updateComtnntwrkinfo(
            ComtnntwrkinfoVO comtnntwrkinfoVO,
            @ModelAttribute("searchVO") ComtnntwrkinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnntwrkinfoService.updateComtnntwrkinfo(comtnntwrkinfoVO);
        status.setComplete();
        return "forward:/comtnntwrkinfo/ComtnntwrkinfoList.do";
    }
    
    @RequestMapping("/comtnntwrkinfo/deleteComtnntwrkinfo.do")
    public String deleteComtnntwrkinfo(
            ComtnntwrkinfoVO comtnntwrkinfoVO,
            @ModelAttribute("searchVO") ComtnntwrkinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnntwrkinfoService.deleteComtnntwrkinfo(comtnntwrkinfoVO);
        status.setComplete();
        return "forward:/comtnntwrkinfo/ComtnntwrkinfoList.do";
    }

}
