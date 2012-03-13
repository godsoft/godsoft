package kr.godsoft.egovframe.generatorwebapp.comtnbanner.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnbanner.service.ComtnbannerDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbanner.service.ComtnbannerVO;

/**
 * @Class Name : ComtnbannerService.java
 * @Description : Comtnbanner Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnbannerService {
	
	/**
	 * comtnbanner을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbannerVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnbanner(ComtnbannerVO vo) throws Exception;
    
    /**
	 * comtnbanner을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbannerVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnbanner(ComtnbannerVO vo) throws Exception;
    
    /**
	 * comtnbanner을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbannerVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnbanner(ComtnbannerVO vo) throws Exception;
    
    /**
	 * comtnbanner을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbannerVO
	 * @return 조회한 comtnbanner
	 * @exception Exception
	 */
    ComtnbannerVO selectComtnbanner(ComtnbannerVO vo) throws Exception;
    
    /**
	 * comtnbanner 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbanner 목록
	 * @exception Exception
	 */
    List selectComtnbannerList(ComtnbannerDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnbanner 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbanner 총 갯수
	 * @exception
	 */
    int selectComtnbannerListTotCnt(ComtnbannerDefaultVO searchVO);
    
}