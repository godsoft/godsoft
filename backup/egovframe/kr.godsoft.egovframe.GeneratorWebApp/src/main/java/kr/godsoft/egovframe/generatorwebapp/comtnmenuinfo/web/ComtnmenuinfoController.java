package kr.godsoft.egovframe.generatorwebapp.comtnmenuinfo.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnmenuinfo.service.ComtnmenuinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnmenuinfo.service.ComtnmenuinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnmenuinfo.service.ComtnmenuinfoVO;

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
 * @Class Name : ComtnmenuinfoController.java
 * @Description : Comtnmenuinfo Controller class
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
public class ComtnmenuinfoController {

    @Resource(name = "comtnmenuinfoService")
    private ComtnmenuinfoService comtnmenuinfoService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNMENUINFO 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnmenuinfoVO
	 * @return "/comtnmenuinfo/ComtnmenuinfoList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnmenuinfo/ComtnmenuinfoList.do")
    public String selectComtnmenuinfoList(@ModelAttribute("searchVO") ComtnmenuinfoVO searchVO, 
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
		
        List<EgovMap> comtnmenuinfoList = comtnmenuinfoService.selectComtnmenuinfoList(searchVO);
        model.addAttribute("resultList", comtnmenuinfoList);
        
        int totCnt = comtnmenuinfoService.selectComtnmenuinfoListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnmenuinfo/ComtnmenuinfoList";
    } 
    
    @RequestMapping("/comtnmenuinfo/addComtnmenuinfoView.do")
    public String addComtnmenuinfoView(
            @ModelAttribute("searchVO") ComtnmenuinfoDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnmenuinfoVO", new ComtnmenuinfoVO());
        return "/comtnmenuinfo/ComtnmenuinfoRegister";
    }
    
    @RequestMapping("/comtnmenuinfo/addComtnmenuinfo.do")
    public String addComtnmenuinfo(
            ComtnmenuinfoVO comtnmenuinfoVO,
            @ModelAttribute("searchVO") ComtnmenuinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnmenuinfoService.insertComtnmenuinfo(comtnmenuinfoVO);
        status.setComplete();
        return "forward:/comtnmenuinfo/ComtnmenuinfoList.do";
    }
    
    @RequestMapping("/comtnmenuinfo/updateComtnmenuinfoView.do")
    public String updateComtnmenuinfoView(
            @RequestParam("menuNo") String menuNo ,
            @ModelAttribute("searchVO") ComtnmenuinfoDefaultVO searchVO, Model model)
            throws Exception {
        ComtnmenuinfoVO comtnmenuinfoVO = new ComtnmenuinfoVO();
        comtnmenuinfoVO.setMenuNo(menuNo);
;        
        // 변수명은 CoC 에 따라 comtnmenuinfoVO
        model.addAttribute(selectComtnmenuinfo(comtnmenuinfoVO, searchVO));
        return "/comtnmenuinfo/ComtnmenuinfoRegister";
    }

    @RequestMapping("/comtnmenuinfo/selectComtnmenuinfo.do")
    public @ModelAttribute("comtnmenuinfoVO")
    ComtnmenuinfoVO selectComtnmenuinfo(
            ComtnmenuinfoVO comtnmenuinfoVO,
            @ModelAttribute("searchVO") ComtnmenuinfoDefaultVO searchVO) throws Exception {
        return comtnmenuinfoService.selectComtnmenuinfo(comtnmenuinfoVO);
    }

    @RequestMapping("/comtnmenuinfo/updateComtnmenuinfo.do")
    public String updateComtnmenuinfo(
            ComtnmenuinfoVO comtnmenuinfoVO,
            @ModelAttribute("searchVO") ComtnmenuinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnmenuinfoService.updateComtnmenuinfo(comtnmenuinfoVO);
        status.setComplete();
        return "forward:/comtnmenuinfo/ComtnmenuinfoList.do";
    }
    
    @RequestMapping("/comtnmenuinfo/deleteComtnmenuinfo.do")
    public String deleteComtnmenuinfo(
            ComtnmenuinfoVO comtnmenuinfoVO,
            @ModelAttribute("searchVO") ComtnmenuinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnmenuinfoService.deleteComtnmenuinfo(comtnmenuinfoVO);
        status.setComplete();
        return "forward:/comtnmenuinfo/ComtnmenuinfoList.do";
    }

}
