package kr.godsoft.egovframe.generatorwebapp.migr_generation_order.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.migr_generation_order.service.MigrGenerationOrderService;
import kr.godsoft.egovframe.generatorwebapp.migr_generation_order.service.MigrGenerationOrderDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.migr_generation_order.service.MigrGenerationOrderVO;

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
 * @Class Name : MigrGenerationOrderController.java
 * @Description : MigrGenerationOrder Controller class
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
public class MigrGenerationOrderController {

    @Resource(name = "migrGenerationOrderService")
    private MigrGenerationOrderService migrGenerationOrderService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MIGR_GENERATION_ORDER 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MigrGenerationOrderVO
	 * @return "/migrGenerationOrder/MigrGenerationOrderList"
	 * @exception Exception
	 */
    @RequestMapping(value="/migrGenerationOrder/MigrGenerationOrderList.do")
    public String selectMigrGenerationOrderList(@ModelAttribute("searchVO") MigrGenerationOrderVO searchVO, 
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
		
        List<EgovMap> migrGenerationOrderList = migrGenerationOrderService.selectMigrGenerationOrderList(searchVO);
        model.addAttribute("resultList", migrGenerationOrderList);
        
        int totCnt = migrGenerationOrderService.selectMigrGenerationOrderListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/migrGenerationOrder/MigrGenerationOrderList";
    } 
    
    @RequestMapping("/migrGenerationOrder/addMigrGenerationOrderView.do")
    public String addMigrGenerationOrderView(
            @ModelAttribute("searchVO") MigrGenerationOrderDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("migrGenerationOrderVO", new MigrGenerationOrderVO());
        return "/migrGenerationOrder/MigrGenerationOrderRegister";
    }
    
    @RequestMapping("/migrGenerationOrder/addMigrGenerationOrder.do")
    public String addMigrGenerationOrder(
            MigrGenerationOrderVO migrGenerationOrderVO,
            @ModelAttribute("searchVO") MigrGenerationOrderDefaultVO searchVO, SessionStatus status)
            throws Exception {
        migrGenerationOrderService.insertMigrGenerationOrder(migrGenerationOrderVO);
        status.setComplete();
        return "forward:/migrGenerationOrder/MigrGenerationOrderList.do";
    }
    
    @RequestMapping("/migrGenerationOrder/updateMigrGenerationOrderView.do")
    public String updateMigrGenerationOrderView(
            @RequestParam("id") String id ,
            @ModelAttribute("searchVO") MigrGenerationOrderDefaultVO searchVO, Model model)
            throws Exception {
        MigrGenerationOrderVO migrGenerationOrderVO = new MigrGenerationOrderVO();
        migrGenerationOrderVO.setId(id);
;        
        // 변수명은 CoC 에 따라 migrGenerationOrderVO
        model.addAttribute(selectMigrGenerationOrder(migrGenerationOrderVO, searchVO));
        return "/migrGenerationOrder/MigrGenerationOrderRegister";
    }

    @RequestMapping("/migrGenerationOrder/selectMigrGenerationOrder.do")
    public @ModelAttribute("migrGenerationOrderVO")
    MigrGenerationOrderVO selectMigrGenerationOrder(
            MigrGenerationOrderVO migrGenerationOrderVO,
            @ModelAttribute("searchVO") MigrGenerationOrderDefaultVO searchVO) throws Exception {
        return migrGenerationOrderService.selectMigrGenerationOrder(migrGenerationOrderVO);
    }

    @RequestMapping("/migrGenerationOrder/updateMigrGenerationOrder.do")
    public String updateMigrGenerationOrder(
            MigrGenerationOrderVO migrGenerationOrderVO,
            @ModelAttribute("searchVO") MigrGenerationOrderDefaultVO searchVO, SessionStatus status)
            throws Exception {
        migrGenerationOrderService.updateMigrGenerationOrder(migrGenerationOrderVO);
        status.setComplete();
        return "forward:/migrGenerationOrder/MigrGenerationOrderList.do";
    }
    
    @RequestMapping("/migrGenerationOrder/deleteMigrGenerationOrder.do")
    public String deleteMigrGenerationOrder(
            MigrGenerationOrderVO migrGenerationOrderVO,
            @ModelAttribute("searchVO") MigrGenerationOrderDefaultVO searchVO, SessionStatus status)
            throws Exception {
        migrGenerationOrderService.deleteMigrGenerationOrder(migrGenerationOrderVO);
        status.setComplete();
        return "forward:/migrGenerationOrder/MigrGenerationOrderList.do";
    }

}
