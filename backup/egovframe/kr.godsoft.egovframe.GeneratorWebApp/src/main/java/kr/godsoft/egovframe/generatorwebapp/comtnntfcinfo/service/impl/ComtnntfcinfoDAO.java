package kr.godsoft.egovframe.generatorwebapp.comtnntfcinfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnntfcinfo.service.ComtnntfcinfoVO;

/**
 * @Class Name : ComtnntfcinfoDAO.java
 * @Description : Comtnntfcinfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnntfcinfoDAO")
public class ComtnntfcinfoDAO extends EgovAbstractDAO {

	/**
	 * COMTNNTFCINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnntfcinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnntfcinfo(ComtnntfcinfoVO vo) throws Exception {
        return (String)insert("comtnntfcinfoDAO.insertComtnntfcinfo_S", vo);
    }

    /**
	 * COMTNNTFCINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnntfcinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnntfcinfo(ComtnntfcinfoVO vo) throws Exception {
        update("comtnntfcinfoDAO.updateComtnntfcinfo_S", vo);
    }

    /**
	 * COMTNNTFCINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnntfcinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnntfcinfo(ComtnntfcinfoVO vo) throws Exception {
        delete("comtnntfcinfoDAO.deleteComtnntfcinfo_S", vo);
    }

    /**
	 * COMTNNTFCINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnntfcinfoVO
	 * @return 조회한 COMTNNTFCINFO
	 * @exception Exception
	 */
    public ComtnntfcinfoVO selectComtnntfcinfo(ComtnntfcinfoVO vo) throws Exception {
        return (ComtnntfcinfoVO) selectByPk("comtnntfcinfoDAO.selectComtnntfcinfo_S", vo);
    }

    /**
	 * COMTNNTFCINFO 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNNTFCINFO 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnntfcinfoList(ComtnntfcinfoVO vo) throws Exception {
        return list("comtnntfcinfoDAO.selectComtnntfcinfoList_D", vo);
    }

    /**
	 * COMTNNTFCINFO 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNNTFCINFO 총 갯수
	 * @exception
	 */
    public int selectComtnntfcinfoListTotCnt(ComtnntfcinfoVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnntfcinfoDAO.selectComtnntfcinfoListTotCnt_S", vo);
    }

}
