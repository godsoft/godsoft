package kr.godsoft.egovframe.generatorwebapp.comtnsynchrnserverinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnsynchrnserverinfo.service.ComtnsynchrnserverinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnsynchrnserverinfo.service.ComtnsynchrnserverinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnsynchrnserverinfo.service.ComtnsynchrnserverinfoVO;
import kr.godsoft.egovframe.generatorwebapp.comtnsynchrnserverinfo.service.impl.ComtnsynchrnserverinfoDAO;

/**
 * @Class Name : ComtnsynchrnserverinfoServiceImpl.java
 * @Description : Comtnsynchrnserverinfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnsynchrnserverinfoService")
public class ComtnsynchrnserverinfoServiceImpl extends AbstractServiceImpl implements
        ComtnsynchrnserverinfoService {

    @Resource(name="comtnsynchrnserverinfoDAO")
    private ComtnsynchrnserverinfoDAO comtnsynchrnserverinfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnsynchrnserverinfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnsynchrnserverinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnsynchrnserverinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnsynchrnserverinfo(ComtnsynchrnserverinfoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnsynchrnserverinfoDAO.insertComtnsynchrnserverinfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnsynchrnserverinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnsynchrnserverinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnsynchrnserverinfo(ComtnsynchrnserverinfoVO vo) throws Exception {
        comtnsynchrnserverinfoDAO.updateComtnsynchrnserverinfo(vo);
    }

    /**
	 * comtnsynchrnserverinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnsynchrnserverinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnsynchrnserverinfo(ComtnsynchrnserverinfoVO vo) throws Exception {
        comtnsynchrnserverinfoDAO.deleteComtnsynchrnserverinfo(vo);
    }

    /**
	 * comtnsynchrnserverinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnsynchrnserverinfoVO
	 * @return 조회한 comtnsynchrnserverinfo
	 * @exception Exception
	 */
    public ComtnsynchrnserverinfoVO selectComtnsynchrnserverinfo(ComtnsynchrnserverinfoVO vo) throws Exception {
        ComtnsynchrnserverinfoVO resultVO = comtnsynchrnserverinfoDAO.selectComtnsynchrnserverinfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnsynchrnserverinfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnsynchrnserverinfo 목록
	 * @exception Exception
	 */
    public List selectComtnsynchrnserverinfoList(ComtnsynchrnserverinfoDefaultVO searchVO) throws Exception {
        return comtnsynchrnserverinfoDAO.selectComtnsynchrnserverinfoList(searchVO);
    }

    /**
	 * comtnsynchrnserverinfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnsynchrnserverinfo 총 갯수
	 * @exception
	 */
    public int selectComtnsynchrnserverinfoListTotCnt(ComtnsynchrnserverinfoDefaultVO searchVO) {
		return comtnsynchrnserverinfoDAO.selectComtnsynchrnserverinfoListTotCnt(searchVO);
	}
    
}
