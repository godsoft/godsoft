package kr.godsoft.egovframe.generatorwebapp.comtnntwrksvcmntrngloginfo.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnntwrksvcmntrngloginfo.service.ComtnntwrksvcmntrngloginfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnntwrksvcmntrngloginfo.service.ComtnntwrksvcmntrngloginfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnntwrksvcmntrngloginfo.service.ComtnntwrksvcmntrngloginfoVO;

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
 * @Class Name : ComtnntwrksvcmntrngloginfoController.java
 * @Description : Comtnntwrksvcmntrngloginfo Controller class
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
public class ComtnntwrksvcmntrngloginfoController {

    @Resource(name = "comtnntwrksvcmntrngloginfoService")
    private ComtnntwrksvcmntrngloginfoService comtnntwrksvcmntrngloginfoService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnntwrksvcmntrngloginfo 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnntwrksvcmntrngloginfoVO
	 * @return "/comtnntwrksvcmntrngloginfo/ComtnntwrksvcmntrngloginfoList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnntwrksvcmntrngloginfo/ComtnntwrksvcmntrngloginfoList.do")
    public String selectComtnntwrksvcmntrngloginfoList(@ModelAttribute("searchVO") ComtnntwrksvcmntrngloginfoVO searchVO, 
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
		
        List<EgovMap> comtnntwrksvcmntrngloginfoList = comtnntwrksvcmntrngloginfoService.selectComtnntwrksvcmntrngloginfoList(searchVO);
        model.addAttribute("resultList", comtnntwrksvcmntrngloginfoList);
        
        int totCnt = comtnntwrksvcmntrngloginfoService.selectComtnntwrksvcmntrngloginfoListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnntwrksvcmntrngloginfo/ComtnntwrksvcmntrngloginfoList";
    } 
    
    @RequestMapping("/comtnntwrksvcmntrngloginfo/addComtnntwrksvcmntrngloginfoView.do")
    public String addComtnntwrksvcmntrngloginfoView(
            @ModelAttribute("searchVO") ComtnntwrksvcmntrngloginfoDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnntwrksvcmntrngloginfoVO", new ComtnntwrksvcmntrngloginfoVO());
        return "/comtnntwrksvcmntrngloginfo/ComtnntwrksvcmntrngloginfoRegister";
    }
    
    @RequestMapping("/comtnntwrksvcmntrngloginfo/addComtnntwrksvcmntrngloginfo.do")
    public String addComtnntwrksvcmntrngloginfo(
            ComtnntwrksvcmntrngloginfoVO comtnntwrksvcmntrngloginfoVO,
            @ModelAttribute("searchVO") ComtnntwrksvcmntrngloginfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnntwrksvcmntrngloginfoService.insertComtnntwrksvcmntrngloginfo(comtnntwrksvcmntrngloginfoVO);
        status.setComplete();
        return "forward:/comtnntwrksvcmntrngloginfo/ComtnntwrksvcmntrngloginfoList.do";
    }
    
    @RequestMapping("/comtnntwrksvcmntrngloginfo/updateComtnntwrksvcmntrngloginfoView.do")
    public String updateComtnntwrksvcmntrngloginfoView(
            @RequestParam("sysIp") String sysIp ,
            @RequestParam("sysPort") int sysPort ,
            @RequestParam("logId") String logId ,
            @ModelAttribute("searchVO") ComtnntwrksvcmntrngloginfoDefaultVO searchVO, Model model)
            throws Exception {
        ComtnntwrksvcmntrngloginfoVO comtnntwrksvcmntrngloginfoVO = new ComtnntwrksvcmntrngloginfoVO();
        comtnntwrksvcmntrngloginfoVO.setSysIp(sysIp);
        comtnntwrksvcmntrngloginfoVO.setSysPort(sysPort);
        comtnntwrksvcmntrngloginfoVO.setLogId(logId);
;        
        // 변수명은 CoC 에 따라 comtnntwrksvcmntrngloginfoVO
        model.addAttribute(selectComtnntwrksvcmntrngloginfo(comtnntwrksvcmntrngloginfoVO, searchVO));
        return "/comtnntwrksvcmntrngloginfo/ComtnntwrksvcmntrngloginfoRegister";
    }

    @RequestMapping("/comtnntwrksvcmntrngloginfo/selectComtnntwrksvcmntrngloginfo.do")
    public @ModelAttribute("comtnntwrksvcmntrngloginfoVO")
    ComtnntwrksvcmntrngloginfoVO selectComtnntwrksvcmntrngloginfo(
            ComtnntwrksvcmntrngloginfoVO comtnntwrksvcmntrngloginfoVO,
            @ModelAttribute("searchVO") ComtnntwrksvcmntrngloginfoDefaultVO searchVO) throws Exception {
        return comtnntwrksvcmntrngloginfoService.selectComtnntwrksvcmntrngloginfo(comtnntwrksvcmntrngloginfoVO);
    }

    @RequestMapping("/comtnntwrksvcmntrngloginfo/updateComtnntwrksvcmntrngloginfo.do")
    public String updateComtnntwrksvcmntrngloginfo(
            ComtnntwrksvcmntrngloginfoVO comtnntwrksvcmntrngloginfoVO,
            @ModelAttribute("searchVO") ComtnntwrksvcmntrngloginfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnntwrksvcmntrngloginfoService.updateComtnntwrksvcmntrngloginfo(comtnntwrksvcmntrngloginfoVO);
        status.setComplete();
        return "forward:/comtnntwrksvcmntrngloginfo/ComtnntwrksvcmntrngloginfoList.do";
    }
    
    @RequestMapping("/comtnntwrksvcmntrngloginfo/deleteComtnntwrksvcmntrngloginfo.do")
    public String deleteComtnntwrksvcmntrngloginfo(
            ComtnntwrksvcmntrngloginfoVO comtnntwrksvcmntrngloginfoVO,
            @ModelAttribute("searchVO") ComtnntwrksvcmntrngloginfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnntwrksvcmntrngloginfoService.deleteComtnntwrksvcmntrngloginfo(comtnntwrksvcmntrngloginfoVO);
        status.setComplete();
        return "forward:/comtnntwrksvcmntrngloginfo/ComtnntwrksvcmntrngloginfoList.do";
    }

}
