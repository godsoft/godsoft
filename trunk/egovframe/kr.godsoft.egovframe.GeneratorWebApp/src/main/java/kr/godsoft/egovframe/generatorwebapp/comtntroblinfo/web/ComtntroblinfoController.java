package kr.godsoft.egovframe.generatorwebapp.comtntroblinfo.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtntroblinfo.service.ComtntroblinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtntroblinfo.service.ComtntroblinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtntroblinfo.service.ComtntroblinfoVO;

/**
 * @Class Name : ComtntroblinfoController.java
 * @Description : Comtntroblinfo Controller class
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
@SessionAttributes(types=ComtntroblinfoVO.class)
public class ComtntroblinfoController {

    @Resource(name = "comtntroblinfoService")
    private ComtntroblinfoService comtntroblinfoService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtntroblinfo 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtntroblinfoDefaultVO
	 * @return "/comtntroblinfo/ComtntroblinfoList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtntroblinfo/ComtntroblinfoList.do")
    public String selectComtntroblinfoList(@ModelAttribute("searchVO") ComtntroblinfoDefaultVO searchVO, 
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
		
        List comtntroblinfoList = comtntroblinfoService.selectComtntroblinfoList(searchVO);
        model.addAttribute("resultList", comtntroblinfoList);
        
        int totCnt = comtntroblinfoService.selectComtntroblinfoListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtntroblinfo/ComtntroblinfoList";
    } 
    
    @RequestMapping("/comtntroblinfo/addComtntroblinfoView.do")
    public String addComtntroblinfoView(
            @ModelAttribute("searchVO") ComtntroblinfoDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtntroblinfoVO", new ComtntroblinfoVO());
        return "/comtntroblinfo/ComtntroblinfoRegister";
    }
    
    @RequestMapping("/comtntroblinfo/addComtntroblinfo.do")
    public String addComtntroblinfo(
            ComtntroblinfoVO comtntroblinfoVO,
            @ModelAttribute("searchVO") ComtntroblinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtntroblinfoService.insertComtntroblinfo(comtntroblinfoVO);
        status.setComplete();
        return "forward:/comtntroblinfo/ComtntroblinfoList.do";
    }
    
    @RequestMapping("/comtntroblinfo/updateComtntroblinfoView.do")
    public String updateComtntroblinfoView(
            @RequestParam("troblId") String troblId ,
            @ModelAttribute("searchVO") ComtntroblinfoDefaultVO searchVO, Model model)
            throws Exception {
        ComtntroblinfoVO comtntroblinfoVO = new ComtntroblinfoVO();
        comtntroblinfoVO.setTroblId(troblId);
;        
        // 변수명은 CoC 에 따라 comtntroblinfoVO
        model.addAttribute(selectComtntroblinfo(comtntroblinfoVO, searchVO));
        return "/comtntroblinfo/ComtntroblinfoRegister";
    }

    @RequestMapping("/comtntroblinfo/selectComtntroblinfo.do")
    public @ModelAttribute("comtntroblinfoVO")
    ComtntroblinfoVO selectComtntroblinfo(
            ComtntroblinfoVO comtntroblinfoVO,
            @ModelAttribute("searchVO") ComtntroblinfoDefaultVO searchVO) throws Exception {
        return comtntroblinfoService.selectComtntroblinfo(comtntroblinfoVO);
    }

    @RequestMapping("/comtntroblinfo/updateComtntroblinfo.do")
    public String updateComtntroblinfo(
            ComtntroblinfoVO comtntroblinfoVO,
            @ModelAttribute("searchVO") ComtntroblinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtntroblinfoService.updateComtntroblinfo(comtntroblinfoVO);
        status.setComplete();
        return "forward:/comtntroblinfo/ComtntroblinfoList.do";
    }
    
    @RequestMapping("/comtntroblinfo/deleteComtntroblinfo.do")
    public String deleteComtntroblinfo(
            ComtntroblinfoVO comtntroblinfoVO,
            @ModelAttribute("searchVO") ComtntroblinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtntroblinfoService.deleteComtntroblinfo(comtntroblinfoVO);
        status.setComplete();
        return "forward:/comtntroblinfo/ComtntroblinfoList.do";
    }

}
