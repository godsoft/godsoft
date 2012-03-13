package kr.godsoft.egovframe.generatorwebapp.comtnqustnrrspnsresult.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtnqustnrrspnsresult.service.ComtnqustnrrspnsresultService;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnrrspnsresult.service.ComtnqustnrrspnsresultDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnrrspnsresult.service.ComtnqustnrrspnsresultVO;

/**
 * @Class Name : ComtnqustnrrspnsresultController.java
 * @Description : Comtnqustnrrspnsresult Controller class
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
@SessionAttributes(types=ComtnqustnrrspnsresultVO.class)
public class ComtnqustnrrspnsresultController {

    @Resource(name = "comtnqustnrrspnsresultService")
    private ComtnqustnrrspnsresultService comtnqustnrrspnsresultService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnqustnrrspnsresult 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnqustnrrspnsresultDefaultVO
	 * @return "/comtnqustnrrspnsresult/ComtnqustnrrspnsresultList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnqustnrrspnsresult/ComtnqustnrrspnsresultList.do")
    public String selectComtnqustnrrspnsresultList(@ModelAttribute("searchVO") ComtnqustnrrspnsresultDefaultVO searchVO, 
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
		
        List comtnqustnrrspnsresultList = comtnqustnrrspnsresultService.selectComtnqustnrrspnsresultList(searchVO);
        model.addAttribute("resultList", comtnqustnrrspnsresultList);
        
        int totCnt = comtnqustnrrspnsresultService.selectComtnqustnrrspnsresultListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnqustnrrspnsresult/ComtnqustnrrspnsresultList";
    } 
    
    @RequestMapping("/comtnqustnrrspnsresult/addComtnqustnrrspnsresultView.do")
    public String addComtnqustnrrspnsresultView(
            @ModelAttribute("searchVO") ComtnqustnrrspnsresultDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnqustnrrspnsresultVO", new ComtnqustnrrspnsresultVO());
        return "/comtnqustnrrspnsresult/ComtnqustnrrspnsresultRegister";
    }
    
    @RequestMapping("/comtnqustnrrspnsresult/addComtnqustnrrspnsresult.do")
    public String addComtnqustnrrspnsresult(
            ComtnqustnrrspnsresultVO comtnqustnrrspnsresultVO,
            @ModelAttribute("searchVO") ComtnqustnrrspnsresultDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnqustnrrspnsresultService.insertComtnqustnrrspnsresult(comtnqustnrrspnsresultVO);
        status.setComplete();
        return "forward:/comtnqustnrrspnsresult/ComtnqustnrrspnsresultList.do";
    }
    
    @RequestMapping("/comtnqustnrrspnsresult/updateComtnqustnrrspnsresultView.do")
    public String updateComtnqustnrrspnsresultView(
            @RequestParam("qustnrRspnsResultId") String qustnrRspnsResultId ,
            @RequestParam("qestnrId") String qestnrId ,
            @RequestParam("qustnrQesitmId") String qustnrQesitmId ,
            @RequestParam("qustnrTmplatId") String qustnrTmplatId ,
            @ModelAttribute("searchVO") ComtnqustnrrspnsresultDefaultVO searchVO, Model model)
            throws Exception {
        ComtnqustnrrspnsresultVO comtnqustnrrspnsresultVO = new ComtnqustnrrspnsresultVO();
        comtnqustnrrspnsresultVO.setQustnrRspnsResultId(qustnrRspnsResultId);
        comtnqustnrrspnsresultVO.setQestnrId(qestnrId);
        comtnqustnrrspnsresultVO.setQustnrQesitmId(qustnrQesitmId);
        comtnqustnrrspnsresultVO.setQustnrTmplatId(qustnrTmplatId);
;        
        // 변수명은 CoC 에 따라 comtnqustnrrspnsresultVO
        model.addAttribute(selectComtnqustnrrspnsresult(comtnqustnrrspnsresultVO, searchVO));
        return "/comtnqustnrrspnsresult/ComtnqustnrrspnsresultRegister";
    }

    @RequestMapping("/comtnqustnrrspnsresult/selectComtnqustnrrspnsresult.do")
    public @ModelAttribute("comtnqustnrrspnsresultVO")
    ComtnqustnrrspnsresultVO selectComtnqustnrrspnsresult(
            ComtnqustnrrspnsresultVO comtnqustnrrspnsresultVO,
            @ModelAttribute("searchVO") ComtnqustnrrspnsresultDefaultVO searchVO) throws Exception {
        return comtnqustnrrspnsresultService.selectComtnqustnrrspnsresult(comtnqustnrrspnsresultVO);
    }

    @RequestMapping("/comtnqustnrrspnsresult/updateComtnqustnrrspnsresult.do")
    public String updateComtnqustnrrspnsresult(
            ComtnqustnrrspnsresultVO comtnqustnrrspnsresultVO,
            @ModelAttribute("searchVO") ComtnqustnrrspnsresultDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnqustnrrspnsresultService.updateComtnqustnrrspnsresult(comtnqustnrrspnsresultVO);
        status.setComplete();
        return "forward:/comtnqustnrrspnsresult/ComtnqustnrrspnsresultList.do";
    }
    
    @RequestMapping("/comtnqustnrrspnsresult/deleteComtnqustnrrspnsresult.do")
    public String deleteComtnqustnrrspnsresult(
            ComtnqustnrrspnsresultVO comtnqustnrrspnsresultVO,
            @ModelAttribute("searchVO") ComtnqustnrrspnsresultDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnqustnrrspnsresultService.deleteComtnqustnrrspnsresult(comtnqustnrrspnsresultVO);
        status.setComplete();
        return "forward:/comtnqustnrrspnsresult/ComtnqustnrrspnsresultList.do";
    }

}
