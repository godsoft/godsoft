package kr.godsoft.egovframe.generatorwebapp.comtneventatdrn.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtneventatdrn.service.ComtneventatdrnVO;
import kr.godsoft.egovframe.generatorwebapp.comtneventatdrn.service.ComtneventatdrnDefaultVO;

/**
 * @Class Name : ComtneventatdrnDAO.java
 * @Description : Comtneventatdrn DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtneventatdrnDAO")
public class ComtneventatdrnDAO extends EgovAbstractDAO {

	/**
	 * comtneventatdrn을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtneventatdrnVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtneventatdrn(ComtneventatdrnVO vo) throws Exception {
        return (String)insert("comtneventatdrnDAO.insertComtneventatdrn_S", vo);
    }

    /**
	 * comtneventatdrn을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtneventatdrnVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtneventatdrn(ComtneventatdrnVO vo) throws Exception {
        update("comtneventatdrnDAO.updateComtneventatdrn_S", vo);
    }

    /**
	 * comtneventatdrn을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtneventatdrnVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtneventatdrn(ComtneventatdrnVO vo) throws Exception {
        delete("comtneventatdrnDAO.deleteComtneventatdrn_S", vo);
    }

    /**
	 * comtneventatdrn을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtneventatdrnVO
	 * @return 조회한 comtneventatdrn
	 * @exception Exception
	 */
    public ComtneventatdrnVO selectComtneventatdrn(ComtneventatdrnVO vo) throws Exception {
        return (ComtneventatdrnVO) selectByPk("comtneventatdrnDAO.selectComtneventatdrn_S", vo);
    }

    /**
	 * comtneventatdrn 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtneventatdrn 목록
	 * @exception Exception
	 */
    public List selectComtneventatdrnList(ComtneventatdrnDefaultVO searchVO) throws Exception {
        return list("comtneventatdrnDAO.selectComtneventatdrnList_D", searchVO);
    }

    /**
	 * comtneventatdrn 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtneventatdrn 총 갯수
	 * @exception
	 */
    public int selectComtneventatdrnListTotCnt(ComtneventatdrnDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtneventatdrnDAO.selectComtneventatdrnListTotCnt_S", searchVO);
    }

}
