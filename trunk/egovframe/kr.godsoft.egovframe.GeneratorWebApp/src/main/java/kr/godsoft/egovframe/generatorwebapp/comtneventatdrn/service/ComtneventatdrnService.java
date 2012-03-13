package kr.godsoft.egovframe.generatorwebapp.comtneventatdrn.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtneventatdrn.service.ComtneventatdrnDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtneventatdrn.service.ComtneventatdrnVO;

/**
 * @Class Name : ComtneventatdrnService.java
 * @Description : Comtneventatdrn Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtneventatdrnService {
	
	/**
	 * comtneventatdrn을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtneventatdrnVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtneventatdrn(ComtneventatdrnVO vo) throws Exception;
    
    /**
	 * comtneventatdrn을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtneventatdrnVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtneventatdrn(ComtneventatdrnVO vo) throws Exception;
    
    /**
	 * comtneventatdrn을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtneventatdrnVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtneventatdrn(ComtneventatdrnVO vo) throws Exception;
    
    /**
	 * comtneventatdrn을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtneventatdrnVO
	 * @return 조회한 comtneventatdrn
	 * @exception Exception
	 */
    ComtneventatdrnVO selectComtneventatdrn(ComtneventatdrnVO vo) throws Exception;
    
    /**
	 * comtneventatdrn 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtneventatdrn 목록
	 * @exception Exception
	 */
    List selectComtneventatdrnList(ComtneventatdrnDefaultVO searchVO) throws Exception;
    
    /**
	 * comtneventatdrn 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtneventatdrn 총 갯수
	 * @exception
	 */
    int selectComtneventatdrnListTotCnt(ComtneventatdrnDefaultVO searchVO);
    
}
