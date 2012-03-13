package kr.godsoft.egovframe.generatorwebapp.comtnemplyrinfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtnemplyrinfo.service.ComtnemplyrinfoVO;
import kr.godsoft.egovframe.generatorwebapp.comtnemplyrinfo.service.ComtnemplyrinfoDefaultVO;

/**
 * @Class Name : ComtnemplyrinfoDAO.java
 * @Description : Comtnemplyrinfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnemplyrinfoDAO")
public class ComtnemplyrinfoDAO extends EgovAbstractDAO {

	/**
	 * comtnemplyrinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnemplyrinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnemplyrinfo(ComtnemplyrinfoVO vo) throws Exception {
        return (String)insert("comtnemplyrinfoDAO.insertComtnemplyrinfo_S", vo);
    }

    /**
	 * comtnemplyrinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnemplyrinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnemplyrinfo(ComtnemplyrinfoVO vo) throws Exception {
        update("comtnemplyrinfoDAO.updateComtnemplyrinfo_S", vo);
    }

    /**
	 * comtnemplyrinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnemplyrinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnemplyrinfo(ComtnemplyrinfoVO vo) throws Exception {
        delete("comtnemplyrinfoDAO.deleteComtnemplyrinfo_S", vo);
    }

    /**
	 * comtnemplyrinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnemplyrinfoVO
	 * @return 조회한 comtnemplyrinfo
	 * @exception Exception
	 */
    public ComtnemplyrinfoVO selectComtnemplyrinfo(ComtnemplyrinfoVO vo) throws Exception {
        return (ComtnemplyrinfoVO) selectByPk("comtnemplyrinfoDAO.selectComtnemplyrinfo_S", vo);
    }

    /**
	 * comtnemplyrinfo 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnemplyrinfo 목록
	 * @exception Exception
	 */
    public List selectComtnemplyrinfoList(ComtnemplyrinfoDefaultVO searchVO) throws Exception {
        return list("comtnemplyrinfoDAO.selectComtnemplyrinfoList_D", searchVO);
    }

    /**
	 * comtnemplyrinfo 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnemplyrinfo 총 갯수
	 * @exception
	 */
    public int selectComtnemplyrinfoListTotCnt(ComtnemplyrinfoDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnemplyrinfoDAO.selectComtnemplyrinfoListTotCnt_S", searchVO);
    }

}
