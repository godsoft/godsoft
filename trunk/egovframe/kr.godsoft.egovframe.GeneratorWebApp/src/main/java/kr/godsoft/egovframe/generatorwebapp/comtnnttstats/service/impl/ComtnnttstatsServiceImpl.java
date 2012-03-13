package kr.godsoft.egovframe.generatorwebapp.comtnnttstats.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnnttstats.service.ComtnnttstatsService;
import kr.godsoft.egovframe.generatorwebapp.comtnnttstats.service.ComtnnttstatsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnnttstats.service.ComtnnttstatsVO;
import kr.godsoft.egovframe.generatorwebapp.comtnnttstats.service.impl.ComtnnttstatsDAO;

/**
 * @Class Name : ComtnnttstatsServiceImpl.java
 * @Description : Comtnnttstats Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnnttstatsService")
public class ComtnnttstatsServiceImpl extends AbstractServiceImpl implements
        ComtnnttstatsService {

    @Resource(name="comtnnttstatsDAO")
    private ComtnnttstatsDAO comtnnttstatsDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnnttstatsIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnnttstats을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnnttstatsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnnttstats(ComtnnttstatsVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnnttstatsDAO.insertComtnnttstats(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnnttstats을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnnttstatsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnnttstats(ComtnnttstatsVO vo) throws Exception {
        comtnnttstatsDAO.updateComtnnttstats(vo);
    }

    /**
	 * comtnnttstats을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnnttstatsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnnttstats(ComtnnttstatsVO vo) throws Exception {
        comtnnttstatsDAO.deleteComtnnttstats(vo);
    }

    /**
	 * comtnnttstats을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnnttstatsVO
	 * @return 조회한 comtnnttstats
	 * @exception Exception
	 */
    public ComtnnttstatsVO selectComtnnttstats(ComtnnttstatsVO vo) throws Exception {
        ComtnnttstatsVO resultVO = comtnnttstatsDAO.selectComtnnttstats(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnnttstats 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnnttstats 목록
	 * @exception Exception
	 */
    public List selectComtnnttstatsList(ComtnnttstatsDefaultVO searchVO) throws Exception {
        return comtnnttstatsDAO.selectComtnnttstatsList(searchVO);
    }

    /**
	 * comtnnttstats 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnnttstats 총 갯수
	 * @exception
	 */
    public int selectComtnnttstatsListTotCnt(ComtnnttstatsDefaultVO searchVO) {
		return comtnnttstatsDAO.selectComtnnttstatsListTotCnt(searchVO);
	}
    
}
