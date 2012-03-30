package kr.godsoft.egovframe.generatorwebapp.comtnschdulinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnschdulinfo.service.ComtnschdulinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnschdulinfo.service.ComtnschdulinfoVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnschdulinfoServiceImpl.java
 * @Description : Comtnschdulinfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnschdulinfoService")
public class ComtnschdulinfoServiceImpl extends AbstractServiceImpl implements
        ComtnschdulinfoService {

    @Resource(name="comtnschdulinfoDAO")
    private ComtnschdulinfoDAO comtnschdulinfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnschdulinfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNSCHDULINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnschdulinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnschdulinfo(ComtnschdulinfoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnschdulinfoDAO.insertComtnschdulinfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNSCHDULINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnschdulinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnschdulinfo(ComtnschdulinfoVO vo) throws Exception {
        comtnschdulinfoDAO.updateComtnschdulinfo(vo);
    }

    /**
	 * COMTNSCHDULINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnschdulinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnschdulinfo(ComtnschdulinfoVO vo) throws Exception {
        comtnschdulinfoDAO.deleteComtnschdulinfo(vo);
    }

    /**
	 * COMTNSCHDULINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnschdulinfoVO
	 * @return 조회한 COMTNSCHDULINFO
	 * @exception Exception
	 */
    public ComtnschdulinfoVO selectComtnschdulinfo(ComtnschdulinfoVO vo) throws Exception {
        ComtnschdulinfoVO resultVO = comtnschdulinfoDAO.selectComtnschdulinfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNSCHDULINFO 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNSCHDULINFO 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnschdulinfoList(ComtnschdulinfoVO vo) throws Exception {
        return comtnschdulinfoDAO.selectComtnschdulinfoList(vo);
    }

    /**
	 * COMTNSCHDULINFO 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNSCHDULINFO 총 갯수
	 * @exception
	 */
    public int selectComtnschdulinfoListTotCnt(ComtnschdulinfoVO vo) {
		return comtnschdulinfoDAO.selectComtnschdulinfoListTotCnt(vo);
	}
    
}
