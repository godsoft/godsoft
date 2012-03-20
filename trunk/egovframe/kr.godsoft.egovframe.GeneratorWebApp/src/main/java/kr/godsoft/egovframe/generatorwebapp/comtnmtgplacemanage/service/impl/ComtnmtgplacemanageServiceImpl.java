package kr.godsoft.egovframe.generatorwebapp.comtnmtgplacemanage.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnmtgplacemanage.service.ComtnmtgplacemanageService;
import kr.godsoft.egovframe.generatorwebapp.comtnmtgplacemanage.service.ComtnmtgplacemanageVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnmtgplacemanageServiceImpl.java
 * @Description : Comtnmtgplacemanage Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnmtgplacemanageService")
public class ComtnmtgplacemanageServiceImpl extends AbstractServiceImpl implements
        ComtnmtgplacemanageService {

    @Resource(name="comtnmtgplacemanageDAO")
    private ComtnmtgplacemanageDAO comtnmtgplacemanageDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnmtgplacemanageIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnmtgplacemanage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnmtgplacemanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnmtgplacemanage(ComtnmtgplacemanageVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnmtgplacemanageDAO.insertComtnmtgplacemanage(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnmtgplacemanage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnmtgplacemanageVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnmtgplacemanage(ComtnmtgplacemanageVO vo) throws Exception {
        comtnmtgplacemanageDAO.updateComtnmtgplacemanage(vo);
    }

    /**
	 * comtnmtgplacemanage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnmtgplacemanageVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnmtgplacemanage(ComtnmtgplacemanageVO vo) throws Exception {
        comtnmtgplacemanageDAO.deleteComtnmtgplacemanage(vo);
    }

    /**
	 * comtnmtgplacemanage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnmtgplacemanageVO
	 * @return 조회한 comtnmtgplacemanage
	 * @exception Exception
	 */
    public ComtnmtgplacemanageVO selectComtnmtgplacemanage(ComtnmtgplacemanageVO vo) throws Exception {
        ComtnmtgplacemanageVO resultVO = comtnmtgplacemanageDAO.selectComtnmtgplacemanage(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnmtgplacemanage 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnmtgplacemanage 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnmtgplacemanageList(ComtnmtgplacemanageVO vo) throws Exception {
        return comtnmtgplacemanageDAO.selectComtnmtgplacemanageList(vo);
    }

    /**
	 * comtnmtgplacemanage 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnmtgplacemanage 총 갯수
	 * @exception
	 */
    public int selectComtnmtgplacemanageListTotCnt(ComtnmtgplacemanageVO vo) {
		return comtnmtgplacemanageDAO.selectComtnmtgplacemanageListTotCnt(vo);
	}
    
}
