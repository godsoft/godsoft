package kr.godsoft.egovframe.generatorwebapp.comtnmtginfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnmtginfo.service.ComtnmtginfoVO;

/**
 * @Class Name : ComtnmtginfoDAO.java
 * @Description : Comtnmtginfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnmtginfoDAO")
public class ComtnmtginfoDAO extends EgovAbstractDAO {

	/**
	 * comtnmtginfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnmtginfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnmtginfo(ComtnmtginfoVO vo) throws Exception {
        return (String)insert("comtnmtginfoDAO.insertComtnmtginfo_S", vo);
    }

    /**
	 * comtnmtginfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnmtginfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnmtginfo(ComtnmtginfoVO vo) throws Exception {
        update("comtnmtginfoDAO.updateComtnmtginfo_S", vo);
    }

    /**
	 * comtnmtginfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnmtginfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnmtginfo(ComtnmtginfoVO vo) throws Exception {
        delete("comtnmtginfoDAO.deleteComtnmtginfo_S", vo);
    }

    /**
	 * comtnmtginfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnmtginfoVO
	 * @return 조회한 comtnmtginfo
	 * @exception Exception
	 */
    public ComtnmtginfoVO selectComtnmtginfo(ComtnmtginfoVO vo) throws Exception {
        return (ComtnmtginfoVO) selectByPk("comtnmtginfoDAO.selectComtnmtginfo_S", vo);
    }

    /**
	 * comtnmtginfo 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnmtginfo 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnmtginfoList(ComtnmtginfoVO vo) throws Exception {
        return list("comtnmtginfoDAO.selectComtnmtginfoList_D", vo);
    }

    /**
	 * comtnmtginfo 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnmtginfo 총 갯수
	 * @exception
	 */
    public int selectComtnmtginfoListTotCnt(ComtnmtginfoVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnmtginfoDAO.selectComtnmtginfoListTotCnt_S", vo);
    }

}
