package kr.godsoft.egovframe.generatorwebapp.comtnmainimage.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnmainimage.service.ComtnmainimageDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnmainimage.service.ComtnmainimageVO;

/**
 * @Class Name : ComtnmainimageService.java
 * @Description : Comtnmainimage Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnmainimageService {
	
	/**
	 * comtnmainimage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnmainimageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnmainimage(ComtnmainimageVO vo) throws Exception;
    
    /**
	 * comtnmainimage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnmainimageVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnmainimage(ComtnmainimageVO vo) throws Exception;
    
    /**
	 * comtnmainimage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnmainimageVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnmainimage(ComtnmainimageVO vo) throws Exception;
    
    /**
	 * comtnmainimage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnmainimageVO
	 * @return 조회한 comtnmainimage
	 * @exception Exception
	 */
    ComtnmainimageVO selectComtnmainimage(ComtnmainimageVO vo) throws Exception;
    
    /**
	 * comtnmainimage 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnmainimage 목록
	 * @exception Exception
	 */
    List selectComtnmainimageList(ComtnmainimageDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnmainimage 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnmainimage 총 갯수
	 * @exception
	 */
    int selectComtnmainimageListTotCnt(ComtnmainimageDefaultVO searchVO);
    
}
