package kr.godsoft.egovframe.generatorwebapp.comtnbbsmaster.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnbbsmaster.service.ComtnbbsmasterVO;

/**
 * @Class Name : ComtnbbsmasterDAO.java
 * @Description : Comtnbbsmaster DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnbbsmasterDAO")
public class ComtnbbsmasterDAO extends EgovAbstractDAO {

	/**
	 * comtnbbsmaster을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbbsmasterVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnbbsmaster(ComtnbbsmasterVO vo) throws Exception {
        return (String)insert("comtnbbsmasterDAO.insertComtnbbsmaster_S", vo);
    }

    /**
	 * comtnbbsmaster을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbbsmasterVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnbbsmaster(ComtnbbsmasterVO vo) throws Exception {
        update("comtnbbsmasterDAO.updateComtnbbsmaster_S", vo);
    }

    /**
	 * comtnbbsmaster을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbbsmasterVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnbbsmaster(ComtnbbsmasterVO vo) throws Exception {
        delete("comtnbbsmasterDAO.deleteComtnbbsmaster_S", vo);
    }

    /**
	 * comtnbbsmaster을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbbsmasterVO
	 * @return 조회한 comtnbbsmaster
	 * @exception Exception
	 */
    public ComtnbbsmasterVO selectComtnbbsmaster(ComtnbbsmasterVO vo) throws Exception {
        return (ComtnbbsmasterVO) selectByPk("comtnbbsmasterDAO.selectComtnbbsmaster_S", vo);
    }

    /**
	 * comtnbbsmaster 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnbbsmaster 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnbbsmasterList(ComtnbbsmasterVO vo) throws Exception {
        return list("comtnbbsmasterDAO.selectComtnbbsmasterList_D", vo);
    }

    /**
	 * comtnbbsmaster 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnbbsmaster 총 갯수
	 * @exception
	 */
    public int selectComtnbbsmasterListTotCnt(ComtnbbsmasterVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnbbsmasterDAO.selectComtnbbsmasterListTotCnt_S", vo);
    }

}
