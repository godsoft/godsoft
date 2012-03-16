package kr.godsoft.egovframe.generatorwebapp.comtncmmnty.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtncmmnty.service.ComtncmmntyService;
import kr.godsoft.egovframe.generatorwebapp.comtncmmnty.service.ComtncmmntyDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtncmmnty.service.ComtncmmntyVO;

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
 * @Class Name : ComtncmmntyController.java
 * @Description : Comtncmmnty Controller class
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
@SessionAttributes(types=ComtncmmntyVO.class)
public class ComtncmmntyController {

    @Resource(name = "comtncmmntyService")
    private ComtncmmntyService comtncmmntyService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtncmmnty 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtncmmntyVO
	 * @return "/comtncmmnty/ComtncmmntyList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtncmmnty/ComtncmmntyList.do")
    public String selectComtncmmntyList(@ModelAttribute("searchVO") ComtncmmntyVO searchVO, 
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
		
        List<EgovMap> comtncmmntyList = comtncmmntyService.selectComtncmmntyList(searchVO);
        model.addAttribute("resultList", comtncmmntyList);
        
        int totCnt = comtncmmntyService.selectComtncmmntyListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtncmmnty/ComtncmmntyList";
    } 
    
    @RequestMapping("/comtncmmnty/addComtncmmntyView.do")
    public String addComtncmmntyView(
            @ModelAttribute("searchVO") ComtncmmntyDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtncmmntyVO", new ComtncmmntyVO());
        return "/comtncmmnty/ComtncmmntyRegister";
    }
    
    @RequestMapping("/comtncmmnty/addComtncmmnty.do")
    public String addComtncmmnty(
            ComtncmmntyVO comtncmmntyVO,
            @ModelAttribute("searchVO") ComtncmmntyDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtncmmntyService.insertComtncmmnty(comtncmmntyVO);
        status.setComplete();
        return "forward:/comtncmmnty/ComtncmmntyList.do";
    }
    
    @RequestMapping("/comtncmmnty/updateComtncmmntyView.do")
    public String updateComtncmmntyView(
            @RequestParam("cmmntyId") String cmmntyId ,
            @ModelAttribute("searchVO") ComtncmmntyDefaultVO searchVO, Model model)
            throws Exception {
        ComtncmmntyVO comtncmmntyVO = new ComtncmmntyVO();
        comtncmmntyVO.setCmmntyId(cmmntyId);
;        
        // 변수명은 CoC 에 따라 comtncmmntyVO
        model.addAttribute(selectComtncmmnty(comtncmmntyVO, searchVO));
        return "/comtncmmnty/ComtncmmntyRegister";
    }

    @RequestMapping("/comtncmmnty/selectComtncmmnty.do")
    public @ModelAttribute("comtncmmntyVO")
    ComtncmmntyVO selectComtncmmnty(
            ComtncmmntyVO comtncmmntyVO,
            @ModelAttribute("searchVO") ComtncmmntyDefaultVO searchVO) throws Exception {
        return comtncmmntyService.selectComtncmmnty(comtncmmntyVO);
    }

    @RequestMapping("/comtncmmnty/updateComtncmmnty.do")
    public String updateComtncmmnty(
            ComtncmmntyVO comtncmmntyVO,
            @ModelAttribute("searchVO") ComtncmmntyDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtncmmntyService.updateComtncmmnty(comtncmmntyVO);
        status.setComplete();
        return "forward:/comtncmmnty/ComtncmmntyList.do";
    }
    
    @RequestMapping("/comtncmmnty/deleteComtncmmnty.do")
    public String deleteComtncmmnty(
            ComtncmmntyVO comtncmmntyVO,
            @ModelAttribute("searchVO") ComtncmmntyDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtncmmntyService.deleteComtncmmnty(comtncmmntyVO);
        status.setComplete();
        return "forward:/comtncmmnty/ComtncmmntyList.do";
    }

}
