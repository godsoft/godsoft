package kr.godsoft.egovframe.generatorwebapp.comtnadbk.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnadbk.service.ComtnadbkVO;

/**
 * @Class Name : ComtnadbkDAO.java
 * @Description : Comtnadbk DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnadbkDAO")
public class ComtnadbkDAO extends EgovAbstractDAO {

	/**
	 * COMTNADBK을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnadbkVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnadbk(ComtnadbkVO vo) throws Exception {
        return (String)insert("comtnadbkDAO.insertComtnadbk_S", vo);
    }

    /**
	 * COMTNADBK을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnadbkVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnadbk(ComtnadbkVO vo) throws Exception {
        update("comtnadbkDAO.updateComtnadbk_S", vo);
    }

    /**
	 * COMTNADBK을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnadbkVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnadbk(ComtnadbkVO vo) throws Exception {
        delete("comtnadbkDAO.deleteComtnadbk_S", vo);
    }

    /**
	 * COMTNADBK을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnadbkVO
	 * @return 조회한 COMTNADBK
	 * @exception Exception
	 */
    public ComtnadbkVO selectComtnadbk(ComtnadbkVO vo) throws Exception {
        return (ComtnadbkVO) selectByPk("comtnadbkDAO.selectComtnadbk_S", vo);
    }

    /**
	 * COMTNADBK 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNADBK 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnadbkList(ComtnadbkVO vo) throws Exception {
        return list("comtnadbkDAO.selectComtnadbkList_D", vo);
    }

    /**
	 * COMTNADBK 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNADBK 총 갯수
	 * @exception
	 */
    public int selectComtnadbkListTotCnt(ComtnadbkVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnadbkDAO.selectComtnadbkListTotCnt_S", vo);
    }

}
