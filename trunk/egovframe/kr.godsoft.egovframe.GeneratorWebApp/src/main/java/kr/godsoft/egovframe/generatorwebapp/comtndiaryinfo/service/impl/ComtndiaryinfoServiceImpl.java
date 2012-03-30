package kr.godsoft.egovframe.generatorwebapp.comtndiaryinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtndiaryinfo.service.ComtndiaryinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtndiaryinfo.service.ComtndiaryinfoVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtndiaryinfoServiceImpl.java
 * @Description : Comtndiaryinfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
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
	 * COMTNDIARYINFO을 등록한다.
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
	 * COMTNDIARYINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtndiaryinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtndiaryinfo(ComtndiaryinfoVO vo) throws Exception {
        comtndiaryinfoDAO.updateComtndiaryinfo(vo);
    }

    /**
	 * COMTNDIARYINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtndiaryinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtndiaryinfo(ComtndiaryinfoVO vo) throws Exception {
        comtndiaryinfoDAO.deleteComtndiaryinfo(vo);
    }

    /**
	 * COMTNDIARYINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtndiaryinfoVO
	 * @return 조회한 COMTNDIARYINFO
	 * @exception Exception
	 */
    public ComtndiaryinfoVO selectComtndiaryinfo(ComtndiaryinfoVO vo) throws Exception {
        ComtndiaryinfoVO resultVO = comtndiaryinfoDAO.selectComtndiaryinfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNDIARYINFO 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNDIARYINFO 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtndiaryinfoList(ComtndiaryinfoVO vo) throws Exception {
        return comtndiaryinfoDAO.selectComtndiaryinfoList(vo);
    }

    /**
	 * COMTNDIARYINFO 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNDIARYINFO 총 갯수
	 * @exception
	 */
    public int selectComtndiaryinfoListTotCnt(ComtndiaryinfoVO vo) {
		return comtndiaryinfoDAO.selectComtndiaryinfoListTotCnt(vo);
	}
    
}
