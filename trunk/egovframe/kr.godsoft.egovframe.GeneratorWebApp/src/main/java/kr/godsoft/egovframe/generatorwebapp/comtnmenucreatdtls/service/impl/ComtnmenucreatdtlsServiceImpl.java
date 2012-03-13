package kr.godsoft.egovframe.generatorwebapp.comtnmenucreatdtls.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnmenucreatdtls.service.ComtnmenucreatdtlsService;
import kr.godsoft.egovframe.generatorwebapp.comtnmenucreatdtls.service.ComtnmenucreatdtlsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnmenucreatdtls.service.ComtnmenucreatdtlsVO;
import kr.godsoft.egovframe.generatorwebapp.comtnmenucreatdtls.service.impl.ComtnmenucreatdtlsDAO;

/**
 * @Class Name : ComtnmenucreatdtlsServiceImpl.java
 * @Description : Comtnmenucreatdtls Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnmenucreatdtlsService")
public class ComtnmenucreatdtlsServiceImpl extends AbstractServiceImpl implements
        ComtnmenucreatdtlsService {

    @Resource(name="comtnmenucreatdtlsDAO")
    private ComtnmenucreatdtlsDAO comtnmenucreatdtlsDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnmenucreatdtlsIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnmenucreatdtls을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnmenucreatdtlsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnmenucreatdtls(ComtnmenucreatdtlsVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnmenucreatdtlsDAO.insertComtnmenucreatdtls(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnmenucreatdtls을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnmenucreatdtlsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnmenucreatdtls(ComtnmenucreatdtlsVO vo) throws Exception {
        comtnmenucreatdtlsDAO.updateComtnmenucreatdtls(vo);
    }

    /**
	 * comtnmenucreatdtls을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnmenucreatdtlsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnmenucreatdtls(ComtnmenucreatdtlsVO vo) throws Exception {
        comtnmenucreatdtlsDAO.deleteComtnmenucreatdtls(vo);
    }

    /**
	 * comtnmenucreatdtls을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnmenucreatdtlsVO
	 * @return 조회한 comtnmenucreatdtls
	 * @exception Exception
	 */
    public ComtnmenucreatdtlsVO selectComtnmenucreatdtls(ComtnmenucreatdtlsVO vo) throws Exception {
        ComtnmenucreatdtlsVO resultVO = comtnmenucreatdtlsDAO.selectComtnmenucreatdtls(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnmenucreatdtls 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnmenucreatdtls 목록
	 * @exception Exception
	 */
    public List selectComtnmenucreatdtlsList(ComtnmenucreatdtlsDefaultVO searchVO) throws Exception {
        return comtnmenucreatdtlsDAO.selectComtnmenucreatdtlsList(searchVO);
    }

    /**
	 * comtnmenucreatdtls 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnmenucreatdtls 총 갯수
	 * @exception
	 */
    public int selectComtnmenucreatdtlsListTotCnt(ComtnmenucreatdtlsDefaultVO searchVO) {
		return comtnmenucreatdtlsDAO.selectComtnmenucreatdtlsListTotCnt(searchVO);
	}
    
}
