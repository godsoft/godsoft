package kr.godsoft.egovframe.generatorwebapp.comtnservereqpmnrelate.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnservereqpmnrelate.service.ComtnservereqpmnrelateVO;

/**
 * @Class Name : ComtnservereqpmnrelateDAO.java
 * @Description : Comtnservereqpmnrelate DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnservereqpmnrelateDAO")
public class ComtnservereqpmnrelateDAO extends EgovAbstractDAO {

	/**
	 * COMTNSERVEREQPMNRELATE을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnservereqpmnrelateVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnservereqpmnrelate(ComtnservereqpmnrelateVO vo) throws Exception {
        return (String)insert("comtnservereqpmnrelateDAO.insertComtnservereqpmnrelate_S", vo);
    }

    /**
	 * COMTNSERVEREQPMNRELATE을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnservereqpmnrelateVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnservereqpmnrelate(ComtnservereqpmnrelateVO vo) throws Exception {
        update("comtnservereqpmnrelateDAO.updateComtnservereqpmnrelate_S", vo);
    }

    /**
	 * COMTNSERVEREQPMNRELATE을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnservereqpmnrelateVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnservereqpmnrelate(ComtnservereqpmnrelateVO vo) throws Exception {
        delete("comtnservereqpmnrelateDAO.deleteComtnservereqpmnrelate_S", vo);
    }

    /**
	 * COMTNSERVEREQPMNRELATE을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnservereqpmnrelateVO
	 * @return 조회한 COMTNSERVEREQPMNRELATE
	 * @exception Exception
	 */
    public ComtnservereqpmnrelateVO selectComtnservereqpmnrelate(ComtnservereqpmnrelateVO vo) throws Exception {
        return (ComtnservereqpmnrelateVO) selectByPk("comtnservereqpmnrelateDAO.selectComtnservereqpmnrelate_S", vo);
    }

    /**
	 * COMTNSERVEREQPMNRELATE 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNSERVEREQPMNRELATE 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnservereqpmnrelateList(ComtnservereqpmnrelateVO vo) throws Exception {
        return list("comtnservereqpmnrelateDAO.selectComtnservereqpmnrelateList_D", vo);
    }

    /**
	 * COMTNSERVEREQPMNRELATE 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNSERVEREQPMNRELATE 총 갯수
	 * @exception
	 */
    public int selectComtnservereqpmnrelateListTotCnt(ComtnservereqpmnrelateVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnservereqpmnrelateDAO.selectComtnservereqpmnrelateListTotCnt_S", vo);
    }

}
