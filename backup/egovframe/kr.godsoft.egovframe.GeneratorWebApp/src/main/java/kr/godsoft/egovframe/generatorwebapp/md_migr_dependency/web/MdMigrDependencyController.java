package kr.godsoft.egovframe.generatorwebapp.md_migr_dependency.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_migr_dependency.service.MdMigrDependencyService;
import kr.godsoft.egovframe.generatorwebapp.md_migr_dependency.service.MdMigrDependencyDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.md_migr_dependency.service.MdMigrDependencyVO;

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
 * @Class Name : MdMigrDependencyController.java
 * @Description : MdMigrDependency Controller class
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
public class MdMigrDependencyController {

    @Resource(name = "mdMigrDependencyService")
    private MdMigrDependencyService mdMigrDependencyService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MD_MIGR_DEPENDENCY 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MdMigrDependencyVO
	 * @return "/mdMigrDependency/MdMigrDependencyList"
	 * @exception Exception
	 */
    @RequestMapping(value="/mdMigrDependency/MdMigrDependencyList.do")
    public String selectMdMigrDependencyList(@ModelAttribute("searchVO") MdMigrDependencyVO searchVO, 
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
		
        List<EgovMap> mdMigrDependencyList = mdMigrDependencyService.selectMdMigrDependencyList(searchVO);
        model.addAttribute("resultList", mdMigrDependencyList);
        
        int totCnt = mdMigrDependencyService.selectMdMigrDependencyListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/mdMigrDependency/MdMigrDependencyList";
    } 
    
    @RequestMapping("/mdMigrDependency/addMdMigrDependencyView.do")
    public String addMdMigrDependencyView(
            @ModelAttribute("searchVO") MdMigrDependencyDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("mdMigrDependencyVO", new MdMigrDependencyVO());
        return "/mdMigrDependency/MdMigrDependencyRegister";
    }
    
    @RequestMapping("/mdMigrDependency/addMdMigrDependency.do")
    public String addMdMigrDependency(
            MdMigrDependencyVO mdMigrDependencyVO,
            @ModelAttribute("searchVO") MdMigrDependencyDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdMigrDependencyService.insertMdMigrDependency(mdMigrDependencyVO);
        status.setComplete();
        return "forward:/mdMigrDependency/MdMigrDependencyList.do";
    }
    
    @RequestMapping("/mdMigrDependency/updateMdMigrDependencyView.do")
    public String updateMdMigrDependencyView(
            @RequestParam("id") String id ,
            @ModelAttribute("searchVO") MdMigrDependencyDefaultVO searchVO, Model model)
            throws Exception {
        MdMigrDependencyVO mdMigrDependencyVO = new MdMigrDependencyVO();
        mdMigrDependencyVO.setId(id);
;        
        // 변수명은 CoC 에 따라 mdMigrDependencyVO
        model.addAttribute(selectMdMigrDependency(mdMigrDependencyVO, searchVO));
        return "/mdMigrDependency/MdMigrDependencyRegister";
    }

    @RequestMapping("/mdMigrDependency/selectMdMigrDependency.do")
    public @ModelAttribute("mdMigrDependencyVO")
    MdMigrDependencyVO selectMdMigrDependency(
            MdMigrDependencyVO mdMigrDependencyVO,
            @ModelAttribute("searchVO") MdMigrDependencyDefaultVO searchVO) throws Exception {
        return mdMigrDependencyService.selectMdMigrDependency(mdMigrDependencyVO);
    }

    @RequestMapping("/mdMigrDependency/updateMdMigrDependency.do")
    public String updateMdMigrDependency(
            MdMigrDependencyVO mdMigrDependencyVO,
            @ModelAttribute("searchVO") MdMigrDependencyDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdMigrDependencyService.updateMdMigrDependency(mdMigrDependencyVO);
        status.setComplete();
        return "forward:/mdMigrDependency/MdMigrDependencyList.do";
    }
    
    @RequestMapping("/mdMigrDependency/deleteMdMigrDependency.do")
    public String deleteMdMigrDependency(
            MdMigrDependencyVO mdMigrDependencyVO,
            @ModelAttribute("searchVO") MdMigrDependencyDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdMigrDependencyService.deleteMdMigrDependency(mdMigrDependencyVO);
        status.setComplete();
        return "forward:/mdMigrDependency/MdMigrDependencyList.do";
    }

}
