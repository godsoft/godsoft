package kr.godsoft.egovframe.generatorwebapp.comthemplyrinfochangedtls.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comthemplyrinfochangedtls.service.ComthemplyrinfochangedtlsVO;

/**
 * @Class Name : ComthemplyrinfochangedtlsDAO.java
 * @Description : Comthemplyrinfochangedtls DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comthemplyrinfochangedtlsDAO")
public class ComthemplyrinfochangedtlsDAO extends EgovAbstractDAO {

	/**
	 * COMTHEMPLYRINFOCHANGEDTLS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComthemplyrinfochangedtlsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComthemplyrinfochangedtls(ComthemplyrinfochangedtlsVO vo) throws Exception {
        return (String)insert("comthemplyrinfochangedtlsDAO.insertComthemplyrinfochangedtls_S", vo);
    }

    /**
	 * COMTHEMPLYRINFOCHANGEDTLS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComthemplyrinfochangedtlsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComthemplyrinfochangedtls(ComthemplyrinfochangedtlsVO vo) throws Exception {
        update("comthemplyrinfochangedtlsDAO.updateComthemplyrinfochangedtls_S", vo);
    }

    /**
	 * COMTHEMPLYRINFOCHANGEDTLS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComthemplyrinfochangedtlsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComthemplyrinfochangedtls(ComthemplyrinfochangedtlsVO vo) throws Exception {
        delete("comthemplyrinfochangedtlsDAO.deleteComthemplyrinfochangedtls_S", vo);
    }

    /**
	 * COMTHEMPLYRINFOCHANGEDTLS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComthemplyrinfochangedtlsVO
	 * @return 조회한 COMTHEMPLYRINFOCHANGEDTLS
	 * @exception Exception
	 */
    public ComthemplyrinfochangedtlsVO selectComthemplyrinfochangedtls(ComthemplyrinfochangedtlsVO vo) throws Exception {
        return (ComthemplyrinfochangedtlsVO) selectByPk("comthemplyrinfochangedtlsDAO.selectComthemplyrinfochangedtls_S", vo);
    }

    /**
	 * COMTHEMPLYRINFOCHANGEDTLS 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTHEMPLYRINFOCHANGEDTLS 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComthemplyrinfochangedtlsList(ComthemplyrinfochangedtlsVO vo) throws Exception {
        return list("comthemplyrinfochangedtlsDAO.selectComthemplyrinfochangedtlsList_D", vo);
    }

    /**
	 * COMTHEMPLYRINFOCHANGEDTLS 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTHEMPLYRINFOCHANGEDTLS 총 갯수
	 * @exception
	 */
    public int selectComthemplyrinfochangedtlsListTotCnt(ComthemplyrinfochangedtlsVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comthemplyrinfochangedtlsDAO.selectComthemplyrinfochangedtlsListTotCnt_S", vo);
    }

}
