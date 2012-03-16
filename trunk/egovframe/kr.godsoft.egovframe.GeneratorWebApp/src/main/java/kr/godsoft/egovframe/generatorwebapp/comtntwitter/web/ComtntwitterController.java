package kr.godsoft.egovframe.generatorwebapp.comtntwitter.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtntwitter.service.ComtntwitterService;
import kr.godsoft.egovframe.generatorwebapp.comtntwitter.service.ComtntwitterDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtntwitter.service.ComtntwitterVO;

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
 * @Class Name : ComtntwitterController.java
 * @Description : Comtntwitter Controller class
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
@SessionAttributes(types=ComtntwitterVO.class)
public class ComtntwitterController {

    @Resource(name = "comtntwitterService")
    private ComtntwitterService comtntwitterService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtntwitter 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtntwitterVO
	 * @return "/comtntwitter/ComtntwitterList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtntwitter/ComtntwitterList.do")
    public String selectComtntwitterList(@ModelAttribute("searchVO") ComtntwitterVO searchVO, 
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
		
        List<EgovMap> comtntwitterList = comtntwitterService.selectComtntwitterList(searchVO);
        model.addAttribute("resultList", comtntwitterList);
        
        int totCnt = comtntwitterService.selectComtntwitterListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtntwitter/ComtntwitterList";
    } 
    
    @RequestMapping("/comtntwitter/addComtntwitterView.do")
    public String addComtntwitterView(
            @ModelAttribute("searchVO") ComtntwitterDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtntwitterVO", new ComtntwitterVO());
        return "/comtntwitter/ComtntwitterRegister";
    }
    
    @RequestMapping("/comtntwitter/addComtntwitter.do")
    public String addComtntwitter(
            ComtntwitterVO comtntwitterVO,
            @ModelAttribute("searchVO") ComtntwitterDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtntwitterService.insertComtntwitter(comtntwitterVO);
        status.setComplete();
        return "forward:/comtntwitter/ComtntwitterList.do";
    }
    
    @RequestMapping("/comtntwitter/updateComtntwitterView.do")
    public String updateComtntwitterView(
            @RequestParam("userId") String userId ,
            @ModelAttribute("searchVO") ComtntwitterDefaultVO searchVO, Model model)
            throws Exception {
        ComtntwitterVO comtntwitterVO = new ComtntwitterVO();
        comtntwitterVO.setUserId(userId);
;        
        // 변수명은 CoC 에 따라 comtntwitterVO
        model.addAttribute(selectComtntwitter(comtntwitterVO, searchVO));
        return "/comtntwitter/ComtntwitterRegister";
    }

    @RequestMapping("/comtntwitter/selectComtntwitter.do")
    public @ModelAttribute("comtntwitterVO")
    ComtntwitterVO selectComtntwitter(
            ComtntwitterVO comtntwitterVO,
            @ModelAttribute("searchVO") ComtntwitterDefaultVO searchVO) throws Exception {
        return comtntwitterService.selectComtntwitter(comtntwitterVO);
    }

    @RequestMapping("/comtntwitter/updateComtntwitter.do")
    public String updateComtntwitter(
            ComtntwitterVO comtntwitterVO,
            @ModelAttribute("searchVO") ComtntwitterDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtntwitterService.updateComtntwitter(comtntwitterVO);
        status.setComplete();
        return "forward:/comtntwitter/ComtntwitterList.do";
    }
    
    @RequestMapping("/comtntwitter/deleteComtntwitter.do")
    public String deleteComtntwitter(
            ComtntwitterVO comtntwitterVO,
            @ModelAttribute("searchVO") ComtntwitterDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtntwitterService.deleteComtntwitter(comtntwitterVO);
        status.setComplete();
        return "forward:/comtntwitter/ComtntwitterList.do";
    }

}
