package kr.godsoft.egovframe.generatorwebapp.comtnfxtrsmanage.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnfxtrsmanage.service.ComtnfxtrsmanageService;
import kr.godsoft.egovframe.generatorwebapp.comtnfxtrsmanage.service.ComtnfxtrsmanageVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnfxtrsmanageServiceImpl.java
 * @Description : Comtnfxtrsmanage Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnfxtrsmanageService")
public class ComtnfxtrsmanageServiceImpl extends AbstractServiceImpl implements
        ComtnfxtrsmanageService {

    @Resource(name="comtnfxtrsmanageDAO")
    private ComtnfxtrsmanageDAO comtnfxtrsmanageDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnfxtrsmanageIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNFXTRSMANAGE을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnfxtrsmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnfxtrsmanage(ComtnfxtrsmanageVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnfxtrsmanageDAO.insertComtnfxtrsmanage(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNFXTRSMANAGE을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnfxtrsmanageVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnfxtrsmanage(ComtnfxtrsmanageVO vo) throws Exception {
        comtnfxtrsmanageDAO.updateComtnfxtrsmanage(vo);
    }

    /**
	 * COMTNFXTRSMANAGE을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnfxtrsmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnfxtrsmanage(ComtnfxtrsmanageVO vo) throws Exception {
        comtnfxtrsmanageDAO.deleteComtnfxtrsmanage(vo);
    }

    /**
	 * COMTNFXTRSMANAGE을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnfxtrsmanageVO
	 * @return 조회한 COMTNFXTRSMANAGE
	 * @exception Exception
	 */
    public ComtnfxtrsmanageVO selectComtnfxtrsmanage(ComtnfxtrsmanageVO vo) throws Exception {
        ComtnfxtrsmanageVO resultVO = comtnfxtrsmanageDAO.selectComtnfxtrsmanage(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNFXTRSMANAGE 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNFXTRSMANAGE 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnfxtrsmanageList(ComtnfxtrsmanageVO vo) throws Exception {
        return comtnfxtrsmanageDAO.selectComtnfxtrsmanageList(vo);
    }

    /**
	 * COMTNFXTRSMANAGE 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNFXTRSMANAGE 총 갯수
	 * @exception
	 */
    public int selectComtnfxtrsmanageListTotCnt(ComtnfxtrsmanageVO vo) {
		return comtnfxtrsmanageDAO.selectComtnfxtrsmanageListTotCnt(vo);
	}
    
}
