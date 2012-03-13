package kr.godsoft.egovframe.generatorwebapp.comtnservereqpmninfo.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtnservereqpmninfo.service.ComtnservereqpmninfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnservereqpmninfo.service.ComtnservereqpmninfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnservereqpmninfo.service.ComtnservereqpmninfoVO;

/**
 * @Class Name : ComtnservereqpmninfoController.java
 * @Description : Comtnservereqpmninfo Controller class
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
@SessionAttributes(types=ComtnservereqpmninfoVO.class)
public class ComtnservereqpmninfoController {

    @Resource(name = "comtnservereqpmninfoService")
    private ComtnservereqpmninfoService comtnservereqpmninfoService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnservereqpmninfo 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnservereqpmninfoDefaultVO
	 * @return "/comtnservereqpmninfo/ComtnservereqpmninfoList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnservereqpmninfo/ComtnservereqpmninfoList.do")
    public String selectComtnservereqpmninfoList(@ModelAttribute("searchVO") ComtnservereqpmninfoDefaultVO searchVO, 
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
		
        List comtnservereqpmninfoList = comtnservereqpmninfoService.selectComtnservereqpmninfoList(searchVO);
        model.addAttribute("resultList", comtnservereqpmninfoList);
        
        int totCnt = comtnservereqpmninfoService.selectComtnservereqpmninfoListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnservereqpmninfo/ComtnservereqpmninfoList";
    } 
    
    @RequestMapping("/comtnservereqpmninfo/addComtnservereqpmninfoView.do")
    public String addComtnservereqpmninfoView(
            @ModelAttribute("searchVO") ComtnservereqpmninfoDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnservereqpmninfoVO", new ComtnservereqpmninfoVO());
        return "/comtnservereqpmninfo/ComtnservereqpmninfoRegister";
    }
    
    @RequestMapping("/comtnservereqpmninfo/addComtnservereqpmninfo.do")
    public String addComtnservereqpmninfo(
            ComtnservereqpmninfoVO comtnservereqpmninfoVO,
            @ModelAttribute("searchVO") ComtnservereqpmninfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnservereqpmninfoService.insertComtnservereqpmninfo(comtnservereqpmninfoVO);
        status.setComplete();
        return "forward:/comtnservereqpmninfo/ComtnservereqpmninfoList.do";
    }
    
    @RequestMapping("/comtnservereqpmninfo/updateComtnservereqpmninfoView.do")
    public String updateComtnservereqpmninfoView(
            @RequestParam("serverEqpmnId") String serverEqpmnId ,
            @ModelAttribute("searchVO") ComtnservereqpmninfoDefaultVO searchVO, Model model)
            throws Exception {
        ComtnservereqpmninfoVO comtnservereqpmninfoVO = new ComtnservereqpmninfoVO();
        comtnservereqpmninfoVO.setServerEqpmnId(serverEqpmnId);
;        
        // 변수명은 CoC 에 따라 comtnservereqpmninfoVO
        model.addAttribute(selectComtnservereqpmninfo(comtnservereqpmninfoVO, searchVO));
        return "/comtnservereqpmninfo/ComtnservereqpmninfoRegister";
    }

    @RequestMapping("/comtnservereqpmninfo/selectComtnservereqpmninfo.do")
    public @ModelAttribute("comtnservereqpmninfoVO")
    ComtnservereqpmninfoVO selectComtnservereqpmninfo(
            ComtnservereqpmninfoVO comtnservereqpmninfoVO,
            @ModelAttribute("searchVO") ComtnservereqpmninfoDefaultVO searchVO) throws Exception {
        return comtnservereqpmninfoService.selectComtnservereqpmninfo(comtnservereqpmninfoVO);
    }

    @RequestMapping("/comtnservereqpmninfo/updateComtnservereqpmninfo.do")
    public String updateComtnservereqpmninfo(
            ComtnservereqpmninfoVO comtnservereqpmninfoVO,
            @ModelAttribute("searchVO") ComtnservereqpmninfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnservereqpmninfoService.updateComtnservereqpmninfo(comtnservereqpmninfoVO);
        status.setComplete();
        return "forward:/comtnservereqpmninfo/ComtnservereqpmninfoList.do";
    }
    
    @RequestMapping("/comtnservereqpmninfo/deleteComtnservereqpmninfo.do")
    public String deleteComtnservereqpmninfo(
            ComtnservereqpmninfoVO comtnservereqpmninfoVO,
            @ModelAttribute("searchVO") ComtnservereqpmninfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnservereqpmninfoService.deleteComtnservereqpmninfo(comtnservereqpmninfoVO);
        status.setComplete();
        return "forward:/comtnservereqpmninfo/ComtnservereqpmninfoList.do";
    }

}
