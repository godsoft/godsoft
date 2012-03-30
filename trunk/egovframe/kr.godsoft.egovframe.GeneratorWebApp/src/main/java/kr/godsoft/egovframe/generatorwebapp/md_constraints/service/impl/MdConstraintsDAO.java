package kr.godsoft.egovframe.generatorwebapp.md_constraints.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.md_constraints.service.MdConstraintsVO;

/**
 * @Class Name : MdConstraintsDAO.java
 * @Description : MdConstraints DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mdConstraintsDAO")
public class MdConstraintsDAO extends EgovAbstractDAO {

	/**
	 * MD_CONSTRAINTS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdConstraintsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdConstraints(MdConstraintsVO vo) throws Exception {
        return (String)insert("mdConstraintsDAO.insertMdConstraints_S", vo);
    }

    /**
	 * MD_CONSTRAINTS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdConstraintsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdConstraints(MdConstraintsVO vo) throws Exception {
        update("mdConstraintsDAO.updateMdConstraints_S", vo);
    }

    /**
	 * MD_CONSTRAINTS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdConstraintsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdConstraints(MdConstraintsVO vo) throws Exception {
        delete("mdConstraintsDAO.deleteMdConstraints_S", vo);
    }

    /**
	 * MD_CONSTRAINTS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdConstraintsVO
	 * @return 조회한 MD_CONSTRAINTS
	 * @exception Exception
	 */
    public MdConstraintsVO selectMdConstraints(MdConstraintsVO vo) throws Exception {
        return (MdConstraintsVO) selectByPk("mdConstraintsDAO.selectMdConstraints_S", vo);
    }

    /**
	 * MD_CONSTRAINTS 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_CONSTRAINTS 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMdConstraintsList(MdConstraintsVO vo) throws Exception {
        return list("mdConstraintsDAO.selectMdConstraintsList_D", vo);
    }

    /**
	 * MD_CONSTRAINTS 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_CONSTRAINTS 총 갯수
	 * @exception
	 */
    public int selectMdConstraintsListTotCnt(MdConstraintsVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mdConstraintsDAO.selectMdConstraintsListTotCnt_S", vo);
    }

}
