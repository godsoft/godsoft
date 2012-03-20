package kr.godsoft.egovframe.generatorwebapp.comtnrecomendsiteinfo.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnrecomendsiteinfo.service.ComtnrecomendsiteinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnrecomendsiteinfo.service.ComtnrecomendsiteinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnrecomendsiteinfo.service.ComtnrecomendsiteinfoVO;

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
 * @Class Name : ComtnrecomendsiteinfoController.java
 * @Description : Comtnrecomendsiteinfo Controller class
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
public class ComtnrecomendsiteinfoController {

    @Resource(name = "comtnrecomendsiteinfoService")
    private ComtnrecomendsiteinfoService comtnrecomendsiteinfoService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtnrecomendsiteinfo 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnrecomendsiteinfoVO
	 * @return "/comtnrecomendsiteinfo/ComtnrecomendsiteinfoList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnrecomendsiteinfo/ComtnrecomendsiteinfoList.do")
    public String selectComtnrecomendsiteinfoList(@ModelAttribute("searchVO") ComtnrecomendsiteinfoVO searchVO, 
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
		
        List<EgovMap> comtnrecomendsiteinfoList = comtnrecomendsiteinfoService.selectComtnrecomendsiteinfoList(searchVO);
        model.addAttribute("resultList", comtnrecomendsiteinfoList);
        
        int totCnt = comtnrecomendsiteinfoService.selectComtnrecomendsiteinfoListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnrecomendsiteinfo/ComtnrecomendsiteinfoList";
    } 
    
    @RequestMapping("/comtnrecomendsiteinfo/addComtnrecomendsiteinfoView.do")
    public String addComtnrecomendsiteinfoView(
            @ModelAttribute("searchVO") ComtnrecomendsiteinfoDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnrecomendsiteinfoVO", new ComtnrecomendsiteinfoVO());
        return "/comtnrecomendsiteinfo/ComtnrecomendsiteinfoRegister";
    }
    
    @RequestMapping("/comtnrecomendsiteinfo/addComtnrecomendsiteinfo.do")
    public String addComtnrecomendsiteinfo(
            ComtnrecomendsiteinfoVO comtnrecomendsiteinfoVO,
            @ModelAttribute("searchVO") ComtnrecomendsiteinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnrecomendsiteinfoService.insertComtnrecomendsiteinfo(comtnrecomendsiteinfoVO);
        status.setComplete();
        return "forward:/comtnrecomendsiteinfo/ComtnrecomendsiteinfoList.do";
    }
    
    @RequestMapping("/comtnrecomendsiteinfo/updateComtnrecomendsiteinfoView.do")
    public String updateComtnrecomendsiteinfoView(
            @RequestParam("recomendSiteId") String recomendSiteId ,
            @ModelAttribute("searchVO") ComtnrecomendsiteinfoDefaultVO searchVO, Model model)
            throws Exception {
        ComtnrecomendsiteinfoVO comtnrecomendsiteinfoVO = new ComtnrecomendsiteinfoVO();
        comtnrecomendsiteinfoVO.setRecomendSiteId(recomendSiteId);
;        
        // 변수명은 CoC 에 따라 comtnrecomendsiteinfoVO
        model.addAttribute(selectComtnrecomendsiteinfo(comtnrecomendsiteinfoVO, searchVO));
        return "/comtnrecomendsiteinfo/ComtnrecomendsiteinfoRegister";
    }

    @RequestMapping("/comtnrecomendsiteinfo/selectComtnrecomendsiteinfo.do")
    public @ModelAttribute("comtnrecomendsiteinfoVO")
    ComtnrecomendsiteinfoVO selectComtnrecomendsiteinfo(
            ComtnrecomendsiteinfoVO comtnrecomendsiteinfoVO,
            @ModelAttribute("searchVO") ComtnrecomendsiteinfoDefaultVO searchVO) throws Exception {
        return comtnrecomendsiteinfoService.selectComtnrecomendsiteinfo(comtnrecomendsiteinfoVO);
    }

    @RequestMapping("/comtnrecomendsiteinfo/updateComtnrecomendsiteinfo.do")
    public String updateComtnrecomendsiteinfo(
            ComtnrecomendsiteinfoVO comtnrecomendsiteinfoVO,
            @ModelAttribute("searchVO") ComtnrecomendsiteinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnrecomendsiteinfoService.updateComtnrecomendsiteinfo(comtnrecomendsiteinfoVO);
        status.setComplete();
        return "forward:/comtnrecomendsiteinfo/ComtnrecomendsiteinfoList.do";
    }
    
    @RequestMapping("/comtnrecomendsiteinfo/deleteComtnrecomendsiteinfo.do")
    public String deleteComtnrecomendsiteinfo(
            ComtnrecomendsiteinfoVO comtnrecomendsiteinfoVO,
            @ModelAttribute("searchVO") ComtnrecomendsiteinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnrecomendsiteinfoService.deleteComtnrecomendsiteinfo(comtnrecomendsiteinfoVO);
        status.setComplete();
        return "forward:/comtnrecomendsiteinfo/ComtnrecomendsiteinfoList.do";
    }

}
