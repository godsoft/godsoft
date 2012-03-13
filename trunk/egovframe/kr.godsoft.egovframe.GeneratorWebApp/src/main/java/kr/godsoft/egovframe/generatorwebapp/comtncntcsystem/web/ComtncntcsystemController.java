package kr.godsoft.egovframe.generatorwebapp.comtncntcsystem.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import egovframework.rte.fdl.property.EgovPropertyService;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;

import kr.godsoft.egovframe.generatorwebapp.comtncntcsystem.service.ComtncntcsystemService;
import kr.godsoft.egovframe.generatorwebapp.comtncntcsystem.service.ComtncntcsystemDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtncntcsystem.service.ComtncntcsystemVO;

/**
 * @Class Name : ComtncntcsystemController.java
 * @Description : Comtncntcsystem Controller class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Controller
@SessionAttributes(types=ComtncntcsystemVO.class)
public class ComtncntcsystemController {

    @Resource(name = "comtncntcsystemService")
    private ComtncntcsystemService comtncntcsystemService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtncntcsystem 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtncntcsystemDefaultVO
	 * @return "/comtncntcsystem/ComtncntcsystemList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtncntcsystem/ComtncntcsystemList.do")
    public String selectComtncntcsystemList(@ModelAttribute("searchVO") ComtncntcsystemDefaultVO searchVO, 
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
		
        List comtncntcsystemList = comtncntcsystemService.selectComtncntcsystemList(searchVO);
        model.addAttribute("resultList", comtncntcsystemList);
        
        int totCnt = comtncntcsystemService.selectComtncntcsystemListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtncntcsystem/ComtncntcsystemList";
    } 
    
    @RequestMapping("/comtncntcsystem/addComtncntcsystemView.do")
    public String addComtncntcsystemView(
            @ModelAttribute("searchVO") ComtncntcsystemDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtncntcsystemVO", new ComtncntcsystemVO());
        return "/comtncntcsystem/ComtncntcsystemRegister";
    }
    
    @RequestMapping("/comtncntcsystem/addComtncntcsystem.do")
    public String addComtncntcsystem(
            ComtncntcsystemVO comtncntcsystemVO,
            @ModelAttribute("searchVO") ComtncntcsystemDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtncntcsystemService.insertComtncntcsystem(comtncntcsystemVO);
        status.setComplete();
        return "forward:/comtncntcsystem/ComtncntcsystemList.do";
    }
    
    @RequestMapping("/comtncntcsystem/updateComtncntcsystemView.do")
    public String updateComtncntcsystemView(
            @RequestParam("insttId") String insttId ,
            @RequestParam("sysId") String sysId ,
            @ModelAttribute("searchVO") ComtncntcsystemDefaultVO searchVO, Model model)
            throws Exception {
        ComtncntcsystemVO comtncntcsystemVO = new ComtncntcsystemVO();
        comtncntcsystemVO.setInsttId(insttId);
        comtncntcsystemVO.setSysId(sysId);
;        
        // 변수명은 CoC 에 따라 comtncntcsystemVO
        model.addAttribute(selectComtncntcsystem(comtncntcsystemVO, searchVO));
        return "/comtncntcsystem/ComtncntcsystemRegister";
    }

    @RequestMapping("/comtncntcsystem/selectComtncntcsystem.do")
    public @ModelAttribute("comtncntcsystemVO")
    ComtncntcsystemVO selectComtncntcsystem(
            ComtncntcsystemVO comtncntcsystemVO,
            @ModelAttribute("searchVO") ComtncntcsystemDefaultVO searchVO) throws Exception {
        return comtncntcsystemService.selectComtncntcsystem(comtncntcsystemVO);
    }

    @RequestMapping("/comtncntcsystem/updateComtncntcsystem.do")
    public String updateComtncntcsystem(
            ComtncntcsystemVO comtncntcsystemVO,
            @ModelAttribute("searchVO") ComtncntcsystemDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtncntcsystemService.updateComtncntcsystem(comtncntcsystemVO);
        status.setComplete();
        return "forward:/comtncntcsystem/ComtncntcsystemList.do";
    }
    
    @RequestMapping("/comtncntcsystem/deleteComtncntcsystem.do")
    public String deleteComtncntcsystem(
            ComtncntcsystemVO comtncntcsystemVO,
            @ModelAttribute("searchVO") ComtncntcsystemDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtncntcsystemService.deleteComtncntcsystem(comtncntcsystemVO);
        status.setComplete();
        return "forward:/comtncntcsystem/ComtncntcsystemList.do";
    }

}
