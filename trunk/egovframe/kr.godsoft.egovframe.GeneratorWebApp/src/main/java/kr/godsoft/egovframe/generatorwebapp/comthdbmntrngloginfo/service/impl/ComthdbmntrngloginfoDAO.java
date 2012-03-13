package kr.godsoft.egovframe.generatorwebapp.comthdbmntrngloginfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comthdbmntrngloginfo.service.ComthdbmntrngloginfoVO;
import kr.godsoft.egovframe.generatorwebapp.comthdbmntrngloginfo.service.ComthdbmntrngloginfoDefaultVO;

/**
 * @Class Name : ComthdbmntrngloginfoDAO.java
 * @Description : Comthdbmntrngloginfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
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
    public List selectComthdbmntrngloginfoList(ComthdbmntrngloginfoDefaultVO searchVO) throws Exception {
        return list("comthdbmntrngloginfoDAO.selectComthdbmntrngloginfoList_D", searchVO);
    }

    /**
	 * comthdbmntrngloginfo 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comthdbmntrngloginfo 총 갯수
	 * @exception
	 */
    public int selectComthdbmntrngloginfoListTotCnt(ComthdbmntrngloginfoDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comthdbmntrngloginfoDAO.selectComthdbmntrngloginfoListTotCnt_S", searchVO);
    }

}
