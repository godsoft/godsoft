package kr.godsoft.egovframe.generatorwebapp.md_migr_weakdep.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_migr_weakdep.service.MdMigrWeakdepService;
import kr.godsoft.egovframe.generatorwebapp.md_migr_weakdep.service.MdMigrWeakdepDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.md_migr_weakdep.service.MdMigrWeakdepVO;

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
 * @Class Name : MdMigrWeakdepController.java
 * @Description : MdMigrWeakdep Controller class
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
public class MdMigrWeakdepController {

    @Resource(name = "mdMigrWeakdepService")
    private MdMigrWeakdepService mdMigrWeakdepService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MD_MIGR_WEAKDEP 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MdMigrWeakdepVO
	 * @return "/mdMigrWeakdep/MdMigrWeakdepList"
	 * @exception Exception
	 */
    @RequestMapping(value="/mdMigrWeakdep/MdMigrWeakdepList.do")
    public String selectMdMigrWeakdepList(@ModelAttribute("searchVO") MdMigrWeakdepVO searchVO, 
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
		
        List<EgovMap> mdMigrWeakdepList = mdMigrWeakdepService.selectMdMigrWeakdepList(searchVO);
        model.addAttribute("resultList", mdMigrWeakdepList);
        
        int totCnt = mdMigrWeakdepService.selectMdMigrWeakdepListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/mdMigrWeakdep/MdMigrWeakdepList";
    } 
    
    @RequestMapping("/mdMigrWeakdep/addMdMigrWeakdepView.do")
    public String addMdMigrWeakdepView(
            @ModelAttribute("searchVO") MdMigrWeakdepDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("mdMigrWeakdepVO", new MdMigrWeakdepVO());
        return "/mdMigrWeakdep/MdMigrWeakdepRegister";
    }
    
    @RequestMapping("/mdMigrWeakdep/addMdMigrWeakdep.do")
    public String addMdMigrWeakdep(
            MdMigrWeakdepVO mdMigrWeakdepVO,
            @ModelAttribute("searchVO") MdMigrWeakdepDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdMigrWeakdepService.insertMdMigrWeakdep(mdMigrWeakdepVO);
        status.setComplete();
        return "forward:/mdMigrWeakdep/MdMigrWeakdepList.do";
    }
    
    @RequestMapping("/mdMigrWeakdep/updateMdMigrWeakdepView.do")
    public String updateMdMigrWeakdepView(
            @RequestParam("id") String id ,
            @ModelAttribute("searchVO") MdMigrWeakdepDefaultVO searchVO, Model model)
            throws Exception {
        MdMigrWeakdepVO mdMigrWeakdepVO = new MdMigrWeakdepVO();
        mdMigrWeakdepVO.setId(id);
;        
        // 변수명은 CoC 에 따라 mdMigrWeakdepVO
        model.addAttribute(selectMdMigrWeakdep(mdMigrWeakdepVO, searchVO));
        return "/mdMigrWeakdep/MdMigrWeakdepRegister";
    }

    @RequestMapping("/mdMigrWeakdep/selectMdMigrWeakdep.do")
    public @ModelAttribute("mdMigrWeakdepVO")
    MdMigrWeakdepVO selectMdMigrWeakdep(
            MdMigrWeakdepVO mdMigrWeakdepVO,
            @ModelAttribute("searchVO") MdMigrWeakdepDefaultVO searchVO) throws Exception {
        return mdMigrWeakdepService.selectMdMigrWeakdep(mdMigrWeakdepVO);
    }

    @RequestMapping("/mdMigrWeakdep/updateMdMigrWeakdep.do")
    public String updateMdMigrWeakdep(
            MdMigrWeakdepVO mdMigrWeakdepVO,
            @ModelAttribute("searchVO") MdMigrWeakdepDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdMigrWeakdepService.updateMdMigrWeakdep(mdMigrWeakdepVO);
        status.setComplete();
        return "forward:/mdMigrWeakdep/MdMigrWeakdepList.do";
    }
    
    @RequestMapping("/mdMigrWeakdep/deleteMdMigrWeakdep.do")
    public String deleteMdMigrWeakdep(
            MdMigrWeakdepVO mdMigrWeakdepVO,
            @ModelAttribute("searchVO") MdMigrWeakdepDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdMigrWeakdepService.deleteMdMigrWeakdep(mdMigrWeakdepVO);
        status.setComplete();
        return "forward:/mdMigrWeakdep/MdMigrWeakdepList.do";
    }

}
