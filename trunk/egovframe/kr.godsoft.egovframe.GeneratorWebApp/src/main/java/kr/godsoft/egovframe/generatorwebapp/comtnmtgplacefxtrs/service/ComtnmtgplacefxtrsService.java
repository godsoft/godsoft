package kr.godsoft.egovframe.generatorwebapp.comtnmtgplacefxtrs.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnmtgplacefxtrs.service.ComtnmtgplacefxtrsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnmtgplacefxtrs.service.ComtnmtgplacefxtrsVO;

/**
 * @Class Name : ComtnmtgplacefxtrsService.java
 * @Description : Comtnmtgplacefxtrs Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnmtgplacefxtrsService {
	
	/**
	 * comtnmtgplacefxtrs을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnmtgplacefxtrsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnmtgplacefxtrs(ComtnmtgplacefxtrsVO vo) throws Exception;
    
    /**
	 * comtnmtgplacefxtrs을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnmtgplacefxtrsVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnmtgplacefxtrs(ComtnmtgplacefxtrsVO vo) throws Exception;
    
    /**
	 * comtnmtgplacefxtrs을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnmtgplacefxtrsVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnmtgplacefxtrs(ComtnmtgplacefxtrsVO vo) throws Exception;
    
    /**
	 * comtnmtgplacefxtrs을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnmtgplacefxtrsVO
	 * @return 조회한 comtnmtgplacefxtrs
	 * @exception Exception
	 */
    ComtnmtgplacefxtrsVO selectComtnmtgplacefxtrs(ComtnmtgplacefxtrsVO vo) throws Exception;
    
    /**
	 * comtnmtgplacefxtrs 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnmtgplacefxtrs 목록
	 * @exception Exception
	 */
    List selectComtnmtgplacefxtrsList(ComtnmtgplacefxtrsDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnmtgplacefxtrs 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnmtgplacefxtrs 총 갯수
	 * @exception
	 */
    int selectComtnmtgplacefxtrsListTotCnt(ComtnmtgplacefxtrsDefaultVO searchVO);
    
}
