package kr.godsoft.egovframe.generatorwebapp.comtnanswer.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnanswer.service.ComtnanswerService;
import kr.godsoft.egovframe.generatorwebapp.comtnanswer.service.ComtnanswerVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnanswerServiceImpl.java
 * @Description : Comtnanswer Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
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
	 * COMTNANSWER을 등록한다.
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
	 * COMTNANSWER을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnanswerVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnanswer(ComtnanswerVO vo) throws Exception {
        comtnanswerDAO.updateComtnanswer(vo);
    }

    /**
	 * COMTNANSWER을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnanswerVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnanswer(ComtnanswerVO vo) throws Exception {
        comtnanswerDAO.deleteComtnanswer(vo);
    }

    /**
	 * COMTNANSWER을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnanswerVO
	 * @return 조회한 COMTNANSWER
	 * @exception Exception
	 */
    public ComtnanswerVO selectComtnanswer(ComtnanswerVO vo) throws Exception {
        ComtnanswerVO resultVO = comtnanswerDAO.selectComtnanswer(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNANSWER 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNANSWER 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnanswerList(ComtnanswerVO vo) throws Exception {
        return comtnanswerDAO.selectComtnanswerList(vo);
    }

    /**
	 * COMTNANSWER 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNANSWER 총 갯수
	 * @exception
	 */
    public int selectComtnanswerListTotCnt(ComtnanswerVO vo) {
		return comtnanswerDAO.selectComtnanswerListTotCnt(vo);
	}
    
}
