package kr.godsoft.egovframe.generatorwebapp.comtnbbsuse.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnbbsuseService.java
 * @Description : Comtnbbsuse Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnbbsuseService {
	
	/**
	 * COMTNBBSUSE을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbbsuseVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnbbsuse(ComtnbbsuseVO vo) throws Exception;
    
    /**
	 * COMTNBBSUSE을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbbsuseVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnbbsuse(ComtnbbsuseVO vo) throws Exception;
    
    /**
	 * COMTNBBSUSE을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbbsuseVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnbbsuse(ComtnbbsuseVO vo) throws Exception;
    
    /**
	 * COMTNBBSUSE을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbbsuseVO
	 * @return 조회한 COMTNBBSUSE
	 * @exception Exception
	 */
    ComtnbbsuseVO selectComtnbbsuse(ComtnbbsuseVO vo) throws Exception;
    
    /**
	 * COMTNBBSUSE 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNBBSUSE 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnbbsuseList(ComtnbbsuseVO vo) throws Exception;
    
    /**
	 * COMTNBBSUSE 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNBBSUSE 총 갯수
	 * @exception
	 */
    int selectComtnbbsuseListTotCnt(ComtnbbsuseVO vo);
    
}
