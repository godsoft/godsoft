package egovframework.codegen.comtnroleinfo.web;

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

import egovframework.codegen.comtnroleinfo.service.ComtnroleinfoService;
import egovframework.codegen.comtnroleinfo.service.ComtnroleinfoDefaultVO;
import egovframework.codegen.comtnroleinfo.service.ComtnroleinfoVO;

/**
 * @Class Name : ComtnroleinfoController.java
 * @Description : Comtnroleinfo Controller class
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
@SessionAttributes(types=ComtnroleinfoVO.class)
public class ComtnroleinfoController {

    @Resource(name = "comtnroleinfoService")
    private ComtnroleinfoService comtnroleinfoService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
    
    /**
     * comtnroleinfo 목록을 조회한다. (pageing)
     * @param searchVO - 조회할 정보가 담긴 ComtnroleinfoDefaultVO
     * @return "egovframework/codegen/comtnroleinfo/ComtnroleinfoList"
     * @exception Exception
     */
    @RequestMapping(value="/comtnroleinfo/selectComtnroleinfoList.do")
    public String selectComtnroleinfoList(@ModelAttribute("searchVO") ComtnroleinfoDefaultVO searchVO,
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
        
        List<EgovMap> comtnroleinfoList = comtnroleinfoService.selectComtnroleinfoList(searchVO);
        model.addAttribute("resultList", comtnroleinfoList);
        
        int totCnt = comtnroleinfoService.selectComtnroleinfoListTotCnt(searchVO);
        paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "egovframework/codegen/comtnroleinfo/ComtnroleinfoList";
    }

    @RequestMapping(value="/comtnroleinfo/selectComtnroleinfoListJson.do")
    public ModelAndView selectComtnroleinfoListJson(@ModelAttribute("searchVO") ComtnroleinfoDefaultVO searchVO,
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
        
        List<EgovMap> comtnroleinfoList = comtnroleinfoService.selectComtnroleinfoList(searchVO);
        model.addAttribute("resultList", comtnroleinfoList);
        
        int totCnt = comtnroleinfoService.selectComtnroleinfoListTotCnt(searchVO);
        paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return new ModelAndView(new MappingJacksonJsonView(), model);
    }

    @RequestMapping("/comtnroleinfo/addComtnroleinfoView.do")
    public String addComtnroleinfoView(
            @ModelAttribute("searchVO") ComtnroleinfoDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnroleinfoVO", new ComtnroleinfoVO());
        return "egovframework/codegen/comtnroleinfo/ComtnroleinfoRegist";
    }
    
    @RequestMapping("/comtnroleinfo/addComtnroleinfo.do")
    public String addComtnroleinfo(
            ComtnroleinfoVO comtnroleinfoVO,
            @ModelAttribute("searchVO") ComtnroleinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnroleinfoService.insertComtnroleinfo(comtnroleinfoVO);
        status.setComplete();
        return "redirect:/comtnroleinfo/selectComtnroleinfoList.do";
    }
    
    @RequestMapping("/comtnroleinfo/updateComtnroleinfoView.do")
    public String updateComtnroleinfoView(
            @RequestParam("roleCode") String roleCode ,
            @ModelAttribute("searchVO") ComtnroleinfoDefaultVO searchVO, Model model)
            throws Exception {
        ComtnroleinfoVO comtnroleinfoVO = new ComtnroleinfoVO();
        comtnroleinfoVO.setRoleCode(roleCode);
;
        // 변수명은 CoC 에 따라 comtnroleinfoVO
        model.addAttribute(selectComtnroleinfo(comtnroleinfoVO, searchVO));
        return "egovframework/codegen/comtnroleinfo/ComtnroleinfoRegist";
    }

    @RequestMapping("/comtnroleinfo/selectComtnroleinfo.do")
    public @ModelAttribute("comtnroleinfoVO")
    ComtnroleinfoVO selectComtnroleinfo(
            ComtnroleinfoVO comtnroleinfoVO,
            @ModelAttribute("searchVO") ComtnroleinfoDefaultVO searchVO) throws Exception {
        return comtnroleinfoService.selectComtnroleinfo(comtnroleinfoVO);
    }

    @RequestMapping("/comtnroleinfo/updateComtnroleinfo.do")
    public String updateComtnroleinfo(
            ComtnroleinfoVO comtnroleinfoVO,
            @ModelAttribute("searchVO") ComtnroleinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnroleinfoService.updateComtnroleinfo(comtnroleinfoVO);
        status.setComplete();
        return "redirect:/comtnroleinfo/selectComtnroleinfoList.do";
    }
    
    @RequestMapping("/comtnroleinfo/deleteComtnroleinfo.do")
    public String deleteComtnroleinfo(
            ComtnroleinfoVO comtnroleinfoVO,
            @ModelAttribute("searchVO") ComtnroleinfoDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnroleinfoService.deleteComtnroleinfo(comtnroleinfoVO);
        status.setComplete();
        return "redirect:/comtnroleinfo/selectComtnroleinfoList.do";
    }

}
