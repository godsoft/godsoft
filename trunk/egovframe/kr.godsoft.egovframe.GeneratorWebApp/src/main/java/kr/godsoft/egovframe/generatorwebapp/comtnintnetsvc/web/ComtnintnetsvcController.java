package kr.godsoft.egovframe.generatorwebapp.comtnintnetsvc.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtnintnetsvc.service.ComtnintnetsvcService;
import kr.godsoft.egovframe.generatorwebapp.comtnintnetsvc.service.ComtnintnetsvcDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnintnetsvc.service.ComtnintnetsvcVO;

/**
 * @Class Name : ComtnintnetsvcController.java
 * @Description : Comtnintnetsvc Controller class
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
@SessionAttributes(types=ComtnintnetsvcVO.class)
public class ComtnintnetsvcController {

    @Resource(name = "comtnintnetsvcService")
    private ComtnintnetsvcService comtnintnetsvcService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnintnetsvc 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnintnetsvcDefaultVO
	 * @return "/comtnintnetsvc/ComtnintnetsvcList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnintnetsvc/ComtnintnetsvcList.do")
    public String selectComtnintnetsvcList(@ModelAttribute("searchVO") ComtnintnetsvcDefaultVO searchVO, 
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
		
        List comtnintnetsvcList = comtnintnetsvcService.selectComtnintnetsvcList(searchVO);
        model.addAttribute("resultList", comtnintnetsvcList);
        
        int totCnt = comtnintnetsvcService.selectComtnintnetsvcListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnintnetsvc/ComtnintnetsvcList";
    } 
    
    @RequestMapping("/comtnintnetsvc/addComtnintnetsvcView.do")
    public String addComtnintnetsvcView(
            @ModelAttribute("searchVO") ComtnintnetsvcDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnintnetsvcVO", new ComtnintnetsvcVO());
        return "/comtnintnetsvc/ComtnintnetsvcRegister";
    }
    
    @RequestMapping("/comtnintnetsvc/addComtnintnetsvc.do")
    public String addComtnintnetsvc(
            ComtnintnetsvcVO comtnintnetsvcVO,
            @ModelAttribute("searchVO") ComtnintnetsvcDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnintnetsvcService.insertComtnintnetsvc(comtnintnetsvcVO);
        status.setComplete();
        return "forward:/comtnintnetsvc/ComtnintnetsvcList.do";
    }
    
    @RequestMapping("/comtnintnetsvc/updateComtnintnetsvcView.do")
    public String updateComtnintnetsvcView(
            @RequestParam("intnetSvcId") String intnetSvcId ,
            @ModelAttribute("searchVO") ComtnintnetsvcDefaultVO searchVO, Model model)
            throws Exception {
        ComtnintnetsvcVO comtnintnetsvcVO = new ComtnintnetsvcVO();
        comtnintnetsvcVO.setIntnetSvcId(intnetSvcId);
;        
        // 변수명은 CoC 에 따라 comtnintnetsvcVO
        model.addAttribute(selectComtnintnetsvc(comtnintnetsvcVO, searchVO));
        return "/comtnintnetsvc/ComtnintnetsvcRegister";
    }

    @RequestMapping("/comtnintnetsvc/selectComtnintnetsvc.do")
    public @ModelAttribute("comtnintnetsvcVO")
    ComtnintnetsvcVO selectComtnintnetsvc(
            ComtnintnetsvcVO comtnintnetsvcVO,
            @ModelAttribute("searchVO") ComtnintnetsvcDefaultVO searchVO) throws Exception {
        return comtnintnetsvcService.selectComtnintnetsvc(comtnintnetsvcVO);
    }

    @RequestMapping("/comtnintnetsvc/updateComtnintnetsvc.do")
    public String updateComtnintnetsvc(
            ComtnintnetsvcVO comtnintnetsvcVO,
            @ModelAttribute("searchVO") ComtnintnetsvcDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnintnetsvcService.updateComtnintnetsvc(comtnintnetsvcVO);
        status.setComplete();
        return "forward:/comtnintnetsvc/ComtnintnetsvcList.do";
    }
    
    @RequestMapping("/comtnintnetsvc/deleteComtnintnetsvc.do")
    public String deleteComtnintnetsvc(
            ComtnintnetsvcVO comtnintnetsvcVO,
            @ModelAttribute("searchVO") ComtnintnetsvcDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnintnetsvcService.deleteComtnintnetsvc(comtnintnetsvcVO);
        status.setComplete();
        return "forward:/comtnintnetsvc/ComtnintnetsvcList.do";
    }

}
