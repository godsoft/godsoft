package kr.godsoft.egovframe.generatorwebapp.comtndeptjob.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtndeptjob.service.ComtndeptjobVO;

/**
 * @Class Name : ComtndeptjobDAO.java
 * @Description : Comtndeptjob DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtndeptjobDAO")
public class ComtndeptjobDAO extends EgovAbstractDAO {

	/**
	 * comtndeptjob을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtndeptjobVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtndeptjob(ComtndeptjobVO vo) throws Exception {
        return (String)insert("comtndeptjobDAO.insertComtndeptjob_S", vo);
    }

    /**
	 * comtndeptjob을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtndeptjobVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtndeptjob(ComtndeptjobVO vo) throws Exception {
        update("comtndeptjobDAO.updateComtndeptjob_S", vo);
    }

    /**
	 * comtndeptjob을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtndeptjobVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtndeptjob(ComtndeptjobVO vo) throws Exception {
        delete("comtndeptjobDAO.deleteComtndeptjob_S", vo);
    }

    /**
	 * comtndeptjob을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtndeptjobVO
	 * @return 조회한 comtndeptjob
	 * @exception Exception
	 */
    public ComtndeptjobVO selectComtndeptjob(ComtndeptjobVO vo) throws Exception {
        return (ComtndeptjobVO) selectByPk("comtndeptjobDAO.selectComtndeptjob_S", vo);
    }

    /**
	 * comtndeptjob 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtndeptjob 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtndeptjobList(ComtndeptjobVO vo) throws Exception {
        return list("comtndeptjobDAO.selectComtndeptjobList_D", vo);
    }

    /**
	 * comtndeptjob 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtndeptjob 총 갯수
	 * @exception
	 */
    public int selectComtndeptjobListTotCnt(ComtndeptjobVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtndeptjobDAO.selectComtndeptjobListTotCnt_S", vo);
    }

}
