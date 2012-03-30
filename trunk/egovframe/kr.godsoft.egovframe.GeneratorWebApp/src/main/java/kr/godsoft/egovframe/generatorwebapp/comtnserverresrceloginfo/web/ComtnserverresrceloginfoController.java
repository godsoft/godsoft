package kr.godsoft.egovframe.generatorwebapp.comtnserverresrceloginfo.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnserverresrceloginfo.service.ComtnserverresrceloginfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnserverresrceloginfo.service.ComtnserverresrceloginfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnserverresrceloginfo.service.ComtnserverresrceloginfoVO;

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
 * @Class Name : ComtnserverresrceloginfoController.java
 * @Description : Comtnserverresrceloginfo Controller class
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
public class ComtnserverresrceloginfoController {

    @Resource(name = "comtnserverresrceloginfoService")
    private ComtnserverresrceloginfoService comtnserverresrceloginfoService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNSERVERRESRCELOGINFO 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnserverresrceloginfoVO
	 * @return "/comtnserverresrceloginfo/ComtnserverresrceloginfoList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnserverresrceloginfo/ComtnserverresrceloginfoList.do")
    public String selectComtnserverresrceloginfoList(@ModelAttribute("searchVO") ComtnserverresrceloginfoVO searchVO, 
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
		
        List<EgovMap> comtnserverresrceloginfoList = comtnserverresrceloginfoService.selectComtnserverresrceloginfoList(searchVO);
        model.addAttribute("resultList", comtnserverresrceloginfoList);
        
        int totCnt = comtnserverresrceloginfoService.selectComtnserverresrceloginfoListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnserverresrceloginfo/ComtnserverresrceloginfoList";
    } 
    
    @RequestMapping("/comtnserverresrceloginfo/addComtnserverresrceloginfoView.do")
    public String addComtnserverresrceloginfoView(
            @ModelAttribute("searchVO") ComtnserverresrceloginfoDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnserverresrceloginfoVO", new ComtnserverresrceloginfoVO());
        return "/comtnserverresrceloginfo/ComtnserverresrceloginfoRegister";
    }
    
    @RequestMapping("/comtnserverresrceloginfo/addComtnserverresrceloginfo.do")
    public String addComtnserverresrceloginfo(
            ComtnserverresrceloginfoVO comtnserverresrceloginfoVO,
            @ModelAttribute("searchVO") ComtnserverresrceloginfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnserverresrceloginfoService.insertComtnserverresrceloginfo(comtnserverresrceloginfoVO);
        status.setComplete();
        return "forward:/comtnserverresrceloginfo/ComtnserverresrceloginfoList.do";
    }
    
    @RequestMapping("/comtnserverresrceloginfo/updateComtnserverresrceloginfoView.do")
    public String updateComtnserverresrceloginfoView(
            @RequestParam("serverEqpmnId") String serverEqpmnId ,
            @RequestParam("serverId") String serverId ,
            @RequestParam("logId") String logId ,
            @ModelAttribute("searchVO") ComtnserverresrceloginfoDefaultVO searchVO, Model model)
            throws Exception {
        ComtnserverresrceloginfoVO comtnserverresrceloginfoVO = new ComtnserverresrceloginfoVO();
        comtnserverresrceloginfoVO.setServerEqpmnId(serverEqpmnId);
        comtnserverresrceloginfoVO.setServerId(serverId);
        comtnserverresrceloginfoVO.setLogId(logId);
;        
        // 변수명은 CoC 에 따라 comtnserverresrceloginfoVO
        model.addAttribute(selectComtnserverresrceloginfo(comtnserverresrceloginfoVO, searchVO));
        return "/comtnserverresrceloginfo/ComtnserverresrceloginfoRegister";
    }

    @RequestMapping("/comtnserverresrceloginfo/selectComtnserverresrceloginfo.do")
    public @ModelAttribute("comtnserverresrceloginfoVO")
    ComtnserverresrceloginfoVO selectComtnserverresrceloginfo(
            ComtnserverresrceloginfoVO comtnserverresrceloginfoVO,
            @ModelAttribute("searchVO") ComtnserverresrceloginfoDefaultVO searchVO) throws Exception {
        return comtnserverresrceloginfoService.selectComtnserverresrceloginfo(comtnserverresrceloginfoVO);
    }

    @RequestMapping("/comtnserverresrceloginfo/updateComtnserverresrceloginfo.do")
    public String updateComtnserverresrceloginfo(
            ComtnserverresrceloginfoVO comtnserverresrceloginfoVO,
            @ModelAttribute("searchVO") ComtnserverresrceloginfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnserverresrceloginfoService.updateComtnserverresrceloginfo(comtnserverresrceloginfoVO);
        status.setComplete();
        return "forward:/comtnserverresrceloginfo/ComtnserverresrceloginfoList.do";
    }
    
    @RequestMapping("/comtnserverresrceloginfo/deleteComtnserverresrceloginfo.do")
    public String deleteComtnserverresrceloginfo(
            ComtnserverresrceloginfoVO comtnserverresrceloginfoVO,
            @ModelAttribute("searchVO") ComtnserverresrceloginfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnserverresrceloginfoService.deleteComtnserverresrceloginfo(comtnserverresrceloginfoVO);
        status.setComplete();
        return "forward:/comtnserverresrceloginfo/ComtnserverresrceloginfoList.do";
    }

}
