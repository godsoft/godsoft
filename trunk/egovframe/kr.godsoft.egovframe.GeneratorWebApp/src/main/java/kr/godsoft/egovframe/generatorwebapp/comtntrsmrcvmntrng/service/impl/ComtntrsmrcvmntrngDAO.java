package kr.godsoft.egovframe.generatorwebapp.comtntrsmrcvmntrng.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtntrsmrcvmntrng.service.ComtntrsmrcvmntrngVO;

/**
 * @Class Name : ComtntrsmrcvmntrngDAO.java
 * @Description : Comtntrsmrcvmntrng DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtntrsmrcvmntrngDAO")
public class ComtntrsmrcvmntrngDAO extends EgovAbstractDAO {

	/**
	 * comtntrsmrcvmntrng을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtntrsmrcvmntrngVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtntrsmrcvmntrng(ComtntrsmrcvmntrngVO vo) throws Exception {
        return (String)insert("comtntrsmrcvmntrngDAO.insertComtntrsmrcvmntrng_S", vo);
    }

    /**
	 * comtntrsmrcvmntrng을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtntrsmrcvmntrngVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtntrsmrcvmntrng(ComtntrsmrcvmntrngVO vo) throws Exception {
        update("comtntrsmrcvmntrngDAO.updateComtntrsmrcvmntrng_S", vo);
    }

    /**
	 * comtntrsmrcvmntrng을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtntrsmrcvmntrngVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtntrsmrcvmntrng(ComtntrsmrcvmntrngVO vo) throws Exception {
        delete("comtntrsmrcvmntrngDAO.deleteComtntrsmrcvmntrng_S", vo);
    }

    /**
	 * comtntrsmrcvmntrng을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtntrsmrcvmntrngVO
	 * @return 조회한 comtntrsmrcvmntrng
	 * @exception Exception
	 */
    public ComtntrsmrcvmntrngVO selectComtntrsmrcvmntrng(ComtntrsmrcvmntrngVO vo) throws Exception {
        return (ComtntrsmrcvmntrngVO) selectByPk("comtntrsmrcvmntrngDAO.selectComtntrsmrcvmntrng_S", vo);
    }

    /**
	 * comtntrsmrcvmntrng 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtntrsmrcvmntrng 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtntrsmrcvmntrngList(ComtntrsmrcvmntrngVO vo) throws Exception {
        return list("comtntrsmrcvmntrngDAO.selectComtntrsmrcvmntrngList_D", vo);
    }

    /**
	 * comtntrsmrcvmntrng 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtntrsmrcvmntrng 총 갯수
	 * @exception
	 */
    public int selectComtntrsmrcvmntrngListTotCnt(ComtntrsmrcvmntrngVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtntrsmrcvmntrngDAO.selectComtntrsmrcvmntrngListTotCnt_S", vo);
    }

}
