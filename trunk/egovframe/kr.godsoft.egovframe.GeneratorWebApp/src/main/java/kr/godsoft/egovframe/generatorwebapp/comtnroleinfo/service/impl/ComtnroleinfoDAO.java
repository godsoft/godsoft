package kr.godsoft.egovframe.generatorwebapp.comtnroleinfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnroleinfo.service.ComtnroleinfoVO;

/**
 * @Class Name : ComtnroleinfoDAO.java
 * @Description : Comtnroleinfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnroleinfoDAO")
public class ComtnroleinfoDAO extends EgovAbstractDAO {

	/**
	 * comtnroleinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnroleinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnroleinfo(ComtnroleinfoVO vo) throws Exception {
        return (String)insert("comtnroleinfoDAO.insertComtnroleinfo_S", vo);
    }

    /**
	 * comtnroleinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnroleinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnroleinfo(ComtnroleinfoVO vo) throws Exception {
        update("comtnroleinfoDAO.updateComtnroleinfo_S", vo);
    }

    /**
	 * comtnroleinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnroleinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnroleinfo(ComtnroleinfoVO vo) throws Exception {
        delete("comtnroleinfoDAO.deleteComtnroleinfo_S", vo);
    }

    /**
	 * comtnroleinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnroleinfoVO
	 * @return 조회한 comtnroleinfo
	 * @exception Exception
	 */
    public ComtnroleinfoVO selectComtnroleinfo(ComtnroleinfoVO vo) throws Exception {
        return (ComtnroleinfoVO) selectByPk("comtnroleinfoDAO.selectComtnroleinfo_S", vo);
    }

    /**
	 * comtnroleinfo 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnroleinfo 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnroleinfoList(ComtnroleinfoVO vo) throws Exception {
        return list("comtnroleinfoDAO.selectComtnroleinfoList_D", vo);
    }

    /**
	 * comtnroleinfo 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnroleinfo 총 갯수
	 * @exception
	 */
    public int selectComtnroleinfoListTotCnt(ComtnroleinfoVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnroleinfoDAO.selectComtnroleinfoListTotCnt_S", vo);
    }

}
