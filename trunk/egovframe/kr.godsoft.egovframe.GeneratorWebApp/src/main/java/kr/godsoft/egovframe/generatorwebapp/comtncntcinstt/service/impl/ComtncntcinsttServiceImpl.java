package kr.godsoft.egovframe.generatorwebapp.comtncntcinstt.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtncntcinstt.service.ComtncntcinsttService;
import kr.godsoft.egovframe.generatorwebapp.comtncntcinstt.service.ComtncntcinsttVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtncntcinsttServiceImpl.java
 * @Description : Comtncntcinstt Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtncntcinsttService")
public class ComtncntcinsttServiceImpl extends AbstractServiceImpl implements
        ComtncntcinsttService {

    @Resource(name="comtncntcinsttDAO")
    private ComtncntcinsttDAO comtncntcinsttDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtncntcinsttIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtncntcinstt을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtncntcinsttVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtncntcinstt(ComtncntcinsttVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtncntcinsttDAO.insertComtncntcinstt(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtncntcinstt을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtncntcinsttVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtncntcinstt(ComtncntcinsttVO vo) throws Exception {
        comtncntcinsttDAO.updateComtncntcinstt(vo);
    }

    /**
	 * comtncntcinstt을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtncntcinsttVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtncntcinstt(ComtncntcinsttVO vo) throws Exception {
        comtncntcinsttDAO.deleteComtncntcinstt(vo);
    }

    /**
	 * comtncntcinstt을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtncntcinsttVO
	 * @return 조회한 comtncntcinstt
	 * @exception Exception
	 */
    public ComtncntcinsttVO selectComtncntcinstt(ComtncntcinsttVO vo) throws Exception {
        ComtncntcinsttVO resultVO = comtncntcinsttDAO.selectComtncntcinstt(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtncntcinstt 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtncntcinstt 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtncntcinsttList(ComtncntcinsttVO vo) throws Exception {
        return comtncntcinsttDAO.selectComtncntcinsttList(vo);
    }

    /**
	 * comtncntcinstt 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtncntcinstt 총 갯수
	 * @exception
	 */
    public int selectComtncntcinsttListTotCnt(ComtncntcinsttVO vo) {
		return comtncntcinsttDAO.selectComtncntcinsttListTotCnt(vo);
	}
    
}
