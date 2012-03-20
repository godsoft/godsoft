package kr.godsoft.egovframe.generatorwebapp.comtneventinfo.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtneventinfo.service.ComtneventinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtneventinfo.service.ComtneventinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtneventinfo.service.ComtneventinfoVO;

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
 * @Class Name : ComtneventinfoController.java
 * @Description : Comtneventinfo Controller class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Controller
public class ComtneventinfoController {

    @Resource(name = "comtneventinfoService")
    private ComtneventinfoService comtneventinfoService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtneventinfo 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtneventinfoVO
	 * @return "/comtneventinfo/ComtneventinfoList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtneventinfo/ComtneventinfoList.do")
    public String selectComtneventinfoList(@ModelAttribute("searchVO") ComtneventinfoVO searchVO, 
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
		
        List<EgovMap> comtneventinfoList = comtneventinfoService.selectComtneventinfoList(searchVO);
        model.addAttribute("resultList", comtneventinfoList);
        
        int totCnt = comtneventinfoService.selectComtneventinfoListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtneventinfo/ComtneventinfoList";
    } 
    
    @RequestMapping("/comtneventinfo/addComtneventinfoView.do")
    public String addComtneventinfoView(
            @ModelAttribute("searchVO") ComtneventinfoDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtneventinfoVO", new ComtneventinfoVO());
        return "/comtneventinfo/ComtneventinfoRegister";
    }
    
    @RequestMapping("/comtneventinfo/addComtneventinfo.do")
    public String addComtneventinfo(
            ComtneventinfoVO comtneventinfoVO,
            @ModelAttribute("searchVO") ComtneventinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtneventinfoService.insertComtneventinfo(comtneventinfoVO);
        status.setComplete();
        return "forward:/comtneventinfo/ComtneventinfoList.do";
    }
    
    @RequestMapping("/comtneventinfo/updateComtneventinfoView.do")
    public String updateComtneventinfoView(
            @RequestParam("eventId") String eventId ,
            @ModelAttribute("searchVO") ComtneventinfoDefaultVO searchVO, Model model)
            throws Exception {
        ComtneventinfoVO comtneventinfoVO = new ComtneventinfoVO();
        comtneventinfoVO.setEventId(eventId);
;        
        // 변수명은 CoC 에 따라 comtneventinfoVO
        model.addAttribute(selectComtneventinfo(comtneventinfoVO, searchVO));
        return "/comtneventinfo/ComtneventinfoRegister";
    }

    @RequestMapping("/comtneventinfo/selectComtneventinfo.do")
    public @ModelAttribute("comtneventinfoVO")
    ComtneventinfoVO selectComtneventinfo(
            ComtneventinfoVO comtneventinfoVO,
            @ModelAttribute("searchVO") ComtneventinfoDefaultVO searchVO) throws Exception {
        return comtneventinfoService.selectComtneventinfo(comtneventinfoVO);
    }

    @RequestMapping("/comtneventinfo/updateComtneventinfo.do")
    public String updateComtneventinfo(
            ComtneventinfoVO comtneventinfoVO,
            @ModelAttribute("searchVO") ComtneventinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtneventinfoService.updateComtneventinfo(comtneventinfoVO);
        status.setComplete();
        return "forward:/comtneventinfo/ComtneventinfoList.do";
    }
    
    @RequestMapping("/comtneventinfo/deleteComtneventinfo.do")
    public String deleteComtneventinfo(
            ComtneventinfoVO comtneventinfoVO,
            @ModelAttribute("searchVO") ComtneventinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtneventinfoService.deleteComtneventinfo(comtneventinfoVO);
        status.setComplete();
        return "forward:/comtneventinfo/ComtneventinfoList.do";
    }

}
