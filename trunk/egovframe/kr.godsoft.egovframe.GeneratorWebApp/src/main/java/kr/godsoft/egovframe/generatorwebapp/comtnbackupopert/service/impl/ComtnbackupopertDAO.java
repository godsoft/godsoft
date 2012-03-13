package kr.godsoft.egovframe.generatorwebapp.comtnbackupopert.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtnbackupopert.service.ComtnbackupopertVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbackupopert.service.ComtnbackupopertDefaultVO;

/**
 * @Class Name : ComtnbackupopertDAO.java
 * @Description : Comtnbackupopert DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnbackupopertDAO")
public class ComtnbackupopertDAO extends EgovAbstractDAO {

	/**
	 * comtnbackupopert을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbackupopertVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnbackupopert(ComtnbackupopertVO vo) throws Exception {
        return (String)insert("comtnbackupopertDAO.insertComtnbackupopert_S", vo);
    }

    /**
	 * comtnbackupopert을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbackupopertVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnbackupopert(ComtnbackupopertVO vo) throws Exception {
        update("comtnbackupopertDAO.updateComtnbackupopert_S", vo);
    }

    /**
	 * comtnbackupopert을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbackupopertVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnbackupopert(ComtnbackupopertVO vo) throws Exception {
        delete("comtnbackupopertDAO.deleteComtnbackupopert_S", vo);
    }

    /**
	 * comtnbackupopert을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbackupopertVO
	 * @return 조회한 comtnbackupopert
	 * @exception Exception
	 */
    public ComtnbackupopertVO selectComtnbackupopert(ComtnbackupopertVO vo) throws Exception {
        return (ComtnbackupopertVO) selectByPk("comtnbackupopertDAO.selectComtnbackupopert_S", vo);
    }

    /**
	 * comtnbackupopert 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnbackupopert 목록
	 * @exception Exception
	 */
    public List selectComtnbackupopertList(ComtnbackupopertDefaultVO searchVO) throws Exception {
        return list("comtnbackupopertDAO.selectComtnbackupopertList_D", searchVO);
    }

    /**
	 * comtnbackupopert 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnbackupopert 총 갯수
	 * @exception
	 */
    public int selectComtnbackupopertListTotCnt(ComtnbackupopertDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnbackupopertDAO.selectComtnbackupopertListTotCnt_S", searchVO);
    }

}
