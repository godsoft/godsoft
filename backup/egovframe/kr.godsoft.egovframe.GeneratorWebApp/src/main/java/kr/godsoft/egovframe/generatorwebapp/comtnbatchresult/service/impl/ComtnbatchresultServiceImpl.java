package kr.godsoft.egovframe.generatorwebapp.comtnbatchresult.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnbatchresult.service.ComtnbatchresultService;
import kr.godsoft.egovframe.generatorwebapp.comtnbatchresult.service.ComtnbatchresultVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnbatchresultServiceImpl.java
 * @Description : Comtnbatchresult Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnbatchresultService")
public class ComtnbatchresultServiceImpl extends AbstractServiceImpl implements
        ComtnbatchresultService {

    @Resource(name="comtnbatchresultDAO")
    private ComtnbatchresultDAO comtnbatchresultDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnbatchresultIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNBATCHRESULT을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbatchresultVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnbatchresult(ComtnbatchresultVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnbatchresultDAO.insertComtnbatchresult(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNBATCHRESULT을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbatchresultVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnbatchresult(ComtnbatchresultVO vo) throws Exception {
        comtnbatchresultDAO.updateComtnbatchresult(vo);
    }

    /**
	 * COMTNBATCHRESULT을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbatchresultVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnbatchresult(ComtnbatchresultVO vo) throws Exception {
        comtnbatchresultDAO.deleteComtnbatchresult(vo);
    }

    /**
	 * COMTNBATCHRESULT을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbatchresultVO
	 * @return 조회한 COMTNBATCHRESULT
	 * @exception Exception
	 */
    public ComtnbatchresultVO selectComtnbatchresult(ComtnbatchresultVO vo) throws Exception {
        ComtnbatchresultVO resultVO = comtnbatchresultDAO.selectComtnbatchresult(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNBATCHRESULT 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNBATCHRESULT 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnbatchresultList(ComtnbatchresultVO vo) throws Exception {
        return comtnbatchresultDAO.selectComtnbatchresultList(vo);
    }

    /**
	 * COMTNBATCHRESULT 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNBATCHRESULT 총 갯수
	 * @exception
	 */
    public int selectComtnbatchresultListTotCnt(ComtnbatchresultVO vo) {
		return comtnbatchresultDAO.selectComtnbatchresultListTotCnt(vo);
	}
    
}
