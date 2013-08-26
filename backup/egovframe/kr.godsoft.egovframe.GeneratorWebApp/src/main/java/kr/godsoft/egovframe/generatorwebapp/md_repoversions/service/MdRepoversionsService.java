package kr.godsoft.egovframe.generatorwebapp.md_repoversions.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MdRepoversionsService.java
 * @Description : MdRepoversions Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MdRepoversionsService {
	
	/**
	 * MD_REPOVERSIONS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdRepoversionsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMdRepoversions(MdRepoversionsVO vo) throws Exception;
    
    /**
	 * MD_REPOVERSIONS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdRepoversionsVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMdRepoversions(MdRepoversionsVO vo) throws Exception;
    
    /**
	 * MD_REPOVERSIONS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdRepoversionsVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMdRepoversions(MdRepoversionsVO vo) throws Exception;
    
    /**
	 * MD_REPOVERSIONS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdRepoversionsVO
	 * @return 조회한 MD_REPOVERSIONS
	 * @exception Exception
	 */
    MdRepoversionsVO selectMdRepoversions(MdRepoversionsVO vo) throws Exception;
    
    /**
	 * MD_REPOVERSIONS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_REPOVERSIONS 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMdRepoversionsList(MdRepoversionsVO vo) throws Exception;
    
    /**
	 * MD_REPOVERSIONS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_REPOVERSIONS 총 갯수
	 * @exception
	 */
    int selectMdRepoversionsListTotCnt(MdRepoversionsVO vo);
    
}