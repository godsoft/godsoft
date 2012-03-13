package kr.godsoft.egovframe.generatorwebapp.comtnleaderschdulde.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtnleaderschdulde.service.ComtnleaderschduldeService;
import kr.godsoft.egovframe.generatorwebapp.comtnleaderschdulde.service.ComtnleaderschduldeDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnleaderschdulde.service.ComtnleaderschduldeVO;

/**
 * @Class Name : ComtnleaderschduldeController.java
 * @Description : Comtnleaderschdulde Controller class
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
@SessionAttributes(types=ComtnleaderschduldeVO.class)
public class ComtnleaderschduldeController {

    @Resource(name = "comtnleaderschduldeService")
    private ComtnleaderschduldeService comtnleaderschduldeService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnleaderschdulde 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnleaderschduldeDefaultVO
	 * @return "/comtnleaderschdulde/ComtnleaderschduldeList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnleaderschdulde/ComtnleaderschduldeList.do")
    public String selectComtnleaderschduldeList(@ModelAttribute("searchVO") ComtnleaderschduldeDefaultVO searchVO, 
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
		
        List comtnleaderschduldeList = comtnleaderschduldeService.selectComtnleaderschduldeList(searchVO);
        model.addAttribute("resultList", comtnleaderschduldeList);
        
        int totCnt = comtnleaderschduldeService.selectComtnleaderschduldeListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnleaderschdulde/ComtnleaderschduldeList";
    } 
    
    @RequestMapping("/comtnleaderschdulde/addComtnleaderschduldeView.do")
    public String addComtnleaderschduldeView(
            @ModelAttribute("searchVO") ComtnleaderschduldeDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnleaderschduldeVO", new ComtnleaderschduldeVO());
        return "/comtnleaderschdulde/ComtnleaderschduldeRegister";
    }
    
    @RequestMapping("/comtnleaderschdulde/addComtnleaderschdulde.do")
    public String addComtnleaderschdulde(
            ComtnleaderschduldeVO comtnleaderschduldeVO,
            @ModelAttribute("searchVO") ComtnleaderschduldeDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnleaderschduldeService.insertComtnleaderschdulde(comtnleaderschduldeVO);
        status.setComplete();
        return "forward:/comtnleaderschdulde/ComtnleaderschduldeList.do";
    }
    
    @RequestMapping("/comtnleaderschdulde/updateComtnleaderschduldeView.do")
    public String updateComtnleaderschduldeView(
            @RequestParam("schdulId") String schdulId ,
            @RequestParam("schdulDe") String schdulDe ,
            @ModelAttribute("searchVO") ComtnleaderschduldeDefaultVO searchVO, Model model)
            throws Exception {
        ComtnleaderschduldeVO comtnleaderschduldeVO = new ComtnleaderschduldeVO();
        comtnleaderschduldeVO.setSchdulId(schdulId);
        comtnleaderschduldeVO.setSchdulDe(schdulDe);
;        
        // 변수명은 CoC 에 따라 comtnleaderschduldeVO
        model.addAttribute(selectComtnleaderschdulde(comtnleaderschduldeVO, searchVO));
        return "/comtnleaderschdulde/ComtnleaderschduldeRegister";
    }

    @RequestMapping("/comtnleaderschdulde/selectComtnleaderschdulde.do")
    public @ModelAttribute("comtnleaderschduldeVO")
    ComtnleaderschduldeVO selectComtnleaderschdulde(
            ComtnleaderschduldeVO comtnleaderschduldeVO,
            @ModelAttribute("searchVO") ComtnleaderschduldeDefaultVO searchVO) throws Exception {
        return comtnleaderschduldeService.selectComtnleaderschdulde(comtnleaderschduldeVO);
    }

    @RequestMapping("/comtnleaderschdulde/updateComtnleaderschdulde.do")
    public String updateComtnleaderschdulde(
            ComtnleaderschduldeVO comtnleaderschduldeVO,
            @ModelAttribute("searchVO") ComtnleaderschduldeDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnleaderschduldeService.updateComtnleaderschdulde(comtnleaderschduldeVO);
        status.setComplete();
        return "forward:/comtnleaderschdulde/ComtnleaderschduldeList.do";
    }
    
    @RequestMapping("/comtnleaderschdulde/deleteComtnleaderschdulde.do")
    public String deleteComtnleaderschdulde(
            ComtnleaderschduldeVO comtnleaderschduldeVO,
            @ModelAttribute("searchVO") ComtnleaderschduldeDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnleaderschduldeService.deleteComtnleaderschdulde(comtnleaderschduldeVO);
        status.setComplete();
        return "forward:/comtnleaderschdulde/ComtnleaderschduldeList.do";
    }

}
