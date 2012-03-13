package kr.godsoft.egovframe.generatorwebapp.comtndammapkno.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtndammapkno.service.ComtndammapknoService;
import kr.godsoft.egovframe.generatorwebapp.comtndammapkno.service.ComtndammapknoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtndammapkno.service.ComtndammapknoVO;

/**
 * @Class Name : ComtndammapknoController.java
 * @Description : Comtndammapkno Controller class
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
@SessionAttributes(types=ComtndammapknoVO.class)
public class ComtndammapknoController {

    @Resource(name = "comtndammapknoService")
    private ComtndammapknoService comtndammapknoService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtndammapkno 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtndammapknoDefaultVO
	 * @return "/comtndammapkno/ComtndammapknoList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtndammapkno/ComtndammapknoList.do")
    public String selectComtndammapknoList(@ModelAttribute("searchVO") ComtndammapknoDefaultVO searchVO, 
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
		
        List comtndammapknoList = comtndammapknoService.selectComtndammapknoList(searchVO);
        model.addAttribute("resultList", comtndammapknoList);
        
        int totCnt = comtndammapknoService.selectComtndammapknoListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtndammapkno/ComtndammapknoList";
    } 
    
    @RequestMapping("/comtndammapkno/addComtndammapknoView.do")
    public String addComtndammapknoView(
            @ModelAttribute("searchVO") ComtndammapknoDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtndammapknoVO", new ComtndammapknoVO());
        return "/comtndammapkno/ComtndammapknoRegister";
    }
    
    @RequestMapping("/comtndammapkno/addComtndammapkno.do")
    public String addComtndammapkno(
            ComtndammapknoVO comtndammapknoVO,
            @ModelAttribute("searchVO") ComtndammapknoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtndammapknoService.insertComtndammapkno(comtndammapknoVO);
        status.setComplete();
        return "forward:/comtndammapkno/ComtndammapknoList.do";
    }
    
    @RequestMapping("/comtndammapkno/updateComtndammapknoView.do")
    public String updateComtndammapknoView(
            @RequestParam("knwldgTyCode") String knwldgTyCode ,
            @ModelAttribute("searchVO") ComtndammapknoDefaultVO searchVO, Model model)
            throws Exception {
        ComtndammapknoVO comtndammapknoVO = new ComtndammapknoVO();
        comtndammapknoVO.setKnwldgTyCode(knwldgTyCode);
;        
        // 변수명은 CoC 에 따라 comtndammapknoVO
        model.addAttribute(selectComtndammapkno(comtndammapknoVO, searchVO));
        return "/comtndammapkno/ComtndammapknoRegister";
    }

    @RequestMapping("/comtndammapkno/selectComtndammapkno.do")
    public @ModelAttribute("comtndammapknoVO")
    ComtndammapknoVO selectComtndammapkno(
            ComtndammapknoVO comtndammapknoVO,
            @ModelAttribute("searchVO") ComtndammapknoDefaultVO searchVO) throws Exception {
        return comtndammapknoService.selectComtndammapkno(comtndammapknoVO);
    }

    @RequestMapping("/comtndammapkno/updateComtndammapkno.do")
    public String updateComtndammapkno(
            ComtndammapknoVO comtndammapknoVO,
            @ModelAttribute("searchVO") ComtndammapknoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtndammapknoService.updateComtndammapkno(comtndammapknoVO);
        status.setComplete();
        return "forward:/comtndammapkno/ComtndammapknoList.do";
    }
    
    @RequestMapping("/comtndammapkno/deleteComtndammapkno.do")
    public String deleteComtndammapkno(
            ComtndammapknoVO comtndammapknoVO,
            @ModelAttribute("searchVO") ComtndammapknoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtndammapknoService.deleteComtndammapkno(comtndammapknoVO);
        status.setComplete();
        return "forward:/comtndammapkno/ComtndammapknoList.do";
    }

}
