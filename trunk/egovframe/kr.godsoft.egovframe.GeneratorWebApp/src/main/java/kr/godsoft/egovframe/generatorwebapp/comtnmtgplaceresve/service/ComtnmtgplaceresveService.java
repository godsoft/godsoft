package kr.godsoft.egovframe.generatorwebapp.comtnmtgplaceresve.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnmtgplaceresve.service.ComtnmtgplaceresveDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnmtgplaceresve.service.ComtnmtgplaceresveVO;

/**
 * @Class Name : ComtnmtgplaceresveService.java
 * @Description : Comtnmtgplaceresve Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnmtgplaceresveService {
	
	/**
	 * comtnmtgplaceresve을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnmtgplaceresveVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnmtgplaceresve(ComtnmtgplaceresveVO vo) throws Exception;
    
    /**
	 * comtnmtgplaceresve을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnmtgplaceresveVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnmtgplaceresve(ComtnmtgplaceresveVO vo) throws Exception;
    
    /**
	 * comtnmtgplaceresve을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnmtgplaceresveVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnmtgplaceresve(ComtnmtgplaceresveVO vo) throws Exception;
    
    /**
	 * comtnmtgplaceresve을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnmtgplaceresveVO
	 * @return 조회한 comtnmtgplaceresve
	 * @exception Exception
	 */
    ComtnmtgplaceresveVO selectComtnmtgplaceresve(ComtnmtgplaceresveVO vo) throws Exception;
    
    /**
	 * comtnmtgplaceresve 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnmtgplaceresve 목록
	 * @exception Exception
	 */
    List selectComtnmtgplaceresveList(ComtnmtgplaceresveDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnmtgplaceresve 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnmtgplaceresve 총 갯수
	 * @exception
	 */
    int selectComtnmtgplaceresveListTotCnt(ComtnmtgplaceresveDefaultVO searchVO);
    
}
