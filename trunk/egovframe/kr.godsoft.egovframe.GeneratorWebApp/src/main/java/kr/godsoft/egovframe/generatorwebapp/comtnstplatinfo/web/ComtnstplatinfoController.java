package kr.godsoft.egovframe.generatorwebapp.comtnstplatinfo.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnstplatinfo.service.ComtnstplatinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnstplatinfo.service.ComtnstplatinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnstplatinfo.service.ComtnstplatinfoVO;

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
 * @Class Name : ComtnstplatinfoController.java
 * @Description : Comtnstplatinfo Controller class
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
public class ComtnstplatinfoController {

    @Resource(name = "comtnstplatinfoService")
    private ComtnstplatinfoService comtnstplatinfoService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNSTPLATINFO 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnstplatinfoVO
	 * @return "/comtnstplatinfo/ComtnstplatinfoList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnstplatinfo/ComtnstplatinfoList.do")
    public String selectComtnstplatinfoList(@ModelAttribute("searchVO") ComtnstplatinfoVO searchVO, 
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
		
        List<EgovMap> comtnstplatinfoList = comtnstplatinfoService.selectComtnstplatinfoList(searchVO);
        model.addAttribute("resultList", comtnstplatinfoList);
        
        int totCnt = comtnstplatinfoService.selectComtnstplatinfoListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnstplatinfo/ComtnstplatinfoList";
    } 
    
    @RequestMapping("/comtnstplatinfo/addComtnstplatinfoView.do")
    public String addComtnstplatinfoView(
            @ModelAttribute("searchVO") ComtnstplatinfoDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnstplatinfoVO", new ComtnstplatinfoVO());
        return "/comtnstplatinfo/ComtnstplatinfoRegister";
    }
    
    @RequestMapping("/comtnstplatinfo/addComtnstplatinfo.do")
    public String addComtnstplatinfo(
            ComtnstplatinfoVO comtnstplatinfoVO,
            @ModelAttribute("searchVO") ComtnstplatinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnstplatinfoService.insertComtnstplatinfo(comtnstplatinfoVO);
        status.setComplete();
        return "forward:/comtnstplatinfo/ComtnstplatinfoList.do";
    }
    
    @RequestMapping("/comtnstplatinfo/updateComtnstplatinfoView.do")
    public String updateComtnstplatinfoView(
            @RequestParam("useStplatId") String useStplatId ,
            @ModelAttribute("searchVO") ComtnstplatinfoDefaultVO searchVO, Model model)
            throws Exception {
        ComtnstplatinfoVO comtnstplatinfoVO = new ComtnstplatinfoVO();
        comtnstplatinfoVO.setUseStplatId(useStplatId);
;        
        // 변수명은 CoC 에 따라 comtnstplatinfoVO
        model.addAttribute(selectComtnstplatinfo(comtnstplatinfoVO, searchVO));
        return "/comtnstplatinfo/ComtnstplatinfoRegister";
    }

    @RequestMapping("/comtnstplatinfo/selectComtnstplatinfo.do")
    public @ModelAttribute("comtnstplatinfoVO")
    ComtnstplatinfoVO selectComtnstplatinfo(
            ComtnstplatinfoVO comtnstplatinfoVO,
            @ModelAttribute("searchVO") ComtnstplatinfoDefaultVO searchVO) throws Exception {
        return comtnstplatinfoService.selectComtnstplatinfo(comtnstplatinfoVO);
    }

    @RequestMapping("/comtnstplatinfo/updateComtnstplatinfo.do")
    public String updateComtnstplatinfo(
            ComtnstplatinfoVO comtnstplatinfoVO,
            @ModelAttribute("searchVO") ComtnstplatinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnstplatinfoService.updateComtnstplatinfo(comtnstplatinfoVO);
        status.setComplete();
        return "forward:/comtnstplatinfo/ComtnstplatinfoList.do";
    }
    
    @RequestMapping("/comtnstplatinfo/deleteComtnstplatinfo.do")
    public String deleteComtnstplatinfo(
            ComtnstplatinfoVO comtnstplatinfoVO,
            @ModelAttribute("searchVO") ComtnstplatinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnstplatinfoService.deleteComtnstplatinfo(comtnstplatinfoVO);
        status.setComplete();
        return "forward:/comtnstplatinfo/ComtnstplatinfoList.do";
    }

}
