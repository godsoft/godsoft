package kr.godsoft.egovframe.generatorwebapp.comtnextrlhrinfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnextrlhrinfo.service.ComtnextrlhrinfoVO;

/**
 * @Class Name : ComtnextrlhrinfoDAO.java
 * @Description : Comtnextrlhrinfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnextrlhrinfoDAO")
public class ComtnextrlhrinfoDAO extends EgovAbstractDAO {

	/**
	 * COMTNEXTRLHRINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnextrlhrinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnextrlhrinfo(ComtnextrlhrinfoVO vo) throws Exception {
        return (String)insert("comtnextrlhrinfoDAO.insertComtnextrlhrinfo_S", vo);
    }

    /**
	 * COMTNEXTRLHRINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnextrlhrinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnextrlhrinfo(ComtnextrlhrinfoVO vo) throws Exception {
        update("comtnextrlhrinfoDAO.updateComtnextrlhrinfo_S", vo);
    }

    /**
	 * COMTNEXTRLHRINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnextrlhrinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnextrlhrinfo(ComtnextrlhrinfoVO vo) throws Exception {
        delete("comtnextrlhrinfoDAO.deleteComtnextrlhrinfo_S", vo);
    }

    /**
	 * COMTNEXTRLHRINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnextrlhrinfoVO
	 * @return 조회한 COMTNEXTRLHRINFO
	 * @exception Exception
	 */
    public ComtnextrlhrinfoVO selectComtnextrlhrinfo(ComtnextrlhrinfoVO vo) throws Exception {
        return (ComtnextrlhrinfoVO) selectByPk("comtnextrlhrinfoDAO.selectComtnextrlhrinfo_S", vo);
    }

    /**
	 * COMTNEXTRLHRINFO 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNEXTRLHRINFO 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnextrlhrinfoList(ComtnextrlhrinfoVO vo) throws Exception {
        return list("comtnextrlhrinfoDAO.selectComtnextrlhrinfoList_D", vo);
    }

    /**
	 * COMTNEXTRLHRINFO 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNEXTRLHRINFO 총 갯수
	 * @exception
	 */
    public int selectComtnextrlhrinfoListTotCnt(ComtnextrlhrinfoVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnextrlhrinfoDAO.selectComtnextrlhrinfoListTotCnt_S", vo);
    }

}
