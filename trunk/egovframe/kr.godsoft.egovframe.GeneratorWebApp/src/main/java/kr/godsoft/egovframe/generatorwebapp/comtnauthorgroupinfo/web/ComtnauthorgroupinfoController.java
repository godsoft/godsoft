package kr.godsoft.egovframe.generatorwebapp.comtnauthorgroupinfo.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnauthorgroupinfo.service.ComtnauthorgroupinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnauthorgroupinfo.service.ComtnauthorgroupinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnauthorgroupinfo.service.ComtnauthorgroupinfoVO;

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
 * @Class Name : ComtnauthorgroupinfoController.java
 * @Description : Comtnauthorgroupinfo Controller class
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
public class ComtnauthorgroupinfoController {

    @Resource(name = "comtnauthorgroupinfoService")
    private ComtnauthorgroupinfoService comtnauthorgroupinfoService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNAUTHORGROUPINFO 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnauthorgroupinfoVO
	 * @return "/comtnauthorgroupinfo/ComtnauthorgroupinfoList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnauthorgroupinfo/ComtnauthorgroupinfoList.do")
    public String selectComtnauthorgroupinfoList(@ModelAttribute("searchVO") ComtnauthorgroupinfoVO searchVO, 
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
		
        List<EgovMap> comtnauthorgroupinfoList = comtnauthorgroupinfoService.selectComtnauthorgroupinfoList(searchVO);
        model.addAttribute("resultList", comtnauthorgroupinfoList);
        
        int totCnt = comtnauthorgroupinfoService.selectComtnauthorgroupinfoListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnauthorgroupinfo/ComtnauthorgroupinfoList";
    } 
    
    @RequestMapping("/comtnauthorgroupinfo/addComtnauthorgroupinfoView.do")
    public String addComtnauthorgroupinfoView(
            @ModelAttribute("searchVO") ComtnauthorgroupinfoDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnauthorgroupinfoVO", new ComtnauthorgroupinfoVO());
        return "/comtnauthorgroupinfo/ComtnauthorgroupinfoRegister";
    }
    
    @RequestMapping("/comtnauthorgroupinfo/addComtnauthorgroupinfo.do")
    public String addComtnauthorgroupinfo(
            ComtnauthorgroupinfoVO comtnauthorgroupinfoVO,
            @ModelAttribute("searchVO") ComtnauthorgroupinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnauthorgroupinfoService.insertComtnauthorgroupinfo(comtnauthorgroupinfoVO);
        status.setComplete();
        return "forward:/comtnauthorgroupinfo/ComtnauthorgroupinfoList.do";
    }
    
    @RequestMapping("/comtnauthorgroupinfo/updateComtnauthorgroupinfoView.do")
    public String updateComtnauthorgroupinfoView(
            @RequestParam("groupId") String groupId ,
            @ModelAttribute("searchVO") ComtnauthorgroupinfoDefaultVO searchVO, Model model)
            throws Exception {
        ComtnauthorgroupinfoVO comtnauthorgroupinfoVO = new ComtnauthorgroupinfoVO();
        comtnauthorgroupinfoVO.setGroupId(groupId);
;        
        // 변수명은 CoC 에 따라 comtnauthorgroupinfoVO
        model.addAttribute(selectComtnauthorgroupinfo(comtnauthorgroupinfoVO, searchVO));
        return "/comtnauthorgroupinfo/ComtnauthorgroupinfoRegister";
    }

    @RequestMapping("/comtnauthorgroupinfo/selectComtnauthorgroupinfo.do")
    public @ModelAttribute("comtnauthorgroupinfoVO")
    ComtnauthorgroupinfoVO selectComtnauthorgroupinfo(
            ComtnauthorgroupinfoVO comtnauthorgroupinfoVO,
            @ModelAttribute("searchVO") ComtnauthorgroupinfoDefaultVO searchVO) throws Exception {
        return comtnauthorgroupinfoService.selectComtnauthorgroupinfo(comtnauthorgroupinfoVO);
    }

    @RequestMapping("/comtnauthorgroupinfo/updateComtnauthorgroupinfo.do")
    public String updateComtnauthorgroupinfo(
            ComtnauthorgroupinfoVO comtnauthorgroupinfoVO,
            @ModelAttribute("searchVO") ComtnauthorgroupinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnauthorgroupinfoService.updateComtnauthorgroupinfo(comtnauthorgroupinfoVO);
        status.setComplete();
        return "forward:/comtnauthorgroupinfo/ComtnauthorgroupinfoList.do";
    }
    
    @RequestMapping("/comtnauthorgroupinfo/deleteComtnauthorgroupinfo.do")
    public String deleteComtnauthorgroupinfo(
            ComtnauthorgroupinfoVO comtnauthorgroupinfoVO,
            @ModelAttribute("searchVO") ComtnauthorgroupinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnauthorgroupinfoService.deleteComtnauthorgroupinfo(comtnauthorgroupinfoVO);
        status.setComplete();
        return "forward:/comtnauthorgroupinfo/ComtnauthorgroupinfoList.do";
    }

}
