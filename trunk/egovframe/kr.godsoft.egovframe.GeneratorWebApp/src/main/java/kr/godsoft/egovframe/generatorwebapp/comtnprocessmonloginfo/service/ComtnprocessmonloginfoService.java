package kr.godsoft.egovframe.generatorwebapp.comtnprocessmonloginfo.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnprocessmonloginfo.service.ComtnprocessmonloginfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnprocessmonloginfo.service.ComtnprocessmonloginfoVO;

/**
 * @Class Name : ComtnprocessmonloginfoService.java
 * @Description : Comtnprocessmonloginfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnprocessmonloginfoService {
	
	/**
	 * comtnprocessmonloginfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnprocessmonloginfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnprocessmonloginfo(ComtnprocessmonloginfoVO vo) throws Exception;
    
    /**
	 * comtnprocessmonloginfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnprocessmonloginfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnprocessmonloginfo(ComtnprocessmonloginfoVO vo) throws Exception;
    
    /**
	 * comtnprocessmonloginfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnprocessmonloginfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnprocessmonloginfo(ComtnprocessmonloginfoVO vo) throws Exception;
    
    /**
	 * comtnprocessmonloginfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnprocessmonloginfoVO
	 * @return 조회한 comtnprocessmonloginfo
	 * @exception Exception
	 */
    ComtnprocessmonloginfoVO selectComtnprocessmonloginfo(ComtnprocessmonloginfoVO vo) throws Exception;
    
    /**
	 * comtnprocessmonloginfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnprocessmonloginfo 목록
	 * @exception Exception
	 */
    List selectComtnprocessmonloginfoList(ComtnprocessmonloginfoDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnprocessmonloginfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnprocessmonloginfo 총 갯수
	 * @exception
	 */
    int selectComtnprocessmonloginfoListTotCnt(ComtnprocessmonloginfoDefaultVO searchVO);
    
}