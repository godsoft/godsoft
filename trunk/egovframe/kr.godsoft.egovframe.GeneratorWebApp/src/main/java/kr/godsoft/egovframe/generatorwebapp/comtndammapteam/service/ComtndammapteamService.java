package kr.godsoft.egovframe.generatorwebapp.comtndammapteam.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtndammapteam.service.ComtndammapteamDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtndammapteam.service.ComtndammapteamVO;

/**
 * @Class Name : ComtndammapteamService.java
 * @Description : Comtndammapteam Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtndammapteamService {
	
	/**
	 * comtndammapteam을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtndammapteamVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtndammapteam(ComtndammapteamVO vo) throws Exception;
    
    /**
	 * comtndammapteam을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtndammapteamVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtndammapteam(ComtndammapteamVO vo) throws Exception;
    
    /**
	 * comtndammapteam을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtndammapteamVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtndammapteam(ComtndammapteamVO vo) throws Exception;
    
    /**
	 * comtndammapteam을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtndammapteamVO
	 * @return 조회한 comtndammapteam
	 * @exception Exception
	 */
    ComtndammapteamVO selectComtndammapteam(ComtndammapteamVO vo) throws Exception;
    
    /**
	 * comtndammapteam 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtndammapteam 목록
	 * @exception Exception
	 */
    List selectComtndammapteamList(ComtndammapteamDefaultVO searchVO) throws Exception;
    
    /**
	 * comtndammapteam 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtndammapteam 총 갯수
	 * @exception
	 */
    int selectComtndammapteamListTotCnt(ComtndammapteamDefaultVO searchVO);
    
}
