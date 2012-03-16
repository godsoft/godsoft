package kr.godsoft.egovframe.generatorwebapp.comtncntcsystem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtncntcsystem.service.ComtncntcsystemService;
import kr.godsoft.egovframe.generatorwebapp.comtncntcsystem.service.ComtncntcsystemVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtncntcsystemServiceImpl.java
 * @Description : Comtncntcsystem Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtncntcsystemService")
public class ComtncntcsystemServiceImpl extends AbstractServiceImpl implements
        ComtncntcsystemService {

    @Resource(name="comtncntcsystemDAO")
    private ComtncntcsystemDAO comtncntcsystemDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtncntcsystemIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtncntcsystem을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtncntcsystemVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtncntcsystem(ComtncntcsystemVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtncntcsystemDAO.insertComtncntcsystem(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtncntcsystem을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtncntcsystemVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtncntcsystem(ComtncntcsystemVO vo) throws Exception {
        comtncntcsystemDAO.updateComtncntcsystem(vo);
    }

    /**
	 * comtncntcsystem을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtncntcsystemVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtncntcsystem(ComtncntcsystemVO vo) throws Exception {
        comtncntcsystemDAO.deleteComtncntcsystem(vo);
    }

    /**
	 * comtncntcsystem을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtncntcsystemVO
	 * @return 조회한 comtncntcsystem
	 * @exception Exception
	 */
    public ComtncntcsystemVO selectComtncntcsystem(ComtncntcsystemVO vo) throws Exception {
        ComtncntcsystemVO resultVO = comtncntcsystemDAO.selectComtncntcsystem(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtncntcsystem 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtncntcsystem 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtncntcsystemList(ComtncntcsystemVO vo) throws Exception {
        return comtncntcsystemDAO.selectComtncntcsystemList(vo);
    }

    /**
	 * comtncntcsystem 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtncntcsystem 총 갯수
	 * @exception
	 */
    public int selectComtncntcsystemListTotCnt(ComtncntcsystemVO vo) {
		return comtncntcsystemDAO.selectComtncntcsystemListTotCnt(vo);
	}
    
}
