package kr.godsoft.egovframe.generatorwebapp.comthemaildsptchmanage.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comthemaildsptchmanage.service.ComthemaildsptchmanageDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comthemaildsptchmanage.service.ComthemaildsptchmanageVO;

/**
 * @Class Name : ComthemaildsptchmanageService.java
 * @Description : Comthemaildsptchmanage Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComthemaildsptchmanageService {
	
	/**
	 * comthemaildsptchmanage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComthemaildsptchmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComthemaildsptchmanage(ComthemaildsptchmanageVO vo) throws Exception;
    
    /**
	 * comthemaildsptchmanage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComthemaildsptchmanageVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComthemaildsptchmanage(ComthemaildsptchmanageVO vo) throws Exception;
    
    /**
	 * comthemaildsptchmanage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComthemaildsptchmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComthemaildsptchmanage(ComthemaildsptchmanageVO vo) throws Exception;
    
    /**
	 * comthemaildsptchmanage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComthemaildsptchmanageVO
	 * @return 조회한 comthemaildsptchmanage
	 * @exception Exception
	 */
    ComthemaildsptchmanageVO selectComthemaildsptchmanage(ComthemaildsptchmanageVO vo) throws Exception;
    
    /**
	 * comthemaildsptchmanage 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comthemaildsptchmanage 목록
	 * @exception Exception
	 */
    List selectComthemaildsptchmanageList(ComthemaildsptchmanageDefaultVO searchVO) throws Exception;
    
    /**
	 * comthemaildsptchmanage 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comthemaildsptchmanage 총 갯수
	 * @exception
	 */
    int selectComthemaildsptchmanageListTotCnt(ComthemaildsptchmanageDefaultVO searchVO);
    
}
