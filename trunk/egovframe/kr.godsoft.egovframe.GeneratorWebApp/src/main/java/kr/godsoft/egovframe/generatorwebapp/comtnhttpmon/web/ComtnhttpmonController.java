package kr.godsoft.egovframe.generatorwebapp.comtnhttpmon.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnhttpmon.service.ComtnhttpmonService;
import kr.godsoft.egovframe.generatorwebapp.comtnhttpmon.service.ComtnhttpmonDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnhttpmon.service.ComtnhttpmonVO;

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
 * @Class Name : ComtnhttpmonController.java
 * @Description : Comtnhttpmon Controller class
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
@SessionAttributes(types=ComtnhttpmonVO.class)
public class ComtnhttpmonController {

    @Resource(name = "comtnhttpmonService")
    private ComtnhttpmonService comtnhttpmonService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnhttpmon 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnhttpmonVO
	 * @return "/comtnhttpmon/ComtnhttpmonList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnhttpmon/ComtnhttpmonList.do")
    public String selectComtnhttpmonList(@ModelAttribute("searchVO") ComtnhttpmonVO searchVO, 
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
		
        List<EgovMap> comtnhttpmonList = comtnhttpmonService.selectComtnhttpmonList(searchVO);
        model.addAttribute("resultList", comtnhttpmonList);
        
        int totCnt = comtnhttpmonService.selectComtnhttpmonListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnhttpmon/ComtnhttpmonList";
    } 
    
    @RequestMapping("/comtnhttpmon/addComtnhttpmonView.do")
    public String addComtnhttpmonView(
            @ModelAttribute("searchVO") ComtnhttpmonDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnhttpmonVO", new ComtnhttpmonVO());
        return "/comtnhttpmon/ComtnhttpmonRegister";
    }
    
    @RequestMapping("/comtnhttpmon/addComtnhttpmon.do")
    public String addComtnhttpmon(
            ComtnhttpmonVO comtnhttpmonVO,
            @ModelAttribute("searchVO") ComtnhttpmonDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnhttpmonService.insertComtnhttpmon(comtnhttpmonVO);
        status.setComplete();
        return "forward:/comtnhttpmon/ComtnhttpmonList.do";
    }
    
    @RequestMapping("/comtnhttpmon/updateComtnhttpmonView.do")
    public String updateComtnhttpmonView(
            @RequestParam("sysId") String sysId ,
            @ModelAttribute("searchVO") ComtnhttpmonDefaultVO searchVO, Model model)
            throws Exception {
        ComtnhttpmonVO comtnhttpmonVO = new ComtnhttpmonVO();
        comtnhttpmonVO.setSysId(sysId);
;        
        // 변수명은 CoC 에 따라 comtnhttpmonVO
        model.addAttribute(selectComtnhttpmon(comtnhttpmonVO, searchVO));
        return "/comtnhttpmon/ComtnhttpmonRegister";
    }

    @RequestMapping("/comtnhttpmon/selectComtnhttpmon.do")
    public @ModelAttribute("comtnhttpmonVO")
    ComtnhttpmonVO selectComtnhttpmon(
            ComtnhttpmonVO comtnhttpmonVO,
            @ModelAttribute("searchVO") ComtnhttpmonDefaultVO searchVO) throws Exception {
        return comtnhttpmonService.selectComtnhttpmon(comtnhttpmonVO);
    }

    @RequestMapping("/comtnhttpmon/updateComtnhttpmon.do")
    public String updateComtnhttpmon(
            ComtnhttpmonVO comtnhttpmonVO,
            @ModelAttribute("searchVO") ComtnhttpmonDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnhttpmonService.updateComtnhttpmon(comtnhttpmonVO);
        status.setComplete();
        return "forward:/comtnhttpmon/ComtnhttpmonList.do";
    }
    
    @RequestMapping("/comtnhttpmon/deleteComtnhttpmon.do")
    public String deleteComtnhttpmon(
            ComtnhttpmonVO comtnhttpmonVO,
            @ModelAttribute("searchVO") ComtnhttpmonDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnhttpmonService.deleteComtnhttpmon(comtnhttpmonVO);
        status.setComplete();
        return "forward:/comtnhttpmon/ComtnhttpmonList.do";
    }

}
