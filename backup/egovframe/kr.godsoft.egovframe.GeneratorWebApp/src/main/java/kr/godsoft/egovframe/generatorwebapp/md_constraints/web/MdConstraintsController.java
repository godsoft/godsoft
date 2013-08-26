package kr.godsoft.egovframe.generatorwebapp.md_constraints.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_constraints.service.MdConstraintsService;
import kr.godsoft.egovframe.generatorwebapp.md_constraints.service.MdConstraintsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.md_constraints.service.MdConstraintsVO;

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
 * @Class Name : MdConstraintsController.java
 * @Description : MdConstraints Controller class
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
public class MdConstraintsController {

    @Resource(name = "mdConstraintsService")
    private MdConstraintsService mdConstraintsService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MD_CONSTRAINTS 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MdConstraintsVO
	 * @return "/mdConstraints/MdConstraintsList"
	 * @exception Exception
	 */
    @RequestMapping(value="/mdConstraints/MdConstraintsList.do")
    public String selectMdConstraintsList(@ModelAttribute("searchVO") MdConstraintsVO searchVO, 
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
		
        List<EgovMap> mdConstraintsList = mdConstraintsService.selectMdConstraintsList(searchVO);
        model.addAttribute("resultList", mdConstraintsList);
        
        int totCnt = mdConstraintsService.selectMdConstraintsListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/mdConstraints/MdConstraintsList";
    } 
    
    @RequestMapping("/mdConstraints/addMdConstraintsView.do")
    public String addMdConstraintsView(
            @ModelAttribute("searchVO") MdConstraintsDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("mdConstraintsVO", new MdConstraintsVO());
        return "/mdConstraints/MdConstraintsRegister";
    }
    
    @RequestMapping("/mdConstraints/addMdConstraints.do")
    public String addMdConstraints(
            MdConstraintsVO mdConstraintsVO,
            @ModelAttribute("searchVO") MdConstraintsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdConstraintsService.insertMdConstraints(mdConstraintsVO);
        status.setComplete();
        return "forward:/mdConstraints/MdConstraintsList.do";
    }
    
    @RequestMapping("/mdConstraints/updateMdConstraintsView.do")
    public String updateMdConstraintsView(
            @RequestParam("id") String id ,
            @ModelAttribute("searchVO") MdConstraintsDefaultVO searchVO, Model model)
            throws Exception {
        MdConstraintsVO mdConstraintsVO = new MdConstraintsVO();
        mdConstraintsVO.setId(id);
;        
        // 변수명은 CoC 에 따라 mdConstraintsVO
        model.addAttribute(selectMdConstraints(mdConstraintsVO, searchVO));
        return "/mdConstraints/MdConstraintsRegister";
    }

    @RequestMapping("/mdConstraints/selectMdConstraints.do")
    public @ModelAttribute("mdConstraintsVO")
    MdConstraintsVO selectMdConstraints(
            MdConstraintsVO mdConstraintsVO,
            @ModelAttribute("searchVO") MdConstraintsDefaultVO searchVO) throws Exception {
        return mdConstraintsService.selectMdConstraints(mdConstraintsVO);
    }

    @RequestMapping("/mdConstraints/updateMdConstraints.do")
    public String updateMdConstraints(
            MdConstraintsVO mdConstraintsVO,
            @ModelAttribute("searchVO") MdConstraintsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdConstraintsService.updateMdConstraints(mdConstraintsVO);
        status.setComplete();
        return "forward:/mdConstraints/MdConstraintsList.do";
    }
    
    @RequestMapping("/mdConstraints/deleteMdConstraints.do")
    public String deleteMdConstraints(
            MdConstraintsVO mdConstraintsVO,
            @ModelAttribute("searchVO") MdConstraintsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdConstraintsService.deleteMdConstraints(mdConstraintsVO);
        status.setComplete();
        return "forward:/mdConstraints/MdConstraintsList.do";
    }

}
