package kr.godsoft.egovframe.generatorwebapp.comtnclub.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnclub.service.ComtnclubService;
import kr.godsoft.egovframe.generatorwebapp.comtnclub.service.ComtnclubDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnclub.service.ComtnclubVO;

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
 * @Class Name : ComtnclubController.java
 * @Description : Comtnclub Controller class
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
@SessionAttributes(types=ComtnclubVO.class)
public class ComtnclubController {

    @Resource(name = "comtnclubService")
    private ComtnclubService comtnclubService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnclub 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnclubVO
	 * @return "/comtnclub/ComtnclubList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnclub/ComtnclubList.do")
    public String selectComtnclubList(@ModelAttribute("searchVO") ComtnclubVO searchVO, 
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
		
        List<EgovMap> comtnclubList = comtnclubService.selectComtnclubList(searchVO);
        model.addAttribute("resultList", comtnclubList);
        
        int totCnt = comtnclubService.selectComtnclubListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnclub/ComtnclubList";
    } 
    
    @RequestMapping("/comtnclub/addComtnclubView.do")
    public String addComtnclubView(
            @ModelAttribute("searchVO") ComtnclubDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnclubVO", new ComtnclubVO());
        return "/comtnclub/ComtnclubRegister";
    }
    
    @RequestMapping("/comtnclub/addComtnclub.do")
    public String addComtnclub(
            ComtnclubVO comtnclubVO,
            @ModelAttribute("searchVO") ComtnclubDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnclubService.insertComtnclub(comtnclubVO);
        status.setComplete();
        return "forward:/comtnclub/ComtnclubList.do";
    }
    
    @RequestMapping("/comtnclub/updateComtnclubView.do")
    public String updateComtnclubView(
            @RequestParam("clbId") String clbId ,
            @RequestParam("cmmntyId") String cmmntyId ,
            @ModelAttribute("searchVO") ComtnclubDefaultVO searchVO, Model model)
            throws Exception {
        ComtnclubVO comtnclubVO = new ComtnclubVO();
        comtnclubVO.setClbId(clbId);
        comtnclubVO.setCmmntyId(cmmntyId);
;        
        // 변수명은 CoC 에 따라 comtnclubVO
        model.addAttribute(selectComtnclub(comtnclubVO, searchVO));
        return "/comtnclub/ComtnclubRegister";
    }

    @RequestMapping("/comtnclub/selectComtnclub.do")
    public @ModelAttribute("comtnclubVO")
    ComtnclubVO selectComtnclub(
            ComtnclubVO comtnclubVO,
            @ModelAttribute("searchVO") ComtnclubDefaultVO searchVO) throws Exception {
        return comtnclubService.selectComtnclub(comtnclubVO);
    }

    @RequestMapping("/comtnclub/updateComtnclub.do")
    public String updateComtnclub(
            ComtnclubVO comtnclubVO,
            @ModelAttribute("searchVO") ComtnclubDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnclubService.updateComtnclub(comtnclubVO);
        status.setComplete();
        return "forward:/comtnclub/ComtnclubList.do";
    }
    
    @RequestMapping("/comtnclub/deleteComtnclub.do")
    public String deleteComtnclub(
            ComtnclubVO comtnclubVO,
            @ModelAttribute("searchVO") ComtnclubDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnclubService.deleteComtnclub(comtnclubVO);
        status.setComplete();
        return "forward:/comtnclub/ComtnclubList.do";
    }

}
