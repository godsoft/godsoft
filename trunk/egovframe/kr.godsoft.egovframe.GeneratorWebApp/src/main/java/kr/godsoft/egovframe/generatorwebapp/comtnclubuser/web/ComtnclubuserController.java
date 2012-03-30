package kr.godsoft.egovframe.generatorwebapp.comtnclubuser.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnclubuser.service.ComtnclubuserService;
import kr.godsoft.egovframe.generatorwebapp.comtnclubuser.service.ComtnclubuserDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnclubuser.service.ComtnclubuserVO;

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
 * @Class Name : ComtnclubuserController.java
 * @Description : Comtnclubuser Controller class
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
public class ComtnclubuserController {

    @Resource(name = "comtnclubuserService")
    private ComtnclubuserService comtnclubuserService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNCLUBUSER 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnclubuserVO
	 * @return "/comtnclubuser/ComtnclubuserList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnclubuser/ComtnclubuserList.do")
    public String selectComtnclubuserList(@ModelAttribute("searchVO") ComtnclubuserVO searchVO, 
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
		
        List<EgovMap> comtnclubuserList = comtnclubuserService.selectComtnclubuserList(searchVO);
        model.addAttribute("resultList", comtnclubuserList);
        
        int totCnt = comtnclubuserService.selectComtnclubuserListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnclubuser/ComtnclubuserList";
    } 
    
    @RequestMapping("/comtnclubuser/addComtnclubuserView.do")
    public String addComtnclubuserView(
            @ModelAttribute("searchVO") ComtnclubuserDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnclubuserVO", new ComtnclubuserVO());
        return "/comtnclubuser/ComtnclubuserRegister";
    }
    
    @RequestMapping("/comtnclubuser/addComtnclubuser.do")
    public String addComtnclubuser(
            ComtnclubuserVO comtnclubuserVO,
            @ModelAttribute("searchVO") ComtnclubuserDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnclubuserService.insertComtnclubuser(comtnclubuserVO);
        status.setComplete();
        return "forward:/comtnclubuser/ComtnclubuserList.do";
    }
    
    @RequestMapping("/comtnclubuser/updateComtnclubuserView.do")
    public String updateComtnclubuserView(
            @RequestParam("clbId") String clbId ,
            @RequestParam("cmmntyId") String cmmntyId ,
            @RequestParam("emplyrId") String emplyrId ,
            @ModelAttribute("searchVO") ComtnclubuserDefaultVO searchVO, Model model)
            throws Exception {
        ComtnclubuserVO comtnclubuserVO = new ComtnclubuserVO();
        comtnclubuserVO.setClbId(clbId);
        comtnclubuserVO.setCmmntyId(cmmntyId);
        comtnclubuserVO.setEmplyrId(emplyrId);
;        
        // 변수명은 CoC 에 따라 comtnclubuserVO
        model.addAttribute(selectComtnclubuser(comtnclubuserVO, searchVO));
        return "/comtnclubuser/ComtnclubuserRegister";
    }

    @RequestMapping("/comtnclubuser/selectComtnclubuser.do")
    public @ModelAttribute("comtnclubuserVO")
    ComtnclubuserVO selectComtnclubuser(
            ComtnclubuserVO comtnclubuserVO,
            @ModelAttribute("searchVO") ComtnclubuserDefaultVO searchVO) throws Exception {
        return comtnclubuserService.selectComtnclubuser(comtnclubuserVO);
    }

    @RequestMapping("/comtnclubuser/updateComtnclubuser.do")
    public String updateComtnclubuser(
            ComtnclubuserVO comtnclubuserVO,
            @ModelAttribute("searchVO") ComtnclubuserDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnclubuserService.updateComtnclubuser(comtnclubuserVO);
        status.setComplete();
        return "forward:/comtnclubuser/ComtnclubuserList.do";
    }
    
    @RequestMapping("/comtnclubuser/deleteComtnclubuser.do")
    public String deleteComtnclubuser(
            ComtnclubuserVO comtnclubuserVO,
            @ModelAttribute("searchVO") ComtnclubuserDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnclubuserService.deleteComtnclubuser(comtnclubuserVO);
        status.setComplete();
        return "forward:/comtnclubuser/ComtnclubuserList.do";
    }

}
