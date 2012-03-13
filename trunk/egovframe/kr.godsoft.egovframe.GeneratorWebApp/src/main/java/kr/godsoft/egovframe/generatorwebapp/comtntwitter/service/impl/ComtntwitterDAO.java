package kr.godsoft.egovframe.generatorwebapp.comtntwitter.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtntwitter.service.ComtntwitterVO;
import kr.godsoft.egovframe.generatorwebapp.comtntwitter.service.ComtntwitterDefaultVO;

/**
 * @Class Name : ComtntwitterDAO.java
 * @Description : Comtntwitter DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtntwitterDAO")
public class ComtntwitterDAO extends EgovAbstractDAO {

	/**
	 * comtntwitter을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtntwitterVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtntwitter(ComtntwitterVO vo) throws Exception {
        return (String)insert("comtntwitterDAO.insertComtntwitter_S", vo);
    }

    /**
	 * comtntwitter을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtntwitterVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtntwitter(ComtntwitterVO vo) throws Exception {
        update("comtntwitterDAO.updateComtntwitter_S", vo);
    }

    /**
	 * comtntwitter을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtntwitterVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtntwitter(ComtntwitterVO vo) throws Exception {
        delete("comtntwitterDAO.deleteComtntwitter_S", vo);
    }

    /**
	 * comtntwitter을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtntwitterVO
	 * @return 조회한 comtntwitter
	 * @exception Exception
	 */
    public ComtntwitterVO selectComtntwitter(ComtntwitterVO vo) throws Exception {
        return (ComtntwitterVO) selectByPk("comtntwitterDAO.selectComtntwitter_S", vo);
    }

    /**
	 * comtntwitter 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtntwitter 목록
	 * @exception Exception
	 */
    public List selectComtntwitterList(ComtntwitterDefaultVO searchVO) throws Exception {
        return list("comtntwitterDAO.selectComtntwitterList_D", searchVO);
    }

    /**
	 * comtntwitter 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtntwitter 총 갯수
	 * @exception
	 */
    public int selectComtntwitterListTotCnt(ComtntwitterDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtntwitterDAO.selectComtntwitterListTotCnt_S", searchVO);
    }

}
