package kr.godsoft.egovframe.generatorwebapp.md_sequences.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MdSequencesService.java
 * @Description : MdSequences Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MdSequencesService {
	
	/**
	 * MD_SEQUENCES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdSequencesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMdSequences(MdSequencesVO vo) throws Exception;
    
    /**
	 * MD_SEQUENCES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdSequencesVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMdSequences(MdSequencesVO vo) throws Exception;
    
    /**
	 * MD_SEQUENCES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdSequencesVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMdSequences(MdSequencesVO vo) throws Exception;
    
    /**
	 * MD_SEQUENCES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdSequencesVO
	 * @return 조회한 MD_SEQUENCES
	 * @exception Exception
	 */
    MdSequencesVO selectMdSequences(MdSequencesVO vo) throws Exception;
    
    /**
	 * MD_SEQUENCES 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_SEQUENCES 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMdSequencesList(MdSequencesVO vo) throws Exception;
    
    /**
	 * MD_SEQUENCES 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_SEQUENCES 총 갯수
	 * @exception
	 */
    int selectMdSequencesListTotCnt(MdSequencesVO vo);
    
}
