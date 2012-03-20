package kr.godsoft.egovframe.generatorwebapp.comtnmtginfo.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnmtginfo.service.ComtnmtginfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnmtginfo.service.ComtnmtginfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnmtginfo.service.ComtnmtginfoVO;

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
 * @Class Name : ComtnmtginfoController.java
 * @Description : Comtnmtginfo Controller class
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
public class ComtnmtginfoController {

    @Resource(name = "comtnmtginfoService")
    private ComtnmtginfoService comtnmtginfoService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnmtginfo 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnmtginfoVO
	 * @return "/comtnmtginfo/ComtnmtginfoList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnmtginfo/ComtnmtginfoList.do")
    public String selectComtnmtginfoList(@ModelAttribute("searchVO") ComtnmtginfoVO searchVO, 
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
		
        List<EgovMap> comtnmtginfoList = comtnmtginfoService.selectComtnmtginfoList(searchVO);
        model.addAttribute("resultList", comtnmtginfoList);
        
        int totCnt = comtnmtginfoService.selectComtnmtginfoListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnmtginfo/ComtnmtginfoList";
    } 
    
    @RequestMapping("/comtnmtginfo/addComtnmtginfoView.do")
    public String addComtnmtginfoView(
            @ModelAttribute("searchVO") ComtnmtginfoDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnmtginfoVO", new ComtnmtginfoVO());
        return "/comtnmtginfo/ComtnmtginfoRegister";
    }
    
    @RequestMapping("/comtnmtginfo/addComtnmtginfo.do")
    public String addComtnmtginfo(
            ComtnmtginfoVO comtnmtginfoVO,
            @ModelAttribute("searchVO") ComtnmtginfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnmtginfoService.insertComtnmtginfo(comtnmtginfoVO);
        status.setComplete();
        return "forward:/comtnmtginfo/ComtnmtginfoList.do";
    }
    
    @RequestMapping("/comtnmtginfo/updateComtnmtginfoView.do")
    public String updateComtnmtginfoView(
            @RequestParam("mtgId") String mtgId ,
            @ModelAttribute("searchVO") ComtnmtginfoDefaultVO searchVO, Model model)
            throws Exception {
        ComtnmtginfoVO comtnmtginfoVO = new ComtnmtginfoVO();
        comtnmtginfoVO.setMtgId(mtgId);
;        
        // 변수명은 CoC 에 따라 comtnmtginfoVO
        model.addAttribute(selectComtnmtginfo(comtnmtginfoVO, searchVO));
        return "/comtnmtginfo/ComtnmtginfoRegister";
    }

    @RequestMapping("/comtnmtginfo/selectComtnmtginfo.do")
    public @ModelAttribute("comtnmtginfoVO")
    ComtnmtginfoVO selectComtnmtginfo(
            ComtnmtginfoVO comtnmtginfoVO,
            @ModelAttribute("searchVO") ComtnmtginfoDefaultVO searchVO) throws Exception {
        return comtnmtginfoService.selectComtnmtginfo(comtnmtginfoVO);
    }

    @RequestMapping("/comtnmtginfo/updateComtnmtginfo.do")
    public String updateComtnmtginfo(
            ComtnmtginfoVO comtnmtginfoVO,
            @ModelAttribute("searchVO") ComtnmtginfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnmtginfoService.updateComtnmtginfo(comtnmtginfoVO);
        status.setComplete();
        return "forward:/comtnmtginfo/ComtnmtginfoList.do";
    }
    
    @RequestMapping("/comtnmtginfo/deleteComtnmtginfo.do")
    public String deleteComtnmtginfo(
            ComtnmtginfoVO comtnmtginfoVO,
            @ModelAttribute("searchVO") ComtnmtginfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnmtginfoService.deleteComtnmtginfo(comtnmtginfoVO);
        status.setComplete();
        return "forward:/comtnmtginfo/ComtnmtginfoList.do";
    }

}
