package kr.godsoft.egovframe.generatorwebapp.comtnschdulinfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnschdulinfo.service.ComtnschdulinfoVO;

/**
 * @Class Name : ComtnschdulinfoDAO.java
 * @Description : Comtnschdulinfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnschdulinfoDAO")
public class ComtnschdulinfoDAO extends EgovAbstractDAO {

	/**
	 * comtnschdulinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnschdulinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnschdulinfo(ComtnschdulinfoVO vo) throws Exception {
        return (String)insert("comtnschdulinfoDAO.insertComtnschdulinfo_S", vo);
    }

    /**
	 * comtnschdulinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnschdulinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnschdulinfo(ComtnschdulinfoVO vo) throws Exception {
        update("comtnschdulinfoDAO.updateComtnschdulinfo_S", vo);
    }

    /**
	 * comtnschdulinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnschdulinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnschdulinfo(ComtnschdulinfoVO vo) throws Exception {
        delete("comtnschdulinfoDAO.deleteComtnschdulinfo_S", vo);
    }

    /**
	 * comtnschdulinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnschdulinfoVO
	 * @return 조회한 comtnschdulinfo
	 * @exception Exception
	 */
    public ComtnschdulinfoVO selectComtnschdulinfo(ComtnschdulinfoVO vo) throws Exception {
        return (ComtnschdulinfoVO) selectByPk("comtnschdulinfoDAO.selectComtnschdulinfo_S", vo);
    }

    /**
	 * comtnschdulinfo 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnschdulinfo 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnschdulinfoList(ComtnschdulinfoVO vo) throws Exception {
        return list("comtnschdulinfoDAO.selectComtnschdulinfoList_D", vo);
    }

    /**
	 * comtnschdulinfo 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnschdulinfo 총 갯수
	 * @exception
	 */
    public int selectComtnschdulinfoListTotCnt(ComtnschdulinfoVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnschdulinfoDAO.selectComtnschdulinfoListTotCnt_S", vo);
    }

}
