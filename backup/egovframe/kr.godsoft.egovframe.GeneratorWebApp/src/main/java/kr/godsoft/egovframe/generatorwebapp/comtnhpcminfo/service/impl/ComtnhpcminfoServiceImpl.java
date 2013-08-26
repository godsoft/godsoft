package kr.godsoft.egovframe.generatorwebapp.comtnhpcminfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnhpcminfo.service.ComtnhpcminfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnhpcminfo.service.ComtnhpcminfoVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnhpcminfoServiceImpl.java
 * @Description : Comtnhpcminfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnhpcminfoService")
public class ComtnhpcminfoServiceImpl extends AbstractServiceImpl implements
        ComtnhpcminfoService {

    @Resource(name="comtnhpcminfoDAO")
    private ComtnhpcminfoDAO comtnhpcminfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnhpcminfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNHPCMINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnhpcminfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnhpcminfo(ComtnhpcminfoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnhpcminfoDAO.insertComtnhpcminfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNHPCMINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnhpcminfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnhpcminfo(ComtnhpcminfoVO vo) throws Exception {
        comtnhpcminfoDAO.updateComtnhpcminfo(vo);
    }

    /**
	 * COMTNHPCMINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnhpcminfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnhpcminfo(ComtnhpcminfoVO vo) throws Exception {
        comtnhpcminfoDAO.deleteComtnhpcminfo(vo);
    }

    /**
	 * COMTNHPCMINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnhpcminfoVO
	 * @return 조회한 COMTNHPCMINFO
	 * @exception Exception
	 */
    public ComtnhpcminfoVO selectComtnhpcminfo(ComtnhpcminfoVO vo) throws Exception {
        ComtnhpcminfoVO resultVO = comtnhpcminfoDAO.selectComtnhpcminfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNHPCMINFO 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNHPCMINFO 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnhpcminfoList(ComtnhpcminfoVO vo) throws Exception {
        return comtnhpcminfoDAO.selectComtnhpcminfoList(vo);
    }

    /**
	 * COMTNHPCMINFO 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNHPCMINFO 총 갯수
	 * @exception
	 */
    public int selectComtnhpcminfoListTotCnt(ComtnhpcminfoVO vo) {
		return comtnhpcminfoDAO.selectComtnhpcminfoListTotCnt(vo);
	}
    
}
