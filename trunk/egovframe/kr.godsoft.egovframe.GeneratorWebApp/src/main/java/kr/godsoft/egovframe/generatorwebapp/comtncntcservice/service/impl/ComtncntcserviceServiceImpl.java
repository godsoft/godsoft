package kr.godsoft.egovframe.generatorwebapp.comtncntcservice.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtncntcservice.service.ComtncntcserviceService;
import kr.godsoft.egovframe.generatorwebapp.comtncntcservice.service.ComtncntcserviceDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtncntcservice.service.ComtncntcserviceVO;
import kr.godsoft.egovframe.generatorwebapp.comtncntcservice.service.impl.ComtncntcserviceDAO;

/**
 * @Class Name : ComtncntcserviceServiceImpl.java
 * @Description : Comtncntcservice Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtncntcserviceService")
public class ComtncntcserviceServiceImpl extends AbstractServiceImpl implements
        ComtncntcserviceService {

    @Resource(name="comtncntcserviceDAO")
    private ComtncntcserviceDAO comtncntcserviceDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtncntcserviceIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtncntcservice을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtncntcserviceVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtncntcservice(ComtncntcserviceVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtncntcserviceDAO.insertComtncntcservice(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtncntcservice을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtncntcserviceVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtncntcservice(ComtncntcserviceVO vo) throws Exception {
        comtncntcserviceDAO.updateComtncntcservice(vo);
    }

    /**
	 * comtncntcservice을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtncntcserviceVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtncntcservice(ComtncntcserviceVO vo) throws Exception {
        comtncntcserviceDAO.deleteComtncntcservice(vo);
    }

    /**
	 * comtncntcservice을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtncntcserviceVO
	 * @return 조회한 comtncntcservice
	 * @exception Exception
	 */
    public ComtncntcserviceVO selectComtncntcservice(ComtncntcserviceVO vo) throws Exception {
        ComtncntcserviceVO resultVO = comtncntcserviceDAO.selectComtncntcservice(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtncntcservice 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtncntcservice 목록
	 * @exception Exception
	 */
    public List selectComtncntcserviceList(ComtncntcserviceDefaultVO searchVO) throws Exception {
        return comtncntcserviceDAO.selectComtncntcserviceList(searchVO);
    }

    /**
	 * comtncntcservice 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtncntcservice 총 갯수
	 * @exception
	 */
    public int selectComtncntcserviceListTotCnt(ComtncntcserviceDefaultVO searchVO) {
		return comtncntcserviceDAO.selectComtncntcserviceListTotCnt(searchVO);
	}
    
}
