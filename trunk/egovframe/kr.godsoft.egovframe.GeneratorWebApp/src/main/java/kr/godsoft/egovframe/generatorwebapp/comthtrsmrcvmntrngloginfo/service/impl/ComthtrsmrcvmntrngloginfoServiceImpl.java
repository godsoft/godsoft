package kr.godsoft.egovframe.generatorwebapp.comthtrsmrcvmntrngloginfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comthtrsmrcvmntrngloginfo.service.ComthtrsmrcvmntrngloginfoService;
import kr.godsoft.egovframe.generatorwebapp.comthtrsmrcvmntrngloginfo.service.ComthtrsmrcvmntrngloginfoVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComthtrsmrcvmntrngloginfoServiceImpl.java
 * @Description : Comthtrsmrcvmntrngloginfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comthtrsmrcvmntrngloginfoService")
public class ComthtrsmrcvmntrngloginfoServiceImpl extends AbstractServiceImpl implements
        ComthtrsmrcvmntrngloginfoService {

    @Resource(name="comthtrsmrcvmntrngloginfoDAO")
    private ComthtrsmrcvmntrngloginfoDAO comthtrsmrcvmntrngloginfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComthtrsmrcvmntrngloginfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comthtrsmrcvmntrngloginfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComthtrsmrcvmntrngloginfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComthtrsmrcvmntrngloginfo(ComthtrsmrcvmntrngloginfoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comthtrsmrcvmntrngloginfoDAO.insertComthtrsmrcvmntrngloginfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comthtrsmrcvmntrngloginfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComthtrsmrcvmntrngloginfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComthtrsmrcvmntrngloginfo(ComthtrsmrcvmntrngloginfoVO vo) throws Exception {
        comthtrsmrcvmntrngloginfoDAO.updateComthtrsmrcvmntrngloginfo(vo);
    }

    /**
	 * comthtrsmrcvmntrngloginfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComthtrsmrcvmntrngloginfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComthtrsmrcvmntrngloginfo(ComthtrsmrcvmntrngloginfoVO vo) throws Exception {
        comthtrsmrcvmntrngloginfoDAO.deleteComthtrsmrcvmntrngloginfo(vo);
    }

    /**
	 * comthtrsmrcvmntrngloginfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComthtrsmrcvmntrngloginfoVO
	 * @return 조회한 comthtrsmrcvmntrngloginfo
	 * @exception Exception
	 */
    public ComthtrsmrcvmntrngloginfoVO selectComthtrsmrcvmntrngloginfo(ComthtrsmrcvmntrngloginfoVO vo) throws Exception {
        ComthtrsmrcvmntrngloginfoVO resultVO = comthtrsmrcvmntrngloginfoDAO.selectComthtrsmrcvmntrngloginfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comthtrsmrcvmntrngloginfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comthtrsmrcvmntrngloginfo 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComthtrsmrcvmntrngloginfoList(ComthtrsmrcvmntrngloginfoVO vo) throws Exception {
        return comthtrsmrcvmntrngloginfoDAO.selectComthtrsmrcvmntrngloginfoList(vo);
    }

    /**
	 * comthtrsmrcvmntrngloginfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comthtrsmrcvmntrngloginfo 총 갯수
	 * @exception
	 */
    public int selectComthtrsmrcvmntrngloginfoListTotCnt(ComthtrsmrcvmntrngloginfoVO vo) {
		return comthtrsmrcvmntrngloginfoDAO.selectComthtrsmrcvmntrngloginfoListTotCnt(vo);
	}
    
}
