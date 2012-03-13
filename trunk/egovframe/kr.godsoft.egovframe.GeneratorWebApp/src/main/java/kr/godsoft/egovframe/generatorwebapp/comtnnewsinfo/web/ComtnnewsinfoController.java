package kr.godsoft.egovframe.generatorwebapp.comtnnewsinfo.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtnnewsinfo.service.ComtnnewsinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnnewsinfo.service.ComtnnewsinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnnewsinfo.service.ComtnnewsinfoVO;

/**
 * @Class Name : ComtnnewsinfoController.java
 * @Description : Comtnnewsinfo Controller class
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
@SessionAttributes(types=ComtnnewsinfoVO.class)
public class ComtnnewsinfoController {

    @Resource(name = "comtnnewsinfoService")
    private ComtnnewsinfoService comtnnewsinfoService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnnewsinfo 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnnewsinfoDefaultVO
	 * @return "/comtnnewsinfo/ComtnnewsinfoList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnnewsinfo/ComtnnewsinfoList.do")
    public String selectComtnnewsinfoList(@ModelAttribute("searchVO") ComtnnewsinfoDefaultVO searchVO, 
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
		
        List comtnnewsinfoList = comtnnewsinfoService.selectComtnnewsinfoList(searchVO);
        model.addAttribute("resultList", comtnnewsinfoList);
        
        int totCnt = comtnnewsinfoService.selectComtnnewsinfoListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnnewsinfo/ComtnnewsinfoList";
    } 
    
    @RequestMapping("/comtnnewsinfo/addComtnnewsinfoView.do")
    public String addComtnnewsinfoView(
            @ModelAttribute("searchVO") ComtnnewsinfoDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnnewsinfoVO", new ComtnnewsinfoVO());
        return "/comtnnewsinfo/ComtnnewsinfoRegister";
    }
    
    @RequestMapping("/comtnnewsinfo/addComtnnewsinfo.do")
    public String addComtnnewsinfo(
            ComtnnewsinfoVO comtnnewsinfoVO,
            @ModelAttribute("searchVO") ComtnnewsinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnnewsinfoService.insertComtnnewsinfo(comtnnewsinfoVO);
        status.setComplete();
        return "forward:/comtnnewsinfo/ComtnnewsinfoList.do";
    }
    
    @RequestMapping("/comtnnewsinfo/updateComtnnewsinfoView.do")
    public String updateComtnnewsinfoView(
            @RequestParam("newsId") String newsId ,
            @ModelAttribute("searchVO") ComtnnewsinfoDefaultVO searchVO, Model model)
            throws Exception {
        ComtnnewsinfoVO comtnnewsinfoVO = new ComtnnewsinfoVO();
        comtnnewsinfoVO.setNewsId(newsId);
;        
        // 변수명은 CoC 에 따라 comtnnewsinfoVO
        model.addAttribute(selectComtnnewsinfo(comtnnewsinfoVO, searchVO));
        return "/comtnnewsinfo/ComtnnewsinfoRegister";
    }

    @RequestMapping("/comtnnewsinfo/selectComtnnewsinfo.do")
    public @ModelAttribute("comtnnewsinfoVO")
    ComtnnewsinfoVO selectComtnnewsinfo(
            ComtnnewsinfoVO comtnnewsinfoVO,
            @ModelAttribute("searchVO") ComtnnewsinfoDefaultVO searchVO) throws Exception {
        return comtnnewsinfoService.selectComtnnewsinfo(comtnnewsinfoVO);
    }

    @RequestMapping("/comtnnewsinfo/updateComtnnewsinfo.do")
    public String updateComtnnewsinfo(
            ComtnnewsinfoVO comtnnewsinfoVO,
            @ModelAttribute("searchVO") ComtnnewsinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnnewsinfoService.updateComtnnewsinfo(comtnnewsinfoVO);
        status.setComplete();
        return "forward:/comtnnewsinfo/ComtnnewsinfoList.do";
    }
    
    @RequestMapping("/comtnnewsinfo/deleteComtnnewsinfo.do")
    public String deleteComtnnewsinfo(
            ComtnnewsinfoVO comtnnewsinfoVO,
            @ModelAttribute("searchVO") ComtnnewsinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnnewsinfoService.deleteComtnnewsinfo(comtnnewsinfoVO);
        status.setComplete();
        return "forward:/comtnnewsinfo/ComtnnewsinfoList.do";
    }

}
