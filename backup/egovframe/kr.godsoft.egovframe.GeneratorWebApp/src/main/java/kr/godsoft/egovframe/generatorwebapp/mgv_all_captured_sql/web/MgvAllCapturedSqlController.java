package kr.godsoft.egovframe.generatorwebapp.mgv_all_captured_sql.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.mgv_all_captured_sql.service.MgvAllCapturedSqlService;
import kr.godsoft.egovframe.generatorwebapp.mgv_all_captured_sql.service.MgvAllCapturedSqlDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.mgv_all_captured_sql.service.MgvAllCapturedSqlVO;

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
 * @Class Name : MgvAllCapturedSqlController.java
 * @Description : MgvAllCapturedSql Controller class
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
public class MgvAllCapturedSqlController {

    @Resource(name = "mgvAllCapturedSqlService")
    private MgvAllCapturedSqlService mgvAllCapturedSqlService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MGV_ALL_CAPTURED_SQL 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MgvAllCapturedSqlVO
	 * @return "/mgvAllCapturedSql/MgvAllCapturedSqlList"
	 * @exception Exception
	 */
    @RequestMapping(value="/mgvAllCapturedSql/MgvAllCapturedSqlList.do")
    public String selectMgvAllCapturedSqlList(@ModelAttribute("searchVO") MgvAllCapturedSqlVO searchVO, 
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
		
        List<EgovMap> mgvAllCapturedSqlList = mgvAllCapturedSqlService.selectMgvAllCapturedSqlList(searchVO);
        model.addAttribute("resultList", mgvAllCapturedSqlList);
        
        int totCnt = mgvAllCapturedSqlService.selectMgvAllCapturedSqlListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/mgvAllCapturedSql/MgvAllCapturedSqlList";
    } 
    
    @RequestMapping("/mgvAllCapturedSql/addMgvAllCapturedSqlView.do")
    public String addMgvAllCapturedSqlView(
            @ModelAttribute("searchVO") MgvAllCapturedSqlDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("mgvAllCapturedSqlVO", new MgvAllCapturedSqlVO());
        return "/mgvAllCapturedSql/MgvAllCapturedSqlRegister";
    }
    
    @RequestMapping("/mgvAllCapturedSql/addMgvAllCapturedSql.do")
    public String addMgvAllCapturedSql(
            MgvAllCapturedSqlVO mgvAllCapturedSqlVO,
            @ModelAttribute("searchVO") MgvAllCapturedSqlDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mgvAllCapturedSqlService.insertMgvAllCapturedSql(mgvAllCapturedSqlVO);
        status.setComplete();
        return "forward:/mgvAllCapturedSql/MgvAllCapturedSqlList.do";
    }
    
    @RequestMapping("/mgvAllCapturedSql/updateMgvAllCapturedSqlView.do")
    public String updateMgvAllCapturedSqlView(
            @ModelAttribute("searchVO") MgvAllCapturedSqlDefaultVO searchVO, Model model)
            throws Exception {
        MgvAllCapturedSqlVO mgvAllCapturedSqlVO = new MgvAllCapturedSqlVO();
;        
        // 변수명은 CoC 에 따라 mgvAllCapturedSqlVO
        model.addAttribute(selectMgvAllCapturedSql(mgvAllCapturedSqlVO, searchVO));
        return "/mgvAllCapturedSql/MgvAllCapturedSqlRegister";
    }

    @RequestMapping("/mgvAllCapturedSql/selectMgvAllCapturedSql.do")
    public @ModelAttribute("mgvAllCapturedSqlVO")
    MgvAllCapturedSqlVO selectMgvAllCapturedSql(
            MgvAllCapturedSqlVO mgvAllCapturedSqlVO,
            @ModelAttribute("searchVO") MgvAllCapturedSqlDefaultVO searchVO) throws Exception {
        return mgvAllCapturedSqlService.selectMgvAllCapturedSql(mgvAllCapturedSqlVO);
    }

    @RequestMapping("/mgvAllCapturedSql/updateMgvAllCapturedSql.do")
    public String updateMgvAllCapturedSql(
            MgvAllCapturedSqlVO mgvAllCapturedSqlVO,
            @ModelAttribute("searchVO") MgvAllCapturedSqlDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mgvAllCapturedSqlService.updateMgvAllCapturedSql(mgvAllCapturedSqlVO);
        status.setComplete();
        return "forward:/mgvAllCapturedSql/MgvAllCapturedSqlList.do";
    }
    
    @RequestMapping("/mgvAllCapturedSql/deleteMgvAllCapturedSql.do")
    public String deleteMgvAllCapturedSql(
            MgvAllCapturedSqlVO mgvAllCapturedSqlVO,
            @ModelAttribute("searchVO") MgvAllCapturedSqlDefaultVO searchVO, SessionStatus status)
            throws Exception {
        mgvAllCapturedSqlService.deleteMgvAllCapturedSql(mgvAllCapturedSqlVO);
        status.setComplete();
        return "forward:/mgvAllCapturedSql/MgvAllCapturedSqlList.do";
    }

}
