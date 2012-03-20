package kr.godsoft.egovframe.generatorwebapp.comtnbatchschduldfk.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnbatchschduldfk.service.ComtnbatchschduldfkService;
import kr.godsoft.egovframe.generatorwebapp.comtnbatchschduldfk.service.ComtnbatchschduldfkDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbatchschduldfk.service.ComtnbatchschduldfkVO;

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
 * @Class Name : ComtnbatchschduldfkController.java
 * @Description : Comtnbatchschduldfk Controller class
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
public class ComtnbatchschduldfkController {

    @Resource(name = "comtnbatchschduldfkService")
    private ComtnbatchschduldfkService comtnbatchschduldfkService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnbatchschduldfk 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnbatchschduldfkVO
	 * @return "/comtnbatchschduldfk/ComtnbatchschduldfkList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnbatchschduldfk/ComtnbatchschduldfkList.do")
    public String selectComtnbatchschduldfkList(@ModelAttribute("searchVO") ComtnbatchschduldfkVO searchVO, 
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
		
        List<EgovMap> comtnbatchschduldfkList = comtnbatchschduldfkService.selectComtnbatchschduldfkList(searchVO);
        model.addAttribute("resultList", comtnbatchschduldfkList);
        
        int totCnt = comtnbatchschduldfkService.selectComtnbatchschduldfkListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnbatchschduldfk/ComtnbatchschduldfkList";
    } 
    
    @RequestMapping("/comtnbatchschduldfk/addComtnbatchschduldfkView.do")
    public String addComtnbatchschduldfkView(
            @ModelAttribute("searchVO") ComtnbatchschduldfkDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnbatchschduldfkVO", new ComtnbatchschduldfkVO());
        return "/comtnbatchschduldfk/ComtnbatchschduldfkRegister";
    }
    
    @RequestMapping("/comtnbatchschduldfk/addComtnbatchschduldfk.do")
    public String addComtnbatchschduldfk(
            ComtnbatchschduldfkVO comtnbatchschduldfkVO,
            @ModelAttribute("searchVO") ComtnbatchschduldfkDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbatchschduldfkService.insertComtnbatchschduldfk(comtnbatchschduldfkVO);
        status.setComplete();
        return "forward:/comtnbatchschduldfk/ComtnbatchschduldfkList.do";
    }
    
    @RequestMapping("/comtnbatchschduldfk/updateComtnbatchschduldfkView.do")
    public String updateComtnbatchschduldfkView(
            @RequestParam("batchSchdulId") String batchSchdulId ,
            @RequestParam("executSchdulDfkSe") String executSchdulDfkSe ,
            @ModelAttribute("searchVO") ComtnbatchschduldfkDefaultVO searchVO, Model model)
            throws Exception {
        ComtnbatchschduldfkVO comtnbatchschduldfkVO = new ComtnbatchschduldfkVO();
        comtnbatchschduldfkVO.setBatchSchdulId(batchSchdulId);
        comtnbatchschduldfkVO.setExecutSchdulDfkSe(executSchdulDfkSe);
;        
        // 변수명은 CoC 에 따라 comtnbatchschduldfkVO
        model.addAttribute(selectComtnbatchschduldfk(comtnbatchschduldfkVO, searchVO));
        return "/comtnbatchschduldfk/ComtnbatchschduldfkRegister";
    }

    @RequestMapping("/comtnbatchschduldfk/selectComtnbatchschduldfk.do")
    public @ModelAttribute("comtnbatchschduldfkVO")
    ComtnbatchschduldfkVO selectComtnbatchschduldfk(
            ComtnbatchschduldfkVO comtnbatchschduldfkVO,
            @ModelAttribute("searchVO") ComtnbatchschduldfkDefaultVO searchVO) throws Exception {
        return comtnbatchschduldfkService.selectComtnbatchschduldfk(comtnbatchschduldfkVO);
    }

    @RequestMapping("/comtnbatchschduldfk/updateComtnbatchschduldfk.do")
    public String updateComtnbatchschduldfk(
            ComtnbatchschduldfkVO comtnbatchschduldfkVO,
            @ModelAttribute("searchVO") ComtnbatchschduldfkDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbatchschduldfkService.updateComtnbatchschduldfk(comtnbatchschduldfkVO);
        status.setComplete();
        return "forward:/comtnbatchschduldfk/ComtnbatchschduldfkList.do";
    }
    
    @RequestMapping("/comtnbatchschduldfk/deleteComtnbatchschduldfk.do")
    public String deleteComtnbatchschduldfk(
            ComtnbatchschduldfkVO comtnbatchschduldfkVO,
            @ModelAttribute("searchVO") ComtnbatchschduldfkDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbatchschduldfkService.deleteComtnbatchschduldfk(comtnbatchschduldfkVO);
        status.setComplete();
        return "forward:/comtnbatchschduldfk/ComtnbatchschduldfkList.do";
    }

}
