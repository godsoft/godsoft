package kr.godsoft.egovframe.generatorwebapp.comtncpyrhtinfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtncpyrhtinfo.service.ComtncpyrhtinfoVO;

/**
 * @Class Name : ComtncpyrhtinfoDAO.java
 * @Description : Comtncpyrhtinfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtncpyrhtinfoDAO")
public class ComtncpyrhtinfoDAO extends EgovAbstractDAO {

	/**
	 * comtncpyrhtinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtncpyrhtinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtncpyrhtinfo(ComtncpyrhtinfoVO vo) throws Exception {
        return (String)insert("comtncpyrhtinfoDAO.insertComtncpyrhtinfo_S", vo);
    }

    /**
	 * comtncpyrhtinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtncpyrhtinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtncpyrhtinfo(ComtncpyrhtinfoVO vo) throws Exception {
        update("comtncpyrhtinfoDAO.updateComtncpyrhtinfo_S", vo);
    }

    /**
	 * comtncpyrhtinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtncpyrhtinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtncpyrhtinfo(ComtncpyrhtinfoVO vo) throws Exception {
        delete("comtncpyrhtinfoDAO.deleteComtncpyrhtinfo_S", vo);
    }

    /**
	 * comtncpyrhtinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtncpyrhtinfoVO
	 * @return 조회한 comtncpyrhtinfo
	 * @exception Exception
	 */
    public ComtncpyrhtinfoVO selectComtncpyrhtinfo(ComtncpyrhtinfoVO vo) throws Exception {
        return (ComtncpyrhtinfoVO) selectByPk("comtncpyrhtinfoDAO.selectComtncpyrhtinfo_S", vo);
    }

    /**
	 * comtncpyrhtinfo 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtncpyrhtinfo 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtncpyrhtinfoList(ComtncpyrhtinfoVO vo) throws Exception {
        return list("comtncpyrhtinfoDAO.selectComtncpyrhtinfoList_D", vo);
    }

    /**
	 * comtncpyrhtinfo 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtncpyrhtinfo 총 갯수
	 * @exception
	 */
    public int selectComtncpyrhtinfoListTotCnt(ComtncpyrhtinfoVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtncpyrhtinfoDAO.selectComtncpyrhtinfoListTotCnt_S", vo);
    }

}
