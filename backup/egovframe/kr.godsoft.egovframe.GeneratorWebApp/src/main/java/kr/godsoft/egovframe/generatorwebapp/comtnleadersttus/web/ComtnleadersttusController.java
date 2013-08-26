package kr.godsoft.egovframe.generatorwebapp.comtnleadersttus.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnleadersttus.service.ComtnleadersttusService;
import kr.godsoft.egovframe.generatorwebapp.comtnleadersttus.service.ComtnleadersttusDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnleadersttus.service.ComtnleadersttusVO;

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
 * @Class Name : ComtnleadersttusController.java
 * @Description : Comtnleadersttus Controller class
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
public class ComtnleadersttusController {

    @Resource(name = "comtnleadersttusService")
    private ComtnleadersttusService comtnleadersttusService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNLEADERSTTUS 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnleadersttusVO
	 * @return "/comtnleadersttus/ComtnleadersttusList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnleadersttus/ComtnleadersttusList.do")
    public String selectComtnleadersttusList(@ModelAttribute("searchVO") ComtnleadersttusVO searchVO, 
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
		
        List<EgovMap> comtnleadersttusList = comtnleadersttusService.selectComtnleadersttusList(searchVO);
        model.addAttribute("resultList", comtnleadersttusList);
        
        int totCnt = comtnleadersttusService.selectComtnleadersttusListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnleadersttus/ComtnleadersttusList";
    } 
    
    @RequestMapping("/comtnleadersttus/addComtnleadersttusView.do")
    public String addComtnleadersttusView(
            @ModelAttribute("searchVO") ComtnleadersttusDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnleadersttusVO", new ComtnleadersttusVO());
        return "/comtnleadersttus/ComtnleadersttusRegister";
    }
    
    @RequestMapping("/comtnleadersttus/addComtnleadersttus.do")
    public String addComtnleadersttus(
            ComtnleadersttusVO comtnleadersttusVO,
            @ModelAttribute("searchVO") ComtnleadersttusDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnleadersttusService.insertComtnleadersttus(comtnleadersttusVO);
        status.setComplete();
        return "forward:/comtnleadersttus/ComtnleadersttusList.do";
    }
    
    @RequestMapping("/comtnleadersttus/updateComtnleadersttusView.do")
    public String updateComtnleadersttusView(
            @RequestParam("leaderId") String leaderId ,
            @ModelAttribute("searchVO") ComtnleadersttusDefaultVO searchVO, Model model)
            throws Exception {
        ComtnleadersttusVO comtnleadersttusVO = new ComtnleadersttusVO();
        comtnleadersttusVO.setLeaderId(leaderId);
;        
        // 변수명은 CoC 에 따라 comtnleadersttusVO
        model.addAttribute(selectComtnleadersttus(comtnleadersttusVO, searchVO));
        return "/comtnleadersttus/ComtnleadersttusRegister";
    }

    @RequestMapping("/comtnleadersttus/selectComtnleadersttus.do")
    public @ModelAttribute("comtnleadersttusVO")
    ComtnleadersttusVO selectComtnleadersttus(
            ComtnleadersttusVO comtnleadersttusVO,
            @ModelAttribute("searchVO") ComtnleadersttusDefaultVO searchVO) throws Exception {
        return comtnleadersttusService.selectComtnleadersttus(comtnleadersttusVO);
    }

    @RequestMapping("/comtnleadersttus/updateComtnleadersttus.do")
    public String updateComtnleadersttus(
            ComtnleadersttusVO comtnleadersttusVO,
            @ModelAttribute("searchVO") ComtnleadersttusDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnleadersttusService.updateComtnleadersttus(comtnleadersttusVO);
        status.setComplete();
        return "forward:/comtnleadersttus/ComtnleadersttusList.do";
    }
    
    @RequestMapping("/comtnleadersttus/deleteComtnleadersttus.do")
    public String deleteComtnleadersttus(
            ComtnleadersttusVO comtnleadersttusVO,
            @ModelAttribute("searchVO") ComtnleadersttusDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnleadersttusService.deleteComtnleadersttus(comtnleadersttusVO);
        status.setComplete();
        return "forward:/comtnleadersttus/ComtnleadersttusList.do";
    }

}
