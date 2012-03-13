package kr.godsoft.egovframe.generatorwebapp.comtnntfcinfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtnntfcinfo.service.ComtnntfcinfoVO;
import kr.godsoft.egovframe.generatorwebapp.comtnntfcinfo.service.ComtnntfcinfoDefaultVO;

/**
 * @Class Name : ComtnntfcinfoDAO.java
 * @Description : Comtnntfcinfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnntfcinfoDAO")
public class ComtnntfcinfoDAO extends EgovAbstractDAO {

	/**
	 * comtnntfcinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnntfcinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnntfcinfo(ComtnntfcinfoVO vo) throws Exception {
        return (String)insert("comtnntfcinfoDAO.insertComtnntfcinfo_S", vo);
    }

    /**
	 * comtnntfcinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnntfcinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnntfcinfo(ComtnntfcinfoVO vo) throws Exception {
        update("comtnntfcinfoDAO.updateComtnntfcinfo_S", vo);
    }

    /**
	 * comtnntfcinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnntfcinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnntfcinfo(ComtnntfcinfoVO vo) throws Exception {
        delete("comtnntfcinfoDAO.deleteComtnntfcinfo_S", vo);
    }

    /**
	 * comtnntfcinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnntfcinfoVO
	 * @return 조회한 comtnntfcinfo
	 * @exception Exception
	 */
    public ComtnntfcinfoVO selectComtnntfcinfo(ComtnntfcinfoVO vo) throws Exception {
        return (ComtnntfcinfoVO) selectByPk("comtnntfcinfoDAO.selectComtnntfcinfo_S", vo);
    }

    /**
	 * comtnntfcinfo 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnntfcinfo 목록
	 * @exception Exception
	 */
    public List selectComtnntfcinfoList(ComtnntfcinfoDefaultVO searchVO) throws Exception {
        return list("comtnntfcinfoDAO.selectComtnntfcinfoList_D", searchVO);
    }

    /**
	 * comtnntfcinfo 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnntfcinfo 총 갯수
	 * @exception
	 */
    public int selectComtnntfcinfoListTotCnt(ComtnntfcinfoDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnntfcinfoDAO.selectComtnntfcinfoListTotCnt_S", searchVO);
    }

}
