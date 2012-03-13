package kr.godsoft.egovframe.generatorwebapp.comtnbndtdiary.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtnbndtdiary.service.ComtnbndtdiaryVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbndtdiary.service.ComtnbndtdiaryDefaultVO;

/**
 * @Class Name : ComtnbndtdiaryDAO.java
 * @Description : Comtnbndtdiary DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnbndtdiaryDAO")
public class ComtnbndtdiaryDAO extends EgovAbstractDAO {

	/**
	 * comtnbndtdiary을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbndtdiaryVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnbndtdiary(ComtnbndtdiaryVO vo) throws Exception {
        return (String)insert("comtnbndtdiaryDAO.insertComtnbndtdiary_S", vo);
    }

    /**
	 * comtnbndtdiary을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbndtdiaryVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnbndtdiary(ComtnbndtdiaryVO vo) throws Exception {
        update("comtnbndtdiaryDAO.updateComtnbndtdiary_S", vo);
    }

    /**
	 * comtnbndtdiary을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbndtdiaryVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnbndtdiary(ComtnbndtdiaryVO vo) throws Exception {
        delete("comtnbndtdiaryDAO.deleteComtnbndtdiary_S", vo);
    }

    /**
	 * comtnbndtdiary을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbndtdiaryVO
	 * @return 조회한 comtnbndtdiary
	 * @exception Exception
	 */
    public ComtnbndtdiaryVO selectComtnbndtdiary(ComtnbndtdiaryVO vo) throws Exception {
        return (ComtnbndtdiaryVO) selectByPk("comtnbndtdiaryDAO.selectComtnbndtdiary_S", vo);
    }

    /**
	 * comtnbndtdiary 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnbndtdiary 목록
	 * @exception Exception
	 */
    public List selectComtnbndtdiaryList(ComtnbndtdiaryDefaultVO searchVO) throws Exception {
        return list("comtnbndtdiaryDAO.selectComtnbndtdiaryList_D", searchVO);
    }

    /**
	 * comtnbndtdiary 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnbndtdiary 총 갯수
	 * @exception
	 */
    public int selectComtnbndtdiaryListTotCnt(ComtnbndtdiaryDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnbndtdiaryDAO.selectComtnbndtdiaryListTotCnt_S", searchVO);
    }

}
