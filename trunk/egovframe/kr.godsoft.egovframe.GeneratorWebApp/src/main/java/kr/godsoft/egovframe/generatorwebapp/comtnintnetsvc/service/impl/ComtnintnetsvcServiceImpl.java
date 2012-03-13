package kr.godsoft.egovframe.generatorwebapp.comtnintnetsvc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnintnetsvc.service.ComtnintnetsvcService;
import kr.godsoft.egovframe.generatorwebapp.comtnintnetsvc.service.ComtnintnetsvcDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnintnetsvc.service.ComtnintnetsvcVO;
import kr.godsoft.egovframe.generatorwebapp.comtnintnetsvc.service.impl.ComtnintnetsvcDAO;

/**
 * @Class Name : ComtnintnetsvcServiceImpl.java
 * @Description : Comtnintnetsvc Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnintnetsvcService")
public class ComtnintnetsvcServiceImpl extends AbstractServiceImpl implements
        ComtnintnetsvcService {

    @Resource(name="comtnintnetsvcDAO")
    private ComtnintnetsvcDAO comtnintnetsvcDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnintnetsvcIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnintnetsvc을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnintnetsvcVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnintnetsvc(ComtnintnetsvcVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnintnetsvcDAO.insertComtnintnetsvc(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnintnetsvc을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnintnetsvcVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnintnetsvc(ComtnintnetsvcVO vo) throws Exception {
        comtnintnetsvcDAO.updateComtnintnetsvc(vo);
    }

    /**
	 * comtnintnetsvc을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnintnetsvcVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnintnetsvc(ComtnintnetsvcVO vo) throws Exception {
        comtnintnetsvcDAO.deleteComtnintnetsvc(vo);
    }

    /**
	 * comtnintnetsvc을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnintnetsvcVO
	 * @return 조회한 comtnintnetsvc
	 * @exception Exception
	 */
    public ComtnintnetsvcVO selectComtnintnetsvc(ComtnintnetsvcVO vo) throws Exception {
        ComtnintnetsvcVO resultVO = comtnintnetsvcDAO.selectComtnintnetsvc(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnintnetsvc 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnintnetsvc 목록
	 * @exception Exception
	 */
    public List selectComtnintnetsvcList(ComtnintnetsvcDefaultVO searchVO) throws Exception {
        return comtnintnetsvcDAO.selectComtnintnetsvcList(searchVO);
    }

    /**
	 * comtnintnetsvc 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnintnetsvc 총 갯수
	 * @exception
	 */
    public int selectComtnintnetsvcListTotCnt(ComtnintnetsvcDefaultVO searchVO) {
		return comtnintnetsvcDAO.selectComtnintnetsvcListTotCnt(searchVO);
	}
    
}
