package kr.godsoft.egovframe.generatorwebapp.comthtrsmrcvmntrngloginfo.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comthtrsmrcvmntrngloginfo.service.ComthtrsmrcvmntrngloginfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comthtrsmrcvmntrngloginfo.service.ComthtrsmrcvmntrngloginfoVO;

/**
 * @Class Name : ComthtrsmrcvmntrngloginfoService.java
 * @Description : Comthtrsmrcvmntrngloginfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComthtrsmrcvmntrngloginfoService {
	
	/**
	 * comthtrsmrcvmntrngloginfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComthtrsmrcvmntrngloginfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComthtrsmrcvmntrngloginfo(ComthtrsmrcvmntrngloginfoVO vo) throws Exception;
    
    /**
	 * comthtrsmrcvmntrngloginfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComthtrsmrcvmntrngloginfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComthtrsmrcvmntrngloginfo(ComthtrsmrcvmntrngloginfoVO vo) throws Exception;
    
    /**
	 * comthtrsmrcvmntrngloginfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComthtrsmrcvmntrngloginfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComthtrsmrcvmntrngloginfo(ComthtrsmrcvmntrngloginfoVO vo) throws Exception;
    
    /**
	 * comthtrsmrcvmntrngloginfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComthtrsmrcvmntrngloginfoVO
	 * @return 조회한 comthtrsmrcvmntrngloginfo
	 * @exception Exception
	 */
    ComthtrsmrcvmntrngloginfoVO selectComthtrsmrcvmntrngloginfo(ComthtrsmrcvmntrngloginfoVO vo) throws Exception;
    
    /**
	 * comthtrsmrcvmntrngloginfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comthtrsmrcvmntrngloginfo 목록
	 * @exception Exception
	 */
    List selectComthtrsmrcvmntrngloginfoList(ComthtrsmrcvmntrngloginfoDefaultVO searchVO) throws Exception;
    
    /**
	 * comthtrsmrcvmntrngloginfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comthtrsmrcvmntrngloginfo 총 갯수
	 * @exception
	 */
    int selectComthtrsmrcvmntrngloginfoListTotCnt(ComthtrsmrcvmntrngloginfoDefaultVO searchVO);
    
}
