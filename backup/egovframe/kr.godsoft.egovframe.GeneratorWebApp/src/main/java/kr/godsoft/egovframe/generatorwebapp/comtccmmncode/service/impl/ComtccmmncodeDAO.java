package kr.godsoft.egovframe.generatorwebapp.comtccmmncode.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtccmmncode.service.ComtccmmncodeVO;

/**
 * @Class Name : ComtccmmncodeDAO.java
 * @Description : Comtccmmncode DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtccmmncodeDAO")
public class ComtccmmncodeDAO extends EgovAbstractDAO {

	/**
	 * COMTCCMMNCODE을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtccmmncodeVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtccmmncode(ComtccmmncodeVO vo) throws Exception {
        return (String)insert("comtccmmncodeDAO.insertComtccmmncode_S", vo);
    }

    /**
	 * COMTCCMMNCODE을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtccmmncodeVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtccmmncode(ComtccmmncodeVO vo) throws Exception {
        update("comtccmmncodeDAO.updateComtccmmncode_S", vo);
    }

    /**
	 * COMTCCMMNCODE을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtccmmncodeVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtccmmncode(ComtccmmncodeVO vo) throws Exception {
        delete("comtccmmncodeDAO.deleteComtccmmncode_S", vo);
    }

    /**
	 * COMTCCMMNCODE을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtccmmncodeVO
	 * @return 조회한 COMTCCMMNCODE
	 * @exception Exception
	 */
    public ComtccmmncodeVO selectComtccmmncode(ComtccmmncodeVO vo) throws Exception {
        return (ComtccmmncodeVO) selectByPk("comtccmmncodeDAO.selectComtccmmncode_S", vo);
    }

    /**
	 * COMTCCMMNCODE 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTCCMMNCODE 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtccmmncodeList(ComtccmmncodeVO vo) throws Exception {
        return list("comtccmmncodeDAO.selectComtccmmncodeList_D", vo);
    }

    /**
	 * COMTCCMMNCODE 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTCCMMNCODE 총 갯수
	 * @exception
	 */
    public int selectComtccmmncodeListTotCnt(ComtccmmncodeVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtccmmncodeDAO.selectComtccmmncodeListTotCnt_S", vo);
    }

}
