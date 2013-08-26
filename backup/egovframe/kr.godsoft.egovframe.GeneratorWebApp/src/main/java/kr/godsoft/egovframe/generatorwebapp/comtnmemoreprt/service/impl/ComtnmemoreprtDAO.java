package kr.godsoft.egovframe.generatorwebapp.comtnmemoreprt.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnmemoreprt.service.ComtnmemoreprtVO;

/**
 * @Class Name : ComtnmemoreprtDAO.java
 * @Description : Comtnmemoreprt DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnmemoreprtDAO")
public class ComtnmemoreprtDAO extends EgovAbstractDAO {

	/**
	 * COMTNMEMOREPRT을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnmemoreprtVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnmemoreprt(ComtnmemoreprtVO vo) throws Exception {
        return (String)insert("comtnmemoreprtDAO.insertComtnmemoreprt_S", vo);
    }

    /**
	 * COMTNMEMOREPRT을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnmemoreprtVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnmemoreprt(ComtnmemoreprtVO vo) throws Exception {
        update("comtnmemoreprtDAO.updateComtnmemoreprt_S", vo);
    }

    /**
	 * COMTNMEMOREPRT을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnmemoreprtVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnmemoreprt(ComtnmemoreprtVO vo) throws Exception {
        delete("comtnmemoreprtDAO.deleteComtnmemoreprt_S", vo);
    }

    /**
	 * COMTNMEMOREPRT을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnmemoreprtVO
	 * @return 조회한 COMTNMEMOREPRT
	 * @exception Exception
	 */
    public ComtnmemoreprtVO selectComtnmemoreprt(ComtnmemoreprtVO vo) throws Exception {
        return (ComtnmemoreprtVO) selectByPk("comtnmemoreprtDAO.selectComtnmemoreprt_S", vo);
    }

    /**
	 * COMTNMEMOREPRT 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNMEMOREPRT 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnmemoreprtList(ComtnmemoreprtVO vo) throws Exception {
        return list("comtnmemoreprtDAO.selectComtnmemoreprtList_D", vo);
    }

    /**
	 * COMTNMEMOREPRT 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNMEMOREPRT 총 갯수
	 * @exception
	 */
    public int selectComtnmemoreprtListTotCnt(ComtnmemoreprtVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnmemoreprtDAO.selectComtnmemoreprtListTotCnt_S", vo);
    }

}