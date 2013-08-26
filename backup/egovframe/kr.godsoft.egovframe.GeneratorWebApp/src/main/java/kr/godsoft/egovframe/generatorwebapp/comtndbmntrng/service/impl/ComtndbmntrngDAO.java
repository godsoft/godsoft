package kr.godsoft.egovframe.generatorwebapp.comtndbmntrng.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtndbmntrng.service.ComtndbmntrngVO;

/**
 * @Class Name : ComtndbmntrngDAO.java
 * @Description : Comtndbmntrng DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtndbmntrngDAO")
public class ComtndbmntrngDAO extends EgovAbstractDAO {

	/**
	 * COMTNDBMNTRNG을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtndbmntrngVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtndbmntrng(ComtndbmntrngVO vo) throws Exception {
        return (String)insert("comtndbmntrngDAO.insertComtndbmntrng_S", vo);
    }

    /**
	 * COMTNDBMNTRNG을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtndbmntrngVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtndbmntrng(ComtndbmntrngVO vo) throws Exception {
        update("comtndbmntrngDAO.updateComtndbmntrng_S", vo);
    }

    /**
	 * COMTNDBMNTRNG을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtndbmntrngVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtndbmntrng(ComtndbmntrngVO vo) throws Exception {
        delete("comtndbmntrngDAO.deleteComtndbmntrng_S", vo);
    }

    /**
	 * COMTNDBMNTRNG을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtndbmntrngVO
	 * @return 조회한 COMTNDBMNTRNG
	 * @exception Exception
	 */
    public ComtndbmntrngVO selectComtndbmntrng(ComtndbmntrngVO vo) throws Exception {
        return (ComtndbmntrngVO) selectByPk("comtndbmntrngDAO.selectComtndbmntrng_S", vo);
    }

    /**
	 * COMTNDBMNTRNG 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNDBMNTRNG 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtndbmntrngList(ComtndbmntrngVO vo) throws Exception {
        return list("comtndbmntrngDAO.selectComtndbmntrngList_D", vo);
    }

    /**
	 * COMTNDBMNTRNG 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNDBMNTRNG 총 갯수
	 * @exception
	 */
    public int selectComtndbmntrngListTotCnt(ComtndbmntrngVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtndbmntrngDAO.selectComtndbmntrngListTotCnt_S", vo);
    }

}