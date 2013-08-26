package kr.godsoft.egovframe.generatorwebapp.comtnhpcminfo.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnhpcminfo.service.ComtnhpcminfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnhpcminfo.service.ComtnhpcminfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnhpcminfo.service.ComtnhpcminfoVO;

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
 * @Class Name : ComtnhpcminfoController.java
 * @Description : Comtnhpcminfo Controller class
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
public class ComtnhpcminfoController {

    @Resource(name = "comtnhpcminfoService")
    private ComtnhpcminfoService comtnhpcminfoService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNHPCMINFO 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnhpcminfoVO
	 * @return "/comtnhpcminfo/ComtnhpcminfoList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnhpcminfo/ComtnhpcminfoList.do")
    public String selectComtnhpcminfoList(@ModelAttribute("searchVO") ComtnhpcminfoVO searchVO, 
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
		
        List<EgovMap> comtnhpcminfoList = comtnhpcminfoService.selectComtnhpcminfoList(searchVO);
        model.addAttribute("resultList", comtnhpcminfoList);
        
        int totCnt = comtnhpcminfoService.selectComtnhpcminfoListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnhpcminfo/ComtnhpcminfoList";
    } 
    
    @RequestMapping("/comtnhpcminfo/addComtnhpcminfoView.do")
    public String addComtnhpcminfoView(
            @ModelAttribute("searchVO") ComtnhpcminfoDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnhpcminfoVO", new ComtnhpcminfoVO());
        return "/comtnhpcminfo/ComtnhpcminfoRegister";
    }
    
    @RequestMapping("/comtnhpcminfo/addComtnhpcminfo.do")
    public String addComtnhpcminfo(
            ComtnhpcminfoVO comtnhpcminfoVO,
            @ModelAttribute("searchVO") ComtnhpcminfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnhpcminfoService.insertComtnhpcminfo(comtnhpcminfoVO);
        status.setComplete();
        return "forward:/comtnhpcminfo/ComtnhpcminfoList.do";
    }
    
    @RequestMapping("/comtnhpcminfo/updateComtnhpcminfoView.do")
    public String updateComtnhpcminfoView(
            @RequestParam("hpcmId") String hpcmId ,
            @ModelAttribute("searchVO") ComtnhpcminfoDefaultVO searchVO, Model model)
            throws Exception {
        ComtnhpcminfoVO comtnhpcminfoVO = new ComtnhpcminfoVO();
        comtnhpcminfoVO.setHpcmId(hpcmId);
;        
        // 변수명은 CoC 에 따라 comtnhpcminfoVO
        model.addAttribute(selectComtnhpcminfo(comtnhpcminfoVO, searchVO));
        return "/comtnhpcminfo/ComtnhpcminfoRegister";
    }

    @RequestMapping("/comtnhpcminfo/selectComtnhpcminfo.do")
    public @ModelAttribute("comtnhpcminfoVO")
    ComtnhpcminfoVO selectComtnhpcminfo(
            ComtnhpcminfoVO comtnhpcminfoVO,
            @ModelAttribute("searchVO") ComtnhpcminfoDefaultVO searchVO) throws Exception {
        return comtnhpcminfoService.selectComtnhpcminfo(comtnhpcminfoVO);
    }

    @RequestMapping("/comtnhpcminfo/updateComtnhpcminfo.do")
    public String updateComtnhpcminfo(
            ComtnhpcminfoVO comtnhpcminfoVO,
            @ModelAttribute("searchVO") ComtnhpcminfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnhpcminfoService.updateComtnhpcminfo(comtnhpcminfoVO);
        status.setComplete();
        return "forward:/comtnhpcminfo/ComtnhpcminfoList.do";
    }
    
    @RequestMapping("/comtnhpcminfo/deleteComtnhpcminfo.do")
    public String deleteComtnhpcminfo(
            ComtnhpcminfoVO comtnhpcminfoVO,
            @ModelAttribute("searchVO") ComtnhpcminfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnhpcminfoService.deleteComtnhpcminfo(comtnhpcminfoVO);
        status.setComplete();
        return "forward:/comtnhpcminfo/ComtnhpcminfoList.do";
    }

}
