package kr.godsoft.egovframe.generatorwebapp.comtnproxyinfo.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnproxyinfo.service.ComtnproxyinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnproxyinfo.service.ComtnproxyinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnproxyinfo.service.ComtnproxyinfoVO;

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
 * @Class Name : ComtnproxyinfoController.java
 * @Description : Comtnproxyinfo Controller class
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
public class ComtnproxyinfoController {

    @Resource(name = "comtnproxyinfoService")
    private ComtnproxyinfoService comtnproxyinfoService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnproxyinfo 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnproxyinfoVO
	 * @return "/comtnproxyinfo/ComtnproxyinfoList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnproxyinfo/ComtnproxyinfoList.do")
    public String selectComtnproxyinfoList(@ModelAttribute("searchVO") ComtnproxyinfoVO searchVO, 
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
		
        List<EgovMap> comtnproxyinfoList = comtnproxyinfoService.selectComtnproxyinfoList(searchVO);
        model.addAttribute("resultList", comtnproxyinfoList);
        
        int totCnt = comtnproxyinfoService.selectComtnproxyinfoListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnproxyinfo/ComtnproxyinfoList";
    } 
    
    @RequestMapping("/comtnproxyinfo/addComtnproxyinfoView.do")
    public String addComtnproxyinfoView(
            @ModelAttribute("searchVO") ComtnproxyinfoDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnproxyinfoVO", new ComtnproxyinfoVO());
        return "/comtnproxyinfo/ComtnproxyinfoRegister";
    }
    
    @RequestMapping("/comtnproxyinfo/addComtnproxyinfo.do")
    public String addComtnproxyinfo(
            ComtnproxyinfoVO comtnproxyinfoVO,
            @ModelAttribute("searchVO") ComtnproxyinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnproxyinfoService.insertComtnproxyinfo(comtnproxyinfoVO);
        status.setComplete();
        return "forward:/comtnproxyinfo/ComtnproxyinfoList.do";
    }
    
    @RequestMapping("/comtnproxyinfo/updateComtnproxyinfoView.do")
    public String updateComtnproxyinfoView(
            @RequestParam("proxyId") String proxyId ,
            @ModelAttribute("searchVO") ComtnproxyinfoDefaultVO searchVO, Model model)
            throws Exception {
        ComtnproxyinfoVO comtnproxyinfoVO = new ComtnproxyinfoVO();
        comtnproxyinfoVO.setProxyId(proxyId);
;        
        // 변수명은 CoC 에 따라 comtnproxyinfoVO
        model.addAttribute(selectComtnproxyinfo(comtnproxyinfoVO, searchVO));
        return "/comtnproxyinfo/ComtnproxyinfoRegister";
    }

    @RequestMapping("/comtnproxyinfo/selectComtnproxyinfo.do")
    public @ModelAttribute("comtnproxyinfoVO")
    ComtnproxyinfoVO selectComtnproxyinfo(
            ComtnproxyinfoVO comtnproxyinfoVO,
            @ModelAttribute("searchVO") ComtnproxyinfoDefaultVO searchVO) throws Exception {
        return comtnproxyinfoService.selectComtnproxyinfo(comtnproxyinfoVO);
    }

    @RequestMapping("/comtnproxyinfo/updateComtnproxyinfo.do")
    public String updateComtnproxyinfo(
            ComtnproxyinfoVO comtnproxyinfoVO,
            @ModelAttribute("searchVO") ComtnproxyinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnproxyinfoService.updateComtnproxyinfo(comtnproxyinfoVO);
        status.setComplete();
        return "forward:/comtnproxyinfo/ComtnproxyinfoList.do";
    }
    
    @RequestMapping("/comtnproxyinfo/deleteComtnproxyinfo.do")
    public String deleteComtnproxyinfo(
            ComtnproxyinfoVO comtnproxyinfoVO,
            @ModelAttribute("searchVO") ComtnproxyinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnproxyinfoService.deleteComtnproxyinfo(comtnproxyinfoVO);
        status.setComplete();
        return "forward:/comtnproxyinfo/ComtnproxyinfoList.do";
    }

}
