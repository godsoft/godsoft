package kr.godsoft.egovframe.generatorwebapp.comtnfilesysmntrngloginfo.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnfilesysmntrngloginfo.service.ComtnfilesysmntrngloginfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnfilesysmntrngloginfo.service.ComtnfilesysmntrngloginfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnfilesysmntrngloginfo.service.ComtnfilesysmntrngloginfoVO;

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
 * @Class Name : ComtnfilesysmntrngloginfoController.java
 * @Description : Comtnfilesysmntrngloginfo Controller class
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
public class ComtnfilesysmntrngloginfoController {

    @Resource(name = "comtnfilesysmntrngloginfoService")
    private ComtnfilesysmntrngloginfoService comtnfilesysmntrngloginfoService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNFILESYSMNTRNGLOGINFO 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnfilesysmntrngloginfoVO
	 * @return "/comtnfilesysmntrngloginfo/ComtnfilesysmntrngloginfoList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnfilesysmntrngloginfo/ComtnfilesysmntrngloginfoList.do")
    public String selectComtnfilesysmntrngloginfoList(@ModelAttribute("searchVO") ComtnfilesysmntrngloginfoVO searchVO, 
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
		
        List<EgovMap> comtnfilesysmntrngloginfoList = comtnfilesysmntrngloginfoService.selectComtnfilesysmntrngloginfoList(searchVO);
        model.addAttribute("resultList", comtnfilesysmntrngloginfoList);
        
        int totCnt = comtnfilesysmntrngloginfoService.selectComtnfilesysmntrngloginfoListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnfilesysmntrngloginfo/ComtnfilesysmntrngloginfoList";
    } 
    
    @RequestMapping("/comtnfilesysmntrngloginfo/addComtnfilesysmntrngloginfoView.do")
    public String addComtnfilesysmntrngloginfoView(
            @ModelAttribute("searchVO") ComtnfilesysmntrngloginfoDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnfilesysmntrngloginfoVO", new ComtnfilesysmntrngloginfoVO());
        return "/comtnfilesysmntrngloginfo/ComtnfilesysmntrngloginfoRegister";
    }
    
    @RequestMapping("/comtnfilesysmntrngloginfo/addComtnfilesysmntrngloginfo.do")
    public String addComtnfilesysmntrngloginfo(
            ComtnfilesysmntrngloginfoVO comtnfilesysmntrngloginfoVO,
            @ModelAttribute("searchVO") ComtnfilesysmntrngloginfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnfilesysmntrngloginfoService.insertComtnfilesysmntrngloginfo(comtnfilesysmntrngloginfoVO);
        status.setComplete();
        return "forward:/comtnfilesysmntrngloginfo/ComtnfilesysmntrngloginfoList.do";
    }
    
    @RequestMapping("/comtnfilesysmntrngloginfo/updateComtnfilesysmntrngloginfoView.do")
    public String updateComtnfilesysmntrngloginfoView(
            @RequestParam("fileSysId") String fileSysId ,
            @RequestParam("logId") String logId ,
            @ModelAttribute("searchVO") ComtnfilesysmntrngloginfoDefaultVO searchVO, Model model)
            throws Exception {
        ComtnfilesysmntrngloginfoVO comtnfilesysmntrngloginfoVO = new ComtnfilesysmntrngloginfoVO();
        comtnfilesysmntrngloginfoVO.setFileSysId(fileSysId);
        comtnfilesysmntrngloginfoVO.setLogId(logId);
;        
        // 변수명은 CoC 에 따라 comtnfilesysmntrngloginfoVO
        model.addAttribute(selectComtnfilesysmntrngloginfo(comtnfilesysmntrngloginfoVO, searchVO));
        return "/comtnfilesysmntrngloginfo/ComtnfilesysmntrngloginfoRegister";
    }

    @RequestMapping("/comtnfilesysmntrngloginfo/selectComtnfilesysmntrngloginfo.do")
    public @ModelAttribute("comtnfilesysmntrngloginfoVO")
    ComtnfilesysmntrngloginfoVO selectComtnfilesysmntrngloginfo(
            ComtnfilesysmntrngloginfoVO comtnfilesysmntrngloginfoVO,
            @ModelAttribute("searchVO") ComtnfilesysmntrngloginfoDefaultVO searchVO) throws Exception {
        return comtnfilesysmntrngloginfoService.selectComtnfilesysmntrngloginfo(comtnfilesysmntrngloginfoVO);
    }

    @RequestMapping("/comtnfilesysmntrngloginfo/updateComtnfilesysmntrngloginfo.do")
    public String updateComtnfilesysmntrngloginfo(
            ComtnfilesysmntrngloginfoVO comtnfilesysmntrngloginfoVO,
            @ModelAttribute("searchVO") ComtnfilesysmntrngloginfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnfilesysmntrngloginfoService.updateComtnfilesysmntrngloginfo(comtnfilesysmntrngloginfoVO);
        status.setComplete();
        return "forward:/comtnfilesysmntrngloginfo/ComtnfilesysmntrngloginfoList.do";
    }
    
    @RequestMapping("/comtnfilesysmntrngloginfo/deleteComtnfilesysmntrngloginfo.do")
    public String deleteComtnfilesysmntrngloginfo(
            ComtnfilesysmntrngloginfoVO comtnfilesysmntrngloginfoVO,
            @ModelAttribute("searchVO") ComtnfilesysmntrngloginfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnfilesysmntrngloginfoService.deleteComtnfilesysmntrngloginfo(comtnfilesysmntrngloginfoVO);
        status.setComplete();
        return "forward:/comtnfilesysmntrngloginfo/ComtnfilesysmntrngloginfoList.do";
    }

}
