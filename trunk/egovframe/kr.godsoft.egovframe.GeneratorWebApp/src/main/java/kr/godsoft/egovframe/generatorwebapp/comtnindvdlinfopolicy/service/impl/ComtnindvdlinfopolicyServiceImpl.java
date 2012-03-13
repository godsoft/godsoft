package kr.godsoft.egovframe.generatorwebapp.comtnindvdlinfopolicy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnindvdlinfopolicy.service.ComtnindvdlinfopolicyService;
import kr.godsoft.egovframe.generatorwebapp.comtnindvdlinfopolicy.service.ComtnindvdlinfopolicyDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnindvdlinfopolicy.service.ComtnindvdlinfopolicyVO;
import kr.godsoft.egovframe.generatorwebapp.comtnindvdlinfopolicy.service.impl.ComtnindvdlinfopolicyDAO;

/**
 * @Class Name : ComtnindvdlinfopolicyServiceImpl.java
 * @Description : Comtnindvdlinfopolicy Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnindvdlinfopolicyService")
public class ComtnindvdlinfopolicyServiceImpl extends AbstractServiceImpl implements
        ComtnindvdlinfopolicyService {

    @Resource(name="comtnindvdlinfopolicyDAO")
    private ComtnindvdlinfopolicyDAO comtnindvdlinfopolicyDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnindvdlinfopolicyIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnindvdlinfopolicy을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnindvdlinfopolicyVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnindvdlinfopolicy(ComtnindvdlinfopolicyVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnindvdlinfopolicyDAO.insertComtnindvdlinfopolicy(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnindvdlinfopolicy을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnindvdlinfopolicyVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnindvdlinfopolicy(ComtnindvdlinfopolicyVO vo) throws Exception {
        comtnindvdlinfopolicyDAO.updateComtnindvdlinfopolicy(vo);
    }

    /**
	 * comtnindvdlinfopolicy을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnindvdlinfopolicyVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnindvdlinfopolicy(ComtnindvdlinfopolicyVO vo) throws Exception {
        comtnindvdlinfopolicyDAO.deleteComtnindvdlinfopolicy(vo);
    }

    /**
	 * comtnindvdlinfopolicy을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnindvdlinfopolicyVO
	 * @return 조회한 comtnindvdlinfopolicy
	 * @exception Exception
	 */
    public ComtnindvdlinfopolicyVO selectComtnindvdlinfopolicy(ComtnindvdlinfopolicyVO vo) throws Exception {
        ComtnindvdlinfopolicyVO resultVO = comtnindvdlinfopolicyDAO.selectComtnindvdlinfopolicy(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnindvdlinfopolicy 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnindvdlinfopolicy 목록
	 * @exception Exception
	 */
    public List selectComtnindvdlinfopolicyList(ComtnindvdlinfopolicyDefaultVO searchVO) throws Exception {
        return comtnindvdlinfopolicyDAO.selectComtnindvdlinfopolicyList(searchVO);
    }

    /**
	 * comtnindvdlinfopolicy 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnindvdlinfopolicy 총 갯수
	 * @exception
	 */
    public int selectComtnindvdlinfopolicyListTotCnt(ComtnindvdlinfopolicyDefaultVO searchVO) {
		return comtnindvdlinfopolicyDAO.selectComtnindvdlinfopolicyListTotCnt(searchVO);
	}
    
}
