package kr.godsoft.egovframe.generatorwebapp.comtnauthorrolerelate.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import egovframework.rte.fdl.property.EgovPropertyService;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;

import kr.godsoft.egovframe.generatorwebapp.comtnauthorrolerelate.service.ComtnauthorrolerelateService;
import kr.godsoft.egovframe.generatorwebapp.comtnauthorrolerelate.service.ComtnauthorrolerelateDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnauthorrolerelate.service.ComtnauthorrolerelateVO;

/**
 * @Class Name : ComtnauthorrolerelateController.java
 * @Description : Comtnauthorrolerelate Controller class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Controller
@SessionAttributes(types=ComtnauthorrolerelateVO.class)
public class ComtnauthorrolerelateController {

    @Resource(name = "comtnauthorrolerelateService")
    private ComtnauthorrolerelateService comtnauthorrolerelateService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnauthorrolerelate 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnauthorrolerelateDefaultVO
	 * @return "/comtnauthorrolerelate/ComtnauthorrolerelateList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnauthorrolerelate/ComtnauthorrolerelateList.do")
    public String selectComtnauthorrolerelateList(@ModelAttribute("searchVO") ComtnauthorrolerelateDefaultVO searchVO, 
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
		
        List comtnauthorrolerelateList = comtnauthorrolerelateService.selectComtnauthorrolerelateList(searchVO);
        model.addAttribute("resultList", comtnauthorrolerelateList);
        
        int totCnt = comtnauthorrolerelateService.selectComtnauthorrolerelateListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnauthorrolerelate/ComtnauthorrolerelateList";
    } 
    
    @RequestMapping("/comtnauthorrolerelate/addComtnauthorrolerelateView.do")
    public String addComtnauthorrolerelateView(
            @ModelAttribute("searchVO") ComtnauthorrolerelateDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnauthorrolerelateVO", new ComtnauthorrolerelateVO());
        return "/comtnauthorrolerelate/ComtnauthorrolerelateRegister";
    }
    
    @RequestMapping("/comtnauthorrolerelate/addComtnauthorrolerelate.do")
    public String addComtnauthorrolerelate(
            ComtnauthorrolerelateVO comtnauthorrolerelateVO,
            @ModelAttribute("searchVO") ComtnauthorrolerelateDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnauthorrolerelateService.insertComtnauthorrolerelate(comtnauthorrolerelateVO);
        status.setComplete();
        return "forward:/comtnauthorrolerelate/ComtnauthorrolerelateList.do";
    }
    
    @RequestMapping("/comtnauthorrolerelate/updateComtnauthorrolerelateView.do")
    public String updateComtnauthorrolerelateView(
            @RequestParam("authorCode") String authorCode ,
            @RequestParam("roleCode") String roleCode ,
            @ModelAttribute("searchVO") ComtnauthorrolerelateDefaultVO searchVO, Model model)
            throws Exception {
        ComtnauthorrolerelateVO comtnauthorrolerelateVO = new ComtnauthorrolerelateVO();
        comtnauthorrolerelateVO.setAuthorCode(authorCode);
        comtnauthorrolerelateVO.setRoleCode(roleCode);
;        
        // 변수명은 CoC 에 따라 comtnauthorrolerelateVO
        model.addAttribute(selectComtnauthorrolerelate(comtnauthorrolerelateVO, searchVO));
        return "/comtnauthorrolerelate/ComtnauthorrolerelateRegister";
    }

    @RequestMapping("/comtnauthorrolerelate/selectComtnauthorrolerelate.do")
    public @ModelAttribute("comtnauthorrolerelateVO")
    ComtnauthorrolerelateVO selectComtnauthorrolerelate(
            ComtnauthorrolerelateVO comtnauthorrolerelateVO,
            @ModelAttribute("searchVO") ComtnauthorrolerelateDefaultVO searchVO) throws Exception {
        return comtnauthorrolerelateService.selectComtnauthorrolerelate(comtnauthorrolerelateVO);
    }

    @RequestMapping("/comtnauthorrolerelate/updateComtnauthorrolerelate.do")
    public String updateComtnauthorrolerelate(
            ComtnauthorrolerelateVO comtnauthorrolerelateVO,
            @ModelAttribute("searchVO") ComtnauthorrolerelateDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnauthorrolerelateService.updateComtnauthorrolerelate(comtnauthorrolerelateVO);
        status.setComplete();
        return "forward:/comtnauthorrolerelate/ComtnauthorrolerelateList.do";
    }
    
    @RequestMapping("/comtnauthorrolerelate/deleteComtnauthorrolerelate.do")
    public String deleteComtnauthorrolerelate(
            ComtnauthorrolerelateVO comtnauthorrolerelateVO,
            @ModelAttribute("searchVO") ComtnauthorrolerelateDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnauthorrolerelateService.deleteComtnauthorrolerelate(comtnauthorrolerelateVO);
        status.setComplete();
        return "forward:/comtnauthorrolerelate/ComtnauthorrolerelateList.do";
    }

}
