package kr.godsoft.egovframe.generatorwebapp.comtnqustnrqesitm.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnrqesitm.service.ComtnqustnrqesitmVO;

/**
 * @Class Name : ComtnqustnrqesitmDAO.java
 * @Description : Comtnqustnrqesitm DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnqustnrqesitmDAO")
public class ComtnqustnrqesitmDAO extends EgovAbstractDAO {

	/**
	 * COMTNQUSTNRQESITM을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnqustnrqesitmVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnqustnrqesitm(ComtnqustnrqesitmVO vo) throws Exception {
        return (String)insert("comtnqustnrqesitmDAO.insertComtnqustnrqesitm_S", vo);
    }

    /**
	 * COMTNQUSTNRQESITM을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnqustnrqesitmVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnqustnrqesitm(ComtnqustnrqesitmVO vo) throws Exception {
        update("comtnqustnrqesitmDAO.updateComtnqustnrqesitm_S", vo);
    }

    /**
	 * COMTNQUSTNRQESITM을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnqustnrqesitmVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnqustnrqesitm(ComtnqustnrqesitmVO vo) throws Exception {
        delete("comtnqustnrqesitmDAO.deleteComtnqustnrqesitm_S", vo);
    }

    /**
	 * COMTNQUSTNRQESITM을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnqustnrqesitmVO
	 * @return 조회한 COMTNQUSTNRQESITM
	 * @exception Exception
	 */
    public ComtnqustnrqesitmVO selectComtnqustnrqesitm(ComtnqustnrqesitmVO vo) throws Exception {
        return (ComtnqustnrqesitmVO) selectByPk("comtnqustnrqesitmDAO.selectComtnqustnrqesitm_S", vo);
    }

    /**
	 * COMTNQUSTNRQESITM 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNQUSTNRQESITM 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnqustnrqesitmList(ComtnqustnrqesitmVO vo) throws Exception {
        return list("comtnqustnrqesitmDAO.selectComtnqustnrqesitmList_D", vo);
    }

    /**
	 * COMTNQUSTNRQESITM 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNQUSTNRQESITM 총 갯수
	 * @exception
	 */
    public int selectComtnqustnrqesitmListTotCnt(ComtnqustnrqesitmVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnqustnrqesitmDAO.selectComtnqustnrqesitmListTotCnt_S", vo);
    }

}
