package kr.godsoft.egovframe.generatorwebapp.comtnmtgplaceresve.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnmtgplaceresve.service.ComtnmtgplaceresveService;
import kr.godsoft.egovframe.generatorwebapp.comtnmtgplaceresve.service.ComtnmtgplaceresveDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnmtgplaceresve.service.ComtnmtgplaceresveVO;

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
 * @Class Name : ComtnmtgplaceresveController.java
 * @Description : Comtnmtgplaceresve Controller class
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
@SessionAttributes(types=ComtnmtgplaceresveVO.class)
public class ComtnmtgplaceresveController {

    @Resource(name = "comtnmtgplaceresveService")
    private ComtnmtgplaceresveService comtnmtgplaceresveService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnmtgplaceresve 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnmtgplaceresveVO
	 * @return "/comtnmtgplaceresve/ComtnmtgplaceresveList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnmtgplaceresve/ComtnmtgplaceresveList.do")
    public String selectComtnmtgplaceresveList(@ModelAttribute("searchVO") ComtnmtgplaceresveVO searchVO, 
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
		
        List<EgovMap> comtnmtgplaceresveList = comtnmtgplaceresveService.selectComtnmtgplaceresveList(searchVO);
        model.addAttribute("resultList", comtnmtgplaceresveList);
        
        int totCnt = comtnmtgplaceresveService.selectComtnmtgplaceresveListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnmtgplaceresve/ComtnmtgplaceresveList";
    } 
    
    @RequestMapping("/comtnmtgplaceresve/addComtnmtgplaceresveView.do")
    public String addComtnmtgplaceresveView(
            @ModelAttribute("searchVO") ComtnmtgplaceresveDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnmtgplaceresveVO", new ComtnmtgplaceresveVO());
        return "/comtnmtgplaceresve/ComtnmtgplaceresveRegister";
    }
    
    @RequestMapping("/comtnmtgplaceresve/addComtnmtgplaceresve.do")
    public String addComtnmtgplaceresve(
            ComtnmtgplaceresveVO comtnmtgplaceresveVO,
            @ModelAttribute("searchVO") ComtnmtgplaceresveDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnmtgplaceresveService.insertComtnmtgplaceresve(comtnmtgplaceresveVO);
        status.setComplete();
        return "forward:/comtnmtgplaceresve/ComtnmtgplaceresveList.do";
    }
    
    @RequestMapping("/comtnmtgplaceresve/updateComtnmtgplaceresveView.do")
    public String updateComtnmtgplaceresveView(
            @RequestParam("resveId") String resveId ,
            @ModelAttribute("searchVO") ComtnmtgplaceresveDefaultVO searchVO, Model model)
            throws Exception {
        ComtnmtgplaceresveVO comtnmtgplaceresveVO = new ComtnmtgplaceresveVO();
        comtnmtgplaceresveVO.setResveId(resveId);
;        
        // 변수명은 CoC 에 따라 comtnmtgplaceresveVO
        model.addAttribute(selectComtnmtgplaceresve(comtnmtgplaceresveVO, searchVO));
        return "/comtnmtgplaceresve/ComtnmtgplaceresveRegister";
    }

    @RequestMapping("/comtnmtgplaceresve/selectComtnmtgplaceresve.do")
    public @ModelAttribute("comtnmtgplaceresveVO")
    ComtnmtgplaceresveVO selectComtnmtgplaceresve(
            ComtnmtgplaceresveVO comtnmtgplaceresveVO,
            @ModelAttribute("searchVO") ComtnmtgplaceresveDefaultVO searchVO) throws Exception {
        return comtnmtgplaceresveService.selectComtnmtgplaceresve(comtnmtgplaceresveVO);
    }

    @RequestMapping("/comtnmtgplaceresve/updateComtnmtgplaceresve.do")
    public String updateComtnmtgplaceresve(
            ComtnmtgplaceresveVO comtnmtgplaceresveVO,
            @ModelAttribute("searchVO") ComtnmtgplaceresveDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnmtgplaceresveService.updateComtnmtgplaceresve(comtnmtgplaceresveVO);
        status.setComplete();
        return "forward:/comtnmtgplaceresve/ComtnmtgplaceresveList.do";
    }
    
    @RequestMapping("/comtnmtgplaceresve/deleteComtnmtgplaceresve.do")
    public String deleteComtnmtgplaceresve(
            ComtnmtgplaceresveVO comtnmtgplaceresveVO,
            @ModelAttribute("searchVO") ComtnmtgplaceresveDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnmtgplaceresveService.deleteComtnmtgplaceresve(comtnmtgplaceresveVO);
        status.setComplete();
        return "forward:/comtnmtgplaceresve/ComtnmtgplaceresveList.do";
    }

}
