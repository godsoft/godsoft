package kr.godsoft.egovframe.generatorwebapp.comtnonlinepolliem.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtnonlinepolliem.service.ComtnonlinepolliemVO;
import kr.godsoft.egovframe.generatorwebapp.comtnonlinepolliem.service.ComtnonlinepolliemDefaultVO;

/**
 * @Class Name : ComtnonlinepolliemDAO.java
 * @Description : Comtnonlinepolliem DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnonlinepolliemDAO")
public class ComtnonlinepolliemDAO extends EgovAbstractDAO {

	/**
	 * comtnonlinepolliem을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnonlinepolliemVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnonlinepolliem(ComtnonlinepolliemVO vo) throws Exception {
        return (String)insert("comtnonlinepolliemDAO.insertComtnonlinepolliem_S", vo);
    }

    /**
	 * comtnonlinepolliem을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnonlinepolliemVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnonlinepolliem(ComtnonlinepolliemVO vo) throws Exception {
        update("comtnonlinepolliemDAO.updateComtnonlinepolliem_S", vo);
    }

    /**
	 * comtnonlinepolliem을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnonlinepolliemVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnonlinepolliem(ComtnonlinepolliemVO vo) throws Exception {
        delete("comtnonlinepolliemDAO.deleteComtnonlinepolliem_S", vo);
    }

    /**
	 * comtnonlinepolliem을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnonlinepolliemVO
	 * @return 조회한 comtnonlinepolliem
	 * @exception Exception
	 */
    public ComtnonlinepolliemVO selectComtnonlinepolliem(ComtnonlinepolliemVO vo) throws Exception {
        return (ComtnonlinepolliemVO) selectByPk("comtnonlinepolliemDAO.selectComtnonlinepolliem_S", vo);
    }

    /**
	 * comtnonlinepolliem 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnonlinepolliem 목록
	 * @exception Exception
	 */
    public List selectComtnonlinepolliemList(ComtnonlinepolliemDefaultVO searchVO) throws Exception {
        return list("comtnonlinepolliemDAO.selectComtnonlinepolliemList_D", searchVO);
    }

    /**
	 * comtnonlinepolliem 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnonlinepolliem 총 갯수
	 * @exception
	 */
    public int selectComtnonlinepolliemListTotCnt(ComtnonlinepolliemDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnonlinepolliemDAO.selectComtnonlinepolliemListTotCnt_S", searchVO);
    }

}
