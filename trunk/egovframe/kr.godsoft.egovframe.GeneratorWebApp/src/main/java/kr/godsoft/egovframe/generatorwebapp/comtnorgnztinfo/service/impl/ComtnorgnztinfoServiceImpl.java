package kr.godsoft.egovframe.generatorwebapp.comtnorgnztinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnorgnztinfo.service.ComtnorgnztinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnorgnztinfo.service.ComtnorgnztinfoVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnorgnztinfoServiceImpl.java
 * @Description : Comtnorgnztinfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnorgnztinfoService")
public class ComtnorgnztinfoServiceImpl extends AbstractServiceImpl implements
        ComtnorgnztinfoService {

    @Resource(name="comtnorgnztinfoDAO")
    private ComtnorgnztinfoDAO comtnorgnztinfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnorgnztinfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNORGNZTINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnorgnztinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnorgnztinfo(ComtnorgnztinfoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnorgnztinfoDAO.insertComtnorgnztinfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNORGNZTINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnorgnztinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnorgnztinfo(ComtnorgnztinfoVO vo) throws Exception {
        comtnorgnztinfoDAO.updateComtnorgnztinfo(vo);
    }

    /**
	 * COMTNORGNZTINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnorgnztinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnorgnztinfo(ComtnorgnztinfoVO vo) throws Exception {
        comtnorgnztinfoDAO.deleteComtnorgnztinfo(vo);
    }

    /**
	 * COMTNORGNZTINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnorgnztinfoVO
	 * @return 조회한 COMTNORGNZTINFO
	 * @exception Exception
	 */
    public ComtnorgnztinfoVO selectComtnorgnztinfo(ComtnorgnztinfoVO vo) throws Exception {
        ComtnorgnztinfoVO resultVO = comtnorgnztinfoDAO.selectComtnorgnztinfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNORGNZTINFO 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNORGNZTINFO 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnorgnztinfoList(ComtnorgnztinfoVO vo) throws Exception {
        return comtnorgnztinfoDAO.selectComtnorgnztinfoList(vo);
    }

    /**
	 * COMTNORGNZTINFO 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNORGNZTINFO 총 갯수
	 * @exception
	 */
    public int selectComtnorgnztinfoListTotCnt(ComtnorgnztinfoVO vo) {
		return comtnorgnztinfoDAO.selectComtnorgnztinfoListTotCnt(vo);
	}
    
}
