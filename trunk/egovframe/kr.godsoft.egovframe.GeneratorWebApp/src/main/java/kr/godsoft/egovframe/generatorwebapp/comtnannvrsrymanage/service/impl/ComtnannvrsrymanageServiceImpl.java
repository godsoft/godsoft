package kr.godsoft.egovframe.generatorwebapp.comtnannvrsrymanage.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnannvrsrymanage.service.ComtnannvrsrymanageService;
import kr.godsoft.egovframe.generatorwebapp.comtnannvrsrymanage.service.ComtnannvrsrymanageVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnannvrsrymanageServiceImpl.java
 * @Description : Comtnannvrsrymanage Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnannvrsrymanageService")
public class ComtnannvrsrymanageServiceImpl extends AbstractServiceImpl implements
        ComtnannvrsrymanageService {

    @Resource(name="comtnannvrsrymanageDAO")
    private ComtnannvrsrymanageDAO comtnannvrsrymanageDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnannvrsrymanageIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnannvrsrymanage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnannvrsrymanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnannvrsrymanage(ComtnannvrsrymanageVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnannvrsrymanageDAO.insertComtnannvrsrymanage(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnannvrsrymanage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnannvrsrymanageVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnannvrsrymanage(ComtnannvrsrymanageVO vo) throws Exception {
        comtnannvrsrymanageDAO.updateComtnannvrsrymanage(vo);
    }

    /**
	 * comtnannvrsrymanage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnannvrsrymanageVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnannvrsrymanage(ComtnannvrsrymanageVO vo) throws Exception {
        comtnannvrsrymanageDAO.deleteComtnannvrsrymanage(vo);
    }

    /**
	 * comtnannvrsrymanage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnannvrsrymanageVO
	 * @return 조회한 comtnannvrsrymanage
	 * @exception Exception
	 */
    public ComtnannvrsrymanageVO selectComtnannvrsrymanage(ComtnannvrsrymanageVO vo) throws Exception {
        ComtnannvrsrymanageVO resultVO = comtnannvrsrymanageDAO.selectComtnannvrsrymanage(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnannvrsrymanage 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnannvrsrymanage 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnannvrsrymanageList(ComtnannvrsrymanageVO vo) throws Exception {
        return comtnannvrsrymanageDAO.selectComtnannvrsrymanageList(vo);
    }

    /**
	 * comtnannvrsrymanage 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnannvrsrymanage 총 갯수
	 * @exception
	 */
    public int selectComtnannvrsrymanageListTotCnt(ComtnannvrsrymanageVO vo) {
		return comtnannvrsrymanageDAO.selectComtnannvrsrymanageListTotCnt(vo);
	}
    
}
