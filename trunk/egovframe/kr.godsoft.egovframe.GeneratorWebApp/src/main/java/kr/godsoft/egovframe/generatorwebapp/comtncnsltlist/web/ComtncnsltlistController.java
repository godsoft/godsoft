package kr.godsoft.egovframe.generatorwebapp.comtncnsltlist.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtncnsltlist.service.ComtncnsltlistService;
import kr.godsoft.egovframe.generatorwebapp.comtncnsltlist.service.ComtncnsltlistDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtncnsltlist.service.ComtncnsltlistVO;

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
 * @Class Name : ComtncnsltlistController.java
 * @Description : Comtncnsltlist Controller class
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
@SessionAttributes(types=ComtncnsltlistVO.class)
public class ComtncnsltlistController {

    @Resource(name = "comtncnsltlistService")
    private ComtncnsltlistService comtncnsltlistService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtncnsltlist 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtncnsltlistVO
	 * @return "/comtncnsltlist/ComtncnsltlistList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtncnsltlist/ComtncnsltlistList.do")
    public String selectComtncnsltlistList(@ModelAttribute("searchVO") ComtncnsltlistVO searchVO, 
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
		
        List<EgovMap> comtncnsltlistList = comtncnsltlistService.selectComtncnsltlistList(searchVO);
        model.addAttribute("resultList", comtncnsltlistList);
        
        int totCnt = comtncnsltlistService.selectComtncnsltlistListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtncnsltlist/ComtncnsltlistList";
    } 
    
    @RequestMapping("/comtncnsltlist/addComtncnsltlistView.do")
    public String addComtncnsltlistView(
            @ModelAttribute("searchVO") ComtncnsltlistDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtncnsltlistVO", new ComtncnsltlistVO());
        return "/comtncnsltlist/ComtncnsltlistRegister";
    }
    
    @RequestMapping("/comtncnsltlist/addComtncnsltlist.do")
    public String addComtncnsltlist(
            ComtncnsltlistVO comtncnsltlistVO,
            @ModelAttribute("searchVO") ComtncnsltlistDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtncnsltlistService.insertComtncnsltlist(comtncnsltlistVO);
        status.setComplete();
        return "forward:/comtncnsltlist/ComtncnsltlistList.do";
    }
    
    @RequestMapping("/comtncnsltlist/updateComtncnsltlistView.do")
    public String updateComtncnsltlistView(
            @RequestParam("cnsltId") String cnsltId ,
            @ModelAttribute("searchVO") ComtncnsltlistDefaultVO searchVO, Model model)
            throws Exception {
        ComtncnsltlistVO comtncnsltlistVO = new ComtncnsltlistVO();
        comtncnsltlistVO.setCnsltId(cnsltId);
;        
        // 변수명은 CoC 에 따라 comtncnsltlistVO
        model.addAttribute(selectComtncnsltlist(comtncnsltlistVO, searchVO));
        return "/comtncnsltlist/ComtncnsltlistRegister";
    }

    @RequestMapping("/comtncnsltlist/selectComtncnsltlist.do")
    public @ModelAttribute("comtncnsltlistVO")
    ComtncnsltlistVO selectComtncnsltlist(
            ComtncnsltlistVO comtncnsltlistVO,
            @ModelAttribute("searchVO") ComtncnsltlistDefaultVO searchVO) throws Exception {
        return comtncnsltlistService.selectComtncnsltlist(comtncnsltlistVO);
    }

    @RequestMapping("/comtncnsltlist/updateComtncnsltlist.do")
    public String updateComtncnsltlist(
            ComtncnsltlistVO comtncnsltlistVO,
            @ModelAttribute("searchVO") ComtncnsltlistDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtncnsltlistService.updateComtncnsltlist(comtncnsltlistVO);
        status.setComplete();
        return "forward:/comtncnsltlist/ComtncnsltlistList.do";
    }
    
    @RequestMapping("/comtncnsltlist/deleteComtncnsltlist.do")
    public String deleteComtncnsltlist(
            ComtncnsltlistVO comtncnsltlistVO,
            @ModelAttribute("searchVO") ComtncnsltlistDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtncnsltlistService.deleteComtncnsltlist(comtncnsltlistVO);
        status.setComplete();
        return "forward:/comtncnsltlist/ComtncnsltlistList.do";
    }

}
