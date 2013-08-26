package kr.godsoft.egovframe.generatorwebapp.comtecopseq.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtecopseqService.java
 * @Description : Comtecopseq Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtecopseqService {
	
	/**
	 * COMTECOPSEQ을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtecopseqVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtecopseq(ComtecopseqVO vo) throws Exception;
    
    /**
	 * COMTECOPSEQ을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtecopseqVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtecopseq(ComtecopseqVO vo) throws Exception;
    
    /**
	 * COMTECOPSEQ을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtecopseqVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtecopseq(ComtecopseqVO vo) throws Exception;
    
    /**
	 * COMTECOPSEQ을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtecopseqVO
	 * @return 조회한 COMTECOPSEQ
	 * @exception Exception
	 */
    ComtecopseqVO selectComtecopseq(ComtecopseqVO vo) throws Exception;
    
    /**
	 * COMTECOPSEQ 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTECOPSEQ 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtecopseqList(ComtecopseqVO vo) throws Exception;
    
    /**
	 * COMTECOPSEQ 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTECOPSEQ 총 갯수
	 * @exception
	 */
    int selectComtecopseqListTotCnt(ComtecopseqVO vo);
    
}
