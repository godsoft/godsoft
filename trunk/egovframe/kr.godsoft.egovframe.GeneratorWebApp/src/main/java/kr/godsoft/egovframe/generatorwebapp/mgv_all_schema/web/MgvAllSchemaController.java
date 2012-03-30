package kr.godsoft.egovframe.generatorwebapp.mgv_all_schema.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.mgv_all_schema.service.MgvAllSchemaService;
import kr.godsoft.egovframe.generatorwebapp.mgv_all_schema.service.MgvAllSchemaDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.mgv_all_schema.service.MgvAllSchemaVO;

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
 * @Class Name : MgvAllSchemaController.java
 * @Description : MgvAllSchema Controller class
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
public class MgvAllSchemaController {

    @Resource(name = "mgvAllSchemaService")
    private MgvAllSchemaService mgvAllSchemaService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MGV_ALL_SCHEMA 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MgvAllSchemaVO
	 * @return "/mgvAllSchema/MgvAllSchemaList"
	 * @exception Exception
	 */
    @RequestMapping(value="/mgvAllSchema/MgvAllSchemaList.do")
    public String selectMgvAllSchemaList(@ModelAttribute("searchVO") MgvAllSchemaVO searchVO, 
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
		
        List<EgovMap> mgvAllSchemaList = mgvAllSchemaService.selectMgvAllSchemaList(searchVO);
        model.addAttribute("resultList", mgvAllSchemaList);
        
        int totCnt = mgvAllSchemaService.selectMgvAllSchemaListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/mgvAllSchema/MgvAllSchemaList";
    } 
    
    @RequestMapping("/mgvAllSchema/addMgvAllSchemaView.do")
    public String addMgvAllSchemaView(
            @ModelAttribute("searchVO") MgvAllSchemaDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("mgvAllSchemaVO", new MgvAllSchemaVO());
        return "/mgvAllSchema/MgvAllSchemaRegister";
    }
    
    @RequestMapping("/mgvAllSchema/addMgvAllSchema.do")
    public String addMgvAllSchema(
            MgvAllSchemaVO mgvAllSchemaVO,
            @ModelAttribute("searchVO") MgvAllSchemaDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mgvAllSchemaService.insertMgvAllSchema(mgvAllSchemaVO);
        status.setComplete();
        return "forward:/mgvAllSchema/MgvAllSchemaList.do";
    }
    
    @RequestMapping("/mgvAllSchema/updateMgvAllSchemaView.do")
    public String updateMgvAllSchemaView(
            @ModelAttribute("searchVO") MgvAllSchemaDefaultVO searchVO, Model model)
            throws Exception {
        MgvAllSchemaVO mgvAllSchemaVO = new MgvAllSchemaVO();
;        
        // 변수명은 CoC 에 따라 mgvAllSchemaVO
        model.addAttribute(selectMgvAllSchema(mgvAllSchemaVO, searchVO));
        return "/mgvAllSchema/MgvAllSchemaRegister";
    }

    @RequestMapping("/mgvAllSchema/selectMgvAllSchema.do")
    public @ModelAttribute("mgvAllSchemaVO")
    MgvAllSchemaVO selectMgvAllSchema(
            MgvAllSchemaVO mgvAllSchemaVO,
            @ModelAttribute("searchVO") MgvAllSchemaDefaultVO searchVO) throws Exception {
        return mgvAllSchemaService.selectMgvAllSchema(mgvAllSchemaVO);
    }

    @RequestMapping("/mgvAllSchema/updateMgvAllSchema.do")
    public String updateMgvAllSchema(
            MgvAllSchemaVO mgvAllSchemaVO,
            @ModelAttribute("searchVO") MgvAllSchemaDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mgvAllSchemaService.updateMgvAllSchema(mgvAllSchemaVO);
        status.setComplete();
        return "forward:/mgvAllSchema/MgvAllSchemaList.do";
    }
    
    @RequestMapping("/mgvAllSchema/deleteMgvAllSchema.do")
    public String deleteMgvAllSchema(
            MgvAllSchemaVO mgvAllSchemaVO,
            @ModelAttribute("searchVO") MgvAllSchemaDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mgvAllSchemaService.deleteMgvAllSchema(mgvAllSchemaVO);
        status.setComplete();
        return "forward:/mgvAllSchema/MgvAllSchemaList.do";
    }

}
