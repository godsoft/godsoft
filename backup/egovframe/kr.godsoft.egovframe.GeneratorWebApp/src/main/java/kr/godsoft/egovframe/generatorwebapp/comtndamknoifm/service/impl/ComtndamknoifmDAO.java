package kr.godsoft.egovframe.generatorwebapp.comtndamknoifm.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtndamknoifm.service.ComtndamknoifmVO;

/**
 * @Class Name : ComtndamknoifmDAO.java
 * @Description : Comtndamknoifm DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtndamknoifmDAO")
public class ComtndamknoifmDAO extends EgovAbstractDAO {

	/**
	 * COMTNDAMKNOIFM을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtndamknoifmVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtndamknoifm(ComtndamknoifmVO vo) throws Exception {
        return (String)insert("comtndamknoifmDAO.insertComtndamknoifm_S", vo);
    }

    /**
	 * COMTNDAMKNOIFM을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtndamknoifmVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtndamknoifm(ComtndamknoifmVO vo) throws Exception {
        update("comtndamknoifmDAO.updateComtndamknoifm_S", vo);
    }

    /**
	 * COMTNDAMKNOIFM을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtndamknoifmVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtndamknoifm(ComtndamknoifmVO vo) throws Exception {
        delete("comtndamknoifmDAO.deleteComtndamknoifm_S", vo);
    }

    /**
	 * COMTNDAMKNOIFM을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtndamknoifmVO
	 * @return 조회한 COMTNDAMKNOIFM
	 * @exception Exception
	 */
    public ComtndamknoifmVO selectComtndamknoifm(ComtndamknoifmVO vo) throws Exception {
        return (ComtndamknoifmVO) selectByPk("comtndamknoifmDAO.selectComtndamknoifm_S", vo);
    }

    /**
	 * COMTNDAMKNOIFM 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNDAMKNOIFM 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtndamknoifmList(ComtndamknoifmVO vo) throws Exception {
        return list("comtndamknoifmDAO.selectComtndamknoifmList_D", vo);
    }

    /**
	 * COMTNDAMKNOIFM 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNDAMKNOIFM 총 갯수
	 * @exception
	 */
    public int selectComtndamknoifmListTotCnt(ComtndamknoifmVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtndamknoifmDAO.selectComtndamknoifmListTotCnt_S", vo);
    }

}
