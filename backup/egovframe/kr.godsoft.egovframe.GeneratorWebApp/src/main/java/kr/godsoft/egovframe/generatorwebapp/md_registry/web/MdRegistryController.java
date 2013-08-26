package kr.godsoft.egovframe.generatorwebapp.md_registry.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_registry.service.MdRegistryService;
import kr.godsoft.egovframe.generatorwebapp.md_registry.service.MdRegistryDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.md_registry.service.MdRegistryVO;

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
 * @Class Name : MdRegistryController.java
 * @Description : MdRegistry Controller class
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
public class MdRegistryController {

    @Resource(name = "mdRegistryService")
    private MdRegistryService mdRegistryService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MD_REGISTRY 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MdRegistryVO
	 * @return "/mdRegistry/MdRegistryList"
	 * @exception Exception
	 */
    @RequestMapping(value="/mdRegistry/MdRegistryList.do")
    public String selectMdRegistryList(@ModelAttribute("searchVO") MdRegistryVO searchVO, 
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
		
        List<EgovMap> mdRegistryList = mdRegistryService.selectMdRegistryList(searchVO);
        model.addAttribute("resultList", mdRegistryList);
        
        int totCnt = mdRegistryService.selectMdRegistryListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/mdRegistry/MdRegistryList";
    } 
    
    @RequestMapping("/mdRegistry/addMdRegistryView.do")
    public String addMdRegistryView(
            @ModelAttribute("searchVO") MdRegistryDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("mdRegistryVO", new MdRegistryVO());
        return "/mdRegistry/MdRegistryRegister";
    }
    
    @RequestMapping("/mdRegistry/addMdRegistry.do")
    public String addMdRegistry(
            MdRegistryVO mdRegistryVO,
            @ModelAttribute("searchVO") MdRegistryDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdRegistryService.insertMdRegistry(mdRegistryVO);
        status.setComplete();
        return "forward:/mdRegistry/MdRegistryList.do";
    }
    
    @RequestMapping("/mdRegistry/updateMdRegistryView.do")
    public String updateMdRegistryView(
            @RequestParam("objectType") String objectType ,
            @RequestParam("objectName") String objectName ,
            @ModelAttribute("searchVO") MdRegistryDefaultVO searchVO, Model model)
            throws Exception {
        MdRegistryVO mdRegistryVO = new MdRegistryVO();
        mdRegistryVO.setObjectType(objectType);
        mdRegistryVO.setObjectName(objectName);
;        
        // 변수명은 CoC 에 따라 mdRegistryVO
        model.addAttribute(selectMdRegistry(mdRegistryVO, searchVO));
        return "/mdRegistry/MdRegistryRegister";
    }

    @RequestMapping("/mdRegistry/selectMdRegistry.do")
    public @ModelAttribute("mdRegistryVO")
    MdRegistryVO selectMdRegistry(
            MdRegistryVO mdRegistryVO,
            @ModelAttribute("searchVO") MdRegistryDefaultVO searchVO) throws Exception {
        return mdRegistryService.selectMdRegistry(mdRegistryVO);
    }

    @RequestMapping("/mdRegistry/updateMdRegistry.do")
    public String updateMdRegistry(
            MdRegistryVO mdRegistryVO,
            @ModelAttribute("searchVO") MdRegistryDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdRegistryService.updateMdRegistry(mdRegistryVO);
        status.setComplete();
        return "forward:/mdRegistry/MdRegistryList.do";
    }
    
    @RequestMapping("/mdRegistry/deleteMdRegistry.do")
    public String deleteMdRegistry(
            MdRegistryVO mdRegistryVO,
            @ModelAttribute("searchVO") MdRegistryDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mdRegistryService.deleteMdRegistry(mdRegistryVO);
        status.setComplete();
        return "forward:/mdRegistry/MdRegistryList.do";
    }

}
