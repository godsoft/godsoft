package kr.godsoft.egovframe.generatorwebapp.comtnclub.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnclub.service.ComtnclubVO;

/**
 * @Class Name : ComtnclubDAO.java
 * @Description : Comtnclub DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnclubDAO")
public class ComtnclubDAO extends EgovAbstractDAO {

	/**
	 * COMTNCLUB을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnclubVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnclub(ComtnclubVO vo) throws Exception {
        return (String)insert("comtnclubDAO.insertComtnclub_S", vo);
    }

    /**
	 * COMTNCLUB을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnclubVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnclub(ComtnclubVO vo) throws Exception {
        update("comtnclubDAO.updateComtnclub_S", vo);
    }

    /**
	 * COMTNCLUB을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnclubVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnclub(ComtnclubVO vo) throws Exception {
        delete("comtnclubDAO.deleteComtnclub_S", vo);
    }

    /**
	 * COMTNCLUB을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnclubVO
	 * @return 조회한 COMTNCLUB
	 * @exception Exception
	 */
    public ComtnclubVO selectComtnclub(ComtnclubVO vo) throws Exception {
        return (ComtnclubVO) selectByPk("comtnclubDAO.selectComtnclub_S", vo);
    }

    /**
	 * COMTNCLUB 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNCLUB 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnclubList(ComtnclubVO vo) throws Exception {
        return list("comtnclubDAO.selectComtnclubList_D", vo);
    }

    /**
	 * COMTNCLUB 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNCLUB 총 갯수
	 * @exception
	 */
    public int selectComtnclubListTotCnt(ComtnclubVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnclubDAO.selectComtnclubListTotCnt_S", vo);
    }

}
