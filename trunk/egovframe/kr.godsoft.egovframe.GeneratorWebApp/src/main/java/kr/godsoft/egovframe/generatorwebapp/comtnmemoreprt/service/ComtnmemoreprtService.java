package kr.godsoft.egovframe.generatorwebapp.comtnmemoreprt.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnmemoreprt.service.ComtnmemoreprtDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnmemoreprt.service.ComtnmemoreprtVO;

/**
 * @Class Name : ComtnmemoreprtService.java
 * @Description : Comtnmemoreprt Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnmemoreprtService {
	
	/**
	 * comtnmemoreprt을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnmemoreprtVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnmemoreprt(ComtnmemoreprtVO vo) throws Exception;
    
    /**
	 * comtnmemoreprt을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnmemoreprtVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnmemoreprt(ComtnmemoreprtVO vo) throws Exception;
    
    /**
	 * comtnmemoreprt을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnmemoreprtVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnmemoreprt(ComtnmemoreprtVO vo) throws Exception;
    
    /**
	 * comtnmemoreprt을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnmemoreprtVO
	 * @return 조회한 comtnmemoreprt
	 * @exception Exception
	 */
    ComtnmemoreprtVO selectComtnmemoreprt(ComtnmemoreprtVO vo) throws Exception;
    
    /**
	 * comtnmemoreprt 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnmemoreprt 목록
	 * @exception Exception
	 */
    List selectComtnmemoreprtList(ComtnmemoreprtDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnmemoreprt 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnmemoreprt 총 갯수
	 * @exception
	 */
    int selectComtnmemoreprtListTotCnt(ComtnmemoreprtDefaultVO searchVO);
    
}
