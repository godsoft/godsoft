package kr.godsoft.egovframe.generatorwebapp.comtninsttcoderecptnlog.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtninsttcoderecptnlog.service.ComtninsttcoderecptnlogService;
import kr.godsoft.egovframe.generatorwebapp.comtninsttcoderecptnlog.service.ComtninsttcoderecptnlogDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtninsttcoderecptnlog.service.ComtninsttcoderecptnlogVO;

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
 * @Class Name : ComtninsttcoderecptnlogController.java
 * @Description : Comtninsttcoderecptnlog Controller class
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
public class ComtninsttcoderecptnlogController {

    @Resource(name = "comtninsttcoderecptnlogService")
    private ComtninsttcoderecptnlogService comtninsttcoderecptnlogService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtninsttcoderecptnlog 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtninsttcoderecptnlogVO
	 * @return "/comtninsttcoderecptnlog/ComtninsttcoderecptnlogList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtninsttcoderecptnlog/ComtninsttcoderecptnlogList.do")
    public String selectComtninsttcoderecptnlogList(@ModelAttribute("searchVO") ComtninsttcoderecptnlogVO searchVO, 
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
		
        List<EgovMap> comtninsttcoderecptnlogList = comtninsttcoderecptnlogService.selectComtninsttcoderecptnlogList(searchVO);
        model.addAttribute("resultList", comtninsttcoderecptnlogList);
        
        int totCnt = comtninsttcoderecptnlogService.selectComtninsttcoderecptnlogListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtninsttcoderecptnlog/ComtninsttcoderecptnlogList";
    } 
    
    @RequestMapping("/comtninsttcoderecptnlog/addComtninsttcoderecptnlogView.do")
    public String addComtninsttcoderecptnlogView(
            @ModelAttribute("searchVO") ComtninsttcoderecptnlogDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtninsttcoderecptnlogVO", new ComtninsttcoderecptnlogVO());
        return "/comtninsttcoderecptnlog/ComtninsttcoderecptnlogRegister";
    }
    
    @RequestMapping("/comtninsttcoderecptnlog/addComtninsttcoderecptnlog.do")
    public String addComtninsttcoderecptnlog(
            ComtninsttcoderecptnlogVO comtninsttcoderecptnlogVO,
            @ModelAttribute("searchVO") ComtninsttcoderecptnlogDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtninsttcoderecptnlogService.insertComtninsttcoderecptnlog(comtninsttcoderecptnlogVO);
        status.setComplete();
        return "forward:/comtninsttcoderecptnlog/ComtninsttcoderecptnlogList.do";
    }
    
    @RequestMapping("/comtninsttcoderecptnlog/updateComtninsttcoderecptnlogView.do")
    public String updateComtninsttcoderecptnlogView(
            @RequestParam("occrrncDe") String occrrncDe ,
            @RequestParam("insttCode") String insttCode ,
            @RequestParam("opertSn") int opertSn ,
            @ModelAttribute("searchVO") ComtninsttcoderecptnlogDefaultVO searchVO, Model model)
            throws Exception {
        ComtninsttcoderecptnlogVO comtninsttcoderecptnlogVO = new ComtninsttcoderecptnlogVO();
        comtninsttcoderecptnlogVO.setOccrrncDe(occrrncDe);
        comtninsttcoderecptnlogVO.setInsttCode(insttCode);
        comtninsttcoderecptnlogVO.setOpertSn(opertSn);
;        
        // 변수명은 CoC 에 따라 comtninsttcoderecptnlogVO
        model.addAttribute(selectComtninsttcoderecptnlog(comtninsttcoderecptnlogVO, searchVO));
        return "/comtninsttcoderecptnlog/ComtninsttcoderecptnlogRegister";
    }

    @RequestMapping("/comtninsttcoderecptnlog/selectComtninsttcoderecptnlog.do")
    public @ModelAttribute("comtninsttcoderecptnlogVO")
    ComtninsttcoderecptnlogVO selectComtninsttcoderecptnlog(
            ComtninsttcoderecptnlogVO comtninsttcoderecptnlogVO,
            @ModelAttribute("searchVO") ComtninsttcoderecptnlogDefaultVO searchVO) throws Exception {
        return comtninsttcoderecptnlogService.selectComtninsttcoderecptnlog(comtninsttcoderecptnlogVO);
    }

    @RequestMapping("/comtninsttcoderecptnlog/updateComtninsttcoderecptnlog.do")
    public String updateComtninsttcoderecptnlog(
            ComtninsttcoderecptnlogVO comtninsttcoderecptnlogVO,
            @ModelAttribute("searchVO") ComtninsttcoderecptnlogDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtninsttcoderecptnlogService.updateComtninsttcoderecptnlog(comtninsttcoderecptnlogVO);
        status.setComplete();
        return "forward:/comtninsttcoderecptnlog/ComtninsttcoderecptnlogList.do";
    }
    
    @RequestMapping("/comtninsttcoderecptnlog/deleteComtninsttcoderecptnlog.do")
    public String deleteComtninsttcoderecptnlog(
            ComtninsttcoderecptnlogVO comtninsttcoderecptnlogVO,
            @ModelAttribute("searchVO") ComtninsttcoderecptnlogDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtninsttcoderecptnlogService.deleteComtninsttcoderecptnlog(comtninsttcoderecptnlogVO);
        status.setComplete();
        return "forward:/comtninsttcoderecptnlog/ComtninsttcoderecptnlogList.do";
    }

}
