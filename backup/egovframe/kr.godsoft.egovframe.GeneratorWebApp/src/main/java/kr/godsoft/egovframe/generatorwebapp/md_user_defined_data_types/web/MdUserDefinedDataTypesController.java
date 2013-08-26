package kr.godsoft.egovframe.generatorwebapp.md_user_defined_data_types.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_user_defined_data_types.service.MdUserDefinedDataTypesService;
import kr.godsoft.egovframe.generatorwebapp.md_user_defined_data_types.service.MdUserDefinedDataTypesDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.md_user_defined_data_types.service.MdUserDefinedDataTypesVO;

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
 * @Class Name : MdUserDefinedDataTypesController.java
 * @Description : MdUserDefinedDataTypes Controller class
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
public class MdUserDefinedDataTypesController {

    @Resource(name = "mdUserDefinedDataTypesService")
    private MdUserDefinedDataTypesService mdUserDefinedDataTypesService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MD_USER_DEFINED_DATA_TYPES 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MdUserDefinedDataTypesVO
	 * @return "/mdUserDefinedDataTypes/MdUserDefinedDataTypesList"
	 * @exception Exception
	 */
    @RequestMapping(value="/mdUserDefinedDataTypes/MdUserDefinedDataTypesList.do")
    public String selectMdUserDefinedDataTypesList(@ModelAttribute("searchVO") MdUserDefinedDataTypesVO searchVO, 
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
		
        List<EgovMap> mdUserDefinedDataTypesList = mdUserDefinedDataTypesService.selectMdUserDefinedDataTypesList(searchVO);
        model.addAttribute("resultList", mdUserDefinedDataTypesList);
        
        int totCnt = mdUserDefinedDataTypesService.selectMdUserDefinedDataTypesListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/mdUserDefinedDataTypes/MdUserDefinedDataTypesList";
    } 
    
    @RequestMapping("/mdUserDefinedDataTypes/addMdUserDefinedDataTypesView.do")
    public String addMdUserDefinedDataTypesView(
            @ModelAttribute("searchVO") MdUserDefinedDataTypesDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("mdUserDefinedDataTypesVO", new MdUserDefinedDataTypesVO());
        return "/mdUserDefinedDataTypes/MdUserDefinedDataTypesRegister";
    }
    
    @RequestMapping("/mdUserDefinedDataTypes/addMdUserDefinedDataTypes.do")
    public String addMdUserDefinedDataTypes(
            MdUserDefinedDataTypesVO mdUserDefinedDataTypesVO,
            @ModelAttribute("searchVO") MdUserDefinedDataTypesDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdUserDefinedDataTypesService.insertMdUserDefinedDataTypes(mdUserDefinedDataTypesVO);
        status.setComplete();
        return "forward:/mdUserDefinedDataTypes/MdUserDefinedDataTypesList.do";
    }
    
    @RequestMapping("/mdUserDefinedDataTypes/updateMdUserDefinedDataTypesView.do")
    public String updateMdUserDefinedDataTypesView(
            @RequestParam("id") String id ,
            @ModelAttribute("searchVO") MdUserDefinedDataTypesDefaultVO searchVO, Model model)
            throws Exception {
        MdUserDefinedDataTypesVO mdUserDefinedDataTypesVO = new MdUserDefinedDataTypesVO();
        mdUserDefinedDataTypesVO.setId(id);
;        
        // 변수명은 CoC 에 따라 mdUserDefinedDataTypesVO
        model.addAttribute(selectMdUserDefinedDataTypes(mdUserDefinedDataTypesVO, searchVO));
        return "/mdUserDefinedDataTypes/MdUserDefinedDataTypesRegister";
    }

    @RequestMapping("/mdUserDefinedDataTypes/selectMdUserDefinedDataTypes.do")
    public @ModelAttribute("mdUserDefinedDataTypesVO")
    MdUserDefinedDataTypesVO selectMdUserDefinedDataTypes(
            MdUserDefinedDataTypesVO mdUserDefinedDataTypesVO,
            @ModelAttribute("searchVO") MdUserDefinedDataTypesDefaultVO searchVO) throws Exception {
        return mdUserDefinedDataTypesService.selectMdUserDefinedDataTypes(mdUserDefinedDataTypesVO);
    }

    @RequestMapping("/mdUserDefinedDataTypes/updateMdUserDefinedDataTypes.do")
    public String updateMdUserDefinedDataTypes(
            MdUserDefinedDataTypesVO mdUserDefinedDataTypesVO,
            @ModelAttribute("searchVO") MdUserDefinedDataTypesDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdUserDefinedDataTypesService.updateMdUserDefinedDataTypes(mdUserDefinedDataTypesVO);
        status.setComplete();
        return "forward:/mdUserDefinedDataTypes/MdUserDefinedDataTypesList.do";
    }
    
    @RequestMapping("/mdUserDefinedDataTypes/deleteMdUserDefinedDataTypes.do")
    public String deleteMdUserDefinedDataTypes(
            MdUserDefinedDataTypesVO mdUserDefinedDataTypesVO,
            @ModelAttribute("searchVO") MdUserDefinedDataTypesDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdUserDefinedDataTypesService.deleteMdUserDefinedDataTypes(mdUserDefinedDataTypesVO);
        status.setComplete();
        return "forward:/mdUserDefinedDataTypes/MdUserDefinedDataTypesList.do";
    }

}
