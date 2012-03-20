package kr.godsoft.egovframe.generatorwebapp.comtnbanner.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnbanner.service.ComtnbannerVO;

/**
 * @Class Name : ComtnbannerDAO.java
 * @Description : Comtnbanner DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnbannerDAO")
public class ComtnbannerDAO extends EgovAbstractDAO {

	/**
	 * comtnbanner을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbannerVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnbanner(ComtnbannerVO vo) throws Exception {
        return (String)insert("comtnbannerDAO.insertComtnbanner_S", vo);
    }

    /**
	 * comtnbanner을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbannerVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnbanner(ComtnbannerVO vo) throws Exception {
        update("comtnbannerDAO.updateComtnbanner_S", vo);
    }

    /**
	 * comtnbanner을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbannerVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnbanner(ComtnbannerVO vo) throws Exception {
        delete("comtnbannerDAO.deleteComtnbanner_S", vo);
    }

    /**
	 * comtnbanner을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbannerVO
	 * @return 조회한 comtnbanner
	 * @exception Exception
	 */
    public ComtnbannerVO selectComtnbanner(ComtnbannerVO vo) throws Exception {
        return (ComtnbannerVO) selectByPk("comtnbannerDAO.selectComtnbanner_S", vo);
    }

    /**
	 * comtnbanner 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnbanner 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnbannerList(ComtnbannerVO vo) throws Exception {
        return list("comtnbannerDAO.selectComtnbannerList_D", vo);
    }

    /**
	 * comtnbanner 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnbanner 총 갯수
	 * @exception
	 */
    public int selectComtnbannerListTotCnt(ComtnbannerVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnbannerDAO.selectComtnbannerListTotCnt_S", vo);
    }

}
