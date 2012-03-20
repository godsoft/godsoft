package kr.godsoft.egovframe.generatorwebapp.comtnbatchopert.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnbatchopert.service.ComtnbatchopertService;
import kr.godsoft.egovframe.generatorwebapp.comtnbatchopert.service.ComtnbatchopertDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbatchopert.service.ComtnbatchopertVO;

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
 * @Class Name : ComtnbatchopertController.java
 * @Description : Comtnbatchopert Controller class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Controller
public class ComtnbatchopertController {

    @Resource(name = "comtnbatchopertService")
    private ComtnbatchopertService comtnbatchopertService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnbatchopert 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnbatchopertVO
	 * @return "/comtnbatchopert/ComtnbatchopertList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnbatchopert/ComtnbatchopertList.do")
    public String selectComtnbatchopertList(@ModelAttribute("searchVO") ComtnbatchopertVO searchVO, 
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
		
        List<EgovMap> comtnbatchopertList = comtnbatchopertService.selectComtnbatchopertList(searchVO);
        model.addAttribute("resultList", comtnbatchopertList);
        
        int totCnt = comtnbatchopertService.selectComtnbatchopertListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnbatchopert/ComtnbatchopertList";
    } 
    
    @RequestMapping("/comtnbatchopert/addComtnbatchopertView.do")
    public String addComtnbatchopertView(
            @ModelAttribute("searchVO") ComtnbatchopertDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnbatchopertVO", new ComtnbatchopertVO());
        return "/comtnbatchopert/ComtnbatchopertRegister";
    }
    
    @RequestMapping("/comtnbatchopert/addComtnbatchopert.do")
    public String addComtnbatchopert(
            ComtnbatchopertVO comtnbatchopertVO,
            @ModelAttribute("searchVO") ComtnbatchopertDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbatchopertService.insertComtnbatchopert(comtnbatchopertVO);
        status.setComplete();
        return "forward:/comtnbatchopert/ComtnbatchopertList.do";
    }
    
    @RequestMapping("/comtnbatchopert/updateComtnbatchopertView.do")
    public String updateComtnbatchopertView(
            @RequestParam("batchOpertId") String batchOpertId ,
            @ModelAttribute("searchVO") ComtnbatchopertDefaultVO searchVO, Model model)
            throws Exception {
        ComtnbatchopertVO comtnbatchopertVO = new ComtnbatchopertVO();
        comtnbatchopertVO.setBatchOpertId(batchOpertId);
;        
        // 변수명은 CoC 에 따라 comtnbatchopertVO
        model.addAttribute(selectComtnbatchopert(comtnbatchopertVO, searchVO));
        return "/comtnbatchopert/ComtnbatchopertRegister";
    }

    @RequestMapping("/comtnbatchopert/selectComtnbatchopert.do")
    public @ModelAttribute("comtnbatchopertVO")
    ComtnbatchopertVO selectComtnbatchopert(
            ComtnbatchopertVO comtnbatchopertVO,
            @ModelAttribute("searchVO") ComtnbatchopertDefaultVO searchVO) throws Exception {
        return comtnbatchopertService.selectComtnbatchopert(comtnbatchopertVO);
    }

    @RequestMapping("/comtnbatchopert/updateComtnbatchopert.do")
    public String updateComtnbatchopert(
            ComtnbatchopertVO comtnbatchopertVO,
            @ModelAttribute("searchVO") ComtnbatchopertDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbatchopertService.updateComtnbatchopert(comtnbatchopertVO);
        status.setComplete();
        return "forward:/comtnbatchopert/ComtnbatchopertList.do";
    }
    
    @RequestMapping("/comtnbatchopert/deleteComtnbatchopert.do")
    public String deleteComtnbatchopert(
            ComtnbatchopertVO comtnbatchopertVO,
            @ModelAttribute("searchVO") ComtnbatchopertDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbatchopertService.deleteComtnbatchopert(comtnbatchopertVO);
        status.setComplete();
        return "forward:/comtnbatchopert/ComtnbatchopertList.do";
    }

}
