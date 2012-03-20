package kr.godsoft.egovframe.generatorwebapp.comtnschdulinfo.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnschdulinfo.service.ComtnschdulinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnschdulinfo.service.ComtnschdulinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnschdulinfo.service.ComtnschdulinfoVO;

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
 * @Class Name : ComtnschdulinfoController.java
 * @Description : Comtnschdulinfo Controller class
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
public class ComtnschdulinfoController {

    @Resource(name = "comtnschdulinfoService")
    private ComtnschdulinfoService comtnschdulinfoService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnschdulinfo 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnschdulinfoVO
	 * @return "/comtnschdulinfo/ComtnschdulinfoList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnschdulinfo/ComtnschdulinfoList.do")
    public String selectComtnschdulinfoList(@ModelAttribute("searchVO") ComtnschdulinfoVO searchVO, 
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
		
        List<EgovMap> comtnschdulinfoList = comtnschdulinfoService.selectComtnschdulinfoList(searchVO);
        model.addAttribute("resultList", comtnschdulinfoList);
        
        int totCnt = comtnschdulinfoService.selectComtnschdulinfoListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnschdulinfo/ComtnschdulinfoList";
    } 
    
    @RequestMapping("/comtnschdulinfo/addComtnschdulinfoView.do")
    public String addComtnschdulinfoView(
            @ModelAttribute("searchVO") ComtnschdulinfoDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnschdulinfoVO", new ComtnschdulinfoVO());
        return "/comtnschdulinfo/ComtnschdulinfoRegister";
    }
    
    @RequestMapping("/comtnschdulinfo/addComtnschdulinfo.do")
    public String addComtnschdulinfo(
            ComtnschdulinfoVO comtnschdulinfoVO,
            @ModelAttribute("searchVO") ComtnschdulinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnschdulinfoService.insertComtnschdulinfo(comtnschdulinfoVO);
        status.setComplete();
        return "forward:/comtnschdulinfo/ComtnschdulinfoList.do";
    }
    
    @RequestMapping("/comtnschdulinfo/updateComtnschdulinfoView.do")
    public String updateComtnschdulinfoView(
            @RequestParam("schdulId") String schdulId ,
            @ModelAttribute("searchVO") ComtnschdulinfoDefaultVO searchVO, Model model)
            throws Exception {
        ComtnschdulinfoVO comtnschdulinfoVO = new ComtnschdulinfoVO();
        comtnschdulinfoVO.setSchdulId(schdulId);
;        
        // 변수명은 CoC 에 따라 comtnschdulinfoVO
        model.addAttribute(selectComtnschdulinfo(comtnschdulinfoVO, searchVO));
        return "/comtnschdulinfo/ComtnschdulinfoRegister";
    }

    @RequestMapping("/comtnschdulinfo/selectComtnschdulinfo.do")
    public @ModelAttribute("comtnschdulinfoVO")
    ComtnschdulinfoVO selectComtnschdulinfo(
            ComtnschdulinfoVO comtnschdulinfoVO,
            @ModelAttribute("searchVO") ComtnschdulinfoDefaultVO searchVO) throws Exception {
        return comtnschdulinfoService.selectComtnschdulinfo(comtnschdulinfoVO);
    }

    @RequestMapping("/comtnschdulinfo/updateComtnschdulinfo.do")
    public String updateComtnschdulinfo(
            ComtnschdulinfoVO comtnschdulinfoVO,
            @ModelAttribute("searchVO") ComtnschdulinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnschdulinfoService.updateComtnschdulinfo(comtnschdulinfoVO);
        status.setComplete();
        return "forward:/comtnschdulinfo/ComtnschdulinfoList.do";
    }
    
    @RequestMapping("/comtnschdulinfo/deleteComtnschdulinfo.do")
    public String deleteComtnschdulinfo(
            ComtnschdulinfoVO comtnschdulinfoVO,
            @ModelAttribute("searchVO") ComtnschdulinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnschdulinfoService.deleteComtnschdulinfo(comtnschdulinfoVO);
        status.setComplete();
        return "forward:/comtnschdulinfo/ComtnschdulinfoList.do";
    }

}
