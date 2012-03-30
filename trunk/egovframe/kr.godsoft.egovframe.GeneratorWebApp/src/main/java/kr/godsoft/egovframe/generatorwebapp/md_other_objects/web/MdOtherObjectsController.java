package kr.godsoft.egovframe.generatorwebapp.md_other_objects.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_other_objects.service.MdOtherObjectsService;
import kr.godsoft.egovframe.generatorwebapp.md_other_objects.service.MdOtherObjectsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.md_other_objects.service.MdOtherObjectsVO;

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
 * @Class Name : MdOtherObjectsController.java
 * @Description : MdOtherObjects Controller class
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
public class MdOtherObjectsController {

    @Resource(name = "mdOtherObjectsService")
    private MdOtherObjectsService mdOtherObjectsService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MD_OTHER_OBJECTS 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MdOtherObjectsVO
	 * @return "/mdOtherObjects/MdOtherObjectsList"
	 * @exception Exception
	 */
    @RequestMapping(value="/mdOtherObjects/MdOtherObjectsList.do")
    public String selectMdOtherObjectsList(@ModelAttribute("searchVO") MdOtherObjectsVO searchVO, 
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
		
        List<EgovMap> mdOtherObjectsList = mdOtherObjectsService.selectMdOtherObjectsList(searchVO);
        model.addAttribute("resultList", mdOtherObjectsList);
        
        int totCnt = mdOtherObjectsService.selectMdOtherObjectsListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/mdOtherObjects/MdOtherObjectsList";
    } 
    
    @RequestMapping("/mdOtherObjects/addMdOtherObjectsView.do")
    public String addMdOtherObjectsView(
            @ModelAttribute("searchVO") MdOtherObjectsDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("mdOtherObjectsVO", new MdOtherObjectsVO());
        return "/mdOtherObjects/MdOtherObjectsRegister";
    }
    
    @RequestMapping("/mdOtherObjects/addMdOtherObjects.do")
    public String addMdOtherObjects(
            MdOtherObjectsVO mdOtherObjectsVO,
            @ModelAttribute("searchVO") MdOtherObjectsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdOtherObjectsService.insertMdOtherObjects(mdOtherObjectsVO);
        status.setComplete();
        return "forward:/mdOtherObjects/MdOtherObjectsList.do";
    }
    
    @RequestMapping("/mdOtherObjects/updateMdOtherObjectsView.do")
    public String updateMdOtherObjectsView(
            @RequestParam("id") String id ,
            @ModelAttribute("searchVO") MdOtherObjectsDefaultVO searchVO, Model model)
            throws Exception {
        MdOtherObjectsVO mdOtherObjectsVO = new MdOtherObjectsVO();
        mdOtherObjectsVO.setId(id);
;        
        // 변수명은 CoC 에 따라 mdOtherObjectsVO
        model.addAttribute(selectMdOtherObjects(mdOtherObjectsVO, searchVO));
        return "/mdOtherObjects/MdOtherObjectsRegister";
    }

    @RequestMapping("/mdOtherObjects/selectMdOtherObjects.do")
    public @ModelAttribute("mdOtherObjectsVO")
    MdOtherObjectsVO selectMdOtherObjects(
            MdOtherObjectsVO mdOtherObjectsVO,
            @ModelAttribute("searchVO") MdOtherObjectsDefaultVO searchVO) throws Exception {
        return mdOtherObjectsService.selectMdOtherObjects(mdOtherObjectsVO);
    }

    @RequestMapping("/mdOtherObjects/updateMdOtherObjects.do")
    public String updateMdOtherObjects(
            MdOtherObjectsVO mdOtherObjectsVO,
            @ModelAttribute("searchVO") MdOtherObjectsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdOtherObjectsService.updateMdOtherObjects(mdOtherObjectsVO);
        status.setComplete();
        return "forward:/mdOtherObjects/MdOtherObjectsList.do";
    }
    
    @RequestMapping("/mdOtherObjects/deleteMdOtherObjects.do")
    public String deleteMdOtherObjects(
            MdOtherObjectsVO mdOtherObjectsVO,
            @ModelAttribute("searchVO") MdOtherObjectsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdOtherObjectsService.deleteMdOtherObjects(mdOtherObjectsVO);
        status.setComplete();
        return "forward:/mdOtherObjects/MdOtherObjectsList.do";
    }

}
