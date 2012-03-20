package kr.godsoft.egovframe.generatorwebapp.comtndeptjob.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtndeptjob.service.ComtndeptjobService;
import kr.godsoft.egovframe.generatorwebapp.comtndeptjob.service.ComtndeptjobDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtndeptjob.service.ComtndeptjobVO;

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
 * @Class Name : ComtndeptjobController.java
 * @Description : Comtndeptjob Controller class
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
public class ComtndeptjobController {

    @Resource(name = "comtndeptjobService")
    private ComtndeptjobService comtndeptjobService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtndeptjob 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtndeptjobVO
	 * @return "/comtndeptjob/ComtndeptjobList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtndeptjob/ComtndeptjobList.do")
    public String selectComtndeptjobList(@ModelAttribute("searchVO") ComtndeptjobVO searchVO, 
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
		
        List<EgovMap> comtndeptjobList = comtndeptjobService.selectComtndeptjobList(searchVO);
        model.addAttribute("resultList", comtndeptjobList);
        
        int totCnt = comtndeptjobService.selectComtndeptjobListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtndeptjob/ComtndeptjobList";
    } 
    
    @RequestMapping("/comtndeptjob/addComtndeptjobView.do")
    public String addComtndeptjobView(
            @ModelAttribute("searchVO") ComtndeptjobDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtndeptjobVO", new ComtndeptjobVO());
        return "/comtndeptjob/ComtndeptjobRegister";
    }
    
    @RequestMapping("/comtndeptjob/addComtndeptjob.do")
    public String addComtndeptjob(
            ComtndeptjobVO comtndeptjobVO,
            @ModelAttribute("searchVO") ComtndeptjobDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtndeptjobService.insertComtndeptjob(comtndeptjobVO);
        status.setComplete();
        return "forward:/comtndeptjob/ComtndeptjobList.do";
    }
    
    @RequestMapping("/comtndeptjob/updateComtndeptjobView.do")
    public String updateComtndeptjobView(
            @RequestParam("deptJobId") String deptJobId ,
            @ModelAttribute("searchVO") ComtndeptjobDefaultVO searchVO, Model model)
            throws Exception {
        ComtndeptjobVO comtndeptjobVO = new ComtndeptjobVO();
        comtndeptjobVO.setDeptJobId(deptJobId);
;        
        // 변수명은 CoC 에 따라 comtndeptjobVO
        model.addAttribute(selectComtndeptjob(comtndeptjobVO, searchVO));
        return "/comtndeptjob/ComtndeptjobRegister";
    }

    @RequestMapping("/comtndeptjob/selectComtndeptjob.do")
    public @ModelAttribute("comtndeptjobVO")
    ComtndeptjobVO selectComtndeptjob(
            ComtndeptjobVO comtndeptjobVO,
            @ModelAttribute("searchVO") ComtndeptjobDefaultVO searchVO) throws Exception {
        return comtndeptjobService.selectComtndeptjob(comtndeptjobVO);
    }

    @RequestMapping("/comtndeptjob/updateComtndeptjob.do")
    public String updateComtndeptjob(
            ComtndeptjobVO comtndeptjobVO,
            @ModelAttribute("searchVO") ComtndeptjobDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtndeptjobService.updateComtndeptjob(comtndeptjobVO);
        status.setComplete();
        return "forward:/comtndeptjob/ComtndeptjobList.do";
    }
    
    @RequestMapping("/comtndeptjob/deleteComtndeptjob.do")
    public String deleteComtndeptjob(
            ComtndeptjobVO comtndeptjobVO,
            @ModelAttribute("searchVO") ComtndeptjobDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtndeptjobService.deleteComtndeptjob(comtndeptjobVO);
        status.setComplete();
        return "forward:/comtndeptjob/ComtndeptjobList.do";
    }

}
