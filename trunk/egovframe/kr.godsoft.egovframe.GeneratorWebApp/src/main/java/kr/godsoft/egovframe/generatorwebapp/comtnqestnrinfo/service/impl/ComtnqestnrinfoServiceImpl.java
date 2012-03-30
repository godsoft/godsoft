package kr.godsoft.egovframe.generatorwebapp.comtnqestnrinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnqestnrinfo.service.ComtnqestnrinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnqestnrinfo.service.ComtnqestnrinfoVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnqestnrinfoServiceImpl.java
 * @Description : Comtnqestnrinfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnqestnrinfoService")
public class ComtnqestnrinfoServiceImpl extends AbstractServiceImpl implements
        ComtnqestnrinfoService {

    @Resource(name="comtnqestnrinfoDAO")
    private ComtnqestnrinfoDAO comtnqestnrinfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnqestnrinfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNQESTNRINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnqestnrinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnqestnrinfo(ComtnqestnrinfoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnqestnrinfoDAO.insertComtnqestnrinfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNQESTNRINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnqestnrinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnqestnrinfo(ComtnqestnrinfoVO vo) throws Exception {
        comtnqestnrinfoDAO.updateComtnqestnrinfo(vo);
    }

    /**
	 * COMTNQESTNRINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnqestnrinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnqestnrinfo(ComtnqestnrinfoVO vo) throws Exception {
        comtnqestnrinfoDAO.deleteComtnqestnrinfo(vo);
    }

    /**
	 * COMTNQESTNRINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnqestnrinfoVO
	 * @return 조회한 COMTNQESTNRINFO
	 * @exception Exception
	 */
    public ComtnqestnrinfoVO selectComtnqestnrinfo(ComtnqestnrinfoVO vo) throws Exception {
        ComtnqestnrinfoVO resultVO = comtnqestnrinfoDAO.selectComtnqestnrinfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNQESTNRINFO 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNQESTNRINFO 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnqestnrinfoList(ComtnqestnrinfoVO vo) throws Exception {
        return comtnqestnrinfoDAO.selectComtnqestnrinfoList(vo);
    }

    /**
	 * COMTNQESTNRINFO 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNQESTNRINFO 총 갯수
	 * @exception
	 */
    public int selectComtnqestnrinfoListTotCnt(ComtnqestnrinfoVO vo) {
		return comtnqestnrinfoDAO.selectComtnqestnrinfoListTotCnt(vo);
	}
    
}
