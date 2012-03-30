package kr.godsoft.egovframe.generatorwebapp.comtnbbsmasteroptn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnbbsmasteroptn.service.ComtnbbsmasteroptnService;
import kr.godsoft.egovframe.generatorwebapp.comtnbbsmasteroptn.service.ComtnbbsmasteroptnVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnbbsmasteroptnServiceImpl.java
 * @Description : Comtnbbsmasteroptn Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnbbsmasteroptnService")
public class ComtnbbsmasteroptnServiceImpl extends AbstractServiceImpl implements
        ComtnbbsmasteroptnService {

    @Resource(name="comtnbbsmasteroptnDAO")
    private ComtnbbsmasteroptnDAO comtnbbsmasteroptnDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnbbsmasteroptnIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNBBSMASTEROPTN을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbbsmasteroptnVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnbbsmasteroptn(ComtnbbsmasteroptnVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnbbsmasteroptnDAO.insertComtnbbsmasteroptn(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNBBSMASTEROPTN을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbbsmasteroptnVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnbbsmasteroptn(ComtnbbsmasteroptnVO vo) throws Exception {
        comtnbbsmasteroptnDAO.updateComtnbbsmasteroptn(vo);
    }

    /**
	 * COMTNBBSMASTEROPTN을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbbsmasteroptnVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnbbsmasteroptn(ComtnbbsmasteroptnVO vo) throws Exception {
        comtnbbsmasteroptnDAO.deleteComtnbbsmasteroptn(vo);
    }

    /**
	 * COMTNBBSMASTEROPTN을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbbsmasteroptnVO
	 * @return 조회한 COMTNBBSMASTEROPTN
	 * @exception Exception
	 */
    public ComtnbbsmasteroptnVO selectComtnbbsmasteroptn(ComtnbbsmasteroptnVO vo) throws Exception {
        ComtnbbsmasteroptnVO resultVO = comtnbbsmasteroptnDAO.selectComtnbbsmasteroptn(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNBBSMASTEROPTN 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNBBSMASTEROPTN 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnbbsmasteroptnList(ComtnbbsmasteroptnVO vo) throws Exception {
        return comtnbbsmasteroptnDAO.selectComtnbbsmasteroptnList(vo);
    }

    /**
	 * COMTNBBSMASTEROPTN 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNBBSMASTEROPTN 총 갯수
	 * @exception
	 */
    public int selectComtnbbsmasteroptnListTotCnt(ComtnbbsmasteroptnVO vo) {
		return comtnbbsmasteroptnDAO.selectComtnbbsmasteroptnListTotCnt(vo);
	}
    
}
