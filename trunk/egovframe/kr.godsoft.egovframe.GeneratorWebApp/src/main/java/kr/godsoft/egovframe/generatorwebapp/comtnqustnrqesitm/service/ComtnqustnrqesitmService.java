package kr.godsoft.egovframe.generatorwebapp.comtnqustnrqesitm.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnrqesitm.service.ComtnqustnrqesitmDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnrqesitm.service.ComtnqustnrqesitmVO;

/**
 * @Class Name : ComtnqustnrqesitmService.java
 * @Description : Comtnqustnrqesitm Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnqustnrqesitmService {
	
	/**
	 * comtnqustnrqesitm을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnqustnrqesitmVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnqustnrqesitm(ComtnqustnrqesitmVO vo) throws Exception;
    
    /**
	 * comtnqustnrqesitm을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnqustnrqesitmVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnqustnrqesitm(ComtnqustnrqesitmVO vo) throws Exception;
    
    /**
	 * comtnqustnrqesitm을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnqustnrqesitmVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnqustnrqesitm(ComtnqustnrqesitmVO vo) throws Exception;
    
    /**
	 * comtnqustnrqesitm을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnqustnrqesitmVO
	 * @return 조회한 comtnqustnrqesitm
	 * @exception Exception
	 */
    ComtnqustnrqesitmVO selectComtnqustnrqesitm(ComtnqustnrqesitmVO vo) throws Exception;
    
    /**
	 * comtnqustnrqesitm 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnqustnrqesitm 목록
	 * @exception Exception
	 */
    List selectComtnqustnrqesitmList(ComtnqustnrqesitmDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnqustnrqesitm 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnqustnrqesitm 총 갯수
	 * @exception
	 */
    int selectComtnqustnrqesitmListTotCnt(ComtnqustnrqesitmDefaultVO searchVO);
    
}
