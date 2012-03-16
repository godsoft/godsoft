package kr.godsoft.egovframe.generatorwebapp.comtnstplatinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnstplatinfo.service.ComtnstplatinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnstplatinfo.service.ComtnstplatinfoVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnstplatinfoServiceImpl.java
 * @Description : Comtnstplatinfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnstplatinfoService")
public class ComtnstplatinfoServiceImpl extends AbstractServiceImpl implements
        ComtnstplatinfoService {

    @Resource(name="comtnstplatinfoDAO")
    private ComtnstplatinfoDAO comtnstplatinfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnstplatinfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnstplatinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnstplatinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnstplatinfo(ComtnstplatinfoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnstplatinfoDAO.insertComtnstplatinfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnstplatinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnstplatinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnstplatinfo(ComtnstplatinfoVO vo) throws Exception {
        comtnstplatinfoDAO.updateComtnstplatinfo(vo);
    }

    /**
	 * comtnstplatinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnstplatinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnstplatinfo(ComtnstplatinfoVO vo) throws Exception {
        comtnstplatinfoDAO.deleteComtnstplatinfo(vo);
    }

    /**
	 * comtnstplatinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnstplatinfoVO
	 * @return 조회한 comtnstplatinfo
	 * @exception Exception
	 */
    public ComtnstplatinfoVO selectComtnstplatinfo(ComtnstplatinfoVO vo) throws Exception {
        ComtnstplatinfoVO resultVO = comtnstplatinfoDAO.selectComtnstplatinfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnstplatinfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnstplatinfo 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnstplatinfoList(ComtnstplatinfoVO vo) throws Exception {
        return comtnstplatinfoDAO.selectComtnstplatinfoList(vo);
    }

    /**
	 * comtnstplatinfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnstplatinfo 총 갯수
	 * @exception
	 */
    public int selectComtnstplatinfoListTotCnt(ComtnstplatinfoVO vo) {
		return comtnstplatinfoDAO.selectComtnstplatinfoListTotCnt(vo);
	}
    
}
