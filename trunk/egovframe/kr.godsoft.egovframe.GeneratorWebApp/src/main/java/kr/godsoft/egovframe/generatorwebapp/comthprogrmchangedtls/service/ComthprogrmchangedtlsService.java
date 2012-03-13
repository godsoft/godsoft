package kr.godsoft.egovframe.generatorwebapp.comthprogrmchangedtls.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comthprogrmchangedtls.service.ComthprogrmchangedtlsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comthprogrmchangedtls.service.ComthprogrmchangedtlsVO;

/**
 * @Class Name : ComthprogrmchangedtlsService.java
 * @Description : Comthprogrmchangedtls Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComthprogrmchangedtlsService {
	
	/**
	 * comthprogrmchangedtls을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComthprogrmchangedtlsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComthprogrmchangedtls(ComthprogrmchangedtlsVO vo) throws Exception;
    
    /**
	 * comthprogrmchangedtls을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComthprogrmchangedtlsVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComthprogrmchangedtls(ComthprogrmchangedtlsVO vo) throws Exception;
    
    /**
	 * comthprogrmchangedtls을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComthprogrmchangedtlsVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComthprogrmchangedtls(ComthprogrmchangedtlsVO vo) throws Exception;
    
    /**
	 * comthprogrmchangedtls을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComthprogrmchangedtlsVO
	 * @return 조회한 comthprogrmchangedtls
	 * @exception Exception
	 */
    ComthprogrmchangedtlsVO selectComthprogrmchangedtls(ComthprogrmchangedtlsVO vo) throws Exception;
    
    /**
	 * comthprogrmchangedtls 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comthprogrmchangedtls 목록
	 * @exception Exception
	 */
    List selectComthprogrmchangedtlsList(ComthprogrmchangedtlsDefaultVO searchVO) throws Exception;
    
    /**
	 * comthprogrmchangedtls 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comthprogrmchangedtls 총 갯수
	 * @exception
	 */
    int selectComthprogrmchangedtlsListTotCnt(ComthprogrmchangedtlsDefaultVO searchVO);
    
}
