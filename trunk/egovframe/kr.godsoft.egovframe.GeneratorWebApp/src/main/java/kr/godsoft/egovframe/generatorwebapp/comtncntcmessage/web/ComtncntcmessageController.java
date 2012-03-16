package kr.godsoft.egovframe.generatorwebapp.comtncntcmessage.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtncntcmessage.service.ComtncntcmessageService;
import kr.godsoft.egovframe.generatorwebapp.comtncntcmessage.service.ComtncntcmessageDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtncntcmessage.service.ComtncntcmessageVO;

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
 * @Class Name : ComtncntcmessageController.java
 * @Description : Comtncntcmessage Controller class
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
@SessionAttributes(types=ComtncntcmessageVO.class)
public class ComtncntcmessageController {

    @Resource(name = "comtncntcmessageService")
    private ComtncntcmessageService comtncntcmessageService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtncntcmessage 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtncntcmessageVO
	 * @return "/comtncntcmessage/ComtncntcmessageList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtncntcmessage/ComtncntcmessageList.do")
    public String selectComtncntcmessageList(@ModelAttribute("searchVO") ComtncntcmessageVO searchVO, 
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
		
        List<EgovMap> comtncntcmessageList = comtncntcmessageService.selectComtncntcmessageList(searchVO);
        model.addAttribute("resultList", comtncntcmessageList);
        
        int totCnt = comtncntcmessageService.selectComtncntcmessageListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtncntcmessage/ComtncntcmessageList";
    } 
    
    @RequestMapping("/comtncntcmessage/addComtncntcmessageView.do")
    public String addComtncntcmessageView(
            @ModelAttribute("searchVO") ComtncntcmessageDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtncntcmessageVO", new ComtncntcmessageVO());
        return "/comtncntcmessage/ComtncntcmessageRegister";
    }
    
    @RequestMapping("/comtncntcmessage/addComtncntcmessage.do")
    public String addComtncntcmessage(
            ComtncntcmessageVO comtncntcmessageVO,
            @ModelAttribute("searchVO") ComtncntcmessageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtncntcmessageService.insertComtncntcmessage(comtncntcmessageVO);
        status.setComplete();
        return "forward:/comtncntcmessage/ComtncntcmessageList.do";
    }
    
    @RequestMapping("/comtncntcmessage/updateComtncntcmessageView.do")
    public String updateComtncntcmessageView(
            @RequestParam("cntcMssageId") String cntcMssageId ,
            @ModelAttribute("searchVO") ComtncntcmessageDefaultVO searchVO, Model model)
            throws Exception {
        ComtncntcmessageVO comtncntcmessageVO = new ComtncntcmessageVO();
        comtncntcmessageVO.setCntcMssageId(cntcMssageId);
;        
        // 변수명은 CoC 에 따라 comtncntcmessageVO
        model.addAttribute(selectComtncntcmessage(comtncntcmessageVO, searchVO));
        return "/comtncntcmessage/ComtncntcmessageRegister";
    }

    @RequestMapping("/comtncntcmessage/selectComtncntcmessage.do")
    public @ModelAttribute("comtncntcmessageVO")
    ComtncntcmessageVO selectComtncntcmessage(
            ComtncntcmessageVO comtncntcmessageVO,
            @ModelAttribute("searchVO") ComtncntcmessageDefaultVO searchVO) throws Exception {
        return comtncntcmessageService.selectComtncntcmessage(comtncntcmessageVO);
    }

    @RequestMapping("/comtncntcmessage/updateComtncntcmessage.do")
    public String updateComtncntcmessage(
            ComtncntcmessageVO comtncntcmessageVO,
            @ModelAttribute("searchVO") ComtncntcmessageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtncntcmessageService.updateComtncntcmessage(comtncntcmessageVO);
        status.setComplete();
        return "forward:/comtncntcmessage/ComtncntcmessageList.do";
    }
    
    @RequestMapping("/comtncntcmessage/deleteComtncntcmessage.do")
    public String deleteComtncntcmessage(
            ComtncntcmessageVO comtncntcmessageVO,
            @ModelAttribute("searchVO") ComtncntcmessageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtncntcmessageService.deleteComtncntcmessage(comtncntcmessageVO);
        status.setComplete();
        return "forward:/comtncntcmessage/ComtncntcmessageList.do";
    }

}
