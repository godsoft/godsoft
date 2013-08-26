package kr.godsoft.egovframe.generatorwebapp.comtrdnmadrzip.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtrdnmadrzip.service.ComtrdnmadrzipService;
import kr.godsoft.egovframe.generatorwebapp.comtrdnmadrzip.service.ComtrdnmadrzipDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtrdnmadrzip.service.ComtrdnmadrzipVO;

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
 * @Class Name : ComtrdnmadrzipController.java
 * @Description : Comtrdnmadrzip Controller class
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
public class ComtrdnmadrzipController {

    @Resource(name = "comtrdnmadrzipService")
    private ComtrdnmadrzipService comtrdnmadrzipService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTRDNMADRZIP 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtrdnmadrzipVO
	 * @return "/comtrdnmadrzip/ComtrdnmadrzipList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtrdnmadrzip/ComtrdnmadrzipList.do")
    public String selectComtrdnmadrzipList(@ModelAttribute("searchVO") ComtrdnmadrzipVO searchVO, 
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
		
        List<EgovMap> comtrdnmadrzipList = comtrdnmadrzipService.selectComtrdnmadrzipList(searchVO);
        model.addAttribute("resultList", comtrdnmadrzipList);
        
        int totCnt = comtrdnmadrzipService.selectComtrdnmadrzipListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtrdnmadrzip/ComtrdnmadrzipList";
    } 
    
    @RequestMapping("/comtrdnmadrzip/addComtrdnmadrzipView.do")
    public String addComtrdnmadrzipView(
            @ModelAttribute("searchVO") ComtrdnmadrzipDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtrdnmadrzipVO", new ComtrdnmadrzipVO());
        return "/comtrdnmadrzip/ComtrdnmadrzipRegister";
    }
    
    @RequestMapping("/comtrdnmadrzip/addComtrdnmadrzip.do")
    public String addComtrdnmadrzip(
            ComtrdnmadrzipVO comtrdnmadrzipVO,
            @ModelAttribute("searchVO") ComtrdnmadrzipDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtrdnmadrzipService.insertComtrdnmadrzip(comtrdnmadrzipVO);
        status.setComplete();
        return "forward:/comtrdnmadrzip/ComtrdnmadrzipList.do";
    }
    
    @RequestMapping("/comtrdnmadrzip/updateComtrdnmadrzipView.do")
    public String updateComtrdnmadrzipView(
            @RequestParam("sn") String sn ,
            @ModelAttribute("searchVO") ComtrdnmadrzipDefaultVO searchVO, Model model)
            throws Exception {
        ComtrdnmadrzipVO comtrdnmadrzipVO = new ComtrdnmadrzipVO();
        comtrdnmadrzipVO.setSn(sn);
;        
        // 변수명은 CoC 에 따라 comtrdnmadrzipVO
        model.addAttribute(selectComtrdnmadrzip(comtrdnmadrzipVO, searchVO));
        return "/comtrdnmadrzip/ComtrdnmadrzipRegister";
    }

    @RequestMapping("/comtrdnmadrzip/selectComtrdnmadrzip.do")
    public @ModelAttribute("comtrdnmadrzipVO")
    ComtrdnmadrzipVO selectComtrdnmadrzip(
            ComtrdnmadrzipVO comtrdnmadrzipVO,
            @ModelAttribute("searchVO") ComtrdnmadrzipDefaultVO searchVO) throws Exception {
        return comtrdnmadrzipService.selectComtrdnmadrzip(comtrdnmadrzipVO);
    }

    @RequestMapping("/comtrdnmadrzip/updateComtrdnmadrzip.do")
    public String updateComtrdnmadrzip(
            ComtrdnmadrzipVO comtrdnmadrzipVO,
            @ModelAttribute("searchVO") ComtrdnmadrzipDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtrdnmadrzipService.updateComtrdnmadrzip(comtrdnmadrzipVO);
        status.setComplete();
        return "forward:/comtrdnmadrzip/ComtrdnmadrzipList.do";
    }
    
    @RequestMapping("/comtrdnmadrzip/deleteComtrdnmadrzip.do")
    public String deleteComtrdnmadrzip(
            ComtrdnmadrzipVO comtrdnmadrzipVO,
            @ModelAttribute("searchVO") ComtrdnmadrzipDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtrdnmadrzipService.deleteComtrdnmadrzip(comtrdnmadrzipVO);
        status.setComplete();
        return "forward:/comtrdnmadrzip/ComtrdnmadrzipList.do";
    }

}
