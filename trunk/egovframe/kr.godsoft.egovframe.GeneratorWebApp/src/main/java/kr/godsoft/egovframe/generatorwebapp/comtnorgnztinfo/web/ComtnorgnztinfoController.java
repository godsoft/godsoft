package kr.godsoft.egovframe.generatorwebapp.comtnorgnztinfo.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnorgnztinfo.service.ComtnorgnztinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnorgnztinfo.service.ComtnorgnztinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnorgnztinfo.service.ComtnorgnztinfoVO;

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
 * @Class Name : ComtnorgnztinfoController.java
 * @Description : Comtnorgnztinfo Controller class
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
public class ComtnorgnztinfoController {

    @Resource(name = "comtnorgnztinfoService")
    private ComtnorgnztinfoService comtnorgnztinfoService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNORGNZTINFO 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnorgnztinfoVO
	 * @return "/comtnorgnztinfo/ComtnorgnztinfoList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnorgnztinfo/ComtnorgnztinfoList.do")
    public String selectComtnorgnztinfoList(@ModelAttribute("searchVO") ComtnorgnztinfoVO searchVO, 
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
		
        List<EgovMap> comtnorgnztinfoList = comtnorgnztinfoService.selectComtnorgnztinfoList(searchVO);
        model.addAttribute("resultList", comtnorgnztinfoList);
        
        int totCnt = comtnorgnztinfoService.selectComtnorgnztinfoListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnorgnztinfo/ComtnorgnztinfoList";
    } 
    
    @RequestMapping("/comtnorgnztinfo/addComtnorgnztinfoView.do")
    public String addComtnorgnztinfoView(
            @ModelAttribute("searchVO") ComtnorgnztinfoDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnorgnztinfoVO", new ComtnorgnztinfoVO());
        return "/comtnorgnztinfo/ComtnorgnztinfoRegister";
    }
    
    @RequestMapping("/comtnorgnztinfo/addComtnorgnztinfo.do")
    public String addComtnorgnztinfo(
            ComtnorgnztinfoVO comtnorgnztinfoVO,
            @ModelAttribute("searchVO") ComtnorgnztinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnorgnztinfoService.insertComtnorgnztinfo(comtnorgnztinfoVO);
        status.setComplete();
        return "forward:/comtnorgnztinfo/ComtnorgnztinfoList.do";
    }
    
    @RequestMapping("/comtnorgnztinfo/updateComtnorgnztinfoView.do")
    public String updateComtnorgnztinfoView(
            @RequestParam("orgnztId") String orgnztId ,
            @ModelAttribute("searchVO") ComtnorgnztinfoDefaultVO searchVO, Model model)
            throws Exception {
        ComtnorgnztinfoVO comtnorgnztinfoVO = new ComtnorgnztinfoVO();
        comtnorgnztinfoVO.setOrgnztId(orgnztId);
;        
        // 변수명은 CoC 에 따라 comtnorgnztinfoVO
        model.addAttribute(selectComtnorgnztinfo(comtnorgnztinfoVO, searchVO));
        return "/comtnorgnztinfo/ComtnorgnztinfoRegister";
    }

    @RequestMapping("/comtnorgnztinfo/selectComtnorgnztinfo.do")
    public @ModelAttribute("comtnorgnztinfoVO")
    ComtnorgnztinfoVO selectComtnorgnztinfo(
            ComtnorgnztinfoVO comtnorgnztinfoVO,
            @ModelAttribute("searchVO") ComtnorgnztinfoDefaultVO searchVO) throws Exception {
        return comtnorgnztinfoService.selectComtnorgnztinfo(comtnorgnztinfoVO);
    }

    @RequestMapping("/comtnorgnztinfo/updateComtnorgnztinfo.do")
    public String updateComtnorgnztinfo(
            ComtnorgnztinfoVO comtnorgnztinfoVO,
            @ModelAttribute("searchVO") ComtnorgnztinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnorgnztinfoService.updateComtnorgnztinfo(comtnorgnztinfoVO);
        status.setComplete();
        return "forward:/comtnorgnztinfo/ComtnorgnztinfoList.do";
    }
    
    @RequestMapping("/comtnorgnztinfo/deleteComtnorgnztinfo.do")
    public String deleteComtnorgnztinfo(
            ComtnorgnztinfoVO comtnorgnztinfoVO,
            @ModelAttribute("searchVO") ComtnorgnztinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnorgnztinfoService.deleteComtnorgnztinfo(comtnorgnztinfoVO);
        status.setComplete();
        return "forward:/comtnorgnztinfo/ComtnorgnztinfoList.do";
    }

}
