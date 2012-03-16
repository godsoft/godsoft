package kr.godsoft.egovframe.generatorwebapp.comthconfmhistory.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comthconfmhistory.service.ComthconfmhistoryService;
import kr.godsoft.egovframe.generatorwebapp.comthconfmhistory.service.ComthconfmhistoryVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComthconfmhistoryServiceImpl.java
 * @Description : Comthconfmhistory Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comthconfmhistoryService")
public class ComthconfmhistoryServiceImpl extends AbstractServiceImpl implements
        ComthconfmhistoryService {

    @Resource(name="comthconfmhistoryDAO")
    private ComthconfmhistoryDAO comthconfmhistoryDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComthconfmhistoryIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comthconfmhistory을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComthconfmhistoryVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComthconfmhistory(ComthconfmhistoryVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comthconfmhistoryDAO.insertComthconfmhistory(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comthconfmhistory을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComthconfmhistoryVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComthconfmhistory(ComthconfmhistoryVO vo) throws Exception {
        comthconfmhistoryDAO.updateComthconfmhistory(vo);
    }

    /**
	 * comthconfmhistory을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComthconfmhistoryVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComthconfmhistory(ComthconfmhistoryVO vo) throws Exception {
        comthconfmhistoryDAO.deleteComthconfmhistory(vo);
    }

    /**
	 * comthconfmhistory을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComthconfmhistoryVO
	 * @return 조회한 comthconfmhistory
	 * @exception Exception
	 */
    public ComthconfmhistoryVO selectComthconfmhistory(ComthconfmhistoryVO vo) throws Exception {
        ComthconfmhistoryVO resultVO = comthconfmhistoryDAO.selectComthconfmhistory(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comthconfmhistory 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comthconfmhistory 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComthconfmhistoryList(ComthconfmhistoryVO vo) throws Exception {
        return comthconfmhistoryDAO.selectComthconfmhistoryList(vo);
    }

    /**
	 * comthconfmhistory 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comthconfmhistory 총 갯수
	 * @exception
	 */
    public int selectComthconfmhistoryListTotCnt(ComthconfmhistoryVO vo) {
		return comthconfmhistoryDAO.selectComthconfmhistoryListTotCnt(vo);
	}
    
}
