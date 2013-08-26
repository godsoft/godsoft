package kr.godsoft.egovframe.generatorwebapp.comtnprogrmlist.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnprogrmlist.service.ComtnprogrmlistService;
import kr.godsoft.egovframe.generatorwebapp.comtnprogrmlist.service.ComtnprogrmlistDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnprogrmlist.service.ComtnprogrmlistVO;

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
 * @Class Name : ComtnprogrmlistController.java
 * @Description : Comtnprogrmlist Controller class
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
public class ComtnprogrmlistController {

    @Resource(name = "comtnprogrmlistService")
    private ComtnprogrmlistService comtnprogrmlistService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNPROGRMLIST 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnprogrmlistVO
	 * @return "/comtnprogrmlist/ComtnprogrmlistList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnprogrmlist/ComtnprogrmlistList.do")
    public String selectComtnprogrmlistList(@ModelAttribute("searchVO") ComtnprogrmlistVO searchVO, 
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
		
        List<EgovMap> comtnprogrmlistList = comtnprogrmlistService.selectComtnprogrmlistList(searchVO);
        model.addAttribute("resultList", comtnprogrmlistList);
        
        int totCnt = comtnprogrmlistService.selectComtnprogrmlistListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnprogrmlist/ComtnprogrmlistList";
    } 
    
    @RequestMapping("/comtnprogrmlist/addComtnprogrmlistView.do")
    public String addComtnprogrmlistView(
            @ModelAttribute("searchVO") ComtnprogrmlistDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnprogrmlistVO", new ComtnprogrmlistVO());
        return "/comtnprogrmlist/ComtnprogrmlistRegister";
    }
    
    @RequestMapping("/comtnprogrmlist/addComtnprogrmlist.do")
    public String addComtnprogrmlist(
            ComtnprogrmlistVO comtnprogrmlistVO,
            @ModelAttribute("searchVO") ComtnprogrmlistDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnprogrmlistService.insertComtnprogrmlist(comtnprogrmlistVO);
        status.setComplete();
        return "forward:/comtnprogrmlist/ComtnprogrmlistList.do";
    }
    
    @RequestMapping("/comtnprogrmlist/updateComtnprogrmlistView.do")
    public String updateComtnprogrmlistView(
            @RequestParam("progrmFileNm") String progrmFileNm ,
            @ModelAttribute("searchVO") ComtnprogrmlistDefaultVO searchVO, Model model)
            throws Exception {
        ComtnprogrmlistVO comtnprogrmlistVO = new ComtnprogrmlistVO();
        comtnprogrmlistVO.setProgrmFileNm(progrmFileNm);
;        
        // 변수명은 CoC 에 따라 comtnprogrmlistVO
        model.addAttribute(selectComtnprogrmlist(comtnprogrmlistVO, searchVO));
        return "/comtnprogrmlist/ComtnprogrmlistRegister";
    }

    @RequestMapping("/comtnprogrmlist/selectComtnprogrmlist.do")
    public @ModelAttribute("comtnprogrmlistVO")
    ComtnprogrmlistVO selectComtnprogrmlist(
            ComtnprogrmlistVO comtnprogrmlistVO,
            @ModelAttribute("searchVO") ComtnprogrmlistDefaultVO searchVO) throws Exception {
        return comtnprogrmlistService.selectComtnprogrmlist(comtnprogrmlistVO);
    }

    @RequestMapping("/comtnprogrmlist/updateComtnprogrmlist.do")
    public String updateComtnprogrmlist(
            ComtnprogrmlistVO comtnprogrmlistVO,
            @ModelAttribute("searchVO") ComtnprogrmlistDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnprogrmlistService.updateComtnprogrmlist(comtnprogrmlistVO);
        status.setComplete();
        return "forward:/comtnprogrmlist/ComtnprogrmlistList.do";
    }
    
    @RequestMapping("/comtnprogrmlist/deleteComtnprogrmlist.do")
    public String deleteComtnprogrmlist(
            ComtnprogrmlistVO comtnprogrmlistVO,
            @ModelAttribute("searchVO") ComtnprogrmlistDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnprogrmlistService.deleteComtnprogrmlist(comtnprogrmlistVO);
        status.setComplete();
        return "forward:/comtnprogrmlist/ComtnprogrmlistList.do";
    }

}
