package kr.godsoft.egovframe.generatorwebapp.md_packages.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_packages.service.MdPackagesService;
import kr.godsoft.egovframe.generatorwebapp.md_packages.service.MdPackagesDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.md_packages.service.MdPackagesVO;

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
 * @Class Name : MdPackagesController.java
 * @Description : MdPackages Controller class
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
public class MdPackagesController {

    @Resource(name = "mdPackagesService")
    private MdPackagesService mdPackagesService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MD_PACKAGES 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MdPackagesVO
	 * @return "/mdPackages/MdPackagesList"
	 * @exception Exception
	 */
    @RequestMapping(value="/mdPackages/MdPackagesList.do")
    public String selectMdPackagesList(@ModelAttribute("searchVO") MdPackagesVO searchVO, 
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
		
        List<EgovMap> mdPackagesList = mdPackagesService.selectMdPackagesList(searchVO);
        model.addAttribute("resultList", mdPackagesList);
        
        int totCnt = mdPackagesService.selectMdPackagesListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/mdPackages/MdPackagesList";
    } 
    
    @RequestMapping("/mdPackages/addMdPackagesView.do")
    public String addMdPackagesView(
            @ModelAttribute("searchVO") MdPackagesDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("mdPackagesVO", new MdPackagesVO());
        return "/mdPackages/MdPackagesRegister";
    }
    
    @RequestMapping("/mdPackages/addMdPackages.do")
    public String addMdPackages(
            MdPackagesVO mdPackagesVO,
            @ModelAttribute("searchVO") MdPackagesDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdPackagesService.insertMdPackages(mdPackagesVO);
        status.setComplete();
        return "forward:/mdPackages/MdPackagesList.do";
    }
    
    @RequestMapping("/mdPackages/updateMdPackagesView.do")
    public String updateMdPackagesView(
            @RequestParam("id") String id ,
            @ModelAttribute("searchVO") MdPackagesDefaultVO searchVO, Model model)
            throws Exception {
        MdPackagesVO mdPackagesVO = new MdPackagesVO();
        mdPackagesVO.setId(id);
;        
        // 변수명은 CoC 에 따라 mdPackagesVO
        model.addAttribute(selectMdPackages(mdPackagesVO, searchVO));
        return "/mdPackages/MdPackagesRegister";
    }

    @RequestMapping("/mdPackages/selectMdPackages.do")
    public @ModelAttribute("mdPackagesVO")
    MdPackagesVO selectMdPackages(
            MdPackagesVO mdPackagesVO,
            @ModelAttribute("searchVO") MdPackagesDefaultVO searchVO) throws Exception {
        return mdPackagesService.selectMdPackages(mdPackagesVO);
    }

    @RequestMapping("/mdPackages/updateMdPackages.do")
    public String updateMdPackages(
            MdPackagesVO mdPackagesVO,
            @ModelAttribute("searchVO") MdPackagesDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdPackagesService.updateMdPackages(mdPackagesVO);
        status.setComplete();
        return "forward:/mdPackages/MdPackagesList.do";
    }
    
    @RequestMapping("/mdPackages/deleteMdPackages.do")
    public String deleteMdPackages(
            MdPackagesVO mdPackagesVO,
            @ModelAttribute("searchVO") MdPackagesDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdPackagesService.deleteMdPackages(mdPackagesVO);
        status.setComplete();
        return "forward:/mdPackages/MdPackagesList.do";
    }

}
