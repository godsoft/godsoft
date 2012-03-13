package kr.godsoft.egovframe.generatorwebapp.comtneventatdrn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtneventatdrn.service.ComtneventatdrnService;
import kr.godsoft.egovframe.generatorwebapp.comtneventatdrn.service.ComtneventatdrnDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtneventatdrn.service.ComtneventatdrnVO;
import kr.godsoft.egovframe.generatorwebapp.comtneventatdrn.service.impl.ComtneventatdrnDAO;

/**
 * @Class Name : ComtneventatdrnServiceImpl.java
 * @Description : Comtneventatdrn Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtneventatdrnService")
public class ComtneventatdrnServiceImpl extends AbstractServiceImpl implements
        ComtneventatdrnService {

    @Resource(name="comtneventatdrnDAO")
    private ComtneventatdrnDAO comtneventatdrnDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtneventatdrnIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtneventatdrn을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtneventatdrnVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtneventatdrn(ComtneventatdrnVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtneventatdrnDAO.insertComtneventatdrn(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtneventatdrn을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtneventatdrnVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtneventatdrn(ComtneventatdrnVO vo) throws Exception {
        comtneventatdrnDAO.updateComtneventatdrn(vo);
    }

    /**
	 * comtneventatdrn을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtneventatdrnVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtneventatdrn(ComtneventatdrnVO vo) throws Exception {
        comtneventatdrnDAO.deleteComtneventatdrn(vo);
    }

    /**
	 * comtneventatdrn을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtneventatdrnVO
	 * @return 조회한 comtneventatdrn
	 * @exception Exception
	 */
    public ComtneventatdrnVO selectComtneventatdrn(ComtneventatdrnVO vo) throws Exception {
        ComtneventatdrnVO resultVO = comtneventatdrnDAO.selectComtneventatdrn(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtneventatdrn 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtneventatdrn 목록
	 * @exception Exception
	 */
    public List selectComtneventatdrnList(ComtneventatdrnDefaultVO searchVO) throws Exception {
        return comtneventatdrnDAO.selectComtneventatdrnList(searchVO);
    }

    /**
	 * comtneventatdrn 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtneventatdrn 총 갯수
	 * @exception
	 */
    public int selectComtneventatdrnListTotCnt(ComtneventatdrnDefaultVO searchVO) {
		return comtneventatdrnDAO.selectComtneventatdrnListTotCnt(searchVO);
	}
    
}
