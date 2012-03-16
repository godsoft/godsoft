package kr.godsoft.egovframe.generatorwebapp.comtnprocessmon.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnprocessmon.service.ComtnprocessmonService;
import kr.godsoft.egovframe.generatorwebapp.comtnprocessmon.service.ComtnprocessmonDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnprocessmon.service.ComtnprocessmonVO;

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
 * @Class Name : ComtnprocessmonController.java
 * @Description : Comtnprocessmon Controller class
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
@SessionAttributes(types=ComtnprocessmonVO.class)
public class ComtnprocessmonController {

    @Resource(name = "comtnprocessmonService")
    private ComtnprocessmonService comtnprocessmonService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnprocessmon 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnprocessmonVO
	 * @return "/comtnprocessmon/ComtnprocessmonList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnprocessmon/ComtnprocessmonList.do")
    public String selectComtnprocessmonList(@ModelAttribute("searchVO") ComtnprocessmonVO searchVO, 
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
		
        List<EgovMap> comtnprocessmonList = comtnprocessmonService.selectComtnprocessmonList(searchVO);
        model.addAttribute("resultList", comtnprocessmonList);
        
        int totCnt = comtnprocessmonService.selectComtnprocessmonListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnprocessmon/ComtnprocessmonList";
    } 
    
    @RequestMapping("/comtnprocessmon/addComtnprocessmonView.do")
    public String addComtnprocessmonView(
            @ModelAttribute("searchVO") ComtnprocessmonDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnprocessmonVO", new ComtnprocessmonVO());
        return "/comtnprocessmon/ComtnprocessmonRegister";
    }
    
    @RequestMapping("/comtnprocessmon/addComtnprocessmon.do")
    public String addComtnprocessmon(
            ComtnprocessmonVO comtnprocessmonVO,
            @ModelAttribute("searchVO") ComtnprocessmonDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnprocessmonService.insertComtnprocessmon(comtnprocessmonVO);
        status.setComplete();
        return "forward:/comtnprocessmon/ComtnprocessmonList.do";
    }
    
    @RequestMapping("/comtnprocessmon/updateComtnprocessmonView.do")
    public String updateComtnprocessmonView(
            @RequestParam("procsId") String procsId ,
            @ModelAttribute("searchVO") ComtnprocessmonDefaultVO searchVO, Model model)
            throws Exception {
        ComtnprocessmonVO comtnprocessmonVO = new ComtnprocessmonVO();
        comtnprocessmonVO.setProcsId(procsId);
;        
        // 변수명은 CoC 에 따라 comtnprocessmonVO
        model.addAttribute(selectComtnprocessmon(comtnprocessmonVO, searchVO));
        return "/comtnprocessmon/ComtnprocessmonRegister";
    }

    @RequestMapping("/comtnprocessmon/selectComtnprocessmon.do")
    public @ModelAttribute("comtnprocessmonVO")
    ComtnprocessmonVO selectComtnprocessmon(
            ComtnprocessmonVO comtnprocessmonVO,
            @ModelAttribute("searchVO") ComtnprocessmonDefaultVO searchVO) throws Exception {
        return comtnprocessmonService.selectComtnprocessmon(comtnprocessmonVO);
    }

    @RequestMapping("/comtnprocessmon/updateComtnprocessmon.do")
    public String updateComtnprocessmon(
            ComtnprocessmonVO comtnprocessmonVO,
            @ModelAttribute("searchVO") ComtnprocessmonDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnprocessmonService.updateComtnprocessmon(comtnprocessmonVO);
        status.setComplete();
        return "forward:/comtnprocessmon/ComtnprocessmonList.do";
    }
    
    @RequestMapping("/comtnprocessmon/deleteComtnprocessmon.do")
    public String deleteComtnprocessmon(
            ComtnprocessmonVO comtnprocessmonVO,
            @ModelAttribute("searchVO") ComtnprocessmonDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnprocessmonService.deleteComtnprocessmon(comtnprocessmonVO);
        status.setComplete();
        return "forward:/comtnprocessmon/ComtnprocessmonList.do";
    }

}
