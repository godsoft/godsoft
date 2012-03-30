package kr.godsoft.egovframe.generatorwebapp.comthtrsmrcvmntrngloginfo.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comthtrsmrcvmntrngloginfo.service.ComthtrsmrcvmntrngloginfoService;
import kr.godsoft.egovframe.generatorwebapp.comthtrsmrcvmntrngloginfo.service.ComthtrsmrcvmntrngloginfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comthtrsmrcvmntrngloginfo.service.ComthtrsmrcvmntrngloginfoVO;

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
 * @Class Name : ComthtrsmrcvmntrngloginfoController.java
 * @Description : Comthtrsmrcvmntrngloginfo Controller class
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
public class ComthtrsmrcvmntrngloginfoController {

    @Resource(name = "comthtrsmrcvmntrngloginfoService")
    private ComthtrsmrcvmntrngloginfoService comthtrsmrcvmntrngloginfoService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTHTRSMRCVMNTRNGLOGINFO 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComthtrsmrcvmntrngloginfoVO
	 * @return "/comthtrsmrcvmntrngloginfo/ComthtrsmrcvmntrngloginfoList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comthtrsmrcvmntrngloginfo/ComthtrsmrcvmntrngloginfoList.do")
    public String selectComthtrsmrcvmntrngloginfoList(@ModelAttribute("searchVO") ComthtrsmrcvmntrngloginfoVO searchVO, 
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
		
        List<EgovMap> comthtrsmrcvmntrngloginfoList = comthtrsmrcvmntrngloginfoService.selectComthtrsmrcvmntrngloginfoList(searchVO);
        model.addAttribute("resultList", comthtrsmrcvmntrngloginfoList);
        
        int totCnt = comthtrsmrcvmntrngloginfoService.selectComthtrsmrcvmntrngloginfoListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comthtrsmrcvmntrngloginfo/ComthtrsmrcvmntrngloginfoList";
    } 
    
    @RequestMapping("/comthtrsmrcvmntrngloginfo/addComthtrsmrcvmntrngloginfoView.do")
    public String addComthtrsmrcvmntrngloginfoView(
            @ModelAttribute("searchVO") ComthtrsmrcvmntrngloginfoDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comthtrsmrcvmntrngloginfoVO", new ComthtrsmrcvmntrngloginfoVO());
        return "/comthtrsmrcvmntrngloginfo/ComthtrsmrcvmntrngloginfoRegister";
    }
    
    @RequestMapping("/comthtrsmrcvmntrngloginfo/addComthtrsmrcvmntrngloginfo.do")
    public String addComthtrsmrcvmntrngloginfo(
            ComthtrsmrcvmntrngloginfoVO comthtrsmrcvmntrngloginfoVO,
            @ModelAttribute("searchVO") ComthtrsmrcvmntrngloginfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comthtrsmrcvmntrngloginfoService.insertComthtrsmrcvmntrngloginfo(comthtrsmrcvmntrngloginfoVO);
        status.setComplete();
        return "forward:/comthtrsmrcvmntrngloginfo/ComthtrsmrcvmntrngloginfoList.do";
    }
    
    @RequestMapping("/comthtrsmrcvmntrngloginfo/updateComthtrsmrcvmntrngloginfoView.do")
    public String updateComthtrsmrcvmntrngloginfoView(
            @RequestParam("logId") String logId ,
            @ModelAttribute("searchVO") ComthtrsmrcvmntrngloginfoDefaultVO searchVO, Model model)
            throws Exception {
        ComthtrsmrcvmntrngloginfoVO comthtrsmrcvmntrngloginfoVO = new ComthtrsmrcvmntrngloginfoVO();
        comthtrsmrcvmntrngloginfoVO.setLogId(logId);
;        
        // 변수명은 CoC 에 따라 comthtrsmrcvmntrngloginfoVO
        model.addAttribute(selectComthtrsmrcvmntrngloginfo(comthtrsmrcvmntrngloginfoVO, searchVO));
        return "/comthtrsmrcvmntrngloginfo/ComthtrsmrcvmntrngloginfoRegister";
    }

    @RequestMapping("/comthtrsmrcvmntrngloginfo/selectComthtrsmrcvmntrngloginfo.do")
    public @ModelAttribute("comthtrsmrcvmntrngloginfoVO")
    ComthtrsmrcvmntrngloginfoVO selectComthtrsmrcvmntrngloginfo(
            ComthtrsmrcvmntrngloginfoVO comthtrsmrcvmntrngloginfoVO,
            @ModelAttribute("searchVO") ComthtrsmrcvmntrngloginfoDefaultVO searchVO) throws Exception {
        return comthtrsmrcvmntrngloginfoService.selectComthtrsmrcvmntrngloginfo(comthtrsmrcvmntrngloginfoVO);
    }

    @RequestMapping("/comthtrsmrcvmntrngloginfo/updateComthtrsmrcvmntrngloginfo.do")
    public String updateComthtrsmrcvmntrngloginfo(
            ComthtrsmrcvmntrngloginfoVO comthtrsmrcvmntrngloginfoVO,
            @ModelAttribute("searchVO") ComthtrsmrcvmntrngloginfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comthtrsmrcvmntrngloginfoService.updateComthtrsmrcvmntrngloginfo(comthtrsmrcvmntrngloginfoVO);
        status.setComplete();
        return "forward:/comthtrsmrcvmntrngloginfo/ComthtrsmrcvmntrngloginfoList.do";
    }
    
    @RequestMapping("/comthtrsmrcvmntrngloginfo/deleteComthtrsmrcvmntrngloginfo.do")
    public String deleteComthtrsmrcvmntrngloginfo(
            ComthtrsmrcvmntrngloginfoVO comthtrsmrcvmntrngloginfoVO,
            @ModelAttribute("searchVO") ComthtrsmrcvmntrngloginfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comthtrsmrcvmntrngloginfoService.deleteComthtrsmrcvmntrngloginfo(comthtrsmrcvmntrngloginfoVO);
        status.setComplete();
        return "forward:/comthtrsmrcvmntrngloginfo/ComthtrsmrcvmntrngloginfoList.do";
    }

}
