package kr.godsoft.egovframe.generatorwebapp.comtczip.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtczip.service.ComtczipService;
import kr.godsoft.egovframe.generatorwebapp.comtczip.service.ComtczipVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtczipServiceImpl.java
 * @Description : Comtczip Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtczipService")
public class ComtczipServiceImpl extends AbstractServiceImpl implements
        ComtczipService {

    @Resource(name="comtczipDAO")
    private ComtczipDAO comtczipDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtczipIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTCZIP을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtczipVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtczip(ComtczipVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtczipDAO.insertComtczip(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTCZIP을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtczipVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtczip(ComtczipVO vo) throws Exception {
        comtczipDAO.updateComtczip(vo);
    }

    /**
	 * COMTCZIP을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtczipVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtczip(ComtczipVO vo) throws Exception {
        comtczipDAO.deleteComtczip(vo);
    }

    /**
	 * COMTCZIP을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtczipVO
	 * @return 조회한 COMTCZIP
	 * @exception Exception
	 */
    public ComtczipVO selectComtczip(ComtczipVO vo) throws Exception {
        ComtczipVO resultVO = comtczipDAO.selectComtczip(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTCZIP 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTCZIP 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtczipList(ComtczipVO vo) throws Exception {
        return comtczipDAO.selectComtczipList(vo);
    }

    /**
	 * COMTCZIP 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTCZIP 총 갯수
	 * @exception
	 */
    public int selectComtczipListTotCnt(ComtczipVO vo) {
		return comtczipDAO.selectComtczipListTotCnt(vo);
	}
    
}