package kr.godsoft.egovframe.generatorwebapp.comthconfmhistory.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comthconfmhistory.service.ComthconfmhistoryVO;

/**
 * @Class Name : ComthconfmhistoryDAO.java
 * @Description : Comthconfmhistory DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comthconfmhistoryDAO")
public class ComthconfmhistoryDAO extends EgovAbstractDAO {

	/**
	 * comthconfmhistory을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComthconfmhistoryVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComthconfmhistory(ComthconfmhistoryVO vo) throws Exception {
        return (String)insert("comthconfmhistoryDAO.insertComthconfmhistory_S", vo);
    }

    /**
	 * comthconfmhistory을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComthconfmhistoryVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComthconfmhistory(ComthconfmhistoryVO vo) throws Exception {
        update("comthconfmhistoryDAO.updateComthconfmhistory_S", vo);
    }

    /**
	 * comthconfmhistory을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComthconfmhistoryVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComthconfmhistory(ComthconfmhistoryVO vo) throws Exception {
        delete("comthconfmhistoryDAO.deleteComthconfmhistory_S", vo);
    }

    /**
	 * comthconfmhistory을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComthconfmhistoryVO
	 * @return 조회한 comthconfmhistory
	 * @exception Exception
	 */
    public ComthconfmhistoryVO selectComthconfmhistory(ComthconfmhistoryVO vo) throws Exception {
        return (ComthconfmhistoryVO) selectByPk("comthconfmhistoryDAO.selectComthconfmhistory_S", vo);
    }

    /**
	 * comthconfmhistory 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comthconfmhistory 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComthconfmhistoryList(ComthconfmhistoryVO vo) throws Exception {
        return list("comthconfmhistoryDAO.selectComthconfmhistoryList_D", vo);
    }

    /**
	 * comthconfmhistory 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comthconfmhistory 총 갯수
	 * @exception
	 */
    public int selectComthconfmhistoryListTotCnt(ComthconfmhistoryVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comthconfmhistoryDAO.selectComthconfmhistoryListTotCnt_S", vo);
    }

}
