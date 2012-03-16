package kr.godsoft.egovframe.generatorwebapp.comtnntwrksvcmntrng.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnntwrksvcmntrng.service.ComtnntwrksvcmntrngVO;

/**
 * @Class Name : ComtnntwrksvcmntrngDAO.java
 * @Description : Comtnntwrksvcmntrng DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnntwrksvcmntrngDAO")
public class ComtnntwrksvcmntrngDAO extends EgovAbstractDAO {

	/**
	 * comtnntwrksvcmntrng을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnntwrksvcmntrngVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnntwrksvcmntrng(ComtnntwrksvcmntrngVO vo) throws Exception {
        return (String)insert("comtnntwrksvcmntrngDAO.insertComtnntwrksvcmntrng_S", vo);
    }

    /**
	 * comtnntwrksvcmntrng을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnntwrksvcmntrngVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnntwrksvcmntrng(ComtnntwrksvcmntrngVO vo) throws Exception {
        update("comtnntwrksvcmntrngDAO.updateComtnntwrksvcmntrng_S", vo);
    }

    /**
	 * comtnntwrksvcmntrng을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnntwrksvcmntrngVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnntwrksvcmntrng(ComtnntwrksvcmntrngVO vo) throws Exception {
        delete("comtnntwrksvcmntrngDAO.deleteComtnntwrksvcmntrng_S", vo);
    }

    /**
	 * comtnntwrksvcmntrng을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnntwrksvcmntrngVO
	 * @return 조회한 comtnntwrksvcmntrng
	 * @exception Exception
	 */
    public ComtnntwrksvcmntrngVO selectComtnntwrksvcmntrng(ComtnntwrksvcmntrngVO vo) throws Exception {
        return (ComtnntwrksvcmntrngVO) selectByPk("comtnntwrksvcmntrngDAO.selectComtnntwrksvcmntrng_S", vo);
    }

    /**
	 * comtnntwrksvcmntrng 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnntwrksvcmntrng 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnntwrksvcmntrngList(ComtnntwrksvcmntrngVO vo) throws Exception {
        return list("comtnntwrksvcmntrngDAO.selectComtnntwrksvcmntrngList_D", vo);
    }

    /**
	 * comtnntwrksvcmntrng 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnntwrksvcmntrng 총 갯수
	 * @exception
	 */
    public int selectComtnntwrksvcmntrngListTotCnt(ComtnntwrksvcmntrngVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnntwrksvcmntrngDAO.selectComtnntwrksvcmntrngListTotCnt_S", vo);
    }

}
