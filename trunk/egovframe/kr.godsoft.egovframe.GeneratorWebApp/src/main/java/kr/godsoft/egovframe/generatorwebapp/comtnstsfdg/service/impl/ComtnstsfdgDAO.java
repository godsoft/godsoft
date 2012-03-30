package kr.godsoft.egovframe.generatorwebapp.comtnstsfdg.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnstsfdg.service.ComtnstsfdgVO;

/**
 * @Class Name : ComtnstsfdgDAO.java
 * @Description : Comtnstsfdg DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnstsfdgDAO")
public class ComtnstsfdgDAO extends EgovAbstractDAO {

	/**
	 * COMTNSTSFDG을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnstsfdgVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnstsfdg(ComtnstsfdgVO vo) throws Exception {
        return (String)insert("comtnstsfdgDAO.insertComtnstsfdg_S", vo);
    }

    /**
	 * COMTNSTSFDG을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnstsfdgVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnstsfdg(ComtnstsfdgVO vo) throws Exception {
        update("comtnstsfdgDAO.updateComtnstsfdg_S", vo);
    }

    /**
	 * COMTNSTSFDG을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnstsfdgVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnstsfdg(ComtnstsfdgVO vo) throws Exception {
        delete("comtnstsfdgDAO.deleteComtnstsfdg_S", vo);
    }

    /**
	 * COMTNSTSFDG을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnstsfdgVO
	 * @return 조회한 COMTNSTSFDG
	 * @exception Exception
	 */
    public ComtnstsfdgVO selectComtnstsfdg(ComtnstsfdgVO vo) throws Exception {
        return (ComtnstsfdgVO) selectByPk("comtnstsfdgDAO.selectComtnstsfdg_S", vo);
    }

    /**
	 * COMTNSTSFDG 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNSTSFDG 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnstsfdgList(ComtnstsfdgVO vo) throws Exception {
        return list("comtnstsfdgDAO.selectComtnstsfdgList_D", vo);
    }

    /**
	 * COMTNSTSFDG 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNSTSFDG 총 갯수
	 * @exception
	 */
    public int selectComtnstsfdgListTotCnt(ComtnstsfdgVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnstsfdgDAO.selectComtnstsfdgListTotCnt_S", vo);
    }

}
