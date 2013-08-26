package kr.godsoft.egovframe.generatorwebapp.comtnqainfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnqainfo.service.ComtnqainfoVO;

/**
 * @Class Name : ComtnqainfoDAO.java
 * @Description : Comtnqainfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnqainfoDAO")
public class ComtnqainfoDAO extends EgovAbstractDAO {

	/**
	 * COMTNQAINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnqainfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnqainfo(ComtnqainfoVO vo) throws Exception {
        return (String)insert("comtnqainfoDAO.insertComtnqainfo_S", vo);
    }

    /**
	 * COMTNQAINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnqainfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnqainfo(ComtnqainfoVO vo) throws Exception {
        update("comtnqainfoDAO.updateComtnqainfo_S", vo);
    }

    /**
	 * COMTNQAINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnqainfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnqainfo(ComtnqainfoVO vo) throws Exception {
        delete("comtnqainfoDAO.deleteComtnqainfo_S", vo);
    }

    /**
	 * COMTNQAINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnqainfoVO
	 * @return 조회한 COMTNQAINFO
	 * @exception Exception
	 */
    public ComtnqainfoVO selectComtnqainfo(ComtnqainfoVO vo) throws Exception {
        return (ComtnqainfoVO) selectByPk("comtnqainfoDAO.selectComtnqainfo_S", vo);
    }

    /**
	 * COMTNQAINFO 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNQAINFO 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnqainfoList(ComtnqainfoVO vo) throws Exception {
        return list("comtnqainfoDAO.selectComtnqainfoList_D", vo);
    }

    /**
	 * COMTNQAINFO 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNQAINFO 총 갯수
	 * @exception
	 */
    public int selectComtnqainfoListTotCnt(ComtnqainfoVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnqainfoDAO.selectComtnqainfoListTotCnt_S", vo);
    }

}
