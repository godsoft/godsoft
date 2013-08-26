package egovframework.codegen.comtssyslogsummary.web;

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

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;

import egovframework.rte.fdl.property.EgovPropertyService;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;

import egovframework.codegen.comtssyslogsummary.service.ComtssyslogsummaryService;
import egovframework.codegen.comtssyslogsummary.service.ComtssyslogsummaryDefaultVO;
import egovframework.codegen.comtssyslogsummary.service.ComtssyslogsummaryVO;

/**
 * @Class Name : ComtssyslogsummaryController.java
 * @Description : Comtssyslogsummary Controller class
 * @Modification Information
 *
 * @author 이백행
 * @since 2013-01-13
 * @version 1.0
 * @see
 *
 *  Copyright (C)  All right reserved.
 */

@Controller
@SessionAttributes(types=ComtssyslogsummaryVO.class)
public class ComtssyslogsummaryController {

    @Resource(name = "comtssyslogsummaryService")
    private ComtssyslogsummaryService comtssyslogsummaryService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
    
    /**
     * comtssyslogsummary 목록을 조회한다. (pageing)
     * @param searchVO - 조회할 정보가 담긴 ComtssyslogsummaryDefaultVO
     * @return "egovframework/codegen/comtssyslogsummary/ComtssyslogsummaryList"
     * @exception Exception
     */
    @RequestMapping(value="/comtssyslogsummary/selectComtssyslogsummaryList.do")
    public String selectComtssyslogsummaryList(@ModelAttribute("searchVO") ComtssyslogsummaryDefaultVO searchVO,
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
        
        List<EgovMap> comtssyslogsummaryList = comtssyslogsummaryService.selectComtssyslogsummaryList(searchVO);
        model.addAttribute("resultList", comtssyslogsummaryList);
        
        int totCnt = comtssyslogsummaryService.selectComtssyslogsummaryListTotCnt(searchVO);
        paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "egovframework/codegen/comtssyslogsummary/ComtssyslogsummaryList";
    }

    @RequestMapping(value="/comtssyslogsummary/selectComtssyslogsummaryListJson.do")
    public ModelAndView selectComtssyslogsummaryListJson(@ModelAttribute("searchVO") ComtssyslogsummaryDefaultVO searchVO,
            ModelMap model)
            throws Exception {
        
        /** EgovPropertyService.sample */
        searchVO.setPageUnit(propertiesService.getInt("pageUnit"));
        searchVO.setPageSize(propertiesService.getInt("pageSize"));
        
        /** pageing */
        PaginationInfo paginationInfo = new PaginationInfo();
        paginationInfo.setCurrentPageNo(searchVO.getPageIndex());
        paginationInfo.setRecordCountPerPage(1000);
        paginationInfo.setPageSize(searchVO.getPageSize());
        
        searchVO.setFirstIndex(paginationInfo.getFirstRecordIndex());
        searchVO.setLastIndex(paginationInfo.getLastRecordIndex());
        searchVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());
        
        List<EgovMap> comtssyslogsummaryList = comtssyslogsummaryService.selectComtssyslogsummaryList(searchVO);
        model.addAttribute("resultList", comtssyslogsummaryList);
        
        int totCnt = comtssyslogsummaryService.selectComtssyslogsummaryListTotCnt(searchVO);
        paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return new ModelAndView(new MappingJacksonJsonView(), model);
    }

    @RequestMapping("/comtssyslogsummary/addComtssyslogsummaryView.do")
    public String addComtssyslogsummaryView(
            @ModelAttribute("searchVO") ComtssyslogsummaryDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtssyslogsummaryVO", new ComtssyslogsummaryVO());
        return "egovframework/codegen/comtssyslogsummary/ComtssyslogsummaryRegist";
    }
    
    @RequestMapping("/comtssyslogsummary/addComtssyslogsummary.do")
    public String addComtssyslogsummary(
            ComtssyslogsummaryVO comtssyslogsummaryVO,
            @ModelAttribute("searchVO") ComtssyslogsummaryDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtssyslogsummaryService.insertComtssyslogsummary(comtssyslogsummaryVO);
        status.setComplete();
        return "redirect:/comtssyslogsummary/selectComtssyslogsummaryList.do";
    }
    
    @RequestMapping("/comtssyslogsummary/updateComtssyslogsummaryView.do")
    public String updateComtssyslogsummaryView(
            @RequestParam("occrrncDe") String occrrncDe ,
            @RequestParam("svcNm") String svcNm ,
            @RequestParam("methodNm") String methodNm ,
            @ModelAttribute("searchVO") ComtssyslogsummaryDefaultVO searchVO, Model model)
            throws Exception {
        ComtssyslogsummaryVO comtssyslogsummaryVO = new ComtssyslogsummaryVO();
        comtssyslogsummaryVO.setOccrrncDe(occrrncDe);
        comtssyslogsummaryVO.setSvcNm(svcNm);
        comtssyslogsummaryVO.setMethodNm(methodNm);
;
        // 변수명은 CoC 에 따라 comtssyslogsummaryVO
        model.addAttribute(selectComtssyslogsummary(comtssyslogsummaryVO, searchVO));
        return "egovframework/codegen/comtssyslogsummary/ComtssyslogsummaryRegist";
    }

    @RequestMapping("/comtssyslogsummary/selectComtssyslogsummary.do")
    public @ModelAttribute("comtssyslogsummaryVO")
    ComtssyslogsummaryVO selectComtssyslogsummary(
            ComtssyslogsummaryVO comtssyslogsummaryVO,
            @ModelAttribute("searchVO") ComtssyslogsummaryDefaultVO searchVO) throws Exception {
        return comtssyslogsummaryService.selectComtssyslogsummary(comtssyslogsummaryVO);
    }

    @RequestMapping("/comtssyslogsummary/updateComtssyslogsummary.do")
    public String updateComtssyslogsummary(
            ComtssyslogsummaryVO comtssyslogsummaryVO,
            @ModelAttribute("searchVO") ComtssyslogsummaryDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtssyslogsummaryService.updateComtssyslogsummary(comtssyslogsummaryVO);
        status.setComplete();
        return "redirect:/comtssyslogsummary/selectComtssyslogsummaryList.do";
    }
    
    @RequestMapping("/comtssyslogsummary/deleteComtssyslogsummary.do")
    public String deleteComtssyslogsummary(
            ComtssyslogsummaryVO comtssyslogsummaryVO,
            @ModelAttribute("searchVO") ComtssyslogsummaryDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtssyslogsummaryService.deleteComtssyslogsummary(comtssyslogsummaryVO);
        status.setComplete();
        return "redirect:/comtssyslogsummary/selectComtssyslogsummaryList.do";
    }

}
