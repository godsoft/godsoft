package kr.godsoft.egovframe.generatorwebapp.comtnstsfdg.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnstsfdg.service.ComtnstsfdgService;
import kr.godsoft.egovframe.generatorwebapp.comtnstsfdg.service.ComtnstsfdgDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnstsfdg.service.ComtnstsfdgVO;

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
 * @Class Name : ComtnstsfdgController.java
 * @Description : Comtnstsfdg Controller class
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
public class ComtnstsfdgController {

    @Resource(name = "comtnstsfdgService")
    private ComtnstsfdgService comtnstsfdgService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNSTSFDG 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnstsfdgVO
	 * @return "/comtnstsfdg/ComtnstsfdgList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnstsfdg/ComtnstsfdgList.do")
    public String selectComtnstsfdgList(@ModelAttribute("searchVO") ComtnstsfdgVO searchVO, 
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
		
        List<EgovMap> comtnstsfdgList = comtnstsfdgService.selectComtnstsfdgList(searchVO);
        model.addAttribute("resultList", comtnstsfdgList);
        
        int totCnt = comtnstsfdgService.selectComtnstsfdgListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnstsfdg/ComtnstsfdgList";
    } 
    
    @RequestMapping("/comtnstsfdg/addComtnstsfdgView.do")
    public String addComtnstsfdgView(
            @ModelAttribute("searchVO") ComtnstsfdgDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnstsfdgVO", new ComtnstsfdgVO());
        return "/comtnstsfdg/ComtnstsfdgRegister";
    }
    
    @RequestMapping("/comtnstsfdg/addComtnstsfdg.do")
    public String addComtnstsfdg(
            ComtnstsfdgVO comtnstsfdgVO,
            @ModelAttribute("searchVO") ComtnstsfdgDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnstsfdgService.insertComtnstsfdg(comtnstsfdgVO);
        status.setComplete();
        return "forward:/comtnstsfdg/ComtnstsfdgList.do";
    }
    
    @RequestMapping("/comtnstsfdg/updateComtnstsfdgView.do")
    public String updateComtnstsfdgView(
            @RequestParam("stsfdgNo") String stsfdgNo ,
            @ModelAttribute("searchVO") ComtnstsfdgDefaultVO searchVO, Model model)
            throws Exception {
        ComtnstsfdgVO comtnstsfdgVO = new ComtnstsfdgVO();
        comtnstsfdgVO.setStsfdgNo(stsfdgNo);
;        
        // 변수명은 CoC 에 따라 comtnstsfdgVO
        model.addAttribute(selectComtnstsfdg(comtnstsfdgVO, searchVO));
        return "/comtnstsfdg/ComtnstsfdgRegister";
    }

    @RequestMapping("/comtnstsfdg/selectComtnstsfdg.do")
    public @ModelAttribute("comtnstsfdgVO")
    ComtnstsfdgVO selectComtnstsfdg(
            ComtnstsfdgVO comtnstsfdgVO,
            @ModelAttribute("searchVO") ComtnstsfdgDefaultVO searchVO) throws Exception {
        return comtnstsfdgService.selectComtnstsfdg(comtnstsfdgVO);
    }

    @RequestMapping("/comtnstsfdg/updateComtnstsfdg.do")
    public String updateComtnstsfdg(
            ComtnstsfdgVO comtnstsfdgVO,
            @ModelAttribute("searchVO") ComtnstsfdgDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnstsfdgService.updateComtnstsfdg(comtnstsfdgVO);
        status.setComplete();
        return "forward:/comtnstsfdg/ComtnstsfdgList.do";
    }
    
    @RequestMapping("/comtnstsfdg/deleteComtnstsfdg.do")
    public String deleteComtnstsfdg(
            ComtnstsfdgVO comtnstsfdgVO,
            @ModelAttribute("searchVO") ComtnstsfdgDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnstsfdgService.deleteComtnstsfdg(comtnstsfdgVO);
        status.setComplete();
        return "forward:/comtnstsfdg/ComtnstsfdgList.do";
    }

}
