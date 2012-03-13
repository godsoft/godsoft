package kr.godsoft.egovframe.generatorwebapp.comtnntwrksvcmntrngloginfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtnntwrksvcmntrngloginfo.service.ComtnntwrksvcmntrngloginfoVO;
import kr.godsoft.egovframe.generatorwebapp.comtnntwrksvcmntrngloginfo.service.ComtnntwrksvcmntrngloginfoDefaultVO;

/**
 * @Class Name : ComtnntwrksvcmntrngloginfoDAO.java
 * @Description : Comtnntwrksvcmntrngloginfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnntwrksvcmntrngloginfoDAO")
public class ComtnntwrksvcmntrngloginfoDAO extends EgovAbstractDAO {

	/**
	 * comtnntwrksvcmntrngloginfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnntwrksvcmntrngloginfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnntwrksvcmntrngloginfo(ComtnntwrksvcmntrngloginfoVO vo) throws Exception {
        return (String)insert("comtnntwrksvcmntrngloginfoDAO.insertComtnntwrksvcmntrngloginfo_S", vo);
    }

    /**
	 * comtnntwrksvcmntrngloginfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnntwrksvcmntrngloginfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnntwrksvcmntrngloginfo(ComtnntwrksvcmntrngloginfoVO vo) throws Exception {
        update("comtnntwrksvcmntrngloginfoDAO.updateComtnntwrksvcmntrngloginfo_S", vo);
    }

    /**
	 * comtnntwrksvcmntrngloginfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnntwrksvcmntrngloginfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnntwrksvcmntrngloginfo(ComtnntwrksvcmntrngloginfoVO vo) throws Exception {
        delete("comtnntwrksvcmntrngloginfoDAO.deleteComtnntwrksvcmntrngloginfo_S", vo);
    }

    /**
	 * comtnntwrksvcmntrngloginfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnntwrksvcmntrngloginfoVO
	 * @return 조회한 comtnntwrksvcmntrngloginfo
	 * @exception Exception
	 */
    public ComtnntwrksvcmntrngloginfoVO selectComtnntwrksvcmntrngloginfo(ComtnntwrksvcmntrngloginfoVO vo) throws Exception {
        return (ComtnntwrksvcmntrngloginfoVO) selectByPk("comtnntwrksvcmntrngloginfoDAO.selectComtnntwrksvcmntrngloginfo_S", vo);
    }

    /**
	 * comtnntwrksvcmntrngloginfo 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnntwrksvcmntrngloginfo 목록
	 * @exception Exception
	 */
    public List selectComtnntwrksvcmntrngloginfoList(ComtnntwrksvcmntrngloginfoDefaultVO searchVO) throws Exception {
        return list("comtnntwrksvcmntrngloginfoDAO.selectComtnntwrksvcmntrngloginfoList_D", searchVO);
    }

    /**
	 * comtnntwrksvcmntrngloginfo 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnntwrksvcmntrngloginfo 총 갯수
	 * @exception
	 */
    public int selectComtnntwrksvcmntrngloginfoListTotCnt(ComtnntwrksvcmntrngloginfoDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnntwrksvcmntrngloginfoDAO.selectComtnntwrksvcmntrngloginfoListTotCnt_S", searchVO);
    }

}
