package kr.godsoft.egovframe.generatorwebapp.comtnfilesysmntrngloginfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnfilesysmntrngloginfo.service.ComtnfilesysmntrngloginfoVO;

/**
 * @Class Name : ComtnfilesysmntrngloginfoDAO.java
 * @Description : Comtnfilesysmntrngloginfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnfilesysmntrngloginfoDAO")
public class ComtnfilesysmntrngloginfoDAO extends EgovAbstractDAO {

	/**
	 * comtnfilesysmntrngloginfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnfilesysmntrngloginfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnfilesysmntrngloginfo(ComtnfilesysmntrngloginfoVO vo) throws Exception {
        return (String)insert("comtnfilesysmntrngloginfoDAO.insertComtnfilesysmntrngloginfo_S", vo);
    }

    /**
	 * comtnfilesysmntrngloginfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnfilesysmntrngloginfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnfilesysmntrngloginfo(ComtnfilesysmntrngloginfoVO vo) throws Exception {
        update("comtnfilesysmntrngloginfoDAO.updateComtnfilesysmntrngloginfo_S", vo);
    }

    /**
	 * comtnfilesysmntrngloginfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnfilesysmntrngloginfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnfilesysmntrngloginfo(ComtnfilesysmntrngloginfoVO vo) throws Exception {
        delete("comtnfilesysmntrngloginfoDAO.deleteComtnfilesysmntrngloginfo_S", vo);
    }

    /**
	 * comtnfilesysmntrngloginfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnfilesysmntrngloginfoVO
	 * @return 조회한 comtnfilesysmntrngloginfo
	 * @exception Exception
	 */
    public ComtnfilesysmntrngloginfoVO selectComtnfilesysmntrngloginfo(ComtnfilesysmntrngloginfoVO vo) throws Exception {
        return (ComtnfilesysmntrngloginfoVO) selectByPk("comtnfilesysmntrngloginfoDAO.selectComtnfilesysmntrngloginfo_S", vo);
    }

    /**
	 * comtnfilesysmntrngloginfo 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnfilesysmntrngloginfo 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnfilesysmntrngloginfoList(ComtnfilesysmntrngloginfoVO vo) throws Exception {
        return list("comtnfilesysmntrngloginfoDAO.selectComtnfilesysmntrngloginfoList_D", vo);
    }

    /**
	 * comtnfilesysmntrngloginfo 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnfilesysmntrngloginfo 총 갯수
	 * @exception
	 */
    public int selectComtnfilesysmntrngloginfoListTotCnt(ComtnfilesysmntrngloginfoVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnfilesysmntrngloginfoDAO.selectComtnfilesysmntrngloginfoListTotCnt_S", vo);
    }

}
