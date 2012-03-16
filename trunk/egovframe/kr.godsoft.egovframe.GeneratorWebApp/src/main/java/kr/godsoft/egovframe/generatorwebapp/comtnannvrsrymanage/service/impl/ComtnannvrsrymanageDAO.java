package kr.godsoft.egovframe.generatorwebapp.comtnannvrsrymanage.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnannvrsrymanage.service.ComtnannvrsrymanageVO;

/**
 * @Class Name : ComtnannvrsrymanageDAO.java
 * @Description : Comtnannvrsrymanage DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnannvrsrymanageDAO")
public class ComtnannvrsrymanageDAO extends EgovAbstractDAO {

	/**
	 * comtnannvrsrymanage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnannvrsrymanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnannvrsrymanage(ComtnannvrsrymanageVO vo) throws Exception {
        return (String)insert("comtnannvrsrymanageDAO.insertComtnannvrsrymanage_S", vo);
    }

    /**
	 * comtnannvrsrymanage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnannvrsrymanageVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnannvrsrymanage(ComtnannvrsrymanageVO vo) throws Exception {
        update("comtnannvrsrymanageDAO.updateComtnannvrsrymanage_S", vo);
    }

    /**
	 * comtnannvrsrymanage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnannvrsrymanageVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnannvrsrymanage(ComtnannvrsrymanageVO vo) throws Exception {
        delete("comtnannvrsrymanageDAO.deleteComtnannvrsrymanage_S", vo);
    }

    /**
	 * comtnannvrsrymanage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnannvrsrymanageVO
	 * @return 조회한 comtnannvrsrymanage
	 * @exception Exception
	 */
    public ComtnannvrsrymanageVO selectComtnannvrsrymanage(ComtnannvrsrymanageVO vo) throws Exception {
        return (ComtnannvrsrymanageVO) selectByPk("comtnannvrsrymanageDAO.selectComtnannvrsrymanage_S", vo);
    }

    /**
	 * comtnannvrsrymanage 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnannvrsrymanage 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnannvrsrymanageList(ComtnannvrsrymanageVO vo) throws Exception {
        return list("comtnannvrsrymanageDAO.selectComtnannvrsrymanageList_D", vo);
    }

    /**
	 * comtnannvrsrymanage 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnannvrsrymanage 총 갯수
	 * @exception
	 */
    public int selectComtnannvrsrymanageListTotCnt(ComtnannvrsrymanageVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnannvrsrymanageDAO.selectComtnannvrsrymanageListTotCnt_S", vo);
    }

}
