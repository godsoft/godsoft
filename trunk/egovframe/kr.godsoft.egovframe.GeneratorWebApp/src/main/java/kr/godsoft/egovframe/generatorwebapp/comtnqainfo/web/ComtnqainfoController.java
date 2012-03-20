package kr.godsoft.egovframe.generatorwebapp.comtnqainfo.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnqainfo.service.ComtnqainfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnqainfo.service.ComtnqainfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnqainfo.service.ComtnqainfoVO;

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
 * @Class Name : ComtnqainfoController.java
 * @Description : Comtnqainfo Controller class
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
public class ComtnqainfoController {

    @Resource(name = "comtnqainfoService")
    private ComtnqainfoService comtnqainfoService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnqainfo 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnqainfoVO
	 * @return "/comtnqainfo/ComtnqainfoList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnqainfo/ComtnqainfoList.do")
    public String selectComtnqainfoList(@ModelAttribute("searchVO") ComtnqainfoVO searchVO, 
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
		
        List<EgovMap> comtnqainfoList = comtnqainfoService.selectComtnqainfoList(searchVO);
        model.addAttribute("resultList", comtnqainfoList);
        
        int totCnt = comtnqainfoService.selectComtnqainfoListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnqainfo/ComtnqainfoList";
    } 
    
    @RequestMapping("/comtnqainfo/addComtnqainfoView.do")
    public String addComtnqainfoView(
            @ModelAttribute("searchVO") ComtnqainfoDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnqainfoVO", new ComtnqainfoVO());
        return "/comtnqainfo/ComtnqainfoRegister";
    }
    
    @RequestMapping("/comtnqainfo/addComtnqainfo.do")
    public String addComtnqainfo(
            ComtnqainfoVO comtnqainfoVO,
            @ModelAttribute("searchVO") ComtnqainfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnqainfoService.insertComtnqainfo(comtnqainfoVO);
        status.setComplete();
        return "forward:/comtnqainfo/ComtnqainfoList.do";
    }
    
    @RequestMapping("/comtnqainfo/updateComtnqainfoView.do")
    public String updateComtnqainfoView(
            @RequestParam("qaId") String qaId ,
            @ModelAttribute("searchVO") ComtnqainfoDefaultVO searchVO, Model model)
            throws Exception {
        ComtnqainfoVO comtnqainfoVO = new ComtnqainfoVO();
        comtnqainfoVO.setQaId(qaId);
;        
        // 변수명은 CoC 에 따라 comtnqainfoVO
        model.addAttribute(selectComtnqainfo(comtnqainfoVO, searchVO));
        return "/comtnqainfo/ComtnqainfoRegister";
    }

    @RequestMapping("/comtnqainfo/selectComtnqainfo.do")
    public @ModelAttribute("comtnqainfoVO")
    ComtnqainfoVO selectComtnqainfo(
            ComtnqainfoVO comtnqainfoVO,
            @ModelAttribute("searchVO") ComtnqainfoDefaultVO searchVO) throws Exception {
        return comtnqainfoService.selectComtnqainfo(comtnqainfoVO);
    }

    @RequestMapping("/comtnqainfo/updateComtnqainfo.do")
    public String updateComtnqainfo(
            ComtnqainfoVO comtnqainfoVO,
            @ModelAttribute("searchVO") ComtnqainfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnqainfoService.updateComtnqainfo(comtnqainfoVO);
        status.setComplete();
        return "forward:/comtnqainfo/ComtnqainfoList.do";
    }
    
    @RequestMapping("/comtnqainfo/deleteComtnqainfo.do")
    public String deleteComtnqainfo(
            ComtnqainfoVO comtnqainfoVO,
            @ModelAttribute("searchVO") ComtnqainfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnqainfoService.deleteComtnqainfo(comtnqainfoVO);
        status.setComplete();
        return "forward:/comtnqainfo/ComtnqainfoList.do";
    }

}
