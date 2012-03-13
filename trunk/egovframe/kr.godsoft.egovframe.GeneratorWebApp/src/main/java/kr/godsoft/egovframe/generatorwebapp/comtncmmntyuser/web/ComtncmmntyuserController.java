package kr.godsoft.egovframe.generatorwebapp.comtncmmntyuser.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import egovframework.rte.fdl.property.EgovPropertyService;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;

import kr.godsoft.egovframe.generatorwebapp.comtncmmntyuser.service.ComtncmmntyuserService;
import kr.godsoft.egovframe.generatorwebapp.comtncmmntyuser.service.ComtncmmntyuserDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtncmmntyuser.service.ComtncmmntyuserVO;

/**
 * @Class Name : ComtncmmntyuserController.java
 * @Description : Comtncmmntyuser Controller class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Controller
@SessionAttributes(types=ComtncmmntyuserVO.class)
public class ComtncmmntyuserController {

    @Resource(name = "comtncmmntyuserService")
    private ComtncmmntyuserService comtncmmntyuserService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtncmmntyuser 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtncmmntyuserDefaultVO
	 * @return "/comtncmmntyuser/ComtncmmntyuserList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtncmmntyuser/ComtncmmntyuserList.do")
    public String selectComtncmmntyuserList(@ModelAttribute("searchVO") ComtncmmntyuserDefaultVO searchVO, 
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
		
        List comtncmmntyuserList = comtncmmntyuserService.selectComtncmmntyuserList(searchVO);
        model.addAttribute("resultList", comtncmmntyuserList);
        
        int totCnt = comtncmmntyuserService.selectComtncmmntyuserListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtncmmntyuser/ComtncmmntyuserList";
    } 
    
    @RequestMapping("/comtncmmntyuser/addComtncmmntyuserView.do")
    public String addComtncmmntyuserView(
            @ModelAttribute("searchVO") ComtncmmntyuserDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtncmmntyuserVO", new ComtncmmntyuserVO());
        return "/comtncmmntyuser/ComtncmmntyuserRegister";
    }
    
    @RequestMapping("/comtncmmntyuser/addComtncmmntyuser.do")
    public String addComtncmmntyuser(
            ComtncmmntyuserVO comtncmmntyuserVO,
            @ModelAttribute("searchVO") ComtncmmntyuserDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtncmmntyuserService.insertComtncmmntyuser(comtncmmntyuserVO);
        status.setComplete();
        return "forward:/comtncmmntyuser/ComtncmmntyuserList.do";
    }
    
    @RequestMapping("/comtncmmntyuser/updateComtncmmntyuserView.do")
    public String updateComtncmmntyuserView(
            @RequestParam("cmmntyId") String cmmntyId ,
            @RequestParam("emplyrId") String emplyrId ,
            @ModelAttribute("searchVO") ComtncmmntyuserDefaultVO searchVO, Model model)
            throws Exception {
        ComtncmmntyuserVO comtncmmntyuserVO = new ComtncmmntyuserVO();
        comtncmmntyuserVO.setCmmntyId(cmmntyId);
        comtncmmntyuserVO.setEmplyrId(emplyrId);
;        
        // 변수명은 CoC 에 따라 comtncmmntyuserVO
        model.addAttribute(selectComtncmmntyuser(comtncmmntyuserVO, searchVO));
        return "/comtncmmntyuser/ComtncmmntyuserRegister";
    }

    @RequestMapping("/comtncmmntyuser/selectComtncmmntyuser.do")
    public @ModelAttribute("comtncmmntyuserVO")
    ComtncmmntyuserVO selectComtncmmntyuser(
            ComtncmmntyuserVO comtncmmntyuserVO,
            @ModelAttribute("searchVO") ComtncmmntyuserDefaultVO searchVO) throws Exception {
        return comtncmmntyuserService.selectComtncmmntyuser(comtncmmntyuserVO);
    }

    @RequestMapping("/comtncmmntyuser/updateComtncmmntyuser.do")
    public String updateComtncmmntyuser(
            ComtncmmntyuserVO comtncmmntyuserVO,
            @ModelAttribute("searchVO") ComtncmmntyuserDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtncmmntyuserService.updateComtncmmntyuser(comtncmmntyuserVO);
        status.setComplete();
        return "forward:/comtncmmntyuser/ComtncmmntyuserList.do";
    }
    
    @RequestMapping("/comtncmmntyuser/deleteComtncmmntyuser.do")
    public String deleteComtncmmntyuser(
            ComtncmmntyuserVO comtncmmntyuserVO,
            @ModelAttribute("searchVO") ComtncmmntyuserDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtncmmntyuserService.deleteComtncmmntyuser(comtncmmntyuserVO);
        status.setComplete();
        return "forward:/comtncmmntyuser/ComtncmmntyuserList.do";
    }

}
