package kr.godsoft.egovframe.generatorwebapp.comtnqustnrqesitm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnqustnrqesitm.service.ComtnqustnrqesitmService;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnrqesitm.service.ComtnqustnrqesitmVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnqustnrqesitmServiceImpl.java
 * @Description : Comtnqustnrqesitm Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnqustnrqesitmService")
public class ComtnqustnrqesitmServiceImpl extends AbstractServiceImpl implements
        ComtnqustnrqesitmService {

    @Resource(name="comtnqustnrqesitmDAO")
    private ComtnqustnrqesitmDAO comtnqustnrqesitmDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnqustnrqesitmIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNQUSTNRQESITM을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnqustnrqesitmVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnqustnrqesitm(ComtnqustnrqesitmVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnqustnrqesitmDAO.insertComtnqustnrqesitm(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNQUSTNRQESITM을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnqustnrqesitmVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnqustnrqesitm(ComtnqustnrqesitmVO vo) throws Exception {
        comtnqustnrqesitmDAO.updateComtnqustnrqesitm(vo);
    }

    /**
	 * COMTNQUSTNRQESITM을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnqustnrqesitmVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnqustnrqesitm(ComtnqustnrqesitmVO vo) throws Exception {
        comtnqustnrqesitmDAO.deleteComtnqustnrqesitm(vo);
    }

    /**
	 * COMTNQUSTNRQESITM을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnqustnrqesitmVO
	 * @return 조회한 COMTNQUSTNRQESITM
	 * @exception Exception
	 */
    public ComtnqustnrqesitmVO selectComtnqustnrqesitm(ComtnqustnrqesitmVO vo) throws Exception {
        ComtnqustnrqesitmVO resultVO = comtnqustnrqesitmDAO.selectComtnqustnrqesitm(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNQUSTNRQESITM 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNQUSTNRQESITM 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnqustnrqesitmList(ComtnqustnrqesitmVO vo) throws Exception {
        return comtnqustnrqesitmDAO.selectComtnqustnrqesitmList(vo);
    }

    /**
	 * COMTNQUSTNRQESITM 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNQUSTNRQESITM 총 갯수
	 * @exception
	 */
    public int selectComtnqustnrqesitmListTotCnt(ComtnqustnrqesitmVO vo) {
		return comtnqustnrqesitmDAO.selectComtnqustnrqesitmListTotCnt(vo);
	}
    
}
