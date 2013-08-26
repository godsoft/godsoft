package kr.godsoft.egovframe.generatorwebapp.mgv_all_tables.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.mgv_all_tables.service.MgvAllTablesService;
import kr.godsoft.egovframe.generatorwebapp.mgv_all_tables.service.MgvAllTablesVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : MgvAllTablesServiceImpl.java
 * @Description : MgvAllTables Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("mgvAllTablesService")
public class MgvAllTablesServiceImpl extends AbstractServiceImpl implements
        MgvAllTablesService {

    @Resource(name="mgvAllTablesDAO")
    private MgvAllTablesDAO mgvAllTablesDAO;
    
    /** ID Generation */
    //@Resource(name="{egovMgvAllTablesIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * MGV_ALL_TABLES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MgvAllTablesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMgvAllTables(MgvAllTablesVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	mgvAllTablesDAO.insertMgvAllTables(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * MGV_ALL_TABLES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MgvAllTablesVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMgvAllTables(MgvAllTablesVO vo) throws Exception {
        mgvAllTablesDAO.updateMgvAllTables(vo);
    }

    /**
	 * MGV_ALL_TABLES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MgvAllTablesVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMgvAllTables(MgvAllTablesVO vo) throws Exception {
        mgvAllTablesDAO.deleteMgvAllTables(vo);
    }

    /**
	 * MGV_ALL_TABLES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MgvAllTablesVO
	 * @return 조회한 MGV_ALL_TABLES
	 * @exception Exception
	 */
    public MgvAllTablesVO selectMgvAllTables(MgvAllTablesVO vo) throws Exception {
        MgvAllTablesVO resultVO = mgvAllTablesDAO.selectMgvAllTables(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * MGV_ALL_TABLES 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MGV_ALL_TABLES 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectMgvAllTablesList(MgvAllTablesVO vo) throws Exception {
        return mgvAllTablesDAO.selectMgvAllTablesList(vo);
    }

    /**
	 * MGV_ALL_TABLES 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MGV_ALL_TABLES 총 갯수
	 * @exception
	 */
    public int selectMgvAllTablesListTotCnt(MgvAllTablesVO vo) {
		return mgvAllTablesDAO.selectMgvAllTablesListTotCnt(vo);
	}
    
}
