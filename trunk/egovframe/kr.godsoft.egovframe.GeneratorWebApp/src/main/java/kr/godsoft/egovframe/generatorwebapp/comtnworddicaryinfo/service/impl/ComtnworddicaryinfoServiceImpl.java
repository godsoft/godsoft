package kr.godsoft.egovframe.generatorwebapp.comtnworddicaryinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnworddicaryinfo.service.ComtnworddicaryinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnworddicaryinfo.service.ComtnworddicaryinfoVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnworddicaryinfoServiceImpl.java
 * @Description : Comtnworddicaryinfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnworddicaryinfoService")
public class ComtnworddicaryinfoServiceImpl extends AbstractServiceImpl implements
        ComtnworddicaryinfoService {

    @Resource(name="comtnworddicaryinfoDAO")
    private ComtnworddicaryinfoDAO comtnworddicaryinfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnworddicaryinfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnworddicaryinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnworddicaryinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnworddicaryinfo(ComtnworddicaryinfoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnworddicaryinfoDAO.insertComtnworddicaryinfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnworddicaryinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnworddicaryinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnworddicaryinfo(ComtnworddicaryinfoVO vo) throws Exception {
        comtnworddicaryinfoDAO.updateComtnworddicaryinfo(vo);
    }

    /**
	 * comtnworddicaryinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnworddicaryinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnworddicaryinfo(ComtnworddicaryinfoVO vo) throws Exception {
        comtnworddicaryinfoDAO.deleteComtnworddicaryinfo(vo);
    }

    /**
	 * comtnworddicaryinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnworddicaryinfoVO
	 * @return 조회한 comtnworddicaryinfo
	 * @exception Exception
	 */
    public ComtnworddicaryinfoVO selectComtnworddicaryinfo(ComtnworddicaryinfoVO vo) throws Exception {
        ComtnworddicaryinfoVO resultVO = comtnworddicaryinfoDAO.selectComtnworddicaryinfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnworddicaryinfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnworddicaryinfo 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnworddicaryinfoList(ComtnworddicaryinfoVO vo) throws Exception {
        return comtnworddicaryinfoDAO.selectComtnworddicaryinfoList(vo);
    }

    /**
	 * comtnworddicaryinfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnworddicaryinfo 총 갯수
	 * @exception
	 */
    public int selectComtnworddicaryinfoListTotCnt(ComtnworddicaryinfoVO vo) {
		return comtnworddicaryinfoDAO.selectComtnworddicaryinfoListTotCnt(vo);
	}
    
}
