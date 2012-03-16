package kr.godsoft.egovframe.generatorwebapp.comtnbbsmaster.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnbbsmaster.service.ComtnbbsmasterService;
import kr.godsoft.egovframe.generatorwebapp.comtnbbsmaster.service.ComtnbbsmasterDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbbsmaster.service.ComtnbbsmasterVO;

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
 * @Class Name : ComtnbbsmasterController.java
 * @Description : Comtnbbsmaster Controller class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Controller
@SessionAttributes(types=ComtnbbsmasterVO.class)
public class ComtnbbsmasterController {

    @Resource(name = "comtnbbsmasterService")
    private ComtnbbsmasterService comtnbbsmasterService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnbbsmaster 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnbbsmasterVO
	 * @return "/comtnbbsmaster/ComtnbbsmasterList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnbbsmaster/ComtnbbsmasterList.do")
    public String selectComtnbbsmasterList(@ModelAttribute("searchVO") ComtnbbsmasterVO searchVO, 
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
		
        List<EgovMap> comtnbbsmasterList = comtnbbsmasterService.selectComtnbbsmasterList(searchVO);
        model.addAttribute("resultList", comtnbbsmasterList);
        
        int totCnt = comtnbbsmasterService.selectComtnbbsmasterListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnbbsmaster/ComtnbbsmasterList";
    } 
    
    @RequestMapping("/comtnbbsmaster/addComtnbbsmasterView.do")
    public String addComtnbbsmasterView(
            @ModelAttribute("searchVO") ComtnbbsmasterDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnbbsmasterVO", new ComtnbbsmasterVO());
        return "/comtnbbsmaster/ComtnbbsmasterRegister";
    }
    
    @RequestMapping("/comtnbbsmaster/addComtnbbsmaster.do")
    public String addComtnbbsmaster(
            ComtnbbsmasterVO comtnbbsmasterVO,
            @ModelAttribute("searchVO") ComtnbbsmasterDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbbsmasterService.insertComtnbbsmaster(comtnbbsmasterVO);
        status.setComplete();
        return "forward:/comtnbbsmaster/ComtnbbsmasterList.do";
    }
    
    @RequestMapping("/comtnbbsmaster/updateComtnbbsmasterView.do")
    public String updateComtnbbsmasterView(
            @RequestParam("bbsId") String bbsId ,
            @ModelAttribute("searchVO") ComtnbbsmasterDefaultVO searchVO, Model model)
            throws Exception {
        ComtnbbsmasterVO comtnbbsmasterVO = new ComtnbbsmasterVO();
        comtnbbsmasterVO.setBbsId(bbsId);
;        
        // 변수명은 CoC 에 따라 comtnbbsmasterVO
        model.addAttribute(selectComtnbbsmaster(comtnbbsmasterVO, searchVO));
        return "/comtnbbsmaster/ComtnbbsmasterRegister";
    }

    @RequestMapping("/comtnbbsmaster/selectComtnbbsmaster.do")
    public @ModelAttribute("comtnbbsmasterVO")
    ComtnbbsmasterVO selectComtnbbsmaster(
            ComtnbbsmasterVO comtnbbsmasterVO,
            @ModelAttribute("searchVO") ComtnbbsmasterDefaultVO searchVO) throws Exception {
        return comtnbbsmasterService.selectComtnbbsmaster(comtnbbsmasterVO);
    }

    @RequestMapping("/comtnbbsmaster/updateComtnbbsmaster.do")
    public String updateComtnbbsmaster(
            ComtnbbsmasterVO comtnbbsmasterVO,
            @ModelAttribute("searchVO") ComtnbbsmasterDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbbsmasterService.updateComtnbbsmaster(comtnbbsmasterVO);
        status.setComplete();
        return "forward:/comtnbbsmaster/ComtnbbsmasterList.do";
    }
    
    @RequestMapping("/comtnbbsmaster/deleteComtnbbsmaster.do")
    public String deleteComtnbbsmaster(
            ComtnbbsmasterVO comtnbbsmasterVO,
            @ModelAttribute("searchVO") ComtnbbsmasterDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbbsmasterService.deleteComtnbbsmaster(comtnbbsmasterVO);
        status.setComplete();
        return "forward:/comtnbbsmaster/ComtnbbsmasterList.do";
    }

}
