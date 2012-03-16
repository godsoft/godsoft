package kr.godsoft.egovframe.generatorwebapp.comtncntcmessage.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtncntcmessage.service.ComtncntcmessageService;
import kr.godsoft.egovframe.generatorwebapp.comtncntcmessage.service.ComtncntcmessageVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtncntcmessageServiceImpl.java
 * @Description : Comtncntcmessage Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtncntcmessageService")
public class ComtncntcmessageServiceImpl extends AbstractServiceImpl implements
        ComtncntcmessageService {

    @Resource(name="comtncntcmessageDAO")
    private ComtncntcmessageDAO comtncntcmessageDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtncntcmessageIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtncntcmessage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtncntcmessageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtncntcmessage(ComtncntcmessageVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtncntcmessageDAO.insertComtncntcmessage(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtncntcmessage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtncntcmessageVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtncntcmessage(ComtncntcmessageVO vo) throws Exception {
        comtncntcmessageDAO.updateComtncntcmessage(vo);
    }

    /**
	 * comtncntcmessage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtncntcmessageVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtncntcmessage(ComtncntcmessageVO vo) throws Exception {
        comtncntcmessageDAO.deleteComtncntcmessage(vo);
    }

    /**
	 * comtncntcmessage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtncntcmessageVO
	 * @return 조회한 comtncntcmessage
	 * @exception Exception
	 */
    public ComtncntcmessageVO selectComtncntcmessage(ComtncntcmessageVO vo) throws Exception {
        ComtncntcmessageVO resultVO = comtncntcmessageDAO.selectComtncntcmessage(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtncntcmessage 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtncntcmessage 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtncntcmessageList(ComtncntcmessageVO vo) throws Exception {
        return comtncntcmessageDAO.selectComtncntcmessageList(vo);
    }

    /**
	 * comtncntcmessage 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtncntcmessage 총 갯수
	 * @exception
	 */
    public int selectComtncntcmessageListTotCnt(ComtncntcmessageVO vo) {
		return comtncntcmessageDAO.selectComtncntcmessageListTotCnt(vo);
	}
    
}
