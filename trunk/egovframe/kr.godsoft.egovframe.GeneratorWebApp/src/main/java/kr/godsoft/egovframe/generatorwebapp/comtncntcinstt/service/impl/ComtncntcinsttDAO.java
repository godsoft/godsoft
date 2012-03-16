package kr.godsoft.egovframe.generatorwebapp.comtncntcinstt.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtncntcinstt.service.ComtncntcinsttVO;

/**
 * @Class Name : ComtncntcinsttDAO.java
 * @Description : Comtncntcinstt DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtncntcinsttDAO")
public class ComtncntcinsttDAO extends EgovAbstractDAO {

	/**
	 * comtncntcinstt을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtncntcinsttVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtncntcinstt(ComtncntcinsttVO vo) throws Exception {
        return (String)insert("comtncntcinsttDAO.insertComtncntcinstt_S", vo);
    }

    /**
	 * comtncntcinstt을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtncntcinsttVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtncntcinstt(ComtncntcinsttVO vo) throws Exception {
        update("comtncntcinsttDAO.updateComtncntcinstt_S", vo);
    }

    /**
	 * comtncntcinstt을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtncntcinsttVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtncntcinstt(ComtncntcinsttVO vo) throws Exception {
        delete("comtncntcinsttDAO.deleteComtncntcinstt_S", vo);
    }

    /**
	 * comtncntcinstt을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtncntcinsttVO
	 * @return 조회한 comtncntcinstt
	 * @exception Exception
	 */
    public ComtncntcinsttVO selectComtncntcinstt(ComtncntcinsttVO vo) throws Exception {
        return (ComtncntcinsttVO) selectByPk("comtncntcinsttDAO.selectComtncntcinstt_S", vo);
    }

    /**
	 * comtncntcinstt 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtncntcinstt 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtncntcinsttList(ComtncntcinsttVO vo) throws Exception {
        return list("comtncntcinsttDAO.selectComtncntcinsttList_D", vo);
    }

    /**
	 * comtncntcinstt 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtncntcinstt 총 갯수
	 * @exception
	 */
    public int selectComtncntcinsttListTotCnt(ComtncntcinsttVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtncntcinsttDAO.selectComtncntcinsttListTotCnt_S", vo);
    }

}
