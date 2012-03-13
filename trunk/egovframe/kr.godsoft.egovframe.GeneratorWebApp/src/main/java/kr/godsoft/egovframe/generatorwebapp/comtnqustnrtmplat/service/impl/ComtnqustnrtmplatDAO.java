package kr.godsoft.egovframe.generatorwebapp.comtnqustnrtmplat.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnrtmplat.service.ComtnqustnrtmplatVO;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnrtmplat.service.ComtnqustnrtmplatDefaultVO;

/**
 * @Class Name : ComtnqustnrtmplatDAO.java
 * @Description : Comtnqustnrtmplat DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnqustnrtmplatDAO")
public class ComtnqustnrtmplatDAO extends EgovAbstractDAO {

	/**
	 * comtnqustnrtmplat을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnqustnrtmplatVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnqustnrtmplat(ComtnqustnrtmplatVO vo) throws Exception {
        return (String)insert("comtnqustnrtmplatDAO.insertComtnqustnrtmplat_S", vo);
    }

    /**
	 * comtnqustnrtmplat을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnqustnrtmplatVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnqustnrtmplat(ComtnqustnrtmplatVO vo) throws Exception {
        update("comtnqustnrtmplatDAO.updateComtnqustnrtmplat_S", vo);
    }

    /**
	 * comtnqustnrtmplat을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnqustnrtmplatVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnqustnrtmplat(ComtnqustnrtmplatVO vo) throws Exception {
        delete("comtnqustnrtmplatDAO.deleteComtnqustnrtmplat_S", vo);
    }

    /**
	 * comtnqustnrtmplat을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnqustnrtmplatVO
	 * @return 조회한 comtnqustnrtmplat
	 * @exception Exception
	 */
    public ComtnqustnrtmplatVO selectComtnqustnrtmplat(ComtnqustnrtmplatVO vo) throws Exception {
        return (ComtnqustnrtmplatVO) selectByPk("comtnqustnrtmplatDAO.selectComtnqustnrtmplat_S", vo);
    }

    /**
	 * comtnqustnrtmplat 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnqustnrtmplat 목록
	 * @exception Exception
	 */
    public List selectComtnqustnrtmplatList(ComtnqustnrtmplatDefaultVO searchVO) throws Exception {
        return list("comtnqustnrtmplatDAO.selectComtnqustnrtmplatList_D", searchVO);
    }

    /**
	 * comtnqustnrtmplat 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnqustnrtmplat 총 갯수
	 * @exception
	 */
    public int selectComtnqustnrtmplatListTotCnt(ComtnqustnrtmplatDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnqustnrtmplatDAO.selectComtnqustnrtmplatListTotCnt_S", searchVO);
    }

}