package kr.godsoft.egovframe.generatorwebapp.comtnrss.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnrss.service.ComtnrssService;
import kr.godsoft.egovframe.generatorwebapp.comtnrss.service.ComtnrssDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnrss.service.ComtnrssVO;

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
 * @Class Name : ComtnrssController.java
 * @Description : Comtnrss Controller class
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
public class ComtnrssController {

    @Resource(name = "comtnrssService")
    private ComtnrssService comtnrssService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNRSS 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnrssVO
	 * @return "/comtnrss/ComtnrssList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnrss/ComtnrssList.do")
    public String selectComtnrssList(@ModelAttribute("searchVO") ComtnrssVO searchVO, 
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
		
        List<EgovMap> comtnrssList = comtnrssService.selectComtnrssList(searchVO);
        model.addAttribute("resultList", comtnrssList);
        
        int totCnt = comtnrssService.selectComtnrssListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnrss/ComtnrssList";
    } 
    
    @RequestMapping("/comtnrss/addComtnrssView.do")
    public String addComtnrssView(
            @ModelAttribute("searchVO") ComtnrssDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnrssVO", new ComtnrssVO());
        return "/comtnrss/ComtnrssRegister";
    }
    
    @RequestMapping("/comtnrss/addComtnrss.do")
    public String addComtnrss(
            ComtnrssVO comtnrssVO,
            @ModelAttribute("searchVO") ComtnrssDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnrssService.insertComtnrss(comtnrssVO);
        status.setComplete();
        return "forward:/comtnrss/ComtnrssList.do";
    }
    
    @RequestMapping("/comtnrss/updateComtnrssView.do")
    public String updateComtnrssView(
            @RequestParam("rssId") String rssId ,
            @ModelAttribute("searchVO") ComtnrssDefaultVO searchVO, Model model)
            throws Exception {
        ComtnrssVO comtnrssVO = new ComtnrssVO();
        comtnrssVO.setRssId(rssId);
;        
        // 변수명은 CoC 에 따라 comtnrssVO
        model.addAttribute(selectComtnrss(comtnrssVO, searchVO));
        return "/comtnrss/ComtnrssRegister";
    }

    @RequestMapping("/comtnrss/selectComtnrss.do")
    public @ModelAttribute("comtnrssVO")
    ComtnrssVO selectComtnrss(
            ComtnrssVO comtnrssVO,
            @ModelAttribute("searchVO") ComtnrssDefaultVO searchVO) throws Exception {
        return comtnrssService.selectComtnrss(comtnrssVO);
    }

    @RequestMapping("/comtnrss/updateComtnrss.do")
    public String updateComtnrss(
            ComtnrssVO comtnrssVO,
            @ModelAttribute("searchVO") ComtnrssDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnrssService.updateComtnrss(comtnrssVO);
        status.setComplete();
        return "forward:/comtnrss/ComtnrssList.do";
    }
    
    @RequestMapping("/comtnrss/deleteComtnrss.do")
    public String deleteComtnrss(
            ComtnrssVO comtnrssVO,
            @ModelAttribute("searchVO") ComtnrssDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnrssService.deleteComtnrss(comtnrssVO);
        status.setComplete();
        return "forward:/comtnrss/ComtnrssList.do";
    }

}
