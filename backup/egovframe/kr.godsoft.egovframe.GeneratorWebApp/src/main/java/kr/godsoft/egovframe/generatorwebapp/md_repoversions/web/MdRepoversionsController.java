package kr.godsoft.egovframe.generatorwebapp.md_repoversions.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_repoversions.service.MdRepoversionsService;
import kr.godsoft.egovframe.generatorwebapp.md_repoversions.service.MdRepoversionsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.md_repoversions.service.MdRepoversionsVO;

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
 * @Class Name : MdRepoversionsController.java
 * @Description : MdRepoversions Controller class
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
public class MdRepoversionsController {

    @Resource(name = "mdRepoversionsService")
    private MdRepoversionsService mdRepoversionsService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MD_REPOVERSIONS 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MdRepoversionsVO
	 * @return "/mdRepoversions/MdRepoversionsList"
	 * @exception Exception
	 */
    @RequestMapping(value="/mdRepoversions/MdRepoversionsList.do")
    public String selectMdRepoversionsList(@ModelAttribute("searchVO") MdRepoversionsVO searchVO, 
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
		
        List<EgovMap> mdRepoversionsList = mdRepoversionsService.selectMdRepoversionsList(searchVO);
        model.addAttribute("resultList", mdRepoversionsList);
        
        int totCnt = mdRepoversionsService.selectMdRepoversionsListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/mdRepoversions/MdRepoversionsList";
    } 
    
    @RequestMapping("/mdRepoversions/addMdRepoversionsView.do")
    public String addMdRepoversionsView(
            @ModelAttribute("searchVO") MdRepoversionsDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("mdRepoversionsVO", new MdRepoversionsVO());
        return "/mdRepoversions/MdRepoversionsRegister";
    }
    
    @RequestMapping("/mdRepoversions/addMdRepoversions.do")
    public String addMdRepoversions(
            MdRepoversionsVO mdRepoversionsVO,
            @ModelAttribute("searchVO") MdRepoversionsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdRepoversionsService.insertMdRepoversions(mdRepoversionsVO);
        status.setComplete();
        return "forward:/mdRepoversions/MdRepoversionsList.do";
    }
    
    @RequestMapping("/mdRepoversions/updateMdRepoversionsView.do")
    public String updateMdRepoversionsView(
            @ModelAttribute("searchVO") MdRepoversionsDefaultVO searchVO, Model model)
            throws Exception {
        MdRepoversionsVO mdRepoversionsVO = new MdRepoversionsVO();
;        
        // 변수명은 CoC 에 따라 mdRepoversionsVO
        model.addAttribute(selectMdRepoversions(mdRepoversionsVO, searchVO));
        return "/mdRepoversions/MdRepoversionsRegister";
    }

    @RequestMapping("/mdRepoversions/selectMdRepoversions.do")
    public @ModelAttribute("mdRepoversionsVO")
    MdRepoversionsVO selectMdRepoversions(
            MdRepoversionsVO mdRepoversionsVO,
            @ModelAttribute("searchVO") MdRepoversionsDefaultVO searchVO) throws Exception {
        return mdRepoversionsService.selectMdRepoversions(mdRepoversionsVO);
    }

    @RequestMapping("/mdRepoversions/updateMdRepoversions.do")
    public String updateMdRepoversions(
            MdRepoversionsVO mdRepoversionsVO,
            @ModelAttribute("searchVO") MdRepoversionsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdRepoversionsService.updateMdRepoversions(mdRepoversionsVO);
        status.setComplete();
        return "forward:/mdRepoversions/MdRepoversionsList.do";
    }
    
    @RequestMapping("/mdRepoversions/deleteMdRepoversions.do")
    public String deleteMdRepoversions(
            MdRepoversionsVO mdRepoversionsVO,
            @ModelAttribute("searchVO") MdRepoversionsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdRepoversionsService.deleteMdRepoversions(mdRepoversionsVO);
        status.setComplete();
        return "forward:/mdRepoversions/MdRepoversionsList.do";
    }

}
