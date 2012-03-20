package kr.godsoft.egovframe.generatorwebapp.comtndeptjobbx.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtndeptjobbx.service.ComtndeptjobbxService;
import kr.godsoft.egovframe.generatorwebapp.comtndeptjobbx.service.ComtndeptjobbxDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtndeptjobbx.service.ComtndeptjobbxVO;

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
 * @Class Name : ComtndeptjobbxController.java
 * @Description : Comtndeptjobbx Controller class
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
public class ComtndeptjobbxController {

    @Resource(name = "comtndeptjobbxService")
    private ComtndeptjobbxService comtndeptjobbxService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtndeptjobbx 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtndeptjobbxVO
	 * @return "/comtndeptjobbx/ComtndeptjobbxList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtndeptjobbx/ComtndeptjobbxList.do")
    public String selectComtndeptjobbxList(@ModelAttribute("searchVO") ComtndeptjobbxVO searchVO, 
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
		
        List<EgovMap> comtndeptjobbxList = comtndeptjobbxService.selectComtndeptjobbxList(searchVO);
        model.addAttribute("resultList", comtndeptjobbxList);
        
        int totCnt = comtndeptjobbxService.selectComtndeptjobbxListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtndeptjobbx/ComtndeptjobbxList";
    } 
    
    @RequestMapping("/comtndeptjobbx/addComtndeptjobbxView.do")
    public String addComtndeptjobbxView(
            @ModelAttribute("searchVO") ComtndeptjobbxDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtndeptjobbxVO", new ComtndeptjobbxVO());
        return "/comtndeptjobbx/ComtndeptjobbxRegister";
    }
    
    @RequestMapping("/comtndeptjobbx/addComtndeptjobbx.do")
    public String addComtndeptjobbx(
            ComtndeptjobbxVO comtndeptjobbxVO,
            @ModelAttribute("searchVO") ComtndeptjobbxDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtndeptjobbxService.insertComtndeptjobbx(comtndeptjobbxVO);
        status.setComplete();
        return "forward:/comtndeptjobbx/ComtndeptjobbxList.do";
    }
    
    @RequestMapping("/comtndeptjobbx/updateComtndeptjobbxView.do")
    public String updateComtndeptjobbxView(
            @RequestParam("deptJobbxId") String deptJobbxId ,
            @ModelAttribute("searchVO") ComtndeptjobbxDefaultVO searchVO, Model model)
            throws Exception {
        ComtndeptjobbxVO comtndeptjobbxVO = new ComtndeptjobbxVO();
        comtndeptjobbxVO.setDeptJobbxId(deptJobbxId);
;        
        // 변수명은 CoC 에 따라 comtndeptjobbxVO
        model.addAttribute(selectComtndeptjobbx(comtndeptjobbxVO, searchVO));
        return "/comtndeptjobbx/ComtndeptjobbxRegister";
    }

    @RequestMapping("/comtndeptjobbx/selectComtndeptjobbx.do")
    public @ModelAttribute("comtndeptjobbxVO")
    ComtndeptjobbxVO selectComtndeptjobbx(
            ComtndeptjobbxVO comtndeptjobbxVO,
            @ModelAttribute("searchVO") ComtndeptjobbxDefaultVO searchVO) throws Exception {
        return comtndeptjobbxService.selectComtndeptjobbx(comtndeptjobbxVO);
    }

    @RequestMapping("/comtndeptjobbx/updateComtndeptjobbx.do")
    public String updateComtndeptjobbx(
            ComtndeptjobbxVO comtndeptjobbxVO,
            @ModelAttribute("searchVO") ComtndeptjobbxDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtndeptjobbxService.updateComtndeptjobbx(comtndeptjobbxVO);
        status.setComplete();
        return "forward:/comtndeptjobbx/ComtndeptjobbxList.do";
    }
    
    @RequestMapping("/comtndeptjobbx/deleteComtndeptjobbx.do")
    public String deleteComtndeptjobbx(
            ComtndeptjobbxVO comtndeptjobbxVO,
            @ModelAttribute("searchVO") ComtndeptjobbxDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtndeptjobbxService.deleteComtndeptjobbx(comtndeptjobbxVO);
        status.setComplete();
        return "forward:/comtndeptjobbx/ComtndeptjobbxList.do";
    }

}
