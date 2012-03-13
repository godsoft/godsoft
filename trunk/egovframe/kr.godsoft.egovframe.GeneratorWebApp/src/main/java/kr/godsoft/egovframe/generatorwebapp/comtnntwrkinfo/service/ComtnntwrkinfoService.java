package kr.godsoft.egovframe.generatorwebapp.comtnntwrkinfo.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnntwrkinfo.service.ComtnntwrkinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnntwrkinfo.service.ComtnntwrkinfoVO;

/**
 * @Class Name : ComtnntwrkinfoService.java
 * @Description : Comtnntwrkinfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnntwrkinfoService {
	
	/**
	 * comtnntwrkinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnntwrkinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnntwrkinfo(ComtnntwrkinfoVO vo) throws Exception;
    
    /**
	 * comtnntwrkinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnntwrkinfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnntwrkinfo(ComtnntwrkinfoVO vo) throws Exception;
    
    /**
	 * comtnntwrkinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnntwrkinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnntwrkinfo(ComtnntwrkinfoVO vo) throws Exception;
    
    /**
	 * comtnntwrkinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnntwrkinfoVO
	 * @return 조회한 comtnntwrkinfo
	 * @exception Exception
	 */
    ComtnntwrkinfoVO selectComtnntwrkinfo(ComtnntwrkinfoVO vo) throws Exception;
    
    /**
	 * comtnntwrkinfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnntwrkinfo 목록
	 * @exception Exception
	 */
    List selectComtnntwrkinfoList(ComtnntwrkinfoDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnntwrkinfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnntwrkinfo 총 갯수
	 * @exception
	 */
    int selectComtnntwrkinfoListTotCnt(ComtnntwrkinfoDefaultVO searchVO);
    
}
