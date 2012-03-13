package kr.godsoft.egovframe.generatorwebapp.comtnservereqpmninfo.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnservereqpmninfo.service.ComtnservereqpmninfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnservereqpmninfo.service.ComtnservereqpmninfoVO;

/**
 * @Class Name : ComtnservereqpmninfoService.java
 * @Description : Comtnservereqpmninfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnservereqpmninfoService {
	
	/**
	 * comtnservereqpmninfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnservereqpmninfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnservereqpmninfo(ComtnservereqpmninfoVO vo) throws Exception;
    
    /**
	 * comtnservereqpmninfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnservereqpmninfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnservereqpmninfo(ComtnservereqpmninfoVO vo) throws Exception;
    
    /**
	 * comtnservereqpmninfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnservereqpmninfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnservereqpmninfo(ComtnservereqpmninfoVO vo) throws Exception;
    
    /**
	 * comtnservereqpmninfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnservereqpmninfoVO
	 * @return 조회한 comtnservereqpmninfo
	 * @exception Exception
	 */
    ComtnservereqpmninfoVO selectComtnservereqpmninfo(ComtnservereqpmninfoVO vo) throws Exception;
    
    /**
	 * comtnservereqpmninfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnservereqpmninfo 목록
	 * @exception Exception
	 */
    List selectComtnservereqpmninfoList(ComtnservereqpmninfoDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnservereqpmninfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnservereqpmninfo 총 갯수
	 * @exception
	 */
    int selectComtnservereqpmninfoListTotCnt(ComtnservereqpmninfoDefaultVO searchVO);
    
}
