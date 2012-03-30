package kr.godsoft.egovframe.generatorwebapp.comtngnrlmber.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtngnrlmber.service.ComtngnrlmberService;
import kr.godsoft.egovframe.generatorwebapp.comtngnrlmber.service.ComtngnrlmberDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtngnrlmber.service.ComtngnrlmberVO;

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
 * @Class Name : ComtngnrlmberController.java
 * @Description : Comtngnrlmber Controller class
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
public class ComtngnrlmberController {

    @Resource(name = "comtngnrlmberService")
    private ComtngnrlmberService comtngnrlmberService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNGNRLMBER 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtngnrlmberVO
	 * @return "/comtngnrlmber/ComtngnrlmberList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtngnrlmber/ComtngnrlmberList.do")
    public String selectComtngnrlmberList(@ModelAttribute("searchVO") ComtngnrlmberVO searchVO, 
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
		
        List<EgovMap> comtngnrlmberList = comtngnrlmberService.selectComtngnrlmberList(searchVO);
        model.addAttribute("resultList", comtngnrlmberList);
        
        int totCnt = comtngnrlmberService.selectComtngnrlmberListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtngnrlmber/ComtngnrlmberList";
    } 
    
    @RequestMapping("/comtngnrlmber/addComtngnrlmberView.do")
    public String addComtngnrlmberView(
            @ModelAttribute("searchVO") ComtngnrlmberDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtngnrlmberVO", new ComtngnrlmberVO());
        return "/comtngnrlmber/ComtngnrlmberRegister";
    }
    
    @RequestMapping("/comtngnrlmber/addComtngnrlmber.do")
    public String addComtngnrlmber(
            ComtngnrlmberVO comtngnrlmberVO,
            @ModelAttribute("searchVO") ComtngnrlmberDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtngnrlmberService.insertComtngnrlmber(comtngnrlmberVO);
        status.setComplete();
        return "forward:/comtngnrlmber/ComtngnrlmberList.do";
    }
    
    @RequestMapping("/comtngnrlmber/updateComtngnrlmberView.do")
    public String updateComtngnrlmberView(
            @RequestParam("mberId") String mberId ,
            @ModelAttribute("searchVO") ComtngnrlmberDefaultVO searchVO, Model model)
            throws Exception {
        ComtngnrlmberVO comtngnrlmberVO = new ComtngnrlmberVO();
        comtngnrlmberVO.setMberId(mberId);
;        
        // 변수명은 CoC 에 따라 comtngnrlmberVO
        model.addAttribute(selectComtngnrlmber(comtngnrlmberVO, searchVO));
        return "/comtngnrlmber/ComtngnrlmberRegister";
    }

    @RequestMapping("/comtngnrlmber/selectComtngnrlmber.do")
    public @ModelAttribute("comtngnrlmberVO")
    ComtngnrlmberVO selectComtngnrlmber(
            ComtngnrlmberVO comtngnrlmberVO,
            @ModelAttribute("searchVO") ComtngnrlmberDefaultVO searchVO) throws Exception {
        return comtngnrlmberService.selectComtngnrlmber(comtngnrlmberVO);
    }

    @RequestMapping("/comtngnrlmber/updateComtngnrlmber.do")
    public String updateComtngnrlmber(
            ComtngnrlmberVO comtngnrlmberVO,
            @ModelAttribute("searchVO") ComtngnrlmberDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtngnrlmberService.updateComtngnrlmber(comtngnrlmberVO);
        status.setComplete();
        return "forward:/comtngnrlmber/ComtngnrlmberList.do";
    }
    
    @RequestMapping("/comtngnrlmber/deleteComtngnrlmber.do")
    public String deleteComtngnrlmber(
            ComtngnrlmberVO comtngnrlmberVO,
            @ModelAttribute("searchVO") ComtngnrlmberDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtngnrlmberService.deleteComtngnrlmber(comtngnrlmberVO);
        status.setComplete();
        return "forward:/comtngnrlmber/ComtngnrlmberList.do";
    }

}
