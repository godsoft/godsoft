package kr.godsoft.egovframe.generatorwebapp.comtnonlinemanual.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnonlinemanual.service.ComtnonlinemanualVO;

/**
 * @Class Name : ComtnonlinemanualDAO.java
 * @Description : Comtnonlinemanual DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnonlinemanualDAO")
public class ComtnonlinemanualDAO extends EgovAbstractDAO {

	/**
	 * COMTNONLINEMANUAL을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnonlinemanualVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnonlinemanual(ComtnonlinemanualVO vo) throws Exception {
        return (String)insert("comtnonlinemanualDAO.insertComtnonlinemanual_S", vo);
    }

    /**
	 * COMTNONLINEMANUAL을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnonlinemanualVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnonlinemanual(ComtnonlinemanualVO vo) throws Exception {
        update("comtnonlinemanualDAO.updateComtnonlinemanual_S", vo);
    }

    /**
	 * COMTNONLINEMANUAL을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnonlinemanualVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnonlinemanual(ComtnonlinemanualVO vo) throws Exception {
        delete("comtnonlinemanualDAO.deleteComtnonlinemanual_S", vo);
    }

    /**
	 * COMTNONLINEMANUAL을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnonlinemanualVO
	 * @return 조회한 COMTNONLINEMANUAL
	 * @exception Exception
	 */
    public ComtnonlinemanualVO selectComtnonlinemanual(ComtnonlinemanualVO vo) throws Exception {
        return (ComtnonlinemanualVO) selectByPk("comtnonlinemanualDAO.selectComtnonlinemanual_S", vo);
    }

    /**
	 * COMTNONLINEMANUAL 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNONLINEMANUAL 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnonlinemanualList(ComtnonlinemanualVO vo) throws Exception {
        return list("comtnonlinemanualDAO.selectComtnonlinemanualList_D", vo);
    }

    /**
	 * COMTNONLINEMANUAL 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNONLINEMANUAL 총 갯수
	 * @exception
	 */
    public int selectComtnonlinemanualListTotCnt(ComtnonlinemanualVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnonlinemanualDAO.selectComtnonlinemanualListTotCnt_S", vo);
    }

}
