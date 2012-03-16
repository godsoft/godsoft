package kr.godsoft.egovframe.generatorwebapp.comtnauthorinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnauthorinfo.service.ComtnauthorinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnauthorinfo.service.ComtnauthorinfoVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnauthorinfoServiceImpl.java
 * @Description : Comtnauthorinfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnauthorinfoService")
public class ComtnauthorinfoServiceImpl extends AbstractServiceImpl implements
        ComtnauthorinfoService {

    @Resource(name="comtnauthorinfoDAO")
    private ComtnauthorinfoDAO comtnauthorinfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnauthorinfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnauthorinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnauthorinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnauthorinfo(ComtnauthorinfoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnauthorinfoDAO.insertComtnauthorinfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnauthorinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnauthorinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnauthorinfo(ComtnauthorinfoVO vo) throws Exception {
        comtnauthorinfoDAO.updateComtnauthorinfo(vo);
    }

    /**
	 * comtnauthorinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnauthorinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnauthorinfo(ComtnauthorinfoVO vo) throws Exception {
        comtnauthorinfoDAO.deleteComtnauthorinfo(vo);
    }

    /**
	 * comtnauthorinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnauthorinfoVO
	 * @return 조회한 comtnauthorinfo
	 * @exception Exception
	 */
    public ComtnauthorinfoVO selectComtnauthorinfo(ComtnauthorinfoVO vo) throws Exception {
        ComtnauthorinfoVO resultVO = comtnauthorinfoDAO.selectComtnauthorinfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnauthorinfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnauthorinfo 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnauthorinfoList(ComtnauthorinfoVO vo) throws Exception {
        return comtnauthorinfoDAO.selectComtnauthorinfoList(vo);
    }

    /**
	 * comtnauthorinfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnauthorinfo 총 갯수
	 * @exception
	 */
    public int selectComtnauthorinfoListTotCnt(ComtnauthorinfoVO vo) {
		return comtnauthorinfoDAO.selectComtnauthorinfoListTotCnt(vo);
	}
    
}
