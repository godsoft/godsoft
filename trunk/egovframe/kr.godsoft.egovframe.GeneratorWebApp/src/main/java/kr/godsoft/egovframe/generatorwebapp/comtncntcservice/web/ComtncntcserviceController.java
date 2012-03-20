package kr.godsoft.egovframe.generatorwebapp.comtncntcservice.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtncntcservice.service.ComtncntcserviceService;
import kr.godsoft.egovframe.generatorwebapp.comtncntcservice.service.ComtncntcserviceDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtncntcservice.service.ComtncntcserviceVO;

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
 * @Class Name : ComtncntcserviceController.java
 * @Description : Comtncntcservice Controller class
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
public class ComtncntcserviceController {

    @Resource(name = "comtncntcserviceService")
    private ComtncntcserviceService comtncntcserviceService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtncntcservice 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtncntcserviceVO
	 * @return "/comtncntcservice/ComtncntcserviceList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtncntcservice/ComtncntcserviceList.do")
    public String selectComtncntcserviceList(@ModelAttribute("searchVO") ComtncntcserviceVO searchVO, 
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
		
        List<EgovMap> comtncntcserviceList = comtncntcserviceService.selectComtncntcserviceList(searchVO);
        model.addAttribute("resultList", comtncntcserviceList);
        
        int totCnt = comtncntcserviceService.selectComtncntcserviceListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtncntcservice/ComtncntcserviceList";
    } 
    
    @RequestMapping("/comtncntcservice/addComtncntcserviceView.do")
    public String addComtncntcserviceView(
            @ModelAttribute("searchVO") ComtncntcserviceDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtncntcserviceVO", new ComtncntcserviceVO());
        return "/comtncntcservice/ComtncntcserviceRegister";
    }
    
    @RequestMapping("/comtncntcservice/addComtncntcservice.do")
    public String addComtncntcservice(
            ComtncntcserviceVO comtncntcserviceVO,
            @ModelAttribute("searchVO") ComtncntcserviceDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtncntcserviceService.insertComtncntcservice(comtncntcserviceVO);
        status.setComplete();
        return "forward:/comtncntcservice/ComtncntcserviceList.do";
    }
    
    @RequestMapping("/comtncntcservice/updateComtncntcserviceView.do")
    public String updateComtncntcserviceView(
            @RequestParam("insttId") String insttId ,
            @RequestParam("sysId") String sysId ,
            @RequestParam("svcId") String svcId ,
            @ModelAttribute("searchVO") ComtncntcserviceDefaultVO searchVO, Model model)
            throws Exception {
        ComtncntcserviceVO comtncntcserviceVO = new ComtncntcserviceVO();
        comtncntcserviceVO.setInsttId(insttId);
        comtncntcserviceVO.setSysId(sysId);
        comtncntcserviceVO.setSvcId(svcId);
;        
        // 변수명은 CoC 에 따라 comtncntcserviceVO
        model.addAttribute(selectComtncntcservice(comtncntcserviceVO, searchVO));
        return "/comtncntcservice/ComtncntcserviceRegister";
    }

    @RequestMapping("/comtncntcservice/selectComtncntcservice.do")
    public @ModelAttribute("comtncntcserviceVO")
    ComtncntcserviceVO selectComtncntcservice(
            ComtncntcserviceVO comtncntcserviceVO,
            @ModelAttribute("searchVO") ComtncntcserviceDefaultVO searchVO) throws Exception {
        return comtncntcserviceService.selectComtncntcservice(comtncntcserviceVO);
    }

    @RequestMapping("/comtncntcservice/updateComtncntcservice.do")
    public String updateComtncntcservice(
            ComtncntcserviceVO comtncntcserviceVO,
            @ModelAttribute("searchVO") ComtncntcserviceDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtncntcserviceService.updateComtncntcservice(comtncntcserviceVO);
        status.setComplete();
        return "forward:/comtncntcservice/ComtncntcserviceList.do";
    }
    
    @RequestMapping("/comtncntcservice/deleteComtncntcservice.do")
    public String deleteComtncntcservice(
            ComtncntcserviceVO comtncntcserviceVO,
            @ModelAttribute("searchVO") ComtncntcserviceDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtncntcserviceService.deleteComtncntcservice(comtncntcserviceVO);
        status.setComplete();
        return "forward:/comtncntcservice/ComtncntcserviceList.do";
    }

}
