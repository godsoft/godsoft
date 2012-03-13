package kr.godsoft.egovframe.generatorwebapp.comtndiaryinfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtndiaryinfo.service.ComtndiaryinfoVO;
import kr.godsoft.egovframe.generatorwebapp.comtndiaryinfo.service.ComtndiaryinfoDefaultVO;

/**
 * @Class Name : ComtndiaryinfoDAO.java
 * @Description : Comtndiaryinfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtndiaryinfoDAO")
public class ComtndiaryinfoDAO extends EgovAbstractDAO {

	/**
	 * comtndiaryinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtndiaryinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtndiaryinfo(ComtndiaryinfoVO vo) throws Exception {
        return (String)insert("comtndiaryinfoDAO.insertComtndiaryinfo_S", vo);
    }

    /**
	 * comtndiaryinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtndiaryinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtndiaryinfo(ComtndiaryinfoVO vo) throws Exception {
        update("comtndiaryinfoDAO.updateComtndiaryinfo_S", vo);
    }

    /**
	 * comtndiaryinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtndiaryinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtndiaryinfo(ComtndiaryinfoVO vo) throws Exception {
        delete("comtndiaryinfoDAO.deleteComtndiaryinfo_S", vo);
    }

    /**
	 * comtndiaryinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtndiaryinfoVO
	 * @return 조회한 comtndiaryinfo
	 * @exception Exception
	 */
    public ComtndiaryinfoVO selectComtndiaryinfo(ComtndiaryinfoVO vo) throws Exception {
        return (ComtndiaryinfoVO) selectByPk("comtndiaryinfoDAO.selectComtndiaryinfo_S", vo);
    }

    /**
	 * comtndiaryinfo 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtndiaryinfo 목록
	 * @exception Exception
	 */
    public List selectComtndiaryinfoList(ComtndiaryinfoDefaultVO searchVO) throws Exception {
        return list("comtndiaryinfoDAO.selectComtndiaryinfoList_D", searchVO);
    }

    /**
	 * comtndiaryinfo 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtndiaryinfo 총 갯수
	 * @exception
	 */
    public int selectComtndiaryinfoListTotCnt(ComtndiaryinfoDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtndiaryinfoDAO.selectComtndiaryinfoListTotCnt_S", searchVO);
    }

}
