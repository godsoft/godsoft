package kr.godsoft.egovframe.generatorwebapp.comtnqustnriem.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnriem.service.ComtnqustnriemDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnriem.service.ComtnqustnriemVO;

/**
 * @Class Name : ComtnqustnriemService.java
 * @Description : Comtnqustnriem Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnqustnriemService {
	
	/**
	 * comtnqustnriem을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnqustnriemVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnqustnriem(ComtnqustnriemVO vo) throws Exception;
    
    /**
	 * comtnqustnriem을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnqustnriemVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnqustnriem(ComtnqustnriemVO vo) throws Exception;
    
    /**
	 * comtnqustnriem을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnqustnriemVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnqustnriem(ComtnqustnriemVO vo) throws Exception;
    
    /**
	 * comtnqustnriem을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnqustnriemVO
	 * @return 조회한 comtnqustnriem
	 * @exception Exception
	 */
    ComtnqustnriemVO selectComtnqustnriem(ComtnqustnriemVO vo) throws Exception;
    
    /**
	 * comtnqustnriem 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnqustnriem 목록
	 * @exception Exception
	 */
    List selectComtnqustnriemList(ComtnqustnriemDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnqustnriem 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnqustnriem 총 갯수
	 * @exception
	 */
    int selectComtnqustnriemListTotCnt(ComtnqustnriemDefaultVO searchVO);
    
}
