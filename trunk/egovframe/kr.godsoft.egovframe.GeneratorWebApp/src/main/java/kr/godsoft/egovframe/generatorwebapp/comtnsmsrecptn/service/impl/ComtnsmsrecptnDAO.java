package kr.godsoft.egovframe.generatorwebapp.comtnsmsrecptn.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnsmsrecptn.service.ComtnsmsrecptnVO;

/**
 * @Class Name : ComtnsmsrecptnDAO.java
 * @Description : Comtnsmsrecptn DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnsmsrecptnDAO")
public class ComtnsmsrecptnDAO extends EgovAbstractDAO {

	/**
	 * comtnsmsrecptn을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnsmsrecptnVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnsmsrecptn(ComtnsmsrecptnVO vo) throws Exception {
        return (String)insert("comtnsmsrecptnDAO.insertComtnsmsrecptn_S", vo);
    }

    /**
	 * comtnsmsrecptn을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnsmsrecptnVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnsmsrecptn(ComtnsmsrecptnVO vo) throws Exception {
        update("comtnsmsrecptnDAO.updateComtnsmsrecptn_S", vo);
    }

    /**
	 * comtnsmsrecptn을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnsmsrecptnVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnsmsrecptn(ComtnsmsrecptnVO vo) throws Exception {
        delete("comtnsmsrecptnDAO.deleteComtnsmsrecptn_S", vo);
    }

    /**
	 * comtnsmsrecptn을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnsmsrecptnVO
	 * @return 조회한 comtnsmsrecptn
	 * @exception Exception
	 */
    public ComtnsmsrecptnVO selectComtnsmsrecptn(ComtnsmsrecptnVO vo) throws Exception {
        return (ComtnsmsrecptnVO) selectByPk("comtnsmsrecptnDAO.selectComtnsmsrecptn_S", vo);
    }

    /**
	 * comtnsmsrecptn 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnsmsrecptn 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnsmsrecptnList(ComtnsmsrecptnVO vo) throws Exception {
        return list("comtnsmsrecptnDAO.selectComtnsmsrecptnList_D", vo);
    }

    /**
	 * comtnsmsrecptn 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnsmsrecptn 총 갯수
	 * @exception
	 */
    public int selectComtnsmsrecptnListTotCnt(ComtnsmsrecptnVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnsmsrecptnDAO.selectComtnsmsrecptnListTotCnt_S", vo);
    }

}
