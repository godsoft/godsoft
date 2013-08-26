package kr.godsoft.egovframe.generatorwebapp.comtnqustnriem.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnriem.service.ComtnqustnriemVO;

/**
 * @Class Name : ComtnqustnriemDAO.java
 * @Description : Comtnqustnriem DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnqustnriemDAO")
public class ComtnqustnriemDAO extends EgovAbstractDAO {

	/**
	 * COMTNQUSTNRIEM을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnqustnriemVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnqustnriem(ComtnqustnriemVO vo) throws Exception {
        return (String)insert("comtnqustnriemDAO.insertComtnqustnriem_S", vo);
    }

    /**
	 * COMTNQUSTNRIEM을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnqustnriemVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnqustnriem(ComtnqustnriemVO vo) throws Exception {
        update("comtnqustnriemDAO.updateComtnqustnriem_S", vo);
    }

    /**
	 * COMTNQUSTNRIEM을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnqustnriemVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnqustnriem(ComtnqustnriemVO vo) throws Exception {
        delete("comtnqustnriemDAO.deleteComtnqustnriem_S", vo);
    }

    /**
	 * COMTNQUSTNRIEM을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnqustnriemVO
	 * @return 조회한 COMTNQUSTNRIEM
	 * @exception Exception
	 */
    public ComtnqustnriemVO selectComtnqustnriem(ComtnqustnriemVO vo) throws Exception {
        return (ComtnqustnriemVO) selectByPk("comtnqustnriemDAO.selectComtnqustnriem_S", vo);
    }

    /**
	 * COMTNQUSTNRIEM 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNQUSTNRIEM 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnqustnriemList(ComtnqustnriemVO vo) throws Exception {
        return list("comtnqustnriemDAO.selectComtnqustnriemList_D", vo);
    }

    /**
	 * COMTNQUSTNRIEM 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNQUSTNRIEM 총 갯수
	 * @exception
	 */
    public int selectComtnqustnriemListTotCnt(ComtnqustnriemVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnqustnriemDAO.selectComtnqustnriemListTotCnt_S", vo);
    }

}
