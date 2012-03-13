package kr.godsoft.egovframe.generatorwebapp.comtnqestnrinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnqestnrinfo.service.ComtnqestnrinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnqestnrinfo.service.ComtnqestnrinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnqestnrinfo.service.ComtnqestnrinfoVO;
import kr.godsoft.egovframe.generatorwebapp.comtnqestnrinfo.service.impl.ComtnqestnrinfoDAO;

/**
 * @Class Name : ComtnqestnrinfoServiceImpl.java
 * @Description : Comtnqestnrinfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
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
	 * comtnqestnrinfo을 등록한다.
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
	 * comtnqestnrinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnqestnrinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnqestnrinfo(ComtnqestnrinfoVO vo) throws Exception {
        comtnqestnrinfoDAO.updateComtnqestnrinfo(vo);
    }

    /**
	 * comtnqestnrinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnqestnrinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnqestnrinfo(ComtnqestnrinfoVO vo) throws Exception {
        comtnqestnrinfoDAO.deleteComtnqestnrinfo(vo);
    }

    /**
	 * comtnqestnrinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnqestnrinfoVO
	 * @return 조회한 comtnqestnrinfo
	 * @exception Exception
	 */
    public ComtnqestnrinfoVO selectComtnqestnrinfo(ComtnqestnrinfoVO vo) throws Exception {
        ComtnqestnrinfoVO resultVO = comtnqestnrinfoDAO.selectComtnqestnrinfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnqestnrinfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnqestnrinfo 목록
	 * @exception Exception
	 */
    public List selectComtnqestnrinfoList(ComtnqestnrinfoDefaultVO searchVO) throws Exception {
        return comtnqestnrinfoDAO.selectComtnqestnrinfoList(searchVO);
    }

    /**
	 * comtnqestnrinfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnqestnrinfo 총 갯수
	 * @exception
	 */
    public int selectComtnqestnrinfoListTotCnt(ComtnqestnrinfoDefaultVO searchVO) {
		return comtnqestnrinfoDAO.selectComtnqestnrinfoListTotCnt(searchVO);
	}
    
}
