package kr.godsoft.egovframe.generatorwebapp.comtnsystemcntc.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnsystemcntc.service.ComtnsystemcntcVO;

/**
 * @Class Name : ComtnsystemcntcDAO.java
 * @Description : Comtnsystemcntc DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnsystemcntcDAO")
public class ComtnsystemcntcDAO extends EgovAbstractDAO {

	/**
	 * comtnsystemcntc을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnsystemcntcVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnsystemcntc(ComtnsystemcntcVO vo) throws Exception {
        return (String)insert("comtnsystemcntcDAO.insertComtnsystemcntc_S", vo);
    }

    /**
	 * comtnsystemcntc을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnsystemcntcVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnsystemcntc(ComtnsystemcntcVO vo) throws Exception {
        update("comtnsystemcntcDAO.updateComtnsystemcntc_S", vo);
    }

    /**
	 * comtnsystemcntc을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnsystemcntcVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnsystemcntc(ComtnsystemcntcVO vo) throws Exception {
        delete("comtnsystemcntcDAO.deleteComtnsystemcntc_S", vo);
    }

    /**
	 * comtnsystemcntc을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnsystemcntcVO
	 * @return 조회한 comtnsystemcntc
	 * @exception Exception
	 */
    public ComtnsystemcntcVO selectComtnsystemcntc(ComtnsystemcntcVO vo) throws Exception {
        return (ComtnsystemcntcVO) selectByPk("comtnsystemcntcDAO.selectComtnsystemcntc_S", vo);
    }

    /**
	 * comtnsystemcntc 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnsystemcntc 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnsystemcntcList(ComtnsystemcntcVO vo) throws Exception {
        return list("comtnsystemcntcDAO.selectComtnsystemcntcList_D", vo);
    }

    /**
	 * comtnsystemcntc 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnsystemcntc 총 갯수
	 * @exception
	 */
    public int selectComtnsystemcntcListTotCnt(ComtnsystemcntcVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnsystemcntcDAO.selectComtnsystemcntcListTotCnt_S", vo);
    }

}
