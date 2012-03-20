package kr.godsoft.egovframe.generatorwebapp.comtczip.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtczip.service.ComtczipVO;

/**
 * @Class Name : ComtczipDAO.java
 * @Description : Comtczip DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtczipDAO")
public class ComtczipDAO extends EgovAbstractDAO {

	/**
	 * comtczip을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtczipVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtczip(ComtczipVO vo) throws Exception {
        return (String)insert("comtczipDAO.insertComtczip_S", vo);
    }

    /**
	 * comtczip을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtczipVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtczip(ComtczipVO vo) throws Exception {
        update("comtczipDAO.updateComtczip_S", vo);
    }

    /**
	 * comtczip을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtczipVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtczip(ComtczipVO vo) throws Exception {
        delete("comtczipDAO.deleteComtczip_S", vo);
    }

    /**
	 * comtczip을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtczipVO
	 * @return 조회한 comtczip
	 * @exception Exception
	 */
    public ComtczipVO selectComtczip(ComtczipVO vo) throws Exception {
        return (ComtczipVO) selectByPk("comtczipDAO.selectComtczip_S", vo);
    }

    /**
	 * comtczip 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtczip 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtczipList(ComtczipVO vo) throws Exception {
        return list("comtczipDAO.selectComtczipList_D", vo);
    }

    /**
	 * comtczip 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtczip 총 갯수
	 * @exception
	 */
    public int selectComtczipListTotCnt(ComtczipVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtczipDAO.selectComtczipListTotCnt_S", vo);
    }

}
