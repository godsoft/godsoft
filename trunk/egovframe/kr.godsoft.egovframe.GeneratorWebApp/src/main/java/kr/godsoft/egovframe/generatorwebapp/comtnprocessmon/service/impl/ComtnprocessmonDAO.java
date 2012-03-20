package kr.godsoft.egovframe.generatorwebapp.comtnprocessmon.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnprocessmon.service.ComtnprocessmonVO;

/**
 * @Class Name : ComtnprocessmonDAO.java
 * @Description : Comtnprocessmon DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnprocessmonDAO")
public class ComtnprocessmonDAO extends EgovAbstractDAO {

	/**
	 * comtnprocessmon을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnprocessmonVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnprocessmon(ComtnprocessmonVO vo) throws Exception {
        return (String)insert("comtnprocessmonDAO.insertComtnprocessmon_S", vo);
    }

    /**
	 * comtnprocessmon을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnprocessmonVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnprocessmon(ComtnprocessmonVO vo) throws Exception {
        update("comtnprocessmonDAO.updateComtnprocessmon_S", vo);
    }

    /**
	 * comtnprocessmon을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnprocessmonVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnprocessmon(ComtnprocessmonVO vo) throws Exception {
        delete("comtnprocessmonDAO.deleteComtnprocessmon_S", vo);
    }

    /**
	 * comtnprocessmon을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnprocessmonVO
	 * @return 조회한 comtnprocessmon
	 * @exception Exception
	 */
    public ComtnprocessmonVO selectComtnprocessmon(ComtnprocessmonVO vo) throws Exception {
        return (ComtnprocessmonVO) selectByPk("comtnprocessmonDAO.selectComtnprocessmon_S", vo);
    }

    /**
	 * comtnprocessmon 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnprocessmon 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnprocessmonList(ComtnprocessmonVO vo) throws Exception {
        return list("comtnprocessmonDAO.selectComtnprocessmonList_D", vo);
    }

    /**
	 * comtnprocessmon 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnprocessmon 총 갯수
	 * @exception
	 */
    public int selectComtnprocessmonListTotCnt(ComtnprocessmonVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnprocessmonDAO.selectComtnprocessmonListTotCnt_S", vo);
    }

}
