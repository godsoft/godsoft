package kr.godsoft.egovframe.generatorwebapp.comtncntntslist.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtncntntslist.service.ComtncntntslistService;
import kr.godsoft.egovframe.generatorwebapp.comtncntntslist.service.ComtncntntslistDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtncntntslist.service.ComtncntntslistVO;

/**
 * @Class Name : ComtncntntslistController.java
 * @Description : Comtncntntslist Controller class
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
@SessionAttributes(types=ComtncntntslistVO.class)
public class ComtncntntslistController {

    @Resource(name = "comtncntntslistService")
    private ComtncntntslistService comtncntntslistService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtncntntslist 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtncntntslistDefaultVO
	 * @return "/comtncntntslist/ComtncntntslistList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtncntntslist/ComtncntntslistList.do")
    public String selectComtncntntslistList(@ModelAttribute("searchVO") ComtncntntslistDefaultVO searchVO, 
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
		
        List comtncntntslistList = comtncntntslistService.selectComtncntntslistList(searchVO);
        model.addAttribute("resultList", comtncntntslistList);
        
        int totCnt = comtncntntslistService.selectComtncntntslistListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtncntntslist/ComtncntntslistList";
    } 
    
    @RequestMapping("/comtncntntslist/addComtncntntslistView.do")
    public String addComtncntntslistView(
            @ModelAttribute("searchVO") ComtncntntslistDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtncntntslistVO", new ComtncntntslistVO());
        return "/comtncntntslist/ComtncntntslistRegister";
    }
    
    @RequestMapping("/comtncntntslist/addComtncntntslist.do")
    public String addComtncntntslist(
            ComtncntntslistVO comtncntntslistVO,
            @ModelAttribute("searchVO") ComtncntntslistDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtncntntslistService.insertComtncntntslist(comtncntntslistVO);
        status.setComplete();
        return "forward:/comtncntntslist/ComtncntntslistList.do";
    }
    
    @RequestMapping("/comtncntntslist/updateComtncntntslistView.do")
    public String updateComtncntntslistView(
            @RequestParam("cntntsId") String cntntsId ,
            @RequestParam("emplyrId") String emplyrId ,
            @ModelAttribute("searchVO") ComtncntntslistDefaultVO searchVO, Model model)
            throws Exception {
        ComtncntntslistVO comtncntntslistVO = new ComtncntntslistVO();
        comtncntntslistVO.setCntntsId(cntntsId);
        comtncntntslistVO.setEmplyrId(emplyrId);
;        
        // 변수명은 CoC 에 따라 comtncntntslistVO
        model.addAttribute(selectComtncntntslist(comtncntntslistVO, searchVO));
        return "/comtncntntslist/ComtncntntslistRegister";
    }

    @RequestMapping("/comtncntntslist/selectComtncntntslist.do")
    public @ModelAttribute("comtncntntslistVO")
    ComtncntntslistVO selectComtncntntslist(
            ComtncntntslistVO comtncntntslistVO,
            @ModelAttribute("searchVO") ComtncntntslistDefaultVO searchVO) throws Exception {
        return comtncntntslistService.selectComtncntntslist(comtncntntslistVO);
    }

    @RequestMapping("/comtncntntslist/updateComtncntntslist.do")
    public String updateComtncntntslist(
            ComtncntntslistVO comtncntntslistVO,
            @ModelAttribute("searchVO") ComtncntntslistDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtncntntslistService.updateComtncntntslist(comtncntntslistVO);
        status.setComplete();
        return "forward:/comtncntntslist/ComtncntntslistList.do";
    }
    
    @RequestMapping("/comtncntntslist/deleteComtncntntslist.do")
    public String deleteComtncntntslist(
            ComtncntntslistVO comtncntntslistVO,
            @ModelAttribute("searchVO") ComtncntntslistDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtncntntslistService.deleteComtncntntslist(comtncntntslistVO);
        status.setComplete();
        return "forward:/comtncntntslist/ComtncntntslistList.do";
    }

}
