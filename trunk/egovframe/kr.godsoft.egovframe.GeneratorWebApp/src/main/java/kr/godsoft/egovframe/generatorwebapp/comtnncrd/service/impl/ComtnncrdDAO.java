package kr.godsoft.egovframe.generatorwebapp.comtnncrd.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnncrd.service.ComtnncrdVO;

/**
 * @Class Name : ComtnncrdDAO.java
 * @Description : Comtnncrd DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnncrdDAO")
public class ComtnncrdDAO extends EgovAbstractDAO {

	/**
	 * comtnncrd을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnncrdVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnncrd(ComtnncrdVO vo) throws Exception {
        return (String)insert("comtnncrdDAO.insertComtnncrd_S", vo);
    }

    /**
	 * comtnncrd을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnncrdVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnncrd(ComtnncrdVO vo) throws Exception {
        update("comtnncrdDAO.updateComtnncrd_S", vo);
    }

    /**
	 * comtnncrd을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnncrdVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnncrd(ComtnncrdVO vo) throws Exception {
        delete("comtnncrdDAO.deleteComtnncrd_S", vo);
    }

    /**
	 * comtnncrd을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnncrdVO
	 * @return 조회한 comtnncrd
	 * @exception Exception
	 */
    public ComtnncrdVO selectComtnncrd(ComtnncrdVO vo) throws Exception {
        return (ComtnncrdVO) selectByPk("comtnncrdDAO.selectComtnncrd_S", vo);
    }

    /**
	 * comtnncrd 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnncrd 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnncrdList(ComtnncrdVO vo) throws Exception {
        return list("comtnncrdDAO.selectComtnncrdList_D", vo);
    }

    /**
	 * comtnncrd 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnncrd 총 갯수
	 * @exception
	 */
    public int selectComtnncrdListTotCnt(ComtnncrdVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnncrdDAO.selectComtnncrdListTotCnt_S", vo);
    }

}
