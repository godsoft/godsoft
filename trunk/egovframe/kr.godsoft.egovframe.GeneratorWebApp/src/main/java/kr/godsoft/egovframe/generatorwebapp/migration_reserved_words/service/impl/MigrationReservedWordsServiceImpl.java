package kr.godsoft.egovframe.generatorwebapp.migration_reserved_words.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.migration_reserved_words.service.MigrationReservedWordsService;
import kr.godsoft.egovframe.generatorwebapp.migration_reserved_words.service.MigrationReservedWordsVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : MigrationReservedWordsServiceImpl.java
 * @Description : MigrationReservedWords Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("migrationReservedWordsService")
public class MigrationReservedWordsServiceImpl extends AbstractServiceImpl implements
        MigrationReservedWordsService {

    @Resource(name="migrationReservedWordsDAO")
    private MigrationReservedWordsDAO migrationReservedWordsDAO;
    
    /** ID Generation */
    //@Resource(name="{egovMigrationReservedWordsIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * MIGRATION_RESERVED_WORDS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MigrationReservedWordsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMigrationReservedWords(MigrationReservedWordsVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	migrationReservedWordsDAO.insertMigrationReservedWords(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * MIGRATION_RESERVED_WORDS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MigrationReservedWordsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMigrationReservedWords(MigrationReservedWordsVO vo) throws Exception {
        migrationReservedWordsDAO.updateMigrationReservedWords(vo);
    }

    /**
	 * MIGRATION_RESERVED_WORDS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MigrationReservedWordsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMigrationReservedWords(MigrationReservedWordsVO vo) throws Exception {
        migrationReservedWordsDAO.deleteMigrationReservedWords(vo);
    }

    /**
	 * MIGRATION_RESERVED_WORDS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MigrationReservedWordsVO
	 * @return 조회한 MIGRATION_RESERVED_WORDS
	 * @exception Exception
	 */
    public MigrationReservedWordsVO selectMigrationReservedWords(MigrationReservedWordsVO vo) throws Exception {
        MigrationReservedWordsVO resultVO = migrationReservedWordsDAO.selectMigrationReservedWords(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * MIGRATION_RESERVED_WORDS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MIGRATION_RESERVED_WORDS 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectMigrationReservedWordsList(MigrationReservedWordsVO vo) throws Exception {
        return migrationReservedWordsDAO.selectMigrationReservedWordsList(vo);
    }

    /**
	 * MIGRATION_RESERVED_WORDS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MIGRATION_RESERVED_WORDS 총 갯수
	 * @exception
	 */
    public int selectMigrationReservedWordsListTotCnt(MigrationReservedWordsVO vo) {
		return migrationReservedWordsDAO.selectMigrationReservedWordsListTotCnt(vo);
	}
    
}
