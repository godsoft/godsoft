package kr.godsoft.egovframe.generatorwebapp.comtnqustnrrespondinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnqustnrrespondinfo.service.ComtnqustnrrespondinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnrrespondinfo.service.ComtnqustnrrespondinfoVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnqustnrrespondinfoServiceImpl.java
 * @Description : Comtnqustnrrespondinfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnqustnrrespondinfoService")
public class ComtnqustnrrespondinfoServiceImpl extends AbstractServiceImpl implements
        ComtnqustnrrespondinfoService {

    @Resource(name="comtnqustnrrespondinfoDAO")
    private ComtnqustnrrespondinfoDAO comtnqustnrrespondinfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnqustnrrespondinfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNQUSTNRRESPONDINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnqustnrrespondinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnqustnrrespondinfo(ComtnqustnrrespondinfoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnqustnrrespondinfoDAO.insertComtnqustnrrespondinfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNQUSTNRRESPONDINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnqustnrrespondinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnqustnrrespondinfo(ComtnqustnrrespondinfoVO vo) throws Exception {
        comtnqustnrrespondinfoDAO.updateComtnqustnrrespondinfo(vo);
    }

    /**
	 * COMTNQUSTNRRESPONDINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnqustnrrespondinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnqustnrrespondinfo(ComtnqustnrrespondinfoVO vo) throws Exception {
        comtnqustnrrespondinfoDAO.deleteComtnqustnrrespondinfo(vo);
    }

    /**
	 * COMTNQUSTNRRESPONDINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnqustnrrespondinfoVO
	 * @return 조회한 COMTNQUSTNRRESPONDINFO
	 * @exception Exception
	 */
    public ComtnqustnrrespondinfoVO selectComtnqustnrrespondinfo(ComtnqustnrrespondinfoVO vo) throws Exception {
        ComtnqustnrrespondinfoVO resultVO = comtnqustnrrespondinfoDAO.selectComtnqustnrrespondinfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNQUSTNRRESPONDINFO 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNQUSTNRRESPONDINFO 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnqustnrrespondinfoList(ComtnqustnrrespondinfoVO vo) throws Exception {
        return comtnqustnrrespondinfoDAO.selectComtnqustnrrespondinfoList(vo);
    }

    /**
	 * COMTNQUSTNRRESPONDINFO 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNQUSTNRRESPONDINFO 총 갯수
	 * @exception
	 */
    public int selectComtnqustnrrespondinfoListTotCnt(ComtnqustnrrespondinfoVO vo) {
		return comtnqustnrrespondinfoDAO.selectComtnqustnrrespondinfoListTotCnt(vo);
	}
    
}