package kr.godsoft.egovframe.generatorwebapp.comtngnrlmber.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtngnrlmber.service.ComtngnrlmberVO;

/**
 * @Class Name : ComtngnrlmberDAO.java
 * @Description : Comtngnrlmber DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtngnrlmberDAO")
public class ComtngnrlmberDAO extends EgovAbstractDAO {

	/**
	 * comtngnrlmber을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtngnrlmberVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtngnrlmber(ComtngnrlmberVO vo) throws Exception {
        return (String)insert("comtngnrlmberDAO.insertComtngnrlmber_S", vo);
    }

    /**
	 * comtngnrlmber을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtngnrlmberVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtngnrlmber(ComtngnrlmberVO vo) throws Exception {
        update("comtngnrlmberDAO.updateComtngnrlmber_S", vo);
    }

    /**
	 * comtngnrlmber을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtngnrlmberVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtngnrlmber(ComtngnrlmberVO vo) throws Exception {
        delete("comtngnrlmberDAO.deleteComtngnrlmber_S", vo);
    }

    /**
	 * comtngnrlmber을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtngnrlmberVO
	 * @return 조회한 comtngnrlmber
	 * @exception Exception
	 */
    public ComtngnrlmberVO selectComtngnrlmber(ComtngnrlmberVO vo) throws Exception {
        return (ComtngnrlmberVO) selectByPk("comtngnrlmberDAO.selectComtngnrlmber_S", vo);
    }

    /**
	 * comtngnrlmber 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtngnrlmber 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtngnrlmberList(ComtngnrlmberVO vo) throws Exception {
        return list("comtngnrlmberDAO.selectComtngnrlmberList_D", vo);
    }

    /**
	 * comtngnrlmber 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtngnrlmber 총 갯수
	 * @exception
	 */
    public int selectComtngnrlmberListTotCnt(ComtngnrlmberVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtngnrlmberDAO.selectComtngnrlmberListTotCnt_S", vo);
    }

}
