package kr.godsoft.egovframe.generatorwebapp.comtnrecentsrchwrd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnrecentsrchwrd.service.ComtnrecentsrchwrdService;
import kr.godsoft.egovframe.generatorwebapp.comtnrecentsrchwrd.service.ComtnrecentsrchwrdVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnrecentsrchwrdServiceImpl.java
 * @Description : Comtnrecentsrchwrd Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnrecentsrchwrdService")
public class ComtnrecentsrchwrdServiceImpl extends AbstractServiceImpl implements
        ComtnrecentsrchwrdService {

    @Resource(name="comtnrecentsrchwrdDAO")
    private ComtnrecentsrchwrdDAO comtnrecentsrchwrdDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnrecentsrchwrdIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNRECENTSRCHWRD을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnrecentsrchwrdVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnrecentsrchwrd(ComtnrecentsrchwrdVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnrecentsrchwrdDAO.insertComtnrecentsrchwrd(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNRECENTSRCHWRD을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnrecentsrchwrdVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnrecentsrchwrd(ComtnrecentsrchwrdVO vo) throws Exception {
        comtnrecentsrchwrdDAO.updateComtnrecentsrchwrd(vo);
    }

    /**
	 * COMTNRECENTSRCHWRD을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnrecentsrchwrdVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnrecentsrchwrd(ComtnrecentsrchwrdVO vo) throws Exception {
        comtnrecentsrchwrdDAO.deleteComtnrecentsrchwrd(vo);
    }

    /**
	 * COMTNRECENTSRCHWRD을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnrecentsrchwrdVO
	 * @return 조회한 COMTNRECENTSRCHWRD
	 * @exception Exception
	 */
    public ComtnrecentsrchwrdVO selectComtnrecentsrchwrd(ComtnrecentsrchwrdVO vo) throws Exception {
        ComtnrecentsrchwrdVO resultVO = comtnrecentsrchwrdDAO.selectComtnrecentsrchwrd(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNRECENTSRCHWRD 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNRECENTSRCHWRD 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnrecentsrchwrdList(ComtnrecentsrchwrdVO vo) throws Exception {
        return comtnrecentsrchwrdDAO.selectComtnrecentsrchwrdList(vo);
    }

    /**
	 * COMTNRECENTSRCHWRD 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNRECENTSRCHWRD 총 갯수
	 * @exception
	 */
    public int selectComtnrecentsrchwrdListTotCnt(ComtnrecentsrchwrdVO vo) {
		return comtnrecentsrchwrdDAO.selectComtnrecentsrchwrdListTotCnt(vo);
	}
    
}
