package kr.godsoft.egovframe.generatorwebapp.comtnfilesysmntrng.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtnfilesysmntrng.service.ComtnfilesysmntrngVO;
import kr.godsoft.egovframe.generatorwebapp.comtnfilesysmntrng.service.ComtnfilesysmntrngDefaultVO;

/**
 * @Class Name : ComtnfilesysmntrngDAO.java
 * @Description : Comtnfilesysmntrng DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnfilesysmntrngDAO")
public class ComtnfilesysmntrngDAO extends EgovAbstractDAO {

	/**
	 * comtnfilesysmntrng을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnfilesysmntrngVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnfilesysmntrng(ComtnfilesysmntrngVO vo) throws Exception {
        return (String)insert("comtnfilesysmntrngDAO.insertComtnfilesysmntrng_S", vo);
    }

    /**
	 * comtnfilesysmntrng을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnfilesysmntrngVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnfilesysmntrng(ComtnfilesysmntrngVO vo) throws Exception {
        update("comtnfilesysmntrngDAO.updateComtnfilesysmntrng_S", vo);
    }

    /**
	 * comtnfilesysmntrng을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnfilesysmntrngVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnfilesysmntrng(ComtnfilesysmntrngVO vo) throws Exception {
        delete("comtnfilesysmntrngDAO.deleteComtnfilesysmntrng_S", vo);
    }

    /**
	 * comtnfilesysmntrng을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnfilesysmntrngVO
	 * @return 조회한 comtnfilesysmntrng
	 * @exception Exception
	 */
    public ComtnfilesysmntrngVO selectComtnfilesysmntrng(ComtnfilesysmntrngVO vo) throws Exception {
        return (ComtnfilesysmntrngVO) selectByPk("comtnfilesysmntrngDAO.selectComtnfilesysmntrng_S", vo);
    }

    /**
	 * comtnfilesysmntrng 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnfilesysmntrng 목록
	 * @exception Exception
	 */
    public List selectComtnfilesysmntrngList(ComtnfilesysmntrngDefaultVO searchVO) throws Exception {
        return list("comtnfilesysmntrngDAO.selectComtnfilesysmntrngList_D", searchVO);
    }

    /**
	 * comtnfilesysmntrng 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnfilesysmntrng 총 갯수
	 * @exception
	 */
    public int selectComtnfilesysmntrngListTotCnt(ComtnfilesysmntrngDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnfilesysmntrngDAO.selectComtnfilesysmntrngListTotCnt_S", searchVO);
    }

}
