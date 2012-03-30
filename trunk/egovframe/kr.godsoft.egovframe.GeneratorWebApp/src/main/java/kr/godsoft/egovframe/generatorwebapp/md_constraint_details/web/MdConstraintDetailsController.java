package kr.godsoft.egovframe.generatorwebapp.md_constraint_details.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_constraint_details.service.MdConstraintDetailsService;
import kr.godsoft.egovframe.generatorwebapp.md_constraint_details.service.MdConstraintDetailsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.md_constraint_details.service.MdConstraintDetailsVO;

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
 * @Class Name : MdConstraintDetailsController.java
 * @Description : MdConstraintDetails Controller class
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
public class MdConstraintDetailsController {

    @Resource(name = "mdConstraintDetailsService")
    private MdConstraintDetailsService mdConstraintDetailsService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MD_CONSTRAINT_DETAILS 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MdConstraintDetailsVO
	 * @return "/mdConstraintDetails/MdConstraintDetailsList"
	 * @exception Exception
	 */
    @RequestMapping(value="/mdConstraintDetails/MdConstraintDetailsList.do")
    public String selectMdConstraintDetailsList(@ModelAttribute("searchVO") MdConstraintDetailsVO searchVO, 
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
		
        List<EgovMap> mdConstraintDetailsList = mdConstraintDetailsService.selectMdConstraintDetailsList(searchVO);
        model.addAttribute("resultList", mdConstraintDetailsList);
        
        int totCnt = mdConstraintDetailsService.selectMdConstraintDetailsListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/mdConstraintDetails/MdConstraintDetailsList";
    } 
    
    @RequestMapping("/mdConstraintDetails/addMdConstraintDetailsView.do")
    public String addMdConstraintDetailsView(
            @ModelAttribute("searchVO") MdConstraintDetailsDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("mdConstraintDetailsVO", new MdConstraintDetailsVO());
        return "/mdConstraintDetails/MdConstraintDetailsRegister";
    }
    
    @RequestMapping("/mdConstraintDetails/addMdConstraintDetails.do")
    public String addMdConstraintDetails(
            MdConstraintDetailsVO mdConstraintDetailsVO,
            @ModelAttribute("searchVO") MdConstraintDetailsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdConstraintDetailsService.insertMdConstraintDetails(mdConstraintDetailsVO);
        status.setComplete();
        return "forward:/mdConstraintDetails/MdConstraintDetailsList.do";
    }
    
    @RequestMapping("/mdConstraintDetails/updateMdConstraintDetailsView.do")
    public String updateMdConstraintDetailsView(
            @RequestParam("id") String id ,
            @ModelAttribute("searchVO") MdConstraintDetailsDefaultVO searchVO, Model model)
            throws Exception {
        MdConstraintDetailsVO mdConstraintDetailsVO = new MdConstraintDetailsVO();
        mdConstraintDetailsVO.setId(id);
;        
        // 변수명은 CoC 에 따라 mdConstraintDetailsVO
        model.addAttribute(selectMdConstraintDetails(mdConstraintDetailsVO, searchVO));
        return "/mdConstraintDetails/MdConstraintDetailsRegister";
    }

    @RequestMapping("/mdConstraintDetails/selectMdConstraintDetails.do")
    public @ModelAttribute("mdConstraintDetailsVO")
    MdConstraintDetailsVO selectMdConstraintDetails(
            MdConstraintDetailsVO mdConstraintDetailsVO,
            @ModelAttribute("searchVO") MdConstraintDetailsDefaultVO searchVO) throws Exception {
        return mdConstraintDetailsService.selectMdConstraintDetails(mdConstraintDetailsVO);
    }

    @RequestMapping("/mdConstraintDetails/updateMdConstraintDetails.do")
    public String updateMdConstraintDetails(
            MdConstraintDetailsVO mdConstraintDetailsVO,
            @ModelAttribute("searchVO") MdConstraintDetailsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdConstraintDetailsService.updateMdConstraintDetails(mdConstraintDetailsVO);
        status.setComplete();
        return "forward:/mdConstraintDetails/MdConstraintDetailsList.do";
    }
    
    @RequestMapping("/mdConstraintDetails/deleteMdConstraintDetails.do")
    public String deleteMdConstraintDetails(
            MdConstraintDetailsVO mdConstraintDetailsVO,
            @ModelAttribute("searchVO") MdConstraintDetailsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdConstraintDetailsService.deleteMdConstraintDetails(mdConstraintDetailsVO);
        status.setComplete();
        return "forward:/mdConstraintDetails/MdConstraintDetailsList.do";
    }

}
