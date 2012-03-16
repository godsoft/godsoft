package kr.godsoft.egovframe.generatorwebapp.comtnentrprsmber.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnentrprsmber.service.ComtnentrprsmberService;
import kr.godsoft.egovframe.generatorwebapp.comtnentrprsmber.service.ComtnentrprsmberVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnentrprsmberServiceImpl.java
 * @Description : Comtnentrprsmber Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnentrprsmberService")
public class ComtnentrprsmberServiceImpl extends AbstractServiceImpl implements
        ComtnentrprsmberService {

    @Resource(name="comtnentrprsmberDAO")
    private ComtnentrprsmberDAO comtnentrprsmberDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnentrprsmberIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnentrprsmber을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnentrprsmberVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnentrprsmber(ComtnentrprsmberVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnentrprsmberDAO.insertComtnentrprsmber(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnentrprsmber을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnentrprsmberVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnentrprsmber(ComtnentrprsmberVO vo) throws Exception {
        comtnentrprsmberDAO.updateComtnentrprsmber(vo);
    }

    /**
	 * comtnentrprsmber을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnentrprsmberVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnentrprsmber(ComtnentrprsmberVO vo) throws Exception {
        comtnentrprsmberDAO.deleteComtnentrprsmber(vo);
    }

    /**
	 * comtnentrprsmber을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnentrprsmberVO
	 * @return 조회한 comtnentrprsmber
	 * @exception Exception
	 */
    public ComtnentrprsmberVO selectComtnentrprsmber(ComtnentrprsmberVO vo) throws Exception {
        ComtnentrprsmberVO resultVO = comtnentrprsmberDAO.selectComtnentrprsmber(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnentrprsmber 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnentrprsmber 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnentrprsmberList(ComtnentrprsmberVO vo) throws Exception {
        return comtnentrprsmberDAO.selectComtnentrprsmberList(vo);
    }

    /**
	 * comtnentrprsmber 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnentrprsmber 총 갯수
	 * @exception
	 */
    public int selectComtnentrprsmberListTotCnt(ComtnentrprsmberVO vo) {
		return comtnentrprsmberDAO.selectComtnentrprsmberListTotCnt(vo);
	}
    
}
