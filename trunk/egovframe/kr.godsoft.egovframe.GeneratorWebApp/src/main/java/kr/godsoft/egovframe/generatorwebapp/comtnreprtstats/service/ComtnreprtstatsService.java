package kr.godsoft.egovframe.generatorwebapp.comtnreprtstats.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnreprtstatsService.java
 * @Description : Comtnreprtstats Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnreprtstatsService {
	
	/**
	 * comtnreprtstats을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnreprtstatsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnreprtstats(ComtnreprtstatsVO vo) throws Exception;
    
    /**
	 * comtnreprtstats을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnreprtstatsVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnreprtstats(ComtnreprtstatsVO vo) throws Exception;
    
    /**
	 * comtnreprtstats을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnreprtstatsVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnreprtstats(ComtnreprtstatsVO vo) throws Exception;
    
    /**
	 * comtnreprtstats을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnreprtstatsVO
	 * @return 조회한 comtnreprtstats
	 * @exception Exception
	 */
    ComtnreprtstatsVO selectComtnreprtstats(ComtnreprtstatsVO vo) throws Exception;
    
    /**
	 * comtnreprtstats 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnreprtstats 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnreprtstatsList(ComtnreprtstatsVO vo) throws Exception;
    
    /**
	 * comtnreprtstats 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnreprtstats 총 갯수
	 * @exception
	 */
    int selectComtnreprtstatsListTotCnt(ComtnreprtstatsVO vo);
    
}
