package kr.godsoft.egovframe.generatorwebapp.comtnleaderschdulde.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnleaderschdulde.service.ComtnleaderschduldeVO;

/**
 * @Class Name : ComtnleaderschduldeDAO.java
 * @Description : Comtnleaderschdulde DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnleaderschduldeDAO")
public class ComtnleaderschduldeDAO extends EgovAbstractDAO {

	/**
	 * comtnleaderschdulde을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnleaderschduldeVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnleaderschdulde(ComtnleaderschduldeVO vo) throws Exception {
        return (String)insert("comtnleaderschduldeDAO.insertComtnleaderschdulde_S", vo);
    }

    /**
	 * comtnleaderschdulde을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnleaderschduldeVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnleaderschdulde(ComtnleaderschduldeVO vo) throws Exception {
        update("comtnleaderschduldeDAO.updateComtnleaderschdulde_S", vo);
    }

    /**
	 * comtnleaderschdulde을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnleaderschduldeVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnleaderschdulde(ComtnleaderschduldeVO vo) throws Exception {
        delete("comtnleaderschduldeDAO.deleteComtnleaderschdulde_S", vo);
    }

    /**
	 * comtnleaderschdulde을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnleaderschduldeVO
	 * @return 조회한 comtnleaderschdulde
	 * @exception Exception
	 */
    public ComtnleaderschduldeVO selectComtnleaderschdulde(ComtnleaderschduldeVO vo) throws Exception {
        return (ComtnleaderschduldeVO) selectByPk("comtnleaderschduldeDAO.selectComtnleaderschdulde_S", vo);
    }

    /**
	 * comtnleaderschdulde 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnleaderschdulde 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnleaderschduldeList(ComtnleaderschduldeVO vo) throws Exception {
        return list("comtnleaderschduldeDAO.selectComtnleaderschduldeList_D", vo);
    }

    /**
	 * comtnleaderschdulde 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnleaderschdulde 총 갯수
	 * @exception
	 */
    public int selectComtnleaderschduldeListTotCnt(ComtnleaderschduldeVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnleaderschduldeDAO.selectComtnleaderschduldeListTotCnt_S", vo);
    }

}
