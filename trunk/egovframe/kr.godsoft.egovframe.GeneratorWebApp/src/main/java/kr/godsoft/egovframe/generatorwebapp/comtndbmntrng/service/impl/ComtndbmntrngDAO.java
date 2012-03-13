package kr.godsoft.egovframe.generatorwebapp.comtndbmntrng.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtndbmntrng.service.ComtndbmntrngVO;
import kr.godsoft.egovframe.generatorwebapp.comtndbmntrng.service.ComtndbmntrngDefaultVO;

/**
 * @Class Name : ComtndbmntrngDAO.java
 * @Description : Comtndbmntrng DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtndbmntrngDAO")
public class ComtndbmntrngDAO extends EgovAbstractDAO {

	/**
	 * comtndbmntrng을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtndbmntrngVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtndbmntrng(ComtndbmntrngVO vo) throws Exception {
        return (String)insert("comtndbmntrngDAO.insertComtndbmntrng_S", vo);
    }

    /**
	 * comtndbmntrng을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtndbmntrngVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtndbmntrng(ComtndbmntrngVO vo) throws Exception {
        update("comtndbmntrngDAO.updateComtndbmntrng_S", vo);
    }

    /**
	 * comtndbmntrng을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtndbmntrngVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtndbmntrng(ComtndbmntrngVO vo) throws Exception {
        delete("comtndbmntrngDAO.deleteComtndbmntrng_S", vo);
    }

    /**
	 * comtndbmntrng을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtndbmntrngVO
	 * @return 조회한 comtndbmntrng
	 * @exception Exception
	 */
    public ComtndbmntrngVO selectComtndbmntrng(ComtndbmntrngVO vo) throws Exception {
        return (ComtndbmntrngVO) selectByPk("comtndbmntrngDAO.selectComtndbmntrng_S", vo);
    }

    /**
	 * comtndbmntrng 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtndbmntrng 목록
	 * @exception Exception
	 */
    public List selectComtndbmntrngList(ComtndbmntrngDefaultVO searchVO) throws Exception {
        return list("comtndbmntrngDAO.selectComtndbmntrngList_D", searchVO);
    }

    /**
	 * comtndbmntrng 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtndbmntrng 총 갯수
	 * @exception
	 */
    public int selectComtndbmntrngListTotCnt(ComtndbmntrngDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtndbmntrngDAO.selectComtndbmntrngListTotCnt_S", searchVO);
    }

}
