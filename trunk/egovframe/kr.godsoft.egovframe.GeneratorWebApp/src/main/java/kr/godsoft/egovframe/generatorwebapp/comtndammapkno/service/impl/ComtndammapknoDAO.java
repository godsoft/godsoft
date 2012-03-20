package kr.godsoft.egovframe.generatorwebapp.comtndammapkno.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtndammapkno.service.ComtndammapknoVO;

/**
 * @Class Name : ComtndammapknoDAO.java
 * @Description : Comtndammapkno DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtndammapknoDAO")
public class ComtndammapknoDAO extends EgovAbstractDAO {

	/**
	 * comtndammapkno을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtndammapknoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtndammapkno(ComtndammapknoVO vo) throws Exception {
        return (String)insert("comtndammapknoDAO.insertComtndammapkno_S", vo);
    }

    /**
	 * comtndammapkno을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtndammapknoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtndammapkno(ComtndammapknoVO vo) throws Exception {
        update("comtndammapknoDAO.updateComtndammapkno_S", vo);
    }

    /**
	 * comtndammapkno을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtndammapknoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtndammapkno(ComtndammapknoVO vo) throws Exception {
        delete("comtndammapknoDAO.deleteComtndammapkno_S", vo);
    }

    /**
	 * comtndammapkno을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtndammapknoVO
	 * @return 조회한 comtndammapkno
	 * @exception Exception
	 */
    public ComtndammapknoVO selectComtndammapkno(ComtndammapknoVO vo) throws Exception {
        return (ComtndammapknoVO) selectByPk("comtndammapknoDAO.selectComtndammapkno_S", vo);
    }

    /**
	 * comtndammapkno 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtndammapkno 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtndammapknoList(ComtndammapknoVO vo) throws Exception {
        return list("comtndammapknoDAO.selectComtndammapknoList_D", vo);
    }

    /**
	 * comtndammapkno 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtndammapkno 총 갯수
	 * @exception
	 */
    public int selectComtndammapknoListTotCnt(ComtndammapknoVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtndammapknoDAO.selectComtndammapknoListTotCnt_S", vo);
    }

}
