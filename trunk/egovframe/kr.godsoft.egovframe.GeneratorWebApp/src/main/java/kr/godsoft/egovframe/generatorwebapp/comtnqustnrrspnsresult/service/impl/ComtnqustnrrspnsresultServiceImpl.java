package kr.godsoft.egovframe.generatorwebapp.comtnqustnrrspnsresult.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnrrspnsresult.service.ComtnqustnrrspnsresultService;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnrrspnsresult.service.ComtnqustnrrspnsresultDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnrrspnsresult.service.ComtnqustnrrspnsresultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnrrspnsresult.service.impl.ComtnqustnrrspnsresultDAO;

/**
 * @Class Name : ComtnqustnrrspnsresultServiceImpl.java
 * @Description : Comtnqustnrrspnsresult Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
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
	 * comtnqustnrrspnsresult을 등록한다.
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
	 * comtnqustnrrspnsresult을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnqustnrrspnsresultVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnqustnrrspnsresult(ComtnqustnrrspnsresultVO vo) throws Exception {
        comtnqustnrrspnsresultDAO.updateComtnqustnrrspnsresult(vo);
    }

    /**
	 * comtnqustnrrspnsresult을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnqustnrrspnsresultVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnqustnrrspnsresult(ComtnqustnrrspnsresultVO vo) throws Exception {
        comtnqustnrrspnsresultDAO.deleteComtnqustnrrspnsresult(vo);
    }

    /**
	 * comtnqustnrrspnsresult을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnqustnrrspnsresultVO
	 * @return 조회한 comtnqustnrrspnsresult
	 * @exception Exception
	 */
    public ComtnqustnrrspnsresultVO selectComtnqustnrrspnsresult(ComtnqustnrrspnsresultVO vo) throws Exception {
        ComtnqustnrrspnsresultVO resultVO = comtnqustnrrspnsresultDAO.selectComtnqustnrrspnsresult(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnqustnrrspnsresult 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnqustnrrspnsresult 목록
	 * @exception Exception
	 */
    public List selectComtnqustnrrspnsresultList(ComtnqustnrrspnsresultDefaultVO searchVO) throws Exception {
        return comtnqustnrrspnsresultDAO.selectComtnqustnrrspnsresultList(searchVO);
    }

    /**
	 * comtnqustnrrspnsresult 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnqustnrrspnsresult 총 갯수
	 * @exception
	 */
    public int selectComtnqustnrrspnsresultListTotCnt(ComtnqustnrrspnsresultDefaultVO searchVO) {
		return comtnqustnrrspnsresultDAO.selectComtnqustnrrspnsresultListTotCnt(searchVO);
	}
    
}
