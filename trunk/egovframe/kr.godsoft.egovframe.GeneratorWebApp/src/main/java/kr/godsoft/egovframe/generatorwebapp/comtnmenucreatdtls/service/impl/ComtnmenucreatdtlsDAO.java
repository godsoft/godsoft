package kr.godsoft.egovframe.generatorwebapp.comtnmenucreatdtls.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnmenucreatdtls.service.ComtnmenucreatdtlsVO;

/**
 * @Class Name : ComtnmenucreatdtlsDAO.java
 * @Description : Comtnmenucreatdtls DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnmenucreatdtlsDAO")
public class ComtnmenucreatdtlsDAO extends EgovAbstractDAO {

	/**
	 * COMTNMENUCREATDTLS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnmenucreatdtlsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnmenucreatdtls(ComtnmenucreatdtlsVO vo) throws Exception {
        return (String)insert("comtnmenucreatdtlsDAO.insertComtnmenucreatdtls_S", vo);
    }

    /**
	 * COMTNMENUCREATDTLS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnmenucreatdtlsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnmenucreatdtls(ComtnmenucreatdtlsVO vo) throws Exception {
        update("comtnmenucreatdtlsDAO.updateComtnmenucreatdtls_S", vo);
    }

    /**
	 * COMTNMENUCREATDTLS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnmenucreatdtlsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnmenucreatdtls(ComtnmenucreatdtlsVO vo) throws Exception {
        delete("comtnmenucreatdtlsDAO.deleteComtnmenucreatdtls_S", vo);
    }

    /**
	 * COMTNMENUCREATDTLS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnmenucreatdtlsVO
	 * @return 조회한 COMTNMENUCREATDTLS
	 * @exception Exception
	 */
    public ComtnmenucreatdtlsVO selectComtnmenucreatdtls(ComtnmenucreatdtlsVO vo) throws Exception {
        return (ComtnmenucreatdtlsVO) selectByPk("comtnmenucreatdtlsDAO.selectComtnmenucreatdtls_S", vo);
    }

    /**
	 * COMTNMENUCREATDTLS 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNMENUCREATDTLS 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnmenucreatdtlsList(ComtnmenucreatdtlsVO vo) throws Exception {
        return list("comtnmenucreatdtlsDAO.selectComtnmenucreatdtlsList_D", vo);
    }

    /**
	 * COMTNMENUCREATDTLS 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNMENUCREATDTLS 총 갯수
	 * @exception
	 */
    public int selectComtnmenucreatdtlsListTotCnt(ComtnmenucreatdtlsVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnmenucreatdtlsDAO.selectComtnmenucreatdtlsListTotCnt_S", vo);
    }

}
