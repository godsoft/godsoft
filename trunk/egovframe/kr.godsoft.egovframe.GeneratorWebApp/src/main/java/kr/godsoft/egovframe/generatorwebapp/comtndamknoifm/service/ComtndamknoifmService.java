package kr.godsoft.egovframe.generatorwebapp.comtndamknoifm.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtndamknoifm.service.ComtndamknoifmDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtndamknoifm.service.ComtndamknoifmVO;

/**
 * @Class Name : ComtndamknoifmService.java
 * @Description : Comtndamknoifm Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtndamknoifmService {
	
	/**
	 * comtndamknoifm을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtndamknoifmVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtndamknoifm(ComtndamknoifmVO vo) throws Exception;
    
    /**
	 * comtndamknoifm을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtndamknoifmVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtndamknoifm(ComtndamknoifmVO vo) throws Exception;
    
    /**
	 * comtndamknoifm을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtndamknoifmVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtndamknoifm(ComtndamknoifmVO vo) throws Exception;
    
    /**
	 * comtndamknoifm을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtndamknoifmVO
	 * @return 조회한 comtndamknoifm
	 * @exception Exception
	 */
    ComtndamknoifmVO selectComtndamknoifm(ComtndamknoifmVO vo) throws Exception;
    
    /**
	 * comtndamknoifm 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtndamknoifm 목록
	 * @exception Exception
	 */
    List selectComtndamknoifmList(ComtndamknoifmDefaultVO searchVO) throws Exception;
    
    /**
	 * comtndamknoifm 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtndamknoifm 총 갯수
	 * @exception
	 */
    int selectComtndamknoifmListTotCnt(ComtndamknoifmDefaultVO searchVO);
    
}
