package kr.godsoft.egovframe.generatorwebapp.comtnbbs.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnbbs.service.ComtnbbsService;
import kr.godsoft.egovframe.generatorwebapp.comtnbbs.service.ComtnbbsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbbs.service.ComtnbbsVO;

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
 * @Class Name : ComtnbbsController.java
 * @Description : Comtnbbs Controller class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Controller
public class ComtnbbsController {

    @Resource(name = "comtnbbsService")
    private ComtnbbsService comtnbbsService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNBBS 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnbbsVO
	 * @return "/comtnbbs/ComtnbbsList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnbbs/ComtnbbsList.do")
    public String selectComtnbbsList(@ModelAttribute("searchVO") ComtnbbsVO searchVO, 
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
		
        List<EgovMap> comtnbbsList = comtnbbsService.selectComtnbbsList(searchVO);
        model.addAttribute("resultList", comtnbbsList);
        
        int totCnt = comtnbbsService.selectComtnbbsListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnbbs/ComtnbbsList";
    } 
    
    @RequestMapping("/comtnbbs/addComtnbbsView.do")
    public String addComtnbbsView(
            @ModelAttribute("searchVO") ComtnbbsDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnbbsVO", new ComtnbbsVO());
        return "/comtnbbs/ComtnbbsRegister";
    }
    
    @RequestMapping("/comtnbbs/addComtnbbs.do")
    public String addComtnbbs(
            ComtnbbsVO comtnbbsVO,
            @ModelAttribute("searchVO") ComtnbbsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbbsService.insertComtnbbs(comtnbbsVO);
        status.setComplete();
        return "forward:/comtnbbs/ComtnbbsList.do";
    }
    
    @RequestMapping("/comtnbbs/updateComtnbbsView.do")
    public String updateComtnbbsView(
            @RequestParam("nttId") String nttId ,
            @RequestParam("bbsId") String bbsId ,
            @ModelAttribute("searchVO") ComtnbbsDefaultVO searchVO, Model model)
            throws Exception {
        ComtnbbsVO comtnbbsVO = new ComtnbbsVO();
        comtnbbsVO.setNttId(nttId);
        comtnbbsVO.setBbsId(bbsId);
;        
        // 변수명은 CoC 에 따라 comtnbbsVO
        model.addAttribute(selectComtnbbs(comtnbbsVO, searchVO));
        return "/comtnbbs/ComtnbbsRegister";
    }

    @RequestMapping("/comtnbbs/selectComtnbbs.do")
    public @ModelAttribute("comtnbbsVO")
    ComtnbbsVO selectComtnbbs(
            ComtnbbsVO comtnbbsVO,
            @ModelAttribute("searchVO") ComtnbbsDefaultVO searchVO) throws Exception {
        return comtnbbsService.selectComtnbbs(comtnbbsVO);
    }

    @RequestMapping("/comtnbbs/updateComtnbbs.do")
    public String updateComtnbbs(
            ComtnbbsVO comtnbbsVO,
            @ModelAttribute("searchVO") ComtnbbsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbbsService.updateComtnbbs(comtnbbsVO);
        status.setComplete();
        return "forward:/comtnbbs/ComtnbbsList.do";
    }
    
    @RequestMapping("/comtnbbs/deleteComtnbbs.do")
    public String deleteComtnbbs(
            ComtnbbsVO comtnbbsVO,
            @ModelAttribute("searchVO") ComtnbbsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbbsService.deleteComtnbbs(comtnbbsVO);
        status.setComplete();
        return "forward:/comtnbbs/ComtnbbsList.do";
    }

}
