package kr.godsoft.egovframe.generatorwebapp.comtnbackupopert.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnbackupopert.service.ComtnbackupopertVO;

/**
 * @Class Name : ComtnbackupopertDAO.java
 * @Description : Comtnbackupopert DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnbackupopertDAO")
public class ComtnbackupopertDAO extends EgovAbstractDAO {

	/**
	 * COMTNBACKUPOPERT을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbackupopertVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnbackupopert(ComtnbackupopertVO vo) throws Exception {
        return (String)insert("comtnbackupopertDAO.insertComtnbackupopert_S", vo);
    }

    /**
	 * COMTNBACKUPOPERT을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbackupopertVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnbackupopert(ComtnbackupopertVO vo) throws Exception {
        update("comtnbackupopertDAO.updateComtnbackupopert_S", vo);
    }

    /**
	 * COMTNBACKUPOPERT을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbackupopertVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnbackupopert(ComtnbackupopertVO vo) throws Exception {
        delete("comtnbackupopertDAO.deleteComtnbackupopert_S", vo);
    }

    /**
	 * COMTNBACKUPOPERT을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbackupopertVO
	 * @return 조회한 COMTNBACKUPOPERT
	 * @exception Exception
	 */
    public ComtnbackupopertVO selectComtnbackupopert(ComtnbackupopertVO vo) throws Exception {
        return (ComtnbackupopertVO) selectByPk("comtnbackupopertDAO.selectComtnbackupopert_S", vo);
    }

    /**
	 * COMTNBACKUPOPERT 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNBACKUPOPERT 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnbackupopertList(ComtnbackupopertVO vo) throws Exception {
        return list("comtnbackupopertDAO.selectComtnbackupopertList_D", vo);
    }

    /**
	 * COMTNBACKUPOPERT 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNBACKUPOPERT 총 갯수
	 * @exception
	 */
    public int selectComtnbackupopertListTotCnt(ComtnbackupopertVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnbackupopertDAO.selectComtnbackupopertListTotCnt_S", vo);
    }

}
