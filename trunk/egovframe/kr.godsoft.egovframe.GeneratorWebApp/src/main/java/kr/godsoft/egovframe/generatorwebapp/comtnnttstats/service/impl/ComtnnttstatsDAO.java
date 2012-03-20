package kr.godsoft.egovframe.generatorwebapp.comtnnttstats.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnnttstats.service.ComtnnttstatsVO;

/**
 * @Class Name : ComtnnttstatsDAO.java
 * @Description : Comtnnttstats DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnnttstatsDAO")
public class ComtnnttstatsDAO extends EgovAbstractDAO {

	/**
	 * comtnnttstats을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnnttstatsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnnttstats(ComtnnttstatsVO vo) throws Exception {
        return (String)insert("comtnnttstatsDAO.insertComtnnttstats_S", vo);
    }

    /**
	 * comtnnttstats을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnnttstatsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnnttstats(ComtnnttstatsVO vo) throws Exception {
        update("comtnnttstatsDAO.updateComtnnttstats_S", vo);
    }

    /**
	 * comtnnttstats을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnnttstatsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnnttstats(ComtnnttstatsVO vo) throws Exception {
        delete("comtnnttstatsDAO.deleteComtnnttstats_S", vo);
    }

    /**
	 * comtnnttstats을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnnttstatsVO
	 * @return 조회한 comtnnttstats
	 * @exception Exception
	 */
    public ComtnnttstatsVO selectComtnnttstats(ComtnnttstatsVO vo) throws Exception {
        return (ComtnnttstatsVO) selectByPk("comtnnttstatsDAO.selectComtnnttstats_S", vo);
    }

    /**
	 * comtnnttstats 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnnttstats 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnnttstatsList(ComtnnttstatsVO vo) throws Exception {
        return list("comtnnttstatsDAO.selectComtnnttstatsList_D", vo);
    }

    /**
	 * comtnnttstats 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnnttstats 총 갯수
	 * @exception
	 */
    public int selectComtnnttstatsListTotCnt(ComtnnttstatsVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnnttstatsDAO.selectComtnnttstatsListTotCnt_S", vo);
    }

}
