package kr.godsoft.egovframe.generatorwebapp.comtnfile.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnfile.service.ComtnfileService;
import kr.godsoft.egovframe.generatorwebapp.comtnfile.service.ComtnfileDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnfile.service.ComtnfileVO;

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
 * @Class Name : ComtnfileController.java
 * @Description : Comtnfile Controller class
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
public class ComtnfileController {

    @Resource(name = "comtnfileService")
    private ComtnfileService comtnfileService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNFILE 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnfileVO
	 * @return "/comtnfile/ComtnfileList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnfile/ComtnfileList.do")
    public String selectComtnfileList(@ModelAttribute("searchVO") ComtnfileVO searchVO, 
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
		
        List<EgovMap> comtnfileList = comtnfileService.selectComtnfileList(searchVO);
        model.addAttribute("resultList", comtnfileList);
        
        int totCnt = comtnfileService.selectComtnfileListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnfile/ComtnfileList";
    } 
    
    @RequestMapping("/comtnfile/addComtnfileView.do")
    public String addComtnfileView(
            @ModelAttribute("searchVO") ComtnfileDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnfileVO", new ComtnfileVO());
        return "/comtnfile/ComtnfileRegister";
    }
    
    @RequestMapping("/comtnfile/addComtnfile.do")
    public String addComtnfile(
            ComtnfileVO comtnfileVO,
            @ModelAttribute("searchVO") ComtnfileDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnfileService.insertComtnfile(comtnfileVO);
        status.setComplete();
        return "forward:/comtnfile/ComtnfileList.do";
    }
    
    @RequestMapping("/comtnfile/updateComtnfileView.do")
    public String updateComtnfileView(
            @RequestParam("atchFileId") String atchFileId ,
            @ModelAttribute("searchVO") ComtnfileDefaultVO searchVO, Model model)
            throws Exception {
        ComtnfileVO comtnfileVO = new ComtnfileVO();
        comtnfileVO.setAtchFileId(atchFileId);
;        
        // 변수명은 CoC 에 따라 comtnfileVO
        model.addAttribute(selectComtnfile(comtnfileVO, searchVO));
        return "/comtnfile/ComtnfileRegister";
    }

    @RequestMapping("/comtnfile/selectComtnfile.do")
    public @ModelAttribute("comtnfileVO")
    ComtnfileVO selectComtnfile(
            ComtnfileVO comtnfileVO,
            @ModelAttribute("searchVO") ComtnfileDefaultVO searchVO) throws Exception {
        return comtnfileService.selectComtnfile(comtnfileVO);
    }

    @RequestMapping("/comtnfile/updateComtnfile.do")
    public String updateComtnfile(
            ComtnfileVO comtnfileVO,
            @ModelAttribute("searchVO") ComtnfileDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnfileService.updateComtnfile(comtnfileVO);
        status.setComplete();
        return "forward:/comtnfile/ComtnfileList.do";
    }
    
    @RequestMapping("/comtnfile/deleteComtnfile.do")
    public String deleteComtnfile(
            ComtnfileVO comtnfileVO,
            @ModelAttribute("searchVO") ComtnfileDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnfileService.deleteComtnfile(comtnfileVO);
        status.setComplete();
        return "forward:/comtnfile/ComtnfileList.do";
    }

}
