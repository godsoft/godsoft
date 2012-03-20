package kr.godsoft.egovframe.generatorwebapp.comtnscrap.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnscrap.service.ComtnscrapVO;

/**
 * @Class Name : ComtnscrapDAO.java
 * @Description : Comtnscrap DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnscrapDAO")
public class ComtnscrapDAO extends EgovAbstractDAO {

	/**
	 * comtnscrap을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnscrapVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnscrap(ComtnscrapVO vo) throws Exception {
        return (String)insert("comtnscrapDAO.insertComtnscrap_S", vo);
    }

    /**
	 * comtnscrap을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnscrapVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnscrap(ComtnscrapVO vo) throws Exception {
        update("comtnscrapDAO.updateComtnscrap_S", vo);
    }

    /**
	 * comtnscrap을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnscrapVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnscrap(ComtnscrapVO vo) throws Exception {
        delete("comtnscrapDAO.deleteComtnscrap_S", vo);
    }

    /**
	 * comtnscrap을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnscrapVO
	 * @return 조회한 comtnscrap
	 * @exception Exception
	 */
    public ComtnscrapVO selectComtnscrap(ComtnscrapVO vo) throws Exception {
        return (ComtnscrapVO) selectByPk("comtnscrapDAO.selectComtnscrap_S", vo);
    }

    /**
	 * comtnscrap 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnscrap 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnscrapList(ComtnscrapVO vo) throws Exception {
        return list("comtnscrapDAO.selectComtnscrapList_D", vo);
    }

    /**
	 * comtnscrap 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnscrap 총 갯수
	 * @exception
	 */
    public int selectComtnscrapListTotCnt(ComtnscrapVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnscrapDAO.selectComtnscrapListTotCnt_S", vo);
    }

}
