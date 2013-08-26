package kr.godsoft.egovframe.generatorwebapp.comtnntwrksvcmntrngloginfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnntwrksvcmntrngloginfo.service.ComtnntwrksvcmntrngloginfoVO;

/**
 * @Class Name : ComtnntwrksvcmntrngloginfoDAO.java
 * @Description : Comtnntwrksvcmntrngloginfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnntwrksvcmntrngloginfoDAO")
public class ComtnntwrksvcmntrngloginfoDAO extends EgovAbstractDAO {

	/**
	 * COMTNNTWRKSVCMNTRNGLOGINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnntwrksvcmntrngloginfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnntwrksvcmntrngloginfo(ComtnntwrksvcmntrngloginfoVO vo) throws Exception {
        return (String)insert("comtnntwrksvcmntrngloginfoDAO.insertComtnntwrksvcmntrngloginfo_S", vo);
    }

    /**
	 * COMTNNTWRKSVCMNTRNGLOGINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnntwrksvcmntrngloginfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnntwrksvcmntrngloginfo(ComtnntwrksvcmntrngloginfoVO vo) throws Exception {
        update("comtnntwrksvcmntrngloginfoDAO.updateComtnntwrksvcmntrngloginfo_S", vo);
    }

    /**
	 * COMTNNTWRKSVCMNTRNGLOGINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnntwrksvcmntrngloginfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnntwrksvcmntrngloginfo(ComtnntwrksvcmntrngloginfoVO vo) throws Exception {
        delete("comtnntwrksvcmntrngloginfoDAO.deleteComtnntwrksvcmntrngloginfo_S", vo);
    }

    /**
	 * COMTNNTWRKSVCMNTRNGLOGINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnntwrksvcmntrngloginfoVO
	 * @return 조회한 COMTNNTWRKSVCMNTRNGLOGINFO
	 * @exception Exception
	 */
    public ComtnntwrksvcmntrngloginfoVO selectComtnntwrksvcmntrngloginfo(ComtnntwrksvcmntrngloginfoVO vo) throws Exception {
        return (ComtnntwrksvcmntrngloginfoVO) selectByPk("comtnntwrksvcmntrngloginfoDAO.selectComtnntwrksvcmntrngloginfo_S", vo);
    }

    /**
	 * COMTNNTWRKSVCMNTRNGLOGINFO 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNNTWRKSVCMNTRNGLOGINFO 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnntwrksvcmntrngloginfoList(ComtnntwrksvcmntrngloginfoVO vo) throws Exception {
        return list("comtnntwrksvcmntrngloginfoDAO.selectComtnntwrksvcmntrngloginfoList_D", vo);
    }

    /**
	 * COMTNNTWRKSVCMNTRNGLOGINFO 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNNTWRKSVCMNTRNGLOGINFO 총 갯수
	 * @exception
	 */
    public int selectComtnntwrksvcmntrngloginfoListTotCnt(ComtnntwrksvcmntrngloginfoVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnntwrksvcmntrngloginfoDAO.selectComtnntwrksvcmntrngloginfoListTotCnt_S", vo);
    }

}
