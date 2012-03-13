package kr.godsoft.egovframe.generatorwebapp.comtnscrap.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtnscrap.service.ComtnscrapService;
import kr.godsoft.egovframe.generatorwebapp.comtnscrap.service.ComtnscrapDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnscrap.service.ComtnscrapVO;

/**
 * @Class Name : ComtnscrapController.java
 * @Description : Comtnscrap Controller class
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
@SessionAttributes(types=ComtnscrapVO.class)
public class ComtnscrapController {

    @Resource(name = "comtnscrapService")
    private ComtnscrapService comtnscrapService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnscrap 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnscrapDefaultVO
	 * @return "/comtnscrap/ComtnscrapList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnscrap/ComtnscrapList.do")
    public String selectComtnscrapList(@ModelAttribute("searchVO") ComtnscrapDefaultVO searchVO, 
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
		
        List comtnscrapList = comtnscrapService.selectComtnscrapList(searchVO);
        model.addAttribute("resultList", comtnscrapList);
        
        int totCnt = comtnscrapService.selectComtnscrapListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnscrap/ComtnscrapList";
    } 
    
    @RequestMapping("/comtnscrap/addComtnscrapView.do")
    public String addComtnscrapView(
            @ModelAttribute("searchVO") ComtnscrapDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnscrapVO", new ComtnscrapVO());
        return "/comtnscrap/ComtnscrapRegister";
    }
    
    @RequestMapping("/comtnscrap/addComtnscrap.do")
    public String addComtnscrap(
            ComtnscrapVO comtnscrapVO,
            @ModelAttribute("searchVO") ComtnscrapDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnscrapService.insertComtnscrap(comtnscrapVO);
        status.setComplete();
        return "forward:/comtnscrap/ComtnscrapList.do";
    }
    
    @RequestMapping("/comtnscrap/updateComtnscrapView.do")
    public String updateComtnscrapView(
            @RequestParam("scrapId") String scrapId ,
            @ModelAttribute("searchVO") ComtnscrapDefaultVO searchVO, Model model)
            throws Exception {
        ComtnscrapVO comtnscrapVO = new ComtnscrapVO();
        comtnscrapVO.setScrapId(scrapId);
;        
        // 변수명은 CoC 에 따라 comtnscrapVO
        model.addAttribute(selectComtnscrap(comtnscrapVO, searchVO));
        return "/comtnscrap/ComtnscrapRegister";
    }

    @RequestMapping("/comtnscrap/selectComtnscrap.do")
    public @ModelAttribute("comtnscrapVO")
    ComtnscrapVO selectComtnscrap(
            ComtnscrapVO comtnscrapVO,
            @ModelAttribute("searchVO") ComtnscrapDefaultVO searchVO) throws Exception {
        return comtnscrapService.selectComtnscrap(comtnscrapVO);
    }

    @RequestMapping("/comtnscrap/updateComtnscrap.do")
    public String updateComtnscrap(
            ComtnscrapVO comtnscrapVO,
            @ModelAttribute("searchVO") ComtnscrapDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnscrapService.updateComtnscrap(comtnscrapVO);
        status.setComplete();
        return "forward:/comtnscrap/ComtnscrapList.do";
    }
    
    @RequestMapping("/comtnscrap/deleteComtnscrap.do")
    public String deleteComtnscrap(
            ComtnscrapVO comtnscrapVO,
            @ModelAttribute("searchVO") ComtnscrapDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnscrapService.deleteComtnscrap(comtnscrapVO);
        status.setComplete();
        return "forward:/comtnscrap/ComtnscrapList.do";
    }

}
