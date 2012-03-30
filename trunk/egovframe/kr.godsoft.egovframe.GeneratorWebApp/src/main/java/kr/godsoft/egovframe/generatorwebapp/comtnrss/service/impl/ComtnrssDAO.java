package kr.godsoft.egovframe.generatorwebapp.comtnrss.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnrss.service.ComtnrssVO;

/**
 * @Class Name : ComtnrssDAO.java
 * @Description : Comtnrss DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnrssDAO")
public class ComtnrssDAO extends EgovAbstractDAO {

	/**
	 * COMTNRSS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnrssVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnrss(ComtnrssVO vo) throws Exception {
        return (String)insert("comtnrssDAO.insertComtnrss_S", vo);
    }

    /**
	 * COMTNRSS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnrssVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnrss(ComtnrssVO vo) throws Exception {
        update("comtnrssDAO.updateComtnrss_S", vo);
    }

    /**
	 * COMTNRSS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnrssVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnrss(ComtnrssVO vo) throws Exception {
        delete("comtnrssDAO.deleteComtnrss_S", vo);
    }

    /**
	 * COMTNRSS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnrssVO
	 * @return 조회한 COMTNRSS
	 * @exception Exception
	 */
    public ComtnrssVO selectComtnrss(ComtnrssVO vo) throws Exception {
        return (ComtnrssVO) selectByPk("comtnrssDAO.selectComtnrss_S", vo);
    }

    /**
	 * COMTNRSS 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNRSS 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnrssList(ComtnrssVO vo) throws Exception {
        return list("comtnrssDAO.selectComtnrssList_D", vo);
    }

    /**
	 * COMTNRSS 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNRSS 총 갯수
	 * @exception
	 */
    public int selectComtnrssListTotCnt(ComtnrssVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnrssDAO.selectComtnrssListTotCnt_S", vo);
    }

}
