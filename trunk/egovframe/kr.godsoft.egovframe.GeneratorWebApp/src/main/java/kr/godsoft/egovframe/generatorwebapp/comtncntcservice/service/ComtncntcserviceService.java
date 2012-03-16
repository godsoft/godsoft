package kr.godsoft.egovframe.generatorwebapp.comtncntcservice.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtncntcserviceService.java
 * @Description : Comtncntcservice Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtncntcserviceService {
	
	/**
	 * comtncntcservice을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtncntcserviceVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtncntcservice(ComtncntcserviceVO vo) throws Exception;
    
    /**
	 * comtncntcservice을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtncntcserviceVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtncntcservice(ComtncntcserviceVO vo) throws Exception;
    
    /**
	 * comtncntcservice을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtncntcserviceVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtncntcservice(ComtncntcserviceVO vo) throws Exception;
    
    /**
	 * comtncntcservice을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtncntcserviceVO
	 * @return 조회한 comtncntcservice
	 * @exception Exception
	 */
    ComtncntcserviceVO selectComtncntcservice(ComtncntcserviceVO vo) throws Exception;
    
    /**
	 * comtncntcservice 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtncntcservice 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtncntcserviceList(ComtncntcserviceVO vo) throws Exception;
    
    /**
	 * comtncntcservice 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtncntcservice 총 갯수
	 * @exception
	 */
    int selectComtncntcserviceListTotCnt(ComtncntcserviceVO vo);
    
}
