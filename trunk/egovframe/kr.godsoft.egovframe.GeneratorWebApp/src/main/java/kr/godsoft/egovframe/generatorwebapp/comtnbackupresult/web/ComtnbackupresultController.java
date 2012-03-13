package kr.godsoft.egovframe.generatorwebapp.comtnbackupresult.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtnbackupresult.service.ComtnbackupresultService;
import kr.godsoft.egovframe.generatorwebapp.comtnbackupresult.service.ComtnbackupresultDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbackupresult.service.ComtnbackupresultVO;

/**
 * @Class Name : ComtnbackupresultController.java
 * @Description : Comtnbackupresult Controller class
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
@SessionAttributes(types=ComtnbackupresultVO.class)
public class ComtnbackupresultController {

    @Resource(name = "comtnbackupresultService")
    private ComtnbackupresultService comtnbackupresultService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnbackupresult 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnbackupresultDefaultVO
	 * @return "/comtnbackupresult/ComtnbackupresultList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnbackupresult/ComtnbackupresultList.do")
    public String selectComtnbackupresultList(@ModelAttribute("searchVO") ComtnbackupresultDefaultVO searchVO, 
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
		
        List comtnbackupresultList = comtnbackupresultService.selectComtnbackupresultList(searchVO);
        model.addAttribute("resultList", comtnbackupresultList);
        
        int totCnt = comtnbackupresultService.selectComtnbackupresultListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnbackupresult/ComtnbackupresultList";
    } 
    
    @RequestMapping("/comtnbackupresult/addComtnbackupresultView.do")
    public String addComtnbackupresultView(
            @ModelAttribute("searchVO") ComtnbackupresultDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnbackupresultVO", new ComtnbackupresultVO());
        return "/comtnbackupresult/ComtnbackupresultRegister";
    }
    
    @RequestMapping("/comtnbackupresult/addComtnbackupresult.do")
    public String addComtnbackupresult(
            ComtnbackupresultVO comtnbackupresultVO,
            @ModelAttribute("searchVO") ComtnbackupresultDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbackupresultService.insertComtnbackupresult(comtnbackupresultVO);
        status.setComplete();
        return "forward:/comtnbackupresult/ComtnbackupresultList.do";
    }
    
    @RequestMapping("/comtnbackupresult/updateComtnbackupresultView.do")
    public String updateComtnbackupresultView(
            @RequestParam("backupResultId") String backupResultId ,
            @ModelAttribute("searchVO") ComtnbackupresultDefaultVO searchVO, Model model)
            throws Exception {
        ComtnbackupresultVO comtnbackupresultVO = new ComtnbackupresultVO();
        comtnbackupresultVO.setBackupResultId(backupResultId);
;        
        // 변수명은 CoC 에 따라 comtnbackupresultVO
        model.addAttribute(selectComtnbackupresult(comtnbackupresultVO, searchVO));
        return "/comtnbackupresult/ComtnbackupresultRegister";
    }

    @RequestMapping("/comtnbackupresult/selectComtnbackupresult.do")
    public @ModelAttribute("comtnbackupresultVO")
    ComtnbackupresultVO selectComtnbackupresult(
            ComtnbackupresultVO comtnbackupresultVO,
            @ModelAttribute("searchVO") ComtnbackupresultDefaultVO searchVO) throws Exception {
        return comtnbackupresultService.selectComtnbackupresult(comtnbackupresultVO);
    }

    @RequestMapping("/comtnbackupresult/updateComtnbackupresult.do")
    public String updateComtnbackupresult(
            ComtnbackupresultVO comtnbackupresultVO,
            @ModelAttribute("searchVO") ComtnbackupresultDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbackupresultService.updateComtnbackupresult(comtnbackupresultVO);
        status.setComplete();
        return "forward:/comtnbackupresult/ComtnbackupresultList.do";
    }
    
    @RequestMapping("/comtnbackupresult/deleteComtnbackupresult.do")
    public String deleteComtnbackupresult(
            ComtnbackupresultVO comtnbackupresultVO,
            @ModelAttribute("searchVO") ComtnbackupresultDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbackupresultService.deleteComtnbackupresult(comtnbackupresultVO);
        status.setComplete();
        return "forward:/comtnbackupresult/ComtnbackupresultList.do";
    }

}
