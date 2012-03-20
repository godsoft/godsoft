package kr.godsoft.egovframe.generatorwebapp.comtnproxyloginfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnproxyloginfo.service.ComtnproxyloginfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnproxyloginfo.service.ComtnproxyloginfoVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnproxyloginfoServiceImpl.java
 * @Description : Comtnproxyloginfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnproxyloginfoService")
public class ComtnproxyloginfoServiceImpl extends AbstractServiceImpl implements
        ComtnproxyloginfoService {

    @Resource(name="comtnproxyloginfoDAO")
    private ComtnproxyloginfoDAO comtnproxyloginfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnproxyloginfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnproxyloginfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnproxyloginfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnproxyloginfo(ComtnproxyloginfoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnproxyloginfoDAO.insertComtnproxyloginfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnproxyloginfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnproxyloginfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnproxyloginfo(ComtnproxyloginfoVO vo) throws Exception {
        comtnproxyloginfoDAO.updateComtnproxyloginfo(vo);
    }

    /**
	 * comtnproxyloginfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnproxyloginfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnproxyloginfo(ComtnproxyloginfoVO vo) throws Exception {
        comtnproxyloginfoDAO.deleteComtnproxyloginfo(vo);
    }

    /**
	 * comtnproxyloginfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnproxyloginfoVO
	 * @return 조회한 comtnproxyloginfo
	 * @exception Exception
	 */
    public ComtnproxyloginfoVO selectComtnproxyloginfo(ComtnproxyloginfoVO vo) throws Exception {
        ComtnproxyloginfoVO resultVO = comtnproxyloginfoDAO.selectComtnproxyloginfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnproxyloginfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnproxyloginfo 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnproxyloginfoList(ComtnproxyloginfoVO vo) throws Exception {
        return comtnproxyloginfoDAO.selectComtnproxyloginfoList(vo);
    }

    /**
	 * comtnproxyloginfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnproxyloginfo 총 갯수
	 * @exception
	 */
    public int selectComtnproxyloginfoListTotCnt(ComtnproxyloginfoVO vo) {
		return comtnproxyloginfoDAO.selectComtnproxyloginfoListTotCnt(vo);
	}
    
}
