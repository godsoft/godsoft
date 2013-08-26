package kr.godsoft.egovframe.generatorwebapp.comtnproxyloginfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnproxyloginfo.service.ComtnproxyloginfoVO;

/**
 * @Class Name : ComtnproxyloginfoDAO.java
 * @Description : Comtnproxyloginfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnproxyloginfoDAO")
public class ComtnproxyloginfoDAO extends EgovAbstractDAO {

	/**
	 * COMTNPROXYLOGINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnproxyloginfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnproxyloginfo(ComtnproxyloginfoVO vo) throws Exception {
        return (String)insert("comtnproxyloginfoDAO.insertComtnproxyloginfo_S", vo);
    }

    /**
	 * COMTNPROXYLOGINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnproxyloginfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnproxyloginfo(ComtnproxyloginfoVO vo) throws Exception {
        update("comtnproxyloginfoDAO.updateComtnproxyloginfo_S", vo);
    }

    /**
	 * COMTNPROXYLOGINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnproxyloginfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnproxyloginfo(ComtnproxyloginfoVO vo) throws Exception {
        delete("comtnproxyloginfoDAO.deleteComtnproxyloginfo_S", vo);
    }

    /**
	 * COMTNPROXYLOGINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnproxyloginfoVO
	 * @return 조회한 COMTNPROXYLOGINFO
	 * @exception Exception
	 */
    public ComtnproxyloginfoVO selectComtnproxyloginfo(ComtnproxyloginfoVO vo) throws Exception {
        return (ComtnproxyloginfoVO) selectByPk("comtnproxyloginfoDAO.selectComtnproxyloginfo_S", vo);
    }

    /**
	 * COMTNPROXYLOGINFO 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNPROXYLOGINFO 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnproxyloginfoList(ComtnproxyloginfoVO vo) throws Exception {
        return list("comtnproxyloginfoDAO.selectComtnproxyloginfoList_D", vo);
    }

    /**
	 * COMTNPROXYLOGINFO 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNPROXYLOGINFO 총 갯수
	 * @exception
	 */
    public int selectComtnproxyloginfoListTotCnt(ComtnproxyloginfoVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnproxyloginfoDAO.selectComtnproxyloginfoListTotCnt_S", vo);
    }

}
