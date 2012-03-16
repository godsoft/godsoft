package kr.godsoft.egovframe.generatorwebapp.comtncntcinstt.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtncntcinstt.service.ComtncntcinsttService;
import kr.godsoft.egovframe.generatorwebapp.comtncntcinstt.service.ComtncntcinsttDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtncntcinstt.service.ComtncntcinsttVO;

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
 * @Class Name : ComtncntcinsttController.java
 * @Description : Comtncntcinstt Controller class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Controller
@SessionAttributes(types=ComtncntcinsttVO.class)
public class ComtncntcinsttController {

    @Resource(name = "comtncntcinsttService")
    private ComtncntcinsttService comtncntcinsttService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtncntcinstt 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtncntcinsttVO
	 * @return "/comtncntcinstt/ComtncntcinsttList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtncntcinstt/ComtncntcinsttList.do")
    public String selectComtncntcinsttList(@ModelAttribute("searchVO") ComtncntcinsttVO searchVO, 
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
		
        List<EgovMap> comtncntcinsttList = comtncntcinsttService.selectComtncntcinsttList(searchVO);
        model.addAttribute("resultList", comtncntcinsttList);
        
        int totCnt = comtncntcinsttService.selectComtncntcinsttListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtncntcinstt/ComtncntcinsttList";
    } 
    
    @RequestMapping("/comtncntcinstt/addComtncntcinsttView.do")
    public String addComtncntcinsttView(
            @ModelAttribute("searchVO") ComtncntcinsttDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtncntcinsttVO", new ComtncntcinsttVO());
        return "/comtncntcinstt/ComtncntcinsttRegister";
    }
    
    @RequestMapping("/comtncntcinstt/addComtncntcinstt.do")
    public String addComtncntcinstt(
            ComtncntcinsttVO comtncntcinsttVO,
            @ModelAttribute("searchVO") ComtncntcinsttDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtncntcinsttService.insertComtncntcinstt(comtncntcinsttVO);
        status.setComplete();
        return "forward:/comtncntcinstt/ComtncntcinsttList.do";
    }
    
    @RequestMapping("/comtncntcinstt/updateComtncntcinsttView.do")
    public String updateComtncntcinsttView(
            @RequestParam("insttId") String insttId ,
            @ModelAttribute("searchVO") ComtncntcinsttDefaultVO searchVO, Model model)
            throws Exception {
        ComtncntcinsttVO comtncntcinsttVO = new ComtncntcinsttVO();
        comtncntcinsttVO.setInsttId(insttId);
;        
        // 변수명은 CoC 에 따라 comtncntcinsttVO
        model.addAttribute(selectComtncntcinstt(comtncntcinsttVO, searchVO));
        return "/comtncntcinstt/ComtncntcinsttRegister";
    }

    @RequestMapping("/comtncntcinstt/selectComtncntcinstt.do")
    public @ModelAttribute("comtncntcinsttVO")
    ComtncntcinsttVO selectComtncntcinstt(
            ComtncntcinsttVO comtncntcinsttVO,
            @ModelAttribute("searchVO") ComtncntcinsttDefaultVO searchVO) throws Exception {
        return comtncntcinsttService.selectComtncntcinstt(comtncntcinsttVO);
    }

    @RequestMapping("/comtncntcinstt/updateComtncntcinstt.do")
    public String updateComtncntcinstt(
            ComtncntcinsttVO comtncntcinsttVO,
            @ModelAttribute("searchVO") ComtncntcinsttDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtncntcinsttService.updateComtncntcinstt(comtncntcinsttVO);
        status.setComplete();
        return "forward:/comtncntcinstt/ComtncntcinsttList.do";
    }
    
    @RequestMapping("/comtncntcinstt/deleteComtncntcinstt.do")
    public String deleteComtncntcinstt(
            ComtncntcinsttVO comtncntcinsttVO,
            @ModelAttribute("searchVO") ComtncntcinsttDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtncntcinsttService.deleteComtncntcinstt(comtncntcinsttVO);
        status.setComplete();
        return "forward:/comtncntcinstt/ComtncntcinsttList.do";
    }

}
