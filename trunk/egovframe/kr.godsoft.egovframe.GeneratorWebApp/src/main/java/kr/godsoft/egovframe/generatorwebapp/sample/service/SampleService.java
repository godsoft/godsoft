package kr.godsoft.egovframe.generatorwebapp.sample.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : SampleService.java
 * @Description : Sample Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface SampleService {
	
	/**
	 * sample을 등록한다.
	 * @param vo - 등록할 정보가 담긴 SampleVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertSample(SampleVO vo) throws Exception;
    
    /**
	 * sample을 수정한다.
	 * @param vo - 수정할 정보가 담긴 SampleVO
	 * @return void형
	 * @exception Exception
	 */
    void updateSample(SampleVO vo) throws Exception;
    
    /**
	 * sample을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 SampleVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteSample(SampleVO vo) throws Exception;
    
    /**
	 * sample을 조회한다.
	 * @param vo - 조회할 정보가 담긴 SampleVO
	 * @return 조회한 sample
	 * @exception Exception
	 */
    SampleVO selectSample(SampleVO vo) throws Exception;
    
    /**
	 * sample 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return sample 목록
	 * @exception Exception
	 */
    List<EgovMap> selectSampleList(SampleVO vo) throws Exception;
    
    /**
	 * sample 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return sample 총 갯수
	 * @exception
	 */
    int selectSampleListTotCnt(SampleVO vo);
    
}
