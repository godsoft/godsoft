package kr.godsoft.egovframe.generatorwebapp.comtnbndtdiary.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnbndtdiary.service.ComtnbndtdiaryDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbndtdiary.service.ComtnbndtdiaryVO;

/**
 * @Class Name : ComtnbndtdiaryService.java
 * @Description : Comtnbndtdiary Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnbndtdiaryService {
	
	/**
	 * comtnbndtdiary을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbndtdiaryVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnbndtdiary(ComtnbndtdiaryVO vo) throws Exception;
    
    /**
	 * comtnbndtdiary을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbndtdiaryVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnbndtdiary(ComtnbndtdiaryVO vo) throws Exception;
    
    /**
	 * comtnbndtdiary을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbndtdiaryVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnbndtdiary(ComtnbndtdiaryVO vo) throws Exception;
    
    /**
	 * comtnbndtdiary을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbndtdiaryVO
	 * @return 조회한 comtnbndtdiary
	 * @exception Exception
	 */
    ComtnbndtdiaryVO selectComtnbndtdiary(ComtnbndtdiaryVO vo) throws Exception;
    
    /**
	 * comtnbndtdiary 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbndtdiary 목록
	 * @exception Exception
	 */
    List selectComtnbndtdiaryList(ComtnbndtdiaryDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnbndtdiary 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbndtdiary 총 갯수
	 * @exception
	 */
    int selectComtnbndtdiaryListTotCnt(ComtnbndtdiaryDefaultVO searchVO);
    
}
