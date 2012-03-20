package kr.godsoft.egovframe.generatorwebapp.comtnbbsuse.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnbbsuseService.java
 * @Description : Comtnbbsuse Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnbbsuseService {
	
	/**
	 * comtnbbsuse을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbbsuseVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnbbsuse(ComtnbbsuseVO vo) throws Exception;
    
    /**
	 * comtnbbsuse을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbbsuseVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnbbsuse(ComtnbbsuseVO vo) throws Exception;
    
    /**
	 * comtnbbsuse을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbbsuseVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnbbsuse(ComtnbbsuseVO vo) throws Exception;
    
    /**
	 * comtnbbsuse을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbbsuseVO
	 * @return 조회한 comtnbbsuse
	 * @exception Exception
	 */
    ComtnbbsuseVO selectComtnbbsuse(ComtnbbsuseVO vo) throws Exception;
    
    /**
	 * comtnbbsuse 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbbsuse 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnbbsuseList(ComtnbbsuseVO vo) throws Exception;
    
    /**
	 * comtnbbsuse 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbbsuse 총 갯수
	 * @exception
	 */
    int selectComtnbbsuseListTotCnt(ComtnbbsuseVO vo);
    
}
