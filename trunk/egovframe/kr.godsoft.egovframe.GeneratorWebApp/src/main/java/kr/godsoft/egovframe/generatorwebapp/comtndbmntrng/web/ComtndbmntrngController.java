package kr.godsoft.egovframe.generatorwebapp.comtndbmntrng.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtndbmntrng.service.ComtndbmntrngService;
import kr.godsoft.egovframe.generatorwebapp.comtndbmntrng.service.ComtndbmntrngDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtndbmntrng.service.ComtndbmntrngVO;

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
 * @Class Name : ComtndbmntrngController.java
 * @Description : Comtndbmntrng Controller class
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
public class ComtndbmntrngController {

    @Resource(name = "comtndbmntrngService")
    private ComtndbmntrngService comtndbmntrngService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtndbmntrng 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtndbmntrngVO
	 * @return "/comtndbmntrng/ComtndbmntrngList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtndbmntrng/ComtndbmntrngList.do")
    public String selectComtndbmntrngList(@ModelAttribute("searchVO") ComtndbmntrngVO searchVO, 
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
		
        List<EgovMap> comtndbmntrngList = comtndbmntrngService.selectComtndbmntrngList(searchVO);
        model.addAttribute("resultList", comtndbmntrngList);
        
        int totCnt = comtndbmntrngService.selectComtndbmntrngListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtndbmntrng/ComtndbmntrngList";
    } 
    
    @RequestMapping("/comtndbmntrng/addComtndbmntrngView.do")
    public String addComtndbmntrngView(
            @ModelAttribute("searchVO") ComtndbmntrngDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtndbmntrngVO", new ComtndbmntrngVO());
        return "/comtndbmntrng/ComtndbmntrngRegister";
    }
    
    @RequestMapping("/comtndbmntrng/addComtndbmntrng.do")
    public String addComtndbmntrng(
            ComtndbmntrngVO comtndbmntrngVO,
            @ModelAttribute("searchVO") ComtndbmntrngDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtndbmntrngService.insertComtndbmntrng(comtndbmntrngVO);
        status.setComplete();
        return "forward:/comtndbmntrng/ComtndbmntrngList.do";
    }
    
    @RequestMapping("/comtndbmntrng/updateComtndbmntrngView.do")
    public String updateComtndbmntrngView(
            @RequestParam("dataSourcNm") String dataSourcNm ,
            @ModelAttribute("searchVO") ComtndbmntrngDefaultVO searchVO, Model model)
            throws Exception {
        ComtndbmntrngVO comtndbmntrngVO = new ComtndbmntrngVO();
        comtndbmntrngVO.setDataSourcNm(dataSourcNm);
;        
        // 변수명은 CoC 에 따라 comtndbmntrngVO
        model.addAttribute(selectComtndbmntrng(comtndbmntrngVO, searchVO));
        return "/comtndbmntrng/ComtndbmntrngRegister";
    }

    @RequestMapping("/comtndbmntrng/selectComtndbmntrng.do")
    public @ModelAttribute("comtndbmntrngVO")
    ComtndbmntrngVO selectComtndbmntrng(
            ComtndbmntrngVO comtndbmntrngVO,
            @ModelAttribute("searchVO") ComtndbmntrngDefaultVO searchVO) throws Exception {
        return comtndbmntrngService.selectComtndbmntrng(comtndbmntrngVO);
    }

    @RequestMapping("/comtndbmntrng/updateComtndbmntrng.do")
    public String updateComtndbmntrng(
            ComtndbmntrngVO comtndbmntrngVO,
            @ModelAttribute("searchVO") ComtndbmntrngDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtndbmntrngService.updateComtndbmntrng(comtndbmntrngVO);
        status.setComplete();
        return "forward:/comtndbmntrng/ComtndbmntrngList.do";
    }
    
    @RequestMapping("/comtndbmntrng/deleteComtndbmntrng.do")
    public String deleteComtndbmntrng(
            ComtndbmntrngVO comtndbmntrngVO,
            @ModelAttribute("searchVO") ComtndbmntrngDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtndbmntrngService.deleteComtndbmntrng(comtndbmntrngVO);
        status.setComplete();
        return "forward:/comtndbmntrng/ComtndbmntrngList.do";
    }

}
