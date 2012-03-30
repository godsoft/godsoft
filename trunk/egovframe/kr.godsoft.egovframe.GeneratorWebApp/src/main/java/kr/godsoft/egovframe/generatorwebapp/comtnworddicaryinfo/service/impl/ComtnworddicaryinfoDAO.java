package kr.godsoft.egovframe.generatorwebapp.comtnworddicaryinfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnworddicaryinfo.service.ComtnworddicaryinfoVO;

/**
 * @Class Name : ComtnworddicaryinfoDAO.java
 * @Description : Comtnworddicaryinfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnworddicaryinfoDAO")
public class ComtnworddicaryinfoDAO extends EgovAbstractDAO {

	/**
	 * COMTNWORDDICARYINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnworddicaryinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnworddicaryinfo(ComtnworddicaryinfoVO vo) throws Exception {
        return (String)insert("comtnworddicaryinfoDAO.insertComtnworddicaryinfo_S", vo);
    }

    /**
	 * COMTNWORDDICARYINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnworddicaryinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnworddicaryinfo(ComtnworddicaryinfoVO vo) throws Exception {
        update("comtnworddicaryinfoDAO.updateComtnworddicaryinfo_S", vo);
    }

    /**
	 * COMTNWORDDICARYINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnworddicaryinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnworddicaryinfo(ComtnworddicaryinfoVO vo) throws Exception {
        delete("comtnworddicaryinfoDAO.deleteComtnworddicaryinfo_S", vo);
    }

    /**
	 * COMTNWORDDICARYINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnworddicaryinfoVO
	 * @return 조회한 COMTNWORDDICARYINFO
	 * @exception Exception
	 */
    public ComtnworddicaryinfoVO selectComtnworddicaryinfo(ComtnworddicaryinfoVO vo) throws Exception {
        return (ComtnworddicaryinfoVO) selectByPk("comtnworddicaryinfoDAO.selectComtnworddicaryinfo_S", vo);
    }

    /**
	 * COMTNWORDDICARYINFO 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNWORDDICARYINFO 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnworddicaryinfoList(ComtnworddicaryinfoVO vo) throws Exception {
        return list("comtnworddicaryinfoDAO.selectComtnworddicaryinfoList_D", vo);
    }

    /**
	 * COMTNWORDDICARYINFO 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNWORDDICARYINFO 총 갯수
	 * @exception
	 */
    public int selectComtnworddicaryinfoListTotCnt(ComtnworddicaryinfoVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnworddicaryinfoDAO.selectComtnworddicaryinfoListTotCnt_S", vo);
    }

}
