package kr.godsoft.egovframe.generatorwebapp.comtnleaderschdul.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnleaderschdul.service.ComtnleaderschdulService;
import kr.godsoft.egovframe.generatorwebapp.comtnleaderschdul.service.ComtnleaderschdulDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnleaderschdul.service.ComtnleaderschdulVO;

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
 * @Class Name : ComtnleaderschdulController.java
 * @Description : Comtnleaderschdul Controller class
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
public class ComtnleaderschdulController {

    @Resource(name = "comtnleaderschdulService")
    private ComtnleaderschdulService comtnleaderschdulService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNLEADERSCHDUL 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnleaderschdulVO
	 * @return "/comtnleaderschdul/ComtnleaderschdulList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnleaderschdul/ComtnleaderschdulList.do")
    public String selectComtnleaderschdulList(@ModelAttribute("searchVO") ComtnleaderschdulVO searchVO, 
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
		
        List<EgovMap> comtnleaderschdulList = comtnleaderschdulService.selectComtnleaderschdulList(searchVO);
        model.addAttribute("resultList", comtnleaderschdulList);
        
        int totCnt = comtnleaderschdulService.selectComtnleaderschdulListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnleaderschdul/ComtnleaderschdulList";
    } 
    
    @RequestMapping("/comtnleaderschdul/addComtnleaderschdulView.do")
    public String addComtnleaderschdulView(
            @ModelAttribute("searchVO") ComtnleaderschdulDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnleaderschdulVO", new ComtnleaderschdulVO());
        return "/comtnleaderschdul/ComtnleaderschdulRegister";
    }
    
    @RequestMapping("/comtnleaderschdul/addComtnleaderschdul.do")
    public String addComtnleaderschdul(
            ComtnleaderschdulVO comtnleaderschdulVO,
            @ModelAttribute("searchVO") ComtnleaderschdulDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnleaderschdulService.insertComtnleaderschdul(comtnleaderschdulVO);
        status.setComplete();
        return "forward:/comtnleaderschdul/ComtnleaderschdulList.do";
    }
    
    @RequestMapping("/comtnleaderschdul/updateComtnleaderschdulView.do")
    public String updateComtnleaderschdulView(
            @RequestParam("schdulId") String schdulId ,
            @ModelAttribute("searchVO") ComtnleaderschdulDefaultVO searchVO, Model model)
            throws Exception {
        ComtnleaderschdulVO comtnleaderschdulVO = new ComtnleaderschdulVO();
        comtnleaderschdulVO.setSchdulId(schdulId);
;        
        // 변수명은 CoC 에 따라 comtnleaderschdulVO
        model.addAttribute(selectComtnleaderschdul(comtnleaderschdulVO, searchVO));
        return "/comtnleaderschdul/ComtnleaderschdulRegister";
    }

    @RequestMapping("/comtnleaderschdul/selectComtnleaderschdul.do")
    public @ModelAttribute("comtnleaderschdulVO")
    ComtnleaderschdulVO selectComtnleaderschdul(
            ComtnleaderschdulVO comtnleaderschdulVO,
            @ModelAttribute("searchVO") ComtnleaderschdulDefaultVO searchVO) throws Exception {
        return comtnleaderschdulService.selectComtnleaderschdul(comtnleaderschdulVO);
    }

    @RequestMapping("/comtnleaderschdul/updateComtnleaderschdul.do")
    public String updateComtnleaderschdul(
            ComtnleaderschdulVO comtnleaderschdulVO,
            @ModelAttribute("searchVO") ComtnleaderschdulDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnleaderschdulService.updateComtnleaderschdul(comtnleaderschdulVO);
        status.setComplete();
        return "forward:/comtnleaderschdul/ComtnleaderschdulList.do";
    }
    
    @RequestMapping("/comtnleaderschdul/deleteComtnleaderschdul.do")
    public String deleteComtnleaderschdul(
            ComtnleaderschdulVO comtnleaderschdulVO,
            @ModelAttribute("searchVO") ComtnleaderschdulDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnleaderschdulService.deleteComtnleaderschdul(comtnleaderschdulVO);
        status.setComplete();
        return "forward:/comtnleaderschdul/ComtnleaderschdulList.do";
    }

}
