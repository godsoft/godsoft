package egovframework.codegen.comtsweblogsummary.web;

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

import egovframework.codegen.comtsweblogsummary.service.ComtsweblogsummaryService;
import egovframework.codegen.comtsweblogsummary.service.ComtsweblogsummaryDefaultVO;
import egovframework.codegen.comtsweblogsummary.service.ComtsweblogsummaryVO;

/**
 * @Class Name : ComtsweblogsummaryController.java
 * @Description : Comtsweblogsummary Controller class
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
@SessionAttributes(types=ComtsweblogsummaryVO.class)
public class ComtsweblogsummaryController {

    @Resource(name = "comtsweblogsummaryService")
    private ComtsweblogsummaryService comtsweblogsummaryService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
    
    /**
     * comtsweblogsummary 목록을 조회한다. (pageing)
     * @param searchVO - 조회할 정보가 담긴 ComtsweblogsummaryDefaultVO
     * @return "egovframework/codegen/comtsweblogsummary/ComtsweblogsummaryList"
     * @exception Exception
     */
    @RequestMapping(value="/comtsweblogsummary/selectComtsweblogsummaryList.do")
    public String selectComtsweblogsummaryList(@ModelAttribute("searchVO") ComtsweblogsummaryDefaultVO searchVO,
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
        
        List<EgovMap> comtsweblogsummaryList = comtsweblogsummaryService.selectComtsweblogsummaryList(searchVO);
        model.addAttribute("resultList", comtsweblogsummaryList);
        
        int totCnt = comtsweblogsummaryService.selectComtsweblogsummaryListTotCnt(searchVO);
        paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "egovframework/codegen/comtsweblogsummary/ComtsweblogsummaryList";
    }

    @RequestMapping(value="/comtsweblogsummary/selectComtsweblogsummaryListJson.do")
    public ModelAndView selectComtsweblogsummaryListJson(@ModelAttribute("searchVO") ComtsweblogsummaryDefaultVO searchVO,
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
        
        List<EgovMap> comtsweblogsummaryList = comtsweblogsummaryService.selectComtsweblogsummaryList(searchVO);
        model.addAttribute("resultList", comtsweblogsummaryList);
        
        int totCnt = comtsweblogsummaryService.selectComtsweblogsummaryListTotCnt(searchVO);
        paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return new ModelAndView(new MappingJacksonJsonView(), model);
    }

    @RequestMapping("/comtsweblogsummary/addComtsweblogsummaryView.do")
    public String addComtsweblogsummaryView(
            @ModelAttribute("searchVO") ComtsweblogsummaryDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtsweblogsummaryVO", new ComtsweblogsummaryVO());
        return "egovframework/codegen/comtsweblogsummary/ComtsweblogsummaryRegist";
    }
    
    @RequestMapping("/comtsweblogsummary/addComtsweblogsummary.do")
    public String addComtsweblogsummary(
            ComtsweblogsummaryVO comtsweblogsummaryVO,
            @ModelAttribute("searchVO") ComtsweblogsummaryDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtsweblogsummaryService.insertComtsweblogsummary(comtsweblogsummaryVO);
        status.setComplete();
        return "redirect:/comtsweblogsummary/selectComtsweblogsummaryList.do";
    }
    
    @RequestMapping("/comtsweblogsummary/updateComtsweblogsummaryView.do")
    public String updateComtsweblogsummaryView(
            @RequestParam("occrrncDe") String occrrncDe ,
            @RequestParam("url") String url ,
            @ModelAttribute("searchVO") ComtsweblogsummaryDefaultVO searchVO, Model model)
            throws Exception {
        ComtsweblogsummaryVO comtsweblogsummaryVO = new ComtsweblogsummaryVO();
        comtsweblogsummaryVO.setOccrrncDe(occrrncDe);
        comtsweblogsummaryVO.setUrl(url);
;
        // 변수명은 CoC 에 따라 comtsweblogsummaryVO
        model.addAttribute(selectComtsweblogsummary(comtsweblogsummaryVO, searchVO));
        return "egovframework/codegen/comtsweblogsummary/ComtsweblogsummaryRegist";
    }

    @RequestMapping("/comtsweblogsummary/selectComtsweblogsummary.do")
    public @ModelAttribute("comtsweblogsummaryVO")
    ComtsweblogsummaryVO selectComtsweblogsummary(
            ComtsweblogsummaryVO comtsweblogsummaryVO,
            @ModelAttribute("searchVO") ComtsweblogsummaryDefaultVO searchVO) throws Exception {
        return comtsweblogsummaryService.selectComtsweblogsummary(comtsweblogsummaryVO);
    }

    @RequestMapping("/comtsweblogsummary/updateComtsweblogsummary.do")
    public String updateComtsweblogsummary(
            ComtsweblogsummaryVO comtsweblogsummaryVO,
            @ModelAttribute("searchVO") ComtsweblogsummaryDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtsweblogsummaryService.updateComtsweblogsummary(comtsweblogsummaryVO);
        status.setComplete();
        return "redirect:/comtsweblogsummary/selectComtsweblogsummaryList.do";
    }
    
    @RequestMapping("/comtsweblogsummary/deleteComtsweblogsummary.do")
    public String deleteComtsweblogsummary(
            ComtsweblogsummaryVO comtsweblogsummaryVO,
            @ModelAttribute("searchVO") ComtsweblogsummaryDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtsweblogsummaryService.deleteComtsweblogsummary(comtsweblogsummaryVO);
        status.setComplete();
        return "redirect:/comtsweblogsummary/selectComtsweblogsummaryList.do";
    }

}
