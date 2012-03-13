package kr.godsoft.egovframe.generatorwebapp.comtnsms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnsms.service.ComtnsmsService;
import kr.godsoft.egovframe.generatorwebapp.comtnsms.service.ComtnsmsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnsms.service.ComtnsmsVO;
import kr.godsoft.egovframe.generatorwebapp.comtnsms.service.impl.ComtnsmsDAO;

/**
 * @Class Name : ComtnsmsServiceImpl.java
 * @Description : Comtnsms Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnsmsService")
public class ComtnsmsServiceImpl extends AbstractServiceImpl implements
        ComtnsmsService {

    @Resource(name="comtnsmsDAO")
    private ComtnsmsDAO comtnsmsDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnsmsIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnsms을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnsmsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnsms(ComtnsmsVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnsmsDAO.insertComtnsms(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnsms을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnsmsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnsms(ComtnsmsVO vo) throws Exception {
        comtnsmsDAO.updateComtnsms(vo);
    }

    /**
	 * comtnsms을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnsmsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnsms(ComtnsmsVO vo) throws Exception {
        comtnsmsDAO.deleteComtnsms(vo);
    }

    /**
	 * comtnsms을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnsmsVO
	 * @return 조회한 comtnsms
	 * @exception Exception
	 */
    public ComtnsmsVO selectComtnsms(ComtnsmsVO vo) throws Exception {
        ComtnsmsVO resultVO = comtnsmsDAO.selectComtnsms(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnsms 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnsms 목록
	 * @exception Exception
	 */
    public List selectComtnsmsList(ComtnsmsDefaultVO searchVO) throws Exception {
        return comtnsmsDAO.selectComtnsmsList(searchVO);
    }

    /**
	 * comtnsms 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnsms 총 갯수
	 * @exception
	 */
    public int selectComtnsmsListTotCnt(ComtnsmsDefaultVO searchVO) {
		return comtnsmsDAO.selectComtnsmsListTotCnt(searchVO);
	}
    
}
