package kr.godsoft.egovframe.generatorwebapp.md_columns.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_columns.service.MdColumnsService;
import kr.godsoft.egovframe.generatorwebapp.md_columns.service.MdColumnsVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : MdColumnsServiceImpl.java
 * @Description : MdColumns Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("mdColumnsService")
public class MdColumnsServiceImpl extends AbstractServiceImpl implements
        MdColumnsService {

    @Resource(name="mdColumnsDAO")
    private MdColumnsDAO mdColumnsDAO;
    
    /** ID Generation */
    //@Resource(name="{egovMdColumnsIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * MD_COLUMNS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdColumnsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdColumns(MdColumnsVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	mdColumnsDAO.insertMdColumns(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * MD_COLUMNS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdColumnsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdColumns(MdColumnsVO vo) throws Exception {
        mdColumnsDAO.updateMdColumns(vo);
    }

    /**
	 * MD_COLUMNS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdColumnsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdColumns(MdColumnsVO vo) throws Exception {
        mdColumnsDAO.deleteMdColumns(vo);
    }

    /**
	 * MD_COLUMNS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdColumnsVO
	 * @return 조회한 MD_COLUMNS
	 * @exception Exception
	 */
    public MdColumnsVO selectMdColumns(MdColumnsVO vo) throws Exception {
        MdColumnsVO resultVO = mdColumnsDAO.selectMdColumns(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * MD_COLUMNS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_COLUMNS 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectMdColumnsList(MdColumnsVO vo) throws Exception {
        return mdColumnsDAO.selectMdColumnsList(vo);
    }

    /**
	 * MD_COLUMNS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_COLUMNS 총 갯수
	 * @exception
	 */
    public int selectMdColumnsListTotCnt(MdColumnsVO vo) {
		return mdColumnsDAO.selectMdColumnsListTotCnt(vo);
	}
    
}
