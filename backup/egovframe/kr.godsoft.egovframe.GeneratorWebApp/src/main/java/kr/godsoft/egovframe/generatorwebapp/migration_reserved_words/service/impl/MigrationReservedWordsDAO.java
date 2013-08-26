package kr.godsoft.egovframe.generatorwebapp.migration_reserved_words.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.migration_reserved_words.service.MigrationReservedWordsVO;

/**
 * @Class Name : MigrationReservedWordsDAO.java
 * @Description : MigrationReservedWords DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("migrationReservedWordsDAO")
public class MigrationReservedWordsDAO extends EgovAbstractDAO {

	/**
	 * MIGRATION_RESERVED_WORDS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MigrationReservedWordsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMigrationReservedWords(MigrationReservedWordsVO vo) throws Exception {
        return (String)insert("migrationReservedWordsDAO.insertMigrationReservedWords_S", vo);
    }

    /**
	 * MIGRATION_RESERVED_WORDS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MigrationReservedWordsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMigrationReservedWords(MigrationReservedWordsVO vo) throws Exception {
        update("migrationReservedWordsDAO.updateMigrationReservedWords_S", vo);
    }

    /**
	 * MIGRATION_RESERVED_WORDS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MigrationReservedWordsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMigrationReservedWords(MigrationReservedWordsVO vo) throws Exception {
        delete("migrationReservedWordsDAO.deleteMigrationReservedWords_S", vo);
    }

    /**
	 * MIGRATION_RESERVED_WORDS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MigrationReservedWordsVO
	 * @return 조회한 MIGRATION_RESERVED_WORDS
	 * @exception Exception
	 */
    public MigrationReservedWordsVO selectMigrationReservedWords(MigrationReservedWordsVO vo) throws Exception {
        return (MigrationReservedWordsVO) selectByPk("migrationReservedWordsDAO.selectMigrationReservedWords_S", vo);
    }

    /**
	 * MIGRATION_RESERVED_WORDS 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MIGRATION_RESERVED_WORDS 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMigrationReservedWordsList(MigrationReservedWordsVO vo) throws Exception {
        return list("migrationReservedWordsDAO.selectMigrationReservedWordsList_D", vo);
    }

    /**
	 * MIGRATION_RESERVED_WORDS 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MIGRATION_RESERVED_WORDS 총 갯수
	 * @exception
	 */
    public int selectMigrationReservedWordsListTotCnt(MigrationReservedWordsVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("migrationReservedWordsDAO.selectMigrationReservedWordsListTotCnt_S", vo);
    }

}
