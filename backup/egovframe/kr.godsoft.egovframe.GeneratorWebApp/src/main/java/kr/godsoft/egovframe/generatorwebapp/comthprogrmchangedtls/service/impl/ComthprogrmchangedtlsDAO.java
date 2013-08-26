package kr.godsoft.egovframe.generatorwebapp.comthprogrmchangedtls.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comthprogrmchangedtls.service.ComthprogrmchangedtlsVO;

/**
 * @Class Name : ComthprogrmchangedtlsDAO.java
 * @Description : Comthprogrmchangedtls DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comthprogrmchangedtlsDAO")
public class ComthprogrmchangedtlsDAO extends EgovAbstractDAO {

	/**
	 * COMTHPROGRMCHANGEDTLS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComthprogrmchangedtlsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComthprogrmchangedtls(ComthprogrmchangedtlsVO vo) throws Exception {
        return (String)insert("comthprogrmchangedtlsDAO.insertComthprogrmchangedtls_S", vo);
    }

    /**
	 * COMTHPROGRMCHANGEDTLS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComthprogrmchangedtlsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComthprogrmchangedtls(ComthprogrmchangedtlsVO vo) throws Exception {
        update("comthprogrmchangedtlsDAO.updateComthprogrmchangedtls_S", vo);
    }

    /**
	 * COMTHPROGRMCHANGEDTLS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComthprogrmchangedtlsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComthprogrmchangedtls(ComthprogrmchangedtlsVO vo) throws Exception {
        delete("comthprogrmchangedtlsDAO.deleteComthprogrmchangedtls_S", vo);
    }

    /**
	 * COMTHPROGRMCHANGEDTLS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComthprogrmchangedtlsVO
	 * @return 조회한 COMTHPROGRMCHANGEDTLS
	 * @exception Exception
	 */
    public ComthprogrmchangedtlsVO selectComthprogrmchangedtls(ComthprogrmchangedtlsVO vo) throws Exception {
        return (ComthprogrmchangedtlsVO) selectByPk("comthprogrmchangedtlsDAO.selectComthprogrmchangedtls_S", vo);
    }

    /**
	 * COMTHPROGRMCHANGEDTLS 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTHPROGRMCHANGEDTLS 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComthprogrmchangedtlsList(ComthprogrmchangedtlsVO vo) throws Exception {
        return list("comthprogrmchangedtlsDAO.selectComthprogrmchangedtlsList_D", vo);
    }

    /**
	 * COMTHPROGRMCHANGEDTLS 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTHPROGRMCHANGEDTLS 총 갯수
	 * @exception
	 */
    public int selectComthprogrmchangedtlsListTotCnt(ComthprogrmchangedtlsVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comthprogrmchangedtlsDAO.selectComthprogrmchangedtlsListTotCnt_S", vo);
    }

}
