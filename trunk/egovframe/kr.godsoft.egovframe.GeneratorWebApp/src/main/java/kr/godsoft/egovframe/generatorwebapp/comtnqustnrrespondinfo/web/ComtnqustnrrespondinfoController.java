package kr.godsoft.egovframe.generatorwebapp.comtnqustnrrespondinfo.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtnqustnrrespondinfo.service.ComtnqustnrrespondinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnrrespondinfo.service.ComtnqustnrrespondinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnrrespondinfo.service.ComtnqustnrrespondinfoVO;

/**
 * @Class Name : ComtnqustnrrespondinfoController.java
 * @Description : Comtnqustnrrespondinfo Controller class
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
@SessionAttributes(types=ComtnqustnrrespondinfoVO.class)
public class ComtnqustnrrespondinfoController {

    @Resource(name = "comtnqustnrrespondinfoService")
    private ComtnqustnrrespondinfoService comtnqustnrrespondinfoService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnqustnrrespondinfo 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnqustnrrespondinfoDefaultVO
	 * @return "/comtnqustnrrespondinfo/ComtnqustnrrespondinfoList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnqustnrrespondinfo/ComtnqustnrrespondinfoList.do")
    public String selectComtnqustnrrespondinfoList(@ModelAttribute("searchVO") ComtnqustnrrespondinfoDefaultVO searchVO, 
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
		
        List comtnqustnrrespondinfoList = comtnqustnrrespondinfoService.selectComtnqustnrrespondinfoList(searchVO);
        model.addAttribute("resultList", comtnqustnrrespondinfoList);
        
        int totCnt = comtnqustnrrespondinfoService.selectComtnqustnrrespondinfoListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnqustnrrespondinfo/ComtnqustnrrespondinfoList";
    } 
    
    @RequestMapping("/comtnqustnrrespondinfo/addComtnqustnrrespondinfoView.do")
    public String addComtnqustnrrespondinfoView(
            @ModelAttribute("searchVO") ComtnqustnrrespondinfoDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnqustnrrespondinfoVO", new ComtnqustnrrespondinfoVO());
        return "/comtnqustnrrespondinfo/ComtnqustnrrespondinfoRegister";
    }
    
    @RequestMapping("/comtnqustnrrespondinfo/addComtnqustnrrespondinfo.do")
    public String addComtnqustnrrespondinfo(
            ComtnqustnrrespondinfoVO comtnqustnrrespondinfoVO,
            @ModelAttribute("searchVO") ComtnqustnrrespondinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnqustnrrespondinfoService.insertComtnqustnrrespondinfo(comtnqustnrrespondinfoVO);
        status.setComplete();
        return "forward:/comtnqustnrrespondinfo/ComtnqustnrrespondinfoList.do";
    }
    
    @RequestMapping("/comtnqustnrrespondinfo/updateComtnqustnrrespondinfoView.do")
    public String updateComtnqustnrrespondinfoView(
            @RequestParam("qustnrTmplatId") String qustnrTmplatId ,
            @RequestParam("qestnrId") String qestnrId ,
            @RequestParam("qustnrRespondId") String qustnrRespondId ,
            @ModelAttribute("searchVO") ComtnqustnrrespondinfoDefaultVO searchVO, Model model)
            throws Exception {
        ComtnqustnrrespondinfoVO comtnqustnrrespondinfoVO = new ComtnqustnrrespondinfoVO();
        comtnqustnrrespondinfoVO.setQustnrTmplatId(qustnrTmplatId);
        comtnqustnrrespondinfoVO.setQestnrId(qestnrId);
        comtnqustnrrespondinfoVO.setQustnrRespondId(qustnrRespondId);
;        
        // 변수명은 CoC 에 따라 comtnqustnrrespondinfoVO
        model.addAttribute(selectComtnqustnrrespondinfo(comtnqustnrrespondinfoVO, searchVO));
        return "/comtnqustnrrespondinfo/ComtnqustnrrespondinfoRegister";
    }

    @RequestMapping("/comtnqustnrrespondinfo/selectComtnqustnrrespondinfo.do")
    public @ModelAttribute("comtnqustnrrespondinfoVO")
    ComtnqustnrrespondinfoVO selectComtnqustnrrespondinfo(
            ComtnqustnrrespondinfoVO comtnqustnrrespondinfoVO,
            @ModelAttribute("searchVO") ComtnqustnrrespondinfoDefaultVO searchVO) throws Exception {
        return comtnqustnrrespondinfoService.selectComtnqustnrrespondinfo(comtnqustnrrespondinfoVO);
    }

    @RequestMapping("/comtnqustnrrespondinfo/updateComtnqustnrrespondinfo.do")
    public String updateComtnqustnrrespondinfo(
            ComtnqustnrrespondinfoVO comtnqustnrrespondinfoVO,
            @ModelAttribute("searchVO") ComtnqustnrrespondinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnqustnrrespondinfoService.updateComtnqustnrrespondinfo(comtnqustnrrespondinfoVO);
        status.setComplete();
        return "forward:/comtnqustnrrespondinfo/ComtnqustnrrespondinfoList.do";
    }
    
    @RequestMapping("/comtnqustnrrespondinfo/deleteComtnqustnrrespondinfo.do")
    public String deleteComtnqustnrrespondinfo(
            ComtnqustnrrespondinfoVO comtnqustnrrespondinfoVO,
            @ModelAttribute("searchVO") ComtnqustnrrespondinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnqustnrrespondinfoService.deleteComtnqustnrrespondinfo(comtnqustnrrespondinfoVO);
        status.setComplete();
        return "forward:/comtnqustnrrespondinfo/ComtnqustnrrespondinfoList.do";
    }

}
