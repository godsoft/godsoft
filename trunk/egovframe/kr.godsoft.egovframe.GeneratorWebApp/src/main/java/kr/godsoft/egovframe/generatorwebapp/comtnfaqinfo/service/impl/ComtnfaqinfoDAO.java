package kr.godsoft.egovframe.generatorwebapp.comtnfaqinfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtnfaqinfo.service.ComtnfaqinfoVO;
import kr.godsoft.egovframe.generatorwebapp.comtnfaqinfo.service.ComtnfaqinfoDefaultVO;

/**
 * @Class Name : ComtnfaqinfoDAO.java
 * @Description : Comtnfaqinfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnfaqinfoDAO")
public class ComtnfaqinfoDAO extends EgovAbstractDAO {

	/**
	 * comtnfaqinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnfaqinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnfaqinfo(ComtnfaqinfoVO vo) throws Exception {
        return (String)insert("comtnfaqinfoDAO.insertComtnfaqinfo_S", vo);
    }

    /**
	 * comtnfaqinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnfaqinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnfaqinfo(ComtnfaqinfoVO vo) throws Exception {
        update("comtnfaqinfoDAO.updateComtnfaqinfo_S", vo);
    }

    /**
	 * comtnfaqinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnfaqinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnfaqinfo(ComtnfaqinfoVO vo) throws Exception {
        delete("comtnfaqinfoDAO.deleteComtnfaqinfo_S", vo);
    }

    /**
	 * comtnfaqinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnfaqinfoVO
	 * @return 조회한 comtnfaqinfo
	 * @exception Exception
	 */
    public ComtnfaqinfoVO selectComtnfaqinfo(ComtnfaqinfoVO vo) throws Exception {
        return (ComtnfaqinfoVO) selectByPk("comtnfaqinfoDAO.selectComtnfaqinfo_S", vo);
    }

    /**
	 * comtnfaqinfo 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnfaqinfo 목록
	 * @exception Exception
	 */
    public List selectComtnfaqinfoList(ComtnfaqinfoDefaultVO searchVO) throws Exception {
        return list("comtnfaqinfoDAO.selectComtnfaqinfoList_D", searchVO);
    }

    /**
	 * comtnfaqinfo 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnfaqinfo 총 갯수
	 * @exception
	 */
    public int selectComtnfaqinfoListTotCnt(ComtnfaqinfoDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnfaqinfoDAO.selectComtnfaqinfoListTotCnt_S", searchVO);
    }

}
