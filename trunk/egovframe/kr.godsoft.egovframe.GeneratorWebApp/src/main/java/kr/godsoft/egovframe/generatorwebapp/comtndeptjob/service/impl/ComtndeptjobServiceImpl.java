package kr.godsoft.egovframe.generatorwebapp.comtndeptjob.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtndeptjob.service.ComtndeptjobService;
import kr.godsoft.egovframe.generatorwebapp.comtndeptjob.service.ComtndeptjobDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtndeptjob.service.ComtndeptjobVO;
import kr.godsoft.egovframe.generatorwebapp.comtndeptjob.service.impl.ComtndeptjobDAO;

/**
 * @Class Name : ComtndeptjobServiceImpl.java
 * @Description : Comtndeptjob Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtndeptjobService")
public class ComtndeptjobServiceImpl extends AbstractServiceImpl implements
        ComtndeptjobService {

    @Resource(name="comtndeptjobDAO")
    private ComtndeptjobDAO comtndeptjobDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtndeptjobIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtndeptjob을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtndeptjobVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtndeptjob(ComtndeptjobVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtndeptjobDAO.insertComtndeptjob(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtndeptjob을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtndeptjobVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtndeptjob(ComtndeptjobVO vo) throws Exception {
        comtndeptjobDAO.updateComtndeptjob(vo);
    }

    /**
	 * comtndeptjob을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtndeptjobVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtndeptjob(ComtndeptjobVO vo) throws Exception {
        comtndeptjobDAO.deleteComtndeptjob(vo);
    }

    /**
	 * comtndeptjob을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtndeptjobVO
	 * @return 조회한 comtndeptjob
	 * @exception Exception
	 */
    public ComtndeptjobVO selectComtndeptjob(ComtndeptjobVO vo) throws Exception {
        ComtndeptjobVO resultVO = comtndeptjobDAO.selectComtndeptjob(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtndeptjob 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtndeptjob 목록
	 * @exception Exception
	 */
    public List selectComtndeptjobList(ComtndeptjobDefaultVO searchVO) throws Exception {
        return comtndeptjobDAO.selectComtndeptjobList(searchVO);
    }

    /**
	 * comtndeptjob 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtndeptjob 총 갯수
	 * @exception
	 */
    public int selectComtndeptjobListTotCnt(ComtndeptjobDefaultVO searchVO) {
		return comtndeptjobDAO.selectComtndeptjobListTotCnt(searchVO);
	}
    
}
