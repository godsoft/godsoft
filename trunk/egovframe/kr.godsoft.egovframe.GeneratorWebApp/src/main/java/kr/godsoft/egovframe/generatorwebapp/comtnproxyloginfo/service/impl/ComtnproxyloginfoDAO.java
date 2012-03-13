package kr.godsoft.egovframe.generatorwebapp.comtnproxyloginfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtnproxyloginfo.service.ComtnproxyloginfoVO;
import kr.godsoft.egovframe.generatorwebapp.comtnproxyloginfo.service.ComtnproxyloginfoDefaultVO;

/**
 * @Class Name : ComtnproxyloginfoDAO.java
 * @Description : Comtnproxyloginfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnproxyloginfoDAO")
public class ComtnproxyloginfoDAO extends EgovAbstractDAO {

	/**
	 * comtnproxyloginfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnproxyloginfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnproxyloginfo(ComtnproxyloginfoVO vo) throws Exception {
        return (String)insert("comtnproxyloginfoDAO.insertComtnproxyloginfo_S", vo);
    }

    /**
	 * comtnproxyloginfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnproxyloginfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnproxyloginfo(ComtnproxyloginfoVO vo) throws Exception {
        update("comtnproxyloginfoDAO.updateComtnproxyloginfo_S", vo);
    }

    /**
	 * comtnproxyloginfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnproxyloginfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnproxyloginfo(ComtnproxyloginfoVO vo) throws Exception {
        delete("comtnproxyloginfoDAO.deleteComtnproxyloginfo_S", vo);
    }

    /**
	 * comtnproxyloginfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnproxyloginfoVO
	 * @return 조회한 comtnproxyloginfo
	 * @exception Exception
	 */
    public ComtnproxyloginfoVO selectComtnproxyloginfo(ComtnproxyloginfoVO vo) throws Exception {
        return (ComtnproxyloginfoVO) selectByPk("comtnproxyloginfoDAO.selectComtnproxyloginfo_S", vo);
    }

    /**
	 * comtnproxyloginfo 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnproxyloginfo 목록
	 * @exception Exception
	 */
    public List selectComtnproxyloginfoList(ComtnproxyloginfoDefaultVO searchVO) throws Exception {
        return list("comtnproxyloginfoDAO.selectComtnproxyloginfoList_D", searchVO);
    }

    /**
	 * comtnproxyloginfo 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnproxyloginfo 총 갯수
	 * @exception
	 */
    public int selectComtnproxyloginfoListTotCnt(ComtnproxyloginfoDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnproxyloginfoDAO.selectComtnproxyloginfoListTotCnt_S", searchVO);
    }

}
