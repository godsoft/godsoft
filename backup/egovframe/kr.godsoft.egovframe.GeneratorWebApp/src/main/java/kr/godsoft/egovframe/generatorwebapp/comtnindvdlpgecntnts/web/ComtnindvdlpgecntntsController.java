package kr.godsoft.egovframe.generatorwebapp.comtnindvdlpgecntnts.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnindvdlpgecntnts.service.ComtnindvdlpgecntntsService;
import kr.godsoft.egovframe.generatorwebapp.comtnindvdlpgecntnts.service.ComtnindvdlpgecntntsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnindvdlpgecntnts.service.ComtnindvdlpgecntntsVO;

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
 * @Class Name : ComtnindvdlpgecntntsController.java
 * @Description : Comtnindvdlpgecntnts Controller class
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
public class ComtnindvdlpgecntntsController {

    @Resource(name = "comtnindvdlpgecntntsService")
    private ComtnindvdlpgecntntsService comtnindvdlpgecntntsService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNINDVDLPGECNTNTS 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnindvdlpgecntntsVO
	 * @return "/comtnindvdlpgecntnts/ComtnindvdlpgecntntsList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnindvdlpgecntnts/ComtnindvdlpgecntntsList.do")
    public String selectComtnindvdlpgecntntsList(@ModelAttribute("searchVO") ComtnindvdlpgecntntsVO searchVO, 
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
		
        List<EgovMap> comtnindvdlpgecntntsList = comtnindvdlpgecntntsService.selectComtnindvdlpgecntntsList(searchVO);
        model.addAttribute("resultList", comtnindvdlpgecntntsList);
        
        int totCnt = comtnindvdlpgecntntsService.selectComtnindvdlpgecntntsListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnindvdlpgecntnts/ComtnindvdlpgecntntsList";
    } 
    
    @RequestMapping("/comtnindvdlpgecntnts/addComtnindvdlpgecntntsView.do")
    public String addComtnindvdlpgecntntsView(
            @ModelAttribute("searchVO") ComtnindvdlpgecntntsDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnindvdlpgecntntsVO", new ComtnindvdlpgecntntsVO());
        return "/comtnindvdlpgecntnts/ComtnindvdlpgecntntsRegister";
    }
    
    @RequestMapping("/comtnindvdlpgecntnts/addComtnindvdlpgecntnts.do")
    public String addComtnindvdlpgecntnts(
            ComtnindvdlpgecntntsVO comtnindvdlpgecntntsVO,
            @ModelAttribute("searchVO") ComtnindvdlpgecntntsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnindvdlpgecntntsService.insertComtnindvdlpgecntnts(comtnindvdlpgecntntsVO);
        status.setComplete();
        return "forward:/comtnindvdlpgecntnts/ComtnindvdlpgecntntsList.do";
    }
    
    @RequestMapping("/comtnindvdlpgecntnts/updateComtnindvdlpgecntntsView.do")
    public String updateComtnindvdlpgecntntsView(
            @RequestParam("cntntsId") String cntntsId ,
            @ModelAttribute("searchVO") ComtnindvdlpgecntntsDefaultVO searchVO, Model model)
            throws Exception {
        ComtnindvdlpgecntntsVO comtnindvdlpgecntntsVO = new ComtnindvdlpgecntntsVO();
        comtnindvdlpgecntntsVO.setCntntsId(cntntsId);
;        
        // 변수명은 CoC 에 따라 comtnindvdlpgecntntsVO
        model.addAttribute(selectComtnindvdlpgecntnts(comtnindvdlpgecntntsVO, searchVO));
        return "/comtnindvdlpgecntnts/ComtnindvdlpgecntntsRegister";
    }

    @RequestMapping("/comtnindvdlpgecntnts/selectComtnindvdlpgecntnts.do")
    public @ModelAttribute("comtnindvdlpgecntntsVO")
    ComtnindvdlpgecntntsVO selectComtnindvdlpgecntnts(
            ComtnindvdlpgecntntsVO comtnindvdlpgecntntsVO,
            @ModelAttribute("searchVO") ComtnindvdlpgecntntsDefaultVO searchVO) throws Exception {
        return comtnindvdlpgecntntsService.selectComtnindvdlpgecntnts(comtnindvdlpgecntntsVO);
    }

    @RequestMapping("/comtnindvdlpgecntnts/updateComtnindvdlpgecntnts.do")
    public String updateComtnindvdlpgecntnts(
            ComtnindvdlpgecntntsVO comtnindvdlpgecntntsVO,
            @ModelAttribute("searchVO") ComtnindvdlpgecntntsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnindvdlpgecntntsService.updateComtnindvdlpgecntnts(comtnindvdlpgecntntsVO);
        status.setComplete();
        return "forward:/comtnindvdlpgecntnts/ComtnindvdlpgecntntsList.do";
    }
    
    @RequestMapping("/comtnindvdlpgecntnts/deleteComtnindvdlpgecntnts.do")
    public String deleteComtnindvdlpgecntnts(
            ComtnindvdlpgecntntsVO comtnindvdlpgecntntsVO,
            @ModelAttribute("searchVO") ComtnindvdlpgecntntsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnindvdlpgecntntsService.deleteComtnindvdlpgecntnts(comtnindvdlpgecntntsVO);
        status.setComplete();
        return "forward:/comtnindvdlpgecntnts/ComtnindvdlpgecntntsList.do";
    }

}
