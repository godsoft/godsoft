package kr.godsoft.egovframe.generatorwebapp.comtndeptjob.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtndeptjob.service.ComtndeptjobService;
import kr.godsoft.egovframe.generatorwebapp.comtndeptjob.service.ComtndeptjobVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtndeptjobServiceImpl.java
 * @Description : Comtndeptjob Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
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
	 * COMTNDEPTJOB을 등록한다.
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
	 * COMTNDEPTJOB을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtndeptjobVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtndeptjob(ComtndeptjobVO vo) throws Exception {
        comtndeptjobDAO.updateComtndeptjob(vo);
    }

    /**
	 * COMTNDEPTJOB을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtndeptjobVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtndeptjob(ComtndeptjobVO vo) throws Exception {
        comtndeptjobDAO.deleteComtndeptjob(vo);
    }

    /**
	 * COMTNDEPTJOB을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtndeptjobVO
	 * @return 조회한 COMTNDEPTJOB
	 * @exception Exception
	 */
    public ComtndeptjobVO selectComtndeptjob(ComtndeptjobVO vo) throws Exception {
        ComtndeptjobVO resultVO = comtndeptjobDAO.selectComtndeptjob(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNDEPTJOB 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNDEPTJOB 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtndeptjobList(ComtndeptjobVO vo) throws Exception {
        return comtndeptjobDAO.selectComtndeptjobList(vo);
    }

    /**
	 * COMTNDEPTJOB 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNDEPTJOB 총 갯수
	 * @exception
	 */
    public int selectComtndeptjobListTotCnt(ComtndeptjobVO vo) {
		return comtndeptjobDAO.selectComtndeptjobListTotCnt(vo);
	}
    
}
