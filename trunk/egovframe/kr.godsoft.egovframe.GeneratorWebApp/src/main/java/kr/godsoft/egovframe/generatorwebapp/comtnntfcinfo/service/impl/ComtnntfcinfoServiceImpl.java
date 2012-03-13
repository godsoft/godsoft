package kr.godsoft.egovframe.generatorwebapp.comtnntfcinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnntfcinfo.service.ComtnntfcinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnntfcinfo.service.ComtnntfcinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnntfcinfo.service.ComtnntfcinfoVO;
import kr.godsoft.egovframe.generatorwebapp.comtnntfcinfo.service.impl.ComtnntfcinfoDAO;

/**
 * @Class Name : ComtnntfcinfoServiceImpl.java
 * @Description : Comtnntfcinfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnntfcinfoService")
public class ComtnntfcinfoServiceImpl extends AbstractServiceImpl implements
        ComtnntfcinfoService {

    @Resource(name="comtnntfcinfoDAO")
    private ComtnntfcinfoDAO comtnntfcinfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnntfcinfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnntfcinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnntfcinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnntfcinfo(ComtnntfcinfoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnntfcinfoDAO.insertComtnntfcinfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnntfcinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnntfcinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnntfcinfo(ComtnntfcinfoVO vo) throws Exception {
        comtnntfcinfoDAO.updateComtnntfcinfo(vo);
    }

    /**
	 * comtnntfcinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnntfcinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnntfcinfo(ComtnntfcinfoVO vo) throws Exception {
        comtnntfcinfoDAO.deleteComtnntfcinfo(vo);
    }

    /**
	 * comtnntfcinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnntfcinfoVO
	 * @return 조회한 comtnntfcinfo
	 * @exception Exception
	 */
    public ComtnntfcinfoVO selectComtnntfcinfo(ComtnntfcinfoVO vo) throws Exception {
        ComtnntfcinfoVO resultVO = comtnntfcinfoDAO.selectComtnntfcinfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnntfcinfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnntfcinfo 목록
	 * @exception Exception
	 */
    public List selectComtnntfcinfoList(ComtnntfcinfoDefaultVO searchVO) throws Exception {
        return comtnntfcinfoDAO.selectComtnntfcinfoList(searchVO);
    }

    /**
	 * comtnntfcinfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnntfcinfo 총 갯수
	 * @exception
	 */
    public int selectComtnntfcinfoListTotCnt(ComtnntfcinfoDefaultVO searchVO) {
		return comtnntfcinfoDAO.selectComtnntfcinfoListTotCnt(searchVO);
	}
    
}
