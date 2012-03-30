package kr.godsoft.egovframe.generatorwebapp.md_schemas.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_schemas.service.MdSchemasService;
import kr.godsoft.egovframe.generatorwebapp.md_schemas.service.MdSchemasDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.md_schemas.service.MdSchemasVO;

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
 * @Class Name : MdSchemasController.java
 * @Description : MdSchemas Controller class
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
public class MdSchemasController {

    @Resource(name = "mdSchemasService")
    private MdSchemasService mdSchemasService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MD_SCHEMAS 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MdSchemasVO
	 * @return "/mdSchemas/MdSchemasList"
	 * @exception Exception
	 */
    @RequestMapping(value="/mdSchemas/MdSchemasList.do")
    public String selectMdSchemasList(@ModelAttribute("searchVO") MdSchemasVO searchVO, 
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
		
        List<EgovMap> mdSchemasList = mdSchemasService.selectMdSchemasList(searchVO);
        model.addAttribute("resultList", mdSchemasList);
        
        int totCnt = mdSchemasService.selectMdSchemasListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/mdSchemas/MdSchemasList";
    } 
    
    @RequestMapping("/mdSchemas/addMdSchemasView.do")
    public String addMdSchemasView(
            @ModelAttribute("searchVO") MdSchemasDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("mdSchemasVO", new MdSchemasVO());
        return "/mdSchemas/MdSchemasRegister";
    }
    
    @RequestMapping("/mdSchemas/addMdSchemas.do")
    public String addMdSchemas(
            MdSchemasVO mdSchemasVO,
            @ModelAttribute("searchVO") MdSchemasDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdSchemasService.insertMdSchemas(mdSchemasVO);
        status.setComplete();
        return "forward:/mdSchemas/MdSchemasList.do";
    }
    
    @RequestMapping("/mdSchemas/updateMdSchemasView.do")
    public String updateMdSchemasView(
            @RequestParam("id") String id ,
            @ModelAttribute("searchVO") MdSchemasDefaultVO searchVO, Model model)
            throws Exception {
        MdSchemasVO mdSchemasVO = new MdSchemasVO();
        mdSchemasVO.setId(id);
;        
        // 변수명은 CoC 에 따라 mdSchemasVO
        model.addAttribute(selectMdSchemas(mdSchemasVO, searchVO));
        return "/mdSchemas/MdSchemasRegister";
    }

    @RequestMapping("/mdSchemas/selectMdSchemas.do")
    public @ModelAttribute("mdSchemasVO")
    MdSchemasVO selectMdSchemas(
            MdSchemasVO mdSchemasVO,
            @ModelAttribute("searchVO") MdSchemasDefaultVO searchVO) throws Exception {
        return mdSchemasService.selectMdSchemas(mdSchemasVO);
    }

    @RequestMapping("/mdSchemas/updateMdSchemas.do")
    public String updateMdSchemas(
            MdSchemasVO mdSchemasVO,
            @ModelAttribute("searchVO") MdSchemasDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdSchemasService.updateMdSchemas(mdSchemasVO);
        status.setComplete();
        return "forward:/mdSchemas/MdSchemasList.do";
    }
    
    @RequestMapping("/mdSchemas/deleteMdSchemas.do")
    public String deleteMdSchemas(
            MdSchemasVO mdSchemasVO,
            @ModelAttribute("searchVO") MdSchemasDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdSchemasService.deleteMdSchemas(mdSchemasVO);
        status.setComplete();
        return "forward:/mdSchemas/MdSchemasList.do";
    }

}
