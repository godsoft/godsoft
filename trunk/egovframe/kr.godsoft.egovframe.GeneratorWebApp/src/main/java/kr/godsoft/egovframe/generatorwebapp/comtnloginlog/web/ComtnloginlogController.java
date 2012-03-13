package kr.godsoft.egovframe.generatorwebapp.comtnloginlog.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtnloginlog.service.ComtnloginlogService;
import kr.godsoft.egovframe.generatorwebapp.comtnloginlog.service.ComtnloginlogDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnloginlog.service.ComtnloginlogVO;

/**
 * @Class Name : ComtnloginlogController.java
 * @Description : Comtnloginlog Controller class
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
@SessionAttributes(types=ComtnloginlogVO.class)
public class ComtnloginlogController {

    @Resource(name = "comtnloginlogService")
    private ComtnloginlogService comtnloginlogService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnloginlog 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnloginlogDefaultVO
	 * @return "/comtnloginlog/ComtnloginlogList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnloginlog/ComtnloginlogList.do")
    public String selectComtnloginlogList(@ModelAttribute("searchVO") ComtnloginlogDefaultVO searchVO, 
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
		
        List comtnloginlogList = comtnloginlogService.selectComtnloginlogList(searchVO);
        model.addAttribute("resultList", comtnloginlogList);
        
        int totCnt = comtnloginlogService.selectComtnloginlogListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnloginlog/ComtnloginlogList";
    } 
    
    @RequestMapping("/comtnloginlog/addComtnloginlogView.do")
    public String addComtnloginlogView(
            @ModelAttribute("searchVO") ComtnloginlogDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnloginlogVO", new ComtnloginlogVO());
        return "/comtnloginlog/ComtnloginlogRegister";
    }
    
    @RequestMapping("/comtnloginlog/addComtnloginlog.do")
    public String addComtnloginlog(
            ComtnloginlogVO comtnloginlogVO,
            @ModelAttribute("searchVO") ComtnloginlogDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnloginlogService.insertComtnloginlog(comtnloginlogVO);
        status.setComplete();
        return "forward:/comtnloginlog/ComtnloginlogList.do";
    }
    
    @RequestMapping("/comtnloginlog/updateComtnloginlogView.do")
    public String updateComtnloginlogView(
            @RequestParam("logId") String logId ,
            @ModelAttribute("searchVO") ComtnloginlogDefaultVO searchVO, Model model)
            throws Exception {
        ComtnloginlogVO comtnloginlogVO = new ComtnloginlogVO();
        comtnloginlogVO.setLogId(logId);
;        
        // 변수명은 CoC 에 따라 comtnloginlogVO
        model.addAttribute(selectComtnloginlog(comtnloginlogVO, searchVO));
        return "/comtnloginlog/ComtnloginlogRegister";
    }

    @RequestMapping("/comtnloginlog/selectComtnloginlog.do")
    public @ModelAttribute("comtnloginlogVO")
    ComtnloginlogVO selectComtnloginlog(
            ComtnloginlogVO comtnloginlogVO,
            @ModelAttribute("searchVO") ComtnloginlogDefaultVO searchVO) throws Exception {
        return comtnloginlogService.selectComtnloginlog(comtnloginlogVO);
    }

    @RequestMapping("/comtnloginlog/updateComtnloginlog.do")
    public String updateComtnloginlog(
            ComtnloginlogVO comtnloginlogVO,
            @ModelAttribute("searchVO") ComtnloginlogDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnloginlogService.updateComtnloginlog(comtnloginlogVO);
        status.setComplete();
        return "forward:/comtnloginlog/ComtnloginlogList.do";
    }
    
    @RequestMapping("/comtnloginlog/deleteComtnloginlog.do")
    public String deleteComtnloginlog(
            ComtnloginlogVO comtnloginlogVO,
            @ModelAttribute("searchVO") ComtnloginlogDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnloginlogService.deleteComtnloginlog(comtnloginlogVO);
        status.setComplete();
        return "forward:/comtnloginlog/ComtnloginlogList.do";
    }

}
