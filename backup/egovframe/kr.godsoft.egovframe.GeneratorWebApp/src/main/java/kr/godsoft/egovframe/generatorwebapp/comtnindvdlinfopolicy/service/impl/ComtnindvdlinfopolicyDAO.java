package kr.godsoft.egovframe.generatorwebapp.comtnindvdlinfopolicy.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnindvdlinfopolicy.service.ComtnindvdlinfopolicyVO;

/**
 * @Class Name : ComtnindvdlinfopolicyDAO.java
 * @Description : Comtnindvdlinfopolicy DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnindvdlinfopolicyDAO")
public class ComtnindvdlinfopolicyDAO extends EgovAbstractDAO {

	/**
	 * COMTNINDVDLINFOPOLICY을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnindvdlinfopolicyVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnindvdlinfopolicy(ComtnindvdlinfopolicyVO vo) throws Exception {
        return (String)insert("comtnindvdlinfopolicyDAO.insertComtnindvdlinfopolicy_S", vo);
    }

    /**
	 * COMTNINDVDLINFOPOLICY을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnindvdlinfopolicyVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnindvdlinfopolicy(ComtnindvdlinfopolicyVO vo) throws Exception {
        update("comtnindvdlinfopolicyDAO.updateComtnindvdlinfopolicy_S", vo);
    }

    /**
	 * COMTNINDVDLINFOPOLICY을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnindvdlinfopolicyVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnindvdlinfopolicy(ComtnindvdlinfopolicyVO vo) throws Exception {
        delete("comtnindvdlinfopolicyDAO.deleteComtnindvdlinfopolicy_S", vo);
    }

    /**
	 * COMTNINDVDLINFOPOLICY을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnindvdlinfopolicyVO
	 * @return 조회한 COMTNINDVDLINFOPOLICY
	 * @exception Exception
	 */
    public ComtnindvdlinfopolicyVO selectComtnindvdlinfopolicy(ComtnindvdlinfopolicyVO vo) throws Exception {
        return (ComtnindvdlinfopolicyVO) selectByPk("comtnindvdlinfopolicyDAO.selectComtnindvdlinfopolicy_S", vo);
    }

    /**
	 * COMTNINDVDLINFOPOLICY 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNINDVDLINFOPOLICY 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnindvdlinfopolicyList(ComtnindvdlinfopolicyVO vo) throws Exception {
        return list("comtnindvdlinfopolicyDAO.selectComtnindvdlinfopolicyList_D", vo);
    }

    /**
	 * COMTNINDVDLINFOPOLICY 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNINDVDLINFOPOLICY 총 갯수
	 * @exception
	 */
    public int selectComtnindvdlinfopolicyListTotCnt(ComtnindvdlinfopolicyVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnindvdlinfopolicyDAO.selectComtnindvdlinfopolicyListTotCnt_S", vo);
    }

}
