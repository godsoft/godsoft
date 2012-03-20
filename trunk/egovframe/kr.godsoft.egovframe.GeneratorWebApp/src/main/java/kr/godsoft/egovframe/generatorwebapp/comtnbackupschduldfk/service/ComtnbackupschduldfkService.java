package kr.godsoft.egovframe.generatorwebapp.comtnbackupschduldfk.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnbackupschduldfkService.java
 * @Description : Comtnbackupschduldfk Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnbackupschduldfkService {
	
	/**
	 * comtnbackupschduldfk을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbackupschduldfkVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnbackupschduldfk(ComtnbackupschduldfkVO vo) throws Exception;
    
    /**
	 * comtnbackupschduldfk을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbackupschduldfkVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnbackupschduldfk(ComtnbackupschduldfkVO vo) throws Exception;
    
    /**
	 * comtnbackupschduldfk을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbackupschduldfkVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnbackupschduldfk(ComtnbackupschduldfkVO vo) throws Exception;
    
    /**
	 * comtnbackupschduldfk을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbackupschduldfkVO
	 * @return 조회한 comtnbackupschduldfk
	 * @exception Exception
	 */
    ComtnbackupschduldfkVO selectComtnbackupschduldfk(ComtnbackupschduldfkVO vo) throws Exception;
    
    /**
	 * comtnbackupschduldfk 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbackupschduldfk 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnbackupschduldfkList(ComtnbackupschduldfkVO vo) throws Exception;
    
    /**
	 * comtnbackupschduldfk 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbackupschduldfk 총 갯수
	 * @exception
	 */
    int selectComtnbackupschduldfkListTotCnt(ComtnbackupschduldfkVO vo);
    
}
