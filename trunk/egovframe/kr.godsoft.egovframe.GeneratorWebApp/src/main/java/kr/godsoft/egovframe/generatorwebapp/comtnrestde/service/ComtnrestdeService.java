package kr.godsoft.egovframe.generatorwebapp.comtnrestde.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnrestde.service.ComtnrestdeDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnrestde.service.ComtnrestdeVO;

/**
 * @Class Name : ComtnrestdeService.java
 * @Description : Comtnrestde Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnrestdeService {
	
	/**
	 * comtnrestde을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnrestdeVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnrestde(ComtnrestdeVO vo) throws Exception;
    
    /**
	 * comtnrestde을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnrestdeVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnrestde(ComtnrestdeVO vo) throws Exception;
    
    /**
	 * comtnrestde을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnrestdeVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnrestde(ComtnrestdeVO vo) throws Exception;
    
    /**
	 * comtnrestde을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnrestdeVO
	 * @return 조회한 comtnrestde
	 * @exception Exception
	 */
    ComtnrestdeVO selectComtnrestde(ComtnrestdeVO vo) throws Exception;
    
    /**
	 * comtnrestde 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnrestde 목록
	 * @exception Exception
	 */
    List selectComtnrestdeList(ComtnrestdeDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnrestde 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnrestde 총 갯수
	 * @exception
	 */
    int selectComtnrestdeListTotCnt(ComtnrestdeDefaultVO searchVO);
    
}
