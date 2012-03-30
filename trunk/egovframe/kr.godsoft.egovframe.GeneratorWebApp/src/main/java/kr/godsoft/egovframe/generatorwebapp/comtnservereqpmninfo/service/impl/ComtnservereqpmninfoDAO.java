package kr.godsoft.egovframe.generatorwebapp.comtnservereqpmninfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnservereqpmninfo.service.ComtnservereqpmninfoVO;

/**
 * @Class Name : ComtnservereqpmninfoDAO.java
 * @Description : Comtnservereqpmninfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnservereqpmninfoDAO")
public class ComtnservereqpmninfoDAO extends EgovAbstractDAO {

	/**
	 * COMTNSERVEREQPMNINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnservereqpmninfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnservereqpmninfo(ComtnservereqpmninfoVO vo) throws Exception {
        return (String)insert("comtnservereqpmninfoDAO.insertComtnservereqpmninfo_S", vo);
    }

    /**
	 * COMTNSERVEREQPMNINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnservereqpmninfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnservereqpmninfo(ComtnservereqpmninfoVO vo) throws Exception {
        update("comtnservereqpmninfoDAO.updateComtnservereqpmninfo_S", vo);
    }

    /**
	 * COMTNSERVEREQPMNINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnservereqpmninfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnservereqpmninfo(ComtnservereqpmninfoVO vo) throws Exception {
        delete("comtnservereqpmninfoDAO.deleteComtnservereqpmninfo_S", vo);
    }

    /**
	 * COMTNSERVEREQPMNINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnservereqpmninfoVO
	 * @return 조회한 COMTNSERVEREQPMNINFO
	 * @exception Exception
	 */
    public ComtnservereqpmninfoVO selectComtnservereqpmninfo(ComtnservereqpmninfoVO vo) throws Exception {
        return (ComtnservereqpmninfoVO) selectByPk("comtnservereqpmninfoDAO.selectComtnservereqpmninfo_S", vo);
    }

    /**
	 * COMTNSERVEREQPMNINFO 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNSERVEREQPMNINFO 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnservereqpmninfoList(ComtnservereqpmninfoVO vo) throws Exception {
        return list("comtnservereqpmninfoDAO.selectComtnservereqpmninfoList_D", vo);
    }

    /**
	 * COMTNSERVEREQPMNINFO 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNSERVEREQPMNINFO 총 갯수
	 * @exception
	 */
    public int selectComtnservereqpmninfoListTotCnt(ComtnservereqpmninfoVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnservereqpmninfoDAO.selectComtnservereqpmninfoListTotCnt_S", vo);
    }

}
