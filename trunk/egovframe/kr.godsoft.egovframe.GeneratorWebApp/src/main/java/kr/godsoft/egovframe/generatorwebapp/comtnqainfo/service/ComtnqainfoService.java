package kr.godsoft.egovframe.generatorwebapp.comtnqainfo.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnqainfo.service.ComtnqainfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnqainfo.service.ComtnqainfoVO;

/**
 * @Class Name : ComtnqainfoService.java
 * @Description : Comtnqainfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnqainfoService {
	
	/**
	 * comtnqainfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnqainfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnqainfo(ComtnqainfoVO vo) throws Exception;
    
    /**
	 * comtnqainfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnqainfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnqainfo(ComtnqainfoVO vo) throws Exception;
    
    /**
	 * comtnqainfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnqainfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnqainfo(ComtnqainfoVO vo) throws Exception;
    
    /**
	 * comtnqainfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnqainfoVO
	 * @return 조회한 comtnqainfo
	 * @exception Exception
	 */
    ComtnqainfoVO selectComtnqainfo(ComtnqainfoVO vo) throws Exception;
    
    /**
	 * comtnqainfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnqainfo 목록
	 * @exception Exception
	 */
    List selectComtnqainfoList(ComtnqainfoDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnqainfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnqainfo 총 갯수
	 * @exception
	 */
    int selectComtnqainfoListTotCnt(ComtnqainfoDefaultVO searchVO);
    
}
