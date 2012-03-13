package kr.godsoft.egovframe.generatorwebapp.comtnvcatnmanage.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtnvcatnmanage.service.ComtnvcatnmanageService;
import kr.godsoft.egovframe.generatorwebapp.comtnvcatnmanage.service.ComtnvcatnmanageDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnvcatnmanage.service.ComtnvcatnmanageVO;

/**
 * @Class Name : ComtnvcatnmanageController.java
 * @Description : Comtnvcatnmanage Controller class
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
@SessionAttributes(types=ComtnvcatnmanageVO.class)
public class ComtnvcatnmanageController {

    @Resource(name = "comtnvcatnmanageService")
    private ComtnvcatnmanageService comtnvcatnmanageService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnvcatnmanage 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnvcatnmanageDefaultVO
	 * @return "/comtnvcatnmanage/ComtnvcatnmanageList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnvcatnmanage/ComtnvcatnmanageList.do")
    public String selectComtnvcatnmanageList(@ModelAttribute("searchVO") ComtnvcatnmanageDefaultVO searchVO, 
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
		
        List comtnvcatnmanageList = comtnvcatnmanageService.selectComtnvcatnmanageList(searchVO);
        model.addAttribute("resultList", comtnvcatnmanageList);
        
        int totCnt = comtnvcatnmanageService.selectComtnvcatnmanageListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnvcatnmanage/ComtnvcatnmanageList";
    } 
    
    @RequestMapping("/comtnvcatnmanage/addComtnvcatnmanageView.do")
    public String addComtnvcatnmanageView(
            @ModelAttribute("searchVO") ComtnvcatnmanageDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnvcatnmanageVO", new ComtnvcatnmanageVO());
        return "/comtnvcatnmanage/ComtnvcatnmanageRegister";
    }
    
    @RequestMapping("/comtnvcatnmanage/addComtnvcatnmanage.do")
    public String addComtnvcatnmanage(
            ComtnvcatnmanageVO comtnvcatnmanageVO,
            @ModelAttribute("searchVO") ComtnvcatnmanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnvcatnmanageService.insertComtnvcatnmanage(comtnvcatnmanageVO);
        status.setComplete();
        return "forward:/comtnvcatnmanage/ComtnvcatnmanageList.do";
    }
    
    @RequestMapping("/comtnvcatnmanage/updateComtnvcatnmanageView.do")
    public String updateComtnvcatnmanageView(
            @RequestParam("applcntId") String applcntId ,
            @RequestParam("vcatnSe") String vcatnSe ,
            @RequestParam("bgnde") String bgnde ,
            @RequestParam("endde") String endde ,
            @ModelAttribute("searchVO") ComtnvcatnmanageDefaultVO searchVO, Model model)
            throws Exception {
        ComtnvcatnmanageVO comtnvcatnmanageVO = new ComtnvcatnmanageVO();
        comtnvcatnmanageVO.setApplcntId(applcntId);
        comtnvcatnmanageVO.setVcatnSe(vcatnSe);
        comtnvcatnmanageVO.setBgnde(bgnde);
        comtnvcatnmanageVO.setEndde(endde);
;        
        // 변수명은 CoC 에 따라 comtnvcatnmanageVO
        model.addAttribute(selectComtnvcatnmanage(comtnvcatnmanageVO, searchVO));
        return "/comtnvcatnmanage/ComtnvcatnmanageRegister";
    }

    @RequestMapping("/comtnvcatnmanage/selectComtnvcatnmanage.do")
    public @ModelAttribute("comtnvcatnmanageVO")
    ComtnvcatnmanageVO selectComtnvcatnmanage(
            ComtnvcatnmanageVO comtnvcatnmanageVO,
            @ModelAttribute("searchVO") ComtnvcatnmanageDefaultVO searchVO) throws Exception {
        return comtnvcatnmanageService.selectComtnvcatnmanage(comtnvcatnmanageVO);
    }

    @RequestMapping("/comtnvcatnmanage/updateComtnvcatnmanage.do")
    public String updateComtnvcatnmanage(
            ComtnvcatnmanageVO comtnvcatnmanageVO,
            @ModelAttribute("searchVO") ComtnvcatnmanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnvcatnmanageService.updateComtnvcatnmanage(comtnvcatnmanageVO);
        status.setComplete();
        return "forward:/comtnvcatnmanage/ComtnvcatnmanageList.do";
    }
    
    @RequestMapping("/comtnvcatnmanage/deleteComtnvcatnmanage.do")
    public String deleteComtnvcatnmanage(
            ComtnvcatnmanageVO comtnvcatnmanageVO,
            @ModelAttribute("searchVO") ComtnvcatnmanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnvcatnmanageService.deleteComtnvcatnmanage(comtnvcatnmanageVO);
        status.setComplete();
        return "forward:/comtnvcatnmanage/ComtnvcatnmanageList.do";
    }

}
