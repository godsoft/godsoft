package kr.godsoft.egovframe.generatorwebapp.comtnhpcminfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnhpcminfo.service.ComtnhpcminfoVO;

/**
 * @Class Name : ComtnhpcminfoDAO.java
 * @Description : Comtnhpcminfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnhpcminfoDAO")
public class ComtnhpcminfoDAO extends EgovAbstractDAO {

	/**
	 * comtnhpcminfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnhpcminfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnhpcminfo(ComtnhpcminfoVO vo) throws Exception {
        return (String)insert("comtnhpcminfoDAO.insertComtnhpcminfo_S", vo);
    }

    /**
	 * comtnhpcminfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnhpcminfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnhpcminfo(ComtnhpcminfoVO vo) throws Exception {
        update("comtnhpcminfoDAO.updateComtnhpcminfo_S", vo);
    }

    /**
	 * comtnhpcminfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnhpcminfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnhpcminfo(ComtnhpcminfoVO vo) throws Exception {
        delete("comtnhpcminfoDAO.deleteComtnhpcminfo_S", vo);
    }

    /**
	 * comtnhpcminfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnhpcminfoVO
	 * @return 조회한 comtnhpcminfo
	 * @exception Exception
	 */
    public ComtnhpcminfoVO selectComtnhpcminfo(ComtnhpcminfoVO vo) throws Exception {
        return (ComtnhpcminfoVO) selectByPk("comtnhpcminfoDAO.selectComtnhpcminfo_S", vo);
    }

    /**
	 * comtnhpcminfo 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnhpcminfo 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnhpcminfoList(ComtnhpcminfoVO vo) throws Exception {
        return list("comtnhpcminfoDAO.selectComtnhpcminfoList_D", vo);
    }

    /**
	 * comtnhpcminfo 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnhpcminfo 총 갯수
	 * @exception
	 */
    public int selectComtnhpcminfoListTotCnt(ComtnhpcminfoVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnhpcminfoDAO.selectComtnhpcminfoListTotCnt_S", vo);
    }

}
