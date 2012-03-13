package kr.godsoft.egovframe.generatorwebapp.comtnindvdlpgecntnts.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnindvdlpgecntnts.service.ComtnindvdlpgecntntsService;
import kr.godsoft.egovframe.generatorwebapp.comtnindvdlpgecntnts.service.ComtnindvdlpgecntntsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnindvdlpgecntnts.service.ComtnindvdlpgecntntsVO;
import kr.godsoft.egovframe.generatorwebapp.comtnindvdlpgecntnts.service.impl.ComtnindvdlpgecntntsDAO;

/**
 * @Class Name : ComtnindvdlpgecntntsServiceImpl.java
 * @Description : Comtnindvdlpgecntnts Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnindvdlpgecntntsService")
public class ComtnindvdlpgecntntsServiceImpl extends AbstractServiceImpl implements
        ComtnindvdlpgecntntsService {

    @Resource(name="comtnindvdlpgecntntsDAO")
    private ComtnindvdlpgecntntsDAO comtnindvdlpgecntntsDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnindvdlpgecntntsIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnindvdlpgecntnts을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnindvdlpgecntntsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnindvdlpgecntnts(ComtnindvdlpgecntntsVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnindvdlpgecntntsDAO.insertComtnindvdlpgecntnts(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnindvdlpgecntnts을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnindvdlpgecntntsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnindvdlpgecntnts(ComtnindvdlpgecntntsVO vo) throws Exception {
        comtnindvdlpgecntntsDAO.updateComtnindvdlpgecntnts(vo);
    }

    /**
	 * comtnindvdlpgecntnts을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnindvdlpgecntntsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnindvdlpgecntnts(ComtnindvdlpgecntntsVO vo) throws Exception {
        comtnindvdlpgecntntsDAO.deleteComtnindvdlpgecntnts(vo);
    }

    /**
	 * comtnindvdlpgecntnts을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnindvdlpgecntntsVO
	 * @return 조회한 comtnindvdlpgecntnts
	 * @exception Exception
	 */
    public ComtnindvdlpgecntntsVO selectComtnindvdlpgecntnts(ComtnindvdlpgecntntsVO vo) throws Exception {
        ComtnindvdlpgecntntsVO resultVO = comtnindvdlpgecntntsDAO.selectComtnindvdlpgecntnts(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnindvdlpgecntnts 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnindvdlpgecntnts 목록
	 * @exception Exception
	 */
    public List selectComtnindvdlpgecntntsList(ComtnindvdlpgecntntsDefaultVO searchVO) throws Exception {
        return comtnindvdlpgecntntsDAO.selectComtnindvdlpgecntntsList(searchVO);
    }

    /**
	 * comtnindvdlpgecntnts 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnindvdlpgecntnts 총 갯수
	 * @exception
	 */
    public int selectComtnindvdlpgecntntsListTotCnt(ComtnindvdlpgecntntsDefaultVO searchVO) {
		return comtnindvdlpgecntntsDAO.selectComtnindvdlpgecntntsListTotCnt(searchVO);
	}
    
}
