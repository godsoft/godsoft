package kr.godsoft.egovframework.generator.tables.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframework.generator.tables.service.TablesDefaultVO;
import kr.godsoft.egovframework.generator.tables.service.TablesService;
import kr.godsoft.egovframework.generator.tables.service.TablesVO;
import kr.godsoft.egovframework.generator.tables.service.impl.TablesDAO;

/**
 * @Class Name : TablesServiceImpl.java
 * @Description : Tables Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-01-22
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("tablesService")
public class TablesServiceImpl extends AbstractServiceImpl implements
        TablesService {

    @Resource(name="tablesDAO")
    private TablesDAO tablesDAO;
    
    /** ID Generation */
    //@Resource(name="{egovTablesIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * TABLES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 TablesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertTables(TablesVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	tablesDAO.insertTables(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * TABLES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 TablesVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateTables(TablesVO vo) throws Exception {
        tablesDAO.updateTables(vo);
    }

    /**
	 * TABLES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 TablesVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteTables(TablesVO vo) throws Exception {
        tablesDAO.deleteTables(vo);
    }

    /**
	 * TABLES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 TablesVO
	 * @return 조회한 TABLES
	 * @exception Exception
	 */
    public TablesVO selectTables(TablesVO vo) throws Exception {
        TablesVO resultVO = tablesDAO.selectTables(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * TABLES 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return TABLES 목록
	 * @exception Exception
	 */
    public List selectTablesList(TablesDefaultVO searchVO) throws Exception {
        return tablesDAO.selectTablesList(searchVO);
    }

    /**
	 * TABLES 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return TABLES 총 갯수
	 * @exception
	 */
    public int selectTablesListTotCnt(TablesDefaultVO searchVO) {
		return tablesDAO.selectTablesListTotCnt(searchVO);
	}
    
}
