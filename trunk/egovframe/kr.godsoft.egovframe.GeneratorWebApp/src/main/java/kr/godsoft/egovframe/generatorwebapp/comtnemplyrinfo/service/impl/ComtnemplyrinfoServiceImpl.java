package kr.godsoft.egovframe.generatorwebapp.comtnemplyrinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnemplyrinfo.service.ComtnemplyrinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnemplyrinfo.service.ComtnemplyrinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnemplyrinfo.service.ComtnemplyrinfoVO;
import kr.godsoft.egovframe.generatorwebapp.comtnemplyrinfo.service.impl.ComtnemplyrinfoDAO;

/**
 * @Class Name : ComtnemplyrinfoServiceImpl.java
 * @Description : Comtnemplyrinfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnemplyrinfoService")
public class ComtnemplyrinfoServiceImpl extends AbstractServiceImpl implements
        ComtnemplyrinfoService {

    @Resource(name="comtnemplyrinfoDAO")
    private ComtnemplyrinfoDAO comtnemplyrinfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnemplyrinfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnemplyrinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnemplyrinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnemplyrinfo(ComtnemplyrinfoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnemplyrinfoDAO.insertComtnemplyrinfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnemplyrinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnemplyrinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnemplyrinfo(ComtnemplyrinfoVO vo) throws Exception {
        comtnemplyrinfoDAO.updateComtnemplyrinfo(vo);
    }

    /**
	 * comtnemplyrinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnemplyrinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnemplyrinfo(ComtnemplyrinfoVO vo) throws Exception {
        comtnemplyrinfoDAO.deleteComtnemplyrinfo(vo);
    }

    /**
	 * comtnemplyrinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnemplyrinfoVO
	 * @return 조회한 comtnemplyrinfo
	 * @exception Exception
	 */
    public ComtnemplyrinfoVO selectComtnemplyrinfo(ComtnemplyrinfoVO vo) throws Exception {
        ComtnemplyrinfoVO resultVO = comtnemplyrinfoDAO.selectComtnemplyrinfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnemplyrinfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnemplyrinfo 목록
	 * @exception Exception
	 */
    public List selectComtnemplyrinfoList(ComtnemplyrinfoDefaultVO searchVO) throws Exception {
        return comtnemplyrinfoDAO.selectComtnemplyrinfoList(searchVO);
    }

    /**
	 * comtnemplyrinfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnemplyrinfo 총 갯수
	 * @exception
	 */
    public int selectComtnemplyrinfoListTotCnt(ComtnemplyrinfoDefaultVO searchVO) {
		return comtnemplyrinfoDAO.selectComtnemplyrinfoListTotCnt(searchVO);
	}
    
}
