package kr.godsoft.egovframe.generatorwebapp.comtntrsmrcvmntrng.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtntrsmrcvmntrng.service.ComtntrsmrcvmntrngService;
import kr.godsoft.egovframe.generatorwebapp.comtntrsmrcvmntrng.service.ComtntrsmrcvmntrngDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtntrsmrcvmntrng.service.ComtntrsmrcvmntrngVO;
import kr.godsoft.egovframe.generatorwebapp.comtntrsmrcvmntrng.service.impl.ComtntrsmrcvmntrngDAO;

/**
 * @Class Name : ComtntrsmrcvmntrngServiceImpl.java
 * @Description : Comtntrsmrcvmntrng Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtntrsmrcvmntrngService")
public class ComtntrsmrcvmntrngServiceImpl extends AbstractServiceImpl implements
        ComtntrsmrcvmntrngService {

    @Resource(name="comtntrsmrcvmntrngDAO")
    private ComtntrsmrcvmntrngDAO comtntrsmrcvmntrngDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtntrsmrcvmntrngIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtntrsmrcvmntrng을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtntrsmrcvmntrngVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtntrsmrcvmntrng(ComtntrsmrcvmntrngVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtntrsmrcvmntrngDAO.insertComtntrsmrcvmntrng(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtntrsmrcvmntrng을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtntrsmrcvmntrngVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtntrsmrcvmntrng(ComtntrsmrcvmntrngVO vo) throws Exception {
        comtntrsmrcvmntrngDAO.updateComtntrsmrcvmntrng(vo);
    }

    /**
	 * comtntrsmrcvmntrng을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtntrsmrcvmntrngVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtntrsmrcvmntrng(ComtntrsmrcvmntrngVO vo) throws Exception {
        comtntrsmrcvmntrngDAO.deleteComtntrsmrcvmntrng(vo);
    }

    /**
	 * comtntrsmrcvmntrng을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtntrsmrcvmntrngVO
	 * @return 조회한 comtntrsmrcvmntrng
	 * @exception Exception
	 */
    public ComtntrsmrcvmntrngVO selectComtntrsmrcvmntrng(ComtntrsmrcvmntrngVO vo) throws Exception {
        ComtntrsmrcvmntrngVO resultVO = comtntrsmrcvmntrngDAO.selectComtntrsmrcvmntrng(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtntrsmrcvmntrng 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtntrsmrcvmntrng 목록
	 * @exception Exception
	 */
    public List selectComtntrsmrcvmntrngList(ComtntrsmrcvmntrngDefaultVO searchVO) throws Exception {
        return comtntrsmrcvmntrngDAO.selectComtntrsmrcvmntrngList(searchVO);
    }

    /**
	 * comtntrsmrcvmntrng 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtntrsmrcvmntrng 총 갯수
	 * @exception
	 */
    public int selectComtntrsmrcvmntrngListTotCnt(ComtntrsmrcvmntrngDefaultVO searchVO) {
		return comtntrsmrcvmntrngDAO.selectComtntrsmrcvmntrngListTotCnt(searchVO);
	}
    
}
