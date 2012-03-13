package kr.godsoft.egovframe.generatorwebapp.comtnqustnrtmplat.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnrtmplat.service.ComtnqustnrtmplatService;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnrtmplat.service.ComtnqustnrtmplatDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnrtmplat.service.ComtnqustnrtmplatVO;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnrtmplat.service.impl.ComtnqustnrtmplatDAO;

/**
 * @Class Name : ComtnqustnrtmplatServiceImpl.java
 * @Description : Comtnqustnrtmplat Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnqustnrtmplatService")
public class ComtnqustnrtmplatServiceImpl extends AbstractServiceImpl implements
        ComtnqustnrtmplatService {

    @Resource(name="comtnqustnrtmplatDAO")
    private ComtnqustnrtmplatDAO comtnqustnrtmplatDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnqustnrtmplatIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnqustnrtmplat을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnqustnrtmplatVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnqustnrtmplat(ComtnqustnrtmplatVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnqustnrtmplatDAO.insertComtnqustnrtmplat(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnqustnrtmplat을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnqustnrtmplatVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnqustnrtmplat(ComtnqustnrtmplatVO vo) throws Exception {
        comtnqustnrtmplatDAO.updateComtnqustnrtmplat(vo);
    }

    /**
	 * comtnqustnrtmplat을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnqustnrtmplatVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnqustnrtmplat(ComtnqustnrtmplatVO vo) throws Exception {
        comtnqustnrtmplatDAO.deleteComtnqustnrtmplat(vo);
    }

    /**
	 * comtnqustnrtmplat을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnqustnrtmplatVO
	 * @return 조회한 comtnqustnrtmplat
	 * @exception Exception
	 */
    public ComtnqustnrtmplatVO selectComtnqustnrtmplat(ComtnqustnrtmplatVO vo) throws Exception {
        ComtnqustnrtmplatVO resultVO = comtnqustnrtmplatDAO.selectComtnqustnrtmplat(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnqustnrtmplat 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnqustnrtmplat 목록
	 * @exception Exception
	 */
    public List selectComtnqustnrtmplatList(ComtnqustnrtmplatDefaultVO searchVO) throws Exception {
        return comtnqustnrtmplatDAO.selectComtnqustnrtmplatList(searchVO);
    }

    /**
	 * comtnqustnrtmplat 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnqustnrtmplat 총 갯수
	 * @exception
	 */
    public int selectComtnqustnrtmplatListTotCnt(ComtnqustnrtmplatDefaultVO searchVO) {
		return comtnqustnrtmplatDAO.selectComtnqustnrtmplatListTotCnt(searchVO);
	}
    
}
