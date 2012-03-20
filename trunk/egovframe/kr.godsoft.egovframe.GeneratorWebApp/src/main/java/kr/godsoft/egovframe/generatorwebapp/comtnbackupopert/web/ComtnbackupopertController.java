package kr.godsoft.egovframe.generatorwebapp.comtnbackupopert.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnbackupopert.service.ComtnbackupopertService;
import kr.godsoft.egovframe.generatorwebapp.comtnbackupopert.service.ComtnbackupopertDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbackupopert.service.ComtnbackupopertVO;

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
 * @Class Name : ComtnbackupopertController.java
 * @Description : Comtnbackupopert Controller class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Controller
public class ComtnbackupopertController {

    @Resource(name = "comtnbackupopertService")
    private ComtnbackupopertService comtnbackupopertService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnbackupopert 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnbackupopertVO
	 * @return "/comtnbackupopert/ComtnbackupopertList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnbackupopert/ComtnbackupopertList.do")
    public String selectComtnbackupopertList(@ModelAttribute("searchVO") ComtnbackupopertVO searchVO, 
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
		
        List<EgovMap> comtnbackupopertList = comtnbackupopertService.selectComtnbackupopertList(searchVO);
        model.addAttribute("resultList", comtnbackupopertList);
        
        int totCnt = comtnbackupopertService.selectComtnbackupopertListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnbackupopert/ComtnbackupopertList";
    } 
    
    @RequestMapping("/comtnbackupopert/addComtnbackupopertView.do")
    public String addComtnbackupopertView(
            @ModelAttribute("searchVO") ComtnbackupopertDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnbackupopertVO", new ComtnbackupopertVO());
        return "/comtnbackupopert/ComtnbackupopertRegister";
    }
    
    @RequestMapping("/comtnbackupopert/addComtnbackupopert.do")
    public String addComtnbackupopert(
            ComtnbackupopertVO comtnbackupopertVO,
            @ModelAttribute("searchVO") ComtnbackupopertDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbackupopertService.insertComtnbackupopert(comtnbackupopertVO);
        status.setComplete();
        return "forward:/comtnbackupopert/ComtnbackupopertList.do";
    }
    
    @RequestMapping("/comtnbackupopert/updateComtnbackupopertView.do")
    public String updateComtnbackupopertView(
            @RequestParam("backupOpertId") String backupOpertId ,
            @ModelAttribute("searchVO") ComtnbackupopertDefaultVO searchVO, Model model)
            throws Exception {
        ComtnbackupopertVO comtnbackupopertVO = new ComtnbackupopertVO();
        comtnbackupopertVO.setBackupOpertId(backupOpertId);
;        
        // 변수명은 CoC 에 따라 comtnbackupopertVO
        model.addAttribute(selectComtnbackupopert(comtnbackupopertVO, searchVO));
        return "/comtnbackupopert/ComtnbackupopertRegister";
    }

    @RequestMapping("/comtnbackupopert/selectComtnbackupopert.do")
    public @ModelAttribute("comtnbackupopertVO")
    ComtnbackupopertVO selectComtnbackupopert(
            ComtnbackupopertVO comtnbackupopertVO,
            @ModelAttribute("searchVO") ComtnbackupopertDefaultVO searchVO) throws Exception {
        return comtnbackupopertService.selectComtnbackupopert(comtnbackupopertVO);
    }

    @RequestMapping("/comtnbackupopert/updateComtnbackupopert.do")
    public String updateComtnbackupopert(
            ComtnbackupopertVO comtnbackupopertVO,
            @ModelAttribute("searchVO") ComtnbackupopertDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbackupopertService.updateComtnbackupopert(comtnbackupopertVO);
        status.setComplete();
        return "forward:/comtnbackupopert/ComtnbackupopertList.do";
    }
    
    @RequestMapping("/comtnbackupopert/deleteComtnbackupopert.do")
    public String deleteComtnbackupopert(
            ComtnbackupopertVO comtnbackupopertVO,
            @ModelAttribute("searchVO") ComtnbackupopertDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbackupopertService.deleteComtnbackupopert(comtnbackupopertVO);
        status.setComplete();
        return "forward:/comtnbackupopert/ComtnbackupopertList.do";
    }

}
