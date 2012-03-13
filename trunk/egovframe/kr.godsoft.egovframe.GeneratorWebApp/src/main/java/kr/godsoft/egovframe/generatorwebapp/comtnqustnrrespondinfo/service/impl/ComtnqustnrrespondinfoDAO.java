package kr.godsoft.egovframe.generatorwebapp.comtnqustnrrespondinfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnrrespondinfo.service.ComtnqustnrrespondinfoVO;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnrrespondinfo.service.ComtnqustnrrespondinfoDefaultVO;

/**
 * @Class Name : ComtnqustnrrespondinfoDAO.java
 * @Description : Comtnqustnrrespondinfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnqustnrrespondinfoDAO")
public class ComtnqustnrrespondinfoDAO extends EgovAbstractDAO {

	/**
	 * comtnqustnrrespondinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnqustnrrespondinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnqustnrrespondinfo(ComtnqustnrrespondinfoVO vo) throws Exception {
        return (String)insert("comtnqustnrrespondinfoDAO.insertComtnqustnrrespondinfo_S", vo);
    }

    /**
	 * comtnqustnrrespondinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnqustnrrespondinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnqustnrrespondinfo(ComtnqustnrrespondinfoVO vo) throws Exception {
        update("comtnqustnrrespondinfoDAO.updateComtnqustnrrespondinfo_S", vo);
    }

    /**
	 * comtnqustnrrespondinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnqustnrrespondinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnqustnrrespondinfo(ComtnqustnrrespondinfoVO vo) throws Exception {
        delete("comtnqustnrrespondinfoDAO.deleteComtnqustnrrespondinfo_S", vo);
    }

    /**
	 * comtnqustnrrespondinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnqustnrrespondinfoVO
	 * @return 조회한 comtnqustnrrespondinfo
	 * @exception Exception
	 */
    public ComtnqustnrrespondinfoVO selectComtnqustnrrespondinfo(ComtnqustnrrespondinfoVO vo) throws Exception {
        return (ComtnqustnrrespondinfoVO) selectByPk("comtnqustnrrespondinfoDAO.selectComtnqustnrrespondinfo_S", vo);
    }

    /**
	 * comtnqustnrrespondinfo 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnqustnrrespondinfo 목록
	 * @exception Exception
	 */
    public List selectComtnqustnrrespondinfoList(ComtnqustnrrespondinfoDefaultVO searchVO) throws Exception {
        return list("comtnqustnrrespondinfoDAO.selectComtnqustnrrespondinfoList_D", searchVO);
    }

    /**
	 * comtnqustnrrespondinfo 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnqustnrrespondinfo 총 갯수
	 * @exception
	 */
    public int selectComtnqustnrrespondinfoListTotCnt(ComtnqustnrrespondinfoDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnqustnrrespondinfoDAO.selectComtnqustnrrespondinfoListTotCnt_S", searchVO);
    }

}
