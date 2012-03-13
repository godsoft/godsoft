package kr.godsoft.egovframe.generatorwebapp.comtntrsmrcvlog.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtntrsmrcvlog.service.ComtntrsmrcvlogService;
import kr.godsoft.egovframe.generatorwebapp.comtntrsmrcvlog.service.ComtntrsmrcvlogDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtntrsmrcvlog.service.ComtntrsmrcvlogVO;
import kr.godsoft.egovframe.generatorwebapp.comtntrsmrcvlog.service.impl.ComtntrsmrcvlogDAO;

/**
 * @Class Name : ComtntrsmrcvlogServiceImpl.java
 * @Description : Comtntrsmrcvlog Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtntrsmrcvlogService")
public class ComtntrsmrcvlogServiceImpl extends AbstractServiceImpl implements
        ComtntrsmrcvlogService {

    @Resource(name="comtntrsmrcvlogDAO")
    private ComtntrsmrcvlogDAO comtntrsmrcvlogDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtntrsmrcvlogIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtntrsmrcvlog을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtntrsmrcvlogVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtntrsmrcvlog(ComtntrsmrcvlogVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtntrsmrcvlogDAO.insertComtntrsmrcvlog(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtntrsmrcvlog을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtntrsmrcvlogVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtntrsmrcvlog(ComtntrsmrcvlogVO vo) throws Exception {
        comtntrsmrcvlogDAO.updateComtntrsmrcvlog(vo);
    }

    /**
	 * comtntrsmrcvlog을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtntrsmrcvlogVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtntrsmrcvlog(ComtntrsmrcvlogVO vo) throws Exception {
        comtntrsmrcvlogDAO.deleteComtntrsmrcvlog(vo);
    }

    /**
	 * comtntrsmrcvlog을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtntrsmrcvlogVO
	 * @return 조회한 comtntrsmrcvlog
	 * @exception Exception
	 */
    public ComtntrsmrcvlogVO selectComtntrsmrcvlog(ComtntrsmrcvlogVO vo) throws Exception {
        ComtntrsmrcvlogVO resultVO = comtntrsmrcvlogDAO.selectComtntrsmrcvlog(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtntrsmrcvlog 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtntrsmrcvlog 목록
	 * @exception Exception
	 */
    public List selectComtntrsmrcvlogList(ComtntrsmrcvlogDefaultVO searchVO) throws Exception {
        return comtntrsmrcvlogDAO.selectComtntrsmrcvlogList(searchVO);
    }

    /**
	 * comtntrsmrcvlog 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtntrsmrcvlog 총 갯수
	 * @exception
	 */
    public int selectComtntrsmrcvlogListTotCnt(ComtntrsmrcvlogDefaultVO searchVO) {
		return comtntrsmrcvlogDAO.selectComtntrsmrcvlogListTotCnt(searchVO);
	}
    
}
