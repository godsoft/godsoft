package kr.godsoft.egovframe.generatorwebapp.comtnqustnrrspnsresult.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnqustnrrspnsresult.service.ComtnqustnrrspnsresultService;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnrrspnsresult.service.ComtnqustnrrspnsresultVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnqustnrrspnsresultServiceImpl.java
 * @Description : Comtnqustnrrspnsresult Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnqustnrrspnsresultService")
public class ComtnqustnrrspnsresultServiceImpl extends AbstractServiceImpl implements
        ComtnqustnrrspnsresultService {

    @Resource(name="comtnqustnrrspnsresultDAO")
    private ComtnqustnrrspnsresultDAO comtnqustnrrspnsresultDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnqustnrrspnsresultIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNQUSTNRRSPNSRESULT을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnqustnrrspnsresultVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnqustnrrspnsresult(ComtnqustnrrspnsresultVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnqustnrrspnsresultDAO.insertComtnqustnrrspnsresult(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNQUSTNRRSPNSRESULT을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnqustnrrspnsresultVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnqustnrrspnsresult(ComtnqustnrrspnsresultVO vo) throws Exception {
        comtnqustnrrspnsresultDAO.updateComtnqustnrrspnsresult(vo);
    }

    /**
	 * COMTNQUSTNRRSPNSRESULT을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnqustnrrspnsresultVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnqustnrrspnsresult(ComtnqustnrrspnsresultVO vo) throws Exception {
        comtnqustnrrspnsresultDAO.deleteComtnqustnrrspnsresult(vo);
    }

    /**
	 * COMTNQUSTNRRSPNSRESULT을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnqustnrrspnsresultVO
	 * @return 조회한 COMTNQUSTNRRSPNSRESULT
	 * @exception Exception
	 */
    public ComtnqustnrrspnsresultVO selectComtnqustnrrspnsresult(ComtnqustnrrspnsresultVO vo) throws Exception {
        ComtnqustnrrspnsresultVO resultVO = comtnqustnrrspnsresultDAO.selectComtnqustnrrspnsresult(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNQUSTNRRSPNSRESULT 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNQUSTNRRSPNSRESULT 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnqustnrrspnsresultList(ComtnqustnrrspnsresultVO vo) throws Exception {
        return comtnqustnrrspnsresultDAO.selectComtnqustnrrspnsresultList(vo);
    }

    /**
	 * COMTNQUSTNRRSPNSRESULT 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNQUSTNRRSPNSRESULT 총 갯수
	 * @exception
	 */
    public int selectComtnqustnrrspnsresultListTotCnt(ComtnqustnrrspnsresultVO vo) {
		return comtnqustnrrspnsresultDAO.selectComtnqustnrrspnsresultListTotCnt(vo);
	}
    
}
