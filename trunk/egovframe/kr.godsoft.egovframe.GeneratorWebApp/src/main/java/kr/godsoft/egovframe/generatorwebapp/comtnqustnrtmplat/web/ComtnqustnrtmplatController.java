package kr.godsoft.egovframe.generatorwebapp.comtnqustnrtmplat.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnqustnrtmplat.service.ComtnqustnrtmplatService;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnrtmplat.service.ComtnqustnrtmplatDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnrtmplat.service.ComtnqustnrtmplatVO;

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
 * @Class Name : ComtnqustnrtmplatController.java
 * @Description : Comtnqustnrtmplat Controller class
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
@SessionAttributes(types=ComtnqustnrtmplatVO.class)
public class ComtnqustnrtmplatController {

    @Resource(name = "comtnqustnrtmplatService")
    private ComtnqustnrtmplatService comtnqustnrtmplatService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnqustnrtmplat 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnqustnrtmplatVO
	 * @return "/comtnqustnrtmplat/ComtnqustnrtmplatList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnqustnrtmplat/ComtnqustnrtmplatList.do")
    public String selectComtnqustnrtmplatList(@ModelAttribute("searchVO") ComtnqustnrtmplatVO searchVO, 
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
		
        List<EgovMap> comtnqustnrtmplatList = comtnqustnrtmplatService.selectComtnqustnrtmplatList(searchVO);
        model.addAttribute("resultList", comtnqustnrtmplatList);
        
        int totCnt = comtnqustnrtmplatService.selectComtnqustnrtmplatListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnqustnrtmplat/ComtnqustnrtmplatList";
    } 
    
    @RequestMapping("/comtnqustnrtmplat/addComtnqustnrtmplatView.do")
    public String addComtnqustnrtmplatView(
            @ModelAttribute("searchVO") ComtnqustnrtmplatDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnqustnrtmplatVO", new ComtnqustnrtmplatVO());
        return "/comtnqustnrtmplat/ComtnqustnrtmplatRegister";
    }
    
    @RequestMapping("/comtnqustnrtmplat/addComtnqustnrtmplat.do")
    public String addComtnqustnrtmplat(
            ComtnqustnrtmplatVO comtnqustnrtmplatVO,
            @ModelAttribute("searchVO") ComtnqustnrtmplatDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnqustnrtmplatService.insertComtnqustnrtmplat(comtnqustnrtmplatVO);
        status.setComplete();
        return "forward:/comtnqustnrtmplat/ComtnqustnrtmplatList.do";
    }
    
    @RequestMapping("/comtnqustnrtmplat/updateComtnqustnrtmplatView.do")
    public String updateComtnqustnrtmplatView(
            @RequestParam("qustnrTmplatId") String qustnrTmplatId ,
            @ModelAttribute("searchVO") ComtnqustnrtmplatDefaultVO searchVO, Model model)
            throws Exception {
        ComtnqustnrtmplatVO comtnqustnrtmplatVO = new ComtnqustnrtmplatVO();
        comtnqustnrtmplatVO.setQustnrTmplatId(qustnrTmplatId);
;        
        // 변수명은 CoC 에 따라 comtnqustnrtmplatVO
        model.addAttribute(selectComtnqustnrtmplat(comtnqustnrtmplatVO, searchVO));
        return "/comtnqustnrtmplat/ComtnqustnrtmplatRegister";
    }

    @RequestMapping("/comtnqustnrtmplat/selectComtnqustnrtmplat.do")
    public @ModelAttribute("comtnqustnrtmplatVO")
    ComtnqustnrtmplatVO selectComtnqustnrtmplat(
            ComtnqustnrtmplatVO comtnqustnrtmplatVO,
            @ModelAttribute("searchVO") ComtnqustnrtmplatDefaultVO searchVO) throws Exception {
        return comtnqustnrtmplatService.selectComtnqustnrtmplat(comtnqustnrtmplatVO);
    }

    @RequestMapping("/comtnqustnrtmplat/updateComtnqustnrtmplat.do")
    public String updateComtnqustnrtmplat(
            ComtnqustnrtmplatVO comtnqustnrtmplatVO,
            @ModelAttribute("searchVO") ComtnqustnrtmplatDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnqustnrtmplatService.updateComtnqustnrtmplat(comtnqustnrtmplatVO);
        status.setComplete();
        return "forward:/comtnqustnrtmplat/ComtnqustnrtmplatList.do";
    }
    
    @RequestMapping("/comtnqustnrtmplat/deleteComtnqustnrtmplat.do")
    public String deleteComtnqustnrtmplat(
            ComtnqustnrtmplatVO comtnqustnrtmplatVO,
            @ModelAttribute("searchVO") ComtnqustnrtmplatDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnqustnrtmplatService.deleteComtnqustnrtmplat(comtnqustnrtmplatVO);
        status.setComplete();
        return "forward:/comtnqustnrtmplat/ComtnqustnrtmplatList.do";
    }

}
