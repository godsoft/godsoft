package kr.godsoft.egovframe.generatorwebapp.comtrdnmadrzip.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtrdnmadrzip.service.ComtrdnmadrzipService;
import kr.godsoft.egovframe.generatorwebapp.comtrdnmadrzip.service.ComtrdnmadrzipDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtrdnmadrzip.service.ComtrdnmadrzipVO;
import kr.godsoft.egovframe.generatorwebapp.comtrdnmadrzip.service.impl.ComtrdnmadrzipDAO;

/**
 * @Class Name : ComtrdnmadrzipServiceImpl.java
 * @Description : Comtrdnmadrzip Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
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
	 * comtrdnmadrzip을 등록한다.
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
	 * comtrdnmadrzip을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtrdnmadrzipVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtrdnmadrzip(ComtrdnmadrzipVO vo) throws Exception {
        comtrdnmadrzipDAO.updateComtrdnmadrzip(vo);
    }

    /**
	 * comtrdnmadrzip을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtrdnmadrzipVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtrdnmadrzip(ComtrdnmadrzipVO vo) throws Exception {
        comtrdnmadrzipDAO.deleteComtrdnmadrzip(vo);
    }

    /**
	 * comtrdnmadrzip을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtrdnmadrzipVO
	 * @return 조회한 comtrdnmadrzip
	 * @exception Exception
	 */
    public ComtrdnmadrzipVO selectComtrdnmadrzip(ComtrdnmadrzipVO vo) throws Exception {
        ComtrdnmadrzipVO resultVO = comtrdnmadrzipDAO.selectComtrdnmadrzip(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtrdnmadrzip 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtrdnmadrzip 목록
	 * @exception Exception
	 */
    public List selectComtrdnmadrzipList(ComtrdnmadrzipDefaultVO searchVO) throws Exception {
        return comtrdnmadrzipDAO.selectComtrdnmadrzipList(searchVO);
    }

    /**
	 * comtrdnmadrzip 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtrdnmadrzip 총 갯수
	 * @exception
	 */
    public int selectComtrdnmadrzipListTotCnt(ComtrdnmadrzipDefaultVO searchVO) {
		return comtrdnmadrzipDAO.selectComtrdnmadrzipListTotCnt(searchVO);
	}
    
}