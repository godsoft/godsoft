package kr.godsoft.egovframe.generatorwebapp.comtnprocessmonloginfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtnprocessmonloginfo.service.ComtnprocessmonloginfoVO;
import kr.godsoft.egovframe.generatorwebapp.comtnprocessmonloginfo.service.ComtnprocessmonloginfoDefaultVO;

/**
 * @Class Name : ComtnprocessmonloginfoDAO.java
 * @Description : Comtnprocessmonloginfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnprocessmonloginfoDAO")
public class ComtnprocessmonloginfoDAO extends EgovAbstractDAO {

	/**
	 * comtnprocessmonloginfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnprocessmonloginfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnprocessmonloginfo(ComtnprocessmonloginfoVO vo) throws Exception {
        return (String)insert("comtnprocessmonloginfoDAO.insertComtnprocessmonloginfo_S", vo);
    }

    /**
	 * comtnprocessmonloginfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnprocessmonloginfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnprocessmonloginfo(ComtnprocessmonloginfoVO vo) throws Exception {
        update("comtnprocessmonloginfoDAO.updateComtnprocessmonloginfo_S", vo);
    }

    /**
	 * comtnprocessmonloginfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnprocessmonloginfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnprocessmonloginfo(ComtnprocessmonloginfoVO vo) throws Exception {
        delete("comtnprocessmonloginfoDAO.deleteComtnprocessmonloginfo_S", vo);
    }

    /**
	 * comtnprocessmonloginfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnprocessmonloginfoVO
	 * @return 조회한 comtnprocessmonloginfo
	 * @exception Exception
	 */
    public ComtnprocessmonloginfoVO selectComtnprocessmonloginfo(ComtnprocessmonloginfoVO vo) throws Exception {
        return (ComtnprocessmonloginfoVO) selectByPk("comtnprocessmonloginfoDAO.selectComtnprocessmonloginfo_S", vo);
    }

    /**
	 * comtnprocessmonloginfo 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnprocessmonloginfo 목록
	 * @exception Exception
	 */
    public List selectComtnprocessmonloginfoList(ComtnprocessmonloginfoDefaultVO searchVO) throws Exception {
        return list("comtnprocessmonloginfoDAO.selectComtnprocessmonloginfoList_D", searchVO);
    }

    /**
	 * comtnprocessmonloginfo 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnprocessmonloginfo 총 갯수
	 * @exception
	 */
    public int selectComtnprocessmonloginfoListTotCnt(ComtnprocessmonloginfoDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnprocessmonloginfoDAO.selectComtnprocessmonloginfoListTotCnt_S", searchVO);
    }

}
