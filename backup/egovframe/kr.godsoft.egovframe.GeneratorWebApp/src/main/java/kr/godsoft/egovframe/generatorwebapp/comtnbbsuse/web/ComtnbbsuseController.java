package kr.godsoft.egovframe.generatorwebapp.comtnbbsuse.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnbbsuse.service.ComtnbbsuseService;
import kr.godsoft.egovframe.generatorwebapp.comtnbbsuse.service.ComtnbbsuseDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbbsuse.service.ComtnbbsuseVO;

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
 * @Class Name : ComtnbbsuseController.java
 * @Description : Comtnbbsuse Controller class
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
public class ComtnbbsuseController {

    @Resource(name = "comtnbbsuseService")
    private ComtnbbsuseService comtnbbsuseService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNBBSUSE 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnbbsuseVO
	 * @return "/comtnbbsuse/ComtnbbsuseList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnbbsuse/ComtnbbsuseList.do")
    public String selectComtnbbsuseList(@ModelAttribute("searchVO") ComtnbbsuseVO searchVO, 
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
		
        List<EgovMap> comtnbbsuseList = comtnbbsuseService.selectComtnbbsuseList(searchVO);
        model.addAttribute("resultList", comtnbbsuseList);
        
        int totCnt = comtnbbsuseService.selectComtnbbsuseListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnbbsuse/ComtnbbsuseList";
    } 
    
    @RequestMapping("/comtnbbsuse/addComtnbbsuseView.do")
    public String addComtnbbsuseView(
            @ModelAttribute("searchVO") ComtnbbsuseDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnbbsuseVO", new ComtnbbsuseVO());
        return "/comtnbbsuse/ComtnbbsuseRegister";
    }
    
    @RequestMapping("/comtnbbsuse/addComtnbbsuse.do")
    public String addComtnbbsuse(
            ComtnbbsuseVO comtnbbsuseVO,
            @ModelAttribute("searchVO") ComtnbbsuseDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbbsuseService.insertComtnbbsuse(comtnbbsuseVO);
        status.setComplete();
        return "forward:/comtnbbsuse/ComtnbbsuseList.do";
    }
    
    @RequestMapping("/comtnbbsuse/updateComtnbbsuseView.do")
    public String updateComtnbbsuseView(
            @RequestParam("bbsId") String bbsId ,
            @RequestParam("trgetId") String trgetId ,
            @ModelAttribute("searchVO") ComtnbbsuseDefaultVO searchVO, Model model)
            throws Exception {
        ComtnbbsuseVO comtnbbsuseVO = new ComtnbbsuseVO();
        comtnbbsuseVO.setBbsId(bbsId);
        comtnbbsuseVO.setTrgetId(trgetId);
;        
        // 변수명은 CoC 에 따라 comtnbbsuseVO
        model.addAttribute(selectComtnbbsuse(comtnbbsuseVO, searchVO));
        return "/comtnbbsuse/ComtnbbsuseRegister";
    }

    @RequestMapping("/comtnbbsuse/selectComtnbbsuse.do")
    public @ModelAttribute("comtnbbsuseVO")
    ComtnbbsuseVO selectComtnbbsuse(
            ComtnbbsuseVO comtnbbsuseVO,
            @ModelAttribute("searchVO") ComtnbbsuseDefaultVO searchVO) throws Exception {
        return comtnbbsuseService.selectComtnbbsuse(comtnbbsuseVO);
    }

    @RequestMapping("/comtnbbsuse/updateComtnbbsuse.do")
    public String updateComtnbbsuse(
            ComtnbbsuseVO comtnbbsuseVO,
            @ModelAttribute("searchVO") ComtnbbsuseDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbbsuseService.updateComtnbbsuse(comtnbbsuseVO);
        status.setComplete();
        return "forward:/comtnbbsuse/ComtnbbsuseList.do";
    }
    
    @RequestMapping("/comtnbbsuse/deleteComtnbbsuse.do")
    public String deleteComtnbbsuse(
            ComtnbbsuseVO comtnbbsuseVO,
            @ModelAttribute("searchVO") ComtnbbsuseDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnbbsuseService.deleteComtnbbsuse(comtnbbsuseVO);
        status.setComplete();
        return "forward:/comtnbbsuse/ComtnbbsuseList.do";
    }

}
