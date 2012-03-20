package kr.godsoft.egovframe.generatorwebapp.comtnmtgplaceresve.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnmtgplaceresve.service.ComtnmtgplaceresveVO;

/**
 * @Class Name : ComtnmtgplaceresveDAO.java
 * @Description : Comtnmtgplaceresve DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnmtgplaceresveDAO")
public class ComtnmtgplaceresveDAO extends EgovAbstractDAO {

	/**
	 * comtnmtgplaceresve을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnmtgplaceresveVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnmtgplaceresve(ComtnmtgplaceresveVO vo) throws Exception {
        return (String)insert("comtnmtgplaceresveDAO.insertComtnmtgplaceresve_S", vo);
    }

    /**
	 * comtnmtgplaceresve을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnmtgplaceresveVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnmtgplaceresve(ComtnmtgplaceresveVO vo) throws Exception {
        update("comtnmtgplaceresveDAO.updateComtnmtgplaceresve_S", vo);
    }

    /**
	 * comtnmtgplaceresve을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnmtgplaceresveVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnmtgplaceresve(ComtnmtgplaceresveVO vo) throws Exception {
        delete("comtnmtgplaceresveDAO.deleteComtnmtgplaceresve_S", vo);
    }

    /**
	 * comtnmtgplaceresve을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnmtgplaceresveVO
	 * @return 조회한 comtnmtgplaceresve
	 * @exception Exception
	 */
    public ComtnmtgplaceresveVO selectComtnmtgplaceresve(ComtnmtgplaceresveVO vo) throws Exception {
        return (ComtnmtgplaceresveVO) selectByPk("comtnmtgplaceresveDAO.selectComtnmtgplaceresve_S", vo);
    }

    /**
	 * comtnmtgplaceresve 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnmtgplaceresve 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnmtgplaceresveList(ComtnmtgplaceresveVO vo) throws Exception {
        return list("comtnmtgplaceresveDAO.selectComtnmtgplaceresveList_D", vo);
    }

    /**
	 * comtnmtgplaceresve 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnmtgplaceresve 총 갯수
	 * @exception
	 */
    public int selectComtnmtgplaceresveListTotCnt(ComtnmtgplaceresveVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnmtgplaceresveDAO.selectComtnmtgplaceresveListTotCnt_S", vo);
    }

}
