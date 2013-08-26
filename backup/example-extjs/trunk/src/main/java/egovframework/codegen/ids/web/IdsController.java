package egovframework.codegen.ids.web;

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

import egovframework.codegen.ids.service.IdsService;
import egovframework.codegen.ids.service.IdsDefaultVO;
import egovframework.codegen.ids.service.IdsVO;

/**
 * @Class Name : IdsController.java
 * @Description : Ids Controller class
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
@SessionAttributes(types=IdsVO.class)
public class IdsController {

    @Resource(name = "idsService")
    private IdsService idsService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
    
    /**
     * ids 목록을 조회한다. (pageing)
     * @param searchVO - 조회할 정보가 담긴 IdsDefaultVO
     * @return "egovframework/codegen/ids/IdsList"
     * @exception Exception
     */
    @RequestMapping(value="/ids/selectIdsList.do")
    public String selectIdsList(@ModelAttribute("searchVO") IdsDefaultVO searchVO,
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
        
        List<EgovMap> idsList = idsService.selectIdsList(searchVO);
        model.addAttribute("resultList", idsList);
        
        int totCnt = idsService.selectIdsListTotCnt(searchVO);
        paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "egovframework/codegen/ids/IdsList";
    }

    @RequestMapping(value="/ids/selectIdsListJson.do")
    public ModelAndView selectIdsListJson(@ModelAttribute("searchVO") IdsDefaultVO searchVO,
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
        
        List<EgovMap> idsList = idsService.selectIdsList(searchVO);
        model.addAttribute("resultList", idsList);
        
        int totCnt = idsService.selectIdsListTotCnt(searchVO);
        paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return new ModelAndView(new MappingJacksonJsonView(), model);
    }

    @RequestMapping("/ids/addIdsView.do")
    public String addIdsView(
            @ModelAttribute("searchVO") IdsDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("idsVO", new IdsVO());
        return "egovframework/codegen/ids/IdsRegist";
    }
    
    @RequestMapping("/ids/addIds.do")
    public String addIds(
            IdsVO idsVO,
            @ModelAttribute("searchVO") IdsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        idsService.insertIds(idsVO);
        status.setComplete();
        return "redirect:/ids/selectIdsList.do";
    }
    
    @RequestMapping("/ids/updateIdsView.do")
    public String updateIdsView(
            @RequestParam("tableName") String tableName ,
            @ModelAttribute("searchVO") IdsDefaultVO searchVO, Model model)
            throws Exception {
        IdsVO idsVO = new IdsVO();
        idsVO.setTableName(tableName);
;
        // 변수명은 CoC 에 따라 idsVO
        model.addAttribute(selectIds(idsVO, searchVO));
        return "egovframework/codegen/ids/IdsRegist";
    }

    @RequestMapping("/ids/selectIds.do")
    public @ModelAttribute("idsVO")
    IdsVO selectIds(
            IdsVO idsVO,
            @ModelAttribute("searchVO") IdsDefaultVO searchVO) throws Exception {
        return idsService.selectIds(idsVO);
    }

    @RequestMapping("/ids/updateIds.do")
    public String updateIds(
            IdsVO idsVO,
            @ModelAttribute("searchVO") IdsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        idsService.updateIds(idsVO);
        status.setComplete();
        return "redirect:/ids/selectIdsList.do";
    }
    
    @RequestMapping("/ids/deleteIds.do")
    public String deleteIds(
            IdsVO idsVO,
            @ModelAttribute("searchVO") IdsDefaultVO searchVO, SessionStatus status)
            throws Exception {
        idsService.deleteIds(idsVO);
        status.setComplete();
        return "redirect:/ids/selectIdsList.do";
    }

}
