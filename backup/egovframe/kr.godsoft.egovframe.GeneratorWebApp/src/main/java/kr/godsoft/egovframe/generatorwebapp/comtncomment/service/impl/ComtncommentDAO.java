package kr.godsoft.egovframe.generatorwebapp.comtncomment.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtncomment.service.ComtncommentVO;

/**
 * @Class Name : ComtncommentDAO.java
 * @Description : Comtncomment DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtncommentDAO")
public class ComtncommentDAO extends EgovAbstractDAO {

	/**
	 * COMTNCOMMENT을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtncommentVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtncomment(ComtncommentVO vo) throws Exception {
        return (String)insert("comtncommentDAO.insertComtncomment_S", vo);
    }

    /**
	 * COMTNCOMMENT을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtncommentVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtncomment(ComtncommentVO vo) throws Exception {
        update("comtncommentDAO.updateComtncomment_S", vo);
    }

    /**
	 * COMTNCOMMENT을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtncommentVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtncomment(ComtncommentVO vo) throws Exception {
        delete("comtncommentDAO.deleteComtncomment_S", vo);
    }

    /**
	 * COMTNCOMMENT을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtncommentVO
	 * @return 조회한 COMTNCOMMENT
	 * @exception Exception
	 */
    public ComtncommentVO selectComtncomment(ComtncommentVO vo) throws Exception {
        return (ComtncommentVO) selectByPk("comtncommentDAO.selectComtncomment_S", vo);
    }

    /**
	 * COMTNCOMMENT 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNCOMMENT 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtncommentList(ComtncommentVO vo) throws Exception {
        return list("comtncommentDAO.selectComtncommentList_D", vo);
    }

    /**
	 * COMTNCOMMENT 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNCOMMENT 총 갯수
	 * @exception
	 */
    public int selectComtncommentListTotCnt(ComtncommentVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtncommentDAO.selectComtncommentListTotCnt_S", vo);
    }

}
