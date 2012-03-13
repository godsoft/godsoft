package kr.godsoft.egovframe.generatorwebapp.comtninfrmlsanctn.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtninfrmlsanctn.service.ComtninfrmlsanctnVO;
import kr.godsoft.egovframe.generatorwebapp.comtninfrmlsanctn.service.ComtninfrmlsanctnDefaultVO;

/**
 * @Class Name : ComtninfrmlsanctnDAO.java
 * @Description : Comtninfrmlsanctn DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtninfrmlsanctnDAO")
public class ComtninfrmlsanctnDAO extends EgovAbstractDAO {

	/**
	 * comtninfrmlsanctn을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtninfrmlsanctnVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtninfrmlsanctn(ComtninfrmlsanctnVO vo) throws Exception {
        return (String)insert("comtninfrmlsanctnDAO.insertComtninfrmlsanctn_S", vo);
    }

    /**
	 * comtninfrmlsanctn을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtninfrmlsanctnVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtninfrmlsanctn(ComtninfrmlsanctnVO vo) throws Exception {
        update("comtninfrmlsanctnDAO.updateComtninfrmlsanctn_S", vo);
    }

    /**
	 * comtninfrmlsanctn을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtninfrmlsanctnVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtninfrmlsanctn(ComtninfrmlsanctnVO vo) throws Exception {
        delete("comtninfrmlsanctnDAO.deleteComtninfrmlsanctn_S", vo);
    }

    /**
	 * comtninfrmlsanctn을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtninfrmlsanctnVO
	 * @return 조회한 comtninfrmlsanctn
	 * @exception Exception
	 */
    public ComtninfrmlsanctnVO selectComtninfrmlsanctn(ComtninfrmlsanctnVO vo) throws Exception {
        return (ComtninfrmlsanctnVO) selectByPk("comtninfrmlsanctnDAO.selectComtninfrmlsanctn_S", vo);
    }

    /**
	 * comtninfrmlsanctn 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtninfrmlsanctn 목록
	 * @exception Exception
	 */
    public List selectComtninfrmlsanctnList(ComtninfrmlsanctnDefaultVO searchVO) throws Exception {
        return list("comtninfrmlsanctnDAO.selectComtninfrmlsanctnList_D", searchVO);
    }

    /**
	 * comtninfrmlsanctn 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtninfrmlsanctn 총 갯수
	 * @exception
	 */
    public int selectComtninfrmlsanctnListTotCnt(ComtninfrmlsanctnDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtninfrmlsanctnDAO.selectComtninfrmlsanctnListTotCnt_S", searchVO);
    }

}
