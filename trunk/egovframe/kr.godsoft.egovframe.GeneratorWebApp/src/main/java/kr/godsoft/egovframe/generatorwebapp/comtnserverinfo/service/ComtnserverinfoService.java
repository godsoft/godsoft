package kr.godsoft.egovframe.generatorwebapp.comtnserverinfo.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnserverinfo.service.ComtnserverinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnserverinfo.service.ComtnserverinfoVO;

/**
 * @Class Name : ComtnserverinfoService.java
 * @Description : Comtnserverinfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnserverinfoService {
	
	/**
	 * comtnserverinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnserverinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnserverinfo(ComtnserverinfoVO vo) throws Exception;
    
    /**
	 * comtnserverinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnserverinfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnserverinfo(ComtnserverinfoVO vo) throws Exception;
    
    /**
	 * comtnserverinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnserverinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnserverinfo(ComtnserverinfoVO vo) throws Exception;
    
    /**
	 * comtnserverinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnserverinfoVO
	 * @return 조회한 comtnserverinfo
	 * @exception Exception
	 */
    ComtnserverinfoVO selectComtnserverinfo(ComtnserverinfoVO vo) throws Exception;
    
    /**
	 * comtnserverinfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnserverinfo 목록
	 * @exception Exception
	 */
    List selectComtnserverinfoList(ComtnserverinfoDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnserverinfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnserverinfo 총 갯수
	 * @exception
	 */
    int selectComtnserverinfoListTotCnt(ComtnserverinfoDefaultVO searchVO);
    
}
