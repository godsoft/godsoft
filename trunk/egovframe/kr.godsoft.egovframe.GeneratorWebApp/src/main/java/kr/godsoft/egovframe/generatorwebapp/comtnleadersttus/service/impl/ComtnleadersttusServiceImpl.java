package kr.godsoft.egovframe.generatorwebapp.comtnleadersttus.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnleadersttus.service.ComtnleadersttusService;
import kr.godsoft.egovframe.generatorwebapp.comtnleadersttus.service.ComtnleadersttusVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnleadersttusServiceImpl.java
 * @Description : Comtnleadersttus Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnleadersttusService")
public class ComtnleadersttusServiceImpl extends AbstractServiceImpl implements
        ComtnleadersttusService {

    @Resource(name="comtnleadersttusDAO")
    private ComtnleadersttusDAO comtnleadersttusDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnleadersttusIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNLEADERSTTUS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnleadersttusVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnleadersttus(ComtnleadersttusVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnleadersttusDAO.insertComtnleadersttus(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNLEADERSTTUS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnleadersttusVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnleadersttus(ComtnleadersttusVO vo) throws Exception {
        comtnleadersttusDAO.updateComtnleadersttus(vo);
    }

    /**
	 * COMTNLEADERSTTUS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnleadersttusVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnleadersttus(ComtnleadersttusVO vo) throws Exception {
        comtnleadersttusDAO.deleteComtnleadersttus(vo);
    }

    /**
	 * COMTNLEADERSTTUS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnleadersttusVO
	 * @return 조회한 COMTNLEADERSTTUS
	 * @exception Exception
	 */
    public ComtnleadersttusVO selectComtnleadersttus(ComtnleadersttusVO vo) throws Exception {
        ComtnleadersttusVO resultVO = comtnleadersttusDAO.selectComtnleadersttus(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNLEADERSTTUS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNLEADERSTTUS 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnleadersttusList(ComtnleadersttusVO vo) throws Exception {
        return comtnleadersttusDAO.selectComtnleadersttusList(vo);
    }

    /**
	 * COMTNLEADERSTTUS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNLEADERSTTUS 총 갯수
	 * @exception
	 */
    public int selectComtnleadersttusListTotCnt(ComtnleadersttusVO vo) {
		return comtnleadersttusDAO.selectComtnleadersttusListTotCnt(vo);
	}
    
}
