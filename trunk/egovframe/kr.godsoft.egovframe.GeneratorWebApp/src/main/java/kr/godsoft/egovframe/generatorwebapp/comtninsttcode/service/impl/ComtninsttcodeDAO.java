package kr.godsoft.egovframe.generatorwebapp.comtninsttcode.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtninsttcode.service.ComtninsttcodeVO;

/**
 * @Class Name : ComtninsttcodeDAO.java
 * @Description : Comtninsttcode DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtninsttcodeDAO")
public class ComtninsttcodeDAO extends EgovAbstractDAO {

	/**
	 * comtninsttcode을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtninsttcodeVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtninsttcode(ComtninsttcodeVO vo) throws Exception {
        return (String)insert("comtninsttcodeDAO.insertComtninsttcode_S", vo);
    }

    /**
	 * comtninsttcode을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtninsttcodeVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtninsttcode(ComtninsttcodeVO vo) throws Exception {
        update("comtninsttcodeDAO.updateComtninsttcode_S", vo);
    }

    /**
	 * comtninsttcode을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtninsttcodeVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtninsttcode(ComtninsttcodeVO vo) throws Exception {
        delete("comtninsttcodeDAO.deleteComtninsttcode_S", vo);
    }

    /**
	 * comtninsttcode을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtninsttcodeVO
	 * @return 조회한 comtninsttcode
	 * @exception Exception
	 */
    public ComtninsttcodeVO selectComtninsttcode(ComtninsttcodeVO vo) throws Exception {
        return (ComtninsttcodeVO) selectByPk("comtninsttcodeDAO.selectComtninsttcode_S", vo);
    }

    /**
	 * comtninsttcode 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtninsttcode 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtninsttcodeList(ComtninsttcodeVO vo) throws Exception {
        return list("comtninsttcodeDAO.selectComtninsttcodeList_D", vo);
    }

    /**
	 * comtninsttcode 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtninsttcode 총 갯수
	 * @exception
	 */
    public int selectComtninsttcodeListTotCnt(ComtninsttcodeVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtninsttcodeDAO.selectComtninsttcodeListTotCnt_S", vo);
    }

}
