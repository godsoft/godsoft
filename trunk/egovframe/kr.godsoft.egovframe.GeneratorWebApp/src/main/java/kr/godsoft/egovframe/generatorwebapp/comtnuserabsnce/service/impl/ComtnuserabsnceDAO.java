package kr.godsoft.egovframe.generatorwebapp.comtnuserabsnce.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnuserabsnce.service.ComtnuserabsnceVO;

/**
 * @Class Name : ComtnuserabsnceDAO.java
 * @Description : Comtnuserabsnce DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnuserabsnceDAO")
public class ComtnuserabsnceDAO extends EgovAbstractDAO {

	/**
	 * COMTNUSERABSNCE을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnuserabsnceVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnuserabsnce(ComtnuserabsnceVO vo) throws Exception {
        return (String)insert("comtnuserabsnceDAO.insertComtnuserabsnce_S", vo);
    }

    /**
	 * COMTNUSERABSNCE을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnuserabsnceVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnuserabsnce(ComtnuserabsnceVO vo) throws Exception {
        update("comtnuserabsnceDAO.updateComtnuserabsnce_S", vo);
    }

    /**
	 * COMTNUSERABSNCE을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnuserabsnceVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnuserabsnce(ComtnuserabsnceVO vo) throws Exception {
        delete("comtnuserabsnceDAO.deleteComtnuserabsnce_S", vo);
    }

    /**
	 * COMTNUSERABSNCE을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnuserabsnceVO
	 * @return 조회한 COMTNUSERABSNCE
	 * @exception Exception
	 */
    public ComtnuserabsnceVO selectComtnuserabsnce(ComtnuserabsnceVO vo) throws Exception {
        return (ComtnuserabsnceVO) selectByPk("comtnuserabsnceDAO.selectComtnuserabsnce_S", vo);
    }

    /**
	 * COMTNUSERABSNCE 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNUSERABSNCE 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnuserabsnceList(ComtnuserabsnceVO vo) throws Exception {
        return list("comtnuserabsnceDAO.selectComtnuserabsnceList_D", vo);
    }

    /**
	 * COMTNUSERABSNCE 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNUSERABSNCE 총 갯수
	 * @exception
	 */
    public int selectComtnuserabsnceListTotCnt(ComtnuserabsnceVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnuserabsnceDAO.selectComtnuserabsnceListTotCnt_S", vo);
    }

}
