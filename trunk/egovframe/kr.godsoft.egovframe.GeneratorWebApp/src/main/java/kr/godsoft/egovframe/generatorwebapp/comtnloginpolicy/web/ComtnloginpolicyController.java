package kr.godsoft.egovframe.generatorwebapp.comtnloginpolicy.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnloginpolicy.service.ComtnloginpolicyService;
import kr.godsoft.egovframe.generatorwebapp.comtnloginpolicy.service.ComtnloginpolicyDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnloginpolicy.service.ComtnloginpolicyVO;

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
 * @Class Name : ComtnloginpolicyController.java
 * @Description : Comtnloginpolicy Controller class
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
@SessionAttributes(types=ComtnloginpolicyVO.class)
public class ComtnloginpolicyController {

    @Resource(name = "comtnloginpolicyService")
    private ComtnloginpolicyService comtnloginpolicyService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnloginpolicy 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnloginpolicyVO
	 * @return "/comtnloginpolicy/ComtnloginpolicyList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnloginpolicy/ComtnloginpolicyList.do")
    public String selectComtnloginpolicyList(@ModelAttribute("searchVO") ComtnloginpolicyVO searchVO, 
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
		
        List<EgovMap> comtnloginpolicyList = comtnloginpolicyService.selectComtnloginpolicyList(searchVO);
        model.addAttribute("resultList", comtnloginpolicyList);
        
        int totCnt = comtnloginpolicyService.selectComtnloginpolicyListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnloginpolicy/ComtnloginpolicyList";
    } 
    
    @RequestMapping("/comtnloginpolicy/addComtnloginpolicyView.do")
    public String addComtnloginpolicyView(
            @ModelAttribute("searchVO") ComtnloginpolicyDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnloginpolicyVO", new ComtnloginpolicyVO());
        return "/comtnloginpolicy/ComtnloginpolicyRegister";
    }
    
    @RequestMapping("/comtnloginpolicy/addComtnloginpolicy.do")
    public String addComtnloginpolicy(
            ComtnloginpolicyVO comtnloginpolicyVO,
            @ModelAttribute("searchVO") ComtnloginpolicyDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnloginpolicyService.insertComtnloginpolicy(comtnloginpolicyVO);
        status.setComplete();
        return "forward:/comtnloginpolicy/ComtnloginpolicyList.do";
    }
    
    @RequestMapping("/comtnloginpolicy/updateComtnloginpolicyView.do")
    public String updateComtnloginpolicyView(
            @RequestParam("emplyrId") String emplyrId ,
            @ModelAttribute("searchVO") ComtnloginpolicyDefaultVO searchVO, Model model)
            throws Exception {
        ComtnloginpolicyVO comtnloginpolicyVO = new ComtnloginpolicyVO();
        comtnloginpolicyVO.setEmplyrId(emplyrId);
;        
        // 변수명은 CoC 에 따라 comtnloginpolicyVO
        model.addAttribute(selectComtnloginpolicy(comtnloginpolicyVO, searchVO));
        return "/comtnloginpolicy/ComtnloginpolicyRegister";
    }

    @RequestMapping("/comtnloginpolicy/selectComtnloginpolicy.do")
    public @ModelAttribute("comtnloginpolicyVO")
    ComtnloginpolicyVO selectComtnloginpolicy(
            ComtnloginpolicyVO comtnloginpolicyVO,
            @ModelAttribute("searchVO") ComtnloginpolicyDefaultVO searchVO) throws Exception {
        return comtnloginpolicyService.selectComtnloginpolicy(comtnloginpolicyVO);
    }

    @RequestMapping("/comtnloginpolicy/updateComtnloginpolicy.do")
    public String updateComtnloginpolicy(
            ComtnloginpolicyVO comtnloginpolicyVO,
            @ModelAttribute("searchVO") ComtnloginpolicyDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnloginpolicyService.updateComtnloginpolicy(comtnloginpolicyVO);
        status.setComplete();
        return "forward:/comtnloginpolicy/ComtnloginpolicyList.do";
    }
    
    @RequestMapping("/comtnloginpolicy/deleteComtnloginpolicy.do")
    public String deleteComtnloginpolicy(
            ComtnloginpolicyVO comtnloginpolicyVO,
            @ModelAttribute("searchVO") ComtnloginpolicyDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnloginpolicyService.deleteComtnloginpolicy(comtnloginpolicyVO);
        status.setComplete();
        return "forward:/comtnloginpolicy/ComtnloginpolicyList.do";
    }

}
