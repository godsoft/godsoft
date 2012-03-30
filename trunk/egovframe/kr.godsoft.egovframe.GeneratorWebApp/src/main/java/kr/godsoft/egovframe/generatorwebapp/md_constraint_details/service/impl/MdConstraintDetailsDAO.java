package kr.godsoft.egovframe.generatorwebapp.md_constraint_details.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.md_constraint_details.service.MdConstraintDetailsVO;

/**
 * @Class Name : MdConstraintDetailsDAO.java
 * @Description : MdConstraintDetails DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mdConstraintDetailsDAO")
public class MdConstraintDetailsDAO extends EgovAbstractDAO {

	/**
	 * MD_CONSTRAINT_DETAILS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdConstraintDetailsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdConstraintDetails(MdConstraintDetailsVO vo) throws Exception {
        return (String)insert("mdConstraintDetailsDAO.insertMdConstraintDetails_S", vo);
    }

    /**
	 * MD_CONSTRAINT_DETAILS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdConstraintDetailsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdConstraintDetails(MdConstraintDetailsVO vo) throws Exception {
        update("mdConstraintDetailsDAO.updateMdConstraintDetails_S", vo);
    }

    /**
	 * MD_CONSTRAINT_DETAILS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdConstraintDetailsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdConstraintDetails(MdConstraintDetailsVO vo) throws Exception {
        delete("mdConstraintDetailsDAO.deleteMdConstraintDetails_S", vo);
    }

    /**
	 * MD_CONSTRAINT_DETAILS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdConstraintDetailsVO
	 * @return 조회한 MD_CONSTRAINT_DETAILS
	 * @exception Exception
	 */
    public MdConstraintDetailsVO selectMdConstraintDetails(MdConstraintDetailsVO vo) throws Exception {
        return (MdConstraintDetailsVO) selectByPk("mdConstraintDetailsDAO.selectMdConstraintDetails_S", vo);
    }

    /**
	 * MD_CONSTRAINT_DETAILS 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_CONSTRAINT_DETAILS 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMdConstraintDetailsList(MdConstraintDetailsVO vo) throws Exception {
        return list("mdConstraintDetailsDAO.selectMdConstraintDetailsList_D", vo);
    }

    /**
	 * MD_CONSTRAINT_DETAILS 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_CONSTRAINT_DETAILS 총 갯수
	 * @exception
	 */
    public int selectMdConstraintDetailsListTotCnt(MdConstraintDetailsVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mdConstraintDetailsDAO.selectMdConstraintDetailsListTotCnt_S", vo);
    }

}
