package kr.godsoft.egovframe.generatorwebapp.comtnwikibkmk.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnwikibkmk.service.ComtnwikibkmkVO;

/**
 * @Class Name : ComtnwikibkmkDAO.java
 * @Description : Comtnwikibkmk DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnwikibkmkDAO")
public class ComtnwikibkmkDAO extends EgovAbstractDAO {

	/**
	 * COMTNWIKIBKMK을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnwikibkmkVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnwikibkmk(ComtnwikibkmkVO vo) throws Exception {
        return (String)insert("comtnwikibkmkDAO.insertComtnwikibkmk_S", vo);
    }

    /**
	 * COMTNWIKIBKMK을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnwikibkmkVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnwikibkmk(ComtnwikibkmkVO vo) throws Exception {
        update("comtnwikibkmkDAO.updateComtnwikibkmk_S", vo);
    }

    /**
	 * COMTNWIKIBKMK을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnwikibkmkVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnwikibkmk(ComtnwikibkmkVO vo) throws Exception {
        delete("comtnwikibkmkDAO.deleteComtnwikibkmk_S", vo);
    }

    /**
	 * COMTNWIKIBKMK을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnwikibkmkVO
	 * @return 조회한 COMTNWIKIBKMK
	 * @exception Exception
	 */
    public ComtnwikibkmkVO selectComtnwikibkmk(ComtnwikibkmkVO vo) throws Exception {
        return (ComtnwikibkmkVO) selectByPk("comtnwikibkmkDAO.selectComtnwikibkmk_S", vo);
    }

    /**
	 * COMTNWIKIBKMK 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNWIKIBKMK 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnwikibkmkList(ComtnwikibkmkVO vo) throws Exception {
        return list("comtnwikibkmkDAO.selectComtnwikibkmkList_D", vo);
    }

    /**
	 * COMTNWIKIBKMK 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNWIKIBKMK 총 갯수
	 * @exception
	 */
    public int selectComtnwikibkmkListTotCnt(ComtnwikibkmkVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnwikibkmkDAO.selectComtnwikibkmkListTotCnt_S", vo);
    }

}
