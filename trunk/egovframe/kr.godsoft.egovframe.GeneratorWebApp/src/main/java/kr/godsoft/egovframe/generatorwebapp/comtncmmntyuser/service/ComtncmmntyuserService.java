package kr.godsoft.egovframe.generatorwebapp.comtncmmntyuser.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtncmmntyuser.service.ComtncmmntyuserDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtncmmntyuser.service.ComtncmmntyuserVO;

/**
 * @Class Name : ComtncmmntyuserService.java
 * @Description : Comtncmmntyuser Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtncmmntyuserService {
	
	/**
	 * comtncmmntyuser을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtncmmntyuserVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtncmmntyuser(ComtncmmntyuserVO vo) throws Exception;
    
    /**
	 * comtncmmntyuser을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtncmmntyuserVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtncmmntyuser(ComtncmmntyuserVO vo) throws Exception;
    
    /**
	 * comtncmmntyuser을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtncmmntyuserVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtncmmntyuser(ComtncmmntyuserVO vo) throws Exception;
    
    /**
	 * comtncmmntyuser을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtncmmntyuserVO
	 * @return 조회한 comtncmmntyuser
	 * @exception Exception
	 */
    ComtncmmntyuserVO selectComtncmmntyuser(ComtncmmntyuserVO vo) throws Exception;
    
    /**
	 * comtncmmntyuser 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtncmmntyuser 목록
	 * @exception Exception
	 */
    List selectComtncmmntyuserList(ComtncmmntyuserDefaultVO searchVO) throws Exception;
    
    /**
	 * comtncmmntyuser 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtncmmntyuser 총 갯수
	 * @exception
	 */
    int selectComtncmmntyuserListTotCnt(ComtncmmntyuserDefaultVO searchVO);
    
}