package kr.godsoft.egovframe.generatorwebapp.md_migr_parameter.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_migr_parameter.service.MdMigrParameterService;
import kr.godsoft.egovframe.generatorwebapp.md_migr_parameter.service.MdMigrParameterDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.md_migr_parameter.service.MdMigrParameterVO;

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
 * @Class Name : MdMigrParameterController.java
 * @Description : MdMigrParameter Controller class
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
public class MdMigrParameterController {

    @Resource(name = "mdMigrParameterService")
    private MdMigrParameterService mdMigrParameterService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MD_MIGR_PARAMETER 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MdMigrParameterVO
	 * @return "/mdMigrParameter/MdMigrParameterList"
	 * @exception Exception
	 */
    @RequestMapping(value="/mdMigrParameter/MdMigrParameterList.do")
    public String selectMdMigrParameterList(@ModelAttribute("searchVO") MdMigrParameterVO searchVO, 
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
		
        List<EgovMap> mdMigrParameterList = mdMigrParameterService.selectMdMigrParameterList(searchVO);
        model.addAttribute("resultList", mdMigrParameterList);
        
        int totCnt = mdMigrParameterService.selectMdMigrParameterListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/mdMigrParameter/MdMigrParameterList";
    } 
    
    @RequestMapping("/mdMigrParameter/addMdMigrParameterView.do")
    public String addMdMigrParameterView(
            @ModelAttribute("searchVO") MdMigrParameterDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("mdMigrParameterVO", new MdMigrParameterVO());
        return "/mdMigrParameter/MdMigrParameterRegister";
    }
    
    @RequestMapping("/mdMigrParameter/addMdMigrParameter.do")
    public String addMdMigrParameter(
            MdMigrParameterVO mdMigrParameterVO,
            @ModelAttribute("searchVO") MdMigrParameterDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdMigrParameterService.insertMdMigrParameter(mdMigrParameterVO);
        status.setComplete();
        return "forward:/mdMigrParameter/MdMigrParameterList.do";
    }
    
    @RequestMapping("/mdMigrParameter/updateMdMigrParameterView.do")
    public String updateMdMigrParameterView(
            @RequestParam("id") String id ,
            @ModelAttribute("searchVO") MdMigrParameterDefaultVO searchVO, Model model)
            throws Exception {
        MdMigrParameterVO mdMigrParameterVO = new MdMigrParameterVO();
        mdMigrParameterVO.setId(id);
;        
        // 변수명은 CoC 에 따라 mdMigrParameterVO
        model.addAttribute(selectMdMigrParameter(mdMigrParameterVO, searchVO));
        return "/mdMigrParameter/MdMigrParameterRegister";
    }

    @RequestMapping("/mdMigrParameter/selectMdMigrParameter.do")
    public @ModelAttribute("mdMigrParameterVO")
    MdMigrParameterVO selectMdMigrParameter(
            MdMigrParameterVO mdMigrParameterVO,
            @ModelAttribute("searchVO") MdMigrParameterDefaultVO searchVO) throws Exception {
        return mdMigrParameterService.selectMdMigrParameter(mdMigrParameterVO);
    }

    @RequestMapping("/mdMigrParameter/updateMdMigrParameter.do")
    public String updateMdMigrParameter(
            MdMigrParameterVO mdMigrParameterVO,
            @ModelAttribute("searchVO") MdMigrParameterDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdMigrParameterService.updateMdMigrParameter(mdMigrParameterVO);
        status.setComplete();
        return "forward:/mdMigrParameter/MdMigrParameterList.do";
    }
    
    @RequestMapping("/mdMigrParameter/deleteMdMigrParameter.do")
    public String deleteMdMigrParameter(
            MdMigrParameterVO mdMigrParameterVO,
            @ModelAttribute("searchVO") MdMigrParameterDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdMigrParameterService.deleteMdMigrParameter(mdMigrParameterVO);
        status.setComplete();
        return "forward:/mdMigrParameter/MdMigrParameterList.do";
    }

}
