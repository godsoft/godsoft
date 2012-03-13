package kr.godsoft.egovframe.generatorwebapp.comtnncrd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnncrd.service.ComtnncrdService;
import kr.godsoft.egovframe.generatorwebapp.comtnncrd.service.ComtnncrdDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnncrd.service.ComtnncrdVO;
import kr.godsoft.egovframe.generatorwebapp.comtnncrd.service.impl.ComtnncrdDAO;

/**
 * @Class Name : ComtnncrdServiceImpl.java
 * @Description : Comtnncrd Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnncrdService")
public class ComtnncrdServiceImpl extends AbstractServiceImpl implements
        ComtnncrdService {

    @Resource(name="comtnncrdDAO")
    private ComtnncrdDAO comtnncrdDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnncrdIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnncrd을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnncrdVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnncrd(ComtnncrdVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnncrdDAO.insertComtnncrd(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnncrd을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnncrdVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnncrd(ComtnncrdVO vo) throws Exception {
        comtnncrdDAO.updateComtnncrd(vo);
    }

    /**
	 * comtnncrd을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnncrdVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnncrd(ComtnncrdVO vo) throws Exception {
        comtnncrdDAO.deleteComtnncrd(vo);
    }

    /**
	 * comtnncrd을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnncrdVO
	 * @return 조회한 comtnncrd
	 * @exception Exception
	 */
    public ComtnncrdVO selectComtnncrd(ComtnncrdVO vo) throws Exception {
        ComtnncrdVO resultVO = comtnncrdDAO.selectComtnncrd(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnncrd 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnncrd 목록
	 * @exception Exception
	 */
    public List selectComtnncrdList(ComtnncrdDefaultVO searchVO) throws Exception {
        return comtnncrdDAO.selectComtnncrdList(searchVO);
    }

    /**
	 * comtnncrd 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnncrd 총 갯수
	 * @exception
	 */
    public int selectComtnncrdListTotCnt(ComtnncrdDefaultVO searchVO) {
		return comtnncrdDAO.selectComtnncrdListTotCnt(searchVO);
	}
    
}