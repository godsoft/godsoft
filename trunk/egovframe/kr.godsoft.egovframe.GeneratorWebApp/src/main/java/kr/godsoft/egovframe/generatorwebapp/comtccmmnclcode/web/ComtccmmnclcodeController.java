package kr.godsoft.egovframe.generatorwebapp.comtccmmnclcode.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtccmmnclcode.service.ComtccmmnclcodeService;
import kr.godsoft.egovframe.generatorwebapp.comtccmmnclcode.service.ComtccmmnclcodeDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtccmmnclcode.service.ComtccmmnclcodeVO;

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
 * @Class Name : ComtccmmnclcodeController.java
 * @Description : Comtccmmnclcode Controller class
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
public class ComtccmmnclcodeController {

    @Resource(name = "comtccmmnclcodeService")
    private ComtccmmnclcodeService comtccmmnclcodeService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtccmmnclcode 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtccmmnclcodeVO
	 * @return "/comtccmmnclcode/ComtccmmnclcodeList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtccmmnclcode/ComtccmmnclcodeList.do")
    public String selectComtccmmnclcodeList(@ModelAttribute("searchVO") ComtccmmnclcodeVO searchVO, 
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
		
        List<EgovMap> comtccmmnclcodeList = comtccmmnclcodeService.selectComtccmmnclcodeList(searchVO);
        model.addAttribute("resultList", comtccmmnclcodeList);
        
        int totCnt = comtccmmnclcodeService.selectComtccmmnclcodeListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtccmmnclcode/ComtccmmnclcodeList";
    } 
    
    @RequestMapping("/comtccmmnclcode/addComtccmmnclcodeView.do")
    public String addComtccmmnclcodeView(
            @ModelAttribute("searchVO") ComtccmmnclcodeDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtccmmnclcodeVO", new ComtccmmnclcodeVO());
        return "/comtccmmnclcode/ComtccmmnclcodeRegister";
    }
    
    @RequestMapping("/comtccmmnclcode/addComtccmmnclcode.do")
    public String addComtccmmnclcode(
            ComtccmmnclcodeVO comtccmmnclcodeVO,
            @ModelAttribute("searchVO") ComtccmmnclcodeDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtccmmnclcodeService.insertComtccmmnclcode(comtccmmnclcodeVO);
        status.setComplete();
        return "forward:/comtccmmnclcode/ComtccmmnclcodeList.do";
    }
    
    @RequestMapping("/comtccmmnclcode/updateComtccmmnclcodeView.do")
    public String updateComtccmmnclcodeView(
            @RequestParam("clCode") String clCode ,
            @ModelAttribute("searchVO") ComtccmmnclcodeDefaultVO searchVO, Model model)
            throws Exception {
        ComtccmmnclcodeVO comtccmmnclcodeVO = new ComtccmmnclcodeVO();
        comtccmmnclcodeVO.setClCode(clCode);
;        
        // 변수명은 CoC 에 따라 comtccmmnclcodeVO
        model.addAttribute(selectComtccmmnclcode(comtccmmnclcodeVO, searchVO));
        return "/comtccmmnclcode/ComtccmmnclcodeRegister";
    }

    @RequestMapping("/comtccmmnclcode/selectComtccmmnclcode.do")
    public @ModelAttribute("comtccmmnclcodeVO")
    ComtccmmnclcodeVO selectComtccmmnclcode(
            ComtccmmnclcodeVO comtccmmnclcodeVO,
            @ModelAttribute("searchVO") ComtccmmnclcodeDefaultVO searchVO) throws Exception {
        return comtccmmnclcodeService.selectComtccmmnclcode(comtccmmnclcodeVO);
    }

    @RequestMapping("/comtccmmnclcode/updateComtccmmnclcode.do")
    public String updateComtccmmnclcode(
            ComtccmmnclcodeVO comtccmmnclcodeVO,
            @ModelAttribute("searchVO") ComtccmmnclcodeDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtccmmnclcodeService.updateComtccmmnclcode(comtccmmnclcodeVO);
        status.setComplete();
        return "forward:/comtccmmnclcode/ComtccmmnclcodeList.do";
    }
    
    @RequestMapping("/comtccmmnclcode/deleteComtccmmnclcode.do")
    public String deleteComtccmmnclcode(
            ComtccmmnclcodeVO comtccmmnclcodeVO,
            @ModelAttribute("searchVO") ComtccmmnclcodeDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtccmmnclcodeService.deleteComtccmmnclcode(comtccmmnclcodeVO);
        status.setComplete();
        return "forward:/comtccmmnclcode/ComtccmmnclcodeList.do";
    }

}
