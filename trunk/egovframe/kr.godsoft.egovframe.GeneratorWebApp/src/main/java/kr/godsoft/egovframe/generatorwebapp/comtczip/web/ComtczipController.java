package kr.godsoft.egovframe.generatorwebapp.comtczip.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtczip.service.ComtczipService;
import kr.godsoft.egovframe.generatorwebapp.comtczip.service.ComtczipDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtczip.service.ComtczipVO;

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
 * @Class Name : ComtczipController.java
 * @Description : Comtczip Controller class
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
@SessionAttributes(types=ComtczipVO.class)
public class ComtczipController {

    @Resource(name = "comtczipService")
    private ComtczipService comtczipService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtczip 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtczipVO
	 * @return "/comtczip/ComtczipList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtczip/ComtczipList.do")
    public String selectComtczipList(@ModelAttribute("searchVO") ComtczipVO searchVO, 
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
		
        List<EgovMap> comtczipList = comtczipService.selectComtczipList(searchVO);
        model.addAttribute("resultList", comtczipList);
        
        int totCnt = comtczipService.selectComtczipListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtczip/ComtczipList";
    } 
    
    @RequestMapping("/comtczip/addComtczipView.do")
    public String addComtczipView(
            @ModelAttribute("searchVO") ComtczipDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtczipVO", new ComtczipVO());
        return "/comtczip/ComtczipRegister";
    }
    
    @RequestMapping("/comtczip/addComtczip.do")
    public String addComtczip(
            ComtczipVO comtczipVO,
            @ModelAttribute("searchVO") ComtczipDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtczipService.insertComtczip(comtczipVO);
        status.setComplete();
        return "forward:/comtczip/ComtczipList.do";
    }
    
    @RequestMapping("/comtczip/updateComtczipView.do")
    public String updateComtczipView(
            @RequestParam("zip") String zip ,
            @RequestParam("sn") int sn ,
            @ModelAttribute("searchVO") ComtczipDefaultVO searchVO, Model model)
            throws Exception {
        ComtczipVO comtczipVO = new ComtczipVO();
        comtczipVO.setZip(zip);
        comtczipVO.setSn(sn);
;        
        // 변수명은 CoC 에 따라 comtczipVO
        model.addAttribute(selectComtczip(comtczipVO, searchVO));
        return "/comtczip/ComtczipRegister";
    }

    @RequestMapping("/comtczip/selectComtczip.do")
    public @ModelAttribute("comtczipVO")
    ComtczipVO selectComtczip(
            ComtczipVO comtczipVO,
            @ModelAttribute("searchVO") ComtczipDefaultVO searchVO) throws Exception {
        return comtczipService.selectComtczip(comtczipVO);
    }

    @RequestMapping("/comtczip/updateComtczip.do")
    public String updateComtczip(
            ComtczipVO comtczipVO,
            @ModelAttribute("searchVO") ComtczipDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtczipService.updateComtczip(comtczipVO);
        status.setComplete();
        return "forward:/comtczip/ComtczipList.do";
    }
    
    @RequestMapping("/comtczip/deleteComtczip.do")
    public String deleteComtczip(
            ComtczipVO comtczipVO,
            @ModelAttribute("searchVO") ComtczipDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtczipService.deleteComtczip(comtczipVO);
        status.setComplete();
        return "forward:/comtczip/ComtczipList.do";
    }

}
