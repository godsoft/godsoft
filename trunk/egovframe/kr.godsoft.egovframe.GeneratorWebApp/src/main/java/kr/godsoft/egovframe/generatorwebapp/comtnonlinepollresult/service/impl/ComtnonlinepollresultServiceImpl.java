package kr.godsoft.egovframe.generatorwebapp.comtnonlinepollresult.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnonlinepollresult.service.ComtnonlinepollresultService;
import kr.godsoft.egovframe.generatorwebapp.comtnonlinepollresult.service.ComtnonlinepollresultDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnonlinepollresult.service.ComtnonlinepollresultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnonlinepollresult.service.impl.ComtnonlinepollresultDAO;

/**
 * @Class Name : ComtnonlinepollresultServiceImpl.java
 * @Description : Comtnonlinepollresult Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnonlinepollresultService")
public class ComtnonlinepollresultServiceImpl extends AbstractServiceImpl implements
        ComtnonlinepollresultService {

    @Resource(name="comtnonlinepollresultDAO")
    private ComtnonlinepollresultDAO comtnonlinepollresultDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnonlinepollresultIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnonlinepollresult을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnonlinepollresultVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnonlinepollresult(ComtnonlinepollresultVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnonlinepollresultDAO.insertComtnonlinepollresult(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnonlinepollresult을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnonlinepollresultVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnonlinepollresult(ComtnonlinepollresultVO vo) throws Exception {
        comtnonlinepollresultDAO.updateComtnonlinepollresult(vo);
    }

    /**
	 * comtnonlinepollresult을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnonlinepollresultVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnonlinepollresult(ComtnonlinepollresultVO vo) throws Exception {
        comtnonlinepollresultDAO.deleteComtnonlinepollresult(vo);
    }

    /**
	 * comtnonlinepollresult을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnonlinepollresultVO
	 * @return 조회한 comtnonlinepollresult
	 * @exception Exception
	 */
    public ComtnonlinepollresultVO selectComtnonlinepollresult(ComtnonlinepollresultVO vo) throws Exception {
        ComtnonlinepollresultVO resultVO = comtnonlinepollresultDAO.selectComtnonlinepollresult(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnonlinepollresult 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnonlinepollresult 목록
	 * @exception Exception
	 */
    public List selectComtnonlinepollresultList(ComtnonlinepollresultDefaultVO searchVO) throws Exception {
        return comtnonlinepollresultDAO.selectComtnonlinepollresultList(searchVO);
    }

    /**
	 * comtnonlinepollresult 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnonlinepollresult 총 갯수
	 * @exception
	 */
    public int selectComtnonlinepollresultListTotCnt(ComtnonlinepollresultDefaultVO searchVO) {
		return comtnonlinepollresultDAO.selectComtnonlinepollresultListTotCnt(searchVO);
	}
    
}
