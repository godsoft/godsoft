package kr.godsoft.egovframe.generatorwebapp.comtnonlinepolliem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnonlinepolliem.service.ComtnonlinepolliemService;
import kr.godsoft.egovframe.generatorwebapp.comtnonlinepolliem.service.ComtnonlinepolliemDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnonlinepolliem.service.ComtnonlinepolliemVO;
import kr.godsoft.egovframe.generatorwebapp.comtnonlinepolliem.service.impl.ComtnonlinepolliemDAO;

/**
 * @Class Name : ComtnonlinepolliemServiceImpl.java
 * @Description : Comtnonlinepolliem Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
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
	 * comtnonlinepolliem을 등록한다.
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
	 * comtnonlinepolliem을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnonlinepolliemVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnonlinepolliem(ComtnonlinepolliemVO vo) throws Exception {
        comtnonlinepolliemDAO.updateComtnonlinepolliem(vo);
    }

    /**
	 * comtnonlinepolliem을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnonlinepolliemVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnonlinepolliem(ComtnonlinepolliemVO vo) throws Exception {
        comtnonlinepolliemDAO.deleteComtnonlinepolliem(vo);
    }

    /**
	 * comtnonlinepolliem을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnonlinepolliemVO
	 * @return 조회한 comtnonlinepolliem
	 * @exception Exception
	 */
    public ComtnonlinepolliemVO selectComtnonlinepolliem(ComtnonlinepolliemVO vo) throws Exception {
        ComtnonlinepolliemVO resultVO = comtnonlinepolliemDAO.selectComtnonlinepolliem(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnonlinepolliem 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnonlinepolliem 목록
	 * @exception Exception
	 */
    public List selectComtnonlinepolliemList(ComtnonlinepolliemDefaultVO searchVO) throws Exception {
        return comtnonlinepolliemDAO.selectComtnonlinepolliemList(searchVO);
    }

    /**
	 * comtnonlinepolliem 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnonlinepolliem 총 갯수
	 * @exception
	 */
    public int selectComtnonlinepolliemListTotCnt(ComtnonlinepolliemDefaultVO searchVO) {
		return comtnonlinepolliemDAO.selectComtnonlinepolliemListTotCnt(searchVO);
	}
    
}
