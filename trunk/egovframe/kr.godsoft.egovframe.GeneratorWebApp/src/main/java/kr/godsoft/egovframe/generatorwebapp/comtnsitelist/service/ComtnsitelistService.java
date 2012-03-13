package kr.godsoft.egovframe.generatorwebapp.comtnsitelist.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnsitelist.service.ComtnsitelistDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnsitelist.service.ComtnsitelistVO;

/**
 * @Class Name : ComtnsitelistService.java
 * @Description : Comtnsitelist Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnsitelistService {
	
	/**
	 * comtnsitelist을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnsitelistVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnsitelist(ComtnsitelistVO vo) throws Exception;
    
    /**
	 * comtnsitelist을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnsitelistVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnsitelist(ComtnsitelistVO vo) throws Exception;
    
    /**
	 * comtnsitelist을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnsitelistVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnsitelist(ComtnsitelistVO vo) throws Exception;
    
    /**
	 * comtnsitelist을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnsitelistVO
	 * @return 조회한 comtnsitelist
	 * @exception Exception
	 */
    ComtnsitelistVO selectComtnsitelist(ComtnsitelistVO vo) throws Exception;
    
    /**
	 * comtnsitelist 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnsitelist 목록
	 * @exception Exception
	 */
    List selectComtnsitelistList(ComtnsitelistDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnsitelist 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnsitelist 총 갯수
	 * @exception
	 */
    int selectComtnsitelistListTotCnt(ComtnsitelistDefaultVO searchVO);
    
}
