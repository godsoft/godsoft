package kr.godsoft.egovframe.generatorwebapp.comtnonlinepollresult.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnonlinepollresult.service.ComtnonlinepollresultService;
import kr.godsoft.egovframe.generatorwebapp.comtnonlinepollresult.service.ComtnonlinepollresultVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnonlinepollresultServiceImpl.java
 * @Description : Comtnonlinepollresult Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
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
	 * COMTNONLINEPOLLRESULT을 등록한다.
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
	 * COMTNONLINEPOLLRESULT을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnonlinepollresultVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnonlinepollresult(ComtnonlinepollresultVO vo) throws Exception {
        comtnonlinepollresultDAO.updateComtnonlinepollresult(vo);
    }

    /**
	 * COMTNONLINEPOLLRESULT을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnonlinepollresultVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnonlinepollresult(ComtnonlinepollresultVO vo) throws Exception {
        comtnonlinepollresultDAO.deleteComtnonlinepollresult(vo);
    }

    /**
	 * COMTNONLINEPOLLRESULT을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnonlinepollresultVO
	 * @return 조회한 COMTNONLINEPOLLRESULT
	 * @exception Exception
	 */
    public ComtnonlinepollresultVO selectComtnonlinepollresult(ComtnonlinepollresultVO vo) throws Exception {
        ComtnonlinepollresultVO resultVO = comtnonlinepollresultDAO.selectComtnonlinepollresult(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNONLINEPOLLRESULT 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNONLINEPOLLRESULT 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnonlinepollresultList(ComtnonlinepollresultVO vo) throws Exception {
        return comtnonlinepollresultDAO.selectComtnonlinepollresultList(vo);
    }

    /**
	 * COMTNONLINEPOLLRESULT 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNONLINEPOLLRESULT 총 갯수
	 * @exception
	 */
    public int selectComtnonlinepollresultListTotCnt(ComtnonlinepollresultVO vo) {
		return comtnonlinepollresultDAO.selectComtnonlinepollresultListTotCnt(vo);
	}
    
}
