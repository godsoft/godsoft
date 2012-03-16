package kr.godsoft.egovframe.generatorwebapp.comtndamknoifm.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtndamknoifm.service.ComtndamknoifmService;
import kr.godsoft.egovframe.generatorwebapp.comtndamknoifm.service.ComtndamknoifmDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtndamknoifm.service.ComtndamknoifmVO;

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
 * @Class Name : ComtndamknoifmController.java
 * @Description : Comtndamknoifm Controller class
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
@SessionAttributes(types=ComtndamknoifmVO.class)
public class ComtndamknoifmController {

    @Resource(name = "comtndamknoifmService")
    private ComtndamknoifmService comtndamknoifmService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtndamknoifm 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtndamknoifmVO
	 * @return "/comtndamknoifm/ComtndamknoifmList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtndamknoifm/ComtndamknoifmList.do")
    public String selectComtndamknoifmList(@ModelAttribute("searchVO") ComtndamknoifmVO searchVO, 
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
		
        List<EgovMap> comtndamknoifmList = comtndamknoifmService.selectComtndamknoifmList(searchVO);
        model.addAttribute("resultList", comtndamknoifmList);
        
        int totCnt = comtndamknoifmService.selectComtndamknoifmListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtndamknoifm/ComtndamknoifmList";
    } 
    
    @RequestMapping("/comtndamknoifm/addComtndamknoifmView.do")
    public String addComtndamknoifmView(
            @ModelAttribute("searchVO") ComtndamknoifmDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtndamknoifmVO", new ComtndamknoifmVO());
        return "/comtndamknoifm/ComtndamknoifmRegister";
    }
    
    @RequestMapping("/comtndamknoifm/addComtndamknoifm.do")
    public String addComtndamknoifm(
            ComtndamknoifmVO comtndamknoifmVO,
            @ModelAttribute("searchVO") ComtndamknoifmDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtndamknoifmService.insertComtndamknoifm(comtndamknoifmVO);
        status.setComplete();
        return "forward:/comtndamknoifm/ComtndamknoifmList.do";
    }
    
    @RequestMapping("/comtndamknoifm/updateComtndamknoifmView.do")
    public String updateComtndamknoifmView(
            @RequestParam("knwldgId") String knwldgId ,
            @ModelAttribute("searchVO") ComtndamknoifmDefaultVO searchVO, Model model)
            throws Exception {
        ComtndamknoifmVO comtndamknoifmVO = new ComtndamknoifmVO();
        comtndamknoifmVO.setKnwldgId(knwldgId);
;        
        // 변수명은 CoC 에 따라 comtndamknoifmVO
        model.addAttribute(selectComtndamknoifm(comtndamknoifmVO, searchVO));
        return "/comtndamknoifm/ComtndamknoifmRegister";
    }

    @RequestMapping("/comtndamknoifm/selectComtndamknoifm.do")
    public @ModelAttribute("comtndamknoifmVO")
    ComtndamknoifmVO selectComtndamknoifm(
            ComtndamknoifmVO comtndamknoifmVO,
            @ModelAttribute("searchVO") ComtndamknoifmDefaultVO searchVO) throws Exception {
        return comtndamknoifmService.selectComtndamknoifm(comtndamknoifmVO);
    }

    @RequestMapping("/comtndamknoifm/updateComtndamknoifm.do")
    public String updateComtndamknoifm(
            ComtndamknoifmVO comtndamknoifmVO,
            @ModelAttribute("searchVO") ComtndamknoifmDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtndamknoifmService.updateComtndamknoifm(comtndamknoifmVO);
        status.setComplete();
        return "forward:/comtndamknoifm/ComtndamknoifmList.do";
    }
    
    @RequestMapping("/comtndamknoifm/deleteComtndamknoifm.do")
    public String deleteComtndamknoifm(
            ComtndamknoifmVO comtndamknoifmVO,
            @ModelAttribute("searchVO") ComtndamknoifmDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtndamknoifmService.deleteComtndamknoifm(comtndamknoifmVO);
        status.setComplete();
        return "forward:/comtndamknoifm/ComtndamknoifmList.do";
    }

}
