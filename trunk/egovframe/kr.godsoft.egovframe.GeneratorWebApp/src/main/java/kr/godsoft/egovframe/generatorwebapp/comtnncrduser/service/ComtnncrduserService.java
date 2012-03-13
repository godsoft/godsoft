package kr.godsoft.egovframe.generatorwebapp.comtnncrduser.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnncrduser.service.ComtnncrduserDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnncrduser.service.ComtnncrduserVO;

/**
 * @Class Name : ComtnncrduserService.java
 * @Description : Comtnncrduser Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnncrduserService {
	
	/**
	 * comtnncrduser을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnncrduserVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnncrduser(ComtnncrduserVO vo) throws Exception;
    
    /**
	 * comtnncrduser을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnncrduserVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnncrduser(ComtnncrduserVO vo) throws Exception;
    
    /**
	 * comtnncrduser을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnncrduserVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnncrduser(ComtnncrduserVO vo) throws Exception;
    
    /**
	 * comtnncrduser을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnncrduserVO
	 * @return 조회한 comtnncrduser
	 * @exception Exception
	 */
    ComtnncrduserVO selectComtnncrduser(ComtnncrduserVO vo) throws Exception;
    
    /**
	 * comtnncrduser 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnncrduser 목록
	 * @exception Exception
	 */
    List selectComtnncrduserList(ComtnncrduserDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnncrduser 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnncrduser 총 갯수
	 * @exception
	 */
    int selectComtnncrduserListTotCnt(ComtnncrduserDefaultVO searchVO);
    
}
