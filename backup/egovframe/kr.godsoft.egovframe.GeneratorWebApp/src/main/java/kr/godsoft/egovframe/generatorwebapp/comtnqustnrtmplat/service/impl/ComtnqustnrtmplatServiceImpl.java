package kr.godsoft.egovframe.generatorwebapp.comtnqustnrtmplat.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnqustnrtmplat.service.ComtnqustnrtmplatService;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnrtmplat.service.ComtnqustnrtmplatVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnqustnrtmplatServiceImpl.java
 * @Description : Comtnqustnrtmplat Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
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
	 * COMTNQUSTNRTMPLAT을 등록한다.
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
	 * COMTNQUSTNRTMPLAT을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnqustnrtmplatVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnqustnrtmplat(ComtnqustnrtmplatVO vo) throws Exception {
        comtnqustnrtmplatDAO.updateComtnqustnrtmplat(vo);
    }

    /**
	 * COMTNQUSTNRTMPLAT을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnqustnrtmplatVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnqustnrtmplat(ComtnqustnrtmplatVO vo) throws Exception {
        comtnqustnrtmplatDAO.deleteComtnqustnrtmplat(vo);
    }

    /**
	 * COMTNQUSTNRTMPLAT을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnqustnrtmplatVO
	 * @return 조회한 COMTNQUSTNRTMPLAT
	 * @exception Exception
	 */
    public ComtnqustnrtmplatVO selectComtnqustnrtmplat(ComtnqustnrtmplatVO vo) throws Exception {
        ComtnqustnrtmplatVO resultVO = comtnqustnrtmplatDAO.selectComtnqustnrtmplat(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNQUSTNRTMPLAT 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNQUSTNRTMPLAT 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnqustnrtmplatList(ComtnqustnrtmplatVO vo) throws Exception {
        return comtnqustnrtmplatDAO.selectComtnqustnrtmplatList(vo);
    }

    /**
	 * COMTNQUSTNRTMPLAT 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNQUSTNRTMPLAT 총 갯수
	 * @exception
	 */
    public int selectComtnqustnrtmplatListTotCnt(ComtnqustnrtmplatVO vo) {
		return comtnqustnrtmplatDAO.selectComtnqustnrtmplatListTotCnt(vo);
	}
    
}
