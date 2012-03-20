package kr.godsoft.egovframe.generatorwebapp.comtninsttcode.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtninsttcode.service.ComtninsttcodeService;
import kr.godsoft.egovframe.generatorwebapp.comtninsttcode.service.ComtninsttcodeDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtninsttcode.service.ComtninsttcodeVO;

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
 * @Class Name : ComtninsttcodeController.java
 * @Description : Comtninsttcode Controller class
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
public class ComtninsttcodeController {

    @Resource(name = "comtninsttcodeService")
    private ComtninsttcodeService comtninsttcodeService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtninsttcode 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtninsttcodeVO
	 * @return "/comtninsttcode/ComtninsttcodeList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtninsttcode/ComtninsttcodeList.do")
    public String selectComtninsttcodeList(@ModelAttribute("searchVO") ComtninsttcodeVO searchVO, 
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
		
        List<EgovMap> comtninsttcodeList = comtninsttcodeService.selectComtninsttcodeList(searchVO);
        model.addAttribute("resultList", comtninsttcodeList);
        
        int totCnt = comtninsttcodeService.selectComtninsttcodeListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtninsttcode/ComtninsttcodeList";
    } 
    
    @RequestMapping("/comtninsttcode/addComtninsttcodeView.do")
    public String addComtninsttcodeView(
            @ModelAttribute("searchVO") ComtninsttcodeDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtninsttcodeVO", new ComtninsttcodeVO());
        return "/comtninsttcode/ComtninsttcodeRegister";
    }
    
    @RequestMapping("/comtninsttcode/addComtninsttcode.do")
    public String addComtninsttcode(
            ComtninsttcodeVO comtninsttcodeVO,
            @ModelAttribute("searchVO") ComtninsttcodeDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtninsttcodeService.insertComtninsttcode(comtninsttcodeVO);
        status.setComplete();
        return "forward:/comtninsttcode/ComtninsttcodeList.do";
    }
    
    @RequestMapping("/comtninsttcode/updateComtninsttcodeView.do")
    public String updateComtninsttcodeView(
            @RequestParam("insttCode") String insttCode ,
            @ModelAttribute("searchVO") ComtninsttcodeDefaultVO searchVO, Model model)
            throws Exception {
        ComtninsttcodeVO comtninsttcodeVO = new ComtninsttcodeVO();
        comtninsttcodeVO.setInsttCode(insttCode);
;        
        // 변수명은 CoC 에 따라 comtninsttcodeVO
        model.addAttribute(selectComtninsttcode(comtninsttcodeVO, searchVO));
        return "/comtninsttcode/ComtninsttcodeRegister";
    }

    @RequestMapping("/comtninsttcode/selectComtninsttcode.do")
    public @ModelAttribute("comtninsttcodeVO")
    ComtninsttcodeVO selectComtninsttcode(
            ComtninsttcodeVO comtninsttcodeVO,
            @ModelAttribute("searchVO") ComtninsttcodeDefaultVO searchVO) throws Exception {
        return comtninsttcodeService.selectComtninsttcode(comtninsttcodeVO);
    }

    @RequestMapping("/comtninsttcode/updateComtninsttcode.do")
    public String updateComtninsttcode(
            ComtninsttcodeVO comtninsttcodeVO,
            @ModelAttribute("searchVO") ComtninsttcodeDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtninsttcodeService.updateComtninsttcode(comtninsttcodeVO);
        status.setComplete();
        return "forward:/comtninsttcode/ComtninsttcodeList.do";
    }
    
    @RequestMapping("/comtninsttcode/deleteComtninsttcode.do")
    public String deleteComtninsttcode(
            ComtninsttcodeVO comtninsttcodeVO,
            @ModelAttribute("searchVO") ComtninsttcodeDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtninsttcodeService.deleteComtninsttcode(comtninsttcodeVO);
        status.setComplete();
        return "forward:/comtninsttcode/ComtninsttcodeList.do";
    }

}
