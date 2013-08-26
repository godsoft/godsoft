package kr.godsoft.egovframe.generatorwebapp.comtnproxyinfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnproxyinfo.service.ComtnproxyinfoVO;

/**
 * @Class Name : ComtnproxyinfoDAO.java
 * @Description : Comtnproxyinfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnproxyinfoDAO")
public class ComtnproxyinfoDAO extends EgovAbstractDAO {

	/**
	 * COMTNPROXYINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnproxyinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnproxyinfo(ComtnproxyinfoVO vo) throws Exception {
        return (String)insert("comtnproxyinfoDAO.insertComtnproxyinfo_S", vo);
    }

    /**
	 * COMTNPROXYINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnproxyinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnproxyinfo(ComtnproxyinfoVO vo) throws Exception {
        update("comtnproxyinfoDAO.updateComtnproxyinfo_S", vo);
    }

    /**
	 * COMTNPROXYINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnproxyinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnproxyinfo(ComtnproxyinfoVO vo) throws Exception {
        delete("comtnproxyinfoDAO.deleteComtnproxyinfo_S", vo);
    }

    /**
	 * COMTNPROXYINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnproxyinfoVO
	 * @return 조회한 COMTNPROXYINFO
	 * @exception Exception
	 */
    public ComtnproxyinfoVO selectComtnproxyinfo(ComtnproxyinfoVO vo) throws Exception {
        return (ComtnproxyinfoVO) selectByPk("comtnproxyinfoDAO.selectComtnproxyinfo_S", vo);
    }

    /**
	 * COMTNPROXYINFO 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNPROXYINFO 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnproxyinfoList(ComtnproxyinfoVO vo) throws Exception {
        return list("comtnproxyinfoDAO.selectComtnproxyinfoList_D", vo);
    }

    /**
	 * COMTNPROXYINFO 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNPROXYINFO 총 갯수
	 * @exception
	 */
    public int selectComtnproxyinfoListTotCnt(ComtnproxyinfoVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnproxyinfoDAO.selectComtnproxyinfoListTotCnt_S", vo);
    }

}