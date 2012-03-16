package kr.godsoft.egovframe.generatorwebapp.comtnrestde.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnrestde.service.ComtnrestdeVO;

/**
 * @Class Name : ComtnrestdeDAO.java
 * @Description : Comtnrestde DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnrestdeDAO")
public class ComtnrestdeDAO extends EgovAbstractDAO {

	/**
	 * comtnrestde을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnrestdeVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnrestde(ComtnrestdeVO vo) throws Exception {
        return (String)insert("comtnrestdeDAO.insertComtnrestde_S", vo);
    }

    /**
	 * comtnrestde을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnrestdeVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnrestde(ComtnrestdeVO vo) throws Exception {
        update("comtnrestdeDAO.updateComtnrestde_S", vo);
    }

    /**
	 * comtnrestde을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnrestdeVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnrestde(ComtnrestdeVO vo) throws Exception {
        delete("comtnrestdeDAO.deleteComtnrestde_S", vo);
    }

    /**
	 * comtnrestde을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnrestdeVO
	 * @return 조회한 comtnrestde
	 * @exception Exception
	 */
    public ComtnrestdeVO selectComtnrestde(ComtnrestdeVO vo) throws Exception {
        return (ComtnrestdeVO) selectByPk("comtnrestdeDAO.selectComtnrestde_S", vo);
    }

    /**
	 * comtnrestde 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnrestde 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnrestdeList(ComtnrestdeVO vo) throws Exception {
        return list("comtnrestdeDAO.selectComtnrestdeList_D", vo);
    }

    /**
	 * comtnrestde 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnrestde 총 갯수
	 * @exception
	 */
    public int selectComtnrestdeListTotCnt(ComtnrestdeVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnrestdeDAO.selectComtnrestdeListTotCnt_S", vo);
    }

}
