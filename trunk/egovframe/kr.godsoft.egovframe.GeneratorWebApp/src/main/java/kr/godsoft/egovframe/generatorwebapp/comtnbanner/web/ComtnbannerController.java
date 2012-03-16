package kr.godsoft.egovframe.generatorwebapp.comtnbanner.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnbanner.service.ComtnbannerService;
import kr.godsoft.egovframe.generatorwebapp.comtnbanner.service.ComtnbannerDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbanner.service.ComtnbannerVO;

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
 * @Class Name : ComtnbannerController.java
 * @Description : Comtnbanner Controller class
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
@SessionAttributes(types=ComtnbannerVO.class)
public class ComtnbannerController {

    @Resource(name = "comtnbannerService")
    private ComtnbannerService comtnbannerService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnbanner 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnbannerVO
	 * @return "/comtnbanner/ComtnbannerList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnbanner/ComtnbannerList.do")
    public String selectComtnbannerList(@ModelAttribute("searchVO") ComtnbannerVO searchVO, 
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
		
        List<EgovMap> comtnbannerList = comtnbannerService.selectComtnbannerList(searchVO);
        model.addAttribute("resultList", comtnbannerList);
        
        int totCnt = comtnbannerService.selectComtnbannerListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnbanner/ComtnbannerList";
    } 
    
    @RequestMapping("/comtnbanner/addComtnbannerView.do")
    public String addComtnbannerView(
            @ModelAttribute("searchVO") ComtnbannerDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnbannerVO", new ComtnbannerVO());
        return "/comtnbanner/ComtnbannerRegister";
    }
    
    @RequestMapping("/comtnbanner/addComtnbanner.do")
    public String addComtnbanner(
            ComtnbannerVO comtnbannerVO,
            @ModelAttribute("searchVO") ComtnbannerDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbannerService.insertComtnbanner(comtnbannerVO);
        status.setComplete();
        return "forward:/comtnbanner/ComtnbannerList.do";
    }
    
    @RequestMapping("/comtnbanner/updateComtnbannerView.do")
    public String updateComtnbannerView(
            @RequestParam("bannerId") String bannerId ,
            @ModelAttribute("searchVO") ComtnbannerDefaultVO searchVO, Model model)
            throws Exception {
        ComtnbannerVO comtnbannerVO = new ComtnbannerVO();
        comtnbannerVO.setBannerId(bannerId);
;        
        // 변수명은 CoC 에 따라 comtnbannerVO
        model.addAttribute(selectComtnbanner(comtnbannerVO, searchVO));
        return "/comtnbanner/ComtnbannerRegister";
    }

    @RequestMapping("/comtnbanner/selectComtnbanner.do")
    public @ModelAttribute("comtnbannerVO")
    ComtnbannerVO selectComtnbanner(
            ComtnbannerVO comtnbannerVO,
            @ModelAttribute("searchVO") ComtnbannerDefaultVO searchVO) throws Exception {
        return comtnbannerService.selectComtnbanner(comtnbannerVO);
    }

    @RequestMapping("/comtnbanner/updateComtnbanner.do")
    public String updateComtnbanner(
            ComtnbannerVO comtnbannerVO,
            @ModelAttribute("searchVO") ComtnbannerDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbannerService.updateComtnbanner(comtnbannerVO);
        status.setComplete();
        return "forward:/comtnbanner/ComtnbannerList.do";
    }
    
    @RequestMapping("/comtnbanner/deleteComtnbanner.do")
    public String deleteComtnbanner(
            ComtnbannerVO comtnbannerVO,
            @ModelAttribute("searchVO") ComtnbannerDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbannerService.deleteComtnbanner(comtnbannerVO);
        status.setComplete();
        return "forward:/comtnbanner/ComtnbannerList.do";
    }

}
