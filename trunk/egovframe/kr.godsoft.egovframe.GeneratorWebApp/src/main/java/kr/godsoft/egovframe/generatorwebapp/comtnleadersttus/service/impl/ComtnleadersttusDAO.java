package kr.godsoft.egovframe.generatorwebapp.comtnleadersttus.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnleadersttus.service.ComtnleadersttusVO;

/**
 * @Class Name : ComtnleadersttusDAO.java
 * @Description : Comtnleadersttus DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnleadersttusDAO")
public class ComtnleadersttusDAO extends EgovAbstractDAO {

	/**
	 * comtnleadersttus을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnleadersttusVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnleadersttus(ComtnleadersttusVO vo) throws Exception {
        return (String)insert("comtnleadersttusDAO.insertComtnleadersttus_S", vo);
    }

    /**
	 * comtnleadersttus을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnleadersttusVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnleadersttus(ComtnleadersttusVO vo) throws Exception {
        update("comtnleadersttusDAO.updateComtnleadersttus_S", vo);
    }

    /**
	 * comtnleadersttus을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnleadersttusVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnleadersttus(ComtnleadersttusVO vo) throws Exception {
        delete("comtnleadersttusDAO.deleteComtnleadersttus_S", vo);
    }

    /**
	 * comtnleadersttus을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnleadersttusVO
	 * @return 조회한 comtnleadersttus
	 * @exception Exception
	 */
    public ComtnleadersttusVO selectComtnleadersttus(ComtnleadersttusVO vo) throws Exception {
        return (ComtnleadersttusVO) selectByPk("comtnleadersttusDAO.selectComtnleadersttus_S", vo);
    }

    /**
	 * comtnleadersttus 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnleadersttus 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnleadersttusList(ComtnleadersttusVO vo) throws Exception {
        return list("comtnleadersttusDAO.selectComtnleadersttusList_D", vo);
    }

    /**
	 * comtnleadersttus 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnleadersttus 총 갯수
	 * @exception
	 */
    public int selectComtnleadersttusListTotCnt(ComtnleadersttusVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnleadersttusDAO.selectComtnleadersttusListTotCnt_S", vo);
    }

}
