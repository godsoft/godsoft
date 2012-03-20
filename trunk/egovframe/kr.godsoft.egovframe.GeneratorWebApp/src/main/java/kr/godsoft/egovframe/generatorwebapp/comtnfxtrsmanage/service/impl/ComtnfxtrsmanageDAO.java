package kr.godsoft.egovframe.generatorwebapp.comtnfxtrsmanage.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnfxtrsmanage.service.ComtnfxtrsmanageVO;

/**
 * @Class Name : ComtnfxtrsmanageDAO.java
 * @Description : Comtnfxtrsmanage DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnfxtrsmanageDAO")
public class ComtnfxtrsmanageDAO extends EgovAbstractDAO {

	/**
	 * comtnfxtrsmanage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnfxtrsmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnfxtrsmanage(ComtnfxtrsmanageVO vo) throws Exception {
        return (String)insert("comtnfxtrsmanageDAO.insertComtnfxtrsmanage_S", vo);
    }

    /**
	 * comtnfxtrsmanage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnfxtrsmanageVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnfxtrsmanage(ComtnfxtrsmanageVO vo) throws Exception {
        update("comtnfxtrsmanageDAO.updateComtnfxtrsmanage_S", vo);
    }

    /**
	 * comtnfxtrsmanage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnfxtrsmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnfxtrsmanage(ComtnfxtrsmanageVO vo) throws Exception {
        delete("comtnfxtrsmanageDAO.deleteComtnfxtrsmanage_S", vo);
    }

    /**
	 * comtnfxtrsmanage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnfxtrsmanageVO
	 * @return 조회한 comtnfxtrsmanage
	 * @exception Exception
	 */
    public ComtnfxtrsmanageVO selectComtnfxtrsmanage(ComtnfxtrsmanageVO vo) throws Exception {
        return (ComtnfxtrsmanageVO) selectByPk("comtnfxtrsmanageDAO.selectComtnfxtrsmanage_S", vo);
    }

    /**
	 * comtnfxtrsmanage 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnfxtrsmanage 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnfxtrsmanageList(ComtnfxtrsmanageVO vo) throws Exception {
        return list("comtnfxtrsmanageDAO.selectComtnfxtrsmanageList_D", vo);
    }

    /**
	 * comtnfxtrsmanage 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnfxtrsmanage 총 갯수
	 * @exception
	 */
    public int selectComtnfxtrsmanageListTotCnt(ComtnfxtrsmanageVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnfxtrsmanageDAO.selectComtnfxtrsmanageListTotCnt_S", vo);
    }

}
