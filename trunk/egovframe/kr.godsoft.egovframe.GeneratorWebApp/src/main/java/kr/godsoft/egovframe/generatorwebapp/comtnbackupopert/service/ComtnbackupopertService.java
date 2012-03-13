package kr.godsoft.egovframe.generatorwebapp.comtnbackupopert.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnbackupopert.service.ComtnbackupopertDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbackupopert.service.ComtnbackupopertVO;

/**
 * @Class Name : ComtnbackupopertService.java
 * @Description : Comtnbackupopert Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnbackupopertService {
	
	/**
	 * comtnbackupopert을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbackupopertVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnbackupopert(ComtnbackupopertVO vo) throws Exception;
    
    /**
	 * comtnbackupopert을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbackupopertVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnbackupopert(ComtnbackupopertVO vo) throws Exception;
    
    /**
	 * comtnbackupopert을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbackupopertVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnbackupopert(ComtnbackupopertVO vo) throws Exception;
    
    /**
	 * comtnbackupopert을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbackupopertVO
	 * @return 조회한 comtnbackupopert
	 * @exception Exception
	 */
    ComtnbackupopertVO selectComtnbackupopert(ComtnbackupopertVO vo) throws Exception;
    
    /**
	 * comtnbackupopert 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbackupopert 목록
	 * @exception Exception
	 */
    List selectComtnbackupopertList(ComtnbackupopertDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnbackupopert 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbackupopert 총 갯수
	 * @exception
	 */
    int selectComtnbackupopertListTotCnt(ComtnbackupopertDefaultVO searchVO);
    
}
