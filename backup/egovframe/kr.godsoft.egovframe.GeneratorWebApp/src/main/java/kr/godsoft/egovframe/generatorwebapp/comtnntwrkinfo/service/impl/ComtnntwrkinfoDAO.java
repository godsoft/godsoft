package kr.godsoft.egovframe.generatorwebapp.comtnntwrkinfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnntwrkinfo.service.ComtnntwrkinfoVO;

/**
 * @Class Name : ComtnntwrkinfoDAO.java
 * @Description : Comtnntwrkinfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnntwrkinfoDAO")
public class ComtnntwrkinfoDAO extends EgovAbstractDAO {

	/**
	 * COMTNNTWRKINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnntwrkinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnntwrkinfo(ComtnntwrkinfoVO vo) throws Exception {
        return (String)insert("comtnntwrkinfoDAO.insertComtnntwrkinfo_S", vo);
    }

    /**
	 * COMTNNTWRKINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnntwrkinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnntwrkinfo(ComtnntwrkinfoVO vo) throws Exception {
        update("comtnntwrkinfoDAO.updateComtnntwrkinfo_S", vo);
    }

    /**
	 * COMTNNTWRKINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnntwrkinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnntwrkinfo(ComtnntwrkinfoVO vo) throws Exception {
        delete("comtnntwrkinfoDAO.deleteComtnntwrkinfo_S", vo);
    }

    /**
	 * COMTNNTWRKINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnntwrkinfoVO
	 * @return 조회한 COMTNNTWRKINFO
	 * @exception Exception
	 */
    public ComtnntwrkinfoVO selectComtnntwrkinfo(ComtnntwrkinfoVO vo) throws Exception {
        return (ComtnntwrkinfoVO) selectByPk("comtnntwrkinfoDAO.selectComtnntwrkinfo_S", vo);
    }

    /**
	 * COMTNNTWRKINFO 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNNTWRKINFO 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnntwrkinfoList(ComtnntwrkinfoVO vo) throws Exception {
        return list("comtnntwrkinfoDAO.selectComtnntwrkinfoList_D", vo);
    }

    /**
	 * COMTNNTWRKINFO 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNNTWRKINFO 총 갯수
	 * @exception
	 */
    public int selectComtnntwrkinfoListTotCnt(ComtnntwrkinfoVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnntwrkinfoDAO.selectComtnntwrkinfoListTotCnt_S", vo);
    }

}
