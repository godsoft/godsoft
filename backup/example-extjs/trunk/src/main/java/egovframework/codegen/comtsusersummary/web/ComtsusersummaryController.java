package egovframework.codegen.comtsusersummary.web;

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

import egovframework.codegen.comtsusersummary.service.ComtsusersummaryService;
import egovframework.codegen.comtsusersummary.service.ComtsusersummaryDefaultVO;
import egovframework.codegen.comtsusersummary.service.ComtsusersummaryVO;

/**
 * @Class Name : ComtsusersummaryController.java
 * @Description : Comtsusersummary Controller class
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
@SessionAttributes(types=ComtsusersummaryVO.class)
public class ComtsusersummaryController {

    @Resource(name = "comtsusersummaryService")
    private ComtsusersummaryService comtsusersummaryService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
    
    /**
     * comtsusersummary 목록을 조회한다. (pageing)
     * @param searchVO - 조회할 정보가 담긴 ComtsusersummaryDefaultVO
     * @return "egovframework/codegen/comtsusersummary/ComtsusersummaryList"
     * @exception Exception
     */
    @RequestMapping(value="/comtsusersummary/selectComtsusersummaryList.do")
    public String selectComtsusersummaryList(@ModelAttribute("searchVO") ComtsusersummaryDefaultVO searchVO,
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
        
        List<EgovMap> comtsusersummaryList = comtsusersummaryService.selectComtsusersummaryList(searchVO);
        model.addAttribute("resultList", comtsusersummaryList);
        
        int totCnt = comtsusersummaryService.selectComtsusersummaryListTotCnt(searchVO);
        paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "egovframework/codegen/comtsusersummary/ComtsusersummaryList";
    }

    @RequestMapping(value="/comtsusersummary/selectComtsusersummaryListJson.do")
    public ModelAndView selectComtsusersummaryListJson(@ModelAttribute("searchVO") ComtsusersummaryDefaultVO searchVO,
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
        
        List<EgovMap> comtsusersummaryList = comtsusersummaryService.selectComtsusersummaryList(searchVO);
        model.addAttribute("resultList", comtsusersummaryList);
        
        int totCnt = comtsusersummaryService.selectComtsusersummaryListTotCnt(searchVO);
        paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return new ModelAndView(new MappingJacksonJsonView(), model);
    }

    @RequestMapping("/comtsusersummary/addComtsusersummaryView.do")
    public String addComtsusersummaryView(
            @ModelAttribute("searchVO") ComtsusersummaryDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtsusersummaryVO", new ComtsusersummaryVO());
        return "egovframework/codegen/comtsusersummary/ComtsusersummaryRegist";
    }
    
    @RequestMapping("/comtsusersummary/addComtsusersummary.do")
    public String addComtsusersummary(
            ComtsusersummaryVO comtsusersummaryVO,
            @ModelAttribute("searchVO") ComtsusersummaryDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtsusersummaryService.insertComtsusersummary(comtsusersummaryVO);
        status.setComplete();
        return "redirect:/comtsusersummary/selectComtsusersummaryList.do";
    }
    
    @RequestMapping("/comtsusersummary/updateComtsusersummaryView.do")
    public String updateComtsusersummaryView(
            @RequestParam("occrrncDe") String occrrncDe ,
            @RequestParam("statsSe") String statsSe ,
            @RequestParam("detailStatsSe") String detailStatsSe ,
            @ModelAttribute("searchVO") ComtsusersummaryDefaultVO searchVO, Model model)
            throws Exception {
        ComtsusersummaryVO comtsusersummaryVO = new ComtsusersummaryVO();
        comtsusersummaryVO.setOccrrncDe(occrrncDe);
        comtsusersummaryVO.setStatsSe(statsSe);
        comtsusersummaryVO.setDetailStatsSe(detailStatsSe);
;
        // 변수명은 CoC 에 따라 comtsusersummaryVO
        model.addAttribute(selectComtsusersummary(comtsusersummaryVO, searchVO));
        return "egovframework/codegen/comtsusersummary/ComtsusersummaryRegist";
    }

    @RequestMapping("/comtsusersummary/selectComtsusersummary.do")
    public @ModelAttribute("comtsusersummaryVO")
    ComtsusersummaryVO selectComtsusersummary(
            ComtsusersummaryVO comtsusersummaryVO,
            @ModelAttribute("searchVO") ComtsusersummaryDefaultVO searchVO) throws Exception {
        return comtsusersummaryService.selectComtsusersummary(comtsusersummaryVO);
    }

    @RequestMapping("/comtsusersummary/updateComtsusersummary.do")
    public String updateComtsusersummary(
            ComtsusersummaryVO comtsusersummaryVO,
            @ModelAttribute("searchVO") ComtsusersummaryDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtsusersummaryService.updateComtsusersummary(comtsusersummaryVO);
        status.setComplete();
        return "redirect:/comtsusersummary/selectComtsusersummaryList.do";
    }
    
    @RequestMapping("/comtsusersummary/deleteComtsusersummary.do")
    public String deleteComtsusersummary(
            ComtsusersummaryVO comtsusersummaryVO,
            @ModelAttribute("searchVO") ComtsusersummaryDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtsusersummaryService.deleteComtsusersummary(comtsusersummaryVO);
        status.setComplete();
        return "redirect:/comtsusersummary/selectComtsusersummaryList.do";
    }

}
