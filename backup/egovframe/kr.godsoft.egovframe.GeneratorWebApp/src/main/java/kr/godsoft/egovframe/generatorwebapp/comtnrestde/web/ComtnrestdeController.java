package kr.godsoft.egovframe.generatorwebapp.comtnrestde.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnrestde.service.ComtnrestdeService;
import kr.godsoft.egovframe.generatorwebapp.comtnrestde.service.ComtnrestdeDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnrestde.service.ComtnrestdeVO;

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
 * @Class Name : ComtnrestdeController.java
 * @Description : Comtnrestde Controller class
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
public class ComtnrestdeController {

    @Resource(name = "comtnrestdeService")
    private ComtnrestdeService comtnrestdeService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNRESTDE 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnrestdeVO
	 * @return "/comtnrestde/ComtnrestdeList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnrestde/ComtnrestdeList.do")
    public String selectComtnrestdeList(@ModelAttribute("searchVO") ComtnrestdeVO searchVO, 
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
		
        List<EgovMap> comtnrestdeList = comtnrestdeService.selectComtnrestdeList(searchVO);
        model.addAttribute("resultList", comtnrestdeList);
        
        int totCnt = comtnrestdeService.selectComtnrestdeListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnrestde/ComtnrestdeList";
    } 
    
    @RequestMapping("/comtnrestde/addComtnrestdeView.do")
    public String addComtnrestdeView(
            @ModelAttribute("searchVO") ComtnrestdeDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnrestdeVO", new ComtnrestdeVO());
        return "/comtnrestde/ComtnrestdeRegister";
    }
    
    @RequestMapping("/comtnrestde/addComtnrestde.do")
    public String addComtnrestde(
            ComtnrestdeVO comtnrestdeVO,
            @ModelAttribute("searchVO") ComtnrestdeDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnrestdeService.insertComtnrestde(comtnrestdeVO);
        status.setComplete();
        return "forward:/comtnrestde/ComtnrestdeList.do";
    }
    
    @RequestMapping("/comtnrestde/updateComtnrestdeView.do")
    public String updateComtnrestdeView(
            @RequestParam("restdeNo") String restdeNo ,
            @ModelAttribute("searchVO") ComtnrestdeDefaultVO searchVO, Model model)
            throws Exception {
        ComtnrestdeVO comtnrestdeVO = new ComtnrestdeVO();
        comtnrestdeVO.setRestdeNo(restdeNo);
;        
        // 변수명은 CoC 에 따라 comtnrestdeVO
        model.addAttribute(selectComtnrestde(comtnrestdeVO, searchVO));
        return "/comtnrestde/ComtnrestdeRegister";
    }

    @RequestMapping("/comtnrestde/selectComtnrestde.do")
    public @ModelAttribute("comtnrestdeVO")
    ComtnrestdeVO selectComtnrestde(
            ComtnrestdeVO comtnrestdeVO,
            @ModelAttribute("searchVO") ComtnrestdeDefaultVO searchVO) throws Exception {
        return comtnrestdeService.selectComtnrestde(comtnrestdeVO);
    }

    @RequestMapping("/comtnrestde/updateComtnrestde.do")
    public String updateComtnrestde(
            ComtnrestdeVO comtnrestdeVO,
            @ModelAttribute("searchVO") ComtnrestdeDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnrestdeService.updateComtnrestde(comtnrestdeVO);
        status.setComplete();
        return "forward:/comtnrestde/ComtnrestdeList.do";
    }
    
    @RequestMapping("/comtnrestde/deleteComtnrestde.do")
    public String deleteComtnrestde(
            ComtnrestdeVO comtnrestdeVO,
            @ModelAttribute("searchVO") ComtnrestdeDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnrestdeService.deleteComtnrestde(comtnrestdeVO);
        status.setComplete();
        return "forward:/comtnrestde/ComtnrestdeList.do";
    }

}
