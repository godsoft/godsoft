package kr.godsoft.egovframe.generatorwebapp.comtnbackupresult.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnbackupresult.service.ComtnbackupresultService;
import kr.godsoft.egovframe.generatorwebapp.comtnbackupresult.service.ComtnbackupresultDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbackupresult.service.ComtnbackupresultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbackupresult.service.impl.ComtnbackupresultDAO;

/**
 * @Class Name : ComtnbackupresultServiceImpl.java
 * @Description : Comtnbackupresult Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnbackupresultService")
public class ComtnbackupresultServiceImpl extends AbstractServiceImpl implements
        ComtnbackupresultService {

    @Resource(name="comtnbackupresultDAO")
    private ComtnbackupresultDAO comtnbackupresultDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnbackupresultIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnbackupresult을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbackupresultVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnbackupresult(ComtnbackupresultVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnbackupresultDAO.insertComtnbackupresult(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnbackupresult을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbackupresultVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnbackupresult(ComtnbackupresultVO vo) throws Exception {
        comtnbackupresultDAO.updateComtnbackupresult(vo);
    }

    /**
	 * comtnbackupresult을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbackupresultVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnbackupresult(ComtnbackupresultVO vo) throws Exception {
        comtnbackupresultDAO.deleteComtnbackupresult(vo);
    }

    /**
	 * comtnbackupresult을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbackupresultVO
	 * @return 조회한 comtnbackupresult
	 * @exception Exception
	 */
    public ComtnbackupresultVO selectComtnbackupresult(ComtnbackupresultVO vo) throws Exception {
        ComtnbackupresultVO resultVO = comtnbackupresultDAO.selectComtnbackupresult(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnbackupresult 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbackupresult 목록
	 * @exception Exception
	 */
    public List selectComtnbackupresultList(ComtnbackupresultDefaultVO searchVO) throws Exception {
        return comtnbackupresultDAO.selectComtnbackupresultList(searchVO);
    }

    /**
	 * comtnbackupresult 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbackupresult 총 갯수
	 * @exception
	 */
    public int selectComtnbackupresultListTotCnt(ComtnbackupresultDefaultVO searchVO) {
		return comtnbackupresultDAO.selectComtnbackupresultListTotCnt(searchVO);
	}
    
}
