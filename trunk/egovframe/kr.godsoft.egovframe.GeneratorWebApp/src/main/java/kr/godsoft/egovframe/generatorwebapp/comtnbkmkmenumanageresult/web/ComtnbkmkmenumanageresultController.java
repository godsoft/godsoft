package kr.godsoft.egovframe.generatorwebapp.comtnbkmkmenumanageresult.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnbkmkmenumanageresult.service.ComtnbkmkmenumanageresultService;
import kr.godsoft.egovframe.generatorwebapp.comtnbkmkmenumanageresult.service.ComtnbkmkmenumanageresultDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbkmkmenumanageresult.service.ComtnbkmkmenumanageresultVO;

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
 * @Class Name : ComtnbkmkmenumanageresultController.java
 * @Description : Comtnbkmkmenumanageresult Controller class
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
@SessionAttributes(types=ComtnbkmkmenumanageresultVO.class)
public class ComtnbkmkmenumanageresultController {

    @Resource(name = "comtnbkmkmenumanageresultService")
    private ComtnbkmkmenumanageresultService comtnbkmkmenumanageresultService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnbkmkmenumanageresult 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnbkmkmenumanageresultVO
	 * @return "/comtnbkmkmenumanageresult/ComtnbkmkmenumanageresultList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnbkmkmenumanageresult/ComtnbkmkmenumanageresultList.do")
    public String selectComtnbkmkmenumanageresultList(@ModelAttribute("searchVO") ComtnbkmkmenumanageresultVO searchVO, 
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
		
        List<EgovMap> comtnbkmkmenumanageresultList = comtnbkmkmenumanageresultService.selectComtnbkmkmenumanageresultList(searchVO);
        model.addAttribute("resultList", comtnbkmkmenumanageresultList);
        
        int totCnt = comtnbkmkmenumanageresultService.selectComtnbkmkmenumanageresultListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnbkmkmenumanageresult/ComtnbkmkmenumanageresultList";
    } 
    
    @RequestMapping("/comtnbkmkmenumanageresult/addComtnbkmkmenumanageresultView.do")
    public String addComtnbkmkmenumanageresultView(
            @ModelAttribute("searchVO") ComtnbkmkmenumanageresultDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnbkmkmenumanageresultVO", new ComtnbkmkmenumanageresultVO());
        return "/comtnbkmkmenumanageresult/ComtnbkmkmenumanageresultRegister";
    }
    
    @RequestMapping("/comtnbkmkmenumanageresult/addComtnbkmkmenumanageresult.do")
    public String addComtnbkmkmenumanageresult(
            ComtnbkmkmenumanageresultVO comtnbkmkmenumanageresultVO,
            @ModelAttribute("searchVO") ComtnbkmkmenumanageresultDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbkmkmenumanageresultService.insertComtnbkmkmenumanageresult(comtnbkmkmenumanageresultVO);
        status.setComplete();
        return "forward:/comtnbkmkmenumanageresult/ComtnbkmkmenumanageresultList.do";
    }
    
    @RequestMapping("/comtnbkmkmenumanageresult/updateComtnbkmkmenumanageresultView.do")
    public String updateComtnbkmkmenumanageresultView(
            @RequestParam("menuId") int menuId ,
            @RequestParam("emplyrId") String emplyrId ,
            @ModelAttribute("searchVO") ComtnbkmkmenumanageresultDefaultVO searchVO, Model model)
            throws Exception {
        ComtnbkmkmenumanageresultVO comtnbkmkmenumanageresultVO = new ComtnbkmkmenumanageresultVO();
        comtnbkmkmenumanageresultVO.setMenuId(menuId);
        comtnbkmkmenumanageresultVO.setEmplyrId(emplyrId);
;        
        // 변수명은 CoC 에 따라 comtnbkmkmenumanageresultVO
        model.addAttribute(selectComtnbkmkmenumanageresult(comtnbkmkmenumanageresultVO, searchVO));
        return "/comtnbkmkmenumanageresult/ComtnbkmkmenumanageresultRegister";
    }

    @RequestMapping("/comtnbkmkmenumanageresult/selectComtnbkmkmenumanageresult.do")
    public @ModelAttribute("comtnbkmkmenumanageresultVO")
    ComtnbkmkmenumanageresultVO selectComtnbkmkmenumanageresult(
            ComtnbkmkmenumanageresultVO comtnbkmkmenumanageresultVO,
            @ModelAttribute("searchVO") ComtnbkmkmenumanageresultDefaultVO searchVO) throws Exception {
        return comtnbkmkmenumanageresultService.selectComtnbkmkmenumanageresult(comtnbkmkmenumanageresultVO);
    }

    @RequestMapping("/comtnbkmkmenumanageresult/updateComtnbkmkmenumanageresult.do")
    public String updateComtnbkmkmenumanageresult(
            ComtnbkmkmenumanageresultVO comtnbkmkmenumanageresultVO,
            @ModelAttribute("searchVO") ComtnbkmkmenumanageresultDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbkmkmenumanageresultService.updateComtnbkmkmenumanageresult(comtnbkmkmenumanageresultVO);
        status.setComplete();
        return "forward:/comtnbkmkmenumanageresult/ComtnbkmkmenumanageresultList.do";
    }
    
    @RequestMapping("/comtnbkmkmenumanageresult/deleteComtnbkmkmenumanageresult.do")
    public String deleteComtnbkmkmenumanageresult(
            ComtnbkmkmenumanageresultVO comtnbkmkmenumanageresultVO,
            @ModelAttribute("searchVO") ComtnbkmkmenumanageresultDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbkmkmenumanageresultService.deleteComtnbkmkmenumanageresult(comtnbkmkmenumanageresultVO);
        status.setComplete();
        return "forward:/comtnbkmkmenumanageresult/ComtnbkmkmenumanageresultList.do";
    }

}
