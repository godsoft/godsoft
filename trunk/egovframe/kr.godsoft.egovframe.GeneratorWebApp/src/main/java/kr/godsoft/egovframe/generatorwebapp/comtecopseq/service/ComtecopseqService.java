package kr.godsoft.egovframe.generatorwebapp.comtecopseq.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtecopseqService.java
 * @Description : Comtecopseq Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtecopseqService {
	
	/**
	 * comtecopseq을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtecopseqVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtecopseq(ComtecopseqVO vo) throws Exception;
    
    /**
	 * comtecopseq을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtecopseqVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtecopseq(ComtecopseqVO vo) throws Exception;
    
    /**
	 * comtecopseq을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtecopseqVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtecopseq(ComtecopseqVO vo) throws Exception;
    
    /**
	 * comtecopseq을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtecopseqVO
	 * @return 조회한 comtecopseq
	 * @exception Exception
	 */
    ComtecopseqVO selectComtecopseq(ComtecopseqVO vo) throws Exception;
    
    /**
	 * comtecopseq 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtecopseq 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtecopseqList(ComtecopseqVO vo) throws Exception;
    
    /**
	 * comtecopseq 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtecopseq 총 갯수
	 * @exception
	 */
    int selectComtecopseqListTotCnt(ComtecopseqVO vo);
    
}
