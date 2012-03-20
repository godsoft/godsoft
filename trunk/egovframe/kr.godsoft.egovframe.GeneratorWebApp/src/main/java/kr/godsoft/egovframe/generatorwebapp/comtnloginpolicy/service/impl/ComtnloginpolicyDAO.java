package kr.godsoft.egovframe.generatorwebapp.comtnloginpolicy.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnloginpolicy.service.ComtnloginpolicyVO;

/**
 * @Class Name : ComtnloginpolicyDAO.java
 * @Description : Comtnloginpolicy DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnloginpolicyDAO")
public class ComtnloginpolicyDAO extends EgovAbstractDAO {

	/**
	 * comtnloginpolicy을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnloginpolicyVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnloginpolicy(ComtnloginpolicyVO vo) throws Exception {
        return (String)insert("comtnloginpolicyDAO.insertComtnloginpolicy_S", vo);
    }

    /**
	 * comtnloginpolicy을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnloginpolicyVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnloginpolicy(ComtnloginpolicyVO vo) throws Exception {
        update("comtnloginpolicyDAO.updateComtnloginpolicy_S", vo);
    }

    /**
	 * comtnloginpolicy을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnloginpolicyVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnloginpolicy(ComtnloginpolicyVO vo) throws Exception {
        delete("comtnloginpolicyDAO.deleteComtnloginpolicy_S", vo);
    }

    /**
	 * comtnloginpolicy을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnloginpolicyVO
	 * @return 조회한 comtnloginpolicy
	 * @exception Exception
	 */
    public ComtnloginpolicyVO selectComtnloginpolicy(ComtnloginpolicyVO vo) throws Exception {
        return (ComtnloginpolicyVO) selectByPk("comtnloginpolicyDAO.selectComtnloginpolicy_S", vo);
    }

    /**
	 * comtnloginpolicy 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnloginpolicy 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnloginpolicyList(ComtnloginpolicyVO vo) throws Exception {
        return list("comtnloginpolicyDAO.selectComtnloginpolicyList_D", vo);
    }

    /**
	 * comtnloginpolicy 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnloginpolicy 총 갯수
	 * @exception
	 */
    public int selectComtnloginpolicyListTotCnt(ComtnloginpolicyVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnloginpolicyDAO.selectComtnloginpolicyListTotCnt_S", vo);
    }

}
