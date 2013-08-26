package kr.godsoft.egovframe.generatorwebapp.comtntmplatinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtntmplatinfo.service.ComtntmplatinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtntmplatinfo.service.ComtntmplatinfoVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtntmplatinfoServiceImpl.java
 * @Description : Comtntmplatinfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtntmplatinfoService")
public class ComtntmplatinfoServiceImpl extends AbstractServiceImpl implements
        ComtntmplatinfoService {

    @Resource(name="comtntmplatinfoDAO")
    private ComtntmplatinfoDAO comtntmplatinfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtntmplatinfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNTMPLATINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtntmplatinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtntmplatinfo(ComtntmplatinfoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtntmplatinfoDAO.insertComtntmplatinfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNTMPLATINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtntmplatinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtntmplatinfo(ComtntmplatinfoVO vo) throws Exception {
        comtntmplatinfoDAO.updateComtntmplatinfo(vo);
    }

    /**
	 * COMTNTMPLATINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtntmplatinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtntmplatinfo(ComtntmplatinfoVO vo) throws Exception {
        comtntmplatinfoDAO.deleteComtntmplatinfo(vo);
    }

    /**
	 * COMTNTMPLATINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtntmplatinfoVO
	 * @return 조회한 COMTNTMPLATINFO
	 * @exception Exception
	 */
    public ComtntmplatinfoVO selectComtntmplatinfo(ComtntmplatinfoVO vo) throws Exception {
        ComtntmplatinfoVO resultVO = comtntmplatinfoDAO.selectComtntmplatinfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNTMPLATINFO 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNTMPLATINFO 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtntmplatinfoList(ComtntmplatinfoVO vo) throws Exception {
        return comtntmplatinfoDAO.selectComtntmplatinfoList(vo);
    }

    /**
	 * COMTNTMPLATINFO 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNTMPLATINFO 총 갯수
	 * @exception
	 */
    public int selectComtntmplatinfoListTotCnt(ComtntmplatinfoVO vo) {
		return comtntmplatinfoDAO.selectComtntmplatinfoListTotCnt(vo);
	}
    
}