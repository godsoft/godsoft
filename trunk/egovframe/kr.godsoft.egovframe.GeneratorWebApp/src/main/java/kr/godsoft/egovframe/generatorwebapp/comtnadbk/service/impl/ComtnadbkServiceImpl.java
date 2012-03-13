package kr.godsoft.egovframe.generatorwebapp.comtnadbk.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnadbk.service.ComtnadbkService;
import kr.godsoft.egovframe.generatorwebapp.comtnadbk.service.ComtnadbkDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnadbk.service.ComtnadbkVO;
import kr.godsoft.egovframe.generatorwebapp.comtnadbk.service.impl.ComtnadbkDAO;

/**
 * @Class Name : ComtnadbkServiceImpl.java
 * @Description : Comtnadbk Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnadbkService")
public class ComtnadbkServiceImpl extends AbstractServiceImpl implements
        ComtnadbkService {

    @Resource(name="comtnadbkDAO")
    private ComtnadbkDAO comtnadbkDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnadbkIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnadbk을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnadbkVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnadbk(ComtnadbkVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnadbkDAO.insertComtnadbk(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnadbk을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnadbkVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnadbk(ComtnadbkVO vo) throws Exception {
        comtnadbkDAO.updateComtnadbk(vo);
    }

    /**
	 * comtnadbk을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnadbkVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnadbk(ComtnadbkVO vo) throws Exception {
        comtnadbkDAO.deleteComtnadbk(vo);
    }

    /**
	 * comtnadbk을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnadbkVO
	 * @return 조회한 comtnadbk
	 * @exception Exception
	 */
    public ComtnadbkVO selectComtnadbk(ComtnadbkVO vo) throws Exception {
        ComtnadbkVO resultVO = comtnadbkDAO.selectComtnadbk(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnadbk 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnadbk 목록
	 * @exception Exception
	 */
    public List selectComtnadbkList(ComtnadbkDefaultVO searchVO) throws Exception {
        return comtnadbkDAO.selectComtnadbkList(searchVO);
    }

    /**
	 * comtnadbk 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnadbk 총 갯수
	 * @exception
	 */
    public int selectComtnadbkListTotCnt(ComtnadbkDefaultVO searchVO) {
		return comtnadbkDAO.selectComtnadbkListTotCnt(searchVO);
	}
    
}
