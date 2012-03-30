package kr.godsoft.egovframe.generatorwebapp.comtccmmncode.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtccmmncode.service.ComtccmmncodeService;
import kr.godsoft.egovframe.generatorwebapp.comtccmmncode.service.ComtccmmncodeVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtccmmncodeServiceImpl.java
 * @Description : Comtccmmncode Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtccmmncodeService")
public class ComtccmmncodeServiceImpl extends AbstractServiceImpl implements
        ComtccmmncodeService {

    @Resource(name="comtccmmncodeDAO")
    private ComtccmmncodeDAO comtccmmncodeDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtccmmncodeIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTCCMMNCODE을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtccmmncodeVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtccmmncode(ComtccmmncodeVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtccmmncodeDAO.insertComtccmmncode(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTCCMMNCODE을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtccmmncodeVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtccmmncode(ComtccmmncodeVO vo) throws Exception {
        comtccmmncodeDAO.updateComtccmmncode(vo);
    }

    /**
	 * COMTCCMMNCODE을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtccmmncodeVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtccmmncode(ComtccmmncodeVO vo) throws Exception {
        comtccmmncodeDAO.deleteComtccmmncode(vo);
    }

    /**
	 * COMTCCMMNCODE을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtccmmncodeVO
	 * @return 조회한 COMTCCMMNCODE
	 * @exception Exception
	 */
    public ComtccmmncodeVO selectComtccmmncode(ComtccmmncodeVO vo) throws Exception {
        ComtccmmncodeVO resultVO = comtccmmncodeDAO.selectComtccmmncode(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTCCMMNCODE 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTCCMMNCODE 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtccmmncodeList(ComtccmmncodeVO vo) throws Exception {
        return comtccmmncodeDAO.selectComtccmmncodeList(vo);
    }

    /**
	 * COMTCCMMNCODE 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTCCMMNCODE 총 갯수
	 * @exception
	 */
    public int selectComtccmmncodeListTotCnt(ComtccmmncodeVO vo) {
		return comtccmmncodeDAO.selectComtccmmncodeListTotCnt(vo);
	}
    
}
