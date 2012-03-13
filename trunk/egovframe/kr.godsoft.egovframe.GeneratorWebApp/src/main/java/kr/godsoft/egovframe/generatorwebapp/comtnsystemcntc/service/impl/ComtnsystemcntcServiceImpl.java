package kr.godsoft.egovframe.generatorwebapp.comtnsystemcntc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnsystemcntc.service.ComtnsystemcntcService;
import kr.godsoft.egovframe.generatorwebapp.comtnsystemcntc.service.ComtnsystemcntcDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnsystemcntc.service.ComtnsystemcntcVO;
import kr.godsoft.egovframe.generatorwebapp.comtnsystemcntc.service.impl.ComtnsystemcntcDAO;

/**
 * @Class Name : ComtnsystemcntcServiceImpl.java
 * @Description : Comtnsystemcntc Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnsystemcntcService")
public class ComtnsystemcntcServiceImpl extends AbstractServiceImpl implements
        ComtnsystemcntcService {

    @Resource(name="comtnsystemcntcDAO")
    private ComtnsystemcntcDAO comtnsystemcntcDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnsystemcntcIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnsystemcntc을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnsystemcntcVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnsystemcntc(ComtnsystemcntcVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnsystemcntcDAO.insertComtnsystemcntc(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnsystemcntc을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnsystemcntcVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnsystemcntc(ComtnsystemcntcVO vo) throws Exception {
        comtnsystemcntcDAO.updateComtnsystemcntc(vo);
    }

    /**
	 * comtnsystemcntc을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnsystemcntcVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnsystemcntc(ComtnsystemcntcVO vo) throws Exception {
        comtnsystemcntcDAO.deleteComtnsystemcntc(vo);
    }

    /**
	 * comtnsystemcntc을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnsystemcntcVO
	 * @return 조회한 comtnsystemcntc
	 * @exception Exception
	 */
    public ComtnsystemcntcVO selectComtnsystemcntc(ComtnsystemcntcVO vo) throws Exception {
        ComtnsystemcntcVO resultVO = comtnsystemcntcDAO.selectComtnsystemcntc(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnsystemcntc 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnsystemcntc 목록
	 * @exception Exception
	 */
    public List selectComtnsystemcntcList(ComtnsystemcntcDefaultVO searchVO) throws Exception {
        return comtnsystemcntcDAO.selectComtnsystemcntcList(searchVO);
    }

    /**
	 * comtnsystemcntc 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnsystemcntc 총 갯수
	 * @exception
	 */
    public int selectComtnsystemcntcListTotCnt(ComtnsystemcntcDefaultVO searchVO) {
		return comtnsystemcntcDAO.selectComtnsystemcntcListTotCnt(searchVO);
	}
    
}
