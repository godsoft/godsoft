package kr.godsoft.egovframe.generatorwebapp.comtnsms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnsms.service.ComtnsmsService;
import kr.godsoft.egovframe.generatorwebapp.comtnsms.service.ComtnsmsVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnsmsServiceImpl.java
 * @Description : Comtnsms Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
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
	 * COMTNSMS을 등록한다.
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
	 * COMTNSMS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnsmsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnsms(ComtnsmsVO vo) throws Exception {
        comtnsmsDAO.updateComtnsms(vo);
    }

    /**
	 * COMTNSMS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnsmsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnsms(ComtnsmsVO vo) throws Exception {
        comtnsmsDAO.deleteComtnsms(vo);
    }

    /**
	 * COMTNSMS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnsmsVO
	 * @return 조회한 COMTNSMS
	 * @exception Exception
	 */
    public ComtnsmsVO selectComtnsms(ComtnsmsVO vo) throws Exception {
        ComtnsmsVO resultVO = comtnsmsDAO.selectComtnsms(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNSMS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNSMS 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnsmsList(ComtnsmsVO vo) throws Exception {
        return comtnsmsDAO.selectComtnsmsList(vo);
    }

    /**
	 * COMTNSMS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNSMS 총 갯수
	 * @exception
	 */
    public int selectComtnsmsListTotCnt(ComtnsmsVO vo) {
		return comtnsmsDAO.selectComtnsmsListTotCnt(vo);
	}
    
}