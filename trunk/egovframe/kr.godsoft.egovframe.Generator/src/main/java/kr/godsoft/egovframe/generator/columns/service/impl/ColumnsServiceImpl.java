package kr.godsoft.egovframe.generator.columns.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generator.columns.service.ColumnsService;
import kr.godsoft.egovframe.generator.columns.service.ColumnsDefaultVO;
import kr.godsoft.egovframe.generator.columns.service.ColumnsVO;
import kr.godsoft.egovframe.generator.columns.service.impl.ColumnsDAO;

/**
 * @Class Name : ColumnsServiceImpl.java
 * @Description : Columns Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-02-01
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("columnsService")
public class ColumnsServiceImpl extends AbstractServiceImpl implements
        ColumnsService {

    @Resource(name="columnsDAO")
    private ColumnsDAO columnsDAO;
    
    /** ID Generation */
    //@Resource(name="{egovColumnsIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COLUMNS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ColumnsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertColumns(ColumnsVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	columnsDAO.insertColumns(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COLUMNS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ColumnsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateColumns(ColumnsVO vo) throws Exception {
        columnsDAO.updateColumns(vo);
    }

    /**
	 * COLUMNS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ColumnsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteColumns(ColumnsVO vo) throws Exception {
        columnsDAO.deleteColumns(vo);
    }

    /**
	 * COLUMNS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ColumnsVO
	 * @return 조회한 COLUMNS
	 * @exception Exception
	 */
    public ColumnsVO selectColumns(ColumnsVO vo) throws Exception {
        ColumnsVO resultVO = columnsDAO.selectColumns(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COLUMNS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COLUMNS 목록
	 * @exception Exception
	 */
    public List selectColumnsList(ColumnsDefaultVO searchVO) throws Exception {
        return columnsDAO.selectColumnsList(searchVO);
    }

    /**
	 * COLUMNS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COLUMNS 총 갯수
	 * @exception
	 */
    public int selectColumnsListTotCnt(ColumnsDefaultVO searchVO) {
		return columnsDAO.selectColumnsListTotCnt(searchVO);
	}
    
}
