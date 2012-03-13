package kr.godsoft.egovframe.generatorwebapp.comtnadbk.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtnadbk.service.ComtnadbkVO;
import kr.godsoft.egovframe.generatorwebapp.comtnadbk.service.ComtnadbkDefaultVO;

/**
 * @Class Name : ComtnadbkDAO.java
 * @Description : Comtnadbk DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnadbkDAO")
public class ComtnadbkDAO extends EgovAbstractDAO {

	/**
	 * comtnadbk을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnadbkVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnadbk(ComtnadbkVO vo) throws Exception {
        return (String)insert("comtnadbkDAO.insertComtnadbk_S", vo);
    }

    /**
	 * comtnadbk을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnadbkVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnadbk(ComtnadbkVO vo) throws Exception {
        update("comtnadbkDAO.updateComtnadbk_S", vo);
    }

    /**
	 * comtnadbk을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnadbkVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnadbk(ComtnadbkVO vo) throws Exception {
        delete("comtnadbkDAO.deleteComtnadbk_S", vo);
    }

    /**
	 * comtnadbk을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnadbkVO
	 * @return 조회한 comtnadbk
	 * @exception Exception
	 */
    public ComtnadbkVO selectComtnadbk(ComtnadbkVO vo) throws Exception {
        return (ComtnadbkVO) selectByPk("comtnadbkDAO.selectComtnadbk_S", vo);
    }

    /**
	 * comtnadbk 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnadbk 목록
	 * @exception Exception
	 */
    public List selectComtnadbkList(ComtnadbkDefaultVO searchVO) throws Exception {
        return list("comtnadbkDAO.selectComtnadbkList_D", searchVO);
    }

    /**
	 * comtnadbk 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnadbk 총 갯수
	 * @exception
	 */
    public int selectComtnadbkListTotCnt(ComtnadbkDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnadbkDAO.selectComtnadbkListTotCnt_S", searchVO);
    }

}
