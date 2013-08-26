package kr.godsoft.egovframe.generatorwebapp.md_additional_properties.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_additional_properties.service.MdAdditionalPropertiesService;
import kr.godsoft.egovframe.generatorwebapp.md_additional_properties.service.MdAdditionalPropertiesDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.md_additional_properties.service.MdAdditionalPropertiesVO;

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
 * @Class Name : MdAdditionalPropertiesController.java
 * @Description : MdAdditionalProperties Controller class
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
public class MdAdditionalPropertiesController {

    @Resource(name = "mdAdditionalPropertiesService")
    private MdAdditionalPropertiesService mdAdditionalPropertiesService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MD_ADDITIONAL_PROPERTIES 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MdAdditionalPropertiesVO
	 * @return "/mdAdditionalProperties/MdAdditionalPropertiesList"
	 * @exception Exception
	 */
    @RequestMapping(value="/mdAdditionalProperties/MdAdditionalPropertiesList.do")
    public String selectMdAdditionalPropertiesList(@ModelAttribute("searchVO") MdAdditionalPropertiesVO searchVO, 
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
		
        List<EgovMap> mdAdditionalPropertiesList = mdAdditionalPropertiesService.selectMdAdditionalPropertiesList(searchVO);
        model.addAttribute("resultList", mdAdditionalPropertiesList);
        
        int totCnt = mdAdditionalPropertiesService.selectMdAdditionalPropertiesListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/mdAdditionalProperties/MdAdditionalPropertiesList";
    } 
    
    @RequestMapping("/mdAdditionalProperties/addMdAdditionalPropertiesView.do")
    public String addMdAdditionalPropertiesView(
            @ModelAttribute("searchVO") MdAdditionalPropertiesDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("mdAdditionalPropertiesVO", new MdAdditionalPropertiesVO());
        return "/mdAdditionalProperties/MdAdditionalPropertiesRegister";
    }
    
    @RequestMapping("/mdAdditionalProperties/addMdAdditionalProperties.do")
    public String addMdAdditionalProperties(
            MdAdditionalPropertiesVO mdAdditionalPropertiesVO,
            @ModelAttribute("searchVO") MdAdditionalPropertiesDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdAdditionalPropertiesService.insertMdAdditionalProperties(mdAdditionalPropertiesVO);
        status.setComplete();
        return "forward:/mdAdditionalProperties/MdAdditionalPropertiesList.do";
    }
    
    @RequestMapping("/mdAdditionalProperties/updateMdAdditionalPropertiesView.do")
    public String updateMdAdditionalPropertiesView(
            @RequestParam("id") String id ,
            @ModelAttribute("searchVO") MdAdditionalPropertiesDefaultVO searchVO, Model model)
            throws Exception {
        MdAdditionalPropertiesVO mdAdditionalPropertiesVO = new MdAdditionalPropertiesVO();
        mdAdditionalPropertiesVO.setId(id);
;        
        // 변수명은 CoC 에 따라 mdAdditionalPropertiesVO
        model.addAttribute(selectMdAdditionalProperties(mdAdditionalPropertiesVO, searchVO));
        return "/mdAdditionalProperties/MdAdditionalPropertiesRegister";
    }

    @RequestMapping("/mdAdditionalProperties/selectMdAdditionalProperties.do")
    public @ModelAttribute("mdAdditionalPropertiesVO")
    MdAdditionalPropertiesVO selectMdAdditionalProperties(
            MdAdditionalPropertiesVO mdAdditionalPropertiesVO,
            @ModelAttribute("searchVO") MdAdditionalPropertiesDefaultVO searchVO) throws Exception {
        return mdAdditionalPropertiesService.selectMdAdditionalProperties(mdAdditionalPropertiesVO);
    }

    @RequestMapping("/mdAdditionalProperties/updateMdAdditionalProperties.do")
    public String updateMdAdditionalProperties(
            MdAdditionalPropertiesVO mdAdditionalPropertiesVO,
            @ModelAttribute("searchVO") MdAdditionalPropertiesDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdAdditionalPropertiesService.updateMdAdditionalProperties(mdAdditionalPropertiesVO);
        status.setComplete();
        return "forward:/mdAdditionalProperties/MdAdditionalPropertiesList.do";
    }
    
    @RequestMapping("/mdAdditionalProperties/deleteMdAdditionalProperties.do")
    public String deleteMdAdditionalProperties(
            MdAdditionalPropertiesVO mdAdditionalPropertiesVO,
            @ModelAttribute("searchVO") MdAdditionalPropertiesDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdAdditionalPropertiesService.deleteMdAdditionalProperties(mdAdditionalPropertiesVO);
        status.setComplete();
        return "forward:/mdAdditionalProperties/MdAdditionalPropertiesList.do";
    }

}
