package kr.godsoft.egovframe.generatorwebapp.comtnhttpmon.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnhttpmon.service.ComtnhttpmonVO;

/**
 * @Class Name : ComtnhttpmonDAO.java
 * @Description : Comtnhttpmon DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnhttpmonDAO")
public class ComtnhttpmonDAO extends EgovAbstractDAO {

	/**
	 * comtnhttpmon을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnhttpmonVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnhttpmon(ComtnhttpmonVO vo) throws Exception {
        return (String)insert("comtnhttpmonDAO.insertComtnhttpmon_S", vo);
    }

    /**
	 * comtnhttpmon을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnhttpmonVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnhttpmon(ComtnhttpmonVO vo) throws Exception {
        update("comtnhttpmonDAO.updateComtnhttpmon_S", vo);
    }

    /**
	 * comtnhttpmon을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnhttpmonVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnhttpmon(ComtnhttpmonVO vo) throws Exception {
        delete("comtnhttpmonDAO.deleteComtnhttpmon_S", vo);
    }

    /**
	 * comtnhttpmon을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnhttpmonVO
	 * @return 조회한 comtnhttpmon
	 * @exception Exception
	 */
    public ComtnhttpmonVO selectComtnhttpmon(ComtnhttpmonVO vo) throws Exception {
        return (ComtnhttpmonVO) selectByPk("comtnhttpmonDAO.selectComtnhttpmon_S", vo);
    }

    /**
	 * comtnhttpmon 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnhttpmon 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnhttpmonList(ComtnhttpmonVO vo) throws Exception {
        return list("comtnhttpmonDAO.selectComtnhttpmonList_D", vo);
    }

    /**
	 * comtnhttpmon 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnhttpmon 총 갯수
	 * @exception
	 */
    public int selectComtnhttpmonListTotCnt(ComtnhttpmonVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnhttpmonDAO.selectComtnhttpmonListTotCnt_S", vo);
    }

}
