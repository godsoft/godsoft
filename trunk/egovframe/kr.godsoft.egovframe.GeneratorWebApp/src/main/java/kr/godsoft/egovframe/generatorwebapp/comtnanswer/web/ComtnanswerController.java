package kr.godsoft.egovframe.generatorwebapp.comtnanswer.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnanswer.service.ComtnanswerService;
import kr.godsoft.egovframe.generatorwebapp.comtnanswer.service.ComtnanswerDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnanswer.service.ComtnanswerVO;

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
 * @Class Name : ComtnanswerController.java
 * @Description : Comtnanswer Controller class
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
public class ComtnanswerController {

    @Resource(name = "comtnanswerService")
    private ComtnanswerService comtnanswerService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * COMTNANSWER 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtnanswerVO
	 * @return "/comtnanswer/ComtnanswerList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtnanswer/ComtnanswerList.do")
    public String selectComtnanswerList(@ModelAttribute("searchVO") ComtnanswerVO searchVO, 
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
		
        List<EgovMap> comtnanswerList = comtnanswerService.selectComtnanswerList(searchVO);
        model.addAttribute("resultList", comtnanswerList);
        
        int totCnt = comtnanswerService.selectComtnanswerListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtnanswer/ComtnanswerList";
    } 
    
    @RequestMapping("/comtnanswer/addComtnanswerView.do")
    public String addComtnanswerView(
            @ModelAttribute("searchVO") ComtnanswerDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtnanswerVO", new ComtnanswerVO());
        return "/comtnanswer/ComtnanswerRegister";
    }
    
    @RequestMapping("/comtnanswer/addComtnanswer.do")
    public String addComtnanswer(
            ComtnanswerVO comtnanswerVO,
            @ModelAttribute("searchVO") ComtnanswerDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnanswerService.insertComtnanswer(comtnanswerVO);
        status.setComplete();
        return "forward:/comtnanswer/ComtnanswerList.do";
    }
    
    @RequestMapping("/comtnanswer/updateComtnanswerView.do")
    public String updateComtnanswerView(
            @RequestParam("nttId") String nttId ,
            @RequestParam("bbsId") String bbsId ,
            @RequestParam("answerNo") String answerNo ,
            @ModelAttribute("searchVO") ComtnanswerDefaultVO searchVO, Model model)
            throws Exception {
        ComtnanswerVO comtnanswerVO = new ComtnanswerVO();
        comtnanswerVO.setNttId(nttId);
        comtnanswerVO.setBbsId(bbsId);
        comtnanswerVO.setAnswerNo(answerNo);
;        
        // 변수명은 CoC 에 따라 comtnanswerVO
        model.addAttribute(selectComtnanswer(comtnanswerVO, searchVO));
        return "/comtnanswer/ComtnanswerRegister";
    }

    @RequestMapping("/comtnanswer/selectComtnanswer.do")
    public @ModelAttribute("comtnanswerVO")
    ComtnanswerVO selectComtnanswer(
            ComtnanswerVO comtnanswerVO,
            @ModelAttribute("searchVO") ComtnanswerDefaultVO searchVO) throws Exception {
        return comtnanswerService.selectComtnanswer(comtnanswerVO);
    }

    @RequestMapping("/comtnanswer/updateComtnanswer.do")
    public String updateComtnanswer(
            ComtnanswerVO comtnanswerVO,
            @ModelAttribute("searchVO") ComtnanswerDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnanswerService.updateComtnanswer(comtnanswerVO);
        status.setComplete();
        return "forward:/comtnanswer/ComtnanswerList.do";
    }
    
    @RequestMapping("/comtnanswer/deleteComtnanswer.do")
    public String deleteComtnanswer(
            ComtnanswerVO comtnanswerVO,
            @ModelAttribute("searchVO") ComtnanswerDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtnanswerService.deleteComtnanswer(comtnanswerVO);
        status.setComplete();
        return "forward:/comtnanswer/ComtnanswerList.do";
    }

}
