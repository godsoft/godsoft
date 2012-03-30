package kr.godsoft.egovframe.generatorwebapp.md_tables.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_tables.service.MdTablesService;
import kr.godsoft.egovframe.generatorwebapp.md_tables.service.MdTablesVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : MdTablesServiceImpl.java
 * @Description : MdTables Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("mdTablesService")
public class MdTablesServiceImpl extends AbstractServiceImpl implements
        MdTablesService {

    @Resource(name="mdTablesDAO")
    private MdTablesDAO mdTablesDAO;
    
    /** ID Generation */
    //@Resource(name="{egovMdTablesIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * MD_TABLES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdTablesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdTables(MdTablesVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	mdTablesDAO.insertMdTables(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * MD_TABLES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdTablesVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdTables(MdTablesVO vo) throws Exception {
        mdTablesDAO.updateMdTables(vo);
    }

    /**
	 * MD_TABLES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdTablesVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdTables(MdTablesVO vo) throws Exception {
        mdTablesDAO.deleteMdTables(vo);
    }

    /**
	 * MD_TABLES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdTablesVO
	 * @return 조회한 MD_TABLES
	 * @exception Exception
	 */
    public MdTablesVO selectMdTables(MdTablesVO vo) throws Exception {
        MdTablesVO resultVO = mdTablesDAO.selectMdTables(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * MD_TABLES 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_TABLES 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectMdTablesList(MdTablesVO vo) throws Exception {
        return mdTablesDAO.selectMdTablesList(vo);
    }

    /**
	 * MD_TABLES 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_TABLES 총 갯수
	 * @exception
	 */
    public int selectMdTablesListTotCnt(MdTablesVO vo) {
		return mdTablesDAO.selectMdTablesListTotCnt(vo);
	}
    
}
