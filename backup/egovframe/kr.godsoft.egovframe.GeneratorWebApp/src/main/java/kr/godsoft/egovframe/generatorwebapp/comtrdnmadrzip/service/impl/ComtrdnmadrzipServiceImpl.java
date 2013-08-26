package kr.godsoft.egovframe.generatorwebapp.comtrdnmadrzip.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtrdnmadrzip.service.ComtrdnmadrzipService;
import kr.godsoft.egovframe.generatorwebapp.comtrdnmadrzip.service.ComtrdnmadrzipVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtrdnmadrzipServiceImpl.java
 * @Description : Comtrdnmadrzip Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtrdnmadrzipService")
public class ComtrdnmadrzipServiceImpl extends AbstractServiceImpl implements
        ComtrdnmadrzipService {

    @Resource(name="comtrdnmadrzipDAO")
    private ComtrdnmadrzipDAO comtrdnmadrzipDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtrdnmadrzipIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTRDNMADRZIP을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtrdnmadrzipVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtrdnmadrzip(ComtrdnmadrzipVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtrdnmadrzipDAO.insertComtrdnmadrzip(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTRDNMADRZIP을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtrdnmadrzipVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtrdnmadrzip(ComtrdnmadrzipVO vo) throws Exception {
        comtrdnmadrzipDAO.updateComtrdnmadrzip(vo);
    }

    /**
	 * COMTRDNMADRZIP을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtrdnmadrzipVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtrdnmadrzip(ComtrdnmadrzipVO vo) throws Exception {
        comtrdnmadrzipDAO.deleteComtrdnmadrzip(vo);
    }

    /**
	 * COMTRDNMADRZIP을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtrdnmadrzipVO
	 * @return 조회한 COMTRDNMADRZIP
	 * @exception Exception
	 */
    public ComtrdnmadrzipVO selectComtrdnmadrzip(ComtrdnmadrzipVO vo) throws Exception {
        ComtrdnmadrzipVO resultVO = comtrdnmadrzipDAO.selectComtrdnmadrzip(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTRDNMADRZIP 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTRDNMADRZIP 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtrdnmadrzipList(ComtrdnmadrzipVO vo) throws Exception {
        return comtrdnmadrzipDAO.selectComtrdnmadrzipList(vo);
    }

    /**
	 * COMTRDNMADRZIP 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTRDNMADRZIP 총 갯수
	 * @exception
	 */
    public int selectComtrdnmadrzipListTotCnt(ComtrdnmadrzipVO vo) {
		return comtrdnmadrzipDAO.selectComtrdnmadrzipListTotCnt(vo);
	}
    
}