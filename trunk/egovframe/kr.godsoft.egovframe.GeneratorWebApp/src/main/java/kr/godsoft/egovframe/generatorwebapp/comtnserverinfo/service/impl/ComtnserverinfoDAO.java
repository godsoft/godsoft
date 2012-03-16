package kr.godsoft.egovframe.generatorwebapp.comtnserverinfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnserverinfo.service.ComtnserverinfoVO;

/**
 * @Class Name : ComtnserverinfoDAO.java
 * @Description : Comtnserverinfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnserverinfoDAO")
public class ComtnserverinfoDAO extends EgovAbstractDAO {

	/**
	 * comtnserverinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnserverinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnserverinfo(ComtnserverinfoVO vo) throws Exception {
        return (String)insert("comtnserverinfoDAO.insertComtnserverinfo_S", vo);
    }

    /**
	 * comtnserverinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnserverinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnserverinfo(ComtnserverinfoVO vo) throws Exception {
        update("comtnserverinfoDAO.updateComtnserverinfo_S", vo);
    }

    /**
	 * comtnserverinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnserverinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnserverinfo(ComtnserverinfoVO vo) throws Exception {
        delete("comtnserverinfoDAO.deleteComtnserverinfo_S", vo);
    }

    /**
	 * comtnserverinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnserverinfoVO
	 * @return 조회한 comtnserverinfo
	 * @exception Exception
	 */
    public ComtnserverinfoVO selectComtnserverinfo(ComtnserverinfoVO vo) throws Exception {
        return (ComtnserverinfoVO) selectByPk("comtnserverinfoDAO.selectComtnserverinfo_S", vo);
    }

    /**
	 * comtnserverinfo 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnserverinfo 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnserverinfoList(ComtnserverinfoVO vo) throws Exception {
        return list("comtnserverinfoDAO.selectComtnserverinfoList_D", vo);
    }

    /**
	 * comtnserverinfo 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnserverinfo 총 갯수
	 * @exception
	 */
    public int selectComtnserverinfoListTotCnt(ComtnserverinfoVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnserverinfoDAO.selectComtnserverinfoListTotCnt_S", vo);
    }

}
