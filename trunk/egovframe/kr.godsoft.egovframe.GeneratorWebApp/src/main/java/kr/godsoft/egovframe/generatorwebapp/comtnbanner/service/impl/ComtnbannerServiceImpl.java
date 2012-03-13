package kr.godsoft.egovframe.generatorwebapp.comtnbanner.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnbanner.service.ComtnbannerService;
import kr.godsoft.egovframe.generatorwebapp.comtnbanner.service.ComtnbannerDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbanner.service.ComtnbannerVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbanner.service.impl.ComtnbannerDAO;

/**
 * @Class Name : ComtnbannerServiceImpl.java
 * @Description : Comtnbanner Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnbannerService")
public class ComtnbannerServiceImpl extends AbstractServiceImpl implements
        ComtnbannerService {

    @Resource(name="comtnbannerDAO")
    private ComtnbannerDAO comtnbannerDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnbannerIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnbanner을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbannerVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnbanner(ComtnbannerVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnbannerDAO.insertComtnbanner(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnbanner을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbannerVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnbanner(ComtnbannerVO vo) throws Exception {
        comtnbannerDAO.updateComtnbanner(vo);
    }

    /**
	 * comtnbanner을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbannerVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnbanner(ComtnbannerVO vo) throws Exception {
        comtnbannerDAO.deleteComtnbanner(vo);
    }

    /**
	 * comtnbanner을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbannerVO
	 * @return 조회한 comtnbanner
	 * @exception Exception
	 */
    public ComtnbannerVO selectComtnbanner(ComtnbannerVO vo) throws Exception {
        ComtnbannerVO resultVO = comtnbannerDAO.selectComtnbanner(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnbanner 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbanner 목록
	 * @exception Exception
	 */
    public List selectComtnbannerList(ComtnbannerDefaultVO searchVO) throws Exception {
        return comtnbannerDAO.selectComtnbannerList(searchVO);
    }

    /**
	 * comtnbanner 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbanner 총 갯수
	 * @exception
	 */
    public int selectComtnbannerListTotCnt(ComtnbannerDefaultVO searchVO) {
		return comtnbannerDAO.selectComtnbannerListTotCnt(searchVO);
	}
    
}
