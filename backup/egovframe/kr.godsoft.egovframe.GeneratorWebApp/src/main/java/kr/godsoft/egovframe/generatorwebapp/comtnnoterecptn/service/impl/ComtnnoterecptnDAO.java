package kr.godsoft.egovframe.generatorwebapp.comtnnoterecptn.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnnoterecptn.service.ComtnnoterecptnVO;

/**
 * @Class Name : ComtnnoterecptnDAO.java
 * @Description : Comtnnoterecptn DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnnoterecptnDAO")
public class ComtnnoterecptnDAO extends EgovAbstractDAO {

	/**
	 * COMTNNOTERECPTN을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnnoterecptnVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnnoterecptn(ComtnnoterecptnVO vo) throws Exception {
        return (String)insert("comtnnoterecptnDAO.insertComtnnoterecptn_S", vo);
    }

    /**
	 * COMTNNOTERECPTN을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnnoterecptnVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnnoterecptn(ComtnnoterecptnVO vo) throws Exception {
        update("comtnnoterecptnDAO.updateComtnnoterecptn_S", vo);
    }

    /**
	 * COMTNNOTERECPTN을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnnoterecptnVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnnoterecptn(ComtnnoterecptnVO vo) throws Exception {
        delete("comtnnoterecptnDAO.deleteComtnnoterecptn_S", vo);
    }

    /**
	 * COMTNNOTERECPTN을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnnoterecptnVO
	 * @return 조회한 COMTNNOTERECPTN
	 * @exception Exception
	 */
    public ComtnnoterecptnVO selectComtnnoterecptn(ComtnnoterecptnVO vo) throws Exception {
        return (ComtnnoterecptnVO) selectByPk("comtnnoterecptnDAO.selectComtnnoterecptn_S", vo);
    }

    /**
	 * COMTNNOTERECPTN 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNNOTERECPTN 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnnoterecptnList(ComtnnoterecptnVO vo) throws Exception {
        return list("comtnnoterecptnDAO.selectComtnnoterecptnList_D", vo);
    }

    /**
	 * COMTNNOTERECPTN 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNNOTERECPTN 총 갯수
	 * @exception
	 */
    public int selectComtnnoterecptnListTotCnt(ComtnnoterecptnVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnnoterecptnDAO.selectComtnnoterecptnListTotCnt_S", vo);
    }

}
