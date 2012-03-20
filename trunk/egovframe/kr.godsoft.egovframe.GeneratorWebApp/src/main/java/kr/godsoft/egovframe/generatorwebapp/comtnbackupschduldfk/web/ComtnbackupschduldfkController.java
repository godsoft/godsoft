package kr.godsoft.egovframe.generatorwebapp.comtnbackupschduldfk.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnbackupschduldfk.service.ComtnbackupschduldfkService;
import kr.godsoft.egovframe.generatorwebapp.comtnbackupschduldfk.service.ComtnbackupschduldfkDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbackupschduldfk.service.ComtnbackupschduldfkVO;

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
 * @Class Name : ComtnbackupschduldfkController.java
 * @Description : Comtnbackupschduldfk Controller class
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
public class ComtnbackupschduldfkController {

    @Resource(name = "comtnbackupschduldfkService")
    private ComtnbackupschduldfkService comtnbackupschduldfkService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnbackupschduldfk 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnbackupschduldfkVO
	 * @return "/comtnbackupschduldfk/ComtnbackupschduldfkList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnbackupschduldfk/ComtnbackupschduldfkList.do")
    public String selectComtnbackupschduldfkList(@ModelAttribute("searchVO") ComtnbackupschduldfkVO searchVO, 
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
		
        List<EgovMap> comtnbackupschduldfkList = comtnbackupschduldfkService.selectComtnbackupschduldfkList(searchVO);
        model.addAttribute("resultList", comtnbackupschduldfkList);
        
        int totCnt = comtnbackupschduldfkService.selectComtnbackupschduldfkListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnbackupschduldfk/ComtnbackupschduldfkList";
    } 
    
    @RequestMapping("/comtnbackupschduldfk/addComtnbackupschduldfkView.do")
    public String addComtnbackupschduldfkView(
            @ModelAttribute("searchVO") ComtnbackupschduldfkDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnbackupschduldfkVO", new ComtnbackupschduldfkVO());
        return "/comtnbackupschduldfk/ComtnbackupschduldfkRegister";
    }
    
    @RequestMapping("/comtnbackupschduldfk/addComtnbackupschduldfk.do")
    public String addComtnbackupschduldfk(
            ComtnbackupschduldfkVO comtnbackupschduldfkVO,
            @ModelAttribute("searchVO") ComtnbackupschduldfkDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbackupschduldfkService.insertComtnbackupschduldfk(comtnbackupschduldfkVO);
        status.setComplete();
        return "forward:/comtnbackupschduldfk/ComtnbackupschduldfkList.do";
    }
    
    @RequestMapping("/comtnbackupschduldfk/updateComtnbackupschduldfkView.do")
    public String updateComtnbackupschduldfkView(
            @RequestParam("backupOpertId") String backupOpertId ,
            @RequestParam("executSchdulDfkSe") String executSchdulDfkSe ,
            @ModelAttribute("searchVO") ComtnbackupschduldfkDefaultVO searchVO, Model model)
            throws Exception {
        ComtnbackupschduldfkVO comtnbackupschduldfkVO = new ComtnbackupschduldfkVO();
        comtnbackupschduldfkVO.setBackupOpertId(backupOpertId);
        comtnbackupschduldfkVO.setExecutSchdulDfkSe(executSchdulDfkSe);
;        
        // 변수명은 CoC 에 따라 comtnbackupschduldfkVO
        model.addAttribute(selectComtnbackupschduldfk(comtnbackupschduldfkVO, searchVO));
        return "/comtnbackupschduldfk/ComtnbackupschduldfkRegister";
    }

    @RequestMapping("/comtnbackupschduldfk/selectComtnbackupschduldfk.do")
    public @ModelAttribute("comtnbackupschduldfkVO")
    ComtnbackupschduldfkVO selectComtnbackupschduldfk(
            ComtnbackupschduldfkVO comtnbackupschduldfkVO,
            @ModelAttribute("searchVO") ComtnbackupschduldfkDefaultVO searchVO) throws Exception {
        return comtnbackupschduldfkService.selectComtnbackupschduldfk(comtnbackupschduldfkVO);
    }

    @RequestMapping("/comtnbackupschduldfk/updateComtnbackupschduldfk.do")
    public String updateComtnbackupschduldfk(
            ComtnbackupschduldfkVO comtnbackupschduldfkVO,
            @ModelAttribute("searchVO") ComtnbackupschduldfkDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbackupschduldfkService.updateComtnbackupschduldfk(comtnbackupschduldfkVO);
        status.setComplete();
        return "forward:/comtnbackupschduldfk/ComtnbackupschduldfkList.do";
    }
    
    @RequestMapping("/comtnbackupschduldfk/deleteComtnbackupschduldfk.do")
    public String deleteComtnbackupschduldfk(
            ComtnbackupschduldfkVO comtnbackupschduldfkVO,
            @ModelAttribute("searchVO") ComtnbackupschduldfkDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbackupschduldfkService.deleteComtnbackupschduldfk(comtnbackupschduldfkVO);
        status.setComplete();
        return "forward:/comtnbackupschduldfk/ComtnbackupschduldfkList.do";
    }

}
