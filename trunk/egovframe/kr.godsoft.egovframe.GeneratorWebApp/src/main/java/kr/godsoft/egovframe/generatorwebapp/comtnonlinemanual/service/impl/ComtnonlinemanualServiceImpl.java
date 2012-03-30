package kr.godsoft.egovframe.generatorwebapp.comtnonlinemanual.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnonlinemanual.service.ComtnonlinemanualService;
import kr.godsoft.egovframe.generatorwebapp.comtnonlinemanual.service.ComtnonlinemanualVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnonlinemanualServiceImpl.java
 * @Description : Comtnonlinemanual Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnonlinemanualService")
public class ComtnonlinemanualServiceImpl extends AbstractServiceImpl implements
        ComtnonlinemanualService {

    @Resource(name="comtnonlinemanualDAO")
    private ComtnonlinemanualDAO comtnonlinemanualDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnonlinemanualIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNONLINEMANUAL을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnonlinemanualVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnonlinemanual(ComtnonlinemanualVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnonlinemanualDAO.insertComtnonlinemanual(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNONLINEMANUAL을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnonlinemanualVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnonlinemanual(ComtnonlinemanualVO vo) throws Exception {
        comtnonlinemanualDAO.updateComtnonlinemanual(vo);
    }

    /**
	 * COMTNONLINEMANUAL을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnonlinemanualVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnonlinemanual(ComtnonlinemanualVO vo) throws Exception {
        comtnonlinemanualDAO.deleteComtnonlinemanual(vo);
    }

    /**
	 * COMTNONLINEMANUAL을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnonlinemanualVO
	 * @return 조회한 COMTNONLINEMANUAL
	 * @exception Exception
	 */
    public ComtnonlinemanualVO selectComtnonlinemanual(ComtnonlinemanualVO vo) throws Exception {
        ComtnonlinemanualVO resultVO = comtnonlinemanualDAO.selectComtnonlinemanual(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNONLINEMANUAL 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNONLINEMANUAL 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnonlinemanualList(ComtnonlinemanualVO vo) throws Exception {
        return comtnonlinemanualDAO.selectComtnonlinemanualList(vo);
    }

    /**
	 * COMTNONLINEMANUAL 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNONLINEMANUAL 총 갯수
	 * @exception
	 */
    public int selectComtnonlinemanualListTotCnt(ComtnonlinemanualVO vo) {
		return comtnonlinemanualDAO.selectComtnonlinemanualListTotCnt(vo);
	}
    
}
