package kr.godsoft.egovframe.generatorwebapp.comtnbatchschdul.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnbatchschdul.service.ComtnbatchschdulDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbatchschdul.service.ComtnbatchschdulVO;

/**
 * @Class Name : ComtnbatchschdulService.java
 * @Description : Comtnbatchschdul Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnbatchschdulService {
	
	/**
	 * comtnbatchschdul을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbatchschdulVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnbatchschdul(ComtnbatchschdulVO vo) throws Exception;
    
    /**
	 * comtnbatchschdul을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbatchschdulVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnbatchschdul(ComtnbatchschdulVO vo) throws Exception;
    
    /**
	 * comtnbatchschdul을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbatchschdulVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnbatchschdul(ComtnbatchschdulVO vo) throws Exception;
    
    /**
	 * comtnbatchschdul을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbatchschdulVO
	 * @return 조회한 comtnbatchschdul
	 * @exception Exception
	 */
    ComtnbatchschdulVO selectComtnbatchschdul(ComtnbatchschdulVO vo) throws Exception;
    
    /**
	 * comtnbatchschdul 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbatchschdul 목록
	 * @exception Exception
	 */
    List selectComtnbatchschdulList(ComtnbatchschdulDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnbatchschdul 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbatchschdul 총 갯수
	 * @exception
	 */
    int selectComtnbatchschdulListTotCnt(ComtnbatchschdulDefaultVO searchVO);
    
}
