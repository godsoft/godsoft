package kr.godsoft.egovframe.generatorwebapp.comtccmmncode.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtccmmncode.service.ComtccmmncodeService;
import kr.godsoft.egovframe.generatorwebapp.comtccmmncode.service.ComtccmmncodeDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtccmmncode.service.ComtccmmncodeVO;

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
 * @Class Name : ComtccmmncodeController.java
 * @Description : Comtccmmncode Controller class
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
public class ComtccmmncodeController {

    @Resource(name = "comtccmmncodeService")
    private ComtccmmncodeService comtccmmncodeService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTCCMMNCODE 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtccmmncodeVO
	 * @return "/comtccmmncode/ComtccmmncodeList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtccmmncode/ComtccmmncodeList.do")
    public String selectComtccmmncodeList(@ModelAttribute("searchVO") ComtccmmncodeVO searchVO, 
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
		
        List<EgovMap> comtccmmncodeList = comtccmmncodeService.selectComtccmmncodeList(searchVO);
        model.addAttribute("resultList", comtccmmncodeList);
        
        int totCnt = comtccmmncodeService.selectComtccmmncodeListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtccmmncode/ComtccmmncodeList";
    } 
    
    @RequestMapping("/comtccmmncode/addComtccmmncodeView.do")
    public String addComtccmmncodeView(
            @ModelAttribute("searchVO") ComtccmmncodeDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtccmmncodeVO", new ComtccmmncodeVO());
        return "/comtccmmncode/ComtccmmncodeRegister";
    }
    
    @RequestMapping("/comtccmmncode/addComtccmmncode.do")
    public String addComtccmmncode(
            ComtccmmncodeVO comtccmmncodeVO,
            @ModelAttribute("searchVO") ComtccmmncodeDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtccmmncodeService.insertComtccmmncode(comtccmmncodeVO);
        status.setComplete();
        return "forward:/comtccmmncode/ComtccmmncodeList.do";
    }
    
    @RequestMapping("/comtccmmncode/updateComtccmmncodeView.do")
    public String updateComtccmmncodeView(
            @RequestParam("codeId") String codeId ,
            @ModelAttribute("searchVO") ComtccmmncodeDefaultVO searchVO, Model model)
            throws Exception {
        ComtccmmncodeVO comtccmmncodeVO = new ComtccmmncodeVO();
        comtccmmncodeVO.setCodeId(codeId);
;        
        // 변수명은 CoC 에 따라 comtccmmncodeVO
        model.addAttribute(selectComtccmmncode(comtccmmncodeVO, searchVO));
        return "/comtccmmncode/ComtccmmncodeRegister";
    }

    @RequestMapping("/comtccmmncode/selectComtccmmncode.do")
    public @ModelAttribute("comtccmmncodeVO")
    ComtccmmncodeVO selectComtccmmncode(
            ComtccmmncodeVO comtccmmncodeVO,
            @ModelAttribute("searchVO") ComtccmmncodeDefaultVO searchVO) throws Exception {
        return comtccmmncodeService.selectComtccmmncode(comtccmmncodeVO);
    }

    @RequestMapping("/comtccmmncode/updateComtccmmncode.do")
    public String updateComtccmmncode(
            ComtccmmncodeVO comtccmmncodeVO,
            @ModelAttribute("searchVO") ComtccmmncodeDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtccmmncodeService.updateComtccmmncode(comtccmmncodeVO);
        status.setComplete();
        return "forward:/comtccmmncode/ComtccmmncodeList.do";
    }
    
    @RequestMapping("/comtccmmncode/deleteComtccmmncode.do")
    public String deleteComtccmmncode(
            ComtccmmncodeVO comtccmmncodeVO,
            @ModelAttribute("searchVO") ComtccmmncodeDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtccmmncodeService.deleteComtccmmncode(comtccmmncodeVO);
        status.setComplete();
        return "forward:/comtccmmncode/ComtccmmncodeList.do";
    }

}
