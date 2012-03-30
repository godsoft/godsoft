package kr.godsoft.egovframe.generatorwebapp.mgv_all_catalogs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.mgv_all_catalogs.service.MgvAllCatalogsService;
import kr.godsoft.egovframe.generatorwebapp.mgv_all_catalogs.service.MgvAllCatalogsVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : MgvAllCatalogsServiceImpl.java
 * @Description : MgvAllCatalogs Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("mgvAllCatalogsService")
public class MgvAllCatalogsServiceImpl extends AbstractServiceImpl implements
        MgvAllCatalogsService {

    @Resource(name="mgvAllCatalogsDAO")
    private MgvAllCatalogsDAO mgvAllCatalogsDAO;
    
    /** ID Generation */
    //@Resource(name="{egovMgvAllCatalogsIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * MGV_ALL_CATALOGS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MgvAllCatalogsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMgvAllCatalogs(MgvAllCatalogsVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	mgvAllCatalogsDAO.insertMgvAllCatalogs(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * MGV_ALL_CATALOGS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MgvAllCatalogsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMgvAllCatalogs(MgvAllCatalogsVO vo) throws Exception {
        mgvAllCatalogsDAO.updateMgvAllCatalogs(vo);
    }

    /**
	 * MGV_ALL_CATALOGS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MgvAllCatalogsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMgvAllCatalogs(MgvAllCatalogsVO vo) throws Exception {
        mgvAllCatalogsDAO.deleteMgvAllCatalogs(vo);
    }

    /**
	 * MGV_ALL_CATALOGS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MgvAllCatalogsVO
	 * @return 조회한 MGV_ALL_CATALOGS
	 * @exception Exception
	 */
    public MgvAllCatalogsVO selectMgvAllCatalogs(MgvAllCatalogsVO vo) throws Exception {
        MgvAllCatalogsVO resultVO = mgvAllCatalogsDAO.selectMgvAllCatalogs(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * MGV_ALL_CATALOGS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MGV_ALL_CATALOGS 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectMgvAllCatalogsList(MgvAllCatalogsVO vo) throws Exception {
        return mgvAllCatalogsDAO.selectMgvAllCatalogsList(vo);
    }

    /**
	 * MGV_ALL_CATALOGS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MGV_ALL_CATALOGS 총 갯수
	 * @exception
	 */
    public int selectMgvAllCatalogsListTotCnt(MgvAllCatalogsVO vo) {
		return mgvAllCatalogsDAO.selectMgvAllCatalogsListTotCnt(vo);
	}
    
}
