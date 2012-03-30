package kr.godsoft.egovframe.generatorwebapp.comtnsms.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnsms.service.ComtnsmsVO;

/**
 * @Class Name : ComtnsmsDAO.java
 * @Description : Comtnsms DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnsmsDAO")
public class ComtnsmsDAO extends EgovAbstractDAO {

	/**
	 * COMTNSMS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnsmsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnsms(ComtnsmsVO vo) throws Exception {
        return (String)insert("comtnsmsDAO.insertComtnsms_S", vo);
    }

    /**
	 * COMTNSMS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnsmsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnsms(ComtnsmsVO vo) throws Exception {
        update("comtnsmsDAO.updateComtnsms_S", vo);
    }

    /**
	 * COMTNSMS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnsmsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnsms(ComtnsmsVO vo) throws Exception {
        delete("comtnsmsDAO.deleteComtnsms_S", vo);
    }

    /**
	 * COMTNSMS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnsmsVO
	 * @return 조회한 COMTNSMS
	 * @exception Exception
	 */
    public ComtnsmsVO selectComtnsms(ComtnsmsVO vo) throws Exception {
        return (ComtnsmsVO) selectByPk("comtnsmsDAO.selectComtnsms_S", vo);
    }

    /**
	 * COMTNSMS 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNSMS 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnsmsList(ComtnsmsVO vo) throws Exception {
        return list("comtnsmsDAO.selectComtnsmsList_D", vo);
    }

    /**
	 * COMTNSMS 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNSMS 총 갯수
	 * @exception
	 */
    public int selectComtnsmsListTotCnt(ComtnsmsVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnsmsDAO.selectComtnsmsListTotCnt_S", vo);
    }

}
