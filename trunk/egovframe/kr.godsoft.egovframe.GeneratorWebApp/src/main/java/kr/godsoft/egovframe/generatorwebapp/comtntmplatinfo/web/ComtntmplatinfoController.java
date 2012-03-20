package kr.godsoft.egovframe.generatorwebapp.comtntmplatinfo.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtntmplatinfo.service.ComtntmplatinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtntmplatinfo.service.ComtntmplatinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtntmplatinfo.service.ComtntmplatinfoVO;

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
 * @Class Name : ComtntmplatinfoController.java
 * @Description : Comtntmplatinfo Controller class
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
public class ComtntmplatinfoController {

    @Resource(name = "comtntmplatinfoService")
    private ComtntmplatinfoService comtntmplatinfoService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtntmplatinfo 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtntmplatinfoVO
	 * @return "/comtntmplatinfo/ComtntmplatinfoList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtntmplatinfo/ComtntmplatinfoList.do")
    public String selectComtntmplatinfoList(@ModelAttribute("searchVO") ComtntmplatinfoVO searchVO, 
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
		
        List<EgovMap> comtntmplatinfoList = comtntmplatinfoService.selectComtntmplatinfoList(searchVO);
        model.addAttribute("resultList", comtntmplatinfoList);
        
        int totCnt = comtntmplatinfoService.selectComtntmplatinfoListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtntmplatinfo/ComtntmplatinfoList";
    } 
    
    @RequestMapping("/comtntmplatinfo/addComtntmplatinfoView.do")
    public String addComtntmplatinfoView(
            @ModelAttribute("searchVO") ComtntmplatinfoDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtntmplatinfoVO", new ComtntmplatinfoVO());
        return "/comtntmplatinfo/ComtntmplatinfoRegister";
    }
    
    @RequestMapping("/comtntmplatinfo/addComtntmplatinfo.do")
    public String addComtntmplatinfo(
            ComtntmplatinfoVO comtntmplatinfoVO,
            @ModelAttribute("searchVO") ComtntmplatinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtntmplatinfoService.insertComtntmplatinfo(comtntmplatinfoVO);
        status.setComplete();
        return "forward:/comtntmplatinfo/ComtntmplatinfoList.do";
    }
    
    @RequestMapping("/comtntmplatinfo/updateComtntmplatinfoView.do")
    public String updateComtntmplatinfoView(
            @RequestParam("tmplatId") String tmplatId ,
            @ModelAttribute("searchVO") ComtntmplatinfoDefaultVO searchVO, Model model)
            throws Exception {
        ComtntmplatinfoVO comtntmplatinfoVO = new ComtntmplatinfoVO();
        comtntmplatinfoVO.setTmplatId(tmplatId);
;        
        // 변수명은 CoC 에 따라 comtntmplatinfoVO
        model.addAttribute(selectComtntmplatinfo(comtntmplatinfoVO, searchVO));
        return "/comtntmplatinfo/ComtntmplatinfoRegister";
    }

    @RequestMapping("/comtntmplatinfo/selectComtntmplatinfo.do")
    public @ModelAttribute("comtntmplatinfoVO")
    ComtntmplatinfoVO selectComtntmplatinfo(
            ComtntmplatinfoVO comtntmplatinfoVO,
            @ModelAttribute("searchVO") ComtntmplatinfoDefaultVO searchVO) throws Exception {
        return comtntmplatinfoService.selectComtntmplatinfo(comtntmplatinfoVO);
    }

    @RequestMapping("/comtntmplatinfo/updateComtntmplatinfo.do")
    public String updateComtntmplatinfo(
            ComtntmplatinfoVO comtntmplatinfoVO,
            @ModelAttribute("searchVO") ComtntmplatinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtntmplatinfoService.updateComtntmplatinfo(comtntmplatinfoVO);
        status.setComplete();
        return "forward:/comtntmplatinfo/ComtntmplatinfoList.do";
    }
    
    @RequestMapping("/comtntmplatinfo/deleteComtntmplatinfo.do")
    public String deleteComtntmplatinfo(
            ComtntmplatinfoVO comtntmplatinfoVO,
            @ModelAttribute("searchVO") ComtntmplatinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtntmplatinfoService.deleteComtntmplatinfo(comtntmplatinfoVO);
        status.setComplete();
        return "forward:/comtntmplatinfo/ComtntmplatinfoList.do";
    }

}
