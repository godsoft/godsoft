package kr.godsoft.egovframe.generatorwebapp.comtncntcmessageitem.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtncntcmessageitem.service.ComtncntcmessageitemService;
import kr.godsoft.egovframe.generatorwebapp.comtncntcmessageitem.service.ComtncntcmessageitemDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtncntcmessageitem.service.ComtncntcmessageitemVO;

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
 * @Class Name : ComtncntcmessageitemController.java
 * @Description : Comtncntcmessageitem Controller class
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
public class ComtncntcmessageitemController {

    @Resource(name = "comtncntcmessageitemService")
    private ComtncntcmessageitemService comtncntcmessageitemService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNCNTCMESSAGEITEM 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtncntcmessageitemVO
	 * @return "/comtncntcmessageitem/ComtncntcmessageitemList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtncntcmessageitem/ComtncntcmessageitemList.do")
    public String selectComtncntcmessageitemList(@ModelAttribute("searchVO") ComtncntcmessageitemVO searchVO, 
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
		
        List<EgovMap> comtncntcmessageitemList = comtncntcmessageitemService.selectComtncntcmessageitemList(searchVO);
        model.addAttribute("resultList", comtncntcmessageitemList);
        
        int totCnt = comtncntcmessageitemService.selectComtncntcmessageitemListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtncntcmessageitem/ComtncntcmessageitemList";
    } 
    
    @RequestMapping("/comtncntcmessageitem/addComtncntcmessageitemView.do")
    public String addComtncntcmessageitemView(
            @ModelAttribute("searchVO") ComtncntcmessageitemDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtncntcmessageitemVO", new ComtncntcmessageitemVO());
        return "/comtncntcmessageitem/ComtncntcmessageitemRegister";
    }
    
    @RequestMapping("/comtncntcmessageitem/addComtncntcmessageitem.do")
    public String addComtncntcmessageitem(
            ComtncntcmessageitemVO comtncntcmessageitemVO,
            @ModelAttribute("searchVO") ComtncntcmessageitemDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtncntcmessageitemService.insertComtncntcmessageitem(comtncntcmessageitemVO);
        status.setComplete();
        return "forward:/comtncntcmessageitem/ComtncntcmessageitemList.do";
    }
    
    @RequestMapping("/comtncntcmessageitem/updateComtncntcmessageitemView.do")
    public String updateComtncntcmessageitemView(
            @RequestParam("cntcMssageId") String cntcMssageId ,
            @RequestParam("iemId") String iemId ,
            @ModelAttribute("searchVO") ComtncntcmessageitemDefaultVO searchVO, Model model)
            throws Exception {
        ComtncntcmessageitemVO comtncntcmessageitemVO = new ComtncntcmessageitemVO();
        comtncntcmessageitemVO.setCntcMssageId(cntcMssageId);
        comtncntcmessageitemVO.setIemId(iemId);
;        
        // 변수명은 CoC 에 따라 comtncntcmessageitemVO
        model.addAttribute(selectComtncntcmessageitem(comtncntcmessageitemVO, searchVO));
        return "/comtncntcmessageitem/ComtncntcmessageitemRegister";
    }

    @RequestMapping("/comtncntcmessageitem/selectComtncntcmessageitem.do")
    public @ModelAttribute("comtncntcmessageitemVO")
    ComtncntcmessageitemVO selectComtncntcmessageitem(
            ComtncntcmessageitemVO comtncntcmessageitemVO,
            @ModelAttribute("searchVO") ComtncntcmessageitemDefaultVO searchVO) throws Exception {
        return comtncntcmessageitemService.selectComtncntcmessageitem(comtncntcmessageitemVO);
    }

    @RequestMapping("/comtncntcmessageitem/updateComtncntcmessageitem.do")
    public String updateComtncntcmessageitem(
            ComtncntcmessageitemVO comtncntcmessageitemVO,
            @ModelAttribute("searchVO") ComtncntcmessageitemDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtncntcmessageitemService.updateComtncntcmessageitem(comtncntcmessageitemVO);
        status.setComplete();
        return "forward:/comtncntcmessageitem/ComtncntcmessageitemList.do";
    }
    
    @RequestMapping("/comtncntcmessageitem/deleteComtncntcmessageitem.do")
    public String deleteComtncntcmessageitem(
            ComtncntcmessageitemVO comtncntcmessageitemVO,
            @ModelAttribute("searchVO") ComtncntcmessageitemDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtncntcmessageitemService.deleteComtncntcmessageitem(comtncntcmessageitemVO);
        status.setComplete();
        return "forward:/comtncntcmessageitem/ComtncntcmessageitemList.do";
    }

}
