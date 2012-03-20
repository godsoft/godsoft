package kr.godsoft.egovframe.generatorwebapp.comtnnewsinfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnnewsinfo.service.ComtnnewsinfoVO;

/**
 * @Class Name : ComtnnewsinfoDAO.java
 * @Description : Comtnnewsinfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnnewsinfoDAO")
public class ComtnnewsinfoDAO extends EgovAbstractDAO {

	/**
	 * comtnnewsinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnnewsinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnnewsinfo(ComtnnewsinfoVO vo) throws Exception {
        return (String)insert("comtnnewsinfoDAO.insertComtnnewsinfo_S", vo);
    }

    /**
	 * comtnnewsinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnnewsinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnnewsinfo(ComtnnewsinfoVO vo) throws Exception {
        update("comtnnewsinfoDAO.updateComtnnewsinfo_S", vo);
    }

    /**
	 * comtnnewsinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnnewsinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnnewsinfo(ComtnnewsinfoVO vo) throws Exception {
        delete("comtnnewsinfoDAO.deleteComtnnewsinfo_S", vo);
    }

    /**
	 * comtnnewsinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnnewsinfoVO
	 * @return 조회한 comtnnewsinfo
	 * @exception Exception
	 */
    public ComtnnewsinfoVO selectComtnnewsinfo(ComtnnewsinfoVO vo) throws Exception {
        return (ComtnnewsinfoVO) selectByPk("comtnnewsinfoDAO.selectComtnnewsinfo_S", vo);
    }

    /**
	 * comtnnewsinfo 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnnewsinfo 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnnewsinfoList(ComtnnewsinfoVO vo) throws Exception {
        return list("comtnnewsinfoDAO.selectComtnnewsinfoList_D", vo);
    }

    /**
	 * comtnnewsinfo 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnnewsinfo 총 갯수
	 * @exception
	 */
    public int selectComtnnewsinfoListTotCnt(ComtnnewsinfoVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnnewsinfoDAO.selectComtnnewsinfoListTotCnt_S", vo);
    }

}
