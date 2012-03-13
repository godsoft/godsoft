package kr.godsoft.egovframe.generatorwebapp.comtndiaryinfo.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtndiaryinfo.service.ComtndiaryinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtndiaryinfo.service.ComtndiaryinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtndiaryinfo.service.ComtndiaryinfoVO;

/**
 * @Class Name : ComtndiaryinfoController.java
 * @Description : Comtndiaryinfo Controller class
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
@SessionAttributes(types=ComtndiaryinfoVO.class)
public class ComtndiaryinfoController {

    @Resource(name = "comtndiaryinfoService")
    private ComtndiaryinfoService comtndiaryinfoService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtndiaryinfo 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtndiaryinfoDefaultVO
	 * @return "/comtndiaryinfo/ComtndiaryinfoList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtndiaryinfo/ComtndiaryinfoList.do")
    public String selectComtndiaryinfoList(@ModelAttribute("searchVO") ComtndiaryinfoDefaultVO searchVO, 
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
		
        List comtndiaryinfoList = comtndiaryinfoService.selectComtndiaryinfoList(searchVO);
        model.addAttribute("resultList", comtndiaryinfoList);
        
        int totCnt = comtndiaryinfoService.selectComtndiaryinfoListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtndiaryinfo/ComtndiaryinfoList";
    } 
    
    @RequestMapping("/comtndiaryinfo/addComtndiaryinfoView.do")
    public String addComtndiaryinfoView(
            @ModelAttribute("searchVO") ComtndiaryinfoDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtndiaryinfoVO", new ComtndiaryinfoVO());
        return "/comtndiaryinfo/ComtndiaryinfoRegister";
    }
    
    @RequestMapping("/comtndiaryinfo/addComtndiaryinfo.do")
    public String addComtndiaryinfo(
            ComtndiaryinfoVO comtndiaryinfoVO,
            @ModelAttribute("searchVO") ComtndiaryinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtndiaryinfoService.insertComtndiaryinfo(comtndiaryinfoVO);
        status.setComplete();
        return "forward:/comtndiaryinfo/ComtndiaryinfoList.do";
    }
    
    @RequestMapping("/comtndiaryinfo/updateComtndiaryinfoView.do")
    public String updateComtndiaryinfoView(
            @RequestParam("schdulId") String schdulId ,
            @RequestParam("diaryId") String diaryId ,
            @ModelAttribute("searchVO") ComtndiaryinfoDefaultVO searchVO, Model model)
            throws Exception {
        ComtndiaryinfoVO comtndiaryinfoVO = new ComtndiaryinfoVO();
        comtndiaryinfoVO.setSchdulId(schdulId);
        comtndiaryinfoVO.setDiaryId(diaryId);
;        
        // 변수명은 CoC 에 따라 comtndiaryinfoVO
        model.addAttribute(selectComtndiaryinfo(comtndiaryinfoVO, searchVO));
        return "/comtndiaryinfo/ComtndiaryinfoRegister";
    }

    @RequestMapping("/comtndiaryinfo/selectComtndiaryinfo.do")
    public @ModelAttribute("comtndiaryinfoVO")
    ComtndiaryinfoVO selectComtndiaryinfo(
            ComtndiaryinfoVO comtndiaryinfoVO,
            @ModelAttribute("searchVO") ComtndiaryinfoDefaultVO searchVO) throws Exception {
        return comtndiaryinfoService.selectComtndiaryinfo(comtndiaryinfoVO);
    }

    @RequestMapping("/comtndiaryinfo/updateComtndiaryinfo.do")
    public String updateComtndiaryinfo(
            ComtndiaryinfoVO comtndiaryinfoVO,
            @ModelAttribute("searchVO") ComtndiaryinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtndiaryinfoService.updateComtndiaryinfo(comtndiaryinfoVO);
        status.setComplete();
        return "forward:/comtndiaryinfo/ComtndiaryinfoList.do";
    }
    
    @RequestMapping("/comtndiaryinfo/deleteComtndiaryinfo.do")
    public String deleteComtndiaryinfo(
            ComtndiaryinfoVO comtndiaryinfoVO,
            @ModelAttribute("searchVO") ComtndiaryinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtndiaryinfoService.deleteComtndiaryinfo(comtndiaryinfoVO);
        status.setComplete();
        return "forward:/comtndiaryinfo/ComtndiaryinfoList.do";
    }

}
