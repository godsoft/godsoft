package kr.godsoft.egovframe.generatorwebapp.comtnstplatinfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnstplatinfo.service.ComtnstplatinfoVO;

/**
 * @Class Name : ComtnstplatinfoDAO.java
 * @Description : Comtnstplatinfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnstplatinfoDAO")
public class ComtnstplatinfoDAO extends EgovAbstractDAO {

	/**
	 * comtnstplatinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnstplatinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnstplatinfo(ComtnstplatinfoVO vo) throws Exception {
        return (String)insert("comtnstplatinfoDAO.insertComtnstplatinfo_S", vo);
    }

    /**
	 * comtnstplatinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnstplatinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnstplatinfo(ComtnstplatinfoVO vo) throws Exception {
        update("comtnstplatinfoDAO.updateComtnstplatinfo_S", vo);
    }

    /**
	 * comtnstplatinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnstplatinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnstplatinfo(ComtnstplatinfoVO vo) throws Exception {
        delete("comtnstplatinfoDAO.deleteComtnstplatinfo_S", vo);
    }

    /**
	 * comtnstplatinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnstplatinfoVO
	 * @return 조회한 comtnstplatinfo
	 * @exception Exception
	 */
    public ComtnstplatinfoVO selectComtnstplatinfo(ComtnstplatinfoVO vo) throws Exception {
        return (ComtnstplatinfoVO) selectByPk("comtnstplatinfoDAO.selectComtnstplatinfo_S", vo);
    }

    /**
	 * comtnstplatinfo 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnstplatinfo 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnstplatinfoList(ComtnstplatinfoVO vo) throws Exception {
        return list("comtnstplatinfoDAO.selectComtnstplatinfoList_D", vo);
    }

    /**
	 * comtnstplatinfo 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnstplatinfo 총 갯수
	 * @exception
	 */
    public int selectComtnstplatinfoListTotCnt(ComtnstplatinfoVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnstplatinfoDAO.selectComtnstplatinfoListTotCnt_S", vo);
    }

}
