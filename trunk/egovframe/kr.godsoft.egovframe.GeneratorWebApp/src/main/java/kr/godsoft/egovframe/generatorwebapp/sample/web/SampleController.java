package kr.godsoft.egovframe.generatorwebapp.sample.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.sample.service.SampleService;
import kr.godsoft.egovframe.generatorwebapp.sample.service.SampleDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.sample.service.SampleVO;

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
 * @Class Name : SampleController.java
 * @Description : Sample Controller class
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
@SessionAttributes(types=SampleVO.class)
public class SampleController {

    @Resource(name = "sampleService")
    private SampleService sampleService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * sample 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 SampleVO
	 * @return "/sample/SampleList"
	 * @exception Exception
	 */
    @RequestMapping(value="/sample/SampleList.do")
    public String selectSampleList(@ModelAttribute("searchVO") SampleVO searchVO, 
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
		
        List<EgovMap> sampleList = sampleService.selectSampleList(searchVO);
        model.addAttribute("resultList", sampleList);
        
        int totCnt = sampleService.selectSampleListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/sample/SampleList";
    } 
    
    @RequestMapping("/sample/addSampleView.do")
    public String addSampleView(
            @ModelAttribute("searchVO") SampleDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("sampleVO", new SampleVO());
        return "/sample/SampleRegister";
    }
    
    @RequestMapping("/sample/addSample.do")
    public String addSample(
            SampleVO sampleVO,
            @ModelAttribute("searchVO") SampleDefaultVO searchVO, SessionStatus status)
            throws Exception {
        sampleService.insertSample(sampleVO);
        status.setComplete();
        return "forward:/sample/SampleList.do";
    }
    
    @RequestMapping("/sample/updateSampleView.do")
    public String updateSampleView(
            @RequestParam("id") String id ,
            @ModelAttribute("searchVO") SampleDefaultVO searchVO, Model model)
            throws Exception {
        SampleVO sampleVO = new SampleVO();
        sampleVO.setId(id);
;        
        // 변수명은 CoC 에 따라 sampleVO
        model.addAttribute(selectSample(sampleVO, searchVO));
        return "/sample/SampleRegister";
    }

    @RequestMapping("/sample/selectSample.do")
    public @ModelAttribute("sampleVO")
    SampleVO selectSample(
            SampleVO sampleVO,
            @ModelAttribute("searchVO") SampleDefaultVO searchVO) throws Exception {
        return sampleService.selectSample(sampleVO);
    }

    @RequestMapping("/sample/updateSample.do")
    public String updateSample(
            SampleVO sampleVO,
            @ModelAttribute("searchVO") SampleDefaultVO searchVO, SessionStatus status)
            throws Exception {
        sampleService.updateSample(sampleVO);
        status.setComplete();
        return "forward:/sample/SampleList.do";
    }
    
    @RequestMapping("/sample/deleteSample.do")
    public String deleteSample(
            SampleVO sampleVO,
            @ModelAttribute("searchVO") SampleDefaultVO searchVO, SessionStatus status)
            throws Exception {
        sampleService.deleteSample(sampleVO);
        status.setComplete();
        return "forward:/sample/SampleList.do";
    }

}
