package kr.godsoft.egovframe.generatorwebapp.comtnprocessmonloginfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnprocessmonloginfo.service.ComtnprocessmonloginfoVO;

/**
 * @Class Name : ComtnprocessmonloginfoDAO.java
 * @Description : Comtnprocessmonloginfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnprocessmonloginfoDAO")
public class ComtnprocessmonloginfoDAO extends EgovAbstractDAO {

	/**
	 * COMTNPROCESSMONLOGINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnprocessmonloginfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnprocessmonloginfo(ComtnprocessmonloginfoVO vo) throws Exception {
        return (String)insert("comtnprocessmonloginfoDAO.insertComtnprocessmonloginfo_S", vo);
    }

    /**
	 * COMTNPROCESSMONLOGINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnprocessmonloginfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnprocessmonloginfo(ComtnprocessmonloginfoVO vo) throws Exception {
        update("comtnprocessmonloginfoDAO.updateComtnprocessmonloginfo_S", vo);
    }

    /**
	 * COMTNPROCESSMONLOGINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnprocessmonloginfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnprocessmonloginfo(ComtnprocessmonloginfoVO vo) throws Exception {
        delete("comtnprocessmonloginfoDAO.deleteComtnprocessmonloginfo_S", vo);
    }

    /**
	 * COMTNPROCESSMONLOGINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnprocessmonloginfoVO
	 * @return 조회한 COMTNPROCESSMONLOGINFO
	 * @exception Exception
	 */
    public ComtnprocessmonloginfoVO selectComtnprocessmonloginfo(ComtnprocessmonloginfoVO vo) throws Exception {
        return (ComtnprocessmonloginfoVO) selectByPk("comtnprocessmonloginfoDAO.selectComtnprocessmonloginfo_S", vo);
    }

    /**
	 * COMTNPROCESSMONLOGINFO 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNPROCESSMONLOGINFO 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnprocessmonloginfoList(ComtnprocessmonloginfoVO vo) throws Exception {
        return list("comtnprocessmonloginfoDAO.selectComtnprocessmonloginfoList_D", vo);
    }

    /**
	 * COMTNPROCESSMONLOGINFO 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNPROCESSMONLOGINFO 총 갯수
	 * @exception
	 */
    public int selectComtnprocessmonloginfoListTotCnt(ComtnprocessmonloginfoVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnprocessmonloginfoDAO.selectComtnprocessmonloginfoListTotCnt_S", vo);
    }

}
