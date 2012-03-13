package kr.godsoft.egovframe.generatorwebapp.comtnmenuinfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtnmenuinfo.service.ComtnmenuinfoVO;
import kr.godsoft.egovframe.generatorwebapp.comtnmenuinfo.service.ComtnmenuinfoDefaultVO;

/**
 * @Class Name : ComtnmenuinfoDAO.java
 * @Description : Comtnmenuinfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnmenuinfoDAO")
public class ComtnmenuinfoDAO extends EgovAbstractDAO {

	/**
	 * comtnmenuinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnmenuinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnmenuinfo(ComtnmenuinfoVO vo) throws Exception {
        return (String)insert("comtnmenuinfoDAO.insertComtnmenuinfo_S", vo);
    }

    /**
	 * comtnmenuinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnmenuinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnmenuinfo(ComtnmenuinfoVO vo) throws Exception {
        update("comtnmenuinfoDAO.updateComtnmenuinfo_S", vo);
    }

    /**
	 * comtnmenuinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnmenuinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnmenuinfo(ComtnmenuinfoVO vo) throws Exception {
        delete("comtnmenuinfoDAO.deleteComtnmenuinfo_S", vo);
    }

    /**
	 * comtnmenuinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnmenuinfoVO
	 * @return 조회한 comtnmenuinfo
	 * @exception Exception
	 */
    public ComtnmenuinfoVO selectComtnmenuinfo(ComtnmenuinfoVO vo) throws Exception {
        return (ComtnmenuinfoVO) selectByPk("comtnmenuinfoDAO.selectComtnmenuinfo_S", vo);
    }

    /**
	 * comtnmenuinfo 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnmenuinfo 목록
	 * @exception Exception
	 */
    public List selectComtnmenuinfoList(ComtnmenuinfoDefaultVO searchVO) throws Exception {
        return list("comtnmenuinfoDAO.selectComtnmenuinfoList_D", searchVO);
    }

    /**
	 * comtnmenuinfo 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnmenuinfo 총 갯수
	 * @exception
	 */
    public int selectComtnmenuinfoListTotCnt(ComtnmenuinfoDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnmenuinfoDAO.selectComtnmenuinfoListTotCnt_S", searchVO);
    }

}
