package kr.godsoft.egovframe.generatorwebapp.comtncpyrhtinfo.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtncpyrhtinfo.service.ComtncpyrhtinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtncpyrhtinfo.service.ComtncpyrhtinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtncpyrhtinfo.service.ComtncpyrhtinfoVO;

/**
 * @Class Name : ComtncpyrhtinfoController.java
 * @Description : Comtncpyrhtinfo Controller class
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
@SessionAttributes(types=ComtncpyrhtinfoVO.class)
public class ComtncpyrhtinfoController {

    @Resource(name = "comtncpyrhtinfoService")
    private ComtncpyrhtinfoService comtncpyrhtinfoService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtncpyrhtinfo 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtncpyrhtinfoDefaultVO
	 * @return "/comtncpyrhtinfo/ComtncpyrhtinfoList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtncpyrhtinfo/ComtncpyrhtinfoList.do")
    public String selectComtncpyrhtinfoList(@ModelAttribute("searchVO") ComtncpyrhtinfoDefaultVO searchVO, 
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
		
        List comtncpyrhtinfoList = comtncpyrhtinfoService.selectComtncpyrhtinfoList(searchVO);
        model.addAttribute("resultList", comtncpyrhtinfoList);
        
        int totCnt = comtncpyrhtinfoService.selectComtncpyrhtinfoListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtncpyrhtinfo/ComtncpyrhtinfoList";
    } 
    
    @RequestMapping("/comtncpyrhtinfo/addComtncpyrhtinfoView.do")
    public String addComtncpyrhtinfoView(
            @ModelAttribute("searchVO") ComtncpyrhtinfoDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtncpyrhtinfoVO", new ComtncpyrhtinfoVO());
        return "/comtncpyrhtinfo/ComtncpyrhtinfoRegister";
    }
    
    @RequestMapping("/comtncpyrhtinfo/addComtncpyrhtinfo.do")
    public String addComtncpyrhtinfo(
            ComtncpyrhtinfoVO comtncpyrhtinfoVO,
            @ModelAttribute("searchVO") ComtncpyrhtinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtncpyrhtinfoService.insertComtncpyrhtinfo(comtncpyrhtinfoVO);
        status.setComplete();
        return "forward:/comtncpyrhtinfo/ComtncpyrhtinfoList.do";
    }
    
    @RequestMapping("/comtncpyrhtinfo/updateComtncpyrhtinfoView.do")
    public String updateComtncpyrhtinfoView(
            @RequestParam("cpyrhtId") String cpyrhtId ,
            @ModelAttribute("searchVO") ComtncpyrhtinfoDefaultVO searchVO, Model model)
            throws Exception {
        ComtncpyrhtinfoVO comtncpyrhtinfoVO = new ComtncpyrhtinfoVO();
        comtncpyrhtinfoVO.setCpyrhtId(cpyrhtId);
;        
        // 변수명은 CoC 에 따라 comtncpyrhtinfoVO
        model.addAttribute(selectComtncpyrhtinfo(comtncpyrhtinfoVO, searchVO));
        return "/comtncpyrhtinfo/ComtncpyrhtinfoRegister";
    }

    @RequestMapping("/comtncpyrhtinfo/selectComtncpyrhtinfo.do")
    public @ModelAttribute("comtncpyrhtinfoVO")
    ComtncpyrhtinfoVO selectComtncpyrhtinfo(
            ComtncpyrhtinfoVO comtncpyrhtinfoVO,
            @ModelAttribute("searchVO") ComtncpyrhtinfoDefaultVO searchVO) throws Exception {
        return comtncpyrhtinfoService.selectComtncpyrhtinfo(comtncpyrhtinfoVO);
    }

    @RequestMapping("/comtncpyrhtinfo/updateComtncpyrhtinfo.do")
    public String updateComtncpyrhtinfo(
            ComtncpyrhtinfoVO comtncpyrhtinfoVO,
            @ModelAttribute("searchVO") ComtncpyrhtinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtncpyrhtinfoService.updateComtncpyrhtinfo(comtncpyrhtinfoVO);
        status.setComplete();
        return "forward:/comtncpyrhtinfo/ComtncpyrhtinfoList.do";
    }
    
    @RequestMapping("/comtncpyrhtinfo/deleteComtncpyrhtinfo.do")
    public String deleteComtncpyrhtinfo(
            ComtncpyrhtinfoVO comtncpyrhtinfoVO,
            @ModelAttribute("searchVO") ComtncpyrhtinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtncpyrhtinfoService.deleteComtncpyrhtinfo(comtncpyrhtinfoVO);
        status.setComplete();
        return "forward:/comtncpyrhtinfo/ComtncpyrhtinfoList.do";
    }

}
