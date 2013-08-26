package kr.godsoft.egovframe.generatorwebapp.comtnbndtdiary.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnbndtdiary.service.ComtnbndtdiaryService;
import kr.godsoft.egovframe.generatorwebapp.comtnbndtdiary.service.ComtnbndtdiaryDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbndtdiary.service.ComtnbndtdiaryVO;

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
 * @Class Name : ComtnbndtdiaryController.java
 * @Description : Comtnbndtdiary Controller class
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
public class ComtnbndtdiaryController {

    @Resource(name = "comtnbndtdiaryService")
    private ComtnbndtdiaryService comtnbndtdiaryService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNBNDTDIARY 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnbndtdiaryVO
	 * @return "/comtnbndtdiary/ComtnbndtdiaryList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnbndtdiary/ComtnbndtdiaryList.do")
    public String selectComtnbndtdiaryList(@ModelAttribute("searchVO") ComtnbndtdiaryVO searchVO, 
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
		
        List<EgovMap> comtnbndtdiaryList = comtnbndtdiaryService.selectComtnbndtdiaryList(searchVO);
        model.addAttribute("resultList", comtnbndtdiaryList);
        
        int totCnt = comtnbndtdiaryService.selectComtnbndtdiaryListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnbndtdiary/ComtnbndtdiaryList";
    } 
    
    @RequestMapping("/comtnbndtdiary/addComtnbndtdiaryView.do")
    public String addComtnbndtdiaryView(
            @ModelAttribute("searchVO") ComtnbndtdiaryDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnbndtdiaryVO", new ComtnbndtdiaryVO());
        return "/comtnbndtdiary/ComtnbndtdiaryRegister";
    }
    
    @RequestMapping("/comtnbndtdiary/addComtnbndtdiary.do")
    public String addComtnbndtdiary(
            ComtnbndtdiaryVO comtnbndtdiaryVO,
            @ModelAttribute("searchVO") ComtnbndtdiaryDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbndtdiaryService.insertComtnbndtdiary(comtnbndtdiaryVO);
        status.setComplete();
        return "forward:/comtnbndtdiary/ComtnbndtdiaryList.do";
    }
    
    @RequestMapping("/comtnbndtdiary/updateComtnbndtdiaryView.do")
    public String updateComtnbndtdiaryView(
            @RequestParam("bndtId") String bndtId ,
            @RequestParam("bndtDe") String bndtDe ,
            @RequestParam("bndtCeckSe") String bndtCeckSe ,
            @RequestParam("bndtCeckCode") String bndtCeckCode ,
            @ModelAttribute("searchVO") ComtnbndtdiaryDefaultVO searchVO, Model model)
            throws Exception {
        ComtnbndtdiaryVO comtnbndtdiaryVO = new ComtnbndtdiaryVO();
        comtnbndtdiaryVO.setBndtId(bndtId);
        comtnbndtdiaryVO.setBndtDe(bndtDe);
        comtnbndtdiaryVO.setBndtCeckSe(bndtCeckSe);
        comtnbndtdiaryVO.setBndtCeckCode(bndtCeckCode);
;        
        // 변수명은 CoC 에 따라 comtnbndtdiaryVO
        model.addAttribute(selectComtnbndtdiary(comtnbndtdiaryVO, searchVO));
        return "/comtnbndtdiary/ComtnbndtdiaryRegister";
    }

    @RequestMapping("/comtnbndtdiary/selectComtnbndtdiary.do")
    public @ModelAttribute("comtnbndtdiaryVO")
    ComtnbndtdiaryVO selectComtnbndtdiary(
            ComtnbndtdiaryVO comtnbndtdiaryVO,
            @ModelAttribute("searchVO") ComtnbndtdiaryDefaultVO searchVO) throws Exception {
        return comtnbndtdiaryService.selectComtnbndtdiary(comtnbndtdiaryVO);
    }

    @RequestMapping("/comtnbndtdiary/updateComtnbndtdiary.do")
    public String updateComtnbndtdiary(
            ComtnbndtdiaryVO comtnbndtdiaryVO,
            @ModelAttribute("searchVO") ComtnbndtdiaryDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbndtdiaryService.updateComtnbndtdiary(comtnbndtdiaryVO);
        status.setComplete();
        return "forward:/comtnbndtdiary/ComtnbndtdiaryList.do";
    }
    
    @RequestMapping("/comtnbndtdiary/deleteComtnbndtdiary.do")
    public String deleteComtnbndtdiary(
            ComtnbndtdiaryVO comtnbndtdiaryVO,
            @ModelAttribute("searchVO") ComtnbndtdiaryDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbndtdiaryService.deleteComtnbndtdiary(comtnbndtdiaryVO);
        status.setComplete();
        return "forward:/comtnbndtdiary/ComtnbndtdiaryList.do";
    }

}
