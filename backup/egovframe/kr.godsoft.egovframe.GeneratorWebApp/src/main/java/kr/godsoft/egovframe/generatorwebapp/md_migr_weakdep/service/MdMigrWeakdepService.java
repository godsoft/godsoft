package kr.godsoft.egovframe.generatorwebapp.md_migr_weakdep.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MdMigrWeakdepService.java
 * @Description : MdMigrWeakdep Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MdMigrWeakdepService {
	
	/**
	 * MD_MIGR_WEAKDEP을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdMigrWeakdepVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMdMigrWeakdep(MdMigrWeakdepVO vo) throws Exception;
    
    /**
	 * MD_MIGR_WEAKDEP을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdMigrWeakdepVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMdMigrWeakdep(MdMigrWeakdepVO vo) throws Exception;
    
    /**
	 * MD_MIGR_WEAKDEP을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdMigrWeakdepVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMdMigrWeakdep(MdMigrWeakdepVO vo) throws Exception;
    
    /**
	 * MD_MIGR_WEAKDEP을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdMigrWeakdepVO
	 * @return 조회한 MD_MIGR_WEAKDEP
	 * @exception Exception
	 */
    MdMigrWeakdepVO selectMdMigrWeakdep(MdMigrWeakdepVO vo) throws Exception;
    
    /**
	 * MD_MIGR_WEAKDEP 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_MIGR_WEAKDEP 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMdMigrWeakdepList(MdMigrWeakdepVO vo) throws Exception;
    
    /**
	 * MD_MIGR_WEAKDEP 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_MIGR_WEAKDEP 총 갯수
	 * @exception
	 */
    int selectMdMigrWeakdepListTotCnt(MdMigrWeakdepVO vo);
    
}