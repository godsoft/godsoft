package kr.godsoft.egovframe.generatorwebapp.comtneventatdrn.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtneventatdrn.service.ComtneventatdrnVO;

/**
 * @Class Name : ComtneventatdrnDAO.java
 * @Description : Comtneventatdrn DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtneventatdrnDAO")
public class ComtneventatdrnDAO extends EgovAbstractDAO {

	/**
	 * COMTNEVENTATDRN을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtneventatdrnVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtneventatdrn(ComtneventatdrnVO vo) throws Exception {
        return (String)insert("comtneventatdrnDAO.insertComtneventatdrn_S", vo);
    }

    /**
	 * COMTNEVENTATDRN을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtneventatdrnVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtneventatdrn(ComtneventatdrnVO vo) throws Exception {
        update("comtneventatdrnDAO.updateComtneventatdrn_S", vo);
    }

    /**
	 * COMTNEVENTATDRN을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtneventatdrnVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtneventatdrn(ComtneventatdrnVO vo) throws Exception {
        delete("comtneventatdrnDAO.deleteComtneventatdrn_S", vo);
    }

    /**
	 * COMTNEVENTATDRN을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtneventatdrnVO
	 * @return 조회한 COMTNEVENTATDRN
	 * @exception Exception
	 */
    public ComtneventatdrnVO selectComtneventatdrn(ComtneventatdrnVO vo) throws Exception {
        return (ComtneventatdrnVO) selectByPk("comtneventatdrnDAO.selectComtneventatdrn_S", vo);
    }

    /**
	 * COMTNEVENTATDRN 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNEVENTATDRN 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtneventatdrnList(ComtneventatdrnVO vo) throws Exception {
        return list("comtneventatdrnDAO.selectComtneventatdrnList_D", vo);
    }

    /**
	 * COMTNEVENTATDRN 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNEVENTATDRN 총 갯수
	 * @exception
	 */
    public int selectComtneventatdrnListTotCnt(ComtneventatdrnVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtneventatdrnDAO.selectComtneventatdrnListTotCnt_S", vo);
    }

}
