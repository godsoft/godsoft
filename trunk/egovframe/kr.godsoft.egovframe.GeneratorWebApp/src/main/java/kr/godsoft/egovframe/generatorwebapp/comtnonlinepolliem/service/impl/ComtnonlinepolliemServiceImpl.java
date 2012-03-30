package kr.godsoft.egovframe.generatorwebapp.comtnonlinepolliem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnonlinepolliem.service.ComtnonlinepolliemService;
import kr.godsoft.egovframe.generatorwebapp.comtnonlinepolliem.service.ComtnonlinepolliemVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnonlinepolliemServiceImpl.java
 * @Description : Comtnonlinepolliem Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnonlinepolliemService")
public class ComtnonlinepolliemServiceImpl extends AbstractServiceImpl implements
        ComtnonlinepolliemService {

    @Resource(name="comtnonlinepolliemDAO")
    private ComtnonlinepolliemDAO comtnonlinepolliemDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnonlinepolliemIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNONLINEPOLLIEM을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnonlinepolliemVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnonlinepolliem(ComtnonlinepolliemVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnonlinepolliemDAO.insertComtnonlinepolliem(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNONLINEPOLLIEM을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnonlinepolliemVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnonlinepolliem(ComtnonlinepolliemVO vo) throws Exception {
        comtnonlinepolliemDAO.updateComtnonlinepolliem(vo);
    }

    /**
	 * COMTNONLINEPOLLIEM을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnonlinepolliemVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnonlinepolliem(ComtnonlinepolliemVO vo) throws Exception {
        comtnonlinepolliemDAO.deleteComtnonlinepolliem(vo);
    }

    /**
	 * COMTNONLINEPOLLIEM을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnonlinepolliemVO
	 * @return 조회한 COMTNONLINEPOLLIEM
	 * @exception Exception
	 */
    public ComtnonlinepolliemVO selectComtnonlinepolliem(ComtnonlinepolliemVO vo) throws Exception {
        ComtnonlinepolliemVO resultVO = comtnonlinepolliemDAO.selectComtnonlinepolliem(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNONLINEPOLLIEM 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNONLINEPOLLIEM 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnonlinepolliemList(ComtnonlinepolliemVO vo) throws Exception {
        return comtnonlinepolliemDAO.selectComtnonlinepolliemList(vo);
    }

    /**
	 * COMTNONLINEPOLLIEM 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNONLINEPOLLIEM 총 갯수
	 * @exception
	 */
    public int selectComtnonlinepolliemListTotCnt(ComtnonlinepolliemVO vo) {
		return comtnonlinepolliemDAO.selectComtnonlinepolliemListTotCnt(vo);
	}
    
}
