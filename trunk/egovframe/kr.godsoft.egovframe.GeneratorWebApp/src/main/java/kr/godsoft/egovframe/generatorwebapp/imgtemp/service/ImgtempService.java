package kr.godsoft.egovframe.generatorwebapp.imgtemp.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ImgtempService.java
 * @Description : Imgtemp Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ImgtempService {
	
	/**
	 * imgtemp을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ImgtempVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertImgtemp(ImgtempVO vo) throws Exception;
    
    /**
	 * imgtemp을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ImgtempVO
	 * @return void형
	 * @exception Exception
	 */
    void updateImgtemp(ImgtempVO vo) throws Exception;
    
    /**
	 * imgtemp을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ImgtempVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteImgtemp(ImgtempVO vo) throws Exception;
    
    /**
	 * imgtemp을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ImgtempVO
	 * @return 조회한 imgtemp
	 * @exception Exception
	 */
    ImgtempVO selectImgtemp(ImgtempVO vo) throws Exception;
    
    /**
	 * imgtemp 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return imgtemp 목록
	 * @exception Exception
	 */
    List<EgovMap> selectImgtempList(ImgtempVO vo) throws Exception;
    
    /**
	 * imgtemp 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return imgtemp 총 갯수
	 * @exception
	 */
    int selectImgtempListTotCnt(ImgtempVO vo);
    
}
