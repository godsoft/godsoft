package kr.godsoft.egovframe.generatorwebapp.comtnserverinfo.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtnserverinfo.service.ComtnserverinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnserverinfo.service.ComtnserverinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnserverinfo.service.ComtnserverinfoVO;

/**
 * @Class Name : ComtnserverinfoController.java
 * @Description : Comtnserverinfo Controller class
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
@SessionAttributes(types=ComtnserverinfoVO.class)
public class ComtnserverinfoController {

    @Resource(name = "comtnserverinfoService")
    private ComtnserverinfoService comtnserverinfoService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnserverinfo 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnserverinfoDefaultVO
	 * @return "/comtnserverinfo/ComtnserverinfoList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnserverinfo/ComtnserverinfoList.do")
    public String selectComtnserverinfoList(@ModelAttribute("searchVO") ComtnserverinfoDefaultVO searchVO, 
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
		
        List comtnserverinfoList = comtnserverinfoService.selectComtnserverinfoList(searchVO);
        model.addAttribute("resultList", comtnserverinfoList);
        
        int totCnt = comtnserverinfoService.selectComtnserverinfoListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnserverinfo/ComtnserverinfoList";
    } 
    
    @RequestMapping("/comtnserverinfo/addComtnserverinfoView.do")
    public String addComtnserverinfoView(
            @ModelAttribute("searchVO") ComtnserverinfoDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnserverinfoVO", new ComtnserverinfoVO());
        return "/comtnserverinfo/ComtnserverinfoRegister";
    }
    
    @RequestMapping("/comtnserverinfo/addComtnserverinfo.do")
    public String addComtnserverinfo(
            ComtnserverinfoVO comtnserverinfoVO,
            @ModelAttribute("searchVO") ComtnserverinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnserverinfoService.insertComtnserverinfo(comtnserverinfoVO);
        status.setComplete();
        return "forward:/comtnserverinfo/ComtnserverinfoList.do";
    }
    
    @RequestMapping("/comtnserverinfo/updateComtnserverinfoView.do")
    public String updateComtnserverinfoView(
            @RequestParam("serverId") String serverId ,
            @ModelAttribute("searchVO") ComtnserverinfoDefaultVO searchVO, Model model)
            throws Exception {
        ComtnserverinfoVO comtnserverinfoVO = new ComtnserverinfoVO();
        comtnserverinfoVO.setServerId(serverId);
;        
        // 변수명은 CoC 에 따라 comtnserverinfoVO
        model.addAttribute(selectComtnserverinfo(comtnserverinfoVO, searchVO));
        return "/comtnserverinfo/ComtnserverinfoRegister";
    }

    @RequestMapping("/comtnserverinfo/selectComtnserverinfo.do")
    public @ModelAttribute("comtnserverinfoVO")
    ComtnserverinfoVO selectComtnserverinfo(
            ComtnserverinfoVO comtnserverinfoVO,
            @ModelAttribute("searchVO") ComtnserverinfoDefaultVO searchVO) throws Exception {
        return comtnserverinfoService.selectComtnserverinfo(comtnserverinfoVO);
    }

    @RequestMapping("/comtnserverinfo/updateComtnserverinfo.do")
    public String updateComtnserverinfo(
            ComtnserverinfoVO comtnserverinfoVO,
            @ModelAttribute("searchVO") ComtnserverinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnserverinfoService.updateComtnserverinfo(comtnserverinfoVO);
        status.setComplete();
        return "forward:/comtnserverinfo/ComtnserverinfoList.do";
    }
    
    @RequestMapping("/comtnserverinfo/deleteComtnserverinfo.do")
    public String deleteComtnserverinfo(
            ComtnserverinfoVO comtnserverinfoVO,
            @ModelAttribute("searchVO") ComtnserverinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnserverinfoService.deleteComtnserverinfo(comtnserverinfoVO);
        status.setComplete();
        return "forward:/comtnserverinfo/ComtnserverinfoList.do";
    }

}
