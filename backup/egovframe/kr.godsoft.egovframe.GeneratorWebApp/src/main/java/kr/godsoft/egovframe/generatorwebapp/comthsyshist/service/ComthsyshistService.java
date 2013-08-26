package kr.godsoft.egovframe.generatorwebapp.comthsyshist.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComthsyshistService.java
 * @Description : Comthsyshist Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComthsyshistService {
	
	/**
	 * COMTHSYSHIST을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComthsyshistVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComthsyshist(ComthsyshistVO vo) throws Exception;
    
    /**
	 * COMTHSYSHIST을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComthsyshistVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComthsyshist(ComthsyshistVO vo) throws Exception;
    
    /**
	 * COMTHSYSHIST을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComthsyshistVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComthsyshist(ComthsyshistVO vo) throws Exception;
    
    /**
	 * COMTHSYSHIST을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComthsyshistVO
	 * @return 조회한 COMTHSYSHIST
	 * @exception Exception
	 */
    ComthsyshistVO selectComthsyshist(ComthsyshistVO vo) throws Exception;
    
    /**
	 * COMTHSYSHIST 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTHSYSHIST 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComthsyshistList(ComthsyshistVO vo) throws Exception;
    
    /**
	 * COMTHSYSHIST 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTHSYSHIST 총 갯수
	 * @exception
	 */
    int selectComthsyshistListTotCnt(ComthsyshistVO vo);
    
}
