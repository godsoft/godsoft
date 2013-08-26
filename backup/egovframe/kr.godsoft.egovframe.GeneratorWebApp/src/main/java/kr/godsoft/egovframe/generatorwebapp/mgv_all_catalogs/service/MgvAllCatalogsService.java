package kr.godsoft.egovframe.generatorwebapp.mgv_all_catalogs.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MgvAllCatalogsService.java
 * @Description : MgvAllCatalogs Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MgvAllCatalogsService {
	
	/**
	 * MGV_ALL_CATALOGS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MgvAllCatalogsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMgvAllCatalogs(MgvAllCatalogsVO vo) throws Exception;
    
    /**
	 * MGV_ALL_CATALOGS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MgvAllCatalogsVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMgvAllCatalogs(MgvAllCatalogsVO vo) throws Exception;
    
    /**
	 * MGV_ALL_CATALOGS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MgvAllCatalogsVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMgvAllCatalogs(MgvAllCatalogsVO vo) throws Exception;
    
    /**
	 * MGV_ALL_CATALOGS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MgvAllCatalogsVO
	 * @return 조회한 MGV_ALL_CATALOGS
	 * @exception Exception
	 */
    MgvAllCatalogsVO selectMgvAllCatalogs(MgvAllCatalogsVO vo) throws Exception;
    
    /**
	 * MGV_ALL_CATALOGS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MGV_ALL_CATALOGS 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMgvAllCatalogsList(MgvAllCatalogsVO vo) throws Exception;
    
    /**
	 * MGV_ALL_CATALOGS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MGV_ALL_CATALOGS 총 갯수
	 * @exception
	 */
    int selectMgvAllCatalogsListTotCnt(MgvAllCatalogsVO vo);
    
}
