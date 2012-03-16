package kr.godsoft.egovframe.generatorwebapp.comtnloginscrinimage.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnloginscrinimageService.java
 * @Description : Comtnloginscrinimage Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnloginscrinimageService {
	
	/**
	 * comtnloginscrinimage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnloginscrinimageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnloginscrinimage(ComtnloginscrinimageVO vo) throws Exception;
    
    /**
	 * comtnloginscrinimage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnloginscrinimageVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnloginscrinimage(ComtnloginscrinimageVO vo) throws Exception;
    
    /**
	 * comtnloginscrinimage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnloginscrinimageVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnloginscrinimage(ComtnloginscrinimageVO vo) throws Exception;
    
    /**
	 * comtnloginscrinimage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnloginscrinimageVO
	 * @return 조회한 comtnloginscrinimage
	 * @exception Exception
	 */
    ComtnloginscrinimageVO selectComtnloginscrinimage(ComtnloginscrinimageVO vo) throws Exception;
    
    /**
	 * comtnloginscrinimage 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnloginscrinimage 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnloginscrinimageList(ComtnloginscrinimageVO vo) throws Exception;
    
    /**
	 * comtnloginscrinimage 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnloginscrinimage 총 갯수
	 * @exception
	 */
    int selectComtnloginscrinimageListTotCnt(ComtnloginscrinimageVO vo);
    
}
