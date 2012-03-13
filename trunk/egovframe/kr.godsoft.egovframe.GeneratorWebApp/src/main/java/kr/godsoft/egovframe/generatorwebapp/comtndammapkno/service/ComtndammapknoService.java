package kr.godsoft.egovframe.generatorwebapp.comtndammapkno.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtndammapkno.service.ComtndammapknoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtndammapkno.service.ComtndammapknoVO;

/**
 * @Class Name : ComtndammapknoService.java
 * @Description : Comtndammapkno Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtndammapknoService {
	
	/**
	 * comtndammapkno을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtndammapknoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtndammapkno(ComtndammapknoVO vo) throws Exception;
    
    /**
	 * comtndammapkno을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtndammapknoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtndammapkno(ComtndammapknoVO vo) throws Exception;
    
    /**
	 * comtndammapkno을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtndammapknoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtndammapkno(ComtndammapknoVO vo) throws Exception;
    
    /**
	 * comtndammapkno을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtndammapknoVO
	 * @return 조회한 comtndammapkno
	 * @exception Exception
	 */
    ComtndammapknoVO selectComtndammapkno(ComtndammapknoVO vo) throws Exception;
    
    /**
	 * comtndammapkno 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtndammapkno 목록
	 * @exception Exception
	 */
    List selectComtndammapknoList(ComtndammapknoDefaultVO searchVO) throws Exception;
    
    /**
	 * comtndammapkno 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtndammapkno 총 갯수
	 * @exception
	 */
    int selectComtndammapknoListTotCnt(ComtndammapknoDefaultVO searchVO);
    
}
