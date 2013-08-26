package kr.godsoft.egovframe.generatorwebapp.comtnnotetrnsmit.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnnotetrnsmit.service.ComtnnotetrnsmitVO;

/**
 * @Class Name : ComtnnotetrnsmitDAO.java
 * @Description : Comtnnotetrnsmit DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnnotetrnsmitDAO")
public class ComtnnotetrnsmitDAO extends EgovAbstractDAO {

	/**
	 * COMTNNOTETRNSMIT을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnnotetrnsmitVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnnotetrnsmit(ComtnnotetrnsmitVO vo) throws Exception {
        return (String)insert("comtnnotetrnsmitDAO.insertComtnnotetrnsmit_S", vo);
    }

    /**
	 * COMTNNOTETRNSMIT을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnnotetrnsmitVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnnotetrnsmit(ComtnnotetrnsmitVO vo) throws Exception {
        update("comtnnotetrnsmitDAO.updateComtnnotetrnsmit_S", vo);
    }

    /**
	 * COMTNNOTETRNSMIT을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnnotetrnsmitVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnnotetrnsmit(ComtnnotetrnsmitVO vo) throws Exception {
        delete("comtnnotetrnsmitDAO.deleteComtnnotetrnsmit_S", vo);
    }

    /**
	 * COMTNNOTETRNSMIT을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnnotetrnsmitVO
	 * @return 조회한 COMTNNOTETRNSMIT
	 * @exception Exception
	 */
    public ComtnnotetrnsmitVO selectComtnnotetrnsmit(ComtnnotetrnsmitVO vo) throws Exception {
        return (ComtnnotetrnsmitVO) selectByPk("comtnnotetrnsmitDAO.selectComtnnotetrnsmit_S", vo);
    }

    /**
	 * COMTNNOTETRNSMIT 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNNOTETRNSMIT 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnnotetrnsmitList(ComtnnotetrnsmitVO vo) throws Exception {
        return list("comtnnotetrnsmitDAO.selectComtnnotetrnsmitList_D", vo);
    }

    /**
	 * COMTNNOTETRNSMIT 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNNOTETRNSMIT 총 갯수
	 * @exception
	 */
    public int selectComtnnotetrnsmitListTotCnt(ComtnnotetrnsmitVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnnotetrnsmitDAO.selectComtnnotetrnsmitListTotCnt_S", vo);
    }

}
