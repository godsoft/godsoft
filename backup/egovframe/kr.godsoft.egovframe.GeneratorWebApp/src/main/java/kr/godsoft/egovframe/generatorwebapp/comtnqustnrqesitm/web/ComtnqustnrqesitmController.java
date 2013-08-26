package kr.godsoft.egovframe.generatorwebapp.comtnqustnrqesitm.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnqustnrqesitm.service.ComtnqustnrqesitmService;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnrqesitm.service.ComtnqustnrqesitmDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnrqesitm.service.ComtnqustnrqesitmVO;

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
 * @Class Name : ComtnqustnrqesitmController.java
 * @Description : Comtnqustnrqesitm Controller class
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
public class ComtnqustnrqesitmController {

    @Resource(name = "comtnqustnrqesitmService")
    private ComtnqustnrqesitmService comtnqustnrqesitmService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNQUSTNRQESITM 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnqustnrqesitmVO
	 * @return "/comtnqustnrqesitm/ComtnqustnrqesitmList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnqustnrqesitm/ComtnqustnrqesitmList.do")
    public String selectComtnqustnrqesitmList(@ModelAttribute("searchVO") ComtnqustnrqesitmVO searchVO, 
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
		
        List<EgovMap> comtnqustnrqesitmList = comtnqustnrqesitmService.selectComtnqustnrqesitmList(searchVO);
        model.addAttribute("resultList", comtnqustnrqesitmList);
        
        int totCnt = comtnqustnrqesitmService.selectComtnqustnrqesitmListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnqustnrqesitm/ComtnqustnrqesitmList";
    } 
    
    @RequestMapping("/comtnqustnrqesitm/addComtnqustnrqesitmView.do")
    public String addComtnqustnrqesitmView(
            @ModelAttribute("searchVO") ComtnqustnrqesitmDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnqustnrqesitmVO", new ComtnqustnrqesitmVO());
        return "/comtnqustnrqesitm/ComtnqustnrqesitmRegister";
    }
    
    @RequestMapping("/comtnqustnrqesitm/addComtnqustnrqesitm.do")
    public String addComtnqustnrqesitm(
            ComtnqustnrqesitmVO comtnqustnrqesitmVO,
            @ModelAttribute("searchVO") ComtnqustnrqesitmDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnqustnrqesitmService.insertComtnqustnrqesitm(comtnqustnrqesitmVO);
        status.setComplete();
        return "forward:/comtnqustnrqesitm/ComtnqustnrqesitmList.do";
    }
    
    @RequestMapping("/comtnqustnrqesitm/updateComtnqustnrqesitmView.do")
    public String updateComtnqustnrqesitmView(
            @RequestParam("qestnrId") String qestnrId ,
            @RequestParam("qustnrQesitmId") String qustnrQesitmId ,
            @RequestParam("qustnrTmplatId") String qustnrTmplatId ,
            @ModelAttribute("searchVO") ComtnqustnrqesitmDefaultVO searchVO, Model model)
            throws Exception {
        ComtnqustnrqesitmVO comtnqustnrqesitmVO = new ComtnqustnrqesitmVO();
        comtnqustnrqesitmVO.setQestnrId(qestnrId);
        comtnqustnrqesitmVO.setQustnrQesitmId(qustnrQesitmId);
        comtnqustnrqesitmVO.setQustnrTmplatId(qustnrTmplatId);
;        
        // 변수명은 CoC 에 따라 comtnqustnrqesitmVO
        model.addAttribute(selectComtnqustnrqesitm(comtnqustnrqesitmVO, searchVO));
        return "/comtnqustnrqesitm/ComtnqustnrqesitmRegister";
    }

    @RequestMapping("/comtnqustnrqesitm/selectComtnqustnrqesitm.do")
    public @ModelAttribute("comtnqustnrqesitmVO")
    ComtnqustnrqesitmVO selectComtnqustnrqesitm(
            ComtnqustnrqesitmVO comtnqustnrqesitmVO,
            @ModelAttribute("searchVO") ComtnqustnrqesitmDefaultVO searchVO) throws Exception {
        return comtnqustnrqesitmService.selectComtnqustnrqesitm(comtnqustnrqesitmVO);
    }

    @RequestMapping("/comtnqustnrqesitm/updateComtnqustnrqesitm.do")
    public String updateComtnqustnrqesitm(
            ComtnqustnrqesitmVO comtnqustnrqesitmVO,
            @ModelAttribute("searchVO") ComtnqustnrqesitmDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnqustnrqesitmService.updateComtnqustnrqesitm(comtnqustnrqesitmVO);
        status.setComplete();
        return "forward:/comtnqustnrqesitm/ComtnqustnrqesitmList.do";
    }
    
    @RequestMapping("/comtnqustnrqesitm/deleteComtnqustnrqesitm.do")
    public String deleteComtnqustnrqesitm(
            ComtnqustnrqesitmVO comtnqustnrqesitmVO,
            @ModelAttribute("searchVO") ComtnqustnrqesitmDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnqustnrqesitmService.deleteComtnqustnrqesitm(comtnqustnrqesitmVO);
        status.setComplete();
        return "forward:/comtnqustnrqesitm/ComtnqustnrqesitmList.do";
    }

}
