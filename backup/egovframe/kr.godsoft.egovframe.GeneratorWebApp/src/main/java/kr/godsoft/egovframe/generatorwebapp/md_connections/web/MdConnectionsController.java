package kr.godsoft.egovframe.generatorwebapp.md_connections.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_connections.service.MdConnectionsService;
import kr.godsoft.egovframe.generatorwebapp.md_connections.service.MdConnectionsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.md_connections.service.MdConnectionsVO;

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
 * @Class Name : MdConnectionsController.java
 * @Description : MdConnections Controller class
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
public class MdConnectionsController {

    @Resource(name = "mdConnectionsService")
    private MdConnectionsService mdConnectionsService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MD_CONNECTIONS 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MdConnectionsVO
	 * @return "/mdConnections/MdConnectionsList"
	 * @exception Exception
	 */
    @RequestMapping(value="/mdConnections/MdConnectionsList.do")
    public String selectMdConnectionsList(@ModelAttribute("searchVO") MdConnectionsVO searchVO, 
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
		
        List<EgovMap> mdConnectionsList = mdConnectionsService.selectMdConnectionsList(searchVO);
        model.addAttribute("resultList", mdConnectionsList);
        
        int totCnt = mdConnectionsService.selectMdConnectionsListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/mdConnections/MdConnectionsList";
    } 
    
    @RequestMapping("/mdConnections/addMdConnectionsView.do")
    public String addMdConnectionsView(
            @ModelAttribute("searchVO") MdConnectionsDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("mdConnectionsVO", new MdConnectionsVO());
        return "/mdConnections/MdConnectionsRegister";
    }
    
    @RequestMapping("/mdConnections/addMdConnections.do")
    public String addMdConnections(
            MdConnectionsVO mdConnectionsVO,
            @ModelAttribute("searchVO") MdConnectionsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdConnectionsService.insertMdConnections(mdConnectionsVO);
        status.setComplete();
        return "forward:/mdConnections/MdConnectionsList.do";
    }
    
    @RequestMapping("/mdConnections/updateMdConnectionsView.do")
    public String updateMdConnectionsView(
            @RequestParam("id") String id ,
            @ModelAttribute("searchVO") MdConnectionsDefaultVO searchVO, Model model)
            throws Exception {
        MdConnectionsVO mdConnectionsVO = new MdConnectionsVO();
        mdConnectionsVO.setId(id);
;        
        // 변수명은 CoC 에 따라 mdConnectionsVO
        model.addAttribute(selectMdConnections(mdConnectionsVO, searchVO));
        return "/mdConnections/MdConnectionsRegister";
    }

    @RequestMapping("/mdConnections/selectMdConnections.do")
    public @ModelAttribute("mdConnectionsVO")
    MdConnectionsVO selectMdConnections(
            MdConnectionsVO mdConnectionsVO,
            @ModelAttribute("searchVO") MdConnectionsDefaultVO searchVO) throws Exception {
        return mdConnectionsService.selectMdConnections(mdConnectionsVO);
    }

    @RequestMapping("/mdConnections/updateMdConnections.do")
    public String updateMdConnections(
            MdConnectionsVO mdConnectionsVO,
            @ModelAttribute("searchVO") MdConnectionsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdConnectionsService.updateMdConnections(mdConnectionsVO);
        status.setComplete();
        return "forward:/mdConnections/MdConnectionsList.do";
    }
    
    @RequestMapping("/mdConnections/deleteMdConnections.do")
    public String deleteMdConnections(
            MdConnectionsVO mdConnectionsVO,
            @ModelAttribute("searchVO") MdConnectionsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdConnectionsService.deleteMdConnections(mdConnectionsVO);
        status.setComplete();
        return "forward:/mdConnections/MdConnectionsList.do";
    }

}
