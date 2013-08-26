package kr.godsoft.egovframe.generatorwebapp.comtnemplyrinfo.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnemplyrinfo.service.ComtnemplyrinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnemplyrinfo.service.ComtnemplyrinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnemplyrinfo.service.ComtnemplyrinfoVO;

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
 * @Class Name : ComtnemplyrinfoController.java
 * @Description : Comtnemplyrinfo Controller class
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
public class ComtnemplyrinfoController {

    @Resource(name = "comtnemplyrinfoService")
    private ComtnemplyrinfoService comtnemplyrinfoService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNEMPLYRINFO 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnemplyrinfoVO
	 * @return "/comtnemplyrinfo/ComtnemplyrinfoList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnemplyrinfo/ComtnemplyrinfoList.do")
    public String selectComtnemplyrinfoList(@ModelAttribute("searchVO") ComtnemplyrinfoVO searchVO, 
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
		
        List<EgovMap> comtnemplyrinfoList = comtnemplyrinfoService.selectComtnemplyrinfoList(searchVO);
        model.addAttribute("resultList", comtnemplyrinfoList);
        
        int totCnt = comtnemplyrinfoService.selectComtnemplyrinfoListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnemplyrinfo/ComtnemplyrinfoList";
    } 
    
    @RequestMapping("/comtnemplyrinfo/addComtnemplyrinfoView.do")
    public String addComtnemplyrinfoView(
            @ModelAttribute("searchVO") ComtnemplyrinfoDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnemplyrinfoVO", new ComtnemplyrinfoVO());
        return "/comtnemplyrinfo/ComtnemplyrinfoRegister";
    }
    
    @RequestMapping("/comtnemplyrinfo/addComtnemplyrinfo.do")
    public String addComtnemplyrinfo(
            ComtnemplyrinfoVO comtnemplyrinfoVO,
            @ModelAttribute("searchVO") ComtnemplyrinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnemplyrinfoService.insertComtnemplyrinfo(comtnemplyrinfoVO);
        status.setComplete();
        return "forward:/comtnemplyrinfo/ComtnemplyrinfoList.do";
    }
    
    @RequestMapping("/comtnemplyrinfo/updateComtnemplyrinfoView.do")
    public String updateComtnemplyrinfoView(
            @RequestParam("emplyrId") String emplyrId ,
            @ModelAttribute("searchVO") ComtnemplyrinfoDefaultVO searchVO, Model model)
            throws Exception {
        ComtnemplyrinfoVO comtnemplyrinfoVO = new ComtnemplyrinfoVO();
        comtnemplyrinfoVO.setEmplyrId(emplyrId);
;        
        // 변수명은 CoC 에 따라 comtnemplyrinfoVO
        model.addAttribute(selectComtnemplyrinfo(comtnemplyrinfoVO, searchVO));
        return "/comtnemplyrinfo/ComtnemplyrinfoRegister";
    }

    @RequestMapping("/comtnemplyrinfo/selectComtnemplyrinfo.do")
    public @ModelAttribute("comtnemplyrinfoVO")
    ComtnemplyrinfoVO selectComtnemplyrinfo(
            ComtnemplyrinfoVO comtnemplyrinfoVO,
            @ModelAttribute("searchVO") ComtnemplyrinfoDefaultVO searchVO) throws Exception {
        return comtnemplyrinfoService.selectComtnemplyrinfo(comtnemplyrinfoVO);
    }

    @RequestMapping("/comtnemplyrinfo/updateComtnemplyrinfo.do")
    public String updateComtnemplyrinfo(
            ComtnemplyrinfoVO comtnemplyrinfoVO,
            @ModelAttribute("searchVO") ComtnemplyrinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnemplyrinfoService.updateComtnemplyrinfo(comtnemplyrinfoVO);
        status.setComplete();
        return "forward:/comtnemplyrinfo/ComtnemplyrinfoList.do";
    }
    
    @RequestMapping("/comtnemplyrinfo/deleteComtnemplyrinfo.do")
    public String deleteComtnemplyrinfo(
            ComtnemplyrinfoVO comtnemplyrinfoVO,
            @ModelAttribute("searchVO") ComtnemplyrinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnemplyrinfoService.deleteComtnemplyrinfo(comtnemplyrinfoVO);
        status.setComplete();
        return "forward:/comtnemplyrinfo/ComtnemplyrinfoList.do";
    }

}