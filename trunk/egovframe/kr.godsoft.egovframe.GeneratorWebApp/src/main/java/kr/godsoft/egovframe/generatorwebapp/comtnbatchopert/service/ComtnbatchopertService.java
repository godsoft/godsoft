package kr.godsoft.egovframe.generatorwebapp.comtnbatchopert.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnbatchopertService.java
 * @Description : Comtnbatchopert Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnbatchopertService {
	
	/**
	 * comtnbatchopert을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbatchopertVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnbatchopert(ComtnbatchopertVO vo) throws Exception;
    
    /**
	 * comtnbatchopert을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbatchopertVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnbatchopert(ComtnbatchopertVO vo) throws Exception;
    
    /**
	 * comtnbatchopert을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbatchopertVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnbatchopert(ComtnbatchopertVO vo) throws Exception;
    
    /**
	 * comtnbatchopert을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbatchopertVO
	 * @return 조회한 comtnbatchopert
	 * @exception Exception
	 */
    ComtnbatchopertVO selectComtnbatchopert(ComtnbatchopertVO vo) throws Exception;
    
    /**
	 * comtnbatchopert 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbatchopert 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnbatchopertList(ComtnbatchopertVO vo) throws Exception;
    
    /**
	 * comtnbatchopert 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbatchopert 총 갯수
	 * @exception
	 */
    int selectComtnbatchopertListTotCnt(ComtnbatchopertVO vo);
    
}
