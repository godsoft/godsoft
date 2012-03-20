package kr.godsoft.egovframe.generatorwebapp.comtnweblog.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnweblog.service.ComtnweblogService;
import kr.godsoft.egovframe.generatorwebapp.comtnweblog.service.ComtnweblogDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnweblog.service.ComtnweblogVO;

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
 * @Class Name : ComtnweblogController.java
 * @Description : Comtnweblog Controller class
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
public class ComtnweblogController {

    @Resource(name = "comtnweblogService")
    private ComtnweblogService comtnweblogService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnweblog 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnweblogVO
	 * @return "/comtnweblog/ComtnweblogList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnweblog/ComtnweblogList.do")
    public String selectComtnweblogList(@ModelAttribute("searchVO") ComtnweblogVO searchVO, 
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
		
        List<EgovMap> comtnweblogList = comtnweblogService.selectComtnweblogList(searchVO);
        model.addAttribute("resultList", comtnweblogList);
        
        int totCnt = comtnweblogService.selectComtnweblogListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnweblog/ComtnweblogList";
    } 
    
    @RequestMapping("/comtnweblog/addComtnweblogView.do")
    public String addComtnweblogView(
            @ModelAttribute("searchVO") ComtnweblogDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnweblogVO", new ComtnweblogVO());
        return "/comtnweblog/ComtnweblogRegister";
    }
    
    @RequestMapping("/comtnweblog/addComtnweblog.do")
    public String addComtnweblog(
            ComtnweblogVO comtnweblogVO,
            @ModelAttribute("searchVO") ComtnweblogDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnweblogService.insertComtnweblog(comtnweblogVO);
        status.setComplete();
        return "forward:/comtnweblog/ComtnweblogList.do";
    }
    
    @RequestMapping("/comtnweblog/updateComtnweblogView.do")
    public String updateComtnweblogView(
            @RequestParam("requstId") String requstId ,
            @ModelAttribute("searchVO") ComtnweblogDefaultVO searchVO, Model model)
            throws Exception {
        ComtnweblogVO comtnweblogVO = new ComtnweblogVO();
        comtnweblogVO.setRequstId(requstId);
;        
        // 변수명은 CoC 에 따라 comtnweblogVO
        model.addAttribute(selectComtnweblog(comtnweblogVO, searchVO));
        return "/comtnweblog/ComtnweblogRegister";
    }

    @RequestMapping("/comtnweblog/selectComtnweblog.do")
    public @ModelAttribute("comtnweblogVO")
    ComtnweblogVO selectComtnweblog(
            ComtnweblogVO comtnweblogVO,
            @ModelAttribute("searchVO") ComtnweblogDefaultVO searchVO) throws Exception {
        return comtnweblogService.selectComtnweblog(comtnweblogVO);
    }

    @RequestMapping("/comtnweblog/updateComtnweblog.do")
    public String updateComtnweblog(
            ComtnweblogVO comtnweblogVO,
            @ModelAttribute("searchVO") ComtnweblogDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnweblogService.updateComtnweblog(comtnweblogVO);
        status.setComplete();
        return "forward:/comtnweblog/ComtnweblogList.do";
    }
    
    @RequestMapping("/comtnweblog/deleteComtnweblog.do")
    public String deleteComtnweblog(
            ComtnweblogVO comtnweblogVO,
            @ModelAttribute("searchVO") ComtnweblogDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnweblogService.deleteComtnweblog(comtnweblogVO);
        status.setComplete();
        return "forward:/comtnweblog/ComtnweblogList.do";
    }

}
