package kr.godsoft.egovframe.generatorwebapp.md_triggers.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_triggers.service.MdTriggersService;
import kr.godsoft.egovframe.generatorwebapp.md_triggers.service.MdTriggersDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.md_triggers.service.MdTriggersVO;

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
 * @Class Name : MdTriggersController.java
 * @Description : MdTriggers Controller class
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
public class MdTriggersController {

    @Resource(name = "mdTriggersService")
    private MdTriggersService mdTriggersService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MD_TRIGGERS 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MdTriggersVO
	 * @return "/mdTriggers/MdTriggersList"
	 * @exception Exception
	 */
    @RequestMapping(value="/mdTriggers/MdTriggersList.do")
    public String selectMdTriggersList(@ModelAttribute("searchVO") MdTriggersVO searchVO, 
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
		
        List<EgovMap> mdTriggersList = mdTriggersService.selectMdTriggersList(searchVO);
        model.addAttribute("resultList", mdTriggersList);
        
        int totCnt = mdTriggersService.selectMdTriggersListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/mdTriggers/MdTriggersList";
    } 
    
    @RequestMapping("/mdTriggers/addMdTriggersView.do")
    public String addMdTriggersView(
            @ModelAttribute("searchVO") MdTriggersDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("mdTriggersVO", new MdTriggersVO());
        return "/mdTriggers/MdTriggersRegister";
    }
    
    @RequestMapping("/mdTriggers/addMdTriggers.do")
    public String addMdTriggers(
            MdTriggersVO mdTriggersVO,
            @ModelAttribute("searchVO") MdTriggersDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdTriggersService.insertMdTriggers(mdTriggersVO);
        status.setComplete();
        return "forward:/mdTriggers/MdTriggersList.do";
    }
    
    @RequestMapping("/mdTriggers/updateMdTriggersView.do")
    public String updateMdTriggersView(
            @RequestParam("id") String id ,
            @ModelAttribute("searchVO") MdTriggersDefaultVO searchVO, Model model)
            throws Exception {
        MdTriggersVO mdTriggersVO = new MdTriggersVO();
        mdTriggersVO.setId(id);
;        
        // 변수명은 CoC 에 따라 mdTriggersVO
        model.addAttribute(selectMdTriggers(mdTriggersVO, searchVO));
        return "/mdTriggers/MdTriggersRegister";
    }

    @RequestMapping("/mdTriggers/selectMdTriggers.do")
    public @ModelAttribute("mdTriggersVO")
    MdTriggersVO selectMdTriggers(
            MdTriggersVO mdTriggersVO,
            @ModelAttribute("searchVO") MdTriggersDefaultVO searchVO) throws Exception {
        return mdTriggersService.selectMdTriggers(mdTriggersVO);
    }

    @RequestMapping("/mdTriggers/updateMdTriggers.do")
    public String updateMdTriggers(
            MdTriggersVO mdTriggersVO,
            @ModelAttribute("searchVO") MdTriggersDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdTriggersService.updateMdTriggers(mdTriggersVO);
        status.setComplete();
        return "forward:/mdTriggers/MdTriggersList.do";
    }
    
    @RequestMapping("/mdTriggers/deleteMdTriggers.do")
    public String deleteMdTriggers(
            MdTriggersVO mdTriggersVO,
            @ModelAttribute("searchVO") MdTriggersDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdTriggersService.deleteMdTriggers(mdTriggersVO);
        status.setComplete();
        return "forward:/mdTriggers/MdTriggersList.do";
    }

}
