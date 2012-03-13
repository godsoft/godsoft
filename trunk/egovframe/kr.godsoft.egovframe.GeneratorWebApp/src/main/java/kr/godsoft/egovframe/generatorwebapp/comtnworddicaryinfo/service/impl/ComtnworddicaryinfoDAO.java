package kr.godsoft.egovframe.generatorwebapp.comtnworddicaryinfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtnworddicaryinfo.service.ComtnworddicaryinfoVO;
import kr.godsoft.egovframe.generatorwebapp.comtnworddicaryinfo.service.ComtnworddicaryinfoDefaultVO;

/**
 * @Class Name : ComtnworddicaryinfoDAO.java
 * @Description : Comtnworddicaryinfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnworddicaryinfoDAO")
public class ComtnworddicaryinfoDAO extends EgovAbstractDAO {

	/**
	 * comtnworddicaryinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnworddicaryinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnworddicaryinfo(ComtnworddicaryinfoVO vo) throws Exception {
        return (String)insert("comtnworddicaryinfoDAO.insertComtnworddicaryinfo_S", vo);
    }

    /**
	 * comtnworddicaryinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnworddicaryinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnworddicaryinfo(ComtnworddicaryinfoVO vo) throws Exception {
        update("comtnworddicaryinfoDAO.updateComtnworddicaryinfo_S", vo);
    }

    /**
	 * comtnworddicaryinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnworddicaryinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnworddicaryinfo(ComtnworddicaryinfoVO vo) throws Exception {
        delete("comtnworddicaryinfoDAO.deleteComtnworddicaryinfo_S", vo);
    }

    /**
	 * comtnworddicaryinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnworddicaryinfoVO
	 * @return 조회한 comtnworddicaryinfo
	 * @exception Exception
	 */
    public ComtnworddicaryinfoVO selectComtnworddicaryinfo(ComtnworddicaryinfoVO vo) throws Exception {
        return (ComtnworddicaryinfoVO) selectByPk("comtnworddicaryinfoDAO.selectComtnworddicaryinfo_S", vo);
    }

    /**
	 * comtnworddicaryinfo 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnworddicaryinfo 목록
	 * @exception Exception
	 */
    public List selectComtnworddicaryinfoList(ComtnworddicaryinfoDefaultVO searchVO) throws Exception {
        return list("comtnworddicaryinfoDAO.selectComtnworddicaryinfoList_D", searchVO);
    }

    /**
	 * comtnworddicaryinfo 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnworddicaryinfo 총 갯수
	 * @exception
	 */
    public int selectComtnworddicaryinfoListTotCnt(ComtnworddicaryinfoDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnworddicaryinfoDAO.selectComtnworddicaryinfoListTotCnt_S", searchVO);
    }

}
