package kr.godsoft.egovframe.generatorwebapp.comtnproxyloginfo.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtnproxyloginfo.service.ComtnproxyloginfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnproxyloginfo.service.ComtnproxyloginfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnproxyloginfo.service.ComtnproxyloginfoVO;

/**
 * @Class Name : ComtnproxyloginfoController.java
 * @Description : Comtnproxyloginfo Controller class
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
@SessionAttributes(types=ComtnproxyloginfoVO.class)
public class ComtnproxyloginfoController {

    @Resource(name = "comtnproxyloginfoService")
    private ComtnproxyloginfoService comtnproxyloginfoService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnproxyloginfo 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnproxyloginfoDefaultVO
	 * @return "/comtnproxyloginfo/ComtnproxyloginfoList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnproxyloginfo/ComtnproxyloginfoList.do")
    public String selectComtnproxyloginfoList(@ModelAttribute("searchVO") ComtnproxyloginfoDefaultVO searchVO, 
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
		
        List comtnproxyloginfoList = comtnproxyloginfoService.selectComtnproxyloginfoList(searchVO);
        model.addAttribute("resultList", comtnproxyloginfoList);
        
        int totCnt = comtnproxyloginfoService.selectComtnproxyloginfoListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnproxyloginfo/ComtnproxyloginfoList";
    } 
    
    @RequestMapping("/comtnproxyloginfo/addComtnproxyloginfoView.do")
    public String addComtnproxyloginfoView(
            @ModelAttribute("searchVO") ComtnproxyloginfoDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnproxyloginfoVO", new ComtnproxyloginfoVO());
        return "/comtnproxyloginfo/ComtnproxyloginfoRegister";
    }
    
    @RequestMapping("/comtnproxyloginfo/addComtnproxyloginfo.do")
    public String addComtnproxyloginfo(
            ComtnproxyloginfoVO comtnproxyloginfoVO,
            @ModelAttribute("searchVO") ComtnproxyloginfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnproxyloginfoService.insertComtnproxyloginfo(comtnproxyloginfoVO);
        status.setComplete();
        return "forward:/comtnproxyloginfo/ComtnproxyloginfoList.do";
    }
    
    @RequestMapping("/comtnproxyloginfo/updateComtnproxyloginfoView.do")
    public String updateComtnproxyloginfoView(
            @RequestParam("proxyId") String proxyId ,
            @RequestParam("logId") String logId ,
            @ModelAttribute("searchVO") ComtnproxyloginfoDefaultVO searchVO, Model model)
            throws Exception {
        ComtnproxyloginfoVO comtnproxyloginfoVO = new ComtnproxyloginfoVO();
        comtnproxyloginfoVO.setProxyId(proxyId);
        comtnproxyloginfoVO.setLogId(logId);
;        
        // 변수명은 CoC 에 따라 comtnproxyloginfoVO
        model.addAttribute(selectComtnproxyloginfo(comtnproxyloginfoVO, searchVO));
        return "/comtnproxyloginfo/ComtnproxyloginfoRegister";
    }

    @RequestMapping("/comtnproxyloginfo/selectComtnproxyloginfo.do")
    public @ModelAttribute("comtnproxyloginfoVO")
    ComtnproxyloginfoVO selectComtnproxyloginfo(
            ComtnproxyloginfoVO comtnproxyloginfoVO,
            @ModelAttribute("searchVO") ComtnproxyloginfoDefaultVO searchVO) throws Exception {
        return comtnproxyloginfoService.selectComtnproxyloginfo(comtnproxyloginfoVO);
    }

    @RequestMapping("/comtnproxyloginfo/updateComtnproxyloginfo.do")
    public String updateComtnproxyloginfo(
            ComtnproxyloginfoVO comtnproxyloginfoVO,
            @ModelAttribute("searchVO") ComtnproxyloginfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnproxyloginfoService.updateComtnproxyloginfo(comtnproxyloginfoVO);
        status.setComplete();
        return "forward:/comtnproxyloginfo/ComtnproxyloginfoList.do";
    }
    
    @RequestMapping("/comtnproxyloginfo/deleteComtnproxyloginfo.do")
    public String deleteComtnproxyloginfo(
            ComtnproxyloginfoVO comtnproxyloginfoVO,
            @ModelAttribute("searchVO") ComtnproxyloginfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnproxyloginfoService.deleteComtnproxyloginfo(comtnproxyloginfoVO);
        status.setComplete();
        return "forward:/comtnproxyloginfo/ComtnproxyloginfoList.do";
    }

}
