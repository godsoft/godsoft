package kr.godsoft.egovframe.generatorwebapp.comthdbmntrngloginfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comthdbmntrngloginfo.service.ComthdbmntrngloginfoVO;

/**
 * @Class Name : ComthdbmntrngloginfoDAO.java
 * @Description : Comthdbmntrngloginfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comthdbmntrngloginfoDAO")
public class ComthdbmntrngloginfoDAO extends EgovAbstractDAO {

	/**
	 * comthdbmntrngloginfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComthdbmntrngloginfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComthdbmntrngloginfo(ComthdbmntrngloginfoVO vo) throws Exception {
        return (String)insert("comthdbmntrngloginfoDAO.insertComthdbmntrngloginfo_S", vo);
    }

    /**
	 * comthdbmntrngloginfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComthdbmntrngloginfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComthdbmntrngloginfo(ComthdbmntrngloginfoVO vo) throws Exception {
        update("comthdbmntrngloginfoDAO.updateComthdbmntrngloginfo_S", vo);
    }

    /**
	 * comthdbmntrngloginfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComthdbmntrngloginfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComthdbmntrngloginfo(ComthdbmntrngloginfoVO vo) throws Exception {
        delete("comthdbmntrngloginfoDAO.deleteComthdbmntrngloginfo_S", vo);
    }

    /**
	 * comthdbmntrngloginfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComthdbmntrngloginfoVO
	 * @return 조회한 comthdbmntrngloginfo
	 * @exception Exception
	 */
    public ComthdbmntrngloginfoVO selectComthdbmntrngloginfo(ComthdbmntrngloginfoVO vo) throws Exception {
        return (ComthdbmntrngloginfoVO) selectByPk("comthdbmntrngloginfoDAO.selectComthdbmntrngloginfo_S", vo);
    }

    /**
	 * comthdbmntrngloginfo 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comthdbmntrngloginfo 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComthdbmntrngloginfoList(ComthdbmntrngloginfoVO vo) throws Exception {
        return list("comthdbmntrngloginfoDAO.selectComthdbmntrngloginfoList_D", vo);
    }

    /**
	 * comthdbmntrngloginfo 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comthdbmntrngloginfo 총 갯수
	 * @exception
	 */
    public int selectComthdbmntrngloginfoListTotCnt(ComthdbmntrngloginfoVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comthdbmntrngloginfoDAO.selectComthdbmntrngloginfoListTotCnt_S", vo);
    }

}
