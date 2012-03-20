package kr.godsoft.egovframe.generatorwebapp.comtnserverinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnserverinfo.service.ComtnserverinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnserverinfo.service.ComtnserverinfoVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnserverinfoServiceImpl.java
 * @Description : Comtnserverinfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnserverinfoService")
public class ComtnserverinfoServiceImpl extends AbstractServiceImpl implements
        ComtnserverinfoService {

    @Resource(name="comtnserverinfoDAO")
    private ComtnserverinfoDAO comtnserverinfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnserverinfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnserverinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnserverinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnserverinfo(ComtnserverinfoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnserverinfoDAO.insertComtnserverinfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnserverinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnserverinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnserverinfo(ComtnserverinfoVO vo) throws Exception {
        comtnserverinfoDAO.updateComtnserverinfo(vo);
    }

    /**
	 * comtnserverinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnserverinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnserverinfo(ComtnserverinfoVO vo) throws Exception {
        comtnserverinfoDAO.deleteComtnserverinfo(vo);
    }

    /**
	 * comtnserverinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnserverinfoVO
	 * @return 조회한 comtnserverinfo
	 * @exception Exception
	 */
    public ComtnserverinfoVO selectComtnserverinfo(ComtnserverinfoVO vo) throws Exception {
        ComtnserverinfoVO resultVO = comtnserverinfoDAO.selectComtnserverinfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnserverinfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnserverinfo 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnserverinfoList(ComtnserverinfoVO vo) throws Exception {
        return comtnserverinfoDAO.selectComtnserverinfoList(vo);
    }

    /**
	 * comtnserverinfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnserverinfo 총 갯수
	 * @exception
	 */
    public int selectComtnserverinfoListTotCnt(ComtnserverinfoVO vo) {
		return comtnserverinfoDAO.selectComtnserverinfoListTotCnt(vo);
	}
    
}
