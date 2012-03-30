package kr.godsoft.egovframe.generatorwebapp.mgv_all_connections.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.mgv_all_connections.service.MgvAllConnectionsService;
import kr.godsoft.egovframe.generatorwebapp.mgv_all_connections.service.MgvAllConnectionsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.mgv_all_connections.service.MgvAllConnectionsVO;

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
 * @Class Name : MgvAllConnectionsController.java
 * @Description : MgvAllConnections Controller class
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
public class MgvAllConnectionsController {

    @Resource(name = "mgvAllConnectionsService")
    private MgvAllConnectionsService mgvAllConnectionsService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MGV_ALL_CONNECTIONS 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MgvAllConnectionsVO
	 * @return "/mgvAllConnections/MgvAllConnectionsList"
	 * @exception Exception
	 */
    @RequestMapping(value="/mgvAllConnections/MgvAllConnectionsList.do")
    public String selectMgvAllConnectionsList(@ModelAttribute("searchVO") MgvAllConnectionsVO searchVO, 
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
		
        List<EgovMap> mgvAllConnectionsList = mgvAllConnectionsService.selectMgvAllConnectionsList(searchVO);
        model.addAttribute("resultList", mgvAllConnectionsList);
        
        int totCnt = mgvAllConnectionsService.selectMgvAllConnectionsListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/mgvAllConnections/MgvAllConnectionsList";
    } 
    
    @RequestMapping("/mgvAllConnections/addMgvAllConnectionsView.do")
    public String addMgvAllConnectionsView(
            @ModelAttribute("searchVO") MgvAllConnectionsDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("mgvAllConnectionsVO", new MgvAllConnectionsVO());
        return "/mgvAllConnections/MgvAllConnectionsRegister";
    }
    
    @RequestMapping("/mgvAllConnections/addMgvAllConnections.do")
    public String addMgvAllConnections(
            MgvAllConnectionsVO mgvAllConnectionsVO,
            @ModelAttribute("searchVO") MgvAllConnectionsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mgvAllConnectionsService.insertMgvAllConnections(mgvAllConnectionsVO);
        status.setComplete();
        return "forward:/mgvAllConnections/MgvAllConnectionsList.do";
    }
    
    @RequestMapping("/mgvAllConnections/updateMgvAllConnectionsView.do")
    public String updateMgvAllConnectionsView(
            @ModelAttribute("searchVO") MgvAllConnectionsDefaultVO searchVO, Model model)
            throws Exception {
        MgvAllConnectionsVO mgvAllConnectionsVO = new MgvAllConnectionsVO();
;        
        // 변수명은 CoC 에 따라 mgvAllConnectionsVO
        model.addAttribute(selectMgvAllConnections(mgvAllConnectionsVO, searchVO));
        return "/mgvAllConnections/MgvAllConnectionsRegister";
    }

    @RequestMapping("/mgvAllConnections/selectMgvAllConnections.do")
    public @ModelAttribute("mgvAllConnectionsVO")
    MgvAllConnectionsVO selectMgvAllConnections(
            MgvAllConnectionsVO mgvAllConnectionsVO,
            @ModelAttribute("searchVO") MgvAllConnectionsDefaultVO searchVO) throws Exception {
        return mgvAllConnectionsService.selectMgvAllConnections(mgvAllConnectionsVO);
    }

    @RequestMapping("/mgvAllConnections/updateMgvAllConnections.do")
    public String updateMgvAllConnections(
            MgvAllConnectionsVO mgvAllConnectionsVO,
            @ModelAttribute("searchVO") MgvAllConnectionsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mgvAllConnectionsService.updateMgvAllConnections(mgvAllConnectionsVO);
        status.setComplete();
        return "forward:/mgvAllConnections/MgvAllConnectionsList.do";
    }
    
    @RequestMapping("/mgvAllConnections/deleteMgvAllConnections.do")
    public String deleteMgvAllConnections(
            MgvAllConnectionsVO mgvAllConnectionsVO,
            @ModelAttribute("searchVO") MgvAllConnectionsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mgvAllConnectionsService.deleteMgvAllConnections(mgvAllConnectionsVO);
        status.setComplete();
        return "forward:/mgvAllConnections/MgvAllConnectionsList.do";
    }

}
