package kr.godsoft.egovframe.generatorwebapp.comtnadministrationword.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtnadministrationword.service.ComtnadministrationwordService;
import kr.godsoft.egovframe.generatorwebapp.comtnadministrationword.service.ComtnadministrationwordDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnadministrationword.service.ComtnadministrationwordVO;

/**
 * @Class Name : ComtnadministrationwordController.java
 * @Description : Comtnadministrationword Controller class
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
@SessionAttributes(types=ComtnadministrationwordVO.class)
public class ComtnadministrationwordController {

    @Resource(name = "comtnadministrationwordService")
    private ComtnadministrationwordService comtnadministrationwordService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnadministrationword 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnadministrationwordDefaultVO
	 * @return "/comtnadministrationword/ComtnadministrationwordList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnadministrationword/ComtnadministrationwordList.do")
    public String selectComtnadministrationwordList(@ModelAttribute("searchVO") ComtnadministrationwordDefaultVO searchVO, 
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
		
        List comtnadministrationwordList = comtnadministrationwordService.selectComtnadministrationwordList(searchVO);
        model.addAttribute("resultList", comtnadministrationwordList);
        
        int totCnt = comtnadministrationwordService.selectComtnadministrationwordListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnadministrationword/ComtnadministrationwordList";
    } 
    
    @RequestMapping("/comtnadministrationword/addComtnadministrationwordView.do")
    public String addComtnadministrationwordView(
            @ModelAttribute("searchVO") ComtnadministrationwordDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnadministrationwordVO", new ComtnadministrationwordVO());
        return "/comtnadministrationword/ComtnadministrationwordRegister";
    }
    
    @RequestMapping("/comtnadministrationword/addComtnadministrationword.do")
    public String addComtnadministrationword(
            ComtnadministrationwordVO comtnadministrationwordVO,
            @ModelAttribute("searchVO") ComtnadministrationwordDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnadministrationwordService.insertComtnadministrationword(comtnadministrationwordVO);
        status.setComplete();
        return "forward:/comtnadministrationword/ComtnadministrationwordList.do";
    }
    
    @RequestMapping("/comtnadministrationword/updateComtnadministrationwordView.do")
    public String updateComtnadministrationwordView(
            @RequestParam("administWordId") String administWordId ,
            @ModelAttribute("searchVO") ComtnadministrationwordDefaultVO searchVO, Model model)
            throws Exception {
        ComtnadministrationwordVO comtnadministrationwordVO = new ComtnadministrationwordVO();
        comtnadministrationwordVO.setAdministWordId(administWordId);
;        
        // 변수명은 CoC 에 따라 comtnadministrationwordVO
        model.addAttribute(selectComtnadministrationword(comtnadministrationwordVO, searchVO));
        return "/comtnadministrationword/ComtnadministrationwordRegister";
    }

    @RequestMapping("/comtnadministrationword/selectComtnadministrationword.do")
    public @ModelAttribute("comtnadministrationwordVO")
    ComtnadministrationwordVO selectComtnadministrationword(
            ComtnadministrationwordVO comtnadministrationwordVO,
            @ModelAttribute("searchVO") ComtnadministrationwordDefaultVO searchVO) throws Exception {
        return comtnadministrationwordService.selectComtnadministrationword(comtnadministrationwordVO);
    }

    @RequestMapping("/comtnadministrationword/updateComtnadministrationword.do")
    public String updateComtnadministrationword(
            ComtnadministrationwordVO comtnadministrationwordVO,
            @ModelAttribute("searchVO") ComtnadministrationwordDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnadministrationwordService.updateComtnadministrationword(comtnadministrationwordVO);
        status.setComplete();
        return "forward:/comtnadministrationword/ComtnadministrationwordList.do";
    }
    
    @RequestMapping("/comtnadministrationword/deleteComtnadministrationword.do")
    public String deleteComtnadministrationword(
            ComtnadministrationwordVO comtnadministrationwordVO,
            @ModelAttribute("searchVO") ComtnadministrationwordDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnadministrationwordService.deleteComtnadministrationword(comtnadministrationwordVO);
        status.setComplete();
        return "forward:/comtnadministrationword/ComtnadministrationwordList.do";
    }

}
