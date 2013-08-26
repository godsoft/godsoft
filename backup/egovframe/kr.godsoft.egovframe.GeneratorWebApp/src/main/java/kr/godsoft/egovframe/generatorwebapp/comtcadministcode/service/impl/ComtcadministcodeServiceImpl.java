package kr.godsoft.egovframe.generatorwebapp.comtcadministcode.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtcadministcode.service.ComtcadministcodeService;
import kr.godsoft.egovframe.generatorwebapp.comtcadministcode.service.ComtcadministcodeVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtcadministcodeServiceImpl.java
 * @Description : Comtcadministcode Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtcadministcodeService")
public class ComtcadministcodeServiceImpl extends AbstractServiceImpl implements
        ComtcadministcodeService {

    @Resource(name="comtcadministcodeDAO")
    private ComtcadministcodeDAO comtcadministcodeDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtcadministcodeIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTCADMINISTCODE을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtcadministcodeVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtcadministcode(ComtcadministcodeVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtcadministcodeDAO.insertComtcadministcode(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTCADMINISTCODE을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtcadministcodeVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtcadministcode(ComtcadministcodeVO vo) throws Exception {
        comtcadministcodeDAO.updateComtcadministcode(vo);
    }

    /**
	 * COMTCADMINISTCODE을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtcadministcodeVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtcadministcode(ComtcadministcodeVO vo) throws Exception {
        comtcadministcodeDAO.deleteComtcadministcode(vo);
    }

    /**
	 * COMTCADMINISTCODE을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtcadministcodeVO
	 * @return 조회한 COMTCADMINISTCODE
	 * @exception Exception
	 */
    public ComtcadministcodeVO selectComtcadministcode(ComtcadministcodeVO vo) throws Exception {
        ComtcadministcodeVO resultVO = comtcadministcodeDAO.selectComtcadministcode(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTCADMINISTCODE 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTCADMINISTCODE 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtcadministcodeList(ComtcadministcodeVO vo) throws Exception {
        return comtcadministcodeDAO.selectComtcadministcodeList(vo);
    }

    /**
	 * COMTCADMINISTCODE 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTCADMINISTCODE 총 갯수
	 * @exception
	 */
    public int selectComtcadministcodeListTotCnt(ComtcadministcodeVO vo) {
		return comtcadministcodeDAO.selectComtcadministcodeListTotCnt(vo);
	}
    
}
