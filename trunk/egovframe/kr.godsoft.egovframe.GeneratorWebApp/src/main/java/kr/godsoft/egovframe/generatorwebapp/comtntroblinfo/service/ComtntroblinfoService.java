package kr.godsoft.egovframe.generatorwebapp.comtntroblinfo.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtntroblinfo.service.ComtntroblinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtntroblinfo.service.ComtntroblinfoVO;

/**
 * @Class Name : ComtntroblinfoService.java
 * @Description : Comtntroblinfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtntroblinfoService {
	
	/**
	 * comtntroblinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtntroblinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtntroblinfo(ComtntroblinfoVO vo) throws Exception;
    
    /**
	 * comtntroblinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtntroblinfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtntroblinfo(ComtntroblinfoVO vo) throws Exception;
    
    /**
	 * comtntroblinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtntroblinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtntroblinfo(ComtntroblinfoVO vo) throws Exception;
    
    /**
	 * comtntroblinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtntroblinfoVO
	 * @return 조회한 comtntroblinfo
	 * @exception Exception
	 */
    ComtntroblinfoVO selectComtntroblinfo(ComtntroblinfoVO vo) throws Exception;
    
    /**
	 * comtntroblinfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtntroblinfo 목록
	 * @exception Exception
	 */
    List selectComtntroblinfoList(ComtntroblinfoDefaultVO searchVO) throws Exception;
    
    /**
	 * comtntroblinfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtntroblinfo 총 갯수
	 * @exception
	 */
    int selectComtntroblinfoListTotCnt(ComtntroblinfoDefaultVO searchVO);
    
}