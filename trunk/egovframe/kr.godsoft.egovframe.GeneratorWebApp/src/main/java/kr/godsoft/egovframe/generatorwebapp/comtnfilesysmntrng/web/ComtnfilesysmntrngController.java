package kr.godsoft.egovframe.generatorwebapp.comtnfilesysmntrng.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnfilesysmntrng.service.ComtnfilesysmntrngService;
import kr.godsoft.egovframe.generatorwebapp.comtnfilesysmntrng.service.ComtnfilesysmntrngDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnfilesysmntrng.service.ComtnfilesysmntrngVO;

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
 * @Class Name : ComtnfilesysmntrngController.java
 * @Description : Comtnfilesysmntrng Controller class
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
public class ComtnfilesysmntrngController {

    @Resource(name = "comtnfilesysmntrngService")
    private ComtnfilesysmntrngService comtnfilesysmntrngService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNFILESYSMNTRNG 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnfilesysmntrngVO
	 * @return "/comtnfilesysmntrng/ComtnfilesysmntrngList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnfilesysmntrng/ComtnfilesysmntrngList.do")
    public String selectComtnfilesysmntrngList(@ModelAttribute("searchVO") ComtnfilesysmntrngVO searchVO, 
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
		
        List<EgovMap> comtnfilesysmntrngList = comtnfilesysmntrngService.selectComtnfilesysmntrngList(searchVO);
        model.addAttribute("resultList", comtnfilesysmntrngList);
        
        int totCnt = comtnfilesysmntrngService.selectComtnfilesysmntrngListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnfilesysmntrng/ComtnfilesysmntrngList";
    } 
    
    @RequestMapping("/comtnfilesysmntrng/addComtnfilesysmntrngView.do")
    public String addComtnfilesysmntrngView(
            @ModelAttribute("searchVO") ComtnfilesysmntrngDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnfilesysmntrngVO", new ComtnfilesysmntrngVO());
        return "/comtnfilesysmntrng/ComtnfilesysmntrngRegister";
    }
    
    @RequestMapping("/comtnfilesysmntrng/addComtnfilesysmntrng.do")
    public String addComtnfilesysmntrng(
            ComtnfilesysmntrngVO comtnfilesysmntrngVO,
            @ModelAttribute("searchVO") ComtnfilesysmntrngDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnfilesysmntrngService.insertComtnfilesysmntrng(comtnfilesysmntrngVO);
        status.setComplete();
        return "forward:/comtnfilesysmntrng/ComtnfilesysmntrngList.do";
    }
    
    @RequestMapping("/comtnfilesysmntrng/updateComtnfilesysmntrngView.do")
    public String updateComtnfilesysmntrngView(
            @RequestParam("fileSysId") String fileSysId ,
            @ModelAttribute("searchVO") ComtnfilesysmntrngDefaultVO searchVO, Model model)
            throws Exception {
        ComtnfilesysmntrngVO comtnfilesysmntrngVO = new ComtnfilesysmntrngVO();
        comtnfilesysmntrngVO.setFileSysId(fileSysId);
;        
        // 변수명은 CoC 에 따라 comtnfilesysmntrngVO
        model.addAttribute(selectComtnfilesysmntrng(comtnfilesysmntrngVO, searchVO));
        return "/comtnfilesysmntrng/ComtnfilesysmntrngRegister";
    }

    @RequestMapping("/comtnfilesysmntrng/selectComtnfilesysmntrng.do")
    public @ModelAttribute("comtnfilesysmntrngVO")
    ComtnfilesysmntrngVO selectComtnfilesysmntrng(
            ComtnfilesysmntrngVO comtnfilesysmntrngVO,
            @ModelAttribute("searchVO") ComtnfilesysmntrngDefaultVO searchVO) throws Exception {
        return comtnfilesysmntrngService.selectComtnfilesysmntrng(comtnfilesysmntrngVO);
    }

    @RequestMapping("/comtnfilesysmntrng/updateComtnfilesysmntrng.do")
    public String updateComtnfilesysmntrng(
            ComtnfilesysmntrngVO comtnfilesysmntrngVO,
            @ModelAttribute("searchVO") ComtnfilesysmntrngDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnfilesysmntrngService.updateComtnfilesysmntrng(comtnfilesysmntrngVO);
        status.setComplete();
        return "forward:/comtnfilesysmntrng/ComtnfilesysmntrngList.do";
    }
    
    @RequestMapping("/comtnfilesysmntrng/deleteComtnfilesysmntrng.do")
    public String deleteComtnfilesysmntrng(
            ComtnfilesysmntrngVO comtnfilesysmntrngVO,
            @ModelAttribute("searchVO") ComtnfilesysmntrngDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnfilesysmntrngService.deleteComtnfilesysmntrng(comtnfilesysmntrngVO);
        status.setComplete();
        return "forward:/comtnfilesysmntrng/ComtnfilesysmntrngList.do";
    }

}
