package kr.godsoft.egovframe.generatorwebapp.comtnunitylink.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnunitylinkService.java
 * @Description : Comtnunitylink Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnunitylinkService {
	
	/**
	 * comtnunitylink을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnunitylinkVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnunitylink(ComtnunitylinkVO vo) throws Exception;
    
    /**
	 * comtnunitylink을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnunitylinkVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnunitylink(ComtnunitylinkVO vo) throws Exception;
    
    /**
	 * comtnunitylink을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnunitylinkVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnunitylink(ComtnunitylinkVO vo) throws Exception;
    
    /**
	 * comtnunitylink을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnunitylinkVO
	 * @return 조회한 comtnunitylink
	 * @exception Exception
	 */
    ComtnunitylinkVO selectComtnunitylink(ComtnunitylinkVO vo) throws Exception;
    
    /**
	 * comtnunitylink 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnunitylink 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnunitylinkList(ComtnunitylinkVO vo) throws Exception;
    
    /**
	 * comtnunitylink 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnunitylink 총 갯수
	 * @exception
	 */
    int selectComtnunitylinkListTotCnt(ComtnunitylinkVO vo);
    
}
