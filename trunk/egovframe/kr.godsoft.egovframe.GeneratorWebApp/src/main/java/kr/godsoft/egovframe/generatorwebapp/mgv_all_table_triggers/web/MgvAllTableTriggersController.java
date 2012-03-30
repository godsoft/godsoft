package kr.godsoft.egovframe.generatorwebapp.mgv_all_table_triggers.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.mgv_all_table_triggers.service.MgvAllTableTriggersService;
import kr.godsoft.egovframe.generatorwebapp.mgv_all_table_triggers.service.MgvAllTableTriggersDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.mgv_all_table_triggers.service.MgvAllTableTriggersVO;

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
 * @Class Name : MgvAllTableTriggersController.java
 * @Description : MgvAllTableTriggers Controller class
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
public class MgvAllTableTriggersController {

    @Resource(name = "mgvAllTableTriggersService")
    private MgvAllTableTriggersService mgvAllTableTriggersService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MGV_ALL_TABLE_TRIGGERS 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MgvAllTableTriggersVO
	 * @return "/mgvAllTableTriggers/MgvAllTableTriggersList"
	 * @exception Exception
	 */
    @RequestMapping(value="/mgvAllTableTriggers/MgvAllTableTriggersList.do")
    public String selectMgvAllTableTriggersList(@ModelAttribute("searchVO") MgvAllTableTriggersVO searchVO, 
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
		
        List<EgovMap> mgvAllTableTriggersList = mgvAllTableTriggersService.selectMgvAllTableTriggersList(searchVO);
        model.addAttribute("resultList", mgvAllTableTriggersList);
        
        int totCnt = mgvAllTableTriggersService.selectMgvAllTableTriggersListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/mgvAllTableTriggers/MgvAllTableTriggersList";
    } 
    
    @RequestMapping("/mgvAllTableTriggers/addMgvAllTableTriggersView.do")
    public String addMgvAllTableTriggersView(
            @ModelAttribute("searchVO") MgvAllTableTriggersDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("mgvAllTableTriggersVO", new MgvAllTableTriggersVO());
        return "/mgvAllTableTriggers/MgvAllTableTriggersRegister";
    }
    
    @RequestMapping("/mgvAllTableTriggers/addMgvAllTableTriggers.do")
    public String addMgvAllTableTriggers(
            MgvAllTableTriggersVO mgvAllTableTriggersVO,
            @ModelAttribute("searchVO") MgvAllTableTriggersDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mgvAllTableTriggersService.insertMgvAllTableTriggers(mgvAllTableTriggersVO);
        status.setComplete();
        return "forward:/mgvAllTableTriggers/MgvAllTableTriggersList.do";
    }
    
    @RequestMapping("/mgvAllTableTriggers/updateMgvAllTableTriggersView.do")
    public String updateMgvAllTableTriggersView(
            @ModelAttribute("searchVO") MgvAllTableTriggersDefaultVO searchVO, Model model)
            throws Exception {
        MgvAllTableTriggersVO mgvAllTableTriggersVO = new MgvAllTableTriggersVO();
;        
        // 변수명은 CoC 에 따라 mgvAllTableTriggersVO
        model.addAttribute(selectMgvAllTableTriggers(mgvAllTableTriggersVO, searchVO));
        return "/mgvAllTableTriggers/MgvAllTableTriggersRegister";
    }

    @RequestMapping("/mgvAllTableTriggers/selectMgvAllTableTriggers.do")
    public @ModelAttribute("mgvAllTableTriggersVO")
    MgvAllTableTriggersVO selectMgvAllTableTriggers(
            MgvAllTableTriggersVO mgvAllTableTriggersVO,
            @ModelAttribute("searchVO") MgvAllTableTriggersDefaultVO searchVO) throws Exception {
        return mgvAllTableTriggersService.selectMgvAllTableTriggers(mgvAllTableTriggersVO);
    }

    @RequestMapping("/mgvAllTableTriggers/updateMgvAllTableTriggers.do")
    public String updateMgvAllTableTriggers(
            MgvAllTableTriggersVO mgvAllTableTriggersVO,
            @ModelAttribute("searchVO") MgvAllTableTriggersDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mgvAllTableTriggersService.updateMgvAllTableTriggers(mgvAllTableTriggersVO);
        status.setComplete();
        return "forward:/mgvAllTableTriggers/MgvAllTableTriggersList.do";
    }
    
    @RequestMapping("/mgvAllTableTriggers/deleteMgvAllTableTriggers.do")
    public String deleteMgvAllTableTriggers(
            MgvAllTableTriggersVO mgvAllTableTriggersVO,
            @ModelAttribute("searchVO") MgvAllTableTriggersDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mgvAllTableTriggersService.deleteMgvAllTableTriggers(mgvAllTableTriggersVO);
        status.setComplete();
        return "forward:/mgvAllTableTriggers/MgvAllTableTriggersList.do";
    }

}
