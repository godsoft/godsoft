package egovframework.codegen.comtnsyslog.web;

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

import egovframework.codegen.comtnsyslog.service.ComtnsyslogService;
import egovframework.codegen.comtnsyslog.service.ComtnsyslogDefaultVO;
import egovframework.codegen.comtnsyslog.service.ComtnsyslogVO;

/**
 * @Class Name : ComtnsyslogController.java
 * @Description : Comtnsyslog Controller class
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
@SessionAttributes(types=ComtnsyslogVO.class)
public class ComtnsyslogController {

    @Resource(name = "comtnsyslogService")
    private ComtnsyslogService comtnsyslogService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
    
    /**
     * comtnsyslog 목록을 조회한다. (pageing)
     * @param searchVO - 조회할 정보가 담긴 ComtnsyslogDefaultVO
     * @return "egovframework/codegen/comtnsyslog/ComtnsyslogList"
     * @exception Exception
     */
    @RequestMapping(value="/comtnsyslog/selectComtnsyslogList.do")
    public String selectComtnsyslogList(@ModelAttribute("searchVO") ComtnsyslogDefaultVO searchVO,
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
        
        List<EgovMap> comtnsyslogList = comtnsyslogService.selectComtnsyslogList(searchVO);
        model.addAttribute("resultList", comtnsyslogList);
        
        int totCnt = comtnsyslogService.selectComtnsyslogListTotCnt(searchVO);
        paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "egovframework/codegen/comtnsyslog/ComtnsyslogList";
    }

    @RequestMapping(value="/comtnsyslog/selectComtnsyslogListJson.do")
    public ModelAndView selectComtnsyslogListJson(@ModelAttribute("searchVO") ComtnsyslogDefaultVO searchVO,
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
        
        List<EgovMap> comtnsyslogList = comtnsyslogService.selectComtnsyslogList(searchVO);
        model.addAttribute("resultList", comtnsyslogList);
        
        int totCnt = comtnsyslogService.selectComtnsyslogListTotCnt(searchVO);
        paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return new ModelAndView(new MappingJacksonJsonView(), model);
    }

    @RequestMapping("/comtnsyslog/addComtnsyslogView.do")
    public String addComtnsyslogView(
            @ModelAttribute("searchVO") ComtnsyslogDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnsyslogVO", new ComtnsyslogVO());
        return "egovframework/codegen/comtnsyslog/ComtnsyslogRegist";
    }
    
    @RequestMapping("/comtnsyslog/addComtnsyslog.do")
    public String addComtnsyslog(
            ComtnsyslogVO comtnsyslogVO,
            @ModelAttribute("searchVO") ComtnsyslogDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnsyslogService.insertComtnsyslog(comtnsyslogVO);
        status.setComplete();
        return "redirect:/comtnsyslog/selectComtnsyslogList.do";
    }
    
    @RequestMapping("/comtnsyslog/updateComtnsyslogView.do")
    public String updateComtnsyslogView(
            @RequestParam("requstId") String requstId ,
            @ModelAttribute("searchVO") ComtnsyslogDefaultVO searchVO, Model model)
            throws Exception {
        ComtnsyslogVO comtnsyslogVO = new ComtnsyslogVO();
        comtnsyslogVO.setRequstId(requstId);
;
        // 변수명은 CoC 에 따라 comtnsyslogVO
        model.addAttribute(selectComtnsyslog(comtnsyslogVO, searchVO));
        return "egovframework/codegen/comtnsyslog/ComtnsyslogRegist";
    }

    @RequestMapping("/comtnsyslog/selectComtnsyslog.do")
    public @ModelAttribute("comtnsyslogVO")
    ComtnsyslogVO selectComtnsyslog(
            ComtnsyslogVO comtnsyslogVO,
            @ModelAttribute("searchVO") ComtnsyslogDefaultVO searchVO) throws Exception {
        return comtnsyslogService.selectComtnsyslog(comtnsyslogVO);
    }

    @RequestMapping("/comtnsyslog/updateComtnsyslog.do")
    public String updateComtnsyslog(
            ComtnsyslogVO comtnsyslogVO,
            @ModelAttribute("searchVO") ComtnsyslogDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnsyslogService.updateComtnsyslog(comtnsyslogVO);
        status.setComplete();
        return "redirect:/comtnsyslog/selectComtnsyslogList.do";
    }
    
    @RequestMapping("/comtnsyslog/deleteComtnsyslog.do")
    public String deleteComtnsyslog(
            ComtnsyslogVO comtnsyslogVO,
            @ModelAttribute("searchVO") ComtnsyslogDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnsyslogService.deleteComtnsyslog(comtnsyslogVO);
        status.setComplete();
        return "redirect:/comtnsyslog/selectComtnsyslogList.do";
    }

}
