package kr.godsoft.egovframe.generatorwebapp.comtnworddicaryinfo.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnworddicaryinfo.service.ComtnworddicaryinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnworddicaryinfo.service.ComtnworddicaryinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnworddicaryinfo.service.ComtnworddicaryinfoVO;

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
 * @Class Name : ComtnworddicaryinfoController.java
 * @Description : Comtnworddicaryinfo Controller class
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
public class ComtnworddicaryinfoController {

    @Resource(name = "comtnworddicaryinfoService")
    private ComtnworddicaryinfoService comtnworddicaryinfoService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnworddicaryinfo 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnworddicaryinfoVO
	 * @return "/comtnworddicaryinfo/ComtnworddicaryinfoList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnworddicaryinfo/ComtnworddicaryinfoList.do")
    public String selectComtnworddicaryinfoList(@ModelAttribute("searchVO") ComtnworddicaryinfoVO searchVO, 
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
		
        List<EgovMap> comtnworddicaryinfoList = comtnworddicaryinfoService.selectComtnworddicaryinfoList(searchVO);
        model.addAttribute("resultList", comtnworddicaryinfoList);
        
        int totCnt = comtnworddicaryinfoService.selectComtnworddicaryinfoListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnworddicaryinfo/ComtnworddicaryinfoList";
    } 
    
    @RequestMapping("/comtnworddicaryinfo/addComtnworddicaryinfoView.do")
    public String addComtnworddicaryinfoView(
            @ModelAttribute("searchVO") ComtnworddicaryinfoDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnworddicaryinfoVO", new ComtnworddicaryinfoVO());
        return "/comtnworddicaryinfo/ComtnworddicaryinfoRegister";
    }
    
    @RequestMapping("/comtnworddicaryinfo/addComtnworddicaryinfo.do")
    public String addComtnworddicaryinfo(
            ComtnworddicaryinfoVO comtnworddicaryinfoVO,
            @ModelAttribute("searchVO") ComtnworddicaryinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnworddicaryinfoService.insertComtnworddicaryinfo(comtnworddicaryinfoVO);
        status.setComplete();
        return "forward:/comtnworddicaryinfo/ComtnworddicaryinfoList.do";
    }
    
    @RequestMapping("/comtnworddicaryinfo/updateComtnworddicaryinfoView.do")
    public String updateComtnworddicaryinfoView(
            @RequestParam("wordId") String wordId ,
            @ModelAttribute("searchVO") ComtnworddicaryinfoDefaultVO searchVO, Model model)
            throws Exception {
        ComtnworddicaryinfoVO comtnworddicaryinfoVO = new ComtnworddicaryinfoVO();
        comtnworddicaryinfoVO.setWordId(wordId);
;        
        // 변수명은 CoC 에 따라 comtnworddicaryinfoVO
        model.addAttribute(selectComtnworddicaryinfo(comtnworddicaryinfoVO, searchVO));
        return "/comtnworddicaryinfo/ComtnworddicaryinfoRegister";
    }

    @RequestMapping("/comtnworddicaryinfo/selectComtnworddicaryinfo.do")
    public @ModelAttribute("comtnworddicaryinfoVO")
    ComtnworddicaryinfoVO selectComtnworddicaryinfo(
            ComtnworddicaryinfoVO comtnworddicaryinfoVO,
            @ModelAttribute("searchVO") ComtnworddicaryinfoDefaultVO searchVO) throws Exception {
        return comtnworddicaryinfoService.selectComtnworddicaryinfo(comtnworddicaryinfoVO);
    }

    @RequestMapping("/comtnworddicaryinfo/updateComtnworddicaryinfo.do")
    public String updateComtnworddicaryinfo(
            ComtnworddicaryinfoVO comtnworddicaryinfoVO,
            @ModelAttribute("searchVO") ComtnworddicaryinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnworddicaryinfoService.updateComtnworddicaryinfo(comtnworddicaryinfoVO);
        status.setComplete();
        return "forward:/comtnworddicaryinfo/ComtnworddicaryinfoList.do";
    }
    
    @RequestMapping("/comtnworddicaryinfo/deleteComtnworddicaryinfo.do")
    public String deleteComtnworddicaryinfo(
            ComtnworddicaryinfoVO comtnworddicaryinfoVO,
            @ModelAttribute("searchVO") ComtnworddicaryinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnworddicaryinfoService.deleteComtnworddicaryinfo(comtnworddicaryinfoVO);
        status.setComplete();
        return "forward:/comtnworddicaryinfo/ComtnworddicaryinfoList.do";
    }

}
