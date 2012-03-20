package kr.godsoft.egovframe.generatorwebapp.comtnsynchrnserverinfo.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnsynchrnserverinfoService.java
 * @Description : Comtnsynchrnserverinfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnsynchrnserverinfoService {
	
	/**
	 * comtnsynchrnserverinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnsynchrnserverinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnsynchrnserverinfo(ComtnsynchrnserverinfoVO vo) throws Exception;
    
    /**
	 * comtnsynchrnserverinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnsynchrnserverinfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnsynchrnserverinfo(ComtnsynchrnserverinfoVO vo) throws Exception;
    
    /**
	 * comtnsynchrnserverinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnsynchrnserverinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnsynchrnserverinfo(ComtnsynchrnserverinfoVO vo) throws Exception;
    
    /**
	 * comtnsynchrnserverinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnsynchrnserverinfoVO
	 * @return 조회한 comtnsynchrnserverinfo
	 * @exception Exception
	 */
    ComtnsynchrnserverinfoVO selectComtnsynchrnserverinfo(ComtnsynchrnserverinfoVO vo) throws Exception;
    
    /**
	 * comtnsynchrnserverinfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnsynchrnserverinfo 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnsynchrnserverinfoList(ComtnsynchrnserverinfoVO vo) throws Exception;
    
    /**
	 * comtnsynchrnserverinfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnsynchrnserverinfo 총 갯수
	 * @exception
	 */
    int selectComtnsynchrnserverinfoListTotCnt(ComtnsynchrnserverinfoVO vo);
    
}
