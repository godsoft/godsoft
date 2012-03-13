package kr.godsoft.egovframe.generatorwebapp.comthhttpmonloginfo.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comthhttpmonloginfo.service.ComthhttpmonloginfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comthhttpmonloginfo.service.ComthhttpmonloginfoVO;

/**
 * @Class Name : ComthhttpmonloginfoService.java
 * @Description : Comthhttpmonloginfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComthhttpmonloginfoService {
	
	/**
	 * comthhttpmonloginfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComthhttpmonloginfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComthhttpmonloginfo(ComthhttpmonloginfoVO vo) throws Exception;
    
    /**
	 * comthhttpmonloginfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComthhttpmonloginfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComthhttpmonloginfo(ComthhttpmonloginfoVO vo) throws Exception;
    
    /**
	 * comthhttpmonloginfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComthhttpmonloginfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComthhttpmonloginfo(ComthhttpmonloginfoVO vo) throws Exception;
    
    /**
	 * comthhttpmonloginfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComthhttpmonloginfoVO
	 * @return 조회한 comthhttpmonloginfo
	 * @exception Exception
	 */
    ComthhttpmonloginfoVO selectComthhttpmonloginfo(ComthhttpmonloginfoVO vo) throws Exception;
    
    /**
	 * comthhttpmonloginfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comthhttpmonloginfo 목록
	 * @exception Exception
	 */
    List selectComthhttpmonloginfoList(ComthhttpmonloginfoDefaultVO searchVO) throws Exception;
    
    /**
	 * comthhttpmonloginfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comthhttpmonloginfo 총 갯수
	 * @exception
	 */
    int selectComthhttpmonloginfoListTotCnt(ComthhttpmonloginfoDefaultVO searchVO);
    
}
