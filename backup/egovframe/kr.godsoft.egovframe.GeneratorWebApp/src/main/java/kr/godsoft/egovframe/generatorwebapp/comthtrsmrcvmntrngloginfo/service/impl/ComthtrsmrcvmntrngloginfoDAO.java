package kr.godsoft.egovframe.generatorwebapp.comthtrsmrcvmntrngloginfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comthtrsmrcvmntrngloginfo.service.ComthtrsmrcvmntrngloginfoVO;

/**
 * @Class Name : ComthtrsmrcvmntrngloginfoDAO.java
 * @Description : Comthtrsmrcvmntrngloginfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comthtrsmrcvmntrngloginfoDAO")
public class ComthtrsmrcvmntrngloginfoDAO extends EgovAbstractDAO {

	/**
	 * COMTHTRSMRCVMNTRNGLOGINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComthtrsmrcvmntrngloginfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComthtrsmrcvmntrngloginfo(ComthtrsmrcvmntrngloginfoVO vo) throws Exception {
        return (String)insert("comthtrsmrcvmntrngloginfoDAO.insertComthtrsmrcvmntrngloginfo_S", vo);
    }

    /**
	 * COMTHTRSMRCVMNTRNGLOGINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComthtrsmrcvmntrngloginfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComthtrsmrcvmntrngloginfo(ComthtrsmrcvmntrngloginfoVO vo) throws Exception {
        update("comthtrsmrcvmntrngloginfoDAO.updateComthtrsmrcvmntrngloginfo_S", vo);
    }

    /**
	 * COMTHTRSMRCVMNTRNGLOGINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComthtrsmrcvmntrngloginfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComthtrsmrcvmntrngloginfo(ComthtrsmrcvmntrngloginfoVO vo) throws Exception {
        delete("comthtrsmrcvmntrngloginfoDAO.deleteComthtrsmrcvmntrngloginfo_S", vo);
    }

    /**
	 * COMTHTRSMRCVMNTRNGLOGINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComthtrsmrcvmntrngloginfoVO
	 * @return 조회한 COMTHTRSMRCVMNTRNGLOGINFO
	 * @exception Exception
	 */
    public ComthtrsmrcvmntrngloginfoVO selectComthtrsmrcvmntrngloginfo(ComthtrsmrcvmntrngloginfoVO vo) throws Exception {
        return (ComthtrsmrcvmntrngloginfoVO) selectByPk("comthtrsmrcvmntrngloginfoDAO.selectComthtrsmrcvmntrngloginfo_S", vo);
    }

    /**
	 * COMTHTRSMRCVMNTRNGLOGINFO 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTHTRSMRCVMNTRNGLOGINFO 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComthtrsmrcvmntrngloginfoList(ComthtrsmrcvmntrngloginfoVO vo) throws Exception {
        return list("comthtrsmrcvmntrngloginfoDAO.selectComthtrsmrcvmntrngloginfoList_D", vo);
    }

    /**
	 * COMTHTRSMRCVMNTRNGLOGINFO 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTHTRSMRCVMNTRNGLOGINFO 총 갯수
	 * @exception
	 */
    public int selectComthtrsmrcvmntrngloginfoListTotCnt(ComthtrsmrcvmntrngloginfoVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comthtrsmrcvmntrngloginfoDAO.selectComthtrsmrcvmntrngloginfoListTotCnt_S", vo);
    }

}
