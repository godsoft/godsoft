package kr.godsoft.egovframe.generatorwebapp.comtnauthorrolerelate.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnauthorrolerelate.service.ComtnauthorrolerelateService;
import kr.godsoft.egovframe.generatorwebapp.comtnauthorrolerelate.service.ComtnauthorrolerelateDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnauthorrolerelate.service.ComtnauthorrolerelateVO;
import kr.godsoft.egovframe.generatorwebapp.comtnauthorrolerelate.service.impl.ComtnauthorrolerelateDAO;

/**
 * @Class Name : ComtnauthorrolerelateServiceImpl.java
 * @Description : Comtnauthorrolerelate Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnauthorrolerelateService")
public class ComtnauthorrolerelateServiceImpl extends AbstractServiceImpl implements
        ComtnauthorrolerelateService {

    @Resource(name="comtnauthorrolerelateDAO")
    private ComtnauthorrolerelateDAO comtnauthorrolerelateDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnauthorrolerelateIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnauthorrolerelate을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnauthorrolerelateVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnauthorrolerelate(ComtnauthorrolerelateVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnauthorrolerelateDAO.insertComtnauthorrolerelate(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnauthorrolerelate을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnauthorrolerelateVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnauthorrolerelate(ComtnauthorrolerelateVO vo) throws Exception {
        comtnauthorrolerelateDAO.updateComtnauthorrolerelate(vo);
    }

    /**
	 * comtnauthorrolerelate을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnauthorrolerelateVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnauthorrolerelate(ComtnauthorrolerelateVO vo) throws Exception {
        comtnauthorrolerelateDAO.deleteComtnauthorrolerelate(vo);
    }

    /**
	 * comtnauthorrolerelate을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnauthorrolerelateVO
	 * @return 조회한 comtnauthorrolerelate
	 * @exception Exception
	 */
    public ComtnauthorrolerelateVO selectComtnauthorrolerelate(ComtnauthorrolerelateVO vo) throws Exception {
        ComtnauthorrolerelateVO resultVO = comtnauthorrolerelateDAO.selectComtnauthorrolerelate(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnauthorrolerelate 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnauthorrolerelate 목록
	 * @exception Exception
	 */
    public List selectComtnauthorrolerelateList(ComtnauthorrolerelateDefaultVO searchVO) throws Exception {
        return comtnauthorrolerelateDAO.selectComtnauthorrolerelateList(searchVO);
    }

    /**
	 * comtnauthorrolerelate 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnauthorrolerelate 총 갯수
	 * @exception
	 */
    public int selectComtnauthorrolerelateListTotCnt(ComtnauthorrolerelateDefaultVO searchVO) {
		return comtnauthorrolerelateDAO.selectComtnauthorrolerelateListTotCnt(searchVO);
	}
    
}
