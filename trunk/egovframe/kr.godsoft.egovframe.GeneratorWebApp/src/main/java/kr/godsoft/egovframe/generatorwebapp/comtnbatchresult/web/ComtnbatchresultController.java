package kr.godsoft.egovframe.generatorwebapp.comtnbatchresult.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtnbatchresult.service.ComtnbatchresultService;
import kr.godsoft.egovframe.generatorwebapp.comtnbatchresult.service.ComtnbatchresultDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbatchresult.service.ComtnbatchresultVO;

/**
 * @Class Name : ComtnbatchresultController.java
 * @Description : Comtnbatchresult Controller class
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
@SessionAttributes(types=ComtnbatchresultVO.class)
public class ComtnbatchresultController {

    @Resource(name = "comtnbatchresultService")
    private ComtnbatchresultService comtnbatchresultService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnbatchresult 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnbatchresultDefaultVO
	 * @return "/comtnbatchresult/ComtnbatchresultList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnbatchresult/ComtnbatchresultList.do")
    public String selectComtnbatchresultList(@ModelAttribute("searchVO") ComtnbatchresultDefaultVO searchVO, 
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
		
        List comtnbatchresultList = comtnbatchresultService.selectComtnbatchresultList(searchVO);
        model.addAttribute("resultList", comtnbatchresultList);
        
        int totCnt = comtnbatchresultService.selectComtnbatchresultListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnbatchresult/ComtnbatchresultList";
    } 
    
    @RequestMapping("/comtnbatchresult/addComtnbatchresultView.do")
    public String addComtnbatchresultView(
            @ModelAttribute("searchVO") ComtnbatchresultDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnbatchresultVO", new ComtnbatchresultVO());
        return "/comtnbatchresult/ComtnbatchresultRegister";
    }
    
    @RequestMapping("/comtnbatchresult/addComtnbatchresult.do")
    public String addComtnbatchresult(
            ComtnbatchresultVO comtnbatchresultVO,
            @ModelAttribute("searchVO") ComtnbatchresultDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbatchresultService.insertComtnbatchresult(comtnbatchresultVO);
        status.setComplete();
        return "forward:/comtnbatchresult/ComtnbatchresultList.do";
    }
    
    @RequestMapping("/comtnbatchresult/updateComtnbatchresultView.do")
    public String updateComtnbatchresultView(
            @RequestParam("batchResultId") String batchResultId ,
            @ModelAttribute("searchVO") ComtnbatchresultDefaultVO searchVO, Model model)
            throws Exception {
        ComtnbatchresultVO comtnbatchresultVO = new ComtnbatchresultVO();
        comtnbatchresultVO.setBatchResultId(batchResultId);
;        
        // 변수명은 CoC 에 따라 comtnbatchresultVO
        model.addAttribute(selectComtnbatchresult(comtnbatchresultVO, searchVO));
        return "/comtnbatchresult/ComtnbatchresultRegister";
    }

    @RequestMapping("/comtnbatchresult/selectComtnbatchresult.do")
    public @ModelAttribute("comtnbatchresultVO")
    ComtnbatchresultVO selectComtnbatchresult(
            ComtnbatchresultVO comtnbatchresultVO,
            @ModelAttribute("searchVO") ComtnbatchresultDefaultVO searchVO) throws Exception {
        return comtnbatchresultService.selectComtnbatchresult(comtnbatchresultVO);
    }

    @RequestMapping("/comtnbatchresult/updateComtnbatchresult.do")
    public String updateComtnbatchresult(
            ComtnbatchresultVO comtnbatchresultVO,
            @ModelAttribute("searchVO") ComtnbatchresultDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbatchresultService.updateComtnbatchresult(comtnbatchresultVO);
        status.setComplete();
        return "forward:/comtnbatchresult/ComtnbatchresultList.do";
    }
    
    @RequestMapping("/comtnbatchresult/deleteComtnbatchresult.do")
    public String deleteComtnbatchresult(
            ComtnbatchresultVO comtnbatchresultVO,
            @ModelAttribute("searchVO") ComtnbatchresultDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbatchresultService.deleteComtnbatchresult(comtnbatchresultVO);
        status.setComplete();
        return "forward:/comtnbatchresult/ComtnbatchresultList.do";
    }

}
