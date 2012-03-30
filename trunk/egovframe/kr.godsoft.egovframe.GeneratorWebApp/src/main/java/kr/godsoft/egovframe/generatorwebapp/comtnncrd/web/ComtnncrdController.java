package kr.godsoft.egovframe.generatorwebapp.comtnncrd.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnncrd.service.ComtnncrdService;
import kr.godsoft.egovframe.generatorwebapp.comtnncrd.service.ComtnncrdDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnncrd.service.ComtnncrdVO;

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
 * @Class Name : ComtnncrdController.java
 * @Description : Comtnncrd Controller class
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
public class ComtnncrdController {

    @Resource(name = "comtnncrdService")
    private ComtnncrdService comtnncrdService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNNCRD 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnncrdVO
	 * @return "/comtnncrd/ComtnncrdList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnncrd/ComtnncrdList.do")
    public String selectComtnncrdList(@ModelAttribute("searchVO") ComtnncrdVO searchVO, 
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
		
        List<EgovMap> comtnncrdList = comtnncrdService.selectComtnncrdList(searchVO);
        model.addAttribute("resultList", comtnncrdList);
        
        int totCnt = comtnncrdService.selectComtnncrdListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnncrd/ComtnncrdList";
    } 
    
    @RequestMapping("/comtnncrd/addComtnncrdView.do")
    public String addComtnncrdView(
            @ModelAttribute("searchVO") ComtnncrdDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnncrdVO", new ComtnncrdVO());
        return "/comtnncrd/ComtnncrdRegister";
    }
    
    @RequestMapping("/comtnncrd/addComtnncrd.do")
    public String addComtnncrd(
            ComtnncrdVO comtnncrdVO,
            @ModelAttribute("searchVO") ComtnncrdDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnncrdService.insertComtnncrd(comtnncrdVO);
        status.setComplete();
        return "forward:/comtnncrd/ComtnncrdList.do";
    }
    
    @RequestMapping("/comtnncrd/updateComtnncrdView.do")
    public String updateComtnncrdView(
            @RequestParam("ncrdId") String ncrdId ,
            @ModelAttribute("searchVO") ComtnncrdDefaultVO searchVO, Model model)
            throws Exception {
        ComtnncrdVO comtnncrdVO = new ComtnncrdVO();
        comtnncrdVO.setNcrdId(ncrdId);
;        
        // 변수명은 CoC 에 따라 comtnncrdVO
        model.addAttribute(selectComtnncrd(comtnncrdVO, searchVO));
        return "/comtnncrd/ComtnncrdRegister";
    }

    @RequestMapping("/comtnncrd/selectComtnncrd.do")
    public @ModelAttribute("comtnncrdVO")
    ComtnncrdVO selectComtnncrd(
            ComtnncrdVO comtnncrdVO,
            @ModelAttribute("searchVO") ComtnncrdDefaultVO searchVO) throws Exception {
        return comtnncrdService.selectComtnncrd(comtnncrdVO);
    }

    @RequestMapping("/comtnncrd/updateComtnncrd.do")
    public String updateComtnncrd(
            ComtnncrdVO comtnncrdVO,
            @ModelAttribute("searchVO") ComtnncrdDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnncrdService.updateComtnncrd(comtnncrdVO);
        status.setComplete();
        return "forward:/comtnncrd/ComtnncrdList.do";
    }
    
    @RequestMapping("/comtnncrd/deleteComtnncrd.do")
    public String deleteComtnncrd(
            ComtnncrdVO comtnncrdVO,
            @ModelAttribute("searchVO") ComtnncrdDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnncrdService.deleteComtnncrd(comtnncrdVO);
        status.setComplete();
        return "forward:/comtnncrd/ComtnncrdList.do";
    }

}
