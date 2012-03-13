package kr.godsoft.egovframe.generatorwebapp.comtnservereqpmnrelate.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtnservereqpmnrelate.service.ComtnservereqpmnrelateVO;
import kr.godsoft.egovframe.generatorwebapp.comtnservereqpmnrelate.service.ComtnservereqpmnrelateDefaultVO;

/**
 * @Class Name : ComtnservereqpmnrelateDAO.java
 * @Description : Comtnservereqpmnrelate DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnservereqpmnrelateDAO")
public class ComtnservereqpmnrelateDAO extends EgovAbstractDAO {

	/**
	 * comtnservereqpmnrelate을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnservereqpmnrelateVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnservereqpmnrelate(ComtnservereqpmnrelateVO vo) throws Exception {
        return (String)insert("comtnservereqpmnrelateDAO.insertComtnservereqpmnrelate_S", vo);
    }

    /**
	 * comtnservereqpmnrelate을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnservereqpmnrelateVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnservereqpmnrelate(ComtnservereqpmnrelateVO vo) throws Exception {
        update("comtnservereqpmnrelateDAO.updateComtnservereqpmnrelate_S", vo);
    }

    /**
	 * comtnservereqpmnrelate을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnservereqpmnrelateVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnservereqpmnrelate(ComtnservereqpmnrelateVO vo) throws Exception {
        delete("comtnservereqpmnrelateDAO.deleteComtnservereqpmnrelate_S", vo);
    }

    /**
	 * comtnservereqpmnrelate을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnservereqpmnrelateVO
	 * @return 조회한 comtnservereqpmnrelate
	 * @exception Exception
	 */
    public ComtnservereqpmnrelateVO selectComtnservereqpmnrelate(ComtnservereqpmnrelateVO vo) throws Exception {
        return (ComtnservereqpmnrelateVO) selectByPk("comtnservereqpmnrelateDAO.selectComtnservereqpmnrelate_S", vo);
    }

    /**
	 * comtnservereqpmnrelate 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnservereqpmnrelate 목록
	 * @exception Exception
	 */
    public List selectComtnservereqpmnrelateList(ComtnservereqpmnrelateDefaultVO searchVO) throws Exception {
        return list("comtnservereqpmnrelateDAO.selectComtnservereqpmnrelateList_D", searchVO);
    }

    /**
	 * comtnservereqpmnrelate 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnservereqpmnrelate 총 갯수
	 * @exception
	 */
    public int selectComtnservereqpmnrelateListTotCnt(ComtnservereqpmnrelateDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnservereqpmnrelateDAO.selectComtnservereqpmnrelateListTotCnt_S", searchVO);
    }

}
