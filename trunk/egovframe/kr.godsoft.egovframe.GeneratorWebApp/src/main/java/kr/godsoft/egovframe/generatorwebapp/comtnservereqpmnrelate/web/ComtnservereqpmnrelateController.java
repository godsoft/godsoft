package kr.godsoft.egovframe.generatorwebapp.comtnservereqpmnrelate.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnservereqpmnrelate.service.ComtnservereqpmnrelateService;
import kr.godsoft.egovframe.generatorwebapp.comtnservereqpmnrelate.service.ComtnservereqpmnrelateDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnservereqpmnrelate.service.ComtnservereqpmnrelateVO;

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
 * @Class Name : ComtnservereqpmnrelateController.java
 * @Description : Comtnservereqpmnrelate Controller class
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
public class ComtnservereqpmnrelateController {

    @Resource(name = "comtnservereqpmnrelateService")
    private ComtnservereqpmnrelateService comtnservereqpmnrelateService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNSERVEREQPMNRELATE 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnservereqpmnrelateVO
	 * @return "/comtnservereqpmnrelate/ComtnservereqpmnrelateList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnservereqpmnrelate/ComtnservereqpmnrelateList.do")
    public String selectComtnservereqpmnrelateList(@ModelAttribute("searchVO") ComtnservereqpmnrelateVO searchVO, 
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
		
        List<EgovMap> comtnservereqpmnrelateList = comtnservereqpmnrelateService.selectComtnservereqpmnrelateList(searchVO);
        model.addAttribute("resultList", comtnservereqpmnrelateList);
        
        int totCnt = comtnservereqpmnrelateService.selectComtnservereqpmnrelateListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnservereqpmnrelate/ComtnservereqpmnrelateList";
    } 
    
    @RequestMapping("/comtnservereqpmnrelate/addComtnservereqpmnrelateView.do")
    public String addComtnservereqpmnrelateView(
            @ModelAttribute("searchVO") ComtnservereqpmnrelateDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnservereqpmnrelateVO", new ComtnservereqpmnrelateVO());
        return "/comtnservereqpmnrelate/ComtnservereqpmnrelateRegister";
    }
    
    @RequestMapping("/comtnservereqpmnrelate/addComtnservereqpmnrelate.do")
    public String addComtnservereqpmnrelate(
            ComtnservereqpmnrelateVO comtnservereqpmnrelateVO,
            @ModelAttribute("searchVO") ComtnservereqpmnrelateDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnservereqpmnrelateService.insertComtnservereqpmnrelate(comtnservereqpmnrelateVO);
        status.setComplete();
        return "forward:/comtnservereqpmnrelate/ComtnservereqpmnrelateList.do";
    }
    
    @RequestMapping("/comtnservereqpmnrelate/updateComtnservereqpmnrelateView.do")
    public String updateComtnservereqpmnrelateView(
            @RequestParam("serverEqpmnId") String serverEqpmnId ,
            @RequestParam("serverId") String serverId ,
            @ModelAttribute("searchVO") ComtnservereqpmnrelateDefaultVO searchVO, Model model)
            throws Exception {
        ComtnservereqpmnrelateVO comtnservereqpmnrelateVO = new ComtnservereqpmnrelateVO();
        comtnservereqpmnrelateVO.setServerEqpmnId(serverEqpmnId);
        comtnservereqpmnrelateVO.setServerId(serverId);
;        
        // 변수명은 CoC 에 따라 comtnservereqpmnrelateVO
        model.addAttribute(selectComtnservereqpmnrelate(comtnservereqpmnrelateVO, searchVO));
        return "/comtnservereqpmnrelate/ComtnservereqpmnrelateRegister";
    }

    @RequestMapping("/comtnservereqpmnrelate/selectComtnservereqpmnrelate.do")
    public @ModelAttribute("comtnservereqpmnrelateVO")
    ComtnservereqpmnrelateVO selectComtnservereqpmnrelate(
            ComtnservereqpmnrelateVO comtnservereqpmnrelateVO,
            @ModelAttribute("searchVO") ComtnservereqpmnrelateDefaultVO searchVO) throws Exception {
        return comtnservereqpmnrelateService.selectComtnservereqpmnrelate(comtnservereqpmnrelateVO);
    }

    @RequestMapping("/comtnservereqpmnrelate/updateComtnservereqpmnrelate.do")
    public String updateComtnservereqpmnrelate(
            ComtnservereqpmnrelateVO comtnservereqpmnrelateVO,
            @ModelAttribute("searchVO") ComtnservereqpmnrelateDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnservereqpmnrelateService.updateComtnservereqpmnrelate(comtnservereqpmnrelateVO);
        status.setComplete();
        return "forward:/comtnservereqpmnrelate/ComtnservereqpmnrelateList.do";
    }
    
    @RequestMapping("/comtnservereqpmnrelate/deleteComtnservereqpmnrelate.do")
    public String deleteComtnservereqpmnrelate(
            ComtnservereqpmnrelateVO comtnservereqpmnrelateVO,
            @ModelAttribute("searchVO") ComtnservereqpmnrelateDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnservereqpmnrelateService.deleteComtnservereqpmnrelate(comtnservereqpmnrelateVO);
        status.setComplete();
        return "forward:/comtnservereqpmnrelate/ComtnservereqpmnrelateList.do";
    }

}
