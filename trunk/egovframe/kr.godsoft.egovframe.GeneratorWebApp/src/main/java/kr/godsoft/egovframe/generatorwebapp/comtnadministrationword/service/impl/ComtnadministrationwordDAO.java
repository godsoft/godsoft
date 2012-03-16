package kr.godsoft.egovframe.generatorwebapp.comtnadministrationword.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnadministrationword.service.ComtnadministrationwordVO;

/**
 * @Class Name : ComtnadministrationwordDAO.java
 * @Description : Comtnadministrationword DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnadministrationwordDAO")
public class ComtnadministrationwordDAO extends EgovAbstractDAO {

	/**
	 * comtnadministrationword을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnadministrationwordVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnadministrationword(ComtnadministrationwordVO vo) throws Exception {
        return (String)insert("comtnadministrationwordDAO.insertComtnadministrationword_S", vo);
    }

    /**
	 * comtnadministrationword을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnadministrationwordVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnadministrationword(ComtnadministrationwordVO vo) throws Exception {
        update("comtnadministrationwordDAO.updateComtnadministrationword_S", vo);
    }

    /**
	 * comtnadministrationword을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnadministrationwordVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnadministrationword(ComtnadministrationwordVO vo) throws Exception {
        delete("comtnadministrationwordDAO.deleteComtnadministrationword_S", vo);
    }

    /**
	 * comtnadministrationword을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnadministrationwordVO
	 * @return 조회한 comtnadministrationword
	 * @exception Exception
	 */
    public ComtnadministrationwordVO selectComtnadministrationword(ComtnadministrationwordVO vo) throws Exception {
        return (ComtnadministrationwordVO) selectByPk("comtnadministrationwordDAO.selectComtnadministrationword_S", vo);
    }

    /**
	 * comtnadministrationword 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnadministrationword 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnadministrationwordList(ComtnadministrationwordVO vo) throws Exception {
        return list("comtnadministrationwordDAO.selectComtnadministrationwordList_D", vo);
    }

    /**
	 * comtnadministrationword 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnadministrationword 총 갯수
	 * @exception
	 */
    public int selectComtnadministrationwordListTotCnt(ComtnadministrationwordVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnadministrationwordDAO.selectComtnadministrationwordListTotCnt_S", vo);
    }

}
