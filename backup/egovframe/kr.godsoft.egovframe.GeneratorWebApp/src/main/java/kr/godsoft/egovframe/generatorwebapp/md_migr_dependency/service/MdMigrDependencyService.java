package kr.godsoft.egovframe.generatorwebapp.md_migr_dependency.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MdMigrDependencyService.java
 * @Description : MdMigrDependency Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MdMigrDependencyService {
	
	/**
	 * MD_MIGR_DEPENDENCY을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdMigrDependencyVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMdMigrDependency(MdMigrDependencyVO vo) throws Exception;
    
    /**
	 * MD_MIGR_DEPENDENCY을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdMigrDependencyVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMdMigrDependency(MdMigrDependencyVO vo) throws Exception;
    
    /**
	 * MD_MIGR_DEPENDENCY을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdMigrDependencyVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMdMigrDependency(MdMigrDependencyVO vo) throws Exception;
    
    /**
	 * MD_MIGR_DEPENDENCY을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdMigrDependencyVO
	 * @return 조회한 MD_MIGR_DEPENDENCY
	 * @exception Exception
	 */
    MdMigrDependencyVO selectMdMigrDependency(MdMigrDependencyVO vo) throws Exception;
    
    /**
	 * MD_MIGR_DEPENDENCY 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_MIGR_DEPENDENCY 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMdMigrDependencyList(MdMigrDependencyVO vo) throws Exception;
    
    /**
	 * MD_MIGR_DEPENDENCY 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_MIGR_DEPENDENCY 총 갯수
	 * @exception
	 */
    int selectMdMigrDependencyListTotCnt(MdMigrDependencyVO vo);
    
}
