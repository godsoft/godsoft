package kr.godsoft.egovframe.generatorwebapp.mgv_all_catalogs.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.mgv_all_catalogs.service.MgvAllCatalogsVO;

/**
 * @Class Name : MgvAllCatalogsDAO.java
 * @Description : MgvAllCatalogs DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mgvAllCatalogsDAO")
public class MgvAllCatalogsDAO extends EgovAbstractDAO {

	/**
	 * MGV_ALL_CATALOGS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MgvAllCatalogsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMgvAllCatalogs(MgvAllCatalogsVO vo) throws Exception {
        return (String)insert("mgvAllCatalogsDAO.insertMgvAllCatalogs_S", vo);
    }

    /**
	 * MGV_ALL_CATALOGS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MgvAllCatalogsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMgvAllCatalogs(MgvAllCatalogsVO vo) throws Exception {
        update("mgvAllCatalogsDAO.updateMgvAllCatalogs_S", vo);
    }

    /**
	 * MGV_ALL_CATALOGS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MgvAllCatalogsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMgvAllCatalogs(MgvAllCatalogsVO vo) throws Exception {
        delete("mgvAllCatalogsDAO.deleteMgvAllCatalogs_S", vo);
    }

    /**
	 * MGV_ALL_CATALOGS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MgvAllCatalogsVO
	 * @return 조회한 MGV_ALL_CATALOGS
	 * @exception Exception
	 */
    public MgvAllCatalogsVO selectMgvAllCatalogs(MgvAllCatalogsVO vo) throws Exception {
        return (MgvAllCatalogsVO) selectByPk("mgvAllCatalogsDAO.selectMgvAllCatalogs_S", vo);
    }

    /**
	 * MGV_ALL_CATALOGS 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MGV_ALL_CATALOGS 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMgvAllCatalogsList(MgvAllCatalogsVO vo) throws Exception {
        return list("mgvAllCatalogsDAO.selectMgvAllCatalogsList_D", vo);
    }

    /**
	 * MGV_ALL_CATALOGS 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MGV_ALL_CATALOGS 총 갯수
	 * @exception
	 */
    public int selectMgvAllCatalogsListTotCnt(MgvAllCatalogsVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mgvAllCatalogsDAO.selectMgvAllCatalogsListTotCnt_S", vo);
    }

}
