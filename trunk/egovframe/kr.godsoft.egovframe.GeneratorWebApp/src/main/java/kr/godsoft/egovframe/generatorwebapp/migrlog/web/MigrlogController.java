package kr.godsoft.egovframe.generatorwebapp.migrlog.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.migrlog.service.MigrlogService;
import kr.godsoft.egovframe.generatorwebapp.migrlog.service.MigrlogDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.migrlog.service.MigrlogVO;

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
 * @Class Name : MigrlogController.java
 * @Description : Migrlog Controller class
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
public class MigrlogController {

    @Resource(name = "migrlogService")
    private MigrlogService migrlogService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MIGRLOG 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MigrlogVO
	 * @return "/migrlog/MigrlogList"
	 * @exception Exception
	 */
    @RequestMapping(value="/migrlog/MigrlogList.do")
    public String selectMigrlogList(@ModelAttribute("searchVO") MigrlogVO searchVO, 
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
		
        List<EgovMap> migrlogList = migrlogService.selectMigrlogList(searchVO);
        model.addAttribute("resultList", migrlogList);
        
        int totCnt = migrlogService.selectMigrlogListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/migrlog/MigrlogList";
    } 
    
    @RequestMapping("/migrlog/addMigrlogView.do")
    public String addMigrlogView(
            @ModelAttribute("searchVO") MigrlogDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("migrlogVO", new MigrlogVO());
        return "/migrlog/MigrlogRegister";
    }
    
    @RequestMapping("/migrlog/addMigrlog.do")
    public String addMigrlog(
            MigrlogVO migrlogVO,
            @ModelAttribute("searchVO") MigrlogDefaultVO searchVO, SessionStatus status)
            throws Exception {
        migrlogService.insertMigrlog(migrlogVO);
        status.setComplete();
        return "forward:/migrlog/MigrlogList.do";
    }
    
    @RequestMapping("/migrlog/updateMigrlogView.do")
    public String updateMigrlogView(
            @RequestParam("id") String id ,
            @ModelAttribute("searchVO") MigrlogDefaultVO searchVO, Model model)
            throws Exception {
        MigrlogVO migrlogVO = new MigrlogVO();
        migrlogVO.setId(id);
;        
        // 변수명은 CoC 에 따라 migrlogVO
        model.addAttribute(selectMigrlog(migrlogVO, searchVO));
        return "/migrlog/MigrlogRegister";
    }

    @RequestMapping("/migrlog/selectMigrlog.do")
    public @ModelAttribute("migrlogVO")
    MigrlogVO selectMigrlog(
            MigrlogVO migrlogVO,
            @ModelAttribute("searchVO") MigrlogDefaultVO searchVO) throws Exception {
        return migrlogService.selectMigrlog(migrlogVO);
    }

    @RequestMapping("/migrlog/updateMigrlog.do")
    public String updateMigrlog(
            MigrlogVO migrlogVO,
            @ModelAttribute("searchVO") MigrlogDefaultVO searchVO, SessionStatus status)
            throws Exception {
        migrlogService.updateMigrlog(migrlogVO);
        status.setComplete();
        return "forward:/migrlog/MigrlogList.do";
    }
    
    @RequestMapping("/migrlog/deleteMigrlog.do")
    public String deleteMigrlog(
            MigrlogVO migrlogVO,
            @ModelAttribute("searchVO") MigrlogDefaultVO searchVO, SessionStatus status)
            throws Exception {
        migrlogService.deleteMigrlog(migrlogVO);
        status.setComplete();
        return "forward:/migrlog/MigrlogList.do";
    }

}
