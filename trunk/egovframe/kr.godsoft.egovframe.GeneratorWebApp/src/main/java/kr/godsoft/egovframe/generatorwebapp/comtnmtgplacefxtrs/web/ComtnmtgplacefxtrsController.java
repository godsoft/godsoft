package kr.godsoft.egovframe.generatorwebapp.comtnmtgplacefxtrs.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import egovframework.rte.fdl.property.EgovPropertyService;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;

import kr.godsoft.egovframe.generatorwebapp.comtnmtgplacefxtrs.service.ComtnmtgplacefxtrsService;
import kr.godsoft.egovframe.generatorwebapp.comtnmtgplacefxtrs.service.ComtnmtgplacefxtrsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnmtgplacefxtrs.service.ComtnmtgplacefxtrsVO;

/**
 * @Class Name : ComtnmtgplacefxtrsController.java
 * @Description : Comtnmtgplacefxtrs Controller class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Controller
@SessionAttributes(types=ComtnmtgplacefxtrsVO.class)
public class ComtnmtgplacefxtrsController {

    @Resource(name = "comtnmtgplacefxtrsService")
    private ComtnmtgplacefxtrsService comtnmtgplacefxtrsService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnmtgplacefxtrs 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnmtgplacefxtrsDefaultVO
	 * @return "/comtnmtgplacefxtrs/ComtnmtgplacefxtrsList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnmtgplacefxtrs/ComtnmtgplacefxtrsList.do")
    public String selectComtnmtgplacefxtrsList(@ModelAttribute("searchVO") ComtnmtgplacefxtrsDefaultVO searchVO, 
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
		
        List comtnmtgplacefxtrsList = comtnmtgplacefxtrsService.selectComtnmtgplacefxtrsList(searchVO);
        model.addAttribute("resultList", comtnmtgplacefxtrsList);
        
        int totCnt = comtnmtgplacefxtrsService.selectComtnmtgplacefxtrsListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnmtgplacefxtrs/ComtnmtgplacefxtrsList";
    } 
    
    @RequestMapping("/comtnmtgplacefxtrs/addComtnmtgplacefxtrsView.do")
    public String addComtnmtgplacefxtrsView(
            @ModelAttribute("searchVO") ComtnmtgplacefxtrsDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnmtgplacefxtrsVO", new ComtnmtgplacefxtrsVO());
        return "/comtnmtgplacefxtrs/ComtnmtgplacefxtrsRegister";
    }
    
    @RequestMapping("/comtnmtgplacefxtrs/addComtnmtgplacefxtrs.do")
    public String addComtnmtgplacefxtrs(
            ComtnmtgplacefxtrsVO comtnmtgplacefxtrsVO,
            @ModelAttribute("searchVO") ComtnmtgplacefxtrsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnmtgplacefxtrsService.insertComtnmtgplacefxtrs(comtnmtgplacefxtrsVO);
        status.setComplete();
        return "forward:/comtnmtgplacefxtrs/ComtnmtgplacefxtrsList.do";
    }
    
    @RequestMapping("/comtnmtgplacefxtrs/updateComtnmtgplacefxtrsView.do")
    public String updateComtnmtgplacefxtrsView(
            @RequestParam("mtgrumId") String mtgrumId ,
            @RequestParam("fxtrsCode") String fxtrsCode ,
            @ModelAttribute("searchVO") ComtnmtgplacefxtrsDefaultVO searchVO, Model model)
            throws Exception {
        ComtnmtgplacefxtrsVO comtnmtgplacefxtrsVO = new ComtnmtgplacefxtrsVO();
        comtnmtgplacefxtrsVO.setMtgrumId(mtgrumId);
        comtnmtgplacefxtrsVO.setFxtrsCode(fxtrsCode);
;        
        // 변수명은 CoC 에 따라 comtnmtgplacefxtrsVO
        model.addAttribute(selectComtnmtgplacefxtrs(comtnmtgplacefxtrsVO, searchVO));
        return "/comtnmtgplacefxtrs/ComtnmtgplacefxtrsRegister";
    }

    @RequestMapping("/comtnmtgplacefxtrs/selectComtnmtgplacefxtrs.do")
    public @ModelAttribute("comtnmtgplacefxtrsVO")
    ComtnmtgplacefxtrsVO selectComtnmtgplacefxtrs(
            ComtnmtgplacefxtrsVO comtnmtgplacefxtrsVO,
            @ModelAttribute("searchVO") ComtnmtgplacefxtrsDefaultVO searchVO) throws Exception {
        return comtnmtgplacefxtrsService.selectComtnmtgplacefxtrs(comtnmtgplacefxtrsVO);
    }

    @RequestMapping("/comtnmtgplacefxtrs/updateComtnmtgplacefxtrs.do")
    public String updateComtnmtgplacefxtrs(
            ComtnmtgplacefxtrsVO comtnmtgplacefxtrsVO,
            @ModelAttribute("searchVO") ComtnmtgplacefxtrsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnmtgplacefxtrsService.updateComtnmtgplacefxtrs(comtnmtgplacefxtrsVO);
        status.setComplete();
        return "forward:/comtnmtgplacefxtrs/ComtnmtgplacefxtrsList.do";
    }
    
    @RequestMapping("/comtnmtgplacefxtrs/deleteComtnmtgplacefxtrs.do")
    public String deleteComtnmtgplacefxtrs(
            ComtnmtgplacefxtrsVO comtnmtgplacefxtrsVO,
            @ModelAttribute("searchVO") ComtnmtgplacefxtrsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnmtgplacefxtrsService.deleteComtnmtgplacefxtrs(comtnmtgplacefxtrsVO);
        status.setComplete();
        return "forward:/comtnmtgplacefxtrs/ComtnmtgplacefxtrsList.do";
    }

}
