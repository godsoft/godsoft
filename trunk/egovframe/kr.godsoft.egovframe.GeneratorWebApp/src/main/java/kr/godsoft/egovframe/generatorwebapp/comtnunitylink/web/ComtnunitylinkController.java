package kr.godsoft.egovframe.generatorwebapp.comtnunitylink.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtnunitylink.service.ComtnunitylinkService;
import kr.godsoft.egovframe.generatorwebapp.comtnunitylink.service.ComtnunitylinkDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnunitylink.service.ComtnunitylinkVO;

/**
 * @Class Name : ComtnunitylinkController.java
 * @Description : Comtnunitylink Controller class
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
@SessionAttributes(types=ComtnunitylinkVO.class)
public class ComtnunitylinkController {

    @Resource(name = "comtnunitylinkService")
    private ComtnunitylinkService comtnunitylinkService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnunitylink 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnunitylinkDefaultVO
	 * @return "/comtnunitylink/ComtnunitylinkList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnunitylink/ComtnunitylinkList.do")
    public String selectComtnunitylinkList(@ModelAttribute("searchVO") ComtnunitylinkDefaultVO searchVO, 
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
		
        List comtnunitylinkList = comtnunitylinkService.selectComtnunitylinkList(searchVO);
        model.addAttribute("resultList", comtnunitylinkList);
        
        int totCnt = comtnunitylinkService.selectComtnunitylinkListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnunitylink/ComtnunitylinkList";
    } 
    
    @RequestMapping("/comtnunitylink/addComtnunitylinkView.do")
    public String addComtnunitylinkView(
            @ModelAttribute("searchVO") ComtnunitylinkDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnunitylinkVO", new ComtnunitylinkVO());
        return "/comtnunitylink/ComtnunitylinkRegister";
    }
    
    @RequestMapping("/comtnunitylink/addComtnunitylink.do")
    public String addComtnunitylink(
            ComtnunitylinkVO comtnunitylinkVO,
            @ModelAttribute("searchVO") ComtnunitylinkDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnunitylinkService.insertComtnunitylink(comtnunitylinkVO);
        status.setComplete();
        return "forward:/comtnunitylink/ComtnunitylinkList.do";
    }
    
    @RequestMapping("/comtnunitylink/updateComtnunitylinkView.do")
    public String updateComtnunitylinkView(
            @RequestParam("unityLinkId") String unityLinkId ,
            @ModelAttribute("searchVO") ComtnunitylinkDefaultVO searchVO, Model model)
            throws Exception {
        ComtnunitylinkVO comtnunitylinkVO = new ComtnunitylinkVO();
        comtnunitylinkVO.setUnityLinkId(unityLinkId);
;        
        // 변수명은 CoC 에 따라 comtnunitylinkVO
        model.addAttribute(selectComtnunitylink(comtnunitylinkVO, searchVO));
        return "/comtnunitylink/ComtnunitylinkRegister";
    }

    @RequestMapping("/comtnunitylink/selectComtnunitylink.do")
    public @ModelAttribute("comtnunitylinkVO")
    ComtnunitylinkVO selectComtnunitylink(
            ComtnunitylinkVO comtnunitylinkVO,
            @ModelAttribute("searchVO") ComtnunitylinkDefaultVO searchVO) throws Exception {
        return comtnunitylinkService.selectComtnunitylink(comtnunitylinkVO);
    }

    @RequestMapping("/comtnunitylink/updateComtnunitylink.do")
    public String updateComtnunitylink(
            ComtnunitylinkVO comtnunitylinkVO,
            @ModelAttribute("searchVO") ComtnunitylinkDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnunitylinkService.updateComtnunitylink(comtnunitylinkVO);
        status.setComplete();
        return "forward:/comtnunitylink/ComtnunitylinkList.do";
    }
    
    @RequestMapping("/comtnunitylink/deleteComtnunitylink.do")
    public String deleteComtnunitylink(
            ComtnunitylinkVO comtnunitylinkVO,
            @ModelAttribute("searchVO") ComtnunitylinkDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnunitylinkService.deleteComtnunitylink(comtnunitylinkVO);
        status.setComplete();
        return "forward:/comtnunitylink/ComtnunitylinkList.do";
    }

}
