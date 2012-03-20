package kr.godsoft.egovframe.generatorwebapp.comtnclubuser.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnclubuser.service.ComtnclubuserVO;

/**
 * @Class Name : ComtnclubuserDAO.java
 * @Description : Comtnclubuser DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnclubuserDAO")
public class ComtnclubuserDAO extends EgovAbstractDAO {

	/**
	 * comtnclubuser을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnclubuserVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnclubuser(ComtnclubuserVO vo) throws Exception {
        return (String)insert("comtnclubuserDAO.insertComtnclubuser_S", vo);
    }

    /**
	 * comtnclubuser을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnclubuserVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnclubuser(ComtnclubuserVO vo) throws Exception {
        update("comtnclubuserDAO.updateComtnclubuser_S", vo);
    }

    /**
	 * comtnclubuser을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnclubuserVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnclubuser(ComtnclubuserVO vo) throws Exception {
        delete("comtnclubuserDAO.deleteComtnclubuser_S", vo);
    }

    /**
	 * comtnclubuser을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnclubuserVO
	 * @return 조회한 comtnclubuser
	 * @exception Exception
	 */
    public ComtnclubuserVO selectComtnclubuser(ComtnclubuserVO vo) throws Exception {
        return (ComtnclubuserVO) selectByPk("comtnclubuserDAO.selectComtnclubuser_S", vo);
    }

    /**
	 * comtnclubuser 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnclubuser 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnclubuserList(ComtnclubuserVO vo) throws Exception {
        return list("comtnclubuserDAO.selectComtnclubuserList_D", vo);
    }

    /**
	 * comtnclubuser 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnclubuser 총 갯수
	 * @exception
	 */
    public int selectComtnclubuserListTotCnt(ComtnclubuserVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnclubuserDAO.selectComtnclubuserListTotCnt_S", vo);
    }

}
