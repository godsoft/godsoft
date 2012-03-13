package kr.godsoft.egovframe.generatorwebapp.comtnqustnriem.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtnqustnriem.service.ComtnqustnriemService;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnriem.service.ComtnqustnriemDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnriem.service.ComtnqustnriemVO;

/**
 * @Class Name : ComtnqustnriemController.java
 * @Description : Comtnqustnriem Controller class
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
@SessionAttributes(types=ComtnqustnriemVO.class)
public class ComtnqustnriemController {

    @Resource(name = "comtnqustnriemService")
    private ComtnqustnriemService comtnqustnriemService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnqustnriem 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnqustnriemDefaultVO
	 * @return "/comtnqustnriem/ComtnqustnriemList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnqustnriem/ComtnqustnriemList.do")
    public String selectComtnqustnriemList(@ModelAttribute("searchVO") ComtnqustnriemDefaultVO searchVO, 
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
		
        List comtnqustnriemList = comtnqustnriemService.selectComtnqustnriemList(searchVO);
        model.addAttribute("resultList", comtnqustnriemList);
        
        int totCnt = comtnqustnriemService.selectComtnqustnriemListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnqustnriem/ComtnqustnriemList";
    } 
    
    @RequestMapping("/comtnqustnriem/addComtnqustnriemView.do")
    public String addComtnqustnriemView(
            @ModelAttribute("searchVO") ComtnqustnriemDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnqustnriemVO", new ComtnqustnriemVO());
        return "/comtnqustnriem/ComtnqustnriemRegister";
    }
    
    @RequestMapping("/comtnqustnriem/addComtnqustnriem.do")
    public String addComtnqustnriem(
            ComtnqustnriemVO comtnqustnriemVO,
            @ModelAttribute("searchVO") ComtnqustnriemDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnqustnriemService.insertComtnqustnriem(comtnqustnriemVO);
        status.setComplete();
        return "forward:/comtnqustnriem/ComtnqustnriemList.do";
    }
    
    @RequestMapping("/comtnqustnriem/updateComtnqustnriemView.do")
    public String updateComtnqustnriemView(
            @RequestParam("qustnrTmplatId") String qustnrTmplatId ,
            @RequestParam("qestnrId") String qestnrId ,
            @RequestParam("qustnrQesitmId") String qustnrQesitmId ,
            @RequestParam("qustnrIemId") String qustnrIemId ,
            @ModelAttribute("searchVO") ComtnqustnriemDefaultVO searchVO, Model model)
            throws Exception {
        ComtnqustnriemVO comtnqustnriemVO = new ComtnqustnriemVO();
        comtnqustnriemVO.setQustnrTmplatId(qustnrTmplatId);
        comtnqustnriemVO.setQestnrId(qestnrId);
        comtnqustnriemVO.setQustnrQesitmId(qustnrQesitmId);
        comtnqustnriemVO.setQustnrIemId(qustnrIemId);
;        
        // 변수명은 CoC 에 따라 comtnqustnriemVO
        model.addAttribute(selectComtnqustnriem(comtnqustnriemVO, searchVO));
        return "/comtnqustnriem/ComtnqustnriemRegister";
    }

    @RequestMapping("/comtnqustnriem/selectComtnqustnriem.do")
    public @ModelAttribute("comtnqustnriemVO")
    ComtnqustnriemVO selectComtnqustnriem(
            ComtnqustnriemVO comtnqustnriemVO,
            @ModelAttribute("searchVO") ComtnqustnriemDefaultVO searchVO) throws Exception {
        return comtnqustnriemService.selectComtnqustnriem(comtnqustnriemVO);
    }

    @RequestMapping("/comtnqustnriem/updateComtnqustnriem.do")
    public String updateComtnqustnriem(
            ComtnqustnriemVO comtnqustnriemVO,
            @ModelAttribute("searchVO") ComtnqustnriemDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnqustnriemService.updateComtnqustnriem(comtnqustnriemVO);
        status.setComplete();
        return "forward:/comtnqustnriem/ComtnqustnriemList.do";
    }
    
    @RequestMapping("/comtnqustnriem/deleteComtnqustnriem.do")
    public String deleteComtnqustnriem(
            ComtnqustnriemVO comtnqustnriemVO,
            @ModelAttribute("searchVO") ComtnqustnriemDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnqustnriemService.deleteComtnqustnriem(comtnqustnriemVO);
        status.setComplete();
        return "forward:/comtnqustnriem/ComtnqustnriemList.do";
    }

}
