package kr.godsoft.egovframe.generatorwebapp.comtnbatchschduldfk.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnbatchschduldfkService.java
 * @Description : Comtnbatchschduldfk Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnbatchschduldfkService {
	
	/**
	 * COMTNBATCHSCHDULDFK을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbatchschduldfkVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnbatchschduldfk(ComtnbatchschduldfkVO vo) throws Exception;
    
    /**
	 * COMTNBATCHSCHDULDFK을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbatchschduldfkVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnbatchschduldfk(ComtnbatchschduldfkVO vo) throws Exception;
    
    /**
	 * COMTNBATCHSCHDULDFK을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbatchschduldfkVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnbatchschduldfk(ComtnbatchschduldfkVO vo) throws Exception;
    
    /**
	 * COMTNBATCHSCHDULDFK을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbatchschduldfkVO
	 * @return 조회한 COMTNBATCHSCHDULDFK
	 * @exception Exception
	 */
    ComtnbatchschduldfkVO selectComtnbatchschduldfk(ComtnbatchschduldfkVO vo) throws Exception;
    
    /**
	 * COMTNBATCHSCHDULDFK 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNBATCHSCHDULDFK 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnbatchschduldfkList(ComtnbatchschduldfkVO vo) throws Exception;
    
    /**
	 * COMTNBATCHSCHDULDFK 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNBATCHSCHDULDFK 총 갯수
	 * @exception
	 */
    int selectComtnbatchschduldfkListTotCnt(ComtnbatchschduldfkVO vo);
    
}
