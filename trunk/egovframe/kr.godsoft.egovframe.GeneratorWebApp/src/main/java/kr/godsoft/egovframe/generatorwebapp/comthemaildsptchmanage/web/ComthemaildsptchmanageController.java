package kr.godsoft.egovframe.generatorwebapp.comthemaildsptchmanage.web;

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

import egovframework.rte.fdl.property.EgovPropertyService;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;

import kr.godsoft.egovframe.generatorwebapp.comthemaildsptchmanage.service.ComthemaildsptchmanageService;
import kr.godsoft.egovframe.generatorwebapp.comthemaildsptchmanage.service.ComthemaildsptchmanageDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comthemaildsptchmanage.service.ComthemaildsptchmanageVO;

/**
 * @Class Name : ComthemaildsptchmanageController.java
 * @Description : Comthemaildsptchmanage Controller class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Controller
@SessionAttributes(types=ComthemaildsptchmanageVO.class)
public class ComthemaildsptchmanageController {

    @Resource(name = "comthemaildsptchmanageService")
    private ComthemaildsptchmanageService comthemaildsptchmanageService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comthemaildsptchmanage 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComthemaildsptchmanageDefaultVO
	 * @return "/comthemaildsptchmanage/ComthemaildsptchmanageList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comthemaildsptchmanage/ComthemaildsptchmanageList.do")
    public String selectComthemaildsptchmanageList(@ModelAttribute("searchVO") ComthemaildsptchmanageDefaultVO searchVO, 
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
		
        List comthemaildsptchmanageList = comthemaildsptchmanageService.selectComthemaildsptchmanageList(searchVO);
        model.addAttribute("resultList", comthemaildsptchmanageList);
        
        int totCnt = comthemaildsptchmanageService.selectComthemaildsptchmanageListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comthemaildsptchmanage/ComthemaildsptchmanageList";
    } 
    
    @RequestMapping("/comthemaildsptchmanage/addComthemaildsptchmanageView.do")
    public String addComthemaildsptchmanageView(
            @ModelAttribute("searchVO") ComthemaildsptchmanageDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comthemaildsptchmanageVO", new ComthemaildsptchmanageVO());
        return "/comthemaildsptchmanage/ComthemaildsptchmanageRegister";
    }
    
    @RequestMapping("/comthemaildsptchmanage/addComthemaildsptchmanage.do")
    public String addComthemaildsptchmanage(
            ComthemaildsptchmanageVO comthemaildsptchmanageVO,
            @ModelAttribute("searchVO") ComthemaildsptchmanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comthemaildsptchmanageService.insertComthemaildsptchmanage(comthemaildsptchmanageVO);
        status.setComplete();
        return "forward:/comthemaildsptchmanage/ComthemaildsptchmanageList.do";
    }
    
    @RequestMapping("/comthemaildsptchmanage/updateComthemaildsptchmanageView.do")
    public String updateComthemaildsptchmanageView(
            @RequestParam("mssageId") String mssageId ,
            @ModelAttribute("searchVO") ComthemaildsptchmanageDefaultVO searchVO, Model model)
            throws Exception {
        ComthemaildsptchmanageVO comthemaildsptchmanageVO = new ComthemaildsptchmanageVO();
        comthemaildsptchmanageVO.setMssageId(mssageId);
;        
        // 변수명은 CoC 에 따라 comthemaildsptchmanageVO
        model.addAttribute(selectComthemaildsptchmanage(comthemaildsptchmanageVO, searchVO));
        return "/comthemaildsptchmanage/ComthemaildsptchmanageRegister";
    }

    @RequestMapping("/comthemaildsptchmanage/selectComthemaildsptchmanage.do")
    public @ModelAttribute("comthemaildsptchmanageVO")
    ComthemaildsptchmanageVO selectComthemaildsptchmanage(
            ComthemaildsptchmanageVO comthemaildsptchmanageVO,
            @ModelAttribute("searchVO") ComthemaildsptchmanageDefaultVO searchVO) throws Exception {
        return comthemaildsptchmanageService.selectComthemaildsptchmanage(comthemaildsptchmanageVO);
    }

    @RequestMapping("/comthemaildsptchmanage/updateComthemaildsptchmanage.do")
    public String updateComthemaildsptchmanage(
            ComthemaildsptchmanageVO comthemaildsptchmanageVO,
            @ModelAttribute("searchVO") ComthemaildsptchmanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comthemaildsptchmanageService.updateComthemaildsptchmanage(comthemaildsptchmanageVO);
        status.setComplete();
        return "forward:/comthemaildsptchmanage/ComthemaildsptchmanageList.do";
    }
    
    @RequestMapping("/comthemaildsptchmanage/deleteComthemaildsptchmanage.do")
    public String deleteComthemaildsptchmanage(
            ComthemaildsptchmanageVO comthemaildsptchmanageVO,
            @ModelAttribute("searchVO") ComthemaildsptchmanageDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comthemaildsptchmanageService.deleteComthemaildsptchmanage(comthemaildsptchmanageVO);
        status.setComplete();
        return "forward:/comthemaildsptchmanage/ComthemaildsptchmanageList.do";
    }

}
