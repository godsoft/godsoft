package kr.godsoft.egovframe.generatorwebapp.comtnfaqinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnfaqinfo.service.ComtnfaqinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnfaqinfo.service.ComtnfaqinfoVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnfaqinfoServiceImpl.java
 * @Description : Comtnfaqinfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnfaqinfoService")
public class ComtnfaqinfoServiceImpl extends AbstractServiceImpl implements
        ComtnfaqinfoService {

    @Resource(name="comtnfaqinfoDAO")
    private ComtnfaqinfoDAO comtnfaqinfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnfaqinfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNFAQINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnfaqinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnfaqinfo(ComtnfaqinfoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnfaqinfoDAO.insertComtnfaqinfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNFAQINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnfaqinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnfaqinfo(ComtnfaqinfoVO vo) throws Exception {
        comtnfaqinfoDAO.updateComtnfaqinfo(vo);
    }

    /**
	 * COMTNFAQINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnfaqinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnfaqinfo(ComtnfaqinfoVO vo) throws Exception {
        comtnfaqinfoDAO.deleteComtnfaqinfo(vo);
    }

    /**
	 * COMTNFAQINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnfaqinfoVO
	 * @return 조회한 COMTNFAQINFO
	 * @exception Exception
	 */
    public ComtnfaqinfoVO selectComtnfaqinfo(ComtnfaqinfoVO vo) throws Exception {
        ComtnfaqinfoVO resultVO = comtnfaqinfoDAO.selectComtnfaqinfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNFAQINFO 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNFAQINFO 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnfaqinfoList(ComtnfaqinfoVO vo) throws Exception {
        return comtnfaqinfoDAO.selectComtnfaqinfoList(vo);
    }

    /**
	 * COMTNFAQINFO 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNFAQINFO 총 갯수
	 * @exception
	 */
    public int selectComtnfaqinfoListTotCnt(ComtnfaqinfoVO vo) {
		return comtnfaqinfoDAO.selectComtnfaqinfoListTotCnt(vo);
	}
    
}
