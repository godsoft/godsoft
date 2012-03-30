package kr.godsoft.egovframe.generatorwebapp.md_triggers.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MdTriggersService.java
 * @Description : MdTriggers Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MdTriggersService {
	
	/**
	 * MD_TRIGGERS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdTriggersVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMdTriggers(MdTriggersVO vo) throws Exception;
    
    /**
	 * MD_TRIGGERS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdTriggersVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMdTriggers(MdTriggersVO vo) throws Exception;
    
    /**
	 * MD_TRIGGERS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdTriggersVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMdTriggers(MdTriggersVO vo) throws Exception;
    
    /**
	 * MD_TRIGGERS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdTriggersVO
	 * @return 조회한 MD_TRIGGERS
	 * @exception Exception
	 */
    MdTriggersVO selectMdTriggers(MdTriggersVO vo) throws Exception;
    
    /**
	 * MD_TRIGGERS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_TRIGGERS 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMdTriggersList(MdTriggersVO vo) throws Exception;
    
    /**
	 * MD_TRIGGERS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_TRIGGERS 총 갯수
	 * @exception
	 */
    int selectMdTriggersListTotCnt(MdTriggersVO vo);
    
}
