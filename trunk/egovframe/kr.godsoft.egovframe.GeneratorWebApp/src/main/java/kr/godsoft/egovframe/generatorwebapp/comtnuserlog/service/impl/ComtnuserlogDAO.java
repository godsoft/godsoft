package kr.godsoft.egovframe.generatorwebapp.comtnuserlog.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnuserlog.service.ComtnuserlogVO;

/**
 * @Class Name : ComtnuserlogDAO.java
 * @Description : Comtnuserlog DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnuserlogDAO")
public class ComtnuserlogDAO extends EgovAbstractDAO {

	/**
	 * comtnuserlog을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnuserlogVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnuserlog(ComtnuserlogVO vo) throws Exception {
        return (String)insert("comtnuserlogDAO.insertComtnuserlog_S", vo);
    }

    /**
	 * comtnuserlog을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnuserlogVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnuserlog(ComtnuserlogVO vo) throws Exception {
        update("comtnuserlogDAO.updateComtnuserlog_S", vo);
    }

    /**
	 * comtnuserlog을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnuserlogVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnuserlog(ComtnuserlogVO vo) throws Exception {
        delete("comtnuserlogDAO.deleteComtnuserlog_S", vo);
    }

    /**
	 * comtnuserlog을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnuserlogVO
	 * @return 조회한 comtnuserlog
	 * @exception Exception
	 */
    public ComtnuserlogVO selectComtnuserlog(ComtnuserlogVO vo) throws Exception {
        return (ComtnuserlogVO) selectByPk("comtnuserlogDAO.selectComtnuserlog_S", vo);
    }

    /**
	 * comtnuserlog 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnuserlog 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnuserlogList(ComtnuserlogVO vo) throws Exception {
        return list("comtnuserlogDAO.selectComtnuserlogList_D", vo);
    }

    /**
	 * comtnuserlog 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnuserlog 총 갯수
	 * @exception
	 */
    public int selectComtnuserlogListTotCnt(ComtnuserlogVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnuserlogDAO.selectComtnuserlogListTotCnt_S", vo);
    }

}
