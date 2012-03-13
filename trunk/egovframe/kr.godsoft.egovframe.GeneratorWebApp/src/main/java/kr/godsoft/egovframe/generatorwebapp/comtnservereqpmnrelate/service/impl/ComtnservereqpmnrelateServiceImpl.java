package kr.godsoft.egovframe.generatorwebapp.comtnservereqpmnrelate.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnservereqpmnrelate.service.ComtnservereqpmnrelateService;
import kr.godsoft.egovframe.generatorwebapp.comtnservereqpmnrelate.service.ComtnservereqpmnrelateDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnservereqpmnrelate.service.ComtnservereqpmnrelateVO;
import kr.godsoft.egovframe.generatorwebapp.comtnservereqpmnrelate.service.impl.ComtnservereqpmnrelateDAO;

/**
 * @Class Name : ComtnservereqpmnrelateServiceImpl.java
 * @Description : Comtnservereqpmnrelate Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnservereqpmnrelateService")
public class ComtnservereqpmnrelateServiceImpl extends AbstractServiceImpl implements
        ComtnservereqpmnrelateService {

    @Resource(name="comtnservereqpmnrelateDAO")
    private ComtnservereqpmnrelateDAO comtnservereqpmnrelateDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnservereqpmnrelateIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnservereqpmnrelate을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnservereqpmnrelateVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnservereqpmnrelate(ComtnservereqpmnrelateVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnservereqpmnrelateDAO.insertComtnservereqpmnrelate(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnservereqpmnrelate을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnservereqpmnrelateVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnservereqpmnrelate(ComtnservereqpmnrelateVO vo) throws Exception {
        comtnservereqpmnrelateDAO.updateComtnservereqpmnrelate(vo);
    }

    /**
	 * comtnservereqpmnrelate을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnservereqpmnrelateVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnservereqpmnrelate(ComtnservereqpmnrelateVO vo) throws Exception {
        comtnservereqpmnrelateDAO.deleteComtnservereqpmnrelate(vo);
    }

    /**
	 * comtnservereqpmnrelate을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnservereqpmnrelateVO
	 * @return 조회한 comtnservereqpmnrelate
	 * @exception Exception
	 */
    public ComtnservereqpmnrelateVO selectComtnservereqpmnrelate(ComtnservereqpmnrelateVO vo) throws Exception {
        ComtnservereqpmnrelateVO resultVO = comtnservereqpmnrelateDAO.selectComtnservereqpmnrelate(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnservereqpmnrelate 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnservereqpmnrelate 목록
	 * @exception Exception
	 */
    public List selectComtnservereqpmnrelateList(ComtnservereqpmnrelateDefaultVO searchVO) throws Exception {
        return comtnservereqpmnrelateDAO.selectComtnservereqpmnrelateList(searchVO);
    }

    /**
	 * comtnservereqpmnrelate 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnservereqpmnrelate 총 갯수
	 * @exception
	 */
    public int selectComtnservereqpmnrelateListTotCnt(ComtnservereqpmnrelateDefaultVO searchVO) {
		return comtnservereqpmnrelateDAO.selectComtnservereqpmnrelateListTotCnt(searchVO);
	}
    
}
