package kr.godsoft.egovframe.generatorwebapp.comthdbmntrngloginfo.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comthdbmntrngloginfo.service.ComthdbmntrngloginfoService;
import kr.godsoft.egovframe.generatorwebapp.comthdbmntrngloginfo.service.ComthdbmntrngloginfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comthdbmntrngloginfo.service.ComthdbmntrngloginfoVO;

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
 * @Class Name : ComthdbmntrngloginfoController.java
 * @Description : Comthdbmntrngloginfo Controller class
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
public class ComthdbmntrngloginfoController {

    @Resource(name = "comthdbmntrngloginfoService")
    private ComthdbmntrngloginfoService comthdbmntrngloginfoService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comthdbmntrngloginfo 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComthdbmntrngloginfoVO
	 * @return "/comthdbmntrngloginfo/ComthdbmntrngloginfoList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comthdbmntrngloginfo/ComthdbmntrngloginfoList.do")
    public String selectComthdbmntrngloginfoList(@ModelAttribute("searchVO") ComthdbmntrngloginfoVO searchVO, 
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
		
        List<EgovMap> comthdbmntrngloginfoList = comthdbmntrngloginfoService.selectComthdbmntrngloginfoList(searchVO);
        model.addAttribute("resultList", comthdbmntrngloginfoList);
        
        int totCnt = comthdbmntrngloginfoService.selectComthdbmntrngloginfoListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comthdbmntrngloginfo/ComthdbmntrngloginfoList";
    } 
    
    @RequestMapping("/comthdbmntrngloginfo/addComthdbmntrngloginfoView.do")
    public String addComthdbmntrngloginfoView(
            @ModelAttribute("searchVO") ComthdbmntrngloginfoDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comthdbmntrngloginfoVO", new ComthdbmntrngloginfoVO());
        return "/comthdbmntrngloginfo/ComthdbmntrngloginfoRegister";
    }
    
    @RequestMapping("/comthdbmntrngloginfo/addComthdbmntrngloginfo.do")
    public String addComthdbmntrngloginfo(
            ComthdbmntrngloginfoVO comthdbmntrngloginfoVO,
            @ModelAttribute("searchVO") ComthdbmntrngloginfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comthdbmntrngloginfoService.insertComthdbmntrngloginfo(comthdbmntrngloginfoVO);
        status.setComplete();
        return "forward:/comthdbmntrngloginfo/ComthdbmntrngloginfoList.do";
    }
    
    @RequestMapping("/comthdbmntrngloginfo/updateComthdbmntrngloginfoView.do")
    public String updateComthdbmntrngloginfoView(
            @RequestParam("logId") String logId ,
            @ModelAttribute("searchVO") ComthdbmntrngloginfoDefaultVO searchVO, Model model)
            throws Exception {
        ComthdbmntrngloginfoVO comthdbmntrngloginfoVO = new ComthdbmntrngloginfoVO();
        comthdbmntrngloginfoVO.setLogId(logId);
;        
        // 변수명은 CoC 에 따라 comthdbmntrngloginfoVO
        model.addAttribute(selectComthdbmntrngloginfo(comthdbmntrngloginfoVO, searchVO));
        return "/comthdbmntrngloginfo/ComthdbmntrngloginfoRegister";
    }

    @RequestMapping("/comthdbmntrngloginfo/selectComthdbmntrngloginfo.do")
    public @ModelAttribute("comthdbmntrngloginfoVO")
    ComthdbmntrngloginfoVO selectComthdbmntrngloginfo(
            ComthdbmntrngloginfoVO comthdbmntrngloginfoVO,
            @ModelAttribute("searchVO") ComthdbmntrngloginfoDefaultVO searchVO) throws Exception {
        return comthdbmntrngloginfoService.selectComthdbmntrngloginfo(comthdbmntrngloginfoVO);
    }

    @RequestMapping("/comthdbmntrngloginfo/updateComthdbmntrngloginfo.do")
    public String updateComthdbmntrngloginfo(
            ComthdbmntrngloginfoVO comthdbmntrngloginfoVO,
            @ModelAttribute("searchVO") ComthdbmntrngloginfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comthdbmntrngloginfoService.updateComthdbmntrngloginfo(comthdbmntrngloginfoVO);
        status.setComplete();
        return "forward:/comthdbmntrngloginfo/ComthdbmntrngloginfoList.do";
    }
    
    @RequestMapping("/comthdbmntrngloginfo/deleteComthdbmntrngloginfo.do")
    public String deleteComthdbmntrngloginfo(
            ComthdbmntrngloginfoVO comthdbmntrngloginfoVO,
            @ModelAttribute("searchVO") ComthdbmntrngloginfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comthdbmntrngloginfoService.deleteComthdbmntrngloginfo(comthdbmntrngloginfoVO);
        status.setComplete();
        return "forward:/comthdbmntrngloginfo/ComthdbmntrngloginfoList.do";
    }

}
