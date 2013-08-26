package kr.godsoft.egovframe.generatorwebapp.comtnonlinepollresult.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnonlinepollresult.service.ComtnonlinepollresultService;
import kr.godsoft.egovframe.generatorwebapp.comtnonlinepollresult.service.ComtnonlinepollresultDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnonlinepollresult.service.ComtnonlinepollresultVO;

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
 * @Class Name : ComtnonlinepollresultController.java
 * @Description : Comtnonlinepollresult Controller class
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
public class ComtnonlinepollresultController {

    @Resource(name = "comtnonlinepollresultService")
    private ComtnonlinepollresultService comtnonlinepollresultService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNONLINEPOLLRESULT 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnonlinepollresultVO
	 * @return "/comtnonlinepollresult/ComtnonlinepollresultList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnonlinepollresult/ComtnonlinepollresultList.do")
    public String selectComtnonlinepollresultList(@ModelAttribute("searchVO") ComtnonlinepollresultVO searchVO, 
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
		
        List<EgovMap> comtnonlinepollresultList = comtnonlinepollresultService.selectComtnonlinepollresultList(searchVO);
        model.addAttribute("resultList", comtnonlinepollresultList);
        
        int totCnt = comtnonlinepollresultService.selectComtnonlinepollresultListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnonlinepollresult/ComtnonlinepollresultList";
    } 
    
    @RequestMapping("/comtnonlinepollresult/addComtnonlinepollresultView.do")
    public String addComtnonlinepollresultView(
            @ModelAttribute("searchVO") ComtnonlinepollresultDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnonlinepollresultVO", new ComtnonlinepollresultVO());
        return "/comtnonlinepollresult/ComtnonlinepollresultRegister";
    }
    
    @RequestMapping("/comtnonlinepollresult/addComtnonlinepollresult.do")
    public String addComtnonlinepollresult(
            ComtnonlinepollresultVO comtnonlinepollresultVO,
            @ModelAttribute("searchVO") ComtnonlinepollresultDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnonlinepollresultService.insertComtnonlinepollresult(comtnonlinepollresultVO);
        status.setComplete();
        return "forward:/comtnonlinepollresult/ComtnonlinepollresultList.do";
    }
    
    @RequestMapping("/comtnonlinepollresult/updateComtnonlinepollresultView.do")
    public String updateComtnonlinepollresultView(
            @RequestParam("pollResultId") String pollResultId ,
            @RequestParam("pollIemId") String pollIemId ,
            @RequestParam("pollId") String pollId ,
            @ModelAttribute("searchVO") ComtnonlinepollresultDefaultVO searchVO, Model model)
            throws Exception {
        ComtnonlinepollresultVO comtnonlinepollresultVO = new ComtnonlinepollresultVO();
        comtnonlinepollresultVO.setPollResultId(pollResultId);
        comtnonlinepollresultVO.setPollIemId(pollIemId);
        comtnonlinepollresultVO.setPollId(pollId);
;        
        // 변수명은 CoC 에 따라 comtnonlinepollresultVO
        model.addAttribute(selectComtnonlinepollresult(comtnonlinepollresultVO, searchVO));
        return "/comtnonlinepollresult/ComtnonlinepollresultRegister";
    }

    @RequestMapping("/comtnonlinepollresult/selectComtnonlinepollresult.do")
    public @ModelAttribute("comtnonlinepollresultVO")
    ComtnonlinepollresultVO selectComtnonlinepollresult(
            ComtnonlinepollresultVO comtnonlinepollresultVO,
            @ModelAttribute("searchVO") ComtnonlinepollresultDefaultVO searchVO) throws Exception {
        return comtnonlinepollresultService.selectComtnonlinepollresult(comtnonlinepollresultVO);
    }

    @RequestMapping("/comtnonlinepollresult/updateComtnonlinepollresult.do")
    public String updateComtnonlinepollresult(
            ComtnonlinepollresultVO comtnonlinepollresultVO,
            @ModelAttribute("searchVO") ComtnonlinepollresultDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnonlinepollresultService.updateComtnonlinepollresult(comtnonlinepollresultVO);
        status.setComplete();
        return "forward:/comtnonlinepollresult/ComtnonlinepollresultList.do";
    }
    
    @RequestMapping("/comtnonlinepollresult/deleteComtnonlinepollresult.do")
    public String deleteComtnonlinepollresult(
            ComtnonlinepollresultVO comtnonlinepollresultVO,
            @ModelAttribute("searchVO") ComtnonlinepollresultDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnonlinepollresultService.deleteComtnonlinepollresult(comtnonlinepollresultVO);
        status.setComplete();
        return "forward:/comtnonlinepollresult/ComtnonlinepollresultList.do";
    }

}
