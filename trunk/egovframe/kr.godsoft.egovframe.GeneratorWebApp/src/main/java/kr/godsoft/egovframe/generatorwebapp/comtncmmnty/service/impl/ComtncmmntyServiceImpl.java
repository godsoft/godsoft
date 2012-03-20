package kr.godsoft.egovframe.generatorwebapp.comtncmmnty.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtncmmnty.service.ComtncmmntyService;
import kr.godsoft.egovframe.generatorwebapp.comtncmmnty.service.ComtncmmntyVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtncmmntyServiceImpl.java
 * @Description : Comtncmmnty Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtncmmntyService")
public class ComtncmmntyServiceImpl extends AbstractServiceImpl implements
        ComtncmmntyService {

    @Resource(name="comtncmmntyDAO")
    private ComtncmmntyDAO comtncmmntyDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtncmmntyIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtncmmnty을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtncmmntyVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtncmmnty(ComtncmmntyVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtncmmntyDAO.insertComtncmmnty(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtncmmnty을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtncmmntyVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtncmmnty(ComtncmmntyVO vo) throws Exception {
        comtncmmntyDAO.updateComtncmmnty(vo);
    }

    /**
	 * comtncmmnty을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtncmmntyVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtncmmnty(ComtncmmntyVO vo) throws Exception {
        comtncmmntyDAO.deleteComtncmmnty(vo);
    }

    /**
	 * comtncmmnty을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtncmmntyVO
	 * @return 조회한 comtncmmnty
	 * @exception Exception
	 */
    public ComtncmmntyVO selectComtncmmnty(ComtncmmntyVO vo) throws Exception {
        ComtncmmntyVO resultVO = comtncmmntyDAO.selectComtncmmnty(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtncmmnty 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtncmmnty 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtncmmntyList(ComtncmmntyVO vo) throws Exception {
        return comtncmmntyDAO.selectComtncmmntyList(vo);
    }

    /**
	 * comtncmmnty 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtncmmnty 총 갯수
	 * @exception
	 */
    public int selectComtncmmntyListTotCnt(ComtncmmntyVO vo) {
		return comtncmmntyDAO.selectComtncmmntyListTotCnt(vo);
	}
    
}
