package kr.godsoft.egovframe.generatorwebapp.comtncomment.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtncomment.service.ComtncommentDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtncomment.service.ComtncommentVO;

/**
 * @Class Name : ComtncommentService.java
 * @Description : Comtncomment Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtncommentService {
	
	/**
	 * comtncomment을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtncommentVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtncomment(ComtncommentVO vo) throws Exception;
    
    /**
	 * comtncomment을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtncommentVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtncomment(ComtncommentVO vo) throws Exception;
    
    /**
	 * comtncomment을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtncommentVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtncomment(ComtncommentVO vo) throws Exception;
    
    /**
	 * comtncomment을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtncommentVO
	 * @return 조회한 comtncomment
	 * @exception Exception
	 */
    ComtncommentVO selectComtncomment(ComtncommentVO vo) throws Exception;
    
    /**
	 * comtncomment 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtncomment 목록
	 * @exception Exception
	 */
    List selectComtncommentList(ComtncommentDefaultVO searchVO) throws Exception;
    
    /**
	 * comtncomment 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtncomment 총 갯수
	 * @exception
	 */
    int selectComtncommentListTotCnt(ComtncommentDefaultVO searchVO);
    
}
