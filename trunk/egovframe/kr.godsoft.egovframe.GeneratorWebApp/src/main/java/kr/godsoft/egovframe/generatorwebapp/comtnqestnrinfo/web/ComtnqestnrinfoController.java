package kr.godsoft.egovframe.generatorwebapp.comtnqestnrinfo.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtnqestnrinfo.service.ComtnqestnrinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnqestnrinfo.service.ComtnqestnrinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnqestnrinfo.service.ComtnqestnrinfoVO;

/**
 * @Class Name : ComtnqestnrinfoController.java
 * @Description : Comtnqestnrinfo Controller class
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
@SessionAttributes(types=ComtnqestnrinfoVO.class)
public class ComtnqestnrinfoController {

    @Resource(name = "comtnqestnrinfoService")
    private ComtnqestnrinfoService comtnqestnrinfoService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnqestnrinfo 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnqestnrinfoDefaultVO
	 * @return "/comtnqestnrinfo/ComtnqestnrinfoList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnqestnrinfo/ComtnqestnrinfoList.do")
    public String selectComtnqestnrinfoList(@ModelAttribute("searchVO") ComtnqestnrinfoDefaultVO searchVO, 
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
		
        List comtnqestnrinfoList = comtnqestnrinfoService.selectComtnqestnrinfoList(searchVO);
        model.addAttribute("resultList", comtnqestnrinfoList);
        
        int totCnt = comtnqestnrinfoService.selectComtnqestnrinfoListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnqestnrinfo/ComtnqestnrinfoList";
    } 
    
    @RequestMapping("/comtnqestnrinfo/addComtnqestnrinfoView.do")
    public String addComtnqestnrinfoView(
            @ModelAttribute("searchVO") ComtnqestnrinfoDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnqestnrinfoVO", new ComtnqestnrinfoVO());
        return "/comtnqestnrinfo/ComtnqestnrinfoRegister";
    }
    
    @RequestMapping("/comtnqestnrinfo/addComtnqestnrinfo.do")
    public String addComtnqestnrinfo(
            ComtnqestnrinfoVO comtnqestnrinfoVO,
            @ModelAttribute("searchVO") ComtnqestnrinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnqestnrinfoService.insertComtnqestnrinfo(comtnqestnrinfoVO);
        status.setComplete();
        return "forward:/comtnqestnrinfo/ComtnqestnrinfoList.do";
    }
    
    @RequestMapping("/comtnqestnrinfo/updateComtnqestnrinfoView.do")
    public String updateComtnqestnrinfoView(
            @RequestParam("qustnrTmplatId") String qustnrTmplatId ,
            @RequestParam("qestnrId") String qestnrId ,
            @ModelAttribute("searchVO") ComtnqestnrinfoDefaultVO searchVO, Model model)
            throws Exception {
        ComtnqestnrinfoVO comtnqestnrinfoVO = new ComtnqestnrinfoVO();
        comtnqestnrinfoVO.setQustnrTmplatId(qustnrTmplatId);
        comtnqestnrinfoVO.setQestnrId(qestnrId);
;        
        // 변수명은 CoC 에 따라 comtnqestnrinfoVO
        model.addAttribute(selectComtnqestnrinfo(comtnqestnrinfoVO, searchVO));
        return "/comtnqestnrinfo/ComtnqestnrinfoRegister";
    }

    @RequestMapping("/comtnqestnrinfo/selectComtnqestnrinfo.do")
    public @ModelAttribute("comtnqestnrinfoVO")
    ComtnqestnrinfoVO selectComtnqestnrinfo(
            ComtnqestnrinfoVO comtnqestnrinfoVO,
            @ModelAttribute("searchVO") ComtnqestnrinfoDefaultVO searchVO) throws Exception {
        return comtnqestnrinfoService.selectComtnqestnrinfo(comtnqestnrinfoVO);
    }

    @RequestMapping("/comtnqestnrinfo/updateComtnqestnrinfo.do")
    public String updateComtnqestnrinfo(
            ComtnqestnrinfoVO comtnqestnrinfoVO,
            @ModelAttribute("searchVO") ComtnqestnrinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnqestnrinfoService.updateComtnqestnrinfo(comtnqestnrinfoVO);
        status.setComplete();
        return "forward:/comtnqestnrinfo/ComtnqestnrinfoList.do";
    }
    
    @RequestMapping("/comtnqestnrinfo/deleteComtnqestnrinfo.do")
    public String deleteComtnqestnrinfo(
            ComtnqestnrinfoVO comtnqestnrinfoVO,
            @ModelAttribute("searchVO") ComtnqestnrinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnqestnrinfoService.deleteComtnqestnrinfo(comtnqestnrinfoVO);
        status.setComplete();
        return "forward:/comtnqestnrinfo/ComtnqestnrinfoList.do";
    }

}
