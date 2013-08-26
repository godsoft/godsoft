package kr.godsoft.egovframe.generatorwebapp.comtnbatchschdul.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnbatchschdulService.java
 * @Description : Comtnbatchschdul Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnbatchschdulService {
	
	/**
	 * COMTNBATCHSCHDUL을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbatchschdulVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnbatchschdul(ComtnbatchschdulVO vo) throws Exception;
    
    /**
	 * COMTNBATCHSCHDUL을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbatchschdulVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnbatchschdul(ComtnbatchschdulVO vo) throws Exception;
    
    /**
	 * COMTNBATCHSCHDUL을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbatchschdulVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnbatchschdul(ComtnbatchschdulVO vo) throws Exception;
    
    /**
	 * COMTNBATCHSCHDUL을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbatchschdulVO
	 * @return 조회한 COMTNBATCHSCHDUL
	 * @exception Exception
	 */
    ComtnbatchschdulVO selectComtnbatchschdul(ComtnbatchschdulVO vo) throws Exception;
    
    /**
	 * COMTNBATCHSCHDUL 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNBATCHSCHDUL 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnbatchschdulList(ComtnbatchschdulVO vo) throws Exception;
    
    /**
	 * COMTNBATCHSCHDUL 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNBATCHSCHDUL 총 갯수
	 * @exception
	 */
    int selectComtnbatchschdulListTotCnt(ComtnbatchschdulVO vo);
    
}
