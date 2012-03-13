package kr.godsoft.egovframe.generatorwebapp.comtncomment.web;

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

import kr.godsoft.egovframe.generatorwebapp.comtncomment.service.ComtncommentService;
import kr.godsoft.egovframe.generatorwebapp.comtncomment.service.ComtncommentDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtncomment.service.ComtncommentVO;

/**
 * @Class Name : ComtncommentController.java
 * @Description : Comtncomment Controller class
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
@SessionAttributes(types=ComtncommentVO.class)
public class ComtncommentController {

    @Resource(name = "comtncommentService")
    private ComtncommentService comtncommentService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * comtncomment 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ComtncommentDefaultVO
	 * @return "/comtncomment/ComtncommentList"
	 * @exception Exception
	 */
    @RequestMapping(value="/comtncomment/ComtncommentList.do")
    public String selectComtncommentList(@ModelAttribute("searchVO") ComtncommentDefaultVO searchVO, 
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
		
        List comtncommentList = comtncommentService.selectComtncommentList(searchVO);
        model.addAttribute("resultList", comtncommentList);
        
        int totCnt = comtncommentService.selectComtncommentListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/comtncomment/ComtncommentList";
    } 
    
    @RequestMapping("/comtncomment/addComtncommentView.do")
    public String addComtncommentView(
            @ModelAttribute("searchVO") ComtncommentDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("comtncommentVO", new ComtncommentVO());
        return "/comtncomment/ComtncommentRegister";
    }
    
    @RequestMapping("/comtncomment/addComtncomment.do")
    public String addComtncomment(
            ComtncommentVO comtncommentVO,
            @ModelAttribute("searchVO") ComtncommentDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtncommentService.insertComtncomment(comtncommentVO);
        status.setComplete();
        return "forward:/comtncomment/ComtncommentList.do";
    }
    
    @RequestMapping("/comtncomment/updateComtncommentView.do")
    public String updateComtncommentView(
            @RequestParam("nttId") int nttId ,
            @RequestParam("bbsId") String bbsId ,
            @RequestParam("answerNo") int answerNo ,
            @ModelAttribute("searchVO") ComtncommentDefaultVO searchVO, Model model)
            throws Exception {
        ComtncommentVO comtncommentVO = new ComtncommentVO();
        comtncommentVO.setNttId(nttId);
        comtncommentVO.setBbsId(bbsId);
        comtncommentVO.setAnswerNo(answerNo);
;        
        // 변수명은 CoC 에 따라 comtncommentVO
        model.addAttribute(selectComtncomment(comtncommentVO, searchVO));
        return "/comtncomment/ComtncommentRegister";
    }

    @RequestMapping("/comtncomment/selectComtncomment.do")
    public @ModelAttribute("comtncommentVO")
    ComtncommentVO selectComtncomment(
            ComtncommentVO comtncommentVO,
            @ModelAttribute("searchVO") ComtncommentDefaultVO searchVO) throws Exception {
        return comtncommentService.selectComtncomment(comtncommentVO);
    }

    @RequestMapping("/comtncomment/updateComtncomment.do")
    public String updateComtncomment(
            ComtncommentVO comtncommentVO,
            @ModelAttribute("searchVO") ComtncommentDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtncommentService.updateComtncomment(comtncommentVO);
        status.setComplete();
        return "forward:/comtncomment/ComtncommentList.do";
    }
    
    @RequestMapping("/comtncomment/deleteComtncomment.do")
    public String deleteComtncomment(
            ComtncommentVO comtncommentVO,
            @ModelAttribute("searchVO") ComtncommentDefaultVO searchVO, SessionStatus status)
            throws Exception {
        comtncommentService.deleteComtncomment(comtncommentVO);
        status.setComplete();
        return "forward:/comtncomment/ComtncommentList.do";
    }

}
