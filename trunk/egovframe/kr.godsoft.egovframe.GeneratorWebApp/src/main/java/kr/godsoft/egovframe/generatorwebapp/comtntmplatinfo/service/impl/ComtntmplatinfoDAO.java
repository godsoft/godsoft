package kr.godsoft.egovframe.generatorwebapp.comtntmplatinfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtntmplatinfo.service.ComtntmplatinfoVO;

/**
 * @Class Name : ComtntmplatinfoDAO.java
 * @Description : Comtntmplatinfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtntmplatinfoDAO")
public class ComtntmplatinfoDAO extends EgovAbstractDAO {

	/**
	 * comtntmplatinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtntmplatinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtntmplatinfo(ComtntmplatinfoVO vo) throws Exception {
        return (String)insert("comtntmplatinfoDAO.insertComtntmplatinfo_S", vo);
    }

    /**
	 * comtntmplatinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtntmplatinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtntmplatinfo(ComtntmplatinfoVO vo) throws Exception {
        update("comtntmplatinfoDAO.updateComtntmplatinfo_S", vo);
    }

    /**
	 * comtntmplatinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtntmplatinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtntmplatinfo(ComtntmplatinfoVO vo) throws Exception {
        delete("comtntmplatinfoDAO.deleteComtntmplatinfo_S", vo);
    }

    /**
	 * comtntmplatinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtntmplatinfoVO
	 * @return 조회한 comtntmplatinfo
	 * @exception Exception
	 */
    public ComtntmplatinfoVO selectComtntmplatinfo(ComtntmplatinfoVO vo) throws Exception {
        return (ComtntmplatinfoVO) selectByPk("comtntmplatinfoDAO.selectComtntmplatinfo_S", vo);
    }

    /**
	 * comtntmplatinfo 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtntmplatinfo 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtntmplatinfoList(ComtntmplatinfoVO vo) throws Exception {
        return list("comtntmplatinfoDAO.selectComtntmplatinfoList_D", vo);
    }

    /**
	 * comtntmplatinfo 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtntmplatinfo 총 갯수
	 * @exception
	 */
    public int selectComtntmplatinfoListTotCnt(ComtntmplatinfoVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtntmplatinfoDAO.selectComtntmplatinfoListTotCnt_S", vo);
    }

}
