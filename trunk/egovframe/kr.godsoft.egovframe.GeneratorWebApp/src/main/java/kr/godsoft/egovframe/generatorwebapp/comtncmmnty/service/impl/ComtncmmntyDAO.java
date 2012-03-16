package kr.godsoft.egovframe.generatorwebapp.comtncmmnty.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtncmmnty.service.ComtncmmntyVO;

/**
 * @Class Name : ComtncmmntyDAO.java
 * @Description : Comtncmmnty DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtncmmntyDAO")
public class ComtncmmntyDAO extends EgovAbstractDAO {

	/**
	 * comtncmmnty을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtncmmntyVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtncmmnty(ComtncmmntyVO vo) throws Exception {
        return (String)insert("comtncmmntyDAO.insertComtncmmnty_S", vo);
    }

    /**
	 * comtncmmnty을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtncmmntyVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtncmmnty(ComtncmmntyVO vo) throws Exception {
        update("comtncmmntyDAO.updateComtncmmnty_S", vo);
    }

    /**
	 * comtncmmnty을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtncmmntyVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtncmmnty(ComtncmmntyVO vo) throws Exception {
        delete("comtncmmntyDAO.deleteComtncmmnty_S", vo);
    }

    /**
	 * comtncmmnty을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtncmmntyVO
	 * @return 조회한 comtncmmnty
	 * @exception Exception
	 */
    public ComtncmmntyVO selectComtncmmnty(ComtncmmntyVO vo) throws Exception {
        return (ComtncmmntyVO) selectByPk("comtncmmntyDAO.selectComtncmmnty_S", vo);
    }

    /**
	 * comtncmmnty 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtncmmnty 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtncmmntyList(ComtncmmntyVO vo) throws Exception {
        return list("comtncmmntyDAO.selectComtncmmntyList_D", vo);
    }

    /**
	 * comtncmmnty 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtncmmnty 총 갯수
	 * @exception
	 */
    public int selectComtncmmntyListTotCnt(ComtncmmntyVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtncmmntyDAO.selectComtncmmntyListTotCnt_S", vo);
    }

}
