package kr.godsoft.egovframe.generatorwebapp.md_indexes.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_indexes.service.MdIndexesService;
import kr.godsoft.egovframe.generatorwebapp.md_indexes.service.MdIndexesVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : MdIndexesServiceImpl.java
 * @Description : MdIndexes Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("mdIndexesService")
public class MdIndexesServiceImpl extends AbstractServiceImpl implements
        MdIndexesService {

    @Resource(name="mdIndexesDAO")
    private MdIndexesDAO mdIndexesDAO;
    
    /** ID Generation */
    //@Resource(name="{egovMdIndexesIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * MD_INDEXES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdIndexesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdIndexes(MdIndexesVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	mdIndexesDAO.insertMdIndexes(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * MD_INDEXES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdIndexesVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdIndexes(MdIndexesVO vo) throws Exception {
        mdIndexesDAO.updateMdIndexes(vo);
    }

    /**
	 * MD_INDEXES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdIndexesVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdIndexes(MdIndexesVO vo) throws Exception {
        mdIndexesDAO.deleteMdIndexes(vo);
    }

    /**
	 * MD_INDEXES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdIndexesVO
	 * @return 조회한 MD_INDEXES
	 * @exception Exception
	 */
    public MdIndexesVO selectMdIndexes(MdIndexesVO vo) throws Exception {
        MdIndexesVO resultVO = mdIndexesDAO.selectMdIndexes(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * MD_INDEXES 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_INDEXES 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectMdIndexesList(MdIndexesVO vo) throws Exception {
        return mdIndexesDAO.selectMdIndexesList(vo);
    }

    /**
	 * MD_INDEXES 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_INDEXES 총 갯수
	 * @exception
	 */
    public int selectMdIndexesListTotCnt(MdIndexesVO vo) {
		return mdIndexesDAO.selectMdIndexesListTotCnt(vo);
	}
    
}
