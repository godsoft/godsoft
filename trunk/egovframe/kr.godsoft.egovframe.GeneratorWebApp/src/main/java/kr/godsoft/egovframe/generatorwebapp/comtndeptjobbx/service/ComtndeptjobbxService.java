package kr.godsoft.egovframe.generatorwebapp.comtndeptjobbx.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtndeptjobbx.service.ComtndeptjobbxDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtndeptjobbx.service.ComtndeptjobbxVO;

/**
 * @Class Name : ComtndeptjobbxService.java
 * @Description : Comtndeptjobbx Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtndeptjobbxService {
	
	/**
	 * comtndeptjobbx을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtndeptjobbxVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtndeptjobbx(ComtndeptjobbxVO vo) throws Exception;
    
    /**
	 * comtndeptjobbx을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtndeptjobbxVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtndeptjobbx(ComtndeptjobbxVO vo) throws Exception;
    
    /**
	 * comtndeptjobbx을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtndeptjobbxVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtndeptjobbx(ComtndeptjobbxVO vo) throws Exception;
    
    /**
	 * comtndeptjobbx을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtndeptjobbxVO
	 * @return 조회한 comtndeptjobbx
	 * @exception Exception
	 */
    ComtndeptjobbxVO selectComtndeptjobbx(ComtndeptjobbxVO vo) throws Exception;
    
    /**
	 * comtndeptjobbx 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtndeptjobbx 목록
	 * @exception Exception
	 */
    List selectComtndeptjobbxList(ComtndeptjobbxDefaultVO searchVO) throws Exception;
    
    /**
	 * comtndeptjobbx 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtndeptjobbx 총 갯수
	 * @exception
	 */
    int selectComtndeptjobbxListTotCnt(ComtndeptjobbxDefaultVO searchVO);
    
}