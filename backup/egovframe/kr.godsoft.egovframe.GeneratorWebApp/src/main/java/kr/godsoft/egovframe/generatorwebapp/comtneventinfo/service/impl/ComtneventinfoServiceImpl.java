package kr.godsoft.egovframe.generatorwebapp.comtneventinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtneventinfo.service.ComtneventinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtneventinfo.service.ComtneventinfoVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtneventinfoServiceImpl.java
 * @Description : Comtneventinfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtneventinfoService")
public class ComtneventinfoServiceImpl extends AbstractServiceImpl implements
        ComtneventinfoService {

    @Resource(name="comtneventinfoDAO")
    private ComtneventinfoDAO comtneventinfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtneventinfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNEVENTINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtneventinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtneventinfo(ComtneventinfoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtneventinfoDAO.insertComtneventinfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNEVENTINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtneventinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtneventinfo(ComtneventinfoVO vo) throws Exception {
        comtneventinfoDAO.updateComtneventinfo(vo);
    }

    /**
	 * COMTNEVENTINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtneventinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtneventinfo(ComtneventinfoVO vo) throws Exception {
        comtneventinfoDAO.deleteComtneventinfo(vo);
    }

    /**
	 * COMTNEVENTINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtneventinfoVO
	 * @return 조회한 COMTNEVENTINFO
	 * @exception Exception
	 */
    public ComtneventinfoVO selectComtneventinfo(ComtneventinfoVO vo) throws Exception {
        ComtneventinfoVO resultVO = comtneventinfoDAO.selectComtneventinfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNEVENTINFO 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNEVENTINFO 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtneventinfoList(ComtneventinfoVO vo) throws Exception {
        return comtneventinfoDAO.selectComtneventinfoList(vo);
    }

    /**
	 * COMTNEVENTINFO 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNEVENTINFO 총 갯수
	 * @exception
	 */
    public int selectComtneventinfoListTotCnt(ComtneventinfoVO vo) {
		return comtneventinfoDAO.selectComtneventinfoListTotCnt(vo);
	}
    
}
