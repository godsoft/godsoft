package kr.godsoft.egovframe.generatorwebapp.comtnqainfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtnqainfo.service.ComtnqainfoVO;
import kr.godsoft.egovframe.generatorwebapp.comtnqainfo.service.ComtnqainfoDefaultVO;

/**
 * @Class Name : ComtnqainfoDAO.java
 * @Description : Comtnqainfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnqainfoDAO")
public class ComtnqainfoDAO extends EgovAbstractDAO {

	/**
	 * comtnqainfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnqainfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnqainfo(ComtnqainfoVO vo) throws Exception {
        return (String)insert("comtnqainfoDAO.insertComtnqainfo_S", vo);
    }

    /**
	 * comtnqainfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnqainfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnqainfo(ComtnqainfoVO vo) throws Exception {
        update("comtnqainfoDAO.updateComtnqainfo_S", vo);
    }

    /**
	 * comtnqainfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnqainfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnqainfo(ComtnqainfoVO vo) throws Exception {
        delete("comtnqainfoDAO.deleteComtnqainfo_S", vo);
    }

    /**
	 * comtnqainfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnqainfoVO
	 * @return 조회한 comtnqainfo
	 * @exception Exception
	 */
    public ComtnqainfoVO selectComtnqainfo(ComtnqainfoVO vo) throws Exception {
        return (ComtnqainfoVO) selectByPk("comtnqainfoDAO.selectComtnqainfo_S", vo);
    }

    /**
	 * comtnqainfo 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnqainfo 목록
	 * @exception Exception
	 */
    public List selectComtnqainfoList(ComtnqainfoDefaultVO searchVO) throws Exception {
        return list("comtnqainfoDAO.selectComtnqainfoList_D", searchVO);
    }

    /**
	 * comtnqainfo 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnqainfo 총 갯수
	 * @exception
	 */
    public int selectComtnqainfoListTotCnt(ComtnqainfoDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnqainfoDAO.selectComtnqainfoListTotCnt_S", searchVO);
    }

}