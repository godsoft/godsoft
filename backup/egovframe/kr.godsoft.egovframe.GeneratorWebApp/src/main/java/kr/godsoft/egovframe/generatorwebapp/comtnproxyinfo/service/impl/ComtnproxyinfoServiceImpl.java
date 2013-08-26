package kr.godsoft.egovframe.generatorwebapp.comtnproxyinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnproxyinfo.service.ComtnproxyinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnproxyinfo.service.ComtnproxyinfoVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnproxyinfoServiceImpl.java
 * @Description : Comtnproxyinfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnproxyinfoService")
public class ComtnproxyinfoServiceImpl extends AbstractServiceImpl implements
        ComtnproxyinfoService {

    @Resource(name="comtnproxyinfoDAO")
    private ComtnproxyinfoDAO comtnproxyinfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnproxyinfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNPROXYINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnproxyinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnproxyinfo(ComtnproxyinfoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnproxyinfoDAO.insertComtnproxyinfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNPROXYINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnproxyinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnproxyinfo(ComtnproxyinfoVO vo) throws Exception {
        comtnproxyinfoDAO.updateComtnproxyinfo(vo);
    }

    /**
	 * COMTNPROXYINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnproxyinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnproxyinfo(ComtnproxyinfoVO vo) throws Exception {
        comtnproxyinfoDAO.deleteComtnproxyinfo(vo);
    }

    /**
	 * COMTNPROXYINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnproxyinfoVO
	 * @return 조회한 COMTNPROXYINFO
	 * @exception Exception
	 */
    public ComtnproxyinfoVO selectComtnproxyinfo(ComtnproxyinfoVO vo) throws Exception {
        ComtnproxyinfoVO resultVO = comtnproxyinfoDAO.selectComtnproxyinfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNPROXYINFO 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNPROXYINFO 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnproxyinfoList(ComtnproxyinfoVO vo) throws Exception {
        return comtnproxyinfoDAO.selectComtnproxyinfoList(vo);
    }

    /**
	 * COMTNPROXYINFO 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNPROXYINFO 총 갯수
	 * @exception
	 */
    public int selectComtnproxyinfoListTotCnt(ComtnproxyinfoVO vo) {
		return comtnproxyinfoDAO.selectComtnproxyinfoListTotCnt(vo);
	}
    
}