package kr.godsoft.egovframe.generatorwebapp.comtnbbs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnbbs.service.ComtnbbsService;
import kr.godsoft.egovframe.generatorwebapp.comtnbbs.service.ComtnbbsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbbs.service.ComtnbbsVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbbs.service.impl.ComtnbbsDAO;

/**
 * @Class Name : ComtnbbsServiceImpl.java
 * @Description : Comtnbbs Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnbbsService")
public class ComtnbbsServiceImpl extends AbstractServiceImpl implements
        ComtnbbsService {

    @Resource(name="comtnbbsDAO")
    private ComtnbbsDAO comtnbbsDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnbbsIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnbbs을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbbsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnbbs(ComtnbbsVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnbbsDAO.insertComtnbbs(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnbbs을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbbsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnbbs(ComtnbbsVO vo) throws Exception {
        comtnbbsDAO.updateComtnbbs(vo);
    }

    /**
	 * comtnbbs을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbbsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnbbs(ComtnbbsVO vo) throws Exception {
        comtnbbsDAO.deleteComtnbbs(vo);
    }

    /**
	 * comtnbbs을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbbsVO
	 * @return 조회한 comtnbbs
	 * @exception Exception
	 */
    public ComtnbbsVO selectComtnbbs(ComtnbbsVO vo) throws Exception {
        ComtnbbsVO resultVO = comtnbbsDAO.selectComtnbbs(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnbbs 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbbs 목록
	 * @exception Exception
	 */
    public List selectComtnbbsList(ComtnbbsDefaultVO searchVO) throws Exception {
        return comtnbbsDAO.selectComtnbbsList(searchVO);
    }

    /**
	 * comtnbbs 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbbs 총 갯수
	 * @exception
	 */
    public int selectComtnbbsListTotCnt(ComtnbbsDefaultVO searchVO) {
		return comtnbbsDAO.selectComtnbbsListTotCnt(searchVO);
	}
    
}
