package kr.godsoft.egovframe.generatorwebapp.comtcadministcode.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtcadministcode.service.ComtcadministcodeService;
import kr.godsoft.egovframe.generatorwebapp.comtcadministcode.service.ComtcadministcodeDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtcadministcode.service.ComtcadministcodeVO;

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
 * @Class Name : ComtcadministcodeController.java
 * @Description : Comtcadministcode Controller class
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
public class ComtcadministcodeController {

    @Resource(name = "comtcadministcodeService")
    private ComtcadministcodeService comtcadministcodeService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtcadministcode 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtcadministcodeVO
	 * @return "/comtcadministcode/ComtcadministcodeList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtcadministcode/ComtcadministcodeList.do")
    public String selectComtcadministcodeList(@ModelAttribute("searchVO") ComtcadministcodeVO searchVO, 
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
		
        List<EgovMap> comtcadministcodeList = comtcadministcodeService.selectComtcadministcodeList(searchVO);
        model.addAttribute("resultList", comtcadministcodeList);
        
        int totCnt = comtcadministcodeService.selectComtcadministcodeListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtcadministcode/ComtcadministcodeList";
    } 
    
    @RequestMapping("/comtcadministcode/addComtcadministcodeView.do")
    public String addComtcadministcodeView(
            @ModelAttribute("searchVO") ComtcadministcodeDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtcadministcodeVO", new ComtcadministcodeVO());
        return "/comtcadministcode/ComtcadministcodeRegister";
    }
    
    @RequestMapping("/comtcadministcode/addComtcadministcode.do")
    public String addComtcadministcode(
            ComtcadministcodeVO comtcadministcodeVO,
            @ModelAttribute("searchVO") ComtcadministcodeDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtcadministcodeService.insertComtcadministcode(comtcadministcodeVO);
        status.setComplete();
        return "forward:/comtcadministcode/ComtcadministcodeList.do";
    }
    
    @RequestMapping("/comtcadministcode/updateComtcadministcodeView.do")
    public String updateComtcadministcodeView(
            @RequestParam("administZoneSe") String administZoneSe ,
            @RequestParam("administZoneCode") String administZoneCode ,
            @ModelAttribute("searchVO") ComtcadministcodeDefaultVO searchVO, Model model)
            throws Exception {
        ComtcadministcodeVO comtcadministcodeVO = new ComtcadministcodeVO();
        comtcadministcodeVO.setAdministZoneSe(administZoneSe);
        comtcadministcodeVO.setAdministZoneCode(administZoneCode);
;        
        // 변수명은 CoC 에 따라 comtcadministcodeVO
        model.addAttribute(selectComtcadministcode(comtcadministcodeVO, searchVO));
        return "/comtcadministcode/ComtcadministcodeRegister";
    }

    @RequestMapping("/comtcadministcode/selectComtcadministcode.do")
    public @ModelAttribute("comtcadministcodeVO")
    ComtcadministcodeVO selectComtcadministcode(
            ComtcadministcodeVO comtcadministcodeVO,
            @ModelAttribute("searchVO") ComtcadministcodeDefaultVO searchVO) throws Exception {
        return comtcadministcodeService.selectComtcadministcode(comtcadministcodeVO);
    }

    @RequestMapping("/comtcadministcode/updateComtcadministcode.do")
    public String updateComtcadministcode(
            ComtcadministcodeVO comtcadministcodeVO,
            @ModelAttribute("searchVO") ComtcadministcodeDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtcadministcodeService.updateComtcadministcode(comtcadministcodeVO);
        status.setComplete();
        return "forward:/comtcadministcode/ComtcadministcodeList.do";
    }
    
    @RequestMapping("/comtcadministcode/deleteComtcadministcode.do")
    public String deleteComtcadministcode(
            ComtcadministcodeVO comtcadministcodeVO,
            @ModelAttribute("searchVO") ComtcadministcodeDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtcadministcodeService.deleteComtcadministcode(comtcadministcodeVO);
        status.setComplete();
        return "forward:/comtcadministcode/ComtcadministcodeList.do";
    }

}
