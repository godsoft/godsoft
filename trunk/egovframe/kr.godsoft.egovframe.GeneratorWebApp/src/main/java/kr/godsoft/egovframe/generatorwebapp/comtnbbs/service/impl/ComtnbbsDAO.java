package kr.godsoft.egovframe.generatorwebapp.comtnbbs.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtnbbs.service.ComtnbbsVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbbs.service.ComtnbbsDefaultVO;

/**
 * @Class Name : ComtnbbsDAO.java
 * @Description : Comtnbbs DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnbbsDAO")
public class ComtnbbsDAO extends EgovAbstractDAO {

	/**
	 * comtnbbs을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbbsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnbbs(ComtnbbsVO vo) throws Exception {
        return (String)insert("comtnbbsDAO.insertComtnbbs_S", vo);
    }

    /**
	 * comtnbbs을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbbsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnbbs(ComtnbbsVO vo) throws Exception {
        update("comtnbbsDAO.updateComtnbbs_S", vo);
    }

    /**
	 * comtnbbs을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbbsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnbbs(ComtnbbsVO vo) throws Exception {
        delete("comtnbbsDAO.deleteComtnbbs_S", vo);
    }

    /**
	 * comtnbbs을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbbsVO
	 * @return 조회한 comtnbbs
	 * @exception Exception
	 */
    public ComtnbbsVO selectComtnbbs(ComtnbbsVO vo) throws Exception {
        return (ComtnbbsVO) selectByPk("comtnbbsDAO.selectComtnbbs_S", vo);
    }

    /**
	 * comtnbbs 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnbbs 목록
	 * @exception Exception
	 */
    public List selectComtnbbsList(ComtnbbsDefaultVO searchVO) throws Exception {
        return list("comtnbbsDAO.selectComtnbbsList_D", searchVO);
    }

    /**
	 * comtnbbs 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnbbs 총 갯수
	 * @exception
	 */
    public int selectComtnbbsListTotCnt(ComtnbbsDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnbbsDAO.selectComtnbbsListTotCnt_S", searchVO);
    }

}
