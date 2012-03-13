package kr.godsoft.egovframe.generatorwebapp.comtntroblinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtntroblinfo.service.ComtntroblinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtntroblinfo.service.ComtntroblinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtntroblinfo.service.ComtntroblinfoVO;
import kr.godsoft.egovframe.generatorwebapp.comtntroblinfo.service.impl.ComtntroblinfoDAO;

/**
 * @Class Name : ComtntroblinfoServiceImpl.java
 * @Description : Comtntroblinfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtntroblinfoService")
public class ComtntroblinfoServiceImpl extends AbstractServiceImpl implements
        ComtntroblinfoService {

    @Resource(name="comtntroblinfoDAO")
    private ComtntroblinfoDAO comtntroblinfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtntroblinfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtntroblinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtntroblinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtntroblinfo(ComtntroblinfoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtntroblinfoDAO.insertComtntroblinfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtntroblinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtntroblinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtntroblinfo(ComtntroblinfoVO vo) throws Exception {
        comtntroblinfoDAO.updateComtntroblinfo(vo);
    }

    /**
	 * comtntroblinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtntroblinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtntroblinfo(ComtntroblinfoVO vo) throws Exception {
        comtntroblinfoDAO.deleteComtntroblinfo(vo);
    }

    /**
	 * comtntroblinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtntroblinfoVO
	 * @return 조회한 comtntroblinfo
	 * @exception Exception
	 */
    public ComtntroblinfoVO selectComtntroblinfo(ComtntroblinfoVO vo) throws Exception {
        ComtntroblinfoVO resultVO = comtntroblinfoDAO.selectComtntroblinfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtntroblinfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtntroblinfo 목록
	 * @exception Exception
	 */
    public List selectComtntroblinfoList(ComtntroblinfoDefaultVO searchVO) throws Exception {
        return comtntroblinfoDAO.selectComtntroblinfoList(searchVO);
    }

    /**
	 * comtntroblinfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtntroblinfo 총 갯수
	 * @exception
	 */
    public int selectComtntroblinfoListTotCnt(ComtntroblinfoDefaultVO searchVO) {
		return comtntroblinfoDAO.selectComtntroblinfoListTotCnt(searchVO);
	}
    
}
