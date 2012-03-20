package kr.godsoft.egovframe.generatorwebapp.comtndtausestats.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtndtausestats.service.ComtndtausestatsService;
import kr.godsoft.egovframe.generatorwebapp.comtndtausestats.service.ComtndtausestatsVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtndtausestatsServiceImpl.java
 * @Description : Comtndtausestats Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtndtausestatsService")
public class ComtndtausestatsServiceImpl extends AbstractServiceImpl implements
        ComtndtausestatsService {

    @Resource(name="comtndtausestatsDAO")
    private ComtndtausestatsDAO comtndtausestatsDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtndtausestatsIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtndtausestats을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtndtausestatsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtndtausestats(ComtndtausestatsVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtndtausestatsDAO.insertComtndtausestats(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtndtausestats을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtndtausestatsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtndtausestats(ComtndtausestatsVO vo) throws Exception {
        comtndtausestatsDAO.updateComtndtausestats(vo);
    }

    /**
	 * comtndtausestats을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtndtausestatsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtndtausestats(ComtndtausestatsVO vo) throws Exception {
        comtndtausestatsDAO.deleteComtndtausestats(vo);
    }

    /**
	 * comtndtausestats을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtndtausestatsVO
	 * @return 조회한 comtndtausestats
	 * @exception Exception
	 */
    public ComtndtausestatsVO selectComtndtausestats(ComtndtausestatsVO vo) throws Exception {
        ComtndtausestatsVO resultVO = comtndtausestatsDAO.selectComtndtausestats(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtndtausestats 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtndtausestats 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtndtausestatsList(ComtndtausestatsVO vo) throws Exception {
        return comtndtausestatsDAO.selectComtndtausestatsList(vo);
    }

    /**
	 * comtndtausestats 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtndtausestats 총 갯수
	 * @exception
	 */
    public int selectComtndtausestatsListTotCnt(ComtndtausestatsVO vo) {
		return comtndtausestatsDAO.selectComtndtausestatsListTotCnt(vo);
	}
    
}
