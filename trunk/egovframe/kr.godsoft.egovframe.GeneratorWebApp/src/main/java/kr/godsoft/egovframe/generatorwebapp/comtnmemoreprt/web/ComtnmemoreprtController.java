package kr.godsoft.egovframe.generatorwebapp.comtnmemoreprt.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnmemoreprt.service.ComtnmemoreprtService;
import kr.godsoft.egovframe.generatorwebapp.comtnmemoreprt.service.ComtnmemoreprtDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnmemoreprt.service.ComtnmemoreprtVO;

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
 * @Class Name : ComtnmemoreprtController.java
 * @Description : Comtnmemoreprt Controller class
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
@SessionAttributes(types=ComtnmemoreprtVO.class)
public class ComtnmemoreprtController {

    @Resource(name = "comtnmemoreprtService")
    private ComtnmemoreprtService comtnmemoreprtService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnmemoreprt 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnmemoreprtVO
	 * @return "/comtnmemoreprt/ComtnmemoreprtList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnmemoreprt/ComtnmemoreprtList.do")
    public String selectComtnmemoreprtList(@ModelAttribute("searchVO") ComtnmemoreprtVO searchVO, 
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
		
        List<EgovMap> comtnmemoreprtList = comtnmemoreprtService.selectComtnmemoreprtList(searchVO);
        model.addAttribute("resultList", comtnmemoreprtList);
        
        int totCnt = comtnmemoreprtService.selectComtnmemoreprtListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnmemoreprt/ComtnmemoreprtList";
    } 
    
    @RequestMapping("/comtnmemoreprt/addComtnmemoreprtView.do")
    public String addComtnmemoreprtView(
            @ModelAttribute("searchVO") ComtnmemoreprtDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnmemoreprtVO", new ComtnmemoreprtVO());
        return "/comtnmemoreprt/ComtnmemoreprtRegister";
    }
    
    @RequestMapping("/comtnmemoreprt/addComtnmemoreprt.do")
    public String addComtnmemoreprt(
            ComtnmemoreprtVO comtnmemoreprtVO,
            @ModelAttribute("searchVO") ComtnmemoreprtDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnmemoreprtService.insertComtnmemoreprt(comtnmemoreprtVO);
        status.setComplete();
        return "forward:/comtnmemoreprt/ComtnmemoreprtList.do";
    }
    
    @RequestMapping("/comtnmemoreprt/updateComtnmemoreprtView.do")
    public String updateComtnmemoreprtView(
            @RequestParam("reprtId") String reprtId ,
            @ModelAttribute("searchVO") ComtnmemoreprtDefaultVO searchVO, Model model)
            throws Exception {
        ComtnmemoreprtVO comtnmemoreprtVO = new ComtnmemoreprtVO();
        comtnmemoreprtVO.setReprtId(reprtId);
;        
        // 변수명은 CoC 에 따라 comtnmemoreprtVO
        model.addAttribute(selectComtnmemoreprt(comtnmemoreprtVO, searchVO));
        return "/comtnmemoreprt/ComtnmemoreprtRegister";
    }

    @RequestMapping("/comtnmemoreprt/selectComtnmemoreprt.do")
    public @ModelAttribute("comtnmemoreprtVO")
    ComtnmemoreprtVO selectComtnmemoreprt(
            ComtnmemoreprtVO comtnmemoreprtVO,
            @ModelAttribute("searchVO") ComtnmemoreprtDefaultVO searchVO) throws Exception {
        return comtnmemoreprtService.selectComtnmemoreprt(comtnmemoreprtVO);
    }

    @RequestMapping("/comtnmemoreprt/updateComtnmemoreprt.do")
    public String updateComtnmemoreprt(
            ComtnmemoreprtVO comtnmemoreprtVO,
            @ModelAttribute("searchVO") ComtnmemoreprtDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnmemoreprtService.updateComtnmemoreprt(comtnmemoreprtVO);
        status.setComplete();
        return "forward:/comtnmemoreprt/ComtnmemoreprtList.do";
    }
    
    @RequestMapping("/comtnmemoreprt/deleteComtnmemoreprt.do")
    public String deleteComtnmemoreprt(
            ComtnmemoreprtVO comtnmemoreprtVO,
            @ModelAttribute("searchVO") ComtnmemoreprtDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnmemoreprtService.deleteComtnmemoreprt(comtnmemoreprtVO);
        status.setComplete();
        return "forward:/comtnmemoreprt/ComtnmemoreprtList.do";
    }

}
