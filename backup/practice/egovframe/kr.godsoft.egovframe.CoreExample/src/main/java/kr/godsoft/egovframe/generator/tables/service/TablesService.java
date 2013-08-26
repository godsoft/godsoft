package kr.godsoft.egovframe.generator.tables.service;

import java.util.List;
import kr.godsoft.egovframe.generator.tables.service.TablesDefaultVO;
import kr.godsoft.egovframe.generator.tables.service.TablesVO;

/**
 * @Class Name : TablesService.java
 * @Description : Tables Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-01-25
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface TablesService {
	
	/**
	 * TABLES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 TablesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertTables(TablesVO vo) throws Exception;
    
    /**
	 * TABLES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 TablesVO
	 * @return void형
	 * @exception Exception
	 */
    void updateTables(TablesVO vo) throws Exception;
    
    /**
	 * TABLES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 TablesVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteTables(TablesVO vo) throws Exception;
    
    /**
	 * TABLES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 TablesVO
	 * @return 조회한 TABLES
	 * @exception Exception
	 */
    TablesVO selectTables(TablesVO vo) throws Exception;
    
    /**
	 * TABLES 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return TABLES 목록
	 * @exception Exception
	 */
    List selectTablesList(TablesDefaultVO searchVO) throws Exception;
    
    /**
	 * TABLES 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return TABLES 총 갯수
	 * @exception
	 */
    int selectTablesListTotCnt(TablesDefaultVO searchVO);
    
}
