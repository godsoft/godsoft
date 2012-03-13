package kr.godsoft.egovframe.generatorwebapp.comthtrsmrcvmntrngloginfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comthtrsmrcvmntrngloginfo.service.ComthtrsmrcvmntrngloginfoVO;
import kr.godsoft.egovframe.generatorwebapp.comthtrsmrcvmntrngloginfo.service.ComthtrsmrcvmntrngloginfoDefaultVO;

/**
 * @Class Name : ComthtrsmrcvmntrngloginfoDAO.java
 * @Description : Comthtrsmrcvmntrngloginfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comthtrsmrcvmntrngloginfoDAO")
public class ComthtrsmrcvmntrngloginfoDAO extends EgovAbstractDAO {

	/**
	 * comthtrsmrcvmntrngloginfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComthtrsmrcvmntrngloginfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComthtrsmrcvmntrngloginfo(ComthtrsmrcvmntrngloginfoVO vo) throws Exception {
        return (String)insert("comthtrsmrcvmntrngloginfoDAO.insertComthtrsmrcvmntrngloginfo_S", vo);
    }

    /**
	 * comthtrsmrcvmntrngloginfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComthtrsmrcvmntrngloginfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComthtrsmrcvmntrngloginfo(ComthtrsmrcvmntrngloginfoVO vo) throws Exception {
        update("comthtrsmrcvmntrngloginfoDAO.updateComthtrsmrcvmntrngloginfo_S", vo);
    }

    /**
	 * comthtrsmrcvmntrngloginfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComthtrsmrcvmntrngloginfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComthtrsmrcvmntrngloginfo(ComthtrsmrcvmntrngloginfoVO vo) throws Exception {
        delete("comthtrsmrcvmntrngloginfoDAO.deleteComthtrsmrcvmntrngloginfo_S", vo);
    }

    /**
	 * comthtrsmrcvmntrngloginfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComthtrsmrcvmntrngloginfoVO
	 * @return 조회한 comthtrsmrcvmntrngloginfo
	 * @exception Exception
	 */
    public ComthtrsmrcvmntrngloginfoVO selectComthtrsmrcvmntrngloginfo(ComthtrsmrcvmntrngloginfoVO vo) throws Exception {
        return (ComthtrsmrcvmntrngloginfoVO) selectByPk("comthtrsmrcvmntrngloginfoDAO.selectComthtrsmrcvmntrngloginfo_S", vo);
    }

    /**
	 * comthtrsmrcvmntrngloginfo 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comthtrsmrcvmntrngloginfo 목록
	 * @exception Exception
	 */
    public List selectComthtrsmrcvmntrngloginfoList(ComthtrsmrcvmntrngloginfoDefaultVO searchVO) throws Exception {
        return list("comthtrsmrcvmntrngloginfoDAO.selectComthtrsmrcvmntrngloginfoList_D", searchVO);
    }

    /**
	 * comthtrsmrcvmntrngloginfo 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comthtrsmrcvmntrngloginfo 총 갯수
	 * @exception
	 */
    public int selectComthtrsmrcvmntrngloginfoListTotCnt(ComthtrsmrcvmntrngloginfoDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comthtrsmrcvmntrngloginfoDAO.selectComthtrsmrcvmntrngloginfoListTotCnt_S", searchVO);
    }

}