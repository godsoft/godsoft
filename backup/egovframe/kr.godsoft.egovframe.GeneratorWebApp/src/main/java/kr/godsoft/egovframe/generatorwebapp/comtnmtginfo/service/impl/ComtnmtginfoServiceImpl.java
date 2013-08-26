package kr.godsoft.egovframe.generatorwebapp.comtnmtginfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnmtginfo.service.ComtnmtginfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnmtginfo.service.ComtnmtginfoVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnmtginfoServiceImpl.java
 * @Description : Comtnmtginfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnmtginfoService")
public class ComtnmtginfoServiceImpl extends AbstractServiceImpl implements
        ComtnmtginfoService {

    @Resource(name="comtnmtginfoDAO")
    private ComtnmtginfoDAO comtnmtginfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnmtginfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNMTGINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnmtginfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnmtginfo(ComtnmtginfoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnmtginfoDAO.insertComtnmtginfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNMTGINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnmtginfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnmtginfo(ComtnmtginfoVO vo) throws Exception {
        comtnmtginfoDAO.updateComtnmtginfo(vo);
    }

    /**
	 * COMTNMTGINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnmtginfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnmtginfo(ComtnmtginfoVO vo) throws Exception {
        comtnmtginfoDAO.deleteComtnmtginfo(vo);
    }

    /**
	 * COMTNMTGINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnmtginfoVO
	 * @return 조회한 COMTNMTGINFO
	 * @exception Exception
	 */
    public ComtnmtginfoVO selectComtnmtginfo(ComtnmtginfoVO vo) throws Exception {
        ComtnmtginfoVO resultVO = comtnmtginfoDAO.selectComtnmtginfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNMTGINFO 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNMTGINFO 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnmtginfoList(ComtnmtginfoVO vo) throws Exception {
        return comtnmtginfoDAO.selectComtnmtginfoList(vo);
    }

    /**
	 * COMTNMTGINFO 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNMTGINFO 총 갯수
	 * @exception
	 */
    public int selectComtnmtginfoListTotCnt(ComtnmtginfoVO vo) {
		return comtnmtginfoDAO.selectComtnmtginfoListTotCnt(vo);
	}
    
}