package kr.godsoft.egovframe.generatorwebapp.comtnwikmnthngreprt.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtnwikmnthngreprt.service.ComtnwikmnthngreprtService;
import kr.godsoft.egovframe.generatorwebapp.comtnwikmnthngreprt.service.ComtnwikmnthngreprtDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnwikmnthngreprt.service.ComtnwikmnthngreprtVO;

/**
 * @Class Name : ComtnwikmnthngreprtController.java
 * @Description : Comtnwikmnthngreprt Controller class
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
@SessionAttributes(types=ComtnwikmnthngreprtVO.class)
public class ComtnwikmnthngreprtController {

    @Resource(name = "comtnwikmnthngreprtService")
    private ComtnwikmnthngreprtService comtnwikmnthngreprtService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnwikmnthngreprt 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnwikmnthngreprtDefaultVO
	 * @return "/comtnwikmnthngreprt/ComtnwikmnthngreprtList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnwikmnthngreprt/ComtnwikmnthngreprtList.do")
    public String selectComtnwikmnthngreprtList(@ModelAttribute("searchVO") ComtnwikmnthngreprtDefaultVO searchVO, 
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
		
        List comtnwikmnthngreprtList = comtnwikmnthngreprtService.selectComtnwikmnthngreprtList(searchVO);
        model.addAttribute("resultList", comtnwikmnthngreprtList);
        
        int totCnt = comtnwikmnthngreprtService.selectComtnwikmnthngreprtListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnwikmnthngreprt/ComtnwikmnthngreprtList";
    } 
    
    @RequestMapping("/comtnwikmnthngreprt/addComtnwikmnthngreprtView.do")
    public String addComtnwikmnthngreprtView(
            @ModelAttribute("searchVO") ComtnwikmnthngreprtDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnwikmnthngreprtVO", new ComtnwikmnthngreprtVO());
        return "/comtnwikmnthngreprt/ComtnwikmnthngreprtRegister";
    }
    
    @RequestMapping("/comtnwikmnthngreprt/addComtnwikmnthngreprt.do")
    public String addComtnwikmnthngreprt(
            ComtnwikmnthngreprtVO comtnwikmnthngreprtVO,
            @ModelAttribute("searchVO") ComtnwikmnthngreprtDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnwikmnthngreprtService.insertComtnwikmnthngreprt(comtnwikmnthngreprtVO);
        status.setComplete();
        return "forward:/comtnwikmnthngreprt/ComtnwikmnthngreprtList.do";
    }
    
    @RequestMapping("/comtnwikmnthngreprt/updateComtnwikmnthngreprtView.do")
    public String updateComtnwikmnthngreprtView(
            @RequestParam("reprtId") String reprtId ,
            @ModelAttribute("searchVO") ComtnwikmnthngreprtDefaultVO searchVO, Model model)
            throws Exception {
        ComtnwikmnthngreprtVO comtnwikmnthngreprtVO = new ComtnwikmnthngreprtVO();
        comtnwikmnthngreprtVO.setReprtId(reprtId);
;        
        // 변수명은 CoC 에 따라 comtnwikmnthngreprtVO
        model.addAttribute(selectComtnwikmnthngreprt(comtnwikmnthngreprtVO, searchVO));
        return "/comtnwikmnthngreprt/ComtnwikmnthngreprtRegister";
    }

    @RequestMapping("/comtnwikmnthngreprt/selectComtnwikmnthngreprt.do")
    public @ModelAttribute("comtnwikmnthngreprtVO")
    ComtnwikmnthngreprtVO selectComtnwikmnthngreprt(
            ComtnwikmnthngreprtVO comtnwikmnthngreprtVO,
            @ModelAttribute("searchVO") ComtnwikmnthngreprtDefaultVO searchVO) throws Exception {
        return comtnwikmnthngreprtService.selectComtnwikmnthngreprt(comtnwikmnthngreprtVO);
    }

    @RequestMapping("/comtnwikmnthngreprt/updateComtnwikmnthngreprt.do")
    public String updateComtnwikmnthngreprt(
            ComtnwikmnthngreprtVO comtnwikmnthngreprtVO,
            @ModelAttribute("searchVO") ComtnwikmnthngreprtDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnwikmnthngreprtService.updateComtnwikmnthngreprt(comtnwikmnthngreprtVO);
        status.setComplete();
        return "forward:/comtnwikmnthngreprt/ComtnwikmnthngreprtList.do";
    }
    
    @RequestMapping("/comtnwikmnthngreprt/deleteComtnwikmnthngreprt.do")
    public String deleteComtnwikmnthngreprt(
            ComtnwikmnthngreprtVO comtnwikmnthngreprtVO,
            @ModelAttribute("searchVO") ComtnwikmnthngreprtDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnwikmnthngreprtService.deleteComtnwikmnthngreprt(comtnwikmnthngreprtVO);
        status.setComplete();
        return "forward:/comtnwikmnthngreprt/ComtnwikmnthngreprtList.do";
    }

}
