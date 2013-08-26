package kr.godsoft.egovframe.generatorwebapp.md_views.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.md_views.service.MdViewsVO;

/**
 * @Class Name : MdViewsDAO.java
 * @Description : MdViews DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mdViewsDAO")
public class MdViewsDAO extends EgovAbstractDAO {

	/**
	 * MD_VIEWS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdViewsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdViews(MdViewsVO vo) throws Exception {
        return (String)insert("mdViewsDAO.insertMdViews_S", vo);
    }

    /**
	 * MD_VIEWS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdViewsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdViews(MdViewsVO vo) throws Exception {
        update("mdViewsDAO.updateMdViews_S", vo);
    }

    /**
	 * MD_VIEWS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdViewsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdViews(MdViewsVO vo) throws Exception {
        delete("mdViewsDAO.deleteMdViews_S", vo);
    }

    /**
	 * MD_VIEWS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdViewsVO
	 * @return 조회한 MD_VIEWS
	 * @exception Exception
	 */
    public MdViewsVO selectMdViews(MdViewsVO vo) throws Exception {
        return (MdViewsVO) selectByPk("mdViewsDAO.selectMdViews_S", vo);
    }

    /**
	 * MD_VIEWS 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_VIEWS 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMdViewsList(MdViewsVO vo) throws Exception {
        return list("mdViewsDAO.selectMdViewsList_D", vo);
    }

    /**
	 * MD_VIEWS 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_VIEWS 총 갯수
	 * @exception
	 */
    public int selectMdViewsListTotCnt(MdViewsVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mdViewsDAO.selectMdViewsListTotCnt_S", vo);
    }

}
