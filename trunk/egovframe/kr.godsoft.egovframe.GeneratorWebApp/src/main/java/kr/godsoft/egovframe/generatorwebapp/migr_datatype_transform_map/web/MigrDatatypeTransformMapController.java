package kr.godsoft.egovframe.generatorwebapp.migr_datatype_transform_map.web;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.migr_datatype_transform_map.service.MigrDatatypeTransformMapService;
import kr.godsoft.egovframe.generatorwebapp.migr_datatype_transform_map.service.MigrDatatypeTransformMapDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.migr_datatype_transform_map.service.MigrDatatypeTransformMapVO;

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
 * @Class Name : MigrDatatypeTransformMapController.java
 * @Description : MigrDatatypeTransformMap Controller class
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
public class MigrDatatypeTransformMapController {

    @Resource(name = "migrDatatypeTransformMapService")
    private MigrDatatypeTransformMapService migrDatatypeTransformMapService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * MIGR_DATATYPE_TRANSFORM_MAP 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 MigrDatatypeTransformMapVO
	 * @return "/migrDatatypeTransformMap/MigrDatatypeTransformMapList"
	 * @exception Exception
	 */
    @RequestMapping(value="/migrDatatypeTransformMap/MigrDatatypeTransformMapList.do")
    public String selectMigrDatatypeTransformMapList(@ModelAttribute("searchVO") MigrDatatypeTransformMapVO searchVO, 
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
		
        List<EgovMap> migrDatatypeTransformMapList = migrDatatypeTransformMapService.selectMigrDatatypeTransformMapList(searchVO);
        model.addAttribute("resultList", migrDatatypeTransformMapList);
        
        int totCnt = migrDatatypeTransformMapService.selectMigrDatatypeTransformMapListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/migrDatatypeTransformMap/MigrDatatypeTransformMapList";
    } 
    
    @RequestMapping("/migrDatatypeTransformMap/addMigrDatatypeTransformMapView.do")
    public String addMigrDatatypeTransformMapView(
            @ModelAttribute("searchVO") MigrDatatypeTransformMapDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("migrDatatypeTransformMapVO", new MigrDatatypeTransformMapVO());
        return "/migrDatatypeTransformMap/MigrDatatypeTransformMapRegister";
    }
    
    @RequestMapping("/migrDatatypeTransformMap/addMigrDatatypeTransformMap.do")
    public String addMigrDatatypeTransformMap(
            MigrDatatypeTransformMapVO migrDatatypeTransformMapVO,
            @ModelAttribute("searchVO") MigrDatatypeTransformMapDefaultVO searchVO, SessionStatus status)
            throws Exception {
        migrDatatypeTransformMapService.insertMigrDatatypeTransformMap(migrDatatypeTransformMapVO);
        status.setComplete();
        return "forward:/migrDatatypeTransformMap/MigrDatatypeTransformMapList.do";
    }
    
    @RequestMapping("/migrDatatypeTransformMap/updateMigrDatatypeTransformMapView.do")
    public String updateMigrDatatypeTransformMapView(
            @RequestParam("id") String id ,
            @ModelAttribute("searchVO") MigrDatatypeTransformMapDefaultVO searchVO, Model model)
            throws Exception {
        MigrDatatypeTransformMapVO migrDatatypeTransformMapVO = new MigrDatatypeTransformMapVO();
        migrDatatypeTransformMapVO.setId(id);
;        
        // 변수명은 CoC 에 따라 migrDatatypeTransformMapVO
        model.addAttribute(selectMigrDatatypeTransformMap(migrDatatypeTransformMapVO, searchVO));
        return "/migrDatatypeTransformMap/MigrDatatypeTransformMapRegister";
    }

    @RequestMapping("/migrDatatypeTransformMap/selectMigrDatatypeTransformMap.do")
    public @ModelAttribute("migrDatatypeTransformMapVO")
    MigrDatatypeTransformMapVO selectMigrDatatypeTransformMap(
            MigrDatatypeTransformMapVO migrDatatypeTransformMapVO,
            @ModelAttribute("searchVO") MigrDatatypeTransformMapDefaultVO searchVO) throws Exception {
        return migrDatatypeTransformMapService.selectMigrDatatypeTransformMap(migrDatatypeTransformMapVO);
    }

    @RequestMapping("/migrDatatypeTransformMap/updateMigrDatatypeTransformMap.do")
    public String updateMigrDatatypeTransformMap(
            MigrDatatypeTransformMapVO migrDatatypeTransformMapVO,
            @ModelAttribute("searchVO") MigrDatatypeTransformMapDefaultVO searchVO, SessionStatus status)
            throws Exception {
        migrDatatypeTransformMapService.updateMigrDatatypeTransformMap(migrDatatypeTransformMapVO);
        status.setComplete();
        return "forward:/migrDatatypeTransformMap/MigrDatatypeTransformMapList.do";
    }
    
    @RequestMapping("/migrDatatypeTransformMap/deleteMigrDatatypeTransformMap.do")
    public String deleteMigrDatatypeTransformMap(
            MigrDatatypeTransformMapVO migrDatatypeTransformMapVO,
            @ModelAttribute("searchVO") MigrDatatypeTransformMapDefaultVO searchVO, SessionStatus status)
            throws Exception {
        migrDatatypeTransformMapService.deleteMigrDatatypeTransformMap(migrDatatypeTransformMapVO);
        status.setComplete();
        return "forward:/migrDatatypeTransformMap/MigrDatatypeTransformMapList.do";
    }

}
