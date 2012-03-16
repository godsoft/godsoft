package kr.godsoft.egovframe.generatorwebapp.comtnauthorgroupinfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnauthorgroupinfo.service.ComtnauthorgroupinfoVO;

/**
 * @Class Name : ComtnauthorgroupinfoDAO.java
 * @Description : Comtnauthorgroupinfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnauthorgroupinfoDAO")
public class ComtnauthorgroupinfoDAO extends EgovAbstractDAO {

	/**
	 * comtnauthorgroupinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnauthorgroupinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnauthorgroupinfo(ComtnauthorgroupinfoVO vo) throws Exception {
        return (String)insert("comtnauthorgroupinfoDAO.insertComtnauthorgroupinfo_S", vo);
    }

    /**
	 * comtnauthorgroupinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnauthorgroupinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnauthorgroupinfo(ComtnauthorgroupinfoVO vo) throws Exception {
        update("comtnauthorgroupinfoDAO.updateComtnauthorgroupinfo_S", vo);
    }

    /**
	 * comtnauthorgroupinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnauthorgroupinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnauthorgroupinfo(ComtnauthorgroupinfoVO vo) throws Exception {
        delete("comtnauthorgroupinfoDAO.deleteComtnauthorgroupinfo_S", vo);
    }

    /**
	 * comtnauthorgroupinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnauthorgroupinfoVO
	 * @return 조회한 comtnauthorgroupinfo
	 * @exception Exception
	 */
    public ComtnauthorgroupinfoVO selectComtnauthorgroupinfo(ComtnauthorgroupinfoVO vo) throws Exception {
        return (ComtnauthorgroupinfoVO) selectByPk("comtnauthorgroupinfoDAO.selectComtnauthorgroupinfo_S", vo);
    }

    /**
	 * comtnauthorgroupinfo 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnauthorgroupinfo 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnauthorgroupinfoList(ComtnauthorgroupinfoVO vo) throws Exception {
        return list("comtnauthorgroupinfoDAO.selectComtnauthorgroupinfoList_D", vo);
    }

    /**
	 * comtnauthorgroupinfo 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnauthorgroupinfo 총 갯수
	 * @exception
	 */
    public int selectComtnauthorgroupinfoListTotCnt(ComtnauthorgroupinfoVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnauthorgroupinfoDAO.selectComtnauthorgroupinfoListTotCnt_S", vo);
    }

}
