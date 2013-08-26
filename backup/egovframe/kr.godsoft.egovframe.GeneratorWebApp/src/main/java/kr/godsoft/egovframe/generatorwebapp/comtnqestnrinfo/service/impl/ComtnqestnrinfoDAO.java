package kr.godsoft.egovframe.generatorwebapp.comtnqestnrinfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnqestnrinfo.service.ComtnqestnrinfoVO;

/**
 * @Class Name : ComtnqestnrinfoDAO.java
 * @Description : Comtnqestnrinfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnqestnrinfoDAO")
public class ComtnqestnrinfoDAO extends EgovAbstractDAO {

	/**
	 * COMTNQESTNRINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnqestnrinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnqestnrinfo(ComtnqestnrinfoVO vo) throws Exception {
        return (String)insert("comtnqestnrinfoDAO.insertComtnqestnrinfo_S", vo);
    }

    /**
	 * COMTNQESTNRINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnqestnrinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnqestnrinfo(ComtnqestnrinfoVO vo) throws Exception {
        update("comtnqestnrinfoDAO.updateComtnqestnrinfo_S", vo);
    }

    /**
	 * COMTNQESTNRINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnqestnrinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnqestnrinfo(ComtnqestnrinfoVO vo) throws Exception {
        delete("comtnqestnrinfoDAO.deleteComtnqestnrinfo_S", vo);
    }

    /**
	 * COMTNQESTNRINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnqestnrinfoVO
	 * @return 조회한 COMTNQESTNRINFO
	 * @exception Exception
	 */
    public ComtnqestnrinfoVO selectComtnqestnrinfo(ComtnqestnrinfoVO vo) throws Exception {
        return (ComtnqestnrinfoVO) selectByPk("comtnqestnrinfoDAO.selectComtnqestnrinfo_S", vo);
    }

    /**
	 * COMTNQESTNRINFO 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNQESTNRINFO 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnqestnrinfoList(ComtnqestnrinfoVO vo) throws Exception {
        return list("comtnqestnrinfoDAO.selectComtnqestnrinfoList_D", vo);
    }

    /**
	 * COMTNQESTNRINFO 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNQESTNRINFO 총 갯수
	 * @exception
	 */
    public int selectComtnqestnrinfoListTotCnt(ComtnqestnrinfoVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnqestnrinfoDAO.selectComtnqestnrinfoListTotCnt_S", vo);
    }

}
