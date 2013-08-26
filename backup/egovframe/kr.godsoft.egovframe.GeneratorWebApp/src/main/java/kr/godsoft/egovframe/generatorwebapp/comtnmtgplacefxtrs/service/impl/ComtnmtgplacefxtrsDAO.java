package kr.godsoft.egovframe.generatorwebapp.comtnmtgplacefxtrs.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnmtgplacefxtrs.service.ComtnmtgplacefxtrsVO;

/**
 * @Class Name : ComtnmtgplacefxtrsDAO.java
 * @Description : Comtnmtgplacefxtrs DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnmtgplacefxtrsDAO")
public class ComtnmtgplacefxtrsDAO extends EgovAbstractDAO {

	/**
	 * COMTNMTGPLACEFXTRS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnmtgplacefxtrsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnmtgplacefxtrs(ComtnmtgplacefxtrsVO vo) throws Exception {
        return (String)insert("comtnmtgplacefxtrsDAO.insertComtnmtgplacefxtrs_S", vo);
    }

    /**
	 * COMTNMTGPLACEFXTRS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnmtgplacefxtrsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnmtgplacefxtrs(ComtnmtgplacefxtrsVO vo) throws Exception {
        update("comtnmtgplacefxtrsDAO.updateComtnmtgplacefxtrs_S", vo);
    }

    /**
	 * COMTNMTGPLACEFXTRS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnmtgplacefxtrsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnmtgplacefxtrs(ComtnmtgplacefxtrsVO vo) throws Exception {
        delete("comtnmtgplacefxtrsDAO.deleteComtnmtgplacefxtrs_S", vo);
    }

    /**
	 * COMTNMTGPLACEFXTRS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnmtgplacefxtrsVO
	 * @return 조회한 COMTNMTGPLACEFXTRS
	 * @exception Exception
	 */
    public ComtnmtgplacefxtrsVO selectComtnmtgplacefxtrs(ComtnmtgplacefxtrsVO vo) throws Exception {
        return (ComtnmtgplacefxtrsVO) selectByPk("comtnmtgplacefxtrsDAO.selectComtnmtgplacefxtrs_S", vo);
    }

    /**
	 * COMTNMTGPLACEFXTRS 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNMTGPLACEFXTRS 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnmtgplacefxtrsList(ComtnmtgplacefxtrsVO vo) throws Exception {
        return list("comtnmtgplacefxtrsDAO.selectComtnmtgplacefxtrsList_D", vo);
    }

    /**
	 * COMTNMTGPLACEFXTRS 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNMTGPLACEFXTRS 총 갯수
	 * @exception
	 */
    public int selectComtnmtgplacefxtrsListTotCnt(ComtnmtgplacefxtrsVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnmtgplacefxtrsDAO.selectComtnmtgplacefxtrsListTotCnt_S", vo);
    }

}
