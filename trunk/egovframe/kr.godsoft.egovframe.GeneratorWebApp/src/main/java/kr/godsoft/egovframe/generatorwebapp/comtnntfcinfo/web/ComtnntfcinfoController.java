package kr.godsoft.egovframe.generatorwebapp.comtnntfcinfo.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtnntfcinfo.service.ComtnntfcinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnntfcinfo.service.ComtnntfcinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnntfcinfo.service.ComtnntfcinfoVO;

/**
 * @Class Name : ComtnntfcinfoController.java
 * @Description : Comtnntfcinfo Controller class
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
@SessionAttributes(types=ComtnntfcinfoVO.class)
public class ComtnntfcinfoController {

    @Resource(name = "comtnntfcinfoService")
    private ComtnntfcinfoService comtnntfcinfoService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnntfcinfo 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnntfcinfoDefaultVO
	 * @return "/comtnntfcinfo/ComtnntfcinfoList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnntfcinfo/ComtnntfcinfoList.do")
    public String selectComtnntfcinfoList(@ModelAttribute("searchVO") ComtnntfcinfoDefaultVO searchVO, 
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
		
        List comtnntfcinfoList = comtnntfcinfoService.selectComtnntfcinfoList(searchVO);
        model.addAttribute("resultList", comtnntfcinfoList);
        
        int totCnt = comtnntfcinfoService.selectComtnntfcinfoListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnntfcinfo/ComtnntfcinfoList";
    } 
    
    @RequestMapping("/comtnntfcinfo/addComtnntfcinfoView.do")
    public String addComtnntfcinfoView(
            @ModelAttribute("searchVO") ComtnntfcinfoDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnntfcinfoVO", new ComtnntfcinfoVO());
        return "/comtnntfcinfo/ComtnntfcinfoRegister";
    }
    
    @RequestMapping("/comtnntfcinfo/addComtnntfcinfo.do")
    public String addComtnntfcinfo(
            ComtnntfcinfoVO comtnntfcinfoVO,
            @ModelAttribute("searchVO") ComtnntfcinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnntfcinfoService.insertComtnntfcinfo(comtnntfcinfoVO);
        status.setComplete();
        return "forward:/comtnntfcinfo/ComtnntfcinfoList.do";
    }
    
    @RequestMapping("/comtnntfcinfo/updateComtnntfcinfoView.do")
    public String updateComtnntfcinfoView(
            @RequestParam("ntcnNo") int ntcnNo ,
            @ModelAttribute("searchVO") ComtnntfcinfoDefaultVO searchVO, Model model)
            throws Exception {
        ComtnntfcinfoVO comtnntfcinfoVO = new ComtnntfcinfoVO();
        comtnntfcinfoVO.setNtcnNo(ntcnNo);
;        
        // 변수명은 CoC 에 따라 comtnntfcinfoVO
        model.addAttribute(selectComtnntfcinfo(comtnntfcinfoVO, searchVO));
        return "/comtnntfcinfo/ComtnntfcinfoRegister";
    }

    @RequestMapping("/comtnntfcinfo/selectComtnntfcinfo.do")
    public @ModelAttribute("comtnntfcinfoVO")
    ComtnntfcinfoVO selectComtnntfcinfo(
            ComtnntfcinfoVO comtnntfcinfoVO,
            @ModelAttribute("searchVO") ComtnntfcinfoDefaultVO searchVO) throws Exception {
        return comtnntfcinfoService.selectComtnntfcinfo(comtnntfcinfoVO);
    }

    @RequestMapping("/comtnntfcinfo/updateComtnntfcinfo.do")
    public String updateComtnntfcinfo(
            ComtnntfcinfoVO comtnntfcinfoVO,
            @ModelAttribute("searchVO") ComtnntfcinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnntfcinfoService.updateComtnntfcinfo(comtnntfcinfoVO);
        status.setComplete();
        return "forward:/comtnntfcinfo/ComtnntfcinfoList.do";
    }
    
    @RequestMapping("/comtnntfcinfo/deleteComtnntfcinfo.do")
    public String deleteComtnntfcinfo(
            ComtnntfcinfoVO comtnntfcinfoVO,
            @ModelAttribute("searchVO") ComtnntfcinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnntfcinfoService.deleteComtnntfcinfo(comtnntfcinfoVO);
        status.setComplete();
        return "forward:/comtnntfcinfo/ComtnntfcinfoList.do";
    }

}
