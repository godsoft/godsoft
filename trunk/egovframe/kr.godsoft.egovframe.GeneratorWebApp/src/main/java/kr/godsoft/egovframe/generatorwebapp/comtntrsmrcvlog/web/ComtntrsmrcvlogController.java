package kr.godsoft.egovframe.generatorwebapp.comtntrsmrcvlog.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtntrsmrcvlog.service.ComtntrsmrcvlogService;
import kr.godsoft.egovframe.generatorwebapp.comtntrsmrcvlog.service.ComtntrsmrcvlogDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtntrsmrcvlog.service.ComtntrsmrcvlogVO;

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
 * @Class Name : ComtntrsmrcvlogController.java
 * @Description : Comtntrsmrcvlog Controller class
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
public class ComtntrsmrcvlogController {

    @Resource(name = "comtntrsmrcvlogService")
    private ComtntrsmrcvlogService comtntrsmrcvlogService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtntrsmrcvlog 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtntrsmrcvlogVO
	 * @return "/comtntrsmrcvlog/ComtntrsmrcvlogList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtntrsmrcvlog/ComtntrsmrcvlogList.do")
    public String selectComtntrsmrcvlogList(@ModelAttribute("searchVO") ComtntrsmrcvlogVO searchVO, 
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
		
        List<EgovMap> comtntrsmrcvlogList = comtntrsmrcvlogService.selectComtntrsmrcvlogList(searchVO);
        model.addAttribute("resultList", comtntrsmrcvlogList);
        
        int totCnt = comtntrsmrcvlogService.selectComtntrsmrcvlogListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtntrsmrcvlog/ComtntrsmrcvlogList";
    } 
    
    @RequestMapping("/comtntrsmrcvlog/addComtntrsmrcvlogView.do")
    public String addComtntrsmrcvlogView(
            @ModelAttribute("searchVO") ComtntrsmrcvlogDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtntrsmrcvlogVO", new ComtntrsmrcvlogVO());
        return "/comtntrsmrcvlog/ComtntrsmrcvlogRegister";
    }
    
    @RequestMapping("/comtntrsmrcvlog/addComtntrsmrcvlog.do")
    public String addComtntrsmrcvlog(
            ComtntrsmrcvlogVO comtntrsmrcvlogVO,
            @ModelAttribute("searchVO") ComtntrsmrcvlogDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtntrsmrcvlogService.insertComtntrsmrcvlog(comtntrsmrcvlogVO);
        status.setComplete();
        return "forward:/comtntrsmrcvlog/ComtntrsmrcvlogList.do";
    }
    
    @RequestMapping("/comtntrsmrcvlog/updateComtntrsmrcvlogView.do")
    public String updateComtntrsmrcvlogView(
            @RequestParam("requstId") String requstId ,
            @ModelAttribute("searchVO") ComtntrsmrcvlogDefaultVO searchVO, Model model)
            throws Exception {
        ComtntrsmrcvlogVO comtntrsmrcvlogVO = new ComtntrsmrcvlogVO();
        comtntrsmrcvlogVO.setRequstId(requstId);
;        
        // 변수명은 CoC 에 따라 comtntrsmrcvlogVO
        model.addAttribute(selectComtntrsmrcvlog(comtntrsmrcvlogVO, searchVO));
        return "/comtntrsmrcvlog/ComtntrsmrcvlogRegister";
    }

    @RequestMapping("/comtntrsmrcvlog/selectComtntrsmrcvlog.do")
    public @ModelAttribute("comtntrsmrcvlogVO")
    ComtntrsmrcvlogVO selectComtntrsmrcvlog(
            ComtntrsmrcvlogVO comtntrsmrcvlogVO,
            @ModelAttribute("searchVO") ComtntrsmrcvlogDefaultVO searchVO) throws Exception {
        return comtntrsmrcvlogService.selectComtntrsmrcvlog(comtntrsmrcvlogVO);
    }

    @RequestMapping("/comtntrsmrcvlog/updateComtntrsmrcvlog.do")
    public String updateComtntrsmrcvlog(
            ComtntrsmrcvlogVO comtntrsmrcvlogVO,
            @ModelAttribute("searchVO") ComtntrsmrcvlogDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtntrsmrcvlogService.updateComtntrsmrcvlog(comtntrsmrcvlogVO);
        status.setComplete();
        return "forward:/comtntrsmrcvlog/ComtntrsmrcvlogList.do";
    }
    
    @RequestMapping("/comtntrsmrcvlog/deleteComtntrsmrcvlog.do")
    public String deleteComtntrsmrcvlog(
            ComtntrsmrcvlogVO comtntrsmrcvlogVO,
            @ModelAttribute("searchVO") ComtntrsmrcvlogDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtntrsmrcvlogService.deleteComtntrsmrcvlog(comtntrsmrcvlogVO);
        status.setComplete();
        return "forward:/comtntrsmrcvlog/ComtntrsmrcvlogList.do";
    }

}
