package kr.godsoft.egovframe.generatorwebapp.comtndiaryinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtndiaryinfo.service.ComtndiaryinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtndiaryinfo.service.ComtndiaryinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtndiaryinfo.service.ComtndiaryinfoVO;
import kr.godsoft.egovframe.generatorwebapp.comtndiaryinfo.service.impl.ComtndiaryinfoDAO;

/**
 * @Class Name : ComtndiaryinfoServiceImpl.java
 * @Description : Comtndiaryinfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtndiaryinfoService")
public class ComtndiaryinfoServiceImpl extends AbstractServiceImpl implements
        ComtndiaryinfoService {

    @Resource(name="comtndiaryinfoDAO")
    private ComtndiaryinfoDAO comtndiaryinfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtndiaryinfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtndiaryinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtndiaryinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtndiaryinfo(ComtndiaryinfoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtndiaryinfoDAO.insertComtndiaryinfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtndiaryinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtndiaryinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtndiaryinfo(ComtndiaryinfoVO vo) throws Exception {
        comtndiaryinfoDAO.updateComtndiaryinfo(vo);
    }

    /**
	 * comtndiaryinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtndiaryinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtndiaryinfo(ComtndiaryinfoVO vo) throws Exception {
        comtndiaryinfoDAO.deleteComtndiaryinfo(vo);
    }

    /**
	 * comtndiaryinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtndiaryinfoVO
	 * @return 조회한 comtndiaryinfo
	 * @exception Exception
	 */
    public ComtndiaryinfoVO selectComtndiaryinfo(ComtndiaryinfoVO vo) throws Exception {
        ComtndiaryinfoVO resultVO = comtndiaryinfoDAO.selectComtndiaryinfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtndiaryinfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtndiaryinfo 목록
	 * @exception Exception
	 */
    public List selectComtndiaryinfoList(ComtndiaryinfoDefaultVO searchVO) throws Exception {
        return comtndiaryinfoDAO.selectComtndiaryinfoList(searchVO);
    }

    /**
	 * comtndiaryinfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtndiaryinfo 총 갯수
	 * @exception
	 */
    public int selectComtndiaryinfoListTotCnt(ComtndiaryinfoDefaultVO searchVO) {
		return comtndiaryinfoDAO.selectComtndiaryinfoListTotCnt(searchVO);
	}
    
}
