package kr.godsoft.egovframe.generatorwebapp.comtnmtginfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnmtginfo.service.ComtnmtginfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnmtginfo.service.ComtnmtginfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnmtginfo.service.ComtnmtginfoVO;
import kr.godsoft.egovframe.generatorwebapp.comtnmtginfo.service.impl.ComtnmtginfoDAO;

/**
 * @Class Name : ComtnmtginfoServiceImpl.java
 * @Description : Comtnmtginfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
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
	 * comtnmtginfo을 등록한다.
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
	 * comtnmtginfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnmtginfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnmtginfo(ComtnmtginfoVO vo) throws Exception {
        comtnmtginfoDAO.updateComtnmtginfo(vo);
    }

    /**
	 * comtnmtginfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnmtginfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnmtginfo(ComtnmtginfoVO vo) throws Exception {
        comtnmtginfoDAO.deleteComtnmtginfo(vo);
    }

    /**
	 * comtnmtginfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnmtginfoVO
	 * @return 조회한 comtnmtginfo
	 * @exception Exception
	 */
    public ComtnmtginfoVO selectComtnmtginfo(ComtnmtginfoVO vo) throws Exception {
        ComtnmtginfoVO resultVO = comtnmtginfoDAO.selectComtnmtginfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnmtginfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnmtginfo 목록
	 * @exception Exception
	 */
    public List selectComtnmtginfoList(ComtnmtginfoDefaultVO searchVO) throws Exception {
        return comtnmtginfoDAO.selectComtnmtginfoList(searchVO);
    }

    /**
	 * comtnmtginfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnmtginfo 총 갯수
	 * @exception
	 */
    public int selectComtnmtginfoListTotCnt(ComtnmtginfoDefaultVO searchVO) {
		return comtnmtginfoDAO.selectComtnmtginfoListTotCnt(searchVO);
	}
    
}
