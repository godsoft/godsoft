package kr.godsoft.egovframe.generatorwebapp.comtnrwardmanage.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnrwardmanage.service.ComtnrwardmanageService;
import kr.godsoft.egovframe.generatorwebapp.comtnrwardmanage.service.ComtnrwardmanageVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnrwardmanageServiceImpl.java
 * @Description : Comtnrwardmanage Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnrwardmanageService")
public class ComtnrwardmanageServiceImpl extends AbstractServiceImpl implements
        ComtnrwardmanageService {

    @Resource(name="comtnrwardmanageDAO")
    private ComtnrwardmanageDAO comtnrwardmanageDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnrwardmanageIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNRWARDMANAGE을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnrwardmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnrwardmanage(ComtnrwardmanageVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnrwardmanageDAO.insertComtnrwardmanage(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNRWARDMANAGE을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnrwardmanageVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnrwardmanage(ComtnrwardmanageVO vo) throws Exception {
        comtnrwardmanageDAO.updateComtnrwardmanage(vo);
    }

    /**
	 * COMTNRWARDMANAGE을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnrwardmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnrwardmanage(ComtnrwardmanageVO vo) throws Exception {
        comtnrwardmanageDAO.deleteComtnrwardmanage(vo);
    }

    /**
	 * COMTNRWARDMANAGE을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnrwardmanageVO
	 * @return 조회한 COMTNRWARDMANAGE
	 * @exception Exception
	 */
    public ComtnrwardmanageVO selectComtnrwardmanage(ComtnrwardmanageVO vo) throws Exception {
        ComtnrwardmanageVO resultVO = comtnrwardmanageDAO.selectComtnrwardmanage(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNRWARDMANAGE 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNRWARDMANAGE 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnrwardmanageList(ComtnrwardmanageVO vo) throws Exception {
        return comtnrwardmanageDAO.selectComtnrwardmanageList(vo);
    }

    /**
	 * COMTNRWARDMANAGE 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNRWARDMANAGE 총 갯수
	 * @exception
	 */
    public int selectComtnrwardmanageListTotCnt(ComtnrwardmanageVO vo) {
		return comtnrwardmanageDAO.selectComtnrwardmanageListTotCnt(vo);
	}
    
}
