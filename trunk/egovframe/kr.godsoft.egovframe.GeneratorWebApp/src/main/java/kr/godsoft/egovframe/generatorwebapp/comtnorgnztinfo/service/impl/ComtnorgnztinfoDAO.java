package kr.godsoft.egovframe.generatorwebapp.comtnorgnztinfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtnorgnztinfo.service.ComtnorgnztinfoVO;
import kr.godsoft.egovframe.generatorwebapp.comtnorgnztinfo.service.ComtnorgnztinfoDefaultVO;

/**
 * @Class Name : ComtnorgnztinfoDAO.java
 * @Description : Comtnorgnztinfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnorgnztinfoDAO")
public class ComtnorgnztinfoDAO extends EgovAbstractDAO {

	/**
	 * comtnorgnztinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnorgnztinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnorgnztinfo(ComtnorgnztinfoVO vo) throws Exception {
        return (String)insert("comtnorgnztinfoDAO.insertComtnorgnztinfo_S", vo);
    }

    /**
	 * comtnorgnztinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnorgnztinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnorgnztinfo(ComtnorgnztinfoVO vo) throws Exception {
        update("comtnorgnztinfoDAO.updateComtnorgnztinfo_S", vo);
    }

    /**
	 * comtnorgnztinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnorgnztinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnorgnztinfo(ComtnorgnztinfoVO vo) throws Exception {
        delete("comtnorgnztinfoDAO.deleteComtnorgnztinfo_S", vo);
    }

    /**
	 * comtnorgnztinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnorgnztinfoVO
	 * @return 조회한 comtnorgnztinfo
	 * @exception Exception
	 */
    public ComtnorgnztinfoVO selectComtnorgnztinfo(ComtnorgnztinfoVO vo) throws Exception {
        return (ComtnorgnztinfoVO) selectByPk("comtnorgnztinfoDAO.selectComtnorgnztinfo_S", vo);
    }

    /**
	 * comtnorgnztinfo 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnorgnztinfo 목록
	 * @exception Exception
	 */
    public List selectComtnorgnztinfoList(ComtnorgnztinfoDefaultVO searchVO) throws Exception {
        return list("comtnorgnztinfoDAO.selectComtnorgnztinfoList_D", searchVO);
    }

    /**
	 * comtnorgnztinfo 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnorgnztinfo 총 갯수
	 * @exception
	 */
    public int selectComtnorgnztinfoListTotCnt(ComtnorgnztinfoDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnorgnztinfoDAO.selectComtnorgnztinfoListTotCnt_S", searchVO);
    }

}
