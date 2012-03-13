package kr.godsoft.egovframe.generatorwebapp.comtncmmntyuser.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtncmmntyuser.service.ComtncmmntyuserVO;
import kr.godsoft.egovframe.generatorwebapp.comtncmmntyuser.service.ComtncmmntyuserDefaultVO;

/**
 * @Class Name : ComtncmmntyuserDAO.java
 * @Description : Comtncmmntyuser DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtncmmntyuserDAO")
public class ComtncmmntyuserDAO extends EgovAbstractDAO {

	/**
	 * comtncmmntyuser을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtncmmntyuserVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtncmmntyuser(ComtncmmntyuserVO vo) throws Exception {
        return (String)insert("comtncmmntyuserDAO.insertComtncmmntyuser_S", vo);
    }

    /**
	 * comtncmmntyuser을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtncmmntyuserVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtncmmntyuser(ComtncmmntyuserVO vo) throws Exception {
        update("comtncmmntyuserDAO.updateComtncmmntyuser_S", vo);
    }

    /**
	 * comtncmmntyuser을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtncmmntyuserVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtncmmntyuser(ComtncmmntyuserVO vo) throws Exception {
        delete("comtncmmntyuserDAO.deleteComtncmmntyuser_S", vo);
    }

    /**
	 * comtncmmntyuser을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtncmmntyuserVO
	 * @return 조회한 comtncmmntyuser
	 * @exception Exception
	 */
    public ComtncmmntyuserVO selectComtncmmntyuser(ComtncmmntyuserVO vo) throws Exception {
        return (ComtncmmntyuserVO) selectByPk("comtncmmntyuserDAO.selectComtncmmntyuser_S", vo);
    }

    /**
	 * comtncmmntyuser 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtncmmntyuser 목록
	 * @exception Exception
	 */
    public List selectComtncmmntyuserList(ComtncmmntyuserDefaultVO searchVO) throws Exception {
        return list("comtncmmntyuserDAO.selectComtncmmntyuserList_D", searchVO);
    }

    /**
	 * comtncmmntyuser 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtncmmntyuser 총 갯수
	 * @exception
	 */
    public int selectComtncmmntyuserListTotCnt(ComtncmmntyuserDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtncmmntyuserDAO.selectComtncmmntyuserListTotCnt_S", searchVO);
    }

}
