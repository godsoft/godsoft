package kr.godsoft.egovframe.generatorwebapp.comtnsitemap.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnsitemap.service.ComtnsitemapVO;

/**
 * @Class Name : ComtnsitemapDAO.java
 * @Description : Comtnsitemap DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnsitemapDAO")
public class ComtnsitemapDAO extends EgovAbstractDAO {

	/**
	 * COMTNSITEMAP을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnsitemapVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnsitemap(ComtnsitemapVO vo) throws Exception {
        return (String)insert("comtnsitemapDAO.insertComtnsitemap_S", vo);
    }

    /**
	 * COMTNSITEMAP을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnsitemapVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnsitemap(ComtnsitemapVO vo) throws Exception {
        update("comtnsitemapDAO.updateComtnsitemap_S", vo);
    }

    /**
	 * COMTNSITEMAP을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnsitemapVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnsitemap(ComtnsitemapVO vo) throws Exception {
        delete("comtnsitemapDAO.deleteComtnsitemap_S", vo);
    }

    /**
	 * COMTNSITEMAP을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnsitemapVO
	 * @return 조회한 COMTNSITEMAP
	 * @exception Exception
	 */
    public ComtnsitemapVO selectComtnsitemap(ComtnsitemapVO vo) throws Exception {
        return (ComtnsitemapVO) selectByPk("comtnsitemapDAO.selectComtnsitemap_S", vo);
    }

    /**
	 * COMTNSITEMAP 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNSITEMAP 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnsitemapList(ComtnsitemapVO vo) throws Exception {
        return list("comtnsitemapDAO.selectComtnsitemapList_D", vo);
    }

    /**
	 * COMTNSITEMAP 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNSITEMAP 총 갯수
	 * @exception
	 */
    public int selectComtnsitemapListTotCnt(ComtnsitemapVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnsitemapDAO.selectComtnsitemapListTotCnt_S", vo);
    }

}
