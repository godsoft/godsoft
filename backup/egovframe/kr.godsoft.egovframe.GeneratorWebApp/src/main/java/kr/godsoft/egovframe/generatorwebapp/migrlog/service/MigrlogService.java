package kr.godsoft.egovframe.generatorwebapp.migrlog.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MigrlogService.java
 * @Description : Migrlog Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MigrlogService {
	
	/**
	 * MIGRLOG을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MigrlogVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMigrlog(MigrlogVO vo) throws Exception;
    
    /**
	 * MIGRLOG을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MigrlogVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMigrlog(MigrlogVO vo) throws Exception;
    
    /**
	 * MIGRLOG을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MigrlogVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMigrlog(MigrlogVO vo) throws Exception;
    
    /**
	 * MIGRLOG을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MigrlogVO
	 * @return 조회한 MIGRLOG
	 * @exception Exception
	 */
    MigrlogVO selectMigrlog(MigrlogVO vo) throws Exception;
    
    /**
	 * MIGRLOG 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MIGRLOG 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMigrlogList(MigrlogVO vo) throws Exception;
    
    /**
	 * MIGRLOG 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MIGRLOG 총 갯수
	 * @exception
	 */
    int selectMigrlogListTotCnt(MigrlogVO vo);
    
}
