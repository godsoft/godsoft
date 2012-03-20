package kr.godsoft.egovframe.generatorwebapp.comtnreprtstats.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnreprtstats.service.ComtnreprtstatsService;
import kr.godsoft.egovframe.generatorwebapp.comtnreprtstats.service.ComtnreprtstatsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnreprtstats.service.ComtnreprtstatsVO;

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
 * @Class Name : ComtnreprtstatsController.java
 * @Description : Comtnreprtstats Controller class
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
public class ComtnreprtstatsController {

    @Resource(name = "comtnreprtstatsService")
    private ComtnreprtstatsService comtnreprtstatsService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnreprtstats 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnreprtstatsVO
	 * @return "/comtnreprtstats/ComtnreprtstatsList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnreprtstats/ComtnreprtstatsList.do")
    public String selectComtnreprtstatsList(@ModelAttribute("searchVO") ComtnreprtstatsVO searchVO, 
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
		
        List<EgovMap> comtnreprtstatsList = comtnreprtstatsService.selectComtnreprtstatsList(searchVO);
        model.addAttribute("resultList", comtnreprtstatsList);
        
        int totCnt = comtnreprtstatsService.selectComtnreprtstatsListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnreprtstats/ComtnreprtstatsList";
    } 
    
    @RequestMapping("/comtnreprtstats/addComtnreprtstatsView.do")
    public String addComtnreprtstatsView(
            @ModelAttribute("searchVO") ComtnreprtstatsDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnreprtstatsVO", new ComtnreprtstatsVO());
        return "/comtnreprtstats/ComtnreprtstatsRegister";
    }
    
    @RequestMapping("/comtnreprtstats/addComtnreprtstats.do")
    public String addComtnreprtstats(
            ComtnreprtstatsVO comtnreprtstatsVO,
            @ModelAttribute("searchVO") ComtnreprtstatsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnreprtstatsService.insertComtnreprtstats(comtnreprtstatsVO);
        status.setComplete();
        return "forward:/comtnreprtstats/ComtnreprtstatsList.do";
    }
    
    @RequestMapping("/comtnreprtstats/updateComtnreprtstatsView.do")
    public String updateComtnreprtstatsView(
            @RequestParam("reprtId") String reprtId ,
            @ModelAttribute("searchVO") ComtnreprtstatsDefaultVO searchVO, Model model)
            throws Exception {
        ComtnreprtstatsVO comtnreprtstatsVO = new ComtnreprtstatsVO();
        comtnreprtstatsVO.setReprtId(reprtId);
;        
        // 변수명은 CoC 에 따라 comtnreprtstatsVO
        model.addAttribute(selectComtnreprtstats(comtnreprtstatsVO, searchVO));
        return "/comtnreprtstats/ComtnreprtstatsRegister";
    }

    @RequestMapping("/comtnreprtstats/selectComtnreprtstats.do")
    public @ModelAttribute("comtnreprtstatsVO")
    ComtnreprtstatsVO selectComtnreprtstats(
            ComtnreprtstatsVO comtnreprtstatsVO,
            @ModelAttribute("searchVO") ComtnreprtstatsDefaultVO searchVO) throws Exception {
        return comtnreprtstatsService.selectComtnreprtstats(comtnreprtstatsVO);
    }

    @RequestMapping("/comtnreprtstats/updateComtnreprtstats.do")
    public String updateComtnreprtstats(
            ComtnreprtstatsVO comtnreprtstatsVO,
            @ModelAttribute("searchVO") ComtnreprtstatsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnreprtstatsService.updateComtnreprtstats(comtnreprtstatsVO);
        status.setComplete();
        return "forward:/comtnreprtstats/ComtnreprtstatsList.do";
    }
    
    @RequestMapping("/comtnreprtstats/deleteComtnreprtstats.do")
    public String deleteComtnreprtstats(
            ComtnreprtstatsVO comtnreprtstatsVO,
            @ModelAttribute("searchVO") ComtnreprtstatsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnreprtstatsService.deleteComtnreprtstats(comtnreprtstatsVO);
        status.setComplete();
        return "forward:/comtnreprtstats/ComtnreprtstatsList.do";
    }

}
