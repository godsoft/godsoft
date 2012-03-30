package kr.godsoft.egovframe.generatorwebapp.md_derivatives.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.md_derivatives.service.MdDerivativesVO;

/**
 * @Class Name : MdDerivativesDAO.java
 * @Description : MdDerivatives DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mdDerivativesDAO")
public class MdDerivativesDAO extends EgovAbstractDAO {

	/**
	 * MD_DERIVATIVES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdDerivativesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdDerivatives(MdDerivativesVO vo) throws Exception {
        return (String)insert("mdDerivativesDAO.insertMdDerivatives_S", vo);
    }

    /**
	 * MD_DERIVATIVES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdDerivativesVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdDerivatives(MdDerivativesVO vo) throws Exception {
        update("mdDerivativesDAO.updateMdDerivatives_S", vo);
    }

    /**
	 * MD_DERIVATIVES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdDerivativesVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdDerivatives(MdDerivativesVO vo) throws Exception {
        delete("mdDerivativesDAO.deleteMdDerivatives_S", vo);
    }

    /**
	 * MD_DERIVATIVES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdDerivativesVO
	 * @return 조회한 MD_DERIVATIVES
	 * @exception Exception
	 */
    public MdDerivativesVO selectMdDerivatives(MdDerivativesVO vo) throws Exception {
        return (MdDerivativesVO) selectByPk("mdDerivativesDAO.selectMdDerivatives_S", vo);
    }

    /**
	 * MD_DERIVATIVES 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_DERIVATIVES 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMdDerivativesList(MdDerivativesVO vo) throws Exception {
        return list("mdDerivativesDAO.selectMdDerivativesList_D", vo);
    }

    /**
	 * MD_DERIVATIVES 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_DERIVATIVES 총 갯수
	 * @exception
	 */
    public int selectMdDerivativesListTotCnt(MdDerivativesVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mdDerivativesDAO.selectMdDerivativesListTotCnt_S", vo);
    }

}
