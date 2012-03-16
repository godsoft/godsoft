package kr.godsoft.egovframe.generatorwebapp.comtnntwrkinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnntwrkinfo.service.ComtnntwrkinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnntwrkinfo.service.ComtnntwrkinfoVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnntwrkinfoServiceImpl.java
 * @Description : Comtnntwrkinfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnntwrkinfoService")
public class ComtnntwrkinfoServiceImpl extends AbstractServiceImpl implements
        ComtnntwrkinfoService {

    @Resource(name="comtnntwrkinfoDAO")
    private ComtnntwrkinfoDAO comtnntwrkinfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnntwrkinfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnntwrkinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnntwrkinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnntwrkinfo(ComtnntwrkinfoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnntwrkinfoDAO.insertComtnntwrkinfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnntwrkinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnntwrkinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnntwrkinfo(ComtnntwrkinfoVO vo) throws Exception {
        comtnntwrkinfoDAO.updateComtnntwrkinfo(vo);
    }

    /**
	 * comtnntwrkinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnntwrkinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnntwrkinfo(ComtnntwrkinfoVO vo) throws Exception {
        comtnntwrkinfoDAO.deleteComtnntwrkinfo(vo);
    }

    /**
	 * comtnntwrkinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnntwrkinfoVO
	 * @return 조회한 comtnntwrkinfo
	 * @exception Exception
	 */
    public ComtnntwrkinfoVO selectComtnntwrkinfo(ComtnntwrkinfoVO vo) throws Exception {
        ComtnntwrkinfoVO resultVO = comtnntwrkinfoDAO.selectComtnntwrkinfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnntwrkinfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnntwrkinfo 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnntwrkinfoList(ComtnntwrkinfoVO vo) throws Exception {
        return comtnntwrkinfoDAO.selectComtnntwrkinfoList(vo);
    }

    /**
	 * comtnntwrkinfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnntwrkinfo 총 갯수
	 * @exception
	 */
    public int selectComtnntwrkinfoListTotCnt(ComtnntwrkinfoVO vo) {
		return comtnntwrkinfoDAO.selectComtnntwrkinfoListTotCnt(vo);
	}
    
}
