package kr.godsoft.egovframe.generatorwebapp.comtnprocessmonloginfo.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnprocessmonloginfo.service.ComtnprocessmonloginfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnprocessmonloginfo.service.ComtnprocessmonloginfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnprocessmonloginfo.service.ComtnprocessmonloginfoVO;

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
 * @Class Name : ComtnprocessmonloginfoController.java
 * @Description : Comtnprocessmonloginfo Controller class
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
public class ComtnprocessmonloginfoController {

    @Resource(name = "comtnprocessmonloginfoService")
    private ComtnprocessmonloginfoService comtnprocessmonloginfoService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnprocessmonloginfo 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnprocessmonloginfoVO
	 * @return "/comtnprocessmonloginfo/ComtnprocessmonloginfoList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnprocessmonloginfo/ComtnprocessmonloginfoList.do")
    public String selectComtnprocessmonloginfoList(@ModelAttribute("searchVO") ComtnprocessmonloginfoVO searchVO, 
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
		
        List<EgovMap> comtnprocessmonloginfoList = comtnprocessmonloginfoService.selectComtnprocessmonloginfoList(searchVO);
        model.addAttribute("resultList", comtnprocessmonloginfoList);
        
        int totCnt = comtnprocessmonloginfoService.selectComtnprocessmonloginfoListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnprocessmonloginfo/ComtnprocessmonloginfoList";
    } 
    
    @RequestMapping("/comtnprocessmonloginfo/addComtnprocessmonloginfoView.do")
    public String addComtnprocessmonloginfoView(
            @ModelAttribute("searchVO") ComtnprocessmonloginfoDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnprocessmonloginfoVO", new ComtnprocessmonloginfoVO());
        return "/comtnprocessmonloginfo/ComtnprocessmonloginfoRegister";
    }
    
    @RequestMapping("/comtnprocessmonloginfo/addComtnprocessmonloginfo.do")
    public String addComtnprocessmonloginfo(
            ComtnprocessmonloginfoVO comtnprocessmonloginfoVO,
            @ModelAttribute("searchVO") ComtnprocessmonloginfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnprocessmonloginfoService.insertComtnprocessmonloginfo(comtnprocessmonloginfoVO);
        status.setComplete();
        return "forward:/comtnprocessmonloginfo/ComtnprocessmonloginfoList.do";
    }
    
    @RequestMapping("/comtnprocessmonloginfo/updateComtnprocessmonloginfoView.do")
    public String updateComtnprocessmonloginfoView(
            @RequestParam("procsId") String procsId ,
            @RequestParam("logId") String logId ,
            @ModelAttribute("searchVO") ComtnprocessmonloginfoDefaultVO searchVO, Model model)
            throws Exception {
        ComtnprocessmonloginfoVO comtnprocessmonloginfoVO = new ComtnprocessmonloginfoVO();
        comtnprocessmonloginfoVO.setProcsId(procsId);
        comtnprocessmonloginfoVO.setLogId(logId);
;        
        // 변수명은 CoC 에 따라 comtnprocessmonloginfoVO
        model.addAttribute(selectComtnprocessmonloginfo(comtnprocessmonloginfoVO, searchVO));
        return "/comtnprocessmonloginfo/ComtnprocessmonloginfoRegister";
    }

    @RequestMapping("/comtnprocessmonloginfo/selectComtnprocessmonloginfo.do")
    public @ModelAttribute("comtnprocessmonloginfoVO")
    ComtnprocessmonloginfoVO selectComtnprocessmonloginfo(
            ComtnprocessmonloginfoVO comtnprocessmonloginfoVO,
            @ModelAttribute("searchVO") ComtnprocessmonloginfoDefaultVO searchVO) throws Exception {
        return comtnprocessmonloginfoService.selectComtnprocessmonloginfo(comtnprocessmonloginfoVO);
    }

    @RequestMapping("/comtnprocessmonloginfo/updateComtnprocessmonloginfo.do")
    public String updateComtnprocessmonloginfo(
            ComtnprocessmonloginfoVO comtnprocessmonloginfoVO,
            @ModelAttribute("searchVO") ComtnprocessmonloginfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnprocessmonloginfoService.updateComtnprocessmonloginfo(comtnprocessmonloginfoVO);
        status.setComplete();
        return "forward:/comtnprocessmonloginfo/ComtnprocessmonloginfoList.do";
    }
    
    @RequestMapping("/comtnprocessmonloginfo/deleteComtnprocessmonloginfo.do")
    public String deleteComtnprocessmonloginfo(
            ComtnprocessmonloginfoVO comtnprocessmonloginfoVO,
            @ModelAttribute("searchVO") ComtnprocessmonloginfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnprocessmonloginfoService.deleteComtnprocessmonloginfo(comtnprocessmonloginfoVO);
        status.setComplete();
        return "forward:/comtnprocessmonloginfo/ComtnprocessmonloginfoList.do";
    }

}
