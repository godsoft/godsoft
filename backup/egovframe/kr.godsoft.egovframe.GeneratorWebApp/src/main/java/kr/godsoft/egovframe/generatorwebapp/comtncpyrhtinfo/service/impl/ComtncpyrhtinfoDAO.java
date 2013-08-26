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
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtncpyrhtinfoDAO")
public class ComtncpyrhtinfoDAO extends EgovAbstractDAO {

	/**
	 * COMTNCPYRHTINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtncpyrhtinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtncpyrhtinfo(ComtncpyrhtinfoVO vo) throws Exception {
        return (String)insert("comtncpyrhtinfoDAO.insertComtncpyrhtinfo_S", vo);
    }

    /**
	 * COMTNCPYRHTINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtncpyrhtinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtncpyrhtinfo(ComtncpyrhtinfoVO vo) throws Exception {
        update("comtncpyrhtinfoDAO.updateComtncpyrhtinfo_S", vo);
    }

    /**
	 * COMTNCPYRHTINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtncpyrhtinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtncpyrhtinfo(ComtncpyrhtinfoVO vo) throws Exception {
        delete("comtncpyrhtinfoDAO.deleteComtncpyrhtinfo_S", vo);
    }

    /**
	 * COMTNCPYRHTINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtncpyrhtinfoVO
	 * @return 조회한 COMTNCPYRHTINFO
	 * @exception Exception
	 */
    public ComtncpyrhtinfoVO selectComtncpyrhtinfo(ComtncpyrhtinfoVO vo) throws Exception {
        return (ComtncpyrhtinfoVO) selectByPk("comtncpyrhtinfoDAO.selectComtncpyrhtinfo_S", vo);
    }

    /**
	 * COMTNCPYRHTINFO 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNCPYRHTINFO 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtncpyrhtinfoList(ComtncpyrhtinfoVO vo) throws Exception {
        return list("comtncpyrhtinfoDAO.selectComtncpyrhtinfoList_D", vo);
    }

    /**
	 * COMTNCPYRHTINFO 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNCPYRHTINFO 총 갯수
	 * @exception
	 */
    public int selectComtncpyrhtinfoListTotCnt(ComtncpyrhtinfoVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtncpyrhtinfoDAO.selectComtncpyrhtinfoListTotCnt_S", vo);
    }

}
