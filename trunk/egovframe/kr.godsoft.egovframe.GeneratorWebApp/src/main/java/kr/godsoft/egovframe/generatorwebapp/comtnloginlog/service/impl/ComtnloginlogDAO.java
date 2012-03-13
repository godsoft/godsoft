package kr.godsoft.egovframe.generatorwebapp.comtnloginlog.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtnloginlog.service.ComtnloginlogVO;
import kr.godsoft.egovframe.generatorwebapp.comtnloginlog.service.ComtnloginlogDefaultVO;

/**
 * @Class Name : ComtnloginlogDAO.java
 * @Description : Comtnloginlog DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnloginlogDAO")
public class ComtnloginlogDAO extends EgovAbstractDAO {

	/**
	 * comtnloginlog을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnloginlogVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnloginlog(ComtnloginlogVO vo) throws Exception {
        return (String)insert("comtnloginlogDAO.insertComtnloginlog_S", vo);
    }

    /**
	 * comtnloginlog을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnloginlogVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnloginlog(ComtnloginlogVO vo) throws Exception {
        update("comtnloginlogDAO.updateComtnloginlog_S", vo);
    }

    /**
	 * comtnloginlog을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnloginlogVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnloginlog(ComtnloginlogVO vo) throws Exception {
        delete("comtnloginlogDAO.deleteComtnloginlog_S", vo);
    }

    /**
	 * comtnloginlog을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnloginlogVO
	 * @return 조회한 comtnloginlog
	 * @exception Exception
	 */
    public ComtnloginlogVO selectComtnloginlog(ComtnloginlogVO vo) throws Exception {
        return (ComtnloginlogVO) selectByPk("comtnloginlogDAO.selectComtnloginlog_S", vo);
    }

    /**
	 * comtnloginlog 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnloginlog 목록
	 * @exception Exception
	 */
    public List selectComtnloginlogList(ComtnloginlogDefaultVO searchVO) throws Exception {
        return list("comtnloginlogDAO.selectComtnloginlogList_D", searchVO);
    }

    /**
	 * comtnloginlog 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnloginlog 총 갯수
	 * @exception
	 */
    public int selectComtnloginlogListTotCnt(ComtnloginlogDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnloginlogDAO.selectComtnloginlogListTotCnt_S", searchVO);
    }

}
