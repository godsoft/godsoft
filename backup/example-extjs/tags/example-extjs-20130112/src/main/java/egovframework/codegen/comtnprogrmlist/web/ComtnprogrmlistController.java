package egovframework.codegen.comtnprogrmlist.web;

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

import egovframework.codegen.comtnprogrmlist.service.ComtnprogrmlistService;
import egovframework.codegen.comtnprogrmlist.service.ComtnprogrmlistDefaultVO;
import egovframework.codegen.comtnprogrmlist.service.ComtnprogrmlistVO;

/**
 * @Class Name : ComtnprogrmlistController.java
 * @Description : Comtnprogrmlist Controller class
 * @Modification Information
 *
 * @author 이백행
 * @since 2013-01-09
 * @version 1.0
 * @see
 *
 *  Copyright (C)  All right reserved.
 */

@Controller
@SessionAttributes(types=ComtnprogrmlistVO.class)
public class ComtnprogrmlistController {

    @Resource(name = "comtnprogrmlistService")
    private ComtnprogrmlistService comtnprogrmlistService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
    
    /**
     * comtnprogrmlist 목록을 조회한다. (pageing)
     * @param searchVO - 조회할 정보가 담긴 ComtnprogrmlistDefaultVO
     * @return "egovframework/codegen/comtnprogrmlist/ComtnprogrmlistList"
     * @exception Exception
     */
    @RequestMapping(value="/comtnprogrmlist/selectComtnprogrmlistList.do")
    public String selectComtnprogrmlistList(@ModelAttribute("searchVO") ComtnprogrmlistDefaultVO searchVO,
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
        
        List<EgovMap> comtnprogrmlistList = comtnprogrmlistService.selectComtnprogrmlistList(searchVO);
        model.addAttribute("resultList", comtnprogrmlistList);
        
        int totCnt = comtnprogrmlistService.selectComtnprogrmlistListTotCnt(searchVO);
        paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "egovframework/codegen/comtnprogrmlist/ComtnprogrmlistList";
    }

    @RequestMapping(value="/comtnprogrmlist/selectComtnprogrmlistListJson.do")
    public ModelAndView selectComtnprogrmlistListJson(@ModelAttribute("searchVO") ComtnprogrmlistDefaultVO searchVO,
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
        
        List<EgovMap> comtnprogrmlistList = comtnprogrmlistService.selectComtnprogrmlistList(searchVO);
        model.addAttribute("resultList", comtnprogrmlistList);
        
        int totCnt = comtnprogrmlistService.selectComtnprogrmlistListTotCnt(searchVO);
        paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return new ModelAndView(new MappingJacksonJsonView(), model);
    }

    @RequestMapping("/comtnprogrmlist/addComtnprogrmlistView.do")
    public String addComtnprogrmlistView(
            @ModelAttribute("searchVO") ComtnprogrmlistDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnprogrmlistVO", new ComtnprogrmlistVO());
        return "egovframework/codegen/comtnprogrmlist/ComtnprogrmlistRegist";
    }
    
    @RequestMapping("/comtnprogrmlist/addComtnprogrmlist.do")
    public String addComtnprogrmlist(
            ComtnprogrmlistVO comtnprogrmlistVO,
            @ModelAttribute("searchVO") ComtnprogrmlistDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnprogrmlistService.insertComtnprogrmlist(comtnprogrmlistVO);
        status.setComplete();
        return "redirect:/comtnprogrmlist/selectComtnprogrmlistList.do";
    }
    
    @RequestMapping("/comtnprogrmlist/updateComtnprogrmlistView.do")
    public String updateComtnprogrmlistView(
            @RequestParam("progrmFileNm") String progrmFileNm ,
            @ModelAttribute("searchVO") ComtnprogrmlistDefaultVO searchVO, Model model)
            throws Exception {
        ComtnprogrmlistVO comtnprogrmlistVO = new ComtnprogrmlistVO();
        comtnprogrmlistVO.setProgrmFileNm(progrmFileNm);
;
        // 변수명은 CoC 에 따라 comtnprogrmlistVO
        model.addAttribute(selectComtnprogrmlist(comtnprogrmlistVO, searchVO));
        return "egovframework/codegen/comtnprogrmlist/ComtnprogrmlistRegist";
    }

    @RequestMapping("/comtnprogrmlist/selectComtnprogrmlist.do")
    public @ModelAttribute("comtnprogrmlistVO")
    ComtnprogrmlistVO selectComtnprogrmlist(
            ComtnprogrmlistVO comtnprogrmlistVO,
            @ModelAttribute("searchVO") ComtnprogrmlistDefaultVO searchVO) throws Exception {
        return comtnprogrmlistService.selectComtnprogrmlist(comtnprogrmlistVO);
    }

    @RequestMapping("/comtnprogrmlist/updateComtnprogrmlist.do")
    public String updateComtnprogrmlist(
            ComtnprogrmlistVO comtnprogrmlistVO,
            @ModelAttribute("searchVO") ComtnprogrmlistDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnprogrmlistService.updateComtnprogrmlist(comtnprogrmlistVO);
        status.setComplete();
        return "redirect:/comtnprogrmlist/selectComtnprogrmlistList.do";
    }
    
    @RequestMapping("/comtnprogrmlist/deleteComtnprogrmlist.do")
    public String deleteComtnprogrmlist(
            ComtnprogrmlistVO comtnprogrmlistVO,
            @ModelAttribute("searchVO") ComtnprogrmlistDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnprogrmlistService.deleteComtnprogrmlist(comtnprogrmlistVO);
        status.setComplete();
        return "redirect:/comtnprogrmlist/selectComtnprogrmlistList.do";
    }

}
