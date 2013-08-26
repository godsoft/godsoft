package egovframework.codegen.comtccmmncode.web;

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

import egovframework.codegen.comtccmmncode.service.ComtccmmncodeService;
import egovframework.codegen.comtccmmncode.service.ComtccmmncodeDefaultVO;
import egovframework.codegen.comtccmmncode.service.ComtccmmncodeVO;

/**
 * @Class Name : ComtccmmncodeController.java
 * @Description : Comtccmmncode Controller class
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
@SessionAttributes(types=ComtccmmncodeVO.class)
public class ComtccmmncodeController {

    @Resource(name = "comtccmmncodeService")
    private ComtccmmncodeService comtccmmncodeService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
    
    /**
     * comtccmmncode 목록을 조회한다. (pageing)
     * @param searchVO - 조회할 정보가 담긴 ComtccmmncodeDefaultVO
     * @return "egovframework/codegen/comtccmmncode/ComtccmmncodeList"
     * @exception Exception
     */
    @RequestMapping(value="/comtccmmncode/selectComtccmmncodeList.do")
    public String selectComtccmmncodeList(@ModelAttribute("searchVO") ComtccmmncodeDefaultVO searchVO,
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
        
        List<EgovMap> comtccmmncodeList = comtccmmncodeService.selectComtccmmncodeList(searchVO);
        model.addAttribute("resultList", comtccmmncodeList);
        
        int totCnt = comtccmmncodeService.selectComtccmmncodeListTotCnt(searchVO);
        paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "egovframework/codegen/comtccmmncode/ComtccmmncodeList";
    }

    @RequestMapping(value="/comtccmmncode/selectComtccmmncodeListJson.do")
    public ModelAndView selectComtccmmncodeListJson(@ModelAttribute("searchVO") ComtccmmncodeDefaultVO searchVO,
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
        
        List<EgovMap> comtccmmncodeList = comtccmmncodeService.selectComtccmmncodeList(searchVO);
        model.addAttribute("resultList", comtccmmncodeList);
        
        int totCnt = comtccmmncodeService.selectComtccmmncodeListTotCnt(searchVO);
        paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return new ModelAndView(new MappingJacksonJsonView(), model);
    }

    @RequestMapping("/comtccmmncode/addComtccmmncodeView.do")
    public String addComtccmmncodeView(
            @ModelAttribute("searchVO") ComtccmmncodeDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtccmmncodeVO", new ComtccmmncodeVO());
        return "egovframework/codegen/comtccmmncode/ComtccmmncodeRegist";
    }
    
    @RequestMapping("/comtccmmncode/addComtccmmncode.do")
    public String addComtccmmncode(
            ComtccmmncodeVO comtccmmncodeVO,
            @ModelAttribute("searchVO") ComtccmmncodeDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtccmmncodeService.insertComtccmmncode(comtccmmncodeVO);
        status.setComplete();
        return "redirect:/comtccmmncode/selectComtccmmncodeList.do";
    }
    
    @RequestMapping("/comtccmmncode/updateComtccmmncodeView.do")
    public String updateComtccmmncodeView(
            @RequestParam("codeId") String codeId ,
            @ModelAttribute("searchVO") ComtccmmncodeDefaultVO searchVO, Model model)
            throws Exception {
        ComtccmmncodeVO comtccmmncodeVO = new ComtccmmncodeVO();
        comtccmmncodeVO.setCodeId(codeId);
;
        // 변수명은 CoC 에 따라 comtccmmncodeVO
        model.addAttribute(selectComtccmmncode(comtccmmncodeVO, searchVO));
        return "egovframework/codegen/comtccmmncode/ComtccmmncodeRegist";
    }

    @RequestMapping("/comtccmmncode/selectComtccmmncode.do")
    public @ModelAttribute("comtccmmncodeVO")
    ComtccmmncodeVO selectComtccmmncode(
            ComtccmmncodeVO comtccmmncodeVO,
            @ModelAttribute("searchVO") ComtccmmncodeDefaultVO searchVO) throws Exception {
        return comtccmmncodeService.selectComtccmmncode(comtccmmncodeVO);
    }

    @RequestMapping("/comtccmmncode/updateComtccmmncode.do")
    public String updateComtccmmncode(
            ComtccmmncodeVO comtccmmncodeVO,
            @ModelAttribute("searchVO") ComtccmmncodeDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtccmmncodeService.updateComtccmmncode(comtccmmncodeVO);
        status.setComplete();
        return "redirect:/comtccmmncode/selectComtccmmncodeList.do";
    }
    
    @RequestMapping("/comtccmmncode/deleteComtccmmncode.do")
    public String deleteComtccmmncode(
            ComtccmmncodeVO comtccmmncodeVO,
            @ModelAttribute("searchVO") ComtccmmncodeDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtccmmncodeService.deleteComtccmmncode(comtccmmncodeVO);
        status.setComplete();
        return "redirect:/comtccmmncode/selectComtccmmncodeList.do";
    }

}
