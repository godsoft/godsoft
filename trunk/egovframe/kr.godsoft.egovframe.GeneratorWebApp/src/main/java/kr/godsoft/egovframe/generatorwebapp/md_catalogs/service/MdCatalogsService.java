package kr.godsoft.egovframe.generatorwebapp.md_catalogs.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MdCatalogsService.java
 * @Description : MdCatalogs Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MdCatalogsService {
	
	/**
	 * MD_CATALOGS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdCatalogsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMdCatalogs(MdCatalogsVO vo) throws Exception;
    
    /**
	 * MD_CATALOGS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdCatalogsVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMdCatalogs(MdCatalogsVO vo) throws Exception;
    
    /**
	 * MD_CATALOGS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdCatalogsVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMdCatalogs(MdCatalogsVO vo) throws Exception;
    
    /**
	 * MD_CATALOGS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdCatalogsVO
	 * @return 조회한 MD_CATALOGS
	 * @exception Exception
	 */
    MdCatalogsVO selectMdCatalogs(MdCatalogsVO vo) throws Exception;
    
    /**
	 * MD_CATALOGS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_CATALOGS 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMdCatalogsList(MdCatalogsVO vo) throws Exception;
    
    /**
	 * MD_CATALOGS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_CATALOGS 총 갯수
	 * @exception
	 */
    int selectMdCatalogsListTotCnt(MdCatalogsVO vo);
    
}
