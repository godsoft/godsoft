package kr.godsoft.egovframe.generatorwebapp.comtnindvdlinfopolicy.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnindvdlinfopolicy.service.ComtnindvdlinfopolicyService;
import kr.godsoft.egovframe.generatorwebapp.comtnindvdlinfopolicy.service.ComtnindvdlinfopolicyDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnindvdlinfopolicy.service.ComtnindvdlinfopolicyVO;

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
 * @Class Name : ComtnindvdlinfopolicyController.java
 * @Description : Comtnindvdlinfopolicy Controller class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Controller
@SessionAttributes(types=ComtnindvdlinfopolicyVO.class)
public class ComtnindvdlinfopolicyController {

    @Resource(name = "comtnindvdlinfopolicyService")
    private ComtnindvdlinfopolicyService comtnindvdlinfopolicyService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnindvdlinfopolicy 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnindvdlinfopolicyVO
	 * @return "/comtnindvdlinfopolicy/ComtnindvdlinfopolicyList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnindvdlinfopolicy/ComtnindvdlinfopolicyList.do")
    public String selectComtnindvdlinfopolicyList(@ModelAttribute("searchVO") ComtnindvdlinfopolicyVO searchVO, 
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
		
        List<EgovMap> comtnindvdlinfopolicyList = comtnindvdlinfopolicyService.selectComtnindvdlinfopolicyList(searchVO);
        model.addAttribute("resultList", comtnindvdlinfopolicyList);
        
        int totCnt = comtnindvdlinfopolicyService.selectComtnindvdlinfopolicyListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnindvdlinfopolicy/ComtnindvdlinfopolicyList";
    } 
    
    @RequestMapping("/comtnindvdlinfopolicy/addComtnindvdlinfopolicyView.do")
    public String addComtnindvdlinfopolicyView(
            @ModelAttribute("searchVO") ComtnindvdlinfopolicyDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnindvdlinfopolicyVO", new ComtnindvdlinfopolicyVO());
        return "/comtnindvdlinfopolicy/ComtnindvdlinfopolicyRegister";
    }
    
    @RequestMapping("/comtnindvdlinfopolicy/addComtnindvdlinfopolicy.do")
    public String addComtnindvdlinfopolicy(
            ComtnindvdlinfopolicyVO comtnindvdlinfopolicyVO,
            @ModelAttribute("searchVO") ComtnindvdlinfopolicyDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnindvdlinfopolicyService.insertComtnindvdlinfopolicy(comtnindvdlinfopolicyVO);
        status.setComplete();
        return "forward:/comtnindvdlinfopolicy/ComtnindvdlinfopolicyList.do";
    }
    
    @RequestMapping("/comtnindvdlinfopolicy/updateComtnindvdlinfopolicyView.do")
    public String updateComtnindvdlinfopolicyView(
            @RequestParam("indvdlInfoPolicyId") String indvdlInfoPolicyId ,
            @ModelAttribute("searchVO") ComtnindvdlinfopolicyDefaultVO searchVO, Model model)
            throws Exception {
        ComtnindvdlinfopolicyVO comtnindvdlinfopolicyVO = new ComtnindvdlinfopolicyVO();
        comtnindvdlinfopolicyVO.setIndvdlInfoPolicyId(indvdlInfoPolicyId);
;        
        // 변수명은 CoC 에 따라 comtnindvdlinfopolicyVO
        model.addAttribute(selectComtnindvdlinfopolicy(comtnindvdlinfopolicyVO, searchVO));
        return "/comtnindvdlinfopolicy/ComtnindvdlinfopolicyRegister";
    }

    @RequestMapping("/comtnindvdlinfopolicy/selectComtnindvdlinfopolicy.do")
    public @ModelAttribute("comtnindvdlinfopolicyVO")
    ComtnindvdlinfopolicyVO selectComtnindvdlinfopolicy(
            ComtnindvdlinfopolicyVO comtnindvdlinfopolicyVO,
            @ModelAttribute("searchVO") ComtnindvdlinfopolicyDefaultVO searchVO) throws Exception {
        return comtnindvdlinfopolicyService.selectComtnindvdlinfopolicy(comtnindvdlinfopolicyVO);
    }

    @RequestMapping("/comtnindvdlinfopolicy/updateComtnindvdlinfopolicy.do")
    public String updateComtnindvdlinfopolicy(
            ComtnindvdlinfopolicyVO comtnindvdlinfopolicyVO,
            @ModelAttribute("searchVO") ComtnindvdlinfopolicyDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnindvdlinfopolicyService.updateComtnindvdlinfopolicy(comtnindvdlinfopolicyVO);
        status.setComplete();
        return "forward:/comtnindvdlinfopolicy/ComtnindvdlinfopolicyList.do";
    }
    
    @RequestMapping("/comtnindvdlinfopolicy/deleteComtnindvdlinfopolicy.do")
    public String deleteComtnindvdlinfopolicy(
            ComtnindvdlinfopolicyVO comtnindvdlinfopolicyVO,
            @ModelAttribute("searchVO") ComtnindvdlinfopolicyDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnindvdlinfopolicyService.deleteComtnindvdlinfopolicy(comtnindvdlinfopolicyVO);
        status.setComplete();
        return "forward:/comtnindvdlinfopolicy/ComtnindvdlinfopolicyList.do";
    }

}
