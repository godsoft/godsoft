package kr.godsoft.egovframe.generatorwebapp.md_index_details.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_index_details.service.MdIndexDetailsService;
import kr.godsoft.egovframe.generatorwebapp.md_index_details.service.MdIndexDetailsVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : MdIndexDetailsServiceImpl.java
 * @Description : MdIndexDetails Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("mdIndexDetailsService")
public class MdIndexDetailsServiceImpl extends AbstractServiceImpl implements
        MdIndexDetailsService {

    @Resource(name="mdIndexDetailsDAO")
    private MdIndexDetailsDAO mdIndexDetailsDAO;
    
    /** ID Generation */
    //@Resource(name="{egovMdIndexDetailsIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * MD_INDEX_DETAILS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdIndexDetailsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdIndexDetails(MdIndexDetailsVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	mdIndexDetailsDAO.insertMdIndexDetails(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * MD_INDEX_DETAILS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdIndexDetailsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdIndexDetails(MdIndexDetailsVO vo) throws Exception {
        mdIndexDetailsDAO.updateMdIndexDetails(vo);
    }

    /**
	 * MD_INDEX_DETAILS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdIndexDetailsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdIndexDetails(MdIndexDetailsVO vo) throws Exception {
        mdIndexDetailsDAO.deleteMdIndexDetails(vo);
    }

    /**
	 * MD_INDEX_DETAILS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdIndexDetailsVO
	 * @return 조회한 MD_INDEX_DETAILS
	 * @exception Exception
	 */
    public MdIndexDetailsVO selectMdIndexDetails(MdIndexDetailsVO vo) throws Exception {
        MdIndexDetailsVO resultVO = mdIndexDetailsDAO.selectMdIndexDetails(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * MD_INDEX_DETAILS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_INDEX_DETAILS 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectMdIndexDetailsList(MdIndexDetailsVO vo) throws Exception {
        return mdIndexDetailsDAO.selectMdIndexDetailsList(vo);
    }

    /**
	 * MD_INDEX_DETAILS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_INDEX_DETAILS 총 갯수
	 * @exception
	 */
    public int selectMdIndexDetailsListTotCnt(MdIndexDetailsVO vo) {
		return mdIndexDetailsDAO.selectMdIndexDetailsListTotCnt(vo);
	}
    
}
