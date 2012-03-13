package kr.godsoft.egovframe.generatorwebapp.comtnwikibkmk.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtnwikibkmk.service.ComtnwikibkmkVO;
import kr.godsoft.egovframe.generatorwebapp.comtnwikibkmk.service.ComtnwikibkmkDefaultVO;

/**
 * @Class Name : ComtnwikibkmkDAO.java
 * @Description : Comtnwikibkmk DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnwikibkmkDAO")
public class ComtnwikibkmkDAO extends EgovAbstractDAO {

	/**
	 * comtnwikibkmk을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnwikibkmkVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnwikibkmk(ComtnwikibkmkVO vo) throws Exception {
        return (String)insert("comtnwikibkmkDAO.insertComtnwikibkmk_S", vo);
    }

    /**
	 * comtnwikibkmk을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnwikibkmkVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnwikibkmk(ComtnwikibkmkVO vo) throws Exception {
        update("comtnwikibkmkDAO.updateComtnwikibkmk_S", vo);
    }

    /**
	 * comtnwikibkmk을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnwikibkmkVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnwikibkmk(ComtnwikibkmkVO vo) throws Exception {
        delete("comtnwikibkmkDAO.deleteComtnwikibkmk_S", vo);
    }

    /**
	 * comtnwikibkmk을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnwikibkmkVO
	 * @return 조회한 comtnwikibkmk
	 * @exception Exception
	 */
    public ComtnwikibkmkVO selectComtnwikibkmk(ComtnwikibkmkVO vo) throws Exception {
        return (ComtnwikibkmkVO) selectByPk("comtnwikibkmkDAO.selectComtnwikibkmk_S", vo);
    }

    /**
	 * comtnwikibkmk 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnwikibkmk 목록
	 * @exception Exception
	 */
    public List selectComtnwikibkmkList(ComtnwikibkmkDefaultVO searchVO) throws Exception {
        return list("comtnwikibkmkDAO.selectComtnwikibkmkList_D", searchVO);
    }

    /**
	 * comtnwikibkmk 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnwikibkmk 총 갯수
	 * @exception
	 */
    public int selectComtnwikibkmkListTotCnt(ComtnwikibkmkDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnwikibkmkDAO.selectComtnwikibkmkListTotCnt_S", searchVO);
    }

}
