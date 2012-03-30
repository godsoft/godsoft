package kr.godsoft.egovframe.generatorwebapp.comtnncrduser.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnncrduser.service.ComtnncrduserService;
import kr.godsoft.egovframe.generatorwebapp.comtnncrduser.service.ComtnncrduserDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnncrduser.service.ComtnncrduserVO;

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
 * @Class Name : ComtnncrduserController.java
 * @Description : Comtnncrduser Controller class
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
public class ComtnncrduserController {

    @Resource(name = "comtnncrduserService")
    private ComtnncrduserService comtnncrduserService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNNCRDUSER 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnncrduserVO
	 * @return "/comtnncrduser/ComtnncrduserList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnncrduser/ComtnncrduserList.do")
    public String selectComtnncrduserList(@ModelAttribute("searchVO") ComtnncrduserVO searchVO, 
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
		
        List<EgovMap> comtnncrduserList = comtnncrduserService.selectComtnncrduserList(searchVO);
        model.addAttribute("resultList", comtnncrduserList);
        
        int totCnt = comtnncrduserService.selectComtnncrduserListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnncrduser/ComtnncrduserList";
    } 
    
    @RequestMapping("/comtnncrduser/addComtnncrduserView.do")
    public String addComtnncrduserView(
            @ModelAttribute("searchVO") ComtnncrduserDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnncrduserVO", new ComtnncrduserVO());
        return "/comtnncrduser/ComtnncrduserRegister";
    }
    
    @RequestMapping("/comtnncrduser/addComtnncrduser.do")
    public String addComtnncrduser(
            ComtnncrduserVO comtnncrduserVO,
            @ModelAttribute("searchVO") ComtnncrduserDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnncrduserService.insertComtnncrduser(comtnncrduserVO);
        status.setComplete();
        return "forward:/comtnncrduser/ComtnncrduserList.do";
    }
    
    @RequestMapping("/comtnncrduser/updateComtnncrduserView.do")
    public String updateComtnncrduserView(
            @RequestParam("ncrdId") String ncrdId ,
            @RequestParam("emplyrId") String emplyrId ,
            @ModelAttribute("searchVO") ComtnncrduserDefaultVO searchVO, Model model)
            throws Exception {
        ComtnncrduserVO comtnncrduserVO = new ComtnncrduserVO();
        comtnncrduserVO.setNcrdId(ncrdId);
        comtnncrduserVO.setEmplyrId(emplyrId);
;        
        // 변수명은 CoC 에 따라 comtnncrduserVO
        model.addAttribute(selectComtnncrduser(comtnncrduserVO, searchVO));
        return "/comtnncrduser/ComtnncrduserRegister";
    }

    @RequestMapping("/comtnncrduser/selectComtnncrduser.do")
    public @ModelAttribute("comtnncrduserVO")
    ComtnncrduserVO selectComtnncrduser(
            ComtnncrduserVO comtnncrduserVO,
            @ModelAttribute("searchVO") ComtnncrduserDefaultVO searchVO) throws Exception {
        return comtnncrduserService.selectComtnncrduser(comtnncrduserVO);
    }

    @RequestMapping("/comtnncrduser/updateComtnncrduser.do")
    public String updateComtnncrduser(
            ComtnncrduserVO comtnncrduserVO,
            @ModelAttribute("searchVO") ComtnncrduserDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnncrduserService.updateComtnncrduser(comtnncrduserVO);
        status.setComplete();
        return "forward:/comtnncrduser/ComtnncrduserList.do";
    }
    
    @RequestMapping("/comtnncrduser/deleteComtnncrduser.do")
    public String deleteComtnncrduser(
            ComtnncrduserVO comtnncrduserVO,
            @ModelAttribute("searchVO") ComtnncrduserDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnncrduserService.deleteComtnncrduser(comtnncrduserVO);
        status.setComplete();
        return "forward:/comtnncrduser/ComtnncrduserList.do";
    }

}
