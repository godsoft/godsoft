package kr.godsoft.egovframe.generatorwebapp.comtnanswer.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnanswer.service.ComtnanswerService;
import kr.godsoft.egovframe.generatorwebapp.comtnanswer.service.ComtnanswerDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnanswer.service.ComtnanswerVO;
import kr.godsoft.egovframe.generatorwebapp.comtnanswer.service.impl.ComtnanswerDAO;

/**
 * @Class Name : ComtnanswerServiceImpl.java
 * @Description : Comtnanswer Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnanswerService")
public class ComtnanswerServiceImpl extends AbstractServiceImpl implements
        ComtnanswerService {

    @Resource(name="comtnanswerDAO")
    private ComtnanswerDAO comtnanswerDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnanswerIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnanswer을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnanswerVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnanswer(ComtnanswerVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnanswerDAO.insertComtnanswer(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnanswer을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnanswerVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnanswer(ComtnanswerVO vo) throws Exception {
        comtnanswerDAO.updateComtnanswer(vo);
    }

    /**
	 * comtnanswer을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnanswerVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnanswer(ComtnanswerVO vo) throws Exception {
        comtnanswerDAO.deleteComtnanswer(vo);
    }

    /**
	 * comtnanswer을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnanswerVO
	 * @return 조회한 comtnanswer
	 * @exception Exception
	 */
    public ComtnanswerVO selectComtnanswer(ComtnanswerVO vo) throws Exception {
        ComtnanswerVO resultVO = comtnanswerDAO.selectComtnanswer(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnanswer 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnanswer 목록
	 * @exception Exception
	 */
    public List selectComtnanswerList(ComtnanswerDefaultVO searchVO) throws Exception {
        return comtnanswerDAO.selectComtnanswerList(searchVO);
    }

    /**
	 * comtnanswer 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnanswer 총 갯수
	 * @exception
	 */
    public int selectComtnanswerListTotCnt(ComtnanswerDefaultVO searchVO) {
		return comtnanswerDAO.selectComtnanswerListTotCnt(searchVO);
	}
    
}
