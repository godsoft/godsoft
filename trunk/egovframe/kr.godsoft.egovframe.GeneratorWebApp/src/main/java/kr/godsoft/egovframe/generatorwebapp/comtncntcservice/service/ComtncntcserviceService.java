package kr.godsoft.egovframe.generatorwebapp.comtncntcservice.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtncntcserviceService.java
 * @Description : Comtncntcservice Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtncntcserviceService {
	
	/**
	 * COMTNCNTCSERVICE을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtncntcserviceVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtncntcservice(ComtncntcserviceVO vo) throws Exception;
    
    /**
	 * COMTNCNTCSERVICE을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtncntcserviceVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtncntcservice(ComtncntcserviceVO vo) throws Exception;
    
    /**
	 * COMTNCNTCSERVICE을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtncntcserviceVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtncntcservice(ComtncntcserviceVO vo) throws Exception;
    
    /**
	 * COMTNCNTCSERVICE을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtncntcserviceVO
	 * @return 조회한 COMTNCNTCSERVICE
	 * @exception Exception
	 */
    ComtncntcserviceVO selectComtncntcservice(ComtncntcserviceVO vo) throws Exception;
    
    /**
	 * COMTNCNTCSERVICE 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNCNTCSERVICE 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtncntcserviceList(ComtncntcserviceVO vo) throws Exception;
    
    /**
	 * COMTNCNTCSERVICE 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNCNTCSERVICE 총 갯수
	 * @exception
	 */
    int selectComtncntcserviceListTotCnt(ComtncntcserviceVO vo);
    
}
