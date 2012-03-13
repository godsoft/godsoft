package kr.godsoft.egovframe.generatorwebapp.comtnqestnrinfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtnqestnrinfo.service.ComtnqestnrinfoVO;
import kr.godsoft.egovframe.generatorwebapp.comtnqestnrinfo.service.ComtnqestnrinfoDefaultVO;

/**
 * @Class Name : ComtnqestnrinfoDAO.java
 * @Description : Comtnqestnrinfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnqestnrinfoDAO")
public class ComtnqestnrinfoDAO extends EgovAbstractDAO {

	/**
	 * comtnqestnrinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnqestnrinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnqestnrinfo(ComtnqestnrinfoVO vo) throws Exception {
        return (String)insert("comtnqestnrinfoDAO.insertComtnqestnrinfo_S", vo);
    }

    /**
	 * comtnqestnrinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnqestnrinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnqestnrinfo(ComtnqestnrinfoVO vo) throws Exception {
        update("comtnqestnrinfoDAO.updateComtnqestnrinfo_S", vo);
    }

    /**
	 * comtnqestnrinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnqestnrinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnqestnrinfo(ComtnqestnrinfoVO vo) throws Exception {
        delete("comtnqestnrinfoDAO.deleteComtnqestnrinfo_S", vo);
    }

    /**
	 * comtnqestnrinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnqestnrinfoVO
	 * @return 조회한 comtnqestnrinfo
	 * @exception Exception
	 */
    public ComtnqestnrinfoVO selectComtnqestnrinfo(ComtnqestnrinfoVO vo) throws Exception {
        return (ComtnqestnrinfoVO) selectByPk("comtnqestnrinfoDAO.selectComtnqestnrinfo_S", vo);
    }

    /**
	 * comtnqestnrinfo 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnqestnrinfo 목록
	 * @exception Exception
	 */
    public List selectComtnqestnrinfoList(ComtnqestnrinfoDefaultVO searchVO) throws Exception {
        return list("comtnqestnrinfoDAO.selectComtnqestnrinfoList_D", searchVO);
    }

    /**
	 * comtnqestnrinfo 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnqestnrinfo 총 갯수
	 * @exception
	 */
    public int selectComtnqestnrinfoListTotCnt(ComtnqestnrinfoDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnqestnrinfoDAO.selectComtnqestnrinfoListTotCnt_S", searchVO);
    }

}
