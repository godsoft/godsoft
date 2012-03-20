package kr.godsoft.egovframe.generatorwebapp.comtnmainimage.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnmainimage.service.ComtnmainimageService;
import kr.godsoft.egovframe.generatorwebapp.comtnmainimage.service.ComtnmainimageVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnmainimageServiceImpl.java
 * @Description : Comtnmainimage Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnmainimageService")
public class ComtnmainimageServiceImpl extends AbstractServiceImpl implements
        ComtnmainimageService {

    @Resource(name="comtnmainimageDAO")
    private ComtnmainimageDAO comtnmainimageDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnmainimageIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnmainimage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnmainimageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnmainimage(ComtnmainimageVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnmainimageDAO.insertComtnmainimage(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnmainimage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnmainimageVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnmainimage(ComtnmainimageVO vo) throws Exception {
        comtnmainimageDAO.updateComtnmainimage(vo);
    }

    /**
	 * comtnmainimage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnmainimageVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnmainimage(ComtnmainimageVO vo) throws Exception {
        comtnmainimageDAO.deleteComtnmainimage(vo);
    }

    /**
	 * comtnmainimage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnmainimageVO
	 * @return 조회한 comtnmainimage
	 * @exception Exception
	 */
    public ComtnmainimageVO selectComtnmainimage(ComtnmainimageVO vo) throws Exception {
        ComtnmainimageVO resultVO = comtnmainimageDAO.selectComtnmainimage(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnmainimage 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnmainimage 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnmainimageList(ComtnmainimageVO vo) throws Exception {
        return comtnmainimageDAO.selectComtnmainimageList(vo);
    }

    /**
	 * comtnmainimage 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnmainimage 총 갯수
	 * @exception
	 */
    public int selectComtnmainimageListTotCnt(ComtnmainimageVO vo) {
		return comtnmainimageDAO.selectComtnmainimageListTotCnt(vo);
	}
    
}
