package kr.godsoft.egovframe.generatorwebapp.comthdbmntrngloginfo.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comthdbmntrngloginfo.service.ComthdbmntrngloginfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comthdbmntrngloginfo.service.ComthdbmntrngloginfoVO;

/**
 * @Class Name : ComthdbmntrngloginfoService.java
 * @Description : Comthdbmntrngloginfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComthdbmntrngloginfoService {
	
	/**
	 * comthdbmntrngloginfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComthdbmntrngloginfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComthdbmntrngloginfo(ComthdbmntrngloginfoVO vo) throws Exception;
    
    /**
	 * comthdbmntrngloginfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComthdbmntrngloginfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComthdbmntrngloginfo(ComthdbmntrngloginfoVO vo) throws Exception;
    
    /**
	 * comthdbmntrngloginfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComthdbmntrngloginfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComthdbmntrngloginfo(ComthdbmntrngloginfoVO vo) throws Exception;
    
    /**
	 * comthdbmntrngloginfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComthdbmntrngloginfoVO
	 * @return 조회한 comthdbmntrngloginfo
	 * @exception Exception
	 */
    ComthdbmntrngloginfoVO selectComthdbmntrngloginfo(ComthdbmntrngloginfoVO vo) throws Exception;
    
    /**
	 * comthdbmntrngloginfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comthdbmntrngloginfo 목록
	 * @exception Exception
	 */
    List selectComthdbmntrngloginfoList(ComthdbmntrngloginfoDefaultVO searchVO) throws Exception;
    
    /**
	 * comthdbmntrngloginfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comthdbmntrngloginfo 총 갯수
	 * @exception
	 */
    int selectComthdbmntrngloginfoListTotCnt(ComthdbmntrngloginfoDefaultVO searchVO);
    
}
