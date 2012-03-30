package kr.godsoft.egovframe.generatorwebapp.md_migr_weakdep.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.md_migr_weakdep.service.MdMigrWeakdepVO;

/**
 * @Class Name : MdMigrWeakdepDAO.java
 * @Description : MdMigrWeakdep DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mdMigrWeakdepDAO")
public class MdMigrWeakdepDAO extends EgovAbstractDAO {

	/**
	 * MD_MIGR_WEAKDEP을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdMigrWeakdepVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdMigrWeakdep(MdMigrWeakdepVO vo) throws Exception {
        return (String)insert("mdMigrWeakdepDAO.insertMdMigrWeakdep_S", vo);
    }

    /**
	 * MD_MIGR_WEAKDEP을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdMigrWeakdepVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdMigrWeakdep(MdMigrWeakdepVO vo) throws Exception {
        update("mdMigrWeakdepDAO.updateMdMigrWeakdep_S", vo);
    }

    /**
	 * MD_MIGR_WEAKDEP을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdMigrWeakdepVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdMigrWeakdep(MdMigrWeakdepVO vo) throws Exception {
        delete("mdMigrWeakdepDAO.deleteMdMigrWeakdep_S", vo);
    }

    /**
	 * MD_MIGR_WEAKDEP을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdMigrWeakdepVO
	 * @return 조회한 MD_MIGR_WEAKDEP
	 * @exception Exception
	 */
    public MdMigrWeakdepVO selectMdMigrWeakdep(MdMigrWeakdepVO vo) throws Exception {
        return (MdMigrWeakdepVO) selectByPk("mdMigrWeakdepDAO.selectMdMigrWeakdep_S", vo);
    }

    /**
	 * MD_MIGR_WEAKDEP 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_MIGR_WEAKDEP 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMdMigrWeakdepList(MdMigrWeakdepVO vo) throws Exception {
        return list("mdMigrWeakdepDAO.selectMdMigrWeakdepList_D", vo);
    }

    /**
	 * MD_MIGR_WEAKDEP 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_MIGR_WEAKDEP 총 갯수
	 * @exception
	 */
    public int selectMdMigrWeakdepListTotCnt(MdMigrWeakdepVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mdMigrWeakdepDAO.selectMdMigrWeakdepListTotCnt_S", vo);
    }

}
