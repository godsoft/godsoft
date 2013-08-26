package kr.godsoft.egovframe.generatorwebapp.comtnbatchschdul.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnbatchschdul.service.ComtnbatchschdulService;
import kr.godsoft.egovframe.generatorwebapp.comtnbatchschdul.service.ComtnbatchschdulDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbatchschdul.service.ComtnbatchschdulVO;

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
 * @Class Name : ComtnbatchschdulController.java
 * @Description : Comtnbatchschdul Controller class
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
public class ComtnbatchschdulController {

    @Resource(name = "comtnbatchschdulService")
    private ComtnbatchschdulService comtnbatchschdulService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNBATCHSCHDUL 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnbatchschdulVO
	 * @return "/comtnbatchschdul/ComtnbatchschdulList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnbatchschdul/ComtnbatchschdulList.do")
    public String selectComtnbatchschdulList(@ModelAttribute("searchVO") ComtnbatchschdulVO searchVO, 
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
		
        List<EgovMap> comtnbatchschdulList = comtnbatchschdulService.selectComtnbatchschdulList(searchVO);
        model.addAttribute("resultList", comtnbatchschdulList);
        
        int totCnt = comtnbatchschdulService.selectComtnbatchschdulListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnbatchschdul/ComtnbatchschdulList";
    } 
    
    @RequestMapping("/comtnbatchschdul/addComtnbatchschdulView.do")
    public String addComtnbatchschdulView(
            @ModelAttribute("searchVO") ComtnbatchschdulDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnbatchschdulVO", new ComtnbatchschdulVO());
        return "/comtnbatchschdul/ComtnbatchschdulRegister";
    }
    
    @RequestMapping("/comtnbatchschdul/addComtnbatchschdul.do")
    public String addComtnbatchschdul(
            ComtnbatchschdulVO comtnbatchschdulVO,
            @ModelAttribute("searchVO") ComtnbatchschdulDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbatchschdulService.insertComtnbatchschdul(comtnbatchschdulVO);
        status.setComplete();
        return "forward:/comtnbatchschdul/ComtnbatchschdulList.do";
    }
    
    @RequestMapping("/comtnbatchschdul/updateComtnbatchschdulView.do")
    public String updateComtnbatchschdulView(
            @RequestParam("batchSchdulId") String batchSchdulId ,
            @ModelAttribute("searchVO") ComtnbatchschdulDefaultVO searchVO, Model model)
            throws Exception {
        ComtnbatchschdulVO comtnbatchschdulVO = new ComtnbatchschdulVO();
        comtnbatchschdulVO.setBatchSchdulId(batchSchdulId);
;        
        // 변수명은 CoC 에 따라 comtnbatchschdulVO
        model.addAttribute(selectComtnbatchschdul(comtnbatchschdulVO, searchVO));
        return "/comtnbatchschdul/ComtnbatchschdulRegister";
    }

    @RequestMapping("/comtnbatchschdul/selectComtnbatchschdul.do")
    public @ModelAttribute("comtnbatchschdulVO")
    ComtnbatchschdulVO selectComtnbatchschdul(
            ComtnbatchschdulVO comtnbatchschdulVO,
            @ModelAttribute("searchVO") ComtnbatchschdulDefaultVO searchVO) throws Exception {
        return comtnbatchschdulService.selectComtnbatchschdul(comtnbatchschdulVO);
    }

    @RequestMapping("/comtnbatchschdul/updateComtnbatchschdul.do")
    public String updateComtnbatchschdul(
            ComtnbatchschdulVO comtnbatchschdulVO,
            @ModelAttribute("searchVO") ComtnbatchschdulDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbatchschdulService.updateComtnbatchschdul(comtnbatchschdulVO);
        status.setComplete();
        return "forward:/comtnbatchschdul/ComtnbatchschdulList.do";
    }
    
    @RequestMapping("/comtnbatchschdul/deleteComtnbatchschdul.do")
    public String deleteComtnbatchschdul(
            ComtnbatchschdulVO comtnbatchschdulVO,
            @ModelAttribute("searchVO") ComtnbatchschdulDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbatchschdulService.deleteComtnbatchschdul(comtnbatchschdulVO);
        status.setComplete();
        return "forward:/comtnbatchschdul/ComtnbatchschdulList.do";
    }

}
