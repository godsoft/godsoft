package kr.godsoft.egovframe.generatorwebapp.comtnnewsinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnnewsinfo.service.ComtnnewsinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnnewsinfo.service.ComtnnewsinfoVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnnewsinfoServiceImpl.java
 * @Description : Comtnnewsinfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnnewsinfoService")
public class ComtnnewsinfoServiceImpl extends AbstractServiceImpl implements
        ComtnnewsinfoService {

    @Resource(name="comtnnewsinfoDAO")
    private ComtnnewsinfoDAO comtnnewsinfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnnewsinfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNNEWSINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnnewsinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnnewsinfo(ComtnnewsinfoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnnewsinfoDAO.insertComtnnewsinfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNNEWSINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnnewsinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnnewsinfo(ComtnnewsinfoVO vo) throws Exception {
        comtnnewsinfoDAO.updateComtnnewsinfo(vo);
    }

    /**
	 * COMTNNEWSINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnnewsinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnnewsinfo(ComtnnewsinfoVO vo) throws Exception {
        comtnnewsinfoDAO.deleteComtnnewsinfo(vo);
    }

    /**
	 * COMTNNEWSINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnnewsinfoVO
	 * @return 조회한 COMTNNEWSINFO
	 * @exception Exception
	 */
    public ComtnnewsinfoVO selectComtnnewsinfo(ComtnnewsinfoVO vo) throws Exception {
        ComtnnewsinfoVO resultVO = comtnnewsinfoDAO.selectComtnnewsinfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNNEWSINFO 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNNEWSINFO 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnnewsinfoList(ComtnnewsinfoVO vo) throws Exception {
        return comtnnewsinfoDAO.selectComtnnewsinfoList(vo);
    }

    /**
	 * COMTNNEWSINFO 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNNEWSINFO 총 갯수
	 * @exception
	 */
    public int selectComtnnewsinfoListTotCnt(ComtnnewsinfoVO vo) {
		return comtnnewsinfoDAO.selectComtnnewsinfoListTotCnt(vo);
	}
    
}
