package kr.godsoft.egovframe.generatorwebapp.comtnnotetrnsmit.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnnotetrnsmitService.java
 * @Description : Comtnnotetrnsmit Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnnotetrnsmitService {
	
	/**
	 * COMTNNOTETRNSMIT을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnnotetrnsmitVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnnotetrnsmit(ComtnnotetrnsmitVO vo) throws Exception;
    
    /**
	 * COMTNNOTETRNSMIT을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnnotetrnsmitVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnnotetrnsmit(ComtnnotetrnsmitVO vo) throws Exception;
    
    /**
	 * COMTNNOTETRNSMIT을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnnotetrnsmitVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnnotetrnsmit(ComtnnotetrnsmitVO vo) throws Exception;
    
    /**
	 * COMTNNOTETRNSMIT을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnnotetrnsmitVO
	 * @return 조회한 COMTNNOTETRNSMIT
	 * @exception Exception
	 */
    ComtnnotetrnsmitVO selectComtnnotetrnsmit(ComtnnotetrnsmitVO vo) throws Exception;
    
    /**
	 * COMTNNOTETRNSMIT 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNNOTETRNSMIT 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnnotetrnsmitList(ComtnnotetrnsmitVO vo) throws Exception;
    
    /**
	 * COMTNNOTETRNSMIT 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNNOTETRNSMIT 총 갯수
	 * @exception
	 */
    int selectComtnnotetrnsmitListTotCnt(ComtnnotetrnsmitVO vo);
    
}
