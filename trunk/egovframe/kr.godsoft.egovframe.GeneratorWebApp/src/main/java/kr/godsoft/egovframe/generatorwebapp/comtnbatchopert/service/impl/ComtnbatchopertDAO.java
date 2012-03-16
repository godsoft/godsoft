package kr.godsoft.egovframe.generatorwebapp.comtnbatchopert.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnbatchopert.service.ComtnbatchopertVO;

/**
 * @Class Name : ComtnbatchopertDAO.java
 * @Description : Comtnbatchopert DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnbatchopertDAO")
public class ComtnbatchopertDAO extends EgovAbstractDAO {

	/**
	 * comtnbatchopert을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbatchopertVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnbatchopert(ComtnbatchopertVO vo) throws Exception {
        return (String)insert("comtnbatchopertDAO.insertComtnbatchopert_S", vo);
    }

    /**
	 * comtnbatchopert을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbatchopertVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnbatchopert(ComtnbatchopertVO vo) throws Exception {
        update("comtnbatchopertDAO.updateComtnbatchopert_S", vo);
    }

    /**
	 * comtnbatchopert을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbatchopertVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnbatchopert(ComtnbatchopertVO vo) throws Exception {
        delete("comtnbatchopertDAO.deleteComtnbatchopert_S", vo);
    }

    /**
	 * comtnbatchopert을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbatchopertVO
	 * @return 조회한 comtnbatchopert
	 * @exception Exception
	 */
    public ComtnbatchopertVO selectComtnbatchopert(ComtnbatchopertVO vo) throws Exception {
        return (ComtnbatchopertVO) selectByPk("comtnbatchopertDAO.selectComtnbatchopert_S", vo);
    }

    /**
	 * comtnbatchopert 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnbatchopert 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnbatchopertList(ComtnbatchopertVO vo) throws Exception {
        return list("comtnbatchopertDAO.selectComtnbatchopertList_D", vo);
    }

    /**
	 * comtnbatchopert 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnbatchopert 총 갯수
	 * @exception
	 */
    public int selectComtnbatchopertListTotCnt(ComtnbatchopertVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnbatchopertDAO.selectComtnbatchopertListTotCnt_S", vo);
    }

}
