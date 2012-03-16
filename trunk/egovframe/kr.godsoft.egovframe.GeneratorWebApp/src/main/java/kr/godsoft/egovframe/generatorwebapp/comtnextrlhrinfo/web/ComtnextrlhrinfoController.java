package kr.godsoft.egovframe.generatorwebapp.comtnextrlhrinfo.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnextrlhrinfo.service.ComtnextrlhrinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnextrlhrinfo.service.ComtnextrlhrinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnextrlhrinfo.service.ComtnextrlhrinfoVO;

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
 * @Class Name : ComtnextrlhrinfoController.java
 * @Description : Comtnextrlhrinfo Controller class
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
@SessionAttributes(types=ComtnextrlhrinfoVO.class)
public class ComtnextrlhrinfoController {

    @Resource(name = "comtnextrlhrinfoService")
    private ComtnextrlhrinfoService comtnextrlhrinfoService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnextrlhrinfo 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnextrlhrinfoVO
	 * @return "/comtnextrlhrinfo/ComtnextrlhrinfoList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnextrlhrinfo/ComtnextrlhrinfoList.do")
    public String selectComtnextrlhrinfoList(@ModelAttribute("searchVO") ComtnextrlhrinfoVO searchVO, 
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
		
        List<EgovMap> comtnextrlhrinfoList = comtnextrlhrinfoService.selectComtnextrlhrinfoList(searchVO);
        model.addAttribute("resultList", comtnextrlhrinfoList);
        
        int totCnt = comtnextrlhrinfoService.selectComtnextrlhrinfoListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnextrlhrinfo/ComtnextrlhrinfoList";
    } 
    
    @RequestMapping("/comtnextrlhrinfo/addComtnextrlhrinfoView.do")
    public String addComtnextrlhrinfoView(
            @ModelAttribute("searchVO") ComtnextrlhrinfoDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnextrlhrinfoVO", new ComtnextrlhrinfoVO());
        return "/comtnextrlhrinfo/ComtnextrlhrinfoRegister";
    }
    
    @RequestMapping("/comtnextrlhrinfo/addComtnextrlhrinfo.do")
    public String addComtnextrlhrinfo(
            ComtnextrlhrinfoVO comtnextrlhrinfoVO,
            @ModelAttribute("searchVO") ComtnextrlhrinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnextrlhrinfoService.insertComtnextrlhrinfo(comtnextrlhrinfoVO);
        status.setComplete();
        return "forward:/comtnextrlhrinfo/ComtnextrlhrinfoList.do";
    }
    
    @RequestMapping("/comtnextrlhrinfo/updateComtnextrlhrinfoView.do")
    public String updateComtnextrlhrinfoView(
            @RequestParam("eventId") String eventId ,
            @RequestParam("extrlHrId") String extrlHrId ,
            @ModelAttribute("searchVO") ComtnextrlhrinfoDefaultVO searchVO, Model model)
            throws Exception {
        ComtnextrlhrinfoVO comtnextrlhrinfoVO = new ComtnextrlhrinfoVO();
        comtnextrlhrinfoVO.setEventId(eventId);
        comtnextrlhrinfoVO.setExtrlHrId(extrlHrId);
;        
        // 변수명은 CoC 에 따라 comtnextrlhrinfoVO
        model.addAttribute(selectComtnextrlhrinfo(comtnextrlhrinfoVO, searchVO));
        return "/comtnextrlhrinfo/ComtnextrlhrinfoRegister";
    }

    @RequestMapping("/comtnextrlhrinfo/selectComtnextrlhrinfo.do")
    public @ModelAttribute("comtnextrlhrinfoVO")
    ComtnextrlhrinfoVO selectComtnextrlhrinfo(
            ComtnextrlhrinfoVO comtnextrlhrinfoVO,
            @ModelAttribute("searchVO") ComtnextrlhrinfoDefaultVO searchVO) throws Exception {
        return comtnextrlhrinfoService.selectComtnextrlhrinfo(comtnextrlhrinfoVO);
    }

    @RequestMapping("/comtnextrlhrinfo/updateComtnextrlhrinfo.do")
    public String updateComtnextrlhrinfo(
            ComtnextrlhrinfoVO comtnextrlhrinfoVO,
            @ModelAttribute("searchVO") ComtnextrlhrinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnextrlhrinfoService.updateComtnextrlhrinfo(comtnextrlhrinfoVO);
        status.setComplete();
        return "forward:/comtnextrlhrinfo/ComtnextrlhrinfoList.do";
    }
    
    @RequestMapping("/comtnextrlhrinfo/deleteComtnextrlhrinfo.do")
    public String deleteComtnextrlhrinfo(
            ComtnextrlhrinfoVO comtnextrlhrinfoVO,
            @ModelAttribute("searchVO") ComtnextrlhrinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnextrlhrinfoService.deleteComtnextrlhrinfo(comtnextrlhrinfoVO);
        status.setComplete();
        return "forward:/comtnextrlhrinfo/ComtnextrlhrinfoList.do";
    }

}
