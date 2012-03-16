package kr.godsoft.egovframe.generatorwebapp.comtnsitelist.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnsitelist.service.ComtnsitelistService;
import kr.godsoft.egovframe.generatorwebapp.comtnsitelist.service.ComtnsitelistDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnsitelist.service.ComtnsitelistVO;

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
 * @Class Name : ComtnsitelistController.java
 * @Description : Comtnsitelist Controller class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Controller
@SessionAttributes(types=ComtnsitelistVO.class)
public class ComtnsitelistController {

    @Resource(name = "comtnsitelistService")
    private ComtnsitelistService comtnsitelistService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnsitelist 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnsitelistVO
	 * @return "/comtnsitelist/ComtnsitelistList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnsitelist/ComtnsitelistList.do")
    public String selectComtnsitelistList(@ModelAttribute("searchVO") ComtnsitelistVO searchVO, 
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
		
        List<EgovMap> comtnsitelistList = comtnsitelistService.selectComtnsitelistList(searchVO);
        model.addAttribute("resultList", comtnsitelistList);
        
        int totCnt = comtnsitelistService.selectComtnsitelistListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnsitelist/ComtnsitelistList";
    } 
    
    @RequestMapping("/comtnsitelist/addComtnsitelistView.do")
    public String addComtnsitelistView(
            @ModelAttribute("searchVO") ComtnsitelistDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnsitelistVO", new ComtnsitelistVO());
        return "/comtnsitelist/ComtnsitelistRegister";
    }
    
    @RequestMapping("/comtnsitelist/addComtnsitelist.do")
    public String addComtnsitelist(
            ComtnsitelistVO comtnsitelistVO,
            @ModelAttribute("searchVO") ComtnsitelistDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnsitelistService.insertComtnsitelist(comtnsitelistVO);
        status.setComplete();
        return "forward:/comtnsitelist/ComtnsitelistList.do";
    }
    
    @RequestMapping("/comtnsitelist/updateComtnsitelistView.do")
    public String updateComtnsitelistView(
            @RequestParam("siteId") String siteId ,
            @ModelAttribute("searchVO") ComtnsitelistDefaultVO searchVO, Model model)
            throws Exception {
        ComtnsitelistVO comtnsitelistVO = new ComtnsitelistVO();
        comtnsitelistVO.setSiteId(siteId);
;        
        // 변수명은 CoC 에 따라 comtnsitelistVO
        model.addAttribute(selectComtnsitelist(comtnsitelistVO, searchVO));
        return "/comtnsitelist/ComtnsitelistRegister";
    }

    @RequestMapping("/comtnsitelist/selectComtnsitelist.do")
    public @ModelAttribute("comtnsitelistVO")
    ComtnsitelistVO selectComtnsitelist(
            ComtnsitelistVO comtnsitelistVO,
            @ModelAttribute("searchVO") ComtnsitelistDefaultVO searchVO) throws Exception {
        return comtnsitelistService.selectComtnsitelist(comtnsitelistVO);
    }

    @RequestMapping("/comtnsitelist/updateComtnsitelist.do")
    public String updateComtnsitelist(
            ComtnsitelistVO comtnsitelistVO,
            @ModelAttribute("searchVO") ComtnsitelistDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnsitelistService.updateComtnsitelist(comtnsitelistVO);
        status.setComplete();
        return "forward:/comtnsitelist/ComtnsitelistList.do";
    }
    
    @RequestMapping("/comtnsitelist/deleteComtnsitelist.do")
    public String deleteComtnsitelist(
            ComtnsitelistVO comtnsitelistVO,
            @ModelAttribute("searchVO") ComtnsitelistDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnsitelistService.deleteComtnsitelist(comtnsitelistVO);
        status.setComplete();
        return "forward:/comtnsitelist/ComtnsitelistList.do";
    }

}
