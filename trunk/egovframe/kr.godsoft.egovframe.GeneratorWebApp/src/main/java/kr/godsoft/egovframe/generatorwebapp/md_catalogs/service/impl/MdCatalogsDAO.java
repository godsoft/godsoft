package kr.godsoft.egovframe.generatorwebapp.md_catalogs.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.md_catalogs.service.MdCatalogsVO;

/**
 * @Class Name : MdCatalogsDAO.java
 * @Description : MdCatalogs DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mdCatalogsDAO")
public class MdCatalogsDAO extends EgovAbstractDAO {

	/**
	 * MD_CATALOGS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdCatalogsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdCatalogs(MdCatalogsVO vo) throws Exception {
        return (String)insert("mdCatalogsDAO.insertMdCatalogs_S", vo);
    }

    /**
	 * MD_CATALOGS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdCatalogsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdCatalogs(MdCatalogsVO vo) throws Exception {
        update("mdCatalogsDAO.updateMdCatalogs_S", vo);
    }

    /**
	 * MD_CATALOGS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdCatalogsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdCatalogs(MdCatalogsVO vo) throws Exception {
        delete("mdCatalogsDAO.deleteMdCatalogs_S", vo);
    }

    /**
	 * MD_CATALOGS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdCatalogsVO
	 * @return 조회한 MD_CATALOGS
	 * @exception Exception
	 */
    public MdCatalogsVO selectMdCatalogs(MdCatalogsVO vo) throws Exception {
        return (MdCatalogsVO) selectByPk("mdCatalogsDAO.selectMdCatalogs_S", vo);
    }

    /**
	 * MD_CATALOGS 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_CATALOGS 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMdCatalogsList(MdCatalogsVO vo) throws Exception {
        return list("mdCatalogsDAO.selectMdCatalogsList_D", vo);
    }

    /**
	 * MD_CATALOGS 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_CATALOGS 총 갯수
	 * @exception
	 */
    public int selectMdCatalogsListTotCnt(MdCatalogsVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mdCatalogsDAO.selectMdCatalogsListTotCnt_S", vo);
    }

}
