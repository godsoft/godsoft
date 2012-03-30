package kr.godsoft.egovframe.generatorwebapp.md_index_details.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_index_details.service.MdIndexDetailsService;
import kr.godsoft.egovframe.generatorwebapp.md_index_details.service.MdIndexDetailsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.md_index_details.service.MdIndexDetailsVO;

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
 * @Class Name : MdIndexDetailsController.java
 * @Description : MdIndexDetails Controller class
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
public class MdIndexDetailsController {

    @Resource(name = "mdIndexDetailsService")
    private MdIndexDetailsService mdIndexDetailsService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MD_INDEX_DETAILS 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MdIndexDetailsVO
	 * @return "/mdIndexDetails/MdIndexDetailsList"
	 * @exception Exception
	 */
    @RequestMapping(value="/mdIndexDetails/MdIndexDetailsList.do")
    public String selectMdIndexDetailsList(@ModelAttribute("searchVO") MdIndexDetailsVO searchVO, 
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
		
        List<EgovMap> mdIndexDetailsList = mdIndexDetailsService.selectMdIndexDetailsList(searchVO);
        model.addAttribute("resultList", mdIndexDetailsList);
        
        int totCnt = mdIndexDetailsService.selectMdIndexDetailsListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/mdIndexDetails/MdIndexDetailsList";
    } 
    
    @RequestMapping("/mdIndexDetails/addMdIndexDetailsView.do")
    public String addMdIndexDetailsView(
            @ModelAttribute("searchVO") MdIndexDetailsDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("mdIndexDetailsVO", new MdIndexDetailsVO());
        return "/mdIndexDetails/MdIndexDetailsRegister";
    }
    
    @RequestMapping("/mdIndexDetails/addMdIndexDetails.do")
    public String addMdIndexDetails(
            MdIndexDetailsVO mdIndexDetailsVO,
            @ModelAttribute("searchVO") MdIndexDetailsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdIndexDetailsService.insertMdIndexDetails(mdIndexDetailsVO);
        status.setComplete();
        return "forward:/mdIndexDetails/MdIndexDetailsList.do";
    }
    
    @RequestMapping("/mdIndexDetails/updateMdIndexDetailsView.do")
    public String updateMdIndexDetailsView(
            @RequestParam("id") String id ,
            @ModelAttribute("searchVO") MdIndexDetailsDefaultVO searchVO, Model model)
            throws Exception {
        MdIndexDetailsVO mdIndexDetailsVO = new MdIndexDetailsVO();
        mdIndexDetailsVO.setId(id);
;        
        // 변수명은 CoC 에 따라 mdIndexDetailsVO
        model.addAttribute(selectMdIndexDetails(mdIndexDetailsVO, searchVO));
        return "/mdIndexDetails/MdIndexDetailsRegister";
    }

    @RequestMapping("/mdIndexDetails/selectMdIndexDetails.do")
    public @ModelAttribute("mdIndexDetailsVO")
    MdIndexDetailsVO selectMdIndexDetails(
            MdIndexDetailsVO mdIndexDetailsVO,
            @ModelAttribute("searchVO") MdIndexDetailsDefaultVO searchVO) throws Exception {
        return mdIndexDetailsService.selectMdIndexDetails(mdIndexDetailsVO);
    }

    @RequestMapping("/mdIndexDetails/updateMdIndexDetails.do")
    public String updateMdIndexDetails(
            MdIndexDetailsVO mdIndexDetailsVO,
            @ModelAttribute("searchVO") MdIndexDetailsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdIndexDetailsService.updateMdIndexDetails(mdIndexDetailsVO);
        status.setComplete();
        return "forward:/mdIndexDetails/MdIndexDetailsList.do";
    }
    
    @RequestMapping("/mdIndexDetails/deleteMdIndexDetails.do")
    public String deleteMdIndexDetails(
            MdIndexDetailsVO mdIndexDetailsVO,
            @ModelAttribute("searchVO") MdIndexDetailsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdIndexDetailsService.deleteMdIndexDetails(mdIndexDetailsVO);
        status.setComplete();
        return "forward:/mdIndexDetails/MdIndexDetailsList.do";
    }

}
