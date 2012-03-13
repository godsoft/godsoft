package kr.godsoft.egovframe.generatorwebapp.comtnauthorrolerelate.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnauthorrolerelate.service.ComtnauthorrolerelateDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnauthorrolerelate.service.ComtnauthorrolerelateVO;

/**
 * @Class Name : ComtnauthorrolerelateService.java
 * @Description : Comtnauthorrolerelate Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnauthorrolerelateService {
	
	/**
	 * comtnauthorrolerelate을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnauthorrolerelateVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnauthorrolerelate(ComtnauthorrolerelateVO vo) throws Exception;
    
    /**
	 * comtnauthorrolerelate을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnauthorrolerelateVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnauthorrolerelate(ComtnauthorrolerelateVO vo) throws Exception;
    
    /**
	 * comtnauthorrolerelate을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnauthorrolerelateVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnauthorrolerelate(ComtnauthorrolerelateVO vo) throws Exception;
    
    /**
	 * comtnauthorrolerelate을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnauthorrolerelateVO
	 * @return 조회한 comtnauthorrolerelate
	 * @exception Exception
	 */
    ComtnauthorrolerelateVO selectComtnauthorrolerelate(ComtnauthorrolerelateVO vo) throws Exception;
    
    /**
	 * comtnauthorrolerelate 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnauthorrolerelate 목록
	 * @exception Exception
	 */
    List selectComtnauthorrolerelateList(ComtnauthorrolerelateDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnauthorrolerelate 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnauthorrolerelate 총 갯수
	 * @exception
	 */
    int selectComtnauthorrolerelateListTotCnt(ComtnauthorrolerelateDefaultVO searchVO);
    
}