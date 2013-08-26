package kr.godsoft.egovframe.generatorwebapp.comtnncrd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnncrd.service.ComtnncrdService;
import kr.godsoft.egovframe.generatorwebapp.comtnncrd.service.ComtnncrdVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnncrdServiceImpl.java
 * @Description : Comtnncrd Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
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
	 * COMTNNCRD을 등록한다.
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
	 * COMTNNCRD을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnncrdVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnncrd(ComtnncrdVO vo) throws Exception {
        comtnncrdDAO.updateComtnncrd(vo);
    }

    /**
	 * COMTNNCRD을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnncrdVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnncrd(ComtnncrdVO vo) throws Exception {
        comtnncrdDAO.deleteComtnncrd(vo);
    }

    /**
	 * COMTNNCRD을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnncrdVO
	 * @return 조회한 COMTNNCRD
	 * @exception Exception
	 */
    public ComtnncrdVO selectComtnncrd(ComtnncrdVO vo) throws Exception {
        ComtnncrdVO resultVO = comtnncrdDAO.selectComtnncrd(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNNCRD 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNNCRD 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnncrdList(ComtnncrdVO vo) throws Exception {
        return comtnncrdDAO.selectComtnncrdList(vo);
    }

    /**
	 * COMTNNCRD 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNNCRD 총 갯수
	 * @exception
	 */
    public int selectComtnncrdListTotCnt(ComtnncrdVO vo) {
		return comtnncrdDAO.selectComtnncrdListTotCnt(vo);
	}
    
}
