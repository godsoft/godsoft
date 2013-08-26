package kr.godsoft.egovframe.generatorwebapp.comtnbbsmasteroptn.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnbbsmasteroptn.service.ComtnbbsmasteroptnVO;

/**
 * @Class Name : ComtnbbsmasteroptnDAO.java
 * @Description : Comtnbbsmasteroptn DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnbbsmasteroptnDAO")
public class ComtnbbsmasteroptnDAO extends EgovAbstractDAO {

	/**
	 * COMTNBBSMASTEROPTN을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbbsmasteroptnVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnbbsmasteroptn(ComtnbbsmasteroptnVO vo) throws Exception {
        return (String)insert("comtnbbsmasteroptnDAO.insertComtnbbsmasteroptn_S", vo);
    }

    /**
	 * COMTNBBSMASTEROPTN을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbbsmasteroptnVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnbbsmasteroptn(ComtnbbsmasteroptnVO vo) throws Exception {
        update("comtnbbsmasteroptnDAO.updateComtnbbsmasteroptn_S", vo);
    }

    /**
	 * COMTNBBSMASTEROPTN을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbbsmasteroptnVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnbbsmasteroptn(ComtnbbsmasteroptnVO vo) throws Exception {
        delete("comtnbbsmasteroptnDAO.deleteComtnbbsmasteroptn_S", vo);
    }

    /**
	 * COMTNBBSMASTEROPTN을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbbsmasteroptnVO
	 * @return 조회한 COMTNBBSMASTEROPTN
	 * @exception Exception
	 */
    public ComtnbbsmasteroptnVO selectComtnbbsmasteroptn(ComtnbbsmasteroptnVO vo) throws Exception {
        return (ComtnbbsmasteroptnVO) selectByPk("comtnbbsmasteroptnDAO.selectComtnbbsmasteroptn_S", vo);
    }

    /**
	 * COMTNBBSMASTEROPTN 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNBBSMASTEROPTN 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnbbsmasteroptnList(ComtnbbsmasteroptnVO vo) throws Exception {
        return list("comtnbbsmasteroptnDAO.selectComtnbbsmasteroptnList_D", vo);
    }

    /**
	 * COMTNBBSMASTEROPTN 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNBBSMASTEROPTN 총 갯수
	 * @exception
	 */
    public int selectComtnbbsmasteroptnListTotCnt(ComtnbbsmasteroptnVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnbbsmasteroptnDAO.selectComtnbbsmasteroptnListTotCnt_S", vo);
    }

}
