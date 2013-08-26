package kr.godsoft.egovframe.generatorwebapp.comtninfrmlsanctn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtninfrmlsanctn.service.ComtninfrmlsanctnService;
import kr.godsoft.egovframe.generatorwebapp.comtninfrmlsanctn.service.ComtninfrmlsanctnVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtninfrmlsanctnServiceImpl.java
 * @Description : Comtninfrmlsanctn Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtninfrmlsanctnService")
public class ComtninfrmlsanctnServiceImpl extends AbstractServiceImpl implements
        ComtninfrmlsanctnService {

    @Resource(name="comtninfrmlsanctnDAO")
    private ComtninfrmlsanctnDAO comtninfrmlsanctnDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtninfrmlsanctnIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNINFRMLSANCTN을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtninfrmlsanctnVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtninfrmlsanctn(ComtninfrmlsanctnVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtninfrmlsanctnDAO.insertComtninfrmlsanctn(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNINFRMLSANCTN을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtninfrmlsanctnVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtninfrmlsanctn(ComtninfrmlsanctnVO vo) throws Exception {
        comtninfrmlsanctnDAO.updateComtninfrmlsanctn(vo);
    }

    /**
	 * COMTNINFRMLSANCTN을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtninfrmlsanctnVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtninfrmlsanctn(ComtninfrmlsanctnVO vo) throws Exception {
        comtninfrmlsanctnDAO.deleteComtninfrmlsanctn(vo);
    }

    /**
	 * COMTNINFRMLSANCTN을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtninfrmlsanctnVO
	 * @return 조회한 COMTNINFRMLSANCTN
	 * @exception Exception
	 */
    public ComtninfrmlsanctnVO selectComtninfrmlsanctn(ComtninfrmlsanctnVO vo) throws Exception {
        ComtninfrmlsanctnVO resultVO = comtninfrmlsanctnDAO.selectComtninfrmlsanctn(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNINFRMLSANCTN 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNINFRMLSANCTN 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtninfrmlsanctnList(ComtninfrmlsanctnVO vo) throws Exception {
        return comtninfrmlsanctnDAO.selectComtninfrmlsanctnList(vo);
    }

    /**
	 * COMTNINFRMLSANCTN 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNINFRMLSANCTN 총 갯수
	 * @exception
	 */
    public int selectComtninfrmlsanctnListTotCnt(ComtninfrmlsanctnVO vo) {
		return comtninfrmlsanctnDAO.selectComtninfrmlsanctnListTotCnt(vo);
	}
    
}
