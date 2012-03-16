package kr.godsoft.egovframe.generatorwebapp.comtndammapteam.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtndammapteam.service.ComtndammapteamService;
import kr.godsoft.egovframe.generatorwebapp.comtndammapteam.service.ComtndammapteamDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtndammapteam.service.ComtndammapteamVO;

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
 * @Class Name : ComtndammapteamController.java
 * @Description : Comtndammapteam Controller class
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
@SessionAttributes(types=ComtndammapteamVO.class)
public class ComtndammapteamController {

    @Resource(name = "comtndammapteamService")
    private ComtndammapteamService comtndammapteamService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtndammapteam 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtndammapteamVO
	 * @return "/comtndammapteam/ComtndammapteamList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtndammapteam/ComtndammapteamList.do")
    public String selectComtndammapteamList(@ModelAttribute("searchVO") ComtndammapteamVO searchVO, 
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
		
        List<EgovMap> comtndammapteamList = comtndammapteamService.selectComtndammapteamList(searchVO);
        model.addAttribute("resultList", comtndammapteamList);
        
        int totCnt = comtndammapteamService.selectComtndammapteamListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtndammapteam/ComtndammapteamList";
    } 
    
    @RequestMapping("/comtndammapteam/addComtndammapteamView.do")
    public String addComtndammapteamView(
            @ModelAttribute("searchVO") ComtndammapteamDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtndammapteamVO", new ComtndammapteamVO());
        return "/comtndammapteam/ComtndammapteamRegister";
    }
    
    @RequestMapping("/comtndammapteam/addComtndammapteam.do")
    public String addComtndammapteam(
            ComtndammapteamVO comtndammapteamVO,
            @ModelAttribute("searchVO") ComtndammapteamDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtndammapteamService.insertComtndammapteam(comtndammapteamVO);
        status.setComplete();
        return "forward:/comtndammapteam/ComtndammapteamList.do";
    }
    
    @RequestMapping("/comtndammapteam/updateComtndammapteamView.do")
    public String updateComtndammapteamView(
            @RequestParam("orgnztId") String orgnztId ,
            @ModelAttribute("searchVO") ComtndammapteamDefaultVO searchVO, Model model)
            throws Exception {
        ComtndammapteamVO comtndammapteamVO = new ComtndammapteamVO();
        comtndammapteamVO.setOrgnztId(orgnztId);
;        
        // 변수명은 CoC 에 따라 comtndammapteamVO
        model.addAttribute(selectComtndammapteam(comtndammapteamVO, searchVO));
        return "/comtndammapteam/ComtndammapteamRegister";
    }

    @RequestMapping("/comtndammapteam/selectComtndammapteam.do")
    public @ModelAttribute("comtndammapteamVO")
    ComtndammapteamVO selectComtndammapteam(
            ComtndammapteamVO comtndammapteamVO,
            @ModelAttribute("searchVO") ComtndammapteamDefaultVO searchVO) throws Exception {
        return comtndammapteamService.selectComtndammapteam(comtndammapteamVO);
    }

    @RequestMapping("/comtndammapteam/updateComtndammapteam.do")
    public String updateComtndammapteam(
            ComtndammapteamVO comtndammapteamVO,
            @ModelAttribute("searchVO") ComtndammapteamDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtndammapteamService.updateComtndammapteam(comtndammapteamVO);
        status.setComplete();
        return "forward:/comtndammapteam/ComtndammapteamList.do";
    }
    
    @RequestMapping("/comtndammapteam/deleteComtndammapteam.do")
    public String deleteComtndammapteam(
            ComtndammapteamVO comtndammapteamVO,
            @ModelAttribute("searchVO") ComtndammapteamDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtndammapteamService.deleteComtndammapteam(comtndammapteamVO);
        status.setComplete();
        return "forward:/comtndammapteam/ComtndammapteamList.do";
    }

}
