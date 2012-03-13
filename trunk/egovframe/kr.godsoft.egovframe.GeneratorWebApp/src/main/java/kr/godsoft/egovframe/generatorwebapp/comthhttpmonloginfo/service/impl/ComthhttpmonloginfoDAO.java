package kr.godsoft.egovframe.generatorwebapp.comthhttpmonloginfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comthhttpmonloginfo.service.ComthhttpmonloginfoVO;
import kr.godsoft.egovframe.generatorwebapp.comthhttpmonloginfo.service.ComthhttpmonloginfoDefaultVO;

/**
 * @Class Name : ComthhttpmonloginfoDAO.java
 * @Description : Comthhttpmonloginfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comthhttpmonloginfoDAO")
public class ComthhttpmonloginfoDAO extends EgovAbstractDAO {

	/**
	 * comthhttpmonloginfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComthhttpmonloginfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComthhttpmonloginfo(ComthhttpmonloginfoVO vo) throws Exception {
        return (String)insert("comthhttpmonloginfoDAO.insertComthhttpmonloginfo_S", vo);
    }

    /**
	 * comthhttpmonloginfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComthhttpmonloginfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComthhttpmonloginfo(ComthhttpmonloginfoVO vo) throws Exception {
        update("comthhttpmonloginfoDAO.updateComthhttpmonloginfo_S", vo);
    }

    /**
	 * comthhttpmonloginfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComthhttpmonloginfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComthhttpmonloginfo(ComthhttpmonloginfoVO vo) throws Exception {
        delete("comthhttpmonloginfoDAO.deleteComthhttpmonloginfo_S", vo);
    }

    /**
	 * comthhttpmonloginfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComthhttpmonloginfoVO
	 * @return 조회한 comthhttpmonloginfo
	 * @exception Exception
	 */
    public ComthhttpmonloginfoVO selectComthhttpmonloginfo(ComthhttpmonloginfoVO vo) throws Exception {
        return (ComthhttpmonloginfoVO) selectByPk("comthhttpmonloginfoDAO.selectComthhttpmonloginfo_S", vo);
    }

    /**
	 * comthhttpmonloginfo 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comthhttpmonloginfo 목록
	 * @exception Exception
	 */
    public List selectComthhttpmonloginfoList(ComthhttpmonloginfoDefaultVO searchVO) throws Exception {
        return list("comthhttpmonloginfoDAO.selectComthhttpmonloginfoList_D", searchVO);
    }

    /**
	 * comthhttpmonloginfo 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comthhttpmonloginfo 총 갯수
	 * @exception
	 */
    public int selectComthhttpmonloginfoListTotCnt(ComthhttpmonloginfoDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comthhttpmonloginfoDAO.selectComthhttpmonloginfoListTotCnt_S", searchVO);
    }

}
