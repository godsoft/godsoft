package kr.godsoft.egovframe.generatorwebapp.comtccmmndetailcode.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtccmmndetailcode.service.ComtccmmndetailcodeService;
import kr.godsoft.egovframe.generatorwebapp.comtccmmndetailcode.service.ComtccmmndetailcodeDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtccmmndetailcode.service.ComtccmmndetailcodeVO;

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
 * @Class Name : ComtccmmndetailcodeController.java
 * @Description : Comtccmmndetailcode Controller class
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
public class ComtccmmndetailcodeController {

    @Resource(name = "comtccmmndetailcodeService")
    private ComtccmmndetailcodeService comtccmmndetailcodeService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtccmmndetailcode 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtccmmndetailcodeVO
	 * @return "/comtccmmndetailcode/ComtccmmndetailcodeList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtccmmndetailcode/ComtccmmndetailcodeList.do")
    public String selectComtccmmndetailcodeList(@ModelAttribute("searchVO") ComtccmmndetailcodeVO searchVO, 
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
		
        List<EgovMap> comtccmmndetailcodeList = comtccmmndetailcodeService.selectComtccmmndetailcodeList(searchVO);
        model.addAttribute("resultList", comtccmmndetailcodeList);
        
        int totCnt = comtccmmndetailcodeService.selectComtccmmndetailcodeListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtccmmndetailcode/ComtccmmndetailcodeList";
    } 
    
    @RequestMapping("/comtccmmndetailcode/addComtccmmndetailcodeView.do")
    public String addComtccmmndetailcodeView(
            @ModelAttribute("searchVO") ComtccmmndetailcodeDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtccmmndetailcodeVO", new ComtccmmndetailcodeVO());
        return "/comtccmmndetailcode/ComtccmmndetailcodeRegister";
    }
    
    @RequestMapping("/comtccmmndetailcode/addComtccmmndetailcode.do")
    public String addComtccmmndetailcode(
            ComtccmmndetailcodeVO comtccmmndetailcodeVO,
            @ModelAttribute("searchVO") ComtccmmndetailcodeDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtccmmndetailcodeService.insertComtccmmndetailcode(comtccmmndetailcodeVO);
        status.setComplete();
        return "forward:/comtccmmndetailcode/ComtccmmndetailcodeList.do";
    }
    
    @RequestMapping("/comtccmmndetailcode/updateComtccmmndetailcodeView.do")
    public String updateComtccmmndetailcodeView(
            @RequestParam("codeId") String codeId ,
            @RequestParam("code") String code ,
            @ModelAttribute("searchVO") ComtccmmndetailcodeDefaultVO searchVO, Model model)
            throws Exception {
        ComtccmmndetailcodeVO comtccmmndetailcodeVO = new ComtccmmndetailcodeVO();
        comtccmmndetailcodeVO.setCodeId(codeId);
        comtccmmndetailcodeVO.setCode(code);
;        
        // 변수명은 CoC 에 따라 comtccmmndetailcodeVO
        model.addAttribute(selectComtccmmndetailcode(comtccmmndetailcodeVO, searchVO));
        return "/comtccmmndetailcode/ComtccmmndetailcodeRegister";
    }

    @RequestMapping("/comtccmmndetailcode/selectComtccmmndetailcode.do")
    public @ModelAttribute("comtccmmndetailcodeVO")
    ComtccmmndetailcodeVO selectComtccmmndetailcode(
            ComtccmmndetailcodeVO comtccmmndetailcodeVO,
            @ModelAttribute("searchVO") ComtccmmndetailcodeDefaultVO searchVO) throws Exception {
        return comtccmmndetailcodeService.selectComtccmmndetailcode(comtccmmndetailcodeVO);
    }

    @RequestMapping("/comtccmmndetailcode/updateComtccmmndetailcode.do")
    public String updateComtccmmndetailcode(
            ComtccmmndetailcodeVO comtccmmndetailcodeVO,
            @ModelAttribute("searchVO") ComtccmmndetailcodeDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtccmmndetailcodeService.updateComtccmmndetailcode(comtccmmndetailcodeVO);
        status.setComplete();
        return "forward:/comtccmmndetailcode/ComtccmmndetailcodeList.do";
    }
    
    @RequestMapping("/comtccmmndetailcode/deleteComtccmmndetailcode.do")
    public String deleteComtccmmndetailcode(
            ComtccmmndetailcodeVO comtccmmndetailcodeVO,
            @ModelAttribute("searchVO") ComtccmmndetailcodeDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtccmmndetailcodeService.deleteComtccmmndetailcode(comtccmmndetailcodeVO);
        status.setComplete();
        return "forward:/comtccmmndetailcode/ComtccmmndetailcodeList.do";
    }

}
