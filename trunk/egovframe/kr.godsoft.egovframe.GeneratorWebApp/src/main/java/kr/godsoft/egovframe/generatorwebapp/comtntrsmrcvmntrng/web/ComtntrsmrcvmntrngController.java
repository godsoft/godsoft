package kr.godsoft.egovframe.generatorwebapp.comtntrsmrcvmntrng.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtntrsmrcvmntrng.service.ComtntrsmrcvmntrngService;
import kr.godsoft.egovframe.generatorwebapp.comtntrsmrcvmntrng.service.ComtntrsmrcvmntrngDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtntrsmrcvmntrng.service.ComtntrsmrcvmntrngVO;

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
 * @Class Name : ComtntrsmrcvmntrngController.java
 * @Description : Comtntrsmrcvmntrng Controller class
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
public class ComtntrsmrcvmntrngController {

    @Resource(name = "comtntrsmrcvmntrngService")
    private ComtntrsmrcvmntrngService comtntrsmrcvmntrngService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtntrsmrcvmntrng 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtntrsmrcvmntrngVO
	 * @return "/comtntrsmrcvmntrng/ComtntrsmrcvmntrngList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtntrsmrcvmntrng/ComtntrsmrcvmntrngList.do")
    public String selectComtntrsmrcvmntrngList(@ModelAttribute("searchVO") ComtntrsmrcvmntrngVO searchVO, 
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
		
        List<EgovMap> comtntrsmrcvmntrngList = comtntrsmrcvmntrngService.selectComtntrsmrcvmntrngList(searchVO);
        model.addAttribute("resultList", comtntrsmrcvmntrngList);
        
        int totCnt = comtntrsmrcvmntrngService.selectComtntrsmrcvmntrngListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtntrsmrcvmntrng/ComtntrsmrcvmntrngList";
    } 
    
    @RequestMapping("/comtntrsmrcvmntrng/addComtntrsmrcvmntrngView.do")
    public String addComtntrsmrcvmntrngView(
            @ModelAttribute("searchVO") ComtntrsmrcvmntrngDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtntrsmrcvmntrngVO", new ComtntrsmrcvmntrngVO());
        return "/comtntrsmrcvmntrng/ComtntrsmrcvmntrngRegister";
    }
    
    @RequestMapping("/comtntrsmrcvmntrng/addComtntrsmrcvmntrng.do")
    public String addComtntrsmrcvmntrng(
            ComtntrsmrcvmntrngVO comtntrsmrcvmntrngVO,
            @ModelAttribute("searchVO") ComtntrsmrcvmntrngDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtntrsmrcvmntrngService.insertComtntrsmrcvmntrng(comtntrsmrcvmntrngVO);
        status.setComplete();
        return "forward:/comtntrsmrcvmntrng/ComtntrsmrcvmntrngList.do";
    }
    
    @RequestMapping("/comtntrsmrcvmntrng/updateComtntrsmrcvmntrngView.do")
    public String updateComtntrsmrcvmntrngView(
            @RequestParam("cntcId") String cntcId ,
            @ModelAttribute("searchVO") ComtntrsmrcvmntrngDefaultVO searchVO, Model model)
            throws Exception {
        ComtntrsmrcvmntrngVO comtntrsmrcvmntrngVO = new ComtntrsmrcvmntrngVO();
        comtntrsmrcvmntrngVO.setCntcId(cntcId);
;        
        // 변수명은 CoC 에 따라 comtntrsmrcvmntrngVO
        model.addAttribute(selectComtntrsmrcvmntrng(comtntrsmrcvmntrngVO, searchVO));
        return "/comtntrsmrcvmntrng/ComtntrsmrcvmntrngRegister";
    }

    @RequestMapping("/comtntrsmrcvmntrng/selectComtntrsmrcvmntrng.do")
    public @ModelAttribute("comtntrsmrcvmntrngVO")
    ComtntrsmrcvmntrngVO selectComtntrsmrcvmntrng(
            ComtntrsmrcvmntrngVO comtntrsmrcvmntrngVO,
            @ModelAttribute("searchVO") ComtntrsmrcvmntrngDefaultVO searchVO) throws Exception {
        return comtntrsmrcvmntrngService.selectComtntrsmrcvmntrng(comtntrsmrcvmntrngVO);
    }

    @RequestMapping("/comtntrsmrcvmntrng/updateComtntrsmrcvmntrng.do")
    public String updateComtntrsmrcvmntrng(
            ComtntrsmrcvmntrngVO comtntrsmrcvmntrngVO,
            @ModelAttribute("searchVO") ComtntrsmrcvmntrngDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtntrsmrcvmntrngService.updateComtntrsmrcvmntrng(comtntrsmrcvmntrngVO);
        status.setComplete();
        return "forward:/comtntrsmrcvmntrng/ComtntrsmrcvmntrngList.do";
    }
    
    @RequestMapping("/comtntrsmrcvmntrng/deleteComtntrsmrcvmntrng.do")
    public String deleteComtntrsmrcvmntrng(
            ComtntrsmrcvmntrngVO comtntrsmrcvmntrngVO,
            @ModelAttribute("searchVO") ComtntrsmrcvmntrngDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtntrsmrcvmntrngService.deleteComtntrsmrcvmntrng(comtntrsmrcvmntrngVO);
        status.setComplete();
        return "forward:/comtntrsmrcvmntrng/ComtntrsmrcvmntrngList.do";
    }

}
