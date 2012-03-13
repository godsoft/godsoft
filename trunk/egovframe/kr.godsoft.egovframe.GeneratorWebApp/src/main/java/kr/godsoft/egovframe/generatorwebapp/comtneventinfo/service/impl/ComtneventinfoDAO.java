package kr.godsoft.egovframe.generatorwebapp.comtneventinfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtneventinfo.service.ComtneventinfoVO;
import kr.godsoft.egovframe.generatorwebapp.comtneventinfo.service.ComtneventinfoDefaultVO;

/**
 * @Class Name : ComtneventinfoDAO.java
 * @Description : Comtneventinfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtneventinfoDAO")
public class ComtneventinfoDAO extends EgovAbstractDAO {

	/**
	 * comtneventinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtneventinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtneventinfo(ComtneventinfoVO vo) throws Exception {
        return (String)insert("comtneventinfoDAO.insertComtneventinfo_S", vo);
    }

    /**
	 * comtneventinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtneventinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtneventinfo(ComtneventinfoVO vo) throws Exception {
        update("comtneventinfoDAO.updateComtneventinfo_S", vo);
    }

    /**
	 * comtneventinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtneventinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtneventinfo(ComtneventinfoVO vo) throws Exception {
        delete("comtneventinfoDAO.deleteComtneventinfo_S", vo);
    }

    /**
	 * comtneventinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtneventinfoVO
	 * @return 조회한 comtneventinfo
	 * @exception Exception
	 */
    public ComtneventinfoVO selectComtneventinfo(ComtneventinfoVO vo) throws Exception {
        return (ComtneventinfoVO) selectByPk("comtneventinfoDAO.selectComtneventinfo_S", vo);
    }

    /**
	 * comtneventinfo 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtneventinfo 목록
	 * @exception Exception
	 */
    public List selectComtneventinfoList(ComtneventinfoDefaultVO searchVO) throws Exception {
        return list("comtneventinfoDAO.selectComtneventinfoList_D", searchVO);
    }

    /**
	 * comtneventinfo 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtneventinfo 총 갯수
	 * @exception
	 */
    public int selectComtneventinfoListTotCnt(ComtneventinfoDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtneventinfoDAO.selectComtneventinfoListTotCnt_S", searchVO);
    }

}
