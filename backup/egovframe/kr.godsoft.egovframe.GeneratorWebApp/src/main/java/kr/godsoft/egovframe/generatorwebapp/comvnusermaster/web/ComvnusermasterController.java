package kr.godsoft.egovframe.generatorwebapp.comvnusermaster.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comvnusermaster.service.ComvnusermasterService;
import kr.godsoft.egovframe.generatorwebapp.comvnusermaster.service.ComvnusermasterDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comvnusermaster.service.ComvnusermasterVO;

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
 * @Class Name : ComvnusermasterController.java
 * @Description : Comvnusermaster Controller class
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
public class ComvnusermasterController {

    @Resource(name = "comvnusermasterService")
    private ComvnusermasterService comvnusermasterService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMVNUSERMASTER 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComvnusermasterVO
	 * @return "/comvnusermaster/ComvnusermasterList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comvnusermaster/ComvnusermasterList.do")
    public String selectComvnusermasterList(@ModelAttribute("searchVO") ComvnusermasterVO searchVO, 
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
		
        List<EgovMap> comvnusermasterList = comvnusermasterService.selectComvnusermasterList(searchVO);
        model.addAttribute("resultList", comvnusermasterList);
        
        int totCnt = comvnusermasterService.selectComvnusermasterListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comvnusermaster/ComvnusermasterList";
    } 
    
    @RequestMapping("/comvnusermaster/addComvnusermasterView.do")
    public String addComvnusermasterView(
            @ModelAttribute("searchVO") ComvnusermasterDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comvnusermasterVO", new ComvnusermasterVO());
        return "/comvnusermaster/ComvnusermasterRegister";
    }
    
    @RequestMapping("/comvnusermaster/addComvnusermaster.do")
    public String addComvnusermaster(
            ComvnusermasterVO comvnusermasterVO,
            @ModelAttribute("searchVO") ComvnusermasterDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comvnusermasterService.insertComvnusermaster(comvnusermasterVO);
        status.setComplete();
        return "forward:/comvnusermaster/ComvnusermasterList.do";
    }
    
    @RequestMapping("/comvnusermaster/updateComvnusermasterView.do")
    public String updateComvnusermasterView(
            @ModelAttribute("searchVO") ComvnusermasterDefaultVO searchVO, Model model)
            throws Exception {
        ComvnusermasterVO comvnusermasterVO = new ComvnusermasterVO();
;        
        // 변수명은 CoC 에 따라 comvnusermasterVO
        model.addAttribute(selectComvnusermaster(comvnusermasterVO, searchVO));
        return "/comvnusermaster/ComvnusermasterRegister";
    }

    @RequestMapping("/comvnusermaster/selectComvnusermaster.do")
    public @ModelAttribute("comvnusermasterVO")
    ComvnusermasterVO selectComvnusermaster(
            ComvnusermasterVO comvnusermasterVO,
            @ModelAttribute("searchVO") ComvnusermasterDefaultVO searchVO) throws Exception {
        return comvnusermasterService.selectComvnusermaster(comvnusermasterVO);
    }

    @RequestMapping("/comvnusermaster/updateComvnusermaster.do")
    public String updateComvnusermaster(
            ComvnusermasterVO comvnusermasterVO,
            @ModelAttribute("searchVO") ComvnusermasterDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comvnusermasterService.updateComvnusermaster(comvnusermasterVO);
        status.setComplete();
        return "forward:/comvnusermaster/ComvnusermasterList.do";
    }
    
    @RequestMapping("/comvnusermaster/deleteComvnusermaster.do")
    public String deleteComvnusermaster(
            ComvnusermasterVO comvnusermasterVO,
            @ModelAttribute("searchVO") ComvnusermasterDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comvnusermasterService.deleteComvnusermaster(comvnusermasterVO);
        status.setComplete();
        return "forward:/comvnusermaster/ComvnusermasterList.do";
    }

}
