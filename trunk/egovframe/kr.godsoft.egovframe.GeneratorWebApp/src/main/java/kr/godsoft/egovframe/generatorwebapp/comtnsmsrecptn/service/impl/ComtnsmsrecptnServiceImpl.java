package kr.godsoft.egovframe.generatorwebapp.comtnsmsrecptn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnsmsrecptn.service.ComtnsmsrecptnService;
import kr.godsoft.egovframe.generatorwebapp.comtnsmsrecptn.service.ComtnsmsrecptnVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnsmsrecptnServiceImpl.java
 * @Description : Comtnsmsrecptn Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnsmsrecptnService")
public class ComtnsmsrecptnServiceImpl extends AbstractServiceImpl implements
        ComtnsmsrecptnService {

    @Resource(name="comtnsmsrecptnDAO")
    private ComtnsmsrecptnDAO comtnsmsrecptnDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnsmsrecptnIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNSMSRECPTN을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnsmsrecptnVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnsmsrecptn(ComtnsmsrecptnVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnsmsrecptnDAO.insertComtnsmsrecptn(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNSMSRECPTN을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnsmsrecptnVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnsmsrecptn(ComtnsmsrecptnVO vo) throws Exception {
        comtnsmsrecptnDAO.updateComtnsmsrecptn(vo);
    }

    /**
	 * COMTNSMSRECPTN을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnsmsrecptnVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnsmsrecptn(ComtnsmsrecptnVO vo) throws Exception {
        comtnsmsrecptnDAO.deleteComtnsmsrecptn(vo);
    }

    /**
	 * COMTNSMSRECPTN을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnsmsrecptnVO
	 * @return 조회한 COMTNSMSRECPTN
	 * @exception Exception
	 */
    public ComtnsmsrecptnVO selectComtnsmsrecptn(ComtnsmsrecptnVO vo) throws Exception {
        ComtnsmsrecptnVO resultVO = comtnsmsrecptnDAO.selectComtnsmsrecptn(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNSMSRECPTN 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNSMSRECPTN 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnsmsrecptnList(ComtnsmsrecptnVO vo) throws Exception {
        return comtnsmsrecptnDAO.selectComtnsmsrecptnList(vo);
    }

    /**
	 * COMTNSMSRECPTN 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNSMSRECPTN 총 갯수
	 * @exception
	 */
    public int selectComtnsmsrecptnListTotCnt(ComtnsmsrecptnVO vo) {
		return comtnsmsrecptnDAO.selectComtnsmsrecptnListTotCnt(vo);
	}
    
}
