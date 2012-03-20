package kr.godsoft.egovframe.generatorwebapp.comtnleaderschdul.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnleaderschdulService.java
 * @Description : Comtnleaderschdul Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnleaderschdulService {
	
	/**
	 * comtnleaderschdul을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnleaderschdulVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnleaderschdul(ComtnleaderschdulVO vo) throws Exception;
    
    /**
	 * comtnleaderschdul을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnleaderschdulVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnleaderschdul(ComtnleaderschdulVO vo) throws Exception;
    
    /**
	 * comtnleaderschdul을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnleaderschdulVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnleaderschdul(ComtnleaderschdulVO vo) throws Exception;
    
    /**
	 * comtnleaderschdul을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnleaderschdulVO
	 * @return 조회한 comtnleaderschdul
	 * @exception Exception
	 */
    ComtnleaderschdulVO selectComtnleaderschdul(ComtnleaderschdulVO vo) throws Exception;
    
    /**
	 * comtnleaderschdul 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnleaderschdul 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnleaderschdulList(ComtnleaderschdulVO vo) throws Exception;
    
    /**
	 * comtnleaderschdul 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnleaderschdul 총 갯수
	 * @exception
	 */
    int selectComtnleaderschdulListTotCnt(ComtnleaderschdulVO vo);
    
}
