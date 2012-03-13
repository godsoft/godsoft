package kr.godsoft.egovframe.generatorwebapp.comtndampro.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtndampro.service.ComtndamproVO;
import kr.godsoft.egovframe.generatorwebapp.comtndampro.service.ComtndamproDefaultVO;

/**
 * @Class Name : ComtndamproDAO.java
 * @Description : Comtndampro DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtndamproDAO")
public class ComtndamproDAO extends EgovAbstractDAO {

	/**
	 * comtndampro을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtndamproVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtndampro(ComtndamproVO vo) throws Exception {
        return (String)insert("comtndamproDAO.insertComtndampro_S", vo);
    }

    /**
	 * comtndampro을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtndamproVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtndampro(ComtndamproVO vo) throws Exception {
        update("comtndamproDAO.updateComtndampro_S", vo);
    }

    /**
	 * comtndampro을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtndamproVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtndampro(ComtndamproVO vo) throws Exception {
        delete("comtndamproDAO.deleteComtndampro_S", vo);
    }

    /**
	 * comtndampro을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtndamproVO
	 * @return 조회한 comtndampro
	 * @exception Exception
	 */
    public ComtndamproVO selectComtndampro(ComtndamproVO vo) throws Exception {
        return (ComtndamproVO) selectByPk("comtndamproDAO.selectComtndampro_S", vo);
    }

    /**
	 * comtndampro 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtndampro 목록
	 * @exception Exception
	 */
    public List selectComtndamproList(ComtndamproDefaultVO searchVO) throws Exception {
        return list("comtndamproDAO.selectComtndamproList_D", searchVO);
    }

    /**
	 * comtndampro 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtndampro 총 갯수
	 * @exception
	 */
    public int selectComtndamproListTotCnt(ComtndamproDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtndamproDAO.selectComtndamproListTotCnt_S", searchVO);
    }

}
