package kr.godsoft.egovframe.generatorwebapp.comtnsynchrnserverinfo.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnsynchrnserverinfo.service.ComtnsynchrnserverinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnsynchrnserverinfo.service.ComtnsynchrnserverinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnsynchrnserverinfo.service.ComtnsynchrnserverinfoVO;

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
 * @Class Name : ComtnsynchrnserverinfoController.java
 * @Description : Comtnsynchrnserverinfo Controller class
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
public class ComtnsynchrnserverinfoController {

    @Resource(name = "comtnsynchrnserverinfoService")
    private ComtnsynchrnserverinfoService comtnsynchrnserverinfoService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNSYNCHRNSERVERINFO 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnsynchrnserverinfoVO
	 * @return "/comtnsynchrnserverinfo/ComtnsynchrnserverinfoList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnsynchrnserverinfo/ComtnsynchrnserverinfoList.do")
    public String selectComtnsynchrnserverinfoList(@ModelAttribute("searchVO") ComtnsynchrnserverinfoVO searchVO, 
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
		
        List<EgovMap> comtnsynchrnserverinfoList = comtnsynchrnserverinfoService.selectComtnsynchrnserverinfoList(searchVO);
        model.addAttribute("resultList", comtnsynchrnserverinfoList);
        
        int totCnt = comtnsynchrnserverinfoService.selectComtnsynchrnserverinfoListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnsynchrnserverinfo/ComtnsynchrnserverinfoList";
    } 
    
    @RequestMapping("/comtnsynchrnserverinfo/addComtnsynchrnserverinfoView.do")
    public String addComtnsynchrnserverinfoView(
            @ModelAttribute("searchVO") ComtnsynchrnserverinfoDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnsynchrnserverinfoVO", new ComtnsynchrnserverinfoVO());
        return "/comtnsynchrnserverinfo/ComtnsynchrnserverinfoRegister";
    }
    
    @RequestMapping("/comtnsynchrnserverinfo/addComtnsynchrnserverinfo.do")
    public String addComtnsynchrnserverinfo(
            ComtnsynchrnserverinfoVO comtnsynchrnserverinfoVO,
            @ModelAttribute("searchVO") ComtnsynchrnserverinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnsynchrnserverinfoService.insertComtnsynchrnserverinfo(comtnsynchrnserverinfoVO);
        status.setComplete();
        return "forward:/comtnsynchrnserverinfo/ComtnsynchrnserverinfoList.do";
    }
    
    @RequestMapping("/comtnsynchrnserverinfo/updateComtnsynchrnserverinfoView.do")
    public String updateComtnsynchrnserverinfoView(
            @RequestParam("serverId") String serverId ,
            @ModelAttribute("searchVO") ComtnsynchrnserverinfoDefaultVO searchVO, Model model)
            throws Exception {
        ComtnsynchrnserverinfoVO comtnsynchrnserverinfoVO = new ComtnsynchrnserverinfoVO();
        comtnsynchrnserverinfoVO.setServerId(serverId);
;        
        // 변수명은 CoC 에 따라 comtnsynchrnserverinfoVO
        model.addAttribute(selectComtnsynchrnserverinfo(comtnsynchrnserverinfoVO, searchVO));
        return "/comtnsynchrnserverinfo/ComtnsynchrnserverinfoRegister";
    }

    @RequestMapping("/comtnsynchrnserverinfo/selectComtnsynchrnserverinfo.do")
    public @ModelAttribute("comtnsynchrnserverinfoVO")
    ComtnsynchrnserverinfoVO selectComtnsynchrnserverinfo(
            ComtnsynchrnserverinfoVO comtnsynchrnserverinfoVO,
            @ModelAttribute("searchVO") ComtnsynchrnserverinfoDefaultVO searchVO) throws Exception {
        return comtnsynchrnserverinfoService.selectComtnsynchrnserverinfo(comtnsynchrnserverinfoVO);
    }

    @RequestMapping("/comtnsynchrnserverinfo/updateComtnsynchrnserverinfo.do")
    public String updateComtnsynchrnserverinfo(
            ComtnsynchrnserverinfoVO comtnsynchrnserverinfoVO,
            @ModelAttribute("searchVO") ComtnsynchrnserverinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnsynchrnserverinfoService.updateComtnsynchrnserverinfo(comtnsynchrnserverinfoVO);
        status.setComplete();
        return "forward:/comtnsynchrnserverinfo/ComtnsynchrnserverinfoList.do";
    }
    
    @RequestMapping("/comtnsynchrnserverinfo/deleteComtnsynchrnserverinfo.do")
    public String deleteComtnsynchrnserverinfo(
            ComtnsynchrnserverinfoVO comtnsynchrnserverinfoVO,
            @ModelAttribute("searchVO") ComtnsynchrnserverinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnsynchrnserverinfoService.deleteComtnsynchrnserverinfo(comtnsynchrnserverinfoVO);
        status.setComplete();
        return "forward:/comtnsynchrnserverinfo/ComtnsynchrnserverinfoList.do";
    }

}
