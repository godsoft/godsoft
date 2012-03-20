package kr.godsoft.egovframe.generatorwebapp.comtndeptjobbx.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtndeptjobbx.service.ComtndeptjobbxVO;

/**
 * @Class Name : ComtndeptjobbxDAO.java
 * @Description : Comtndeptjobbx DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtndeptjobbxDAO")
public class ComtndeptjobbxDAO extends EgovAbstractDAO {

	/**
	 * comtndeptjobbx을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtndeptjobbxVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtndeptjobbx(ComtndeptjobbxVO vo) throws Exception {
        return (String)insert("comtndeptjobbxDAO.insertComtndeptjobbx_S", vo);
    }

    /**
	 * comtndeptjobbx을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtndeptjobbxVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtndeptjobbx(ComtndeptjobbxVO vo) throws Exception {
        update("comtndeptjobbxDAO.updateComtndeptjobbx_S", vo);
    }

    /**
	 * comtndeptjobbx을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtndeptjobbxVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtndeptjobbx(ComtndeptjobbxVO vo) throws Exception {
        delete("comtndeptjobbxDAO.deleteComtndeptjobbx_S", vo);
    }

    /**
	 * comtndeptjobbx을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtndeptjobbxVO
	 * @return 조회한 comtndeptjobbx
	 * @exception Exception
	 */
    public ComtndeptjobbxVO selectComtndeptjobbx(ComtndeptjobbxVO vo) throws Exception {
        return (ComtndeptjobbxVO) selectByPk("comtndeptjobbxDAO.selectComtndeptjobbx_S", vo);
    }

    /**
	 * comtndeptjobbx 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtndeptjobbx 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtndeptjobbxList(ComtndeptjobbxVO vo) throws Exception {
        return list("comtndeptjobbxDAO.selectComtndeptjobbxList_D", vo);
    }

    /**
	 * comtndeptjobbx 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtndeptjobbx 총 갯수
	 * @exception
	 */
    public int selectComtndeptjobbxListTotCnt(ComtndeptjobbxVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtndeptjobbxDAO.selectComtndeptjobbxListTotCnt_S", vo);
    }

}
