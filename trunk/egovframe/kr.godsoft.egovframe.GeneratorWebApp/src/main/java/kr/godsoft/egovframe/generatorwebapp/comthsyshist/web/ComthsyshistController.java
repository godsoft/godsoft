package kr.godsoft.egovframe.generatorwebapp.comthsyshist.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comthsyshist.service.ComthsyshistService;
import kr.godsoft.egovframe.generatorwebapp.comthsyshist.service.ComthsyshistDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comthsyshist.service.ComthsyshistVO;

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
 * @Class Name : ComthsyshistController.java
 * @Description : Comthsyshist Controller class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Controller
@SessionAttributes(types=ComthsyshistVO.class)
public class ComthsyshistController {

    @Resource(name = "comthsyshistService")
    private ComthsyshistService comthsyshistService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comthsyshist 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComthsyshistVO
	 * @return "/comthsyshist/ComthsyshistList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comthsyshist/ComthsyshistList.do")
    public String selectComthsyshistList(@ModelAttribute("searchVO") ComthsyshistVO searchVO, 
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
		
        List<EgovMap> comthsyshistList = comthsyshistService.selectComthsyshistList(searchVO);
        model.addAttribute("resultList", comthsyshistList);
        
        int totCnt = comthsyshistService.selectComthsyshistListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comthsyshist/ComthsyshistList";
    } 
    
    @RequestMapping("/comthsyshist/addComthsyshistView.do")
    public String addComthsyshistView(
            @ModelAttribute("searchVO") ComthsyshistDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comthsyshistVO", new ComthsyshistVO());
        return "/comthsyshist/ComthsyshistRegister";
    }
    
    @RequestMapping("/comthsyshist/addComthsyshist.do")
    public String addComthsyshist(
            ComthsyshistVO comthsyshistVO,
            @ModelAttribute("searchVO") ComthsyshistDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comthsyshistService.insertComthsyshist(comthsyshistVO);
        status.setComplete();
        return "forward:/comthsyshist/ComthsyshistList.do";
    }
    
    @RequestMapping("/comthsyshist/updateComthsyshistView.do")
    public String updateComthsyshistView(
            @RequestParam("histId") String histId ,
            @ModelAttribute("searchVO") ComthsyshistDefaultVO searchVO, Model model)
            throws Exception {
        ComthsyshistVO comthsyshistVO = new ComthsyshistVO();
        comthsyshistVO.setHistId(histId);
;        
        // 변수명은 CoC 에 따라 comthsyshistVO
        model.addAttribute(selectComthsyshist(comthsyshistVO, searchVO));
        return "/comthsyshist/ComthsyshistRegister";
    }

    @RequestMapping("/comthsyshist/selectComthsyshist.do")
    public @ModelAttribute("comthsyshistVO")
    ComthsyshistVO selectComthsyshist(
            ComthsyshistVO comthsyshistVO,
            @ModelAttribute("searchVO") ComthsyshistDefaultVO searchVO) throws Exception {
        return comthsyshistService.selectComthsyshist(comthsyshistVO);
    }

    @RequestMapping("/comthsyshist/updateComthsyshist.do")
    public String updateComthsyshist(
            ComthsyshistVO comthsyshistVO,
            @ModelAttribute("searchVO") ComthsyshistDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comthsyshistService.updateComthsyshist(comthsyshistVO);
        status.setComplete();
        return "forward:/comthsyshist/ComthsyshistList.do";
    }
    
    @RequestMapping("/comthsyshist/deleteComthsyshist.do")
    public String deleteComthsyshist(
            ComthsyshistVO comthsyshistVO,
            @ModelAttribute("searchVO") ComthsyshistDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comthsyshistService.deleteComthsyshist(comthsyshistVO);
        status.setComplete();
        return "forward:/comthsyshist/ComthsyshistList.do";
    }

}
