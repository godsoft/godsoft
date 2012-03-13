package kr.godsoft.egovframe.generatorwebapp.comtnhttpmon.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnhttpmon.service.ComtnhttpmonService;
import kr.godsoft.egovframe.generatorwebapp.comtnhttpmon.service.ComtnhttpmonDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnhttpmon.service.ComtnhttpmonVO;
import kr.godsoft.egovframe.generatorwebapp.comtnhttpmon.service.impl.ComtnhttpmonDAO;

/**
 * @Class Name : ComtnhttpmonServiceImpl.java
 * @Description : Comtnhttpmon Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnhttpmonService")
public class ComtnhttpmonServiceImpl extends AbstractServiceImpl implements
        ComtnhttpmonService {

    @Resource(name="comtnhttpmonDAO")
    private ComtnhttpmonDAO comtnhttpmonDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnhttpmonIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnhttpmon을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnhttpmonVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnhttpmon(ComtnhttpmonVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnhttpmonDAO.insertComtnhttpmon(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnhttpmon을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnhttpmonVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnhttpmon(ComtnhttpmonVO vo) throws Exception {
        comtnhttpmonDAO.updateComtnhttpmon(vo);
    }

    /**
	 * comtnhttpmon을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnhttpmonVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnhttpmon(ComtnhttpmonVO vo) throws Exception {
        comtnhttpmonDAO.deleteComtnhttpmon(vo);
    }

    /**
	 * comtnhttpmon을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnhttpmonVO
	 * @return 조회한 comtnhttpmon
	 * @exception Exception
	 */
    public ComtnhttpmonVO selectComtnhttpmon(ComtnhttpmonVO vo) throws Exception {
        ComtnhttpmonVO resultVO = comtnhttpmonDAO.selectComtnhttpmon(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnhttpmon 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnhttpmon 목록
	 * @exception Exception
	 */
    public List selectComtnhttpmonList(ComtnhttpmonDefaultVO searchVO) throws Exception {
        return comtnhttpmonDAO.selectComtnhttpmonList(searchVO);
    }

    /**
	 * comtnhttpmon 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnhttpmon 총 갯수
	 * @exception
	 */
    public int selectComtnhttpmonListTotCnt(ComtnhttpmonDefaultVO searchVO) {
		return comtnhttpmonDAO.selectComtnhttpmonListTotCnt(searchVO);
	}
    
}
