package kr.godsoft.egovframe.generatorwebapp.comtnmemotodo.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnmemotodo.service.ComtnmemotodoService;
import kr.godsoft.egovframe.generatorwebapp.comtnmemotodo.service.ComtnmemotodoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnmemotodo.service.ComtnmemotodoVO;

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
 * @Class Name : ComtnmemotodoController.java
 * @Description : Comtnmemotodo Controller class
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
public class ComtnmemotodoController {

    @Resource(name = "comtnmemotodoService")
    private ComtnmemotodoService comtnmemotodoService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNMEMOTODO 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnmemotodoVO
	 * @return "/comtnmemotodo/ComtnmemotodoList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnmemotodo/ComtnmemotodoList.do")
    public String selectComtnmemotodoList(@ModelAttribute("searchVO") ComtnmemotodoVO searchVO, 
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
		
        List<EgovMap> comtnmemotodoList = comtnmemotodoService.selectComtnmemotodoList(searchVO);
        model.addAttribute("resultList", comtnmemotodoList);
        
        int totCnt = comtnmemotodoService.selectComtnmemotodoListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnmemotodo/ComtnmemotodoList";
    } 
    
    @RequestMapping("/comtnmemotodo/addComtnmemotodoView.do")
    public String addComtnmemotodoView(
            @ModelAttribute("searchVO") ComtnmemotodoDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnmemotodoVO", new ComtnmemotodoVO());
        return "/comtnmemotodo/ComtnmemotodoRegister";
    }
    
    @RequestMapping("/comtnmemotodo/addComtnmemotodo.do")
    public String addComtnmemotodo(
            ComtnmemotodoVO comtnmemotodoVO,
            @ModelAttribute("searchVO") ComtnmemotodoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnmemotodoService.insertComtnmemotodo(comtnmemotodoVO);
        status.setComplete();
        return "forward:/comtnmemotodo/ComtnmemotodoList.do";
    }
    
    @RequestMapping("/comtnmemotodo/updateComtnmemotodoView.do")
    public String updateComtnmemotodoView(
            @RequestParam("todoId") String todoId ,
            @ModelAttribute("searchVO") ComtnmemotodoDefaultVO searchVO, Model model)
            throws Exception {
        ComtnmemotodoVO comtnmemotodoVO = new ComtnmemotodoVO();
        comtnmemotodoVO.setTodoId(todoId);
;        
        // 변수명은 CoC 에 따라 comtnmemotodoVO
        model.addAttribute(selectComtnmemotodo(comtnmemotodoVO, searchVO));
        return "/comtnmemotodo/ComtnmemotodoRegister";
    }

    @RequestMapping("/comtnmemotodo/selectComtnmemotodo.do")
    public @ModelAttribute("comtnmemotodoVO")
    ComtnmemotodoVO selectComtnmemotodo(
            ComtnmemotodoVO comtnmemotodoVO,
            @ModelAttribute("searchVO") ComtnmemotodoDefaultVO searchVO) throws Exception {
        return comtnmemotodoService.selectComtnmemotodo(comtnmemotodoVO);
    }

    @RequestMapping("/comtnmemotodo/updateComtnmemotodo.do")
    public String updateComtnmemotodo(
            ComtnmemotodoVO comtnmemotodoVO,
            @ModelAttribute("searchVO") ComtnmemotodoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnmemotodoService.updateComtnmemotodo(comtnmemotodoVO);
        status.setComplete();
        return "forward:/comtnmemotodo/ComtnmemotodoList.do";
    }
    
    @RequestMapping("/comtnmemotodo/deleteComtnmemotodo.do")
    public String deleteComtnmemotodo(
            ComtnmemotodoVO comtnmemotodoVO,
            @ModelAttribute("searchVO") ComtnmemotodoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnmemotodoService.deleteComtnmemotodo(comtnmemotodoVO);
        status.setComplete();
        return "forward:/comtnmemotodo/ComtnmemotodoList.do";
    }

}
