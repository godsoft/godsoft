package kr.godsoft.egovframe.generatorwebapp.migration_reserved_words.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MigrationReservedWordsService.java
 * @Description : MigrationReservedWords Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MigrationReservedWordsService {
	
	/**
	 * MIGRATION_RESERVED_WORDS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MigrationReservedWordsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMigrationReservedWords(MigrationReservedWordsVO vo) throws Exception;
    
    /**
	 * MIGRATION_RESERVED_WORDS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MigrationReservedWordsVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMigrationReservedWords(MigrationReservedWordsVO vo) throws Exception;
    
    /**
	 * MIGRATION_RESERVED_WORDS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MigrationReservedWordsVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMigrationReservedWords(MigrationReservedWordsVO vo) throws Exception;
    
    /**
	 * MIGRATION_RESERVED_WORDS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MigrationReservedWordsVO
	 * @return 조회한 MIGRATION_RESERVED_WORDS
	 * @exception Exception
	 */
    MigrationReservedWordsVO selectMigrationReservedWords(MigrationReservedWordsVO vo) throws Exception;
    
    /**
	 * MIGRATION_RESERVED_WORDS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MIGRATION_RESERVED_WORDS 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMigrationReservedWordsList(MigrationReservedWordsVO vo) throws Exception;
    
    /**
	 * MIGRATION_RESERVED_WORDS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MIGRATION_RESERVED_WORDS 총 갯수
	 * @exception
	 */
    int selectMigrationReservedWordsListTotCnt(MigrationReservedWordsVO vo);
    
}
