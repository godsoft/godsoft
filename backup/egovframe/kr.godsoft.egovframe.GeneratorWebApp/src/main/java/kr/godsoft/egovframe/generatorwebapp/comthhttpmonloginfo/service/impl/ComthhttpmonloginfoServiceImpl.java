package kr.godsoft.egovframe.generatorwebapp.comthhttpmonloginfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comthhttpmonloginfo.service.ComthhttpmonloginfoService;
import kr.godsoft.egovframe.generatorwebapp.comthhttpmonloginfo.service.ComthhttpmonloginfoVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComthhttpmonloginfoServiceImpl.java
 * @Description : Comthhttpmonloginfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comthhttpmonloginfoService")
public class ComthhttpmonloginfoServiceImpl extends AbstractServiceImpl implements
        ComthhttpmonloginfoService {

    @Resource(name="comthhttpmonloginfoDAO")
    private ComthhttpmonloginfoDAO comthhttpmonloginfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComthhttpmonloginfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTHHTTPMONLOGINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComthhttpmonloginfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComthhttpmonloginfo(ComthhttpmonloginfoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comthhttpmonloginfoDAO.insertComthhttpmonloginfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTHHTTPMONLOGINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComthhttpmonloginfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComthhttpmonloginfo(ComthhttpmonloginfoVO vo) throws Exception {
        comthhttpmonloginfoDAO.updateComthhttpmonloginfo(vo);
    }

    /**
	 * COMTHHTTPMONLOGINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComthhttpmonloginfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComthhttpmonloginfo(ComthhttpmonloginfoVO vo) throws Exception {
        comthhttpmonloginfoDAO.deleteComthhttpmonloginfo(vo);
    }

    /**
	 * COMTHHTTPMONLOGINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComthhttpmonloginfoVO
	 * @return 조회한 COMTHHTTPMONLOGINFO
	 * @exception Exception
	 */
    public ComthhttpmonloginfoVO selectComthhttpmonloginfo(ComthhttpmonloginfoVO vo) throws Exception {
        ComthhttpmonloginfoVO resultVO = comthhttpmonloginfoDAO.selectComthhttpmonloginfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTHHTTPMONLOGINFO 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTHHTTPMONLOGINFO 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComthhttpmonloginfoList(ComthhttpmonloginfoVO vo) throws Exception {
        return comthhttpmonloginfoDAO.selectComthhttpmonloginfoList(vo);
    }

    /**
	 * COMTHHTTPMONLOGINFO 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTHHTTPMONLOGINFO 총 갯수
	 * @exception
	 */
    public int selectComthhttpmonloginfoListTotCnt(ComthhttpmonloginfoVO vo) {
		return comthhttpmonloginfoDAO.selectComthhttpmonloginfoListTotCnt(vo);
	}
    
}
