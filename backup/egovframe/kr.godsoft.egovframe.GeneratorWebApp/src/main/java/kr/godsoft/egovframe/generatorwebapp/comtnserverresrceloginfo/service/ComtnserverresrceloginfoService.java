package kr.godsoft.egovframe.generatorwebapp.comtnserverresrceloginfo.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnserverresrceloginfoService.java
 * @Description : Comtnserverresrceloginfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnserverresrceloginfoService {
	
	/**
	 * COMTNSERVERRESRCELOGINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnserverresrceloginfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnserverresrceloginfo(ComtnserverresrceloginfoVO vo) throws Exception;
    
    /**
	 * COMTNSERVERRESRCELOGINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnserverresrceloginfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnserverresrceloginfo(ComtnserverresrceloginfoVO vo) throws Exception;
    
    /**
	 * COMTNSERVERRESRCELOGINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnserverresrceloginfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnserverresrceloginfo(ComtnserverresrceloginfoVO vo) throws Exception;
    
    /**
	 * COMTNSERVERRESRCELOGINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnserverresrceloginfoVO
	 * @return 조회한 COMTNSERVERRESRCELOGINFO
	 * @exception Exception
	 */
    ComtnserverresrceloginfoVO selectComtnserverresrceloginfo(ComtnserverresrceloginfoVO vo) throws Exception;
    
    /**
	 * COMTNSERVERRESRCELOGINFO 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNSERVERRESRCELOGINFO 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnserverresrceloginfoList(ComtnserverresrceloginfoVO vo) throws Exception;
    
    /**
	 * COMTNSERVERRESRCELOGINFO 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNSERVERRESRCELOGINFO 총 갯수
	 * @exception
	 */
    int selectComtnserverresrceloginfoListTotCnt(ComtnserverresrceloginfoVO vo);
    
}
