package kr.godsoft.egovframe.generatorwebapp.comtnreprtstats.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtnreprtstats.service.ComtnreprtstatsVO;
import kr.godsoft.egovframe.generatorwebapp.comtnreprtstats.service.ComtnreprtstatsDefaultVO;

/**
 * @Class Name : ComtnreprtstatsDAO.java
 * @Description : Comtnreprtstats DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnreprtstatsDAO")
public class ComtnreprtstatsDAO extends EgovAbstractDAO {

	/**
	 * comtnreprtstats을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnreprtstatsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnreprtstats(ComtnreprtstatsVO vo) throws Exception {
        return (String)insert("comtnreprtstatsDAO.insertComtnreprtstats_S", vo);
    }

    /**
	 * comtnreprtstats을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnreprtstatsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnreprtstats(ComtnreprtstatsVO vo) throws Exception {
        update("comtnreprtstatsDAO.updateComtnreprtstats_S", vo);
    }

    /**
	 * comtnreprtstats을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnreprtstatsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnreprtstats(ComtnreprtstatsVO vo) throws Exception {
        delete("comtnreprtstatsDAO.deleteComtnreprtstats_S", vo);
    }

    /**
	 * comtnreprtstats을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnreprtstatsVO
	 * @return 조회한 comtnreprtstats
	 * @exception Exception
	 */
    public ComtnreprtstatsVO selectComtnreprtstats(ComtnreprtstatsVO vo) throws Exception {
        return (ComtnreprtstatsVO) selectByPk("comtnreprtstatsDAO.selectComtnreprtstats_S", vo);
    }

    /**
	 * comtnreprtstats 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnreprtstats 목록
	 * @exception Exception
	 */
    public List selectComtnreprtstatsList(ComtnreprtstatsDefaultVO searchVO) throws Exception {
        return list("comtnreprtstatsDAO.selectComtnreprtstatsList_D", searchVO);
    }

    /**
	 * comtnreprtstats 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnreprtstats 총 갯수
	 * @exception
	 */
    public int selectComtnreprtstatsListTotCnt(ComtnreprtstatsDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnreprtstatsDAO.selectComtnreprtstatsListTotCnt_S", searchVO);
    }

}
