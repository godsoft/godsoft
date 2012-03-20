package kr.godsoft.egovframe.generatorwebapp.comtnbndtmanage.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnbndtmanage.service.ComtnbndtmanageService;
import kr.godsoft.egovframe.generatorwebapp.comtnbndtmanage.service.ComtnbndtmanageVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnbndtmanageServiceImpl.java
 * @Description : Comtnbndtmanage Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnbndtmanageService")
public class ComtnbndtmanageServiceImpl extends AbstractServiceImpl implements
        ComtnbndtmanageService {

    @Resource(name="comtnbndtmanageDAO")
    private ComtnbndtmanageDAO comtnbndtmanageDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnbndtmanageIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnbndtmanage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbndtmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnbndtmanage(ComtnbndtmanageVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnbndtmanageDAO.insertComtnbndtmanage(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnbndtmanage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbndtmanageVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnbndtmanage(ComtnbndtmanageVO vo) throws Exception {
        comtnbndtmanageDAO.updateComtnbndtmanage(vo);
    }

    /**
	 * comtnbndtmanage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbndtmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnbndtmanage(ComtnbndtmanageVO vo) throws Exception {
        comtnbndtmanageDAO.deleteComtnbndtmanage(vo);
    }

    /**
	 * comtnbndtmanage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbndtmanageVO
	 * @return 조회한 comtnbndtmanage
	 * @exception Exception
	 */
    public ComtnbndtmanageVO selectComtnbndtmanage(ComtnbndtmanageVO vo) throws Exception {
        ComtnbndtmanageVO resultVO = comtnbndtmanageDAO.selectComtnbndtmanage(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnbndtmanage 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbndtmanage 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnbndtmanageList(ComtnbndtmanageVO vo) throws Exception {
        return comtnbndtmanageDAO.selectComtnbndtmanageList(vo);
    }

    /**
	 * comtnbndtmanage 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbndtmanage 총 갯수
	 * @exception
	 */
    public int selectComtnbndtmanageListTotCnt(ComtnbndtmanageVO vo) {
		return comtnbndtmanageDAO.selectComtnbndtmanageListTotCnt(vo);
	}
    
}
