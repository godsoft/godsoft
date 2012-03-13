package kr.godsoft.egovframe.generatorwebapp.comtnservereqpmninfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnservereqpmninfo.service.ComtnservereqpmninfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnservereqpmninfo.service.ComtnservereqpmninfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnservereqpmninfo.service.ComtnservereqpmninfoVO;
import kr.godsoft.egovframe.generatorwebapp.comtnservereqpmninfo.service.impl.ComtnservereqpmninfoDAO;

/**
 * @Class Name : ComtnservereqpmninfoServiceImpl.java
 * @Description : Comtnservereqpmninfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnservereqpmninfoService")
public class ComtnservereqpmninfoServiceImpl extends AbstractServiceImpl implements
        ComtnservereqpmninfoService {

    @Resource(name="comtnservereqpmninfoDAO")
    private ComtnservereqpmninfoDAO comtnservereqpmninfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnservereqpmninfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnservereqpmninfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnservereqpmninfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnservereqpmninfo(ComtnservereqpmninfoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnservereqpmninfoDAO.insertComtnservereqpmninfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnservereqpmninfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnservereqpmninfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnservereqpmninfo(ComtnservereqpmninfoVO vo) throws Exception {
        comtnservereqpmninfoDAO.updateComtnservereqpmninfo(vo);
    }

    /**
	 * comtnservereqpmninfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnservereqpmninfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnservereqpmninfo(ComtnservereqpmninfoVO vo) throws Exception {
        comtnservereqpmninfoDAO.deleteComtnservereqpmninfo(vo);
    }

    /**
	 * comtnservereqpmninfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnservereqpmninfoVO
	 * @return 조회한 comtnservereqpmninfo
	 * @exception Exception
	 */
    public ComtnservereqpmninfoVO selectComtnservereqpmninfo(ComtnservereqpmninfoVO vo) throws Exception {
        ComtnservereqpmninfoVO resultVO = comtnservereqpmninfoDAO.selectComtnservereqpmninfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnservereqpmninfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnservereqpmninfo 목록
	 * @exception Exception
	 */
    public List selectComtnservereqpmninfoList(ComtnservereqpmninfoDefaultVO searchVO) throws Exception {
        return comtnservereqpmninfoDAO.selectComtnservereqpmninfoList(searchVO);
    }

    /**
	 * comtnservereqpmninfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnservereqpmninfo 총 갯수
	 * @exception
	 */
    public int selectComtnservereqpmninfoListTotCnt(ComtnservereqpmninfoDefaultVO searchVO) {
		return comtnservereqpmninfoDAO.selectComtnservereqpmninfoListTotCnt(searchVO);
	}
    
}
