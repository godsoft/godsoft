package kr.godsoft.egovframe.generatorwebapp.comtnloginscrinimage.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnloginscrinimage.service.ComtnloginscrinimageService;
import kr.godsoft.egovframe.generatorwebapp.comtnloginscrinimage.service.ComtnloginscrinimageDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnloginscrinimage.service.ComtnloginscrinimageVO;
import kr.godsoft.egovframe.generatorwebapp.comtnloginscrinimage.service.impl.ComtnloginscrinimageDAO;

/**
 * @Class Name : ComtnloginscrinimageServiceImpl.java
 * @Description : Comtnloginscrinimage Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnloginscrinimageService")
public class ComtnloginscrinimageServiceImpl extends AbstractServiceImpl implements
        ComtnloginscrinimageService {

    @Resource(name="comtnloginscrinimageDAO")
    private ComtnloginscrinimageDAO comtnloginscrinimageDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnloginscrinimageIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnloginscrinimage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnloginscrinimageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnloginscrinimage(ComtnloginscrinimageVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnloginscrinimageDAO.insertComtnloginscrinimage(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnloginscrinimage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnloginscrinimageVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnloginscrinimage(ComtnloginscrinimageVO vo) throws Exception {
        comtnloginscrinimageDAO.updateComtnloginscrinimage(vo);
    }

    /**
	 * comtnloginscrinimage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnloginscrinimageVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnloginscrinimage(ComtnloginscrinimageVO vo) throws Exception {
        comtnloginscrinimageDAO.deleteComtnloginscrinimage(vo);
    }

    /**
	 * comtnloginscrinimage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnloginscrinimageVO
	 * @return 조회한 comtnloginscrinimage
	 * @exception Exception
	 */
    public ComtnloginscrinimageVO selectComtnloginscrinimage(ComtnloginscrinimageVO vo) throws Exception {
        ComtnloginscrinimageVO resultVO = comtnloginscrinimageDAO.selectComtnloginscrinimage(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnloginscrinimage 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnloginscrinimage 목록
	 * @exception Exception
	 */
    public List selectComtnloginscrinimageList(ComtnloginscrinimageDefaultVO searchVO) throws Exception {
        return comtnloginscrinimageDAO.selectComtnloginscrinimageList(searchVO);
    }

    /**
	 * comtnloginscrinimage 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnloginscrinimage 총 갯수
	 * @exception
	 */
    public int selectComtnloginscrinimageListTotCnt(ComtnloginscrinimageDefaultVO searchVO) {
		return comtnloginscrinimageDAO.selectComtnloginscrinimageListTotCnt(searchVO);
	}
    
}