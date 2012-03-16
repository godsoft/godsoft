package kr.godsoft.egovframe.generatorwebapp.comthconfmhistory.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comthconfmhistory.service.ComthconfmhistoryService;
import kr.godsoft.egovframe.generatorwebapp.comthconfmhistory.service.ComthconfmhistoryDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comthconfmhistory.service.ComthconfmhistoryVO;

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
 * @Class Name : ComthconfmhistoryController.java
 * @Description : Comthconfmhistory Controller class
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
@SessionAttributes(types=ComthconfmhistoryVO.class)
public class ComthconfmhistoryController {

    @Resource(name = "comthconfmhistoryService")
    private ComthconfmhistoryService comthconfmhistoryService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comthconfmhistory 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComthconfmhistoryVO
	 * @return "/comthconfmhistory/ComthconfmhistoryList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comthconfmhistory/ComthconfmhistoryList.do")
    public String selectComthconfmhistoryList(@ModelAttribute("searchVO") ComthconfmhistoryVO searchVO, 
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
		
        List<EgovMap> comthconfmhistoryList = comthconfmhistoryService.selectComthconfmhistoryList(searchVO);
        model.addAttribute("resultList", comthconfmhistoryList);
        
        int totCnt = comthconfmhistoryService.selectComthconfmhistoryListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comthconfmhistory/ComthconfmhistoryList";
    } 
    
    @RequestMapping("/comthconfmhistory/addComthconfmhistoryView.do")
    public String addComthconfmhistoryView(
            @ModelAttribute("searchVO") ComthconfmhistoryDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comthconfmhistoryVO", new ComthconfmhistoryVO());
        return "/comthconfmhistory/ComthconfmhistoryRegister";
    }
    
    @RequestMapping("/comthconfmhistory/addComthconfmhistory.do")
    public String addComthconfmhistory(
            ComthconfmhistoryVO comthconfmhistoryVO,
            @ModelAttribute("searchVO") ComthconfmhistoryDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comthconfmhistoryService.insertComthconfmhistory(comthconfmhistoryVO);
        status.setComplete();
        return "forward:/comthconfmhistory/ComthconfmhistoryList.do";
    }
    
    @RequestMapping("/comthconfmhistory/updateComthconfmhistoryView.do")
    public String updateComthconfmhistoryView(
            @RequestParam("confmNo") int confmNo ,
            @ModelAttribute("searchVO") ComthconfmhistoryDefaultVO searchVO, Model model)
            throws Exception {
        ComthconfmhistoryVO comthconfmhistoryVO = new ComthconfmhistoryVO();
        comthconfmhistoryVO.setConfmNo(confmNo);
;        
        // 변수명은 CoC 에 따라 comthconfmhistoryVO
        model.addAttribute(selectComthconfmhistory(comthconfmhistoryVO, searchVO));
        return "/comthconfmhistory/ComthconfmhistoryRegister";
    }

    @RequestMapping("/comthconfmhistory/selectComthconfmhistory.do")
    public @ModelAttribute("comthconfmhistoryVO")
    ComthconfmhistoryVO selectComthconfmhistory(
            ComthconfmhistoryVO comthconfmhistoryVO,
            @ModelAttribute("searchVO") ComthconfmhistoryDefaultVO searchVO) throws Exception {
        return comthconfmhistoryService.selectComthconfmhistory(comthconfmhistoryVO);
    }

    @RequestMapping("/comthconfmhistory/updateComthconfmhistory.do")
    public String updateComthconfmhistory(
            ComthconfmhistoryVO comthconfmhistoryVO,
            @ModelAttribute("searchVO") ComthconfmhistoryDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comthconfmhistoryService.updateComthconfmhistory(comthconfmhistoryVO);
        status.setComplete();
        return "forward:/comthconfmhistory/ComthconfmhistoryList.do";
    }
    
    @RequestMapping("/comthconfmhistory/deleteComthconfmhistory.do")
    public String deleteComthconfmhistory(
            ComthconfmhistoryVO comthconfmhistoryVO,
            @ModelAttribute("searchVO") ComthconfmhistoryDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comthconfmhistoryService.deleteComthconfmhistory(comthconfmhistoryVO);
        status.setComplete();
        return "forward:/comthconfmhistory/ComthconfmhistoryList.do";
    }

}
