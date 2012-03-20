package kr.godsoft.egovframe.generatorwebapp.comtnvcatnmanage.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnvcatnmanage.service.ComtnvcatnmanageService;
import kr.godsoft.egovframe.generatorwebapp.comtnvcatnmanage.service.ComtnvcatnmanageVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnvcatnmanageServiceImpl.java
 * @Description : Comtnvcatnmanage Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnvcatnmanageService")
public class ComtnvcatnmanageServiceImpl extends AbstractServiceImpl implements
        ComtnvcatnmanageService {

    @Resource(name="comtnvcatnmanageDAO")
    private ComtnvcatnmanageDAO comtnvcatnmanageDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnvcatnmanageIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnvcatnmanage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnvcatnmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnvcatnmanage(ComtnvcatnmanageVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnvcatnmanageDAO.insertComtnvcatnmanage(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnvcatnmanage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnvcatnmanageVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnvcatnmanage(ComtnvcatnmanageVO vo) throws Exception {
        comtnvcatnmanageDAO.updateComtnvcatnmanage(vo);
    }

    /**
	 * comtnvcatnmanage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnvcatnmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnvcatnmanage(ComtnvcatnmanageVO vo) throws Exception {
        comtnvcatnmanageDAO.deleteComtnvcatnmanage(vo);
    }

    /**
	 * comtnvcatnmanage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnvcatnmanageVO
	 * @return 조회한 comtnvcatnmanage
	 * @exception Exception
	 */
    public ComtnvcatnmanageVO selectComtnvcatnmanage(ComtnvcatnmanageVO vo) throws Exception {
        ComtnvcatnmanageVO resultVO = comtnvcatnmanageDAO.selectComtnvcatnmanage(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnvcatnmanage 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnvcatnmanage 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnvcatnmanageList(ComtnvcatnmanageVO vo) throws Exception {
        return comtnvcatnmanageDAO.selectComtnvcatnmanageList(vo);
    }

    /**
	 * comtnvcatnmanage 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnvcatnmanage 총 갯수
	 * @exception
	 */
    public int selectComtnvcatnmanageListTotCnt(ComtnvcatnmanageVO vo) {
		return comtnvcatnmanageDAO.selectComtnvcatnmanageListTotCnt(vo);
	}
    
}
