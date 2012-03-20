package kr.godsoft.egovframe.generatorwebapp.comtnbkmkmenumanageresult.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnbkmkmenumanageresult.service.ComtnbkmkmenumanageresultService;
import kr.godsoft.egovframe.generatorwebapp.comtnbkmkmenumanageresult.service.ComtnbkmkmenumanageresultVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnbkmkmenumanageresultServiceImpl.java
 * @Description : Comtnbkmkmenumanageresult Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnbkmkmenumanageresultService")
public class ComtnbkmkmenumanageresultServiceImpl extends AbstractServiceImpl implements
        ComtnbkmkmenumanageresultService {

    @Resource(name="comtnbkmkmenumanageresultDAO")
    private ComtnbkmkmenumanageresultDAO comtnbkmkmenumanageresultDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnbkmkmenumanageresultIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnbkmkmenumanageresult을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbkmkmenumanageresultVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnbkmkmenumanageresult(ComtnbkmkmenumanageresultVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnbkmkmenumanageresultDAO.insertComtnbkmkmenumanageresult(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnbkmkmenumanageresult을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbkmkmenumanageresultVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnbkmkmenumanageresult(ComtnbkmkmenumanageresultVO vo) throws Exception {
        comtnbkmkmenumanageresultDAO.updateComtnbkmkmenumanageresult(vo);
    }

    /**
	 * comtnbkmkmenumanageresult을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbkmkmenumanageresultVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnbkmkmenumanageresult(ComtnbkmkmenumanageresultVO vo) throws Exception {
        comtnbkmkmenumanageresultDAO.deleteComtnbkmkmenumanageresult(vo);
    }

    /**
	 * comtnbkmkmenumanageresult을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbkmkmenumanageresultVO
	 * @return 조회한 comtnbkmkmenumanageresult
	 * @exception Exception
	 */
    public ComtnbkmkmenumanageresultVO selectComtnbkmkmenumanageresult(ComtnbkmkmenumanageresultVO vo) throws Exception {
        ComtnbkmkmenumanageresultVO resultVO = comtnbkmkmenumanageresultDAO.selectComtnbkmkmenumanageresult(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnbkmkmenumanageresult 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbkmkmenumanageresult 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnbkmkmenumanageresultList(ComtnbkmkmenumanageresultVO vo) throws Exception {
        return comtnbkmkmenumanageresultDAO.selectComtnbkmkmenumanageresultList(vo);
    }

    /**
	 * comtnbkmkmenumanageresult 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbkmkmenumanageresult 총 갯수
	 * @exception
	 */
    public int selectComtnbkmkmenumanageresultListTotCnt(ComtnbkmkmenumanageresultVO vo) {
		return comtnbkmkmenumanageresultDAO.selectComtnbkmkmenumanageresultListTotCnt(vo);
	}
    
}
