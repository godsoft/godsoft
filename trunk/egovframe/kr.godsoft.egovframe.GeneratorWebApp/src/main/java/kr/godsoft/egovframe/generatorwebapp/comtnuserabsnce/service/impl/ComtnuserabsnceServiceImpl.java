package kr.godsoft.egovframe.generatorwebapp.comtnuserabsnce.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnuserabsnce.service.ComtnuserabsnceService;
import kr.godsoft.egovframe.generatorwebapp.comtnuserabsnce.service.ComtnuserabsnceDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnuserabsnce.service.ComtnuserabsnceVO;
import kr.godsoft.egovframe.generatorwebapp.comtnuserabsnce.service.impl.ComtnuserabsnceDAO;

/**
 * @Class Name : ComtnuserabsnceServiceImpl.java
 * @Description : Comtnuserabsnce Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnuserabsnceService")
public class ComtnuserabsnceServiceImpl extends AbstractServiceImpl implements
        ComtnuserabsnceService {

    @Resource(name="comtnuserabsnceDAO")
    private ComtnuserabsnceDAO comtnuserabsnceDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnuserabsnceIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnuserabsnce을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnuserabsnceVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnuserabsnce(ComtnuserabsnceVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnuserabsnceDAO.insertComtnuserabsnce(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnuserabsnce을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnuserabsnceVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnuserabsnce(ComtnuserabsnceVO vo) throws Exception {
        comtnuserabsnceDAO.updateComtnuserabsnce(vo);
    }

    /**
	 * comtnuserabsnce을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnuserabsnceVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnuserabsnce(ComtnuserabsnceVO vo) throws Exception {
        comtnuserabsnceDAO.deleteComtnuserabsnce(vo);
    }

    /**
	 * comtnuserabsnce을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnuserabsnceVO
	 * @return 조회한 comtnuserabsnce
	 * @exception Exception
	 */
    public ComtnuserabsnceVO selectComtnuserabsnce(ComtnuserabsnceVO vo) throws Exception {
        ComtnuserabsnceVO resultVO = comtnuserabsnceDAO.selectComtnuserabsnce(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnuserabsnce 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnuserabsnce 목록
	 * @exception Exception
	 */
    public List selectComtnuserabsnceList(ComtnuserabsnceDefaultVO searchVO) throws Exception {
        return comtnuserabsnceDAO.selectComtnuserabsnceList(searchVO);
    }

    /**
	 * comtnuserabsnce 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnuserabsnce 총 갯수
	 * @exception
	 */
    public int selectComtnuserabsnceListTotCnt(ComtnuserabsnceDefaultVO searchVO) {
		return comtnuserabsnceDAO.selectComtnuserabsnceListTotCnt(searchVO);
	}
    
}
