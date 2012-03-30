package kr.godsoft.egovframe.generatorwebapp.mgv_all_views.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.mgv_all_views.service.MgvAllViewsVO;

/**
 * @Class Name : MgvAllViewsDAO.java
 * @Description : MgvAllViews DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mgvAllViewsDAO")
public class MgvAllViewsDAO extends EgovAbstractDAO {

	/**
	 * MGV_ALL_VIEWS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MgvAllViewsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMgvAllViews(MgvAllViewsVO vo) throws Exception {
        return (String)insert("mgvAllViewsDAO.insertMgvAllViews_S", vo);
    }

    /**
	 * MGV_ALL_VIEWS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MgvAllViewsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMgvAllViews(MgvAllViewsVO vo) throws Exception {
        update("mgvAllViewsDAO.updateMgvAllViews_S", vo);
    }

    /**
	 * MGV_ALL_VIEWS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MgvAllViewsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMgvAllViews(MgvAllViewsVO vo) throws Exception {
        delete("mgvAllViewsDAO.deleteMgvAllViews_S", vo);
    }

    /**
	 * MGV_ALL_VIEWS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MgvAllViewsVO
	 * @return 조회한 MGV_ALL_VIEWS
	 * @exception Exception
	 */
    public MgvAllViewsVO selectMgvAllViews(MgvAllViewsVO vo) throws Exception {
        return (MgvAllViewsVO) selectByPk("mgvAllViewsDAO.selectMgvAllViews_S", vo);
    }

    /**
	 * MGV_ALL_VIEWS 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MGV_ALL_VIEWS 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMgvAllViewsList(MgvAllViewsVO vo) throws Exception {
        return list("mgvAllViewsDAO.selectMgvAllViewsList_D", vo);
    }

    /**
	 * MGV_ALL_VIEWS 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MGV_ALL_VIEWS 총 갯수
	 * @exception
	 */
    public int selectMgvAllViewsListTotCnt(MgvAllViewsVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mgvAllViewsDAO.selectMgvAllViewsListTotCnt_S", vo);
    }

}
