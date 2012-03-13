package kr.godsoft.egovframe.generatorwebapp.comtnuserabsnce.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtnuserabsnce.service.ComtnuserabsnceService;
import kr.godsoft.egovframe.generatorwebapp.comtnuserabsnce.service.ComtnuserabsnceDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnuserabsnce.service.ComtnuserabsnceVO;

/**
 * @Class Name : ComtnuserabsnceController.java
 * @Description : Comtnuserabsnce Controller class
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
@SessionAttributes(types=ComtnuserabsnceVO.class)
public class ComtnuserabsnceController {

    @Resource(name = "comtnuserabsnceService")
    private ComtnuserabsnceService comtnuserabsnceService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnuserabsnce 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnuserabsnceDefaultVO
	 * @return "/comtnuserabsnce/ComtnuserabsnceList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnuserabsnce/ComtnuserabsnceList.do")
    public String selectComtnuserabsnceList(@ModelAttribute("searchVO") ComtnuserabsnceDefaultVO searchVO, 
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
		
        List comtnuserabsnceList = comtnuserabsnceService.selectComtnuserabsnceList(searchVO);
        model.addAttribute("resultList", comtnuserabsnceList);
        
        int totCnt = comtnuserabsnceService.selectComtnuserabsnceListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnuserabsnce/ComtnuserabsnceList";
    } 
    
    @RequestMapping("/comtnuserabsnce/addComtnuserabsnceView.do")
    public String addComtnuserabsnceView(
            @ModelAttribute("searchVO") ComtnuserabsnceDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnuserabsnceVO", new ComtnuserabsnceVO());
        return "/comtnuserabsnce/ComtnuserabsnceRegister";
    }
    
    @RequestMapping("/comtnuserabsnce/addComtnuserabsnce.do")
    public String addComtnuserabsnce(
            ComtnuserabsnceVO comtnuserabsnceVO,
            @ModelAttribute("searchVO") ComtnuserabsnceDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnuserabsnceService.insertComtnuserabsnce(comtnuserabsnceVO);
        status.setComplete();
        return "forward:/comtnuserabsnce/ComtnuserabsnceList.do";
    }
    
    @RequestMapping("/comtnuserabsnce/updateComtnuserabsnceView.do")
    public String updateComtnuserabsnceView(
            @RequestParam("emplyrId") String emplyrId ,
            @ModelAttribute("searchVO") ComtnuserabsnceDefaultVO searchVO, Model model)
            throws Exception {
        ComtnuserabsnceVO comtnuserabsnceVO = new ComtnuserabsnceVO();
        comtnuserabsnceVO.setEmplyrId(emplyrId);
;        
        // 변수명은 CoC 에 따라 comtnuserabsnceVO
        model.addAttribute(selectComtnuserabsnce(comtnuserabsnceVO, searchVO));
        return "/comtnuserabsnce/ComtnuserabsnceRegister";
    }

    @RequestMapping("/comtnuserabsnce/selectComtnuserabsnce.do")
    public @ModelAttribute("comtnuserabsnceVO")
    ComtnuserabsnceVO selectComtnuserabsnce(
            ComtnuserabsnceVO comtnuserabsnceVO,
            @ModelAttribute("searchVO") ComtnuserabsnceDefaultVO searchVO) throws Exception {
        return comtnuserabsnceService.selectComtnuserabsnce(comtnuserabsnceVO);
    }

    @RequestMapping("/comtnuserabsnce/updateComtnuserabsnce.do")
    public String updateComtnuserabsnce(
            ComtnuserabsnceVO comtnuserabsnceVO,
            @ModelAttribute("searchVO") ComtnuserabsnceDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnuserabsnceService.updateComtnuserabsnce(comtnuserabsnceVO);
        status.setComplete();
        return "forward:/comtnuserabsnce/ComtnuserabsnceList.do";
    }
    
    @RequestMapping("/comtnuserabsnce/deleteComtnuserabsnce.do")
    public String deleteComtnuserabsnce(
            ComtnuserabsnceVO comtnuserabsnceVO,
            @ModelAttribute("searchVO") ComtnuserabsnceDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnuserabsnceService.deleteComtnuserabsnce(comtnuserabsnceVO);
        status.setComplete();
        return "forward:/comtnuserabsnce/ComtnuserabsnceList.do";
    }

}
