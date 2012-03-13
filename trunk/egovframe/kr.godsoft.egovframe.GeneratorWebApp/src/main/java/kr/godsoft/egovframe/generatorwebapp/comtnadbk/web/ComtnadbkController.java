package kr.godsoft.egovframe.generatorwebapp.comtnadbk.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtnadbk.service.ComtnadbkService;
import kr.godsoft.egovframe.generatorwebapp.comtnadbk.service.ComtnadbkDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnadbk.service.ComtnadbkVO;

/**
 * @Class Name : ComtnadbkController.java
 * @Description : Comtnadbk Controller class
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
@SessionAttributes(types=ComtnadbkVO.class)
public class ComtnadbkController {

    @Resource(name = "comtnadbkService")
    private ComtnadbkService comtnadbkService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnadbk 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnadbkDefaultVO
	 * @return "/comtnadbk/ComtnadbkList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnadbk/ComtnadbkList.do")
    public String selectComtnadbkList(@ModelAttribute("searchVO") ComtnadbkDefaultVO searchVO, 
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
		
        List comtnadbkList = comtnadbkService.selectComtnadbkList(searchVO);
        model.addAttribute("resultList", comtnadbkList);
        
        int totCnt = comtnadbkService.selectComtnadbkListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnadbk/ComtnadbkList";
    } 
    
    @RequestMapping("/comtnadbk/addComtnadbkView.do")
    public String addComtnadbkView(
            @ModelAttribute("searchVO") ComtnadbkDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnadbkVO", new ComtnadbkVO());
        return "/comtnadbk/ComtnadbkRegister";
    }
    
    @RequestMapping("/comtnadbk/addComtnadbk.do")
    public String addComtnadbk(
            ComtnadbkVO comtnadbkVO,
            @ModelAttribute("searchVO") ComtnadbkDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnadbkService.insertComtnadbk(comtnadbkVO);
        status.setComplete();
        return "forward:/comtnadbk/ComtnadbkList.do";
    }
    
    @RequestMapping("/comtnadbk/updateComtnadbkView.do")
    public String updateComtnadbkView(
            @RequestParam("adbkConstntId") String adbkConstntId ,
            @RequestParam("adbkId") String adbkId ,
            @ModelAttribute("searchVO") ComtnadbkDefaultVO searchVO, Model model)
            throws Exception {
        ComtnadbkVO comtnadbkVO = new ComtnadbkVO();
        comtnadbkVO.setAdbkConstntId(adbkConstntId);
        comtnadbkVO.setAdbkId(adbkId);
;        
        // 변수명은 CoC 에 따라 comtnadbkVO
        model.addAttribute(selectComtnadbk(comtnadbkVO, searchVO));
        return "/comtnadbk/ComtnadbkRegister";
    }

    @RequestMapping("/comtnadbk/selectComtnadbk.do")
    public @ModelAttribute("comtnadbkVO")
    ComtnadbkVO selectComtnadbk(
            ComtnadbkVO comtnadbkVO,
            @ModelAttribute("searchVO") ComtnadbkDefaultVO searchVO) throws Exception {
        return comtnadbkService.selectComtnadbk(comtnadbkVO);
    }

    @RequestMapping("/comtnadbk/updateComtnadbk.do")
    public String updateComtnadbk(
            ComtnadbkVO comtnadbkVO,
            @ModelAttribute("searchVO") ComtnadbkDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnadbkService.updateComtnadbk(comtnadbkVO);
        status.setComplete();
        return "forward:/comtnadbk/ComtnadbkList.do";
    }
    
    @RequestMapping("/comtnadbk/deleteComtnadbk.do")
    public String deleteComtnadbk(
            ComtnadbkVO comtnadbkVO,
            @ModelAttribute("searchVO") ComtnadbkDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnadbkService.deleteComtnadbk(comtnadbkVO);
        status.setComplete();
        return "forward:/comtnadbk/ComtnadbkList.do";
    }

}
