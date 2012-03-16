package kr.godsoft.egovframe.generatorwebapp.comtntroblinfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtntroblinfo.service.ComtntroblinfoVO;

/**
 * @Class Name : ComtntroblinfoDAO.java
 * @Description : Comtntroblinfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtntroblinfoDAO")
public class ComtntroblinfoDAO extends EgovAbstractDAO {

	/**
	 * comtntroblinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtntroblinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtntroblinfo(ComtntroblinfoVO vo) throws Exception {
        return (String)insert("comtntroblinfoDAO.insertComtntroblinfo_S", vo);
    }

    /**
	 * comtntroblinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtntroblinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtntroblinfo(ComtntroblinfoVO vo) throws Exception {
        update("comtntroblinfoDAO.updateComtntroblinfo_S", vo);
    }

    /**
	 * comtntroblinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtntroblinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtntroblinfo(ComtntroblinfoVO vo) throws Exception {
        delete("comtntroblinfoDAO.deleteComtntroblinfo_S", vo);
    }

    /**
	 * comtntroblinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtntroblinfoVO
	 * @return 조회한 comtntroblinfo
	 * @exception Exception
	 */
    public ComtntroblinfoVO selectComtntroblinfo(ComtntroblinfoVO vo) throws Exception {
        return (ComtntroblinfoVO) selectByPk("comtntroblinfoDAO.selectComtntroblinfo_S", vo);
    }

    /**
	 * comtntroblinfo 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtntroblinfo 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtntroblinfoList(ComtntroblinfoVO vo) throws Exception {
        return list("comtntroblinfoDAO.selectComtntroblinfoList_D", vo);
    }

    /**
	 * comtntroblinfo 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtntroblinfo 총 갯수
	 * @exception
	 */
    public int selectComtntroblinfoListTotCnt(ComtntroblinfoVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtntroblinfoDAO.selectComtntroblinfoListTotCnt_S", vo);
    }

}
