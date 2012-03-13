package kr.godsoft.egovframe.generatorwebapp.comtndamknoifm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtndamknoifm.service.ComtndamknoifmService;
import kr.godsoft.egovframe.generatorwebapp.comtndamknoifm.service.ComtndamknoifmDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtndamknoifm.service.ComtndamknoifmVO;
import kr.godsoft.egovframe.generatorwebapp.comtndamknoifm.service.impl.ComtndamknoifmDAO;

/**
 * @Class Name : ComtndamknoifmServiceImpl.java
 * @Description : Comtndamknoifm Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtndamknoifmService")
public class ComtndamknoifmServiceImpl extends AbstractServiceImpl implements
        ComtndamknoifmService {

    @Resource(name="comtndamknoifmDAO")
    private ComtndamknoifmDAO comtndamknoifmDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtndamknoifmIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtndamknoifm을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtndamknoifmVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtndamknoifm(ComtndamknoifmVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtndamknoifmDAO.insertComtndamknoifm(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtndamknoifm을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtndamknoifmVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtndamknoifm(ComtndamknoifmVO vo) throws Exception {
        comtndamknoifmDAO.updateComtndamknoifm(vo);
    }

    /**
	 * comtndamknoifm을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtndamknoifmVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtndamknoifm(ComtndamknoifmVO vo) throws Exception {
        comtndamknoifmDAO.deleteComtndamknoifm(vo);
    }

    /**
	 * comtndamknoifm을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtndamknoifmVO
	 * @return 조회한 comtndamknoifm
	 * @exception Exception
	 */
    public ComtndamknoifmVO selectComtndamknoifm(ComtndamknoifmVO vo) throws Exception {
        ComtndamknoifmVO resultVO = comtndamknoifmDAO.selectComtndamknoifm(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtndamknoifm 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtndamknoifm 목록
	 * @exception Exception
	 */
    public List selectComtndamknoifmList(ComtndamknoifmDefaultVO searchVO) throws Exception {
        return comtndamknoifmDAO.selectComtndamknoifmList(searchVO);
    }

    /**
	 * comtndamknoifm 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtndamknoifm 총 갯수
	 * @exception
	 */
    public int selectComtndamknoifmListTotCnt(ComtndamknoifmDefaultVO searchVO) {
		return comtndamknoifmDAO.selectComtndamknoifmListTotCnt(searchVO);
	}
    
}