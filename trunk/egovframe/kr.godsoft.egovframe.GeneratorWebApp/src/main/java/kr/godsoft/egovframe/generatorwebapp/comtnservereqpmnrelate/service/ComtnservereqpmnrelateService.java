package kr.godsoft.egovframe.generatorwebapp.comtnservereqpmnrelate.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnservereqpmnrelate.service.ComtnservereqpmnrelateDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnservereqpmnrelate.service.ComtnservereqpmnrelateVO;

/**
 * @Class Name : ComtnservereqpmnrelateService.java
 * @Description : Comtnservereqpmnrelate Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnservereqpmnrelateService {
	
	/**
	 * comtnservereqpmnrelate을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnservereqpmnrelateVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnservereqpmnrelate(ComtnservereqpmnrelateVO vo) throws Exception;
    
    /**
	 * comtnservereqpmnrelate을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnservereqpmnrelateVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnservereqpmnrelate(ComtnservereqpmnrelateVO vo) throws Exception;
    
    /**
	 * comtnservereqpmnrelate을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnservereqpmnrelateVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnservereqpmnrelate(ComtnservereqpmnrelateVO vo) throws Exception;
    
    /**
	 * comtnservereqpmnrelate을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnservereqpmnrelateVO
	 * @return 조회한 comtnservereqpmnrelate
	 * @exception Exception
	 */
    ComtnservereqpmnrelateVO selectComtnservereqpmnrelate(ComtnservereqpmnrelateVO vo) throws Exception;
    
    /**
	 * comtnservereqpmnrelate 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnservereqpmnrelate 목록
	 * @exception Exception
	 */
    List selectComtnservereqpmnrelateList(ComtnservereqpmnrelateDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnservereqpmnrelate 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnservereqpmnrelate 총 갯수
	 * @exception
	 */
    int selectComtnservereqpmnrelateListTotCnt(ComtnservereqpmnrelateDefaultVO searchVO);
    
}
