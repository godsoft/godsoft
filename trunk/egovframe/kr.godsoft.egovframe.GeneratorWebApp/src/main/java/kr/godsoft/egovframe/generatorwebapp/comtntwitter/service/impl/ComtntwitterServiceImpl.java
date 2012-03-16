package kr.godsoft.egovframe.generatorwebapp.comtntwitter.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtntwitter.service.ComtntwitterService;
import kr.godsoft.egovframe.generatorwebapp.comtntwitter.service.ComtntwitterVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtntwitterServiceImpl.java
 * @Description : Comtntwitter Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtntwitterService")
public class ComtntwitterServiceImpl extends AbstractServiceImpl implements
        ComtntwitterService {

    @Resource(name="comtntwitterDAO")
    private ComtntwitterDAO comtntwitterDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtntwitterIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtntwitter을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtntwitterVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtntwitter(ComtntwitterVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtntwitterDAO.insertComtntwitter(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtntwitter을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtntwitterVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtntwitter(ComtntwitterVO vo) throws Exception {
        comtntwitterDAO.updateComtntwitter(vo);
    }

    /**
	 * comtntwitter을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtntwitterVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtntwitter(ComtntwitterVO vo) throws Exception {
        comtntwitterDAO.deleteComtntwitter(vo);
    }

    /**
	 * comtntwitter을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtntwitterVO
	 * @return 조회한 comtntwitter
	 * @exception Exception
	 */
    public ComtntwitterVO selectComtntwitter(ComtntwitterVO vo) throws Exception {
        ComtntwitterVO resultVO = comtntwitterDAO.selectComtntwitter(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtntwitter 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtntwitter 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtntwitterList(ComtntwitterVO vo) throws Exception {
        return comtntwitterDAO.selectComtntwitterList(vo);
    }

    /**
	 * comtntwitter 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtntwitter 총 갯수
	 * @exception
	 */
    public int selectComtntwitterListTotCnt(ComtntwitterVO vo) {
		return comtntwitterDAO.selectComtntwitterListTotCnt(vo);
	}
    
}
