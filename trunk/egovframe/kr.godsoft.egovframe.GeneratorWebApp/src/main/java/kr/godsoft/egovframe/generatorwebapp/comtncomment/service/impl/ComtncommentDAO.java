package kr.godsoft.egovframe.generatorwebapp.comtncomment.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtncomment.service.ComtncommentVO;
import kr.godsoft.egovframe.generatorwebapp.comtncomment.service.ComtncommentDefaultVO;

/**
 * @Class Name : ComtncommentDAO.java
 * @Description : Comtncomment DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtncommentDAO")
public class ComtncommentDAO extends EgovAbstractDAO {

	/**
	 * comtncomment을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtncommentVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtncomment(ComtncommentVO vo) throws Exception {
        return (String)insert("comtncommentDAO.insertComtncomment_S", vo);
    }

    /**
	 * comtncomment을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtncommentVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtncomment(ComtncommentVO vo) throws Exception {
        update("comtncommentDAO.updateComtncomment_S", vo);
    }

    /**
	 * comtncomment을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtncommentVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtncomment(ComtncommentVO vo) throws Exception {
        delete("comtncommentDAO.deleteComtncomment_S", vo);
    }

    /**
	 * comtncomment을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtncommentVO
	 * @return 조회한 comtncomment
	 * @exception Exception
	 */
    public ComtncommentVO selectComtncomment(ComtncommentVO vo) throws Exception {
        return (ComtncommentVO) selectByPk("comtncommentDAO.selectComtncomment_S", vo);
    }

    /**
	 * comtncomment 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtncomment 목록
	 * @exception Exception
	 */
    public List selectComtncommentList(ComtncommentDefaultVO searchVO) throws Exception {
        return list("comtncommentDAO.selectComtncommentList_D", searchVO);
    }

    /**
	 * comtncomment 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtncomment 총 갯수
	 * @exception
	 */
    public int selectComtncommentListTotCnt(ComtncommentDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtncommentDAO.selectComtncommentListTotCnt_S", searchVO);
    }

}
