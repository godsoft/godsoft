package kr.godsoft.egovframe.generatorwebapp.comtrdnmadrzip.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtrdnmadrzip.service.ComtrdnmadrzipVO;

/**
 * @Class Name : ComtrdnmadrzipDAO.java
 * @Description : Comtrdnmadrzip DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtrdnmadrzipDAO")
public class ComtrdnmadrzipDAO extends EgovAbstractDAO {

	/**
	 * comtrdnmadrzip을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtrdnmadrzipVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtrdnmadrzip(ComtrdnmadrzipVO vo) throws Exception {
        return (String)insert("comtrdnmadrzipDAO.insertComtrdnmadrzip_S", vo);
    }

    /**
	 * comtrdnmadrzip을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtrdnmadrzipVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtrdnmadrzip(ComtrdnmadrzipVO vo) throws Exception {
        update("comtrdnmadrzipDAO.updateComtrdnmadrzip_S", vo);
    }

    /**
	 * comtrdnmadrzip을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtrdnmadrzipVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtrdnmadrzip(ComtrdnmadrzipVO vo) throws Exception {
        delete("comtrdnmadrzipDAO.deleteComtrdnmadrzip_S", vo);
    }

    /**
	 * comtrdnmadrzip을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtrdnmadrzipVO
	 * @return 조회한 comtrdnmadrzip
	 * @exception Exception
	 */
    public ComtrdnmadrzipVO selectComtrdnmadrzip(ComtrdnmadrzipVO vo) throws Exception {
        return (ComtrdnmadrzipVO) selectByPk("comtrdnmadrzipDAO.selectComtrdnmadrzip_S", vo);
    }

    /**
	 * comtrdnmadrzip 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtrdnmadrzip 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtrdnmadrzipList(ComtrdnmadrzipVO vo) throws Exception {
        return list("comtrdnmadrzipDAO.selectComtrdnmadrzipList_D", vo);
    }

    /**
	 * comtrdnmadrzip 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtrdnmadrzip 총 갯수
	 * @exception
	 */
    public int selectComtrdnmadrzipListTotCnt(ComtrdnmadrzipVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtrdnmadrzipDAO.selectComtrdnmadrzipListTotCnt_S", vo);
    }

}
