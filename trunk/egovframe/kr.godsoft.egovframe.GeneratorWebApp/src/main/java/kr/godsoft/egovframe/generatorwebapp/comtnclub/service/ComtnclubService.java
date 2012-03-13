package kr.godsoft.egovframe.generatorwebapp.comtnclub.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnclub.service.ComtnclubDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnclub.service.ComtnclubVO;

/**
 * @Class Name : ComtnclubService.java
 * @Description : Comtnclub Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnclubService {
	
	/**
	 * comtnclub을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnclubVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnclub(ComtnclubVO vo) throws Exception;
    
    /**
	 * comtnclub을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnclubVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnclub(ComtnclubVO vo) throws Exception;
    
    /**
	 * comtnclub을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnclubVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnclub(ComtnclubVO vo) throws Exception;
    
    /**
	 * comtnclub을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnclubVO
	 * @return 조회한 comtnclub
	 * @exception Exception
	 */
    ComtnclubVO selectComtnclub(ComtnclubVO vo) throws Exception;
    
    /**
	 * comtnclub 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnclub 목록
	 * @exception Exception
	 */
    List selectComtnclubList(ComtnclubDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnclub 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnclub 총 갯수
	 * @exception
	 */
    int selectComtnclubListTotCnt(ComtnclubDefaultVO searchVO);
    
}