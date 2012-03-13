package kr.godsoft.egovframe.generatorwebapp.comtnnoterecptn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnnoterecptn.service.ComtnnoterecptnService;
import kr.godsoft.egovframe.generatorwebapp.comtnnoterecptn.service.ComtnnoterecptnDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnnoterecptn.service.ComtnnoterecptnVO;
import kr.godsoft.egovframe.generatorwebapp.comtnnoterecptn.service.impl.ComtnnoterecptnDAO;

/**
 * @Class Name : ComtnnoterecptnServiceImpl.java
 * @Description : Comtnnoterecptn Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnnoterecptnService")
public class ComtnnoterecptnServiceImpl extends AbstractServiceImpl implements
        ComtnnoterecptnService {

    @Resource(name="comtnnoterecptnDAO")
    private ComtnnoterecptnDAO comtnnoterecptnDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnnoterecptnIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnnoterecptn을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnnoterecptnVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnnoterecptn(ComtnnoterecptnVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnnoterecptnDAO.insertComtnnoterecptn(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnnoterecptn을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnnoterecptnVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnnoterecptn(ComtnnoterecptnVO vo) throws Exception {
        comtnnoterecptnDAO.updateComtnnoterecptn(vo);
    }

    /**
	 * comtnnoterecptn을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnnoterecptnVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnnoterecptn(ComtnnoterecptnVO vo) throws Exception {
        comtnnoterecptnDAO.deleteComtnnoterecptn(vo);
    }

    /**
	 * comtnnoterecptn을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnnoterecptnVO
	 * @return 조회한 comtnnoterecptn
	 * @exception Exception
	 */
    public ComtnnoterecptnVO selectComtnnoterecptn(ComtnnoterecptnVO vo) throws Exception {
        ComtnnoterecptnVO resultVO = comtnnoterecptnDAO.selectComtnnoterecptn(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnnoterecptn 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnnoterecptn 목록
	 * @exception Exception
	 */
    public List selectComtnnoterecptnList(ComtnnoterecptnDefaultVO searchVO) throws Exception {
        return comtnnoterecptnDAO.selectComtnnoterecptnList(searchVO);
    }

    /**
	 * comtnnoterecptn 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnnoterecptn 총 갯수
	 * @exception
	 */
    public int selectComtnnoterecptnListTotCnt(ComtnnoterecptnDefaultVO searchVO) {
		return comtnnoterecptnDAO.selectComtnnoterecptnListTotCnt(searchVO);
	}
    
}