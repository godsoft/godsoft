package kr.godsoft.egovframe.generatorwebapp.ids.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.ids.service.IdsService;
import kr.godsoft.egovframe.generatorwebapp.ids.service.IdsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.ids.service.IdsVO;
import kr.godsoft.egovframe.generatorwebapp.ids.service.impl.IdsDAO;

/**
 * @Class Name : IdsServiceImpl.java
 * @Description : Ids Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("idsService")
public class IdsServiceImpl extends AbstractServiceImpl implements
        IdsService {

    @Resource(name="idsDAO")
    private IdsDAO idsDAO;
    
    /** ID Generation */
    //@Resource(name="{egovIdsIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * ids을 등록한다.
	 * @param vo - 등록할 정보가 담긴 IdsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertIds(IdsVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	idsDAO.insertIds(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * ids을 수정한다.
	 * @param vo - 수정할 정보가 담긴 IdsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateIds(IdsVO vo) throws Exception {
        idsDAO.updateIds(vo);
    }

    /**
	 * ids을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 IdsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteIds(IdsVO vo) throws Exception {
        idsDAO.deleteIds(vo);
    }

    /**
	 * ids을 조회한다.
	 * @param vo - 조회할 정보가 담긴 IdsVO
	 * @return 조회한 ids
	 * @exception Exception
	 */
    public IdsVO selectIds(IdsVO vo) throws Exception {
        IdsVO resultVO = idsDAO.selectIds(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * ids 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return ids 목록
	 * @exception Exception
	 */
    public List selectIdsList(IdsDefaultVO searchVO) throws Exception {
        return idsDAO.selectIdsList(searchVO);
    }

    /**
	 * ids 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return ids 총 갯수
	 * @exception
	 */
    public int selectIdsListTotCnt(IdsDefaultVO searchVO) {
		return idsDAO.selectIdsListTotCnt(searchVO);
	}
    
}