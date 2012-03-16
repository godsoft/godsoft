package kr.godsoft.egovframe.generatorwebapp.imgtemp.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.imgtemp.service.ImgtempService;
import kr.godsoft.egovframe.generatorwebapp.imgtemp.service.ImgtempDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.imgtemp.service.ImgtempVO;

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
 * @Class Name : ImgtempController.java
 * @Description : Imgtemp Controller class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Controller
@SessionAttributes(types=ImgtempVO.class)
public class ImgtempController {

    @Resource(name = "imgtempService")
    private ImgtempService imgtempService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * imgtemp 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 ImgtempVO
	 * @return "/imgtemp/ImgtempList"
	 * @exception Exception
	 */
    @RequestMapping(value="/imgtemp/ImgtempList.do")
    public String selectImgtempList(@ModelAttribute("searchVO") ImgtempVO searchVO, 
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
		
        List<EgovMap> imgtempList = imgtempService.selectImgtempList(searchVO);
        model.addAttribute("resultList", imgtempList);
        
        int totCnt = imgtempService.selectImgtempListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/imgtemp/ImgtempList";
    } 
    
    @RequestMapping("/imgtemp/addImgtempView.do")
    public String addImgtempView(
            @ModelAttribute("searchVO") ImgtempDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("imgtempVO", new ImgtempVO());
        return "/imgtemp/ImgtempRegister";
    }
    
    @RequestMapping("/imgtemp/addImgtemp.do")
    public String addImgtemp(
            ImgtempVO imgtempVO,
            @ModelAttribute("searchVO") ImgtempDefaultVO searchVO, SessionStatus status)
            throws Exception {
        imgtempService.insertImgtemp(imgtempVO);
        status.setComplete();
        return "forward:/imgtemp/ImgtempList.do";
    }
    
    @RequestMapping("/imgtemp/updateImgtempView.do")
    public String updateImgtempView(
            @RequestParam("orgnztCode") String orgnztCode ,
            @RequestParam("erncslSe") String erncslSe ,
            @ModelAttribute("searchVO") ImgtempDefaultVO searchVO, Model model)
            throws Exception {
        ImgtempVO imgtempVO = new ImgtempVO();
        imgtempVO.setOrgnztCode(orgnztCode);
        imgtempVO.setErncslSe(erncslSe);
;        
        // 변수명은 CoC 에 따라 imgtempVO
        model.addAttribute(selectImgtemp(imgtempVO, searchVO));
        return "/imgtemp/ImgtempRegister";
    }

    @RequestMapping("/imgtemp/selectImgtemp.do")
    public @ModelAttribute("imgtempVO")
    ImgtempVO selectImgtemp(
            ImgtempVO imgtempVO,
            @ModelAttribute("searchVO") ImgtempDefaultVO searchVO) throws Exception {
        return imgtempService.selectImgtemp(imgtempVO);
    }

    @RequestMapping("/imgtemp/updateImgtemp.do")
    public String updateImgtemp(
            ImgtempVO imgtempVO,
            @ModelAttribute("searchVO") ImgtempDefaultVO searchVO, SessionStatus status)
            throws Exception {
        imgtempService.updateImgtemp(imgtempVO);
        status.setComplete();
        return "forward:/imgtemp/ImgtempList.do";
    }
    
    @RequestMapping("/imgtemp/deleteImgtemp.do")
    public String deleteImgtemp(
            ImgtempVO imgtempVO,
            @ModelAttribute("searchVO") ImgtempDefaultVO searchVO, SessionStatus status)
            throws Exception {
        imgtempService.deleteImgtemp(imgtempVO);
        status.setComplete();
        return "forward:/imgtemp/ImgtempList.do";
    }

}
