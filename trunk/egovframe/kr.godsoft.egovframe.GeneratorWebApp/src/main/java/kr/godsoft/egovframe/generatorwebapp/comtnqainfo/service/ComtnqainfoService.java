package kr.godsoft.egovframe.generatorwebapp.comtnqainfo.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnqainfoService.java
 * @Description : Comtnqainfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnqainfoService {
	
	/**
	 * COMTNQAINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnqainfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnqainfo(ComtnqainfoVO vo) throws Exception;
    
    /**
	 * COMTNQAINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnqainfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnqainfo(ComtnqainfoVO vo) throws Exception;
    
    /**
	 * COMTNQAINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnqainfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnqainfo(ComtnqainfoVO vo) throws Exception;
    
    /**
	 * COMTNQAINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnqainfoVO
	 * @return 조회한 COMTNQAINFO
	 * @exception Exception
	 */
    ComtnqainfoVO selectComtnqainfo(ComtnqainfoVO vo) throws Exception;
    
    /**
	 * COMTNQAINFO 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNQAINFO 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnqainfoList(ComtnqainfoVO vo) throws Exception;
    
    /**
	 * COMTNQAINFO 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNQAINFO 총 갯수
	 * @exception
	 */
    int selectComtnqainfoListTotCnt(ComtnqainfoVO vo);
    
}
