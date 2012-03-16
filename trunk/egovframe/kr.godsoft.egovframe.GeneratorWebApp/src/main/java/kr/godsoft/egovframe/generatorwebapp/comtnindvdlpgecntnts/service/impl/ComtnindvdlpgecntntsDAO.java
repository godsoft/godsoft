package kr.godsoft.egovframe.generatorwebapp.comtnindvdlpgecntnts.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnindvdlpgecntnts.service.ComtnindvdlpgecntntsVO;

/**
 * @Class Name : ComtnindvdlpgecntntsDAO.java
 * @Description : Comtnindvdlpgecntnts DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnindvdlpgecntntsDAO")
public class ComtnindvdlpgecntntsDAO extends EgovAbstractDAO {

	/**
	 * comtnindvdlpgecntnts을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnindvdlpgecntntsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnindvdlpgecntnts(ComtnindvdlpgecntntsVO vo) throws Exception {
        return (String)insert("comtnindvdlpgecntntsDAO.insertComtnindvdlpgecntnts_S", vo);
    }

    /**
	 * comtnindvdlpgecntnts을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnindvdlpgecntntsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnindvdlpgecntnts(ComtnindvdlpgecntntsVO vo) throws Exception {
        update("comtnindvdlpgecntntsDAO.updateComtnindvdlpgecntnts_S", vo);
    }

    /**
	 * comtnindvdlpgecntnts을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnindvdlpgecntntsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnindvdlpgecntnts(ComtnindvdlpgecntntsVO vo) throws Exception {
        delete("comtnindvdlpgecntntsDAO.deleteComtnindvdlpgecntnts_S", vo);
    }

    /**
	 * comtnindvdlpgecntnts을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnindvdlpgecntntsVO
	 * @return 조회한 comtnindvdlpgecntnts
	 * @exception Exception
	 */
    public ComtnindvdlpgecntntsVO selectComtnindvdlpgecntnts(ComtnindvdlpgecntntsVO vo) throws Exception {
        return (ComtnindvdlpgecntntsVO) selectByPk("comtnindvdlpgecntntsDAO.selectComtnindvdlpgecntnts_S", vo);
    }

    /**
	 * comtnindvdlpgecntnts 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnindvdlpgecntnts 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnindvdlpgecntntsList(ComtnindvdlpgecntntsVO vo) throws Exception {
        return list("comtnindvdlpgecntntsDAO.selectComtnindvdlpgecntntsList_D", vo);
    }

    /**
	 * comtnindvdlpgecntnts 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnindvdlpgecntnts 총 갯수
	 * @exception
	 */
    public int selectComtnindvdlpgecntntsListTotCnt(ComtnindvdlpgecntntsVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnindvdlpgecntntsDAO.selectComtnindvdlpgecntntsListTotCnt_S", vo);
    }

}
