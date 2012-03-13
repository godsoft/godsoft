package kr.godsoft.egovframe.generatorwebapp.comtnfaqinfo.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtnfaqinfo.service.ComtnfaqinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnfaqinfo.service.ComtnfaqinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnfaqinfo.service.ComtnfaqinfoVO;

/**
 * @Class Name : ComtnfaqinfoController.java
 * @Description : Comtnfaqinfo Controller class
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
@SessionAttributes(types=ComtnfaqinfoVO.class)
public class ComtnfaqinfoController {

    @Resource(name = "comtnfaqinfoService")
    private ComtnfaqinfoService comtnfaqinfoService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnfaqinfo 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnfaqinfoDefaultVO
	 * @return "/comtnfaqinfo/ComtnfaqinfoList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnfaqinfo/ComtnfaqinfoList.do")
    public String selectComtnfaqinfoList(@ModelAttribute("searchVO") ComtnfaqinfoDefaultVO searchVO, 
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
		
        List comtnfaqinfoList = comtnfaqinfoService.selectComtnfaqinfoList(searchVO);
        model.addAttribute("resultList", comtnfaqinfoList);
        
        int totCnt = comtnfaqinfoService.selectComtnfaqinfoListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnfaqinfo/ComtnfaqinfoList";
    } 
    
    @RequestMapping("/comtnfaqinfo/addComtnfaqinfoView.do")
    public String addComtnfaqinfoView(
            @ModelAttribute("searchVO") ComtnfaqinfoDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnfaqinfoVO", new ComtnfaqinfoVO());
        return "/comtnfaqinfo/ComtnfaqinfoRegister";
    }
    
    @RequestMapping("/comtnfaqinfo/addComtnfaqinfo.do")
    public String addComtnfaqinfo(
            ComtnfaqinfoVO comtnfaqinfoVO,
            @ModelAttribute("searchVO") ComtnfaqinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnfaqinfoService.insertComtnfaqinfo(comtnfaqinfoVO);
        status.setComplete();
        return "forward:/comtnfaqinfo/ComtnfaqinfoList.do";
    }
    
    @RequestMapping("/comtnfaqinfo/updateComtnfaqinfoView.do")
    public String updateComtnfaqinfoView(
            @RequestParam("faqId") String faqId ,
            @ModelAttribute("searchVO") ComtnfaqinfoDefaultVO searchVO, Model model)
            throws Exception {
        ComtnfaqinfoVO comtnfaqinfoVO = new ComtnfaqinfoVO();
        comtnfaqinfoVO.setFaqId(faqId);
;        
        // 변수명은 CoC 에 따라 comtnfaqinfoVO
        model.addAttribute(selectComtnfaqinfo(comtnfaqinfoVO, searchVO));
        return "/comtnfaqinfo/ComtnfaqinfoRegister";
    }

    @RequestMapping("/comtnfaqinfo/selectComtnfaqinfo.do")
    public @ModelAttribute("comtnfaqinfoVO")
    ComtnfaqinfoVO selectComtnfaqinfo(
            ComtnfaqinfoVO comtnfaqinfoVO,
            @ModelAttribute("searchVO") ComtnfaqinfoDefaultVO searchVO) throws Exception {
        return comtnfaqinfoService.selectComtnfaqinfo(comtnfaqinfoVO);
    }

    @RequestMapping("/comtnfaqinfo/updateComtnfaqinfo.do")
    public String updateComtnfaqinfo(
            ComtnfaqinfoVO comtnfaqinfoVO,
            @ModelAttribute("searchVO") ComtnfaqinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnfaqinfoService.updateComtnfaqinfo(comtnfaqinfoVO);
        status.setComplete();
        return "forward:/comtnfaqinfo/ComtnfaqinfoList.do";
    }
    
    @RequestMapping("/comtnfaqinfo/deleteComtnfaqinfo.do")
    public String deleteComtnfaqinfo(
            ComtnfaqinfoVO comtnfaqinfoVO,
            @ModelAttribute("searchVO") ComtnfaqinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnfaqinfoService.deleteComtnfaqinfo(comtnfaqinfoVO);
        status.setComplete();
        return "forward:/comtnfaqinfo/ComtnfaqinfoList.do";
    }

}
