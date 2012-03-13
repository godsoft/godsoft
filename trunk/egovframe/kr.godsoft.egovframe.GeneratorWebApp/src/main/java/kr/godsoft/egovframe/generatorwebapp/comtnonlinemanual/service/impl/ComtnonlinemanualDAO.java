package kr.godsoft.egovframe.generatorwebapp.comtnonlinemanual.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtnonlinemanual.service.ComtnonlinemanualVO;
import kr.godsoft.egovframe.generatorwebapp.comtnonlinemanual.service.ComtnonlinemanualDefaultVO;

/**
 * @Class Name : ComtnonlinemanualDAO.java
 * @Description : Comtnonlinemanual DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnonlinemanualDAO")
public class ComtnonlinemanualDAO extends EgovAbstractDAO {

	/**
	 * comtnonlinemanual을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnonlinemanualVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnonlinemanual(ComtnonlinemanualVO vo) throws Exception {
        return (String)insert("comtnonlinemanualDAO.insertComtnonlinemanual_S", vo);
    }

    /**
	 * comtnonlinemanual을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnonlinemanualVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnonlinemanual(ComtnonlinemanualVO vo) throws Exception {
        update("comtnonlinemanualDAO.updateComtnonlinemanual_S", vo);
    }

    /**
	 * comtnonlinemanual을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnonlinemanualVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnonlinemanual(ComtnonlinemanualVO vo) throws Exception {
        delete("comtnonlinemanualDAO.deleteComtnonlinemanual_S", vo);
    }

    /**
	 * comtnonlinemanual을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnonlinemanualVO
	 * @return 조회한 comtnonlinemanual
	 * @exception Exception
	 */
    public ComtnonlinemanualVO selectComtnonlinemanual(ComtnonlinemanualVO vo) throws Exception {
        return (ComtnonlinemanualVO) selectByPk("comtnonlinemanualDAO.selectComtnonlinemanual_S", vo);
    }

    /**
	 * comtnonlinemanual 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnonlinemanual 목록
	 * @exception Exception
	 */
    public List selectComtnonlinemanualList(ComtnonlinemanualDefaultVO searchVO) throws Exception {
        return list("comtnonlinemanualDAO.selectComtnonlinemanualList_D", searchVO);
    }

    /**
	 * comtnonlinemanual 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnonlinemanual 총 갯수
	 * @exception
	 */
    public int selectComtnonlinemanualListTotCnt(ComtnonlinemanualDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnonlinemanualDAO.selectComtnonlinemanualListTotCnt_S", searchVO);
    }

}
